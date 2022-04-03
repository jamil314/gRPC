package services;


import generated.Server;
import generated.serverGrpc;
import io.grpc.stub.StreamObserver;
import io.github.cdimascio.dotenv.Dotenv;

import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.util.logging.Logger;

public class DBHandler extends serverGrpc.serverImplBase{

    Dotenv dotenv = Dotenv.configure().directory("src/main/resources").load();
    private final String DB = dotenv.get("database");
    private final String userName = dotenv.get("DBusername");
    private final String password = "";
    private Connection connection;
    private Statement statement;
    {
        try {
            connection = DriverManager.getConnection(DB, userName, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private String sessionUsername = "";


    private static final Logger logger = Logger.getLogger(DBHandler.class.getName());

    @Override
    public void logIn(Server.credential request, StreamObserver<Server.response> responseObserver) {

        String logInUsername = request.getUsername();
        String logInPassword = request.getPassword();

        logger.info("Log In Request from user: "+logInUsername);

        if(loggedIn(responseObserver)) return;

        Server.response.Builder response = Server.response.newBuilder();

        String query = "SELECT * FROM `tbluser` WHERE Username = \""+logInUsername+"\";";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                if(resultSet.getString("pass").equals(PassHandler.getPw(logInPassword, resultSet.getString("salt")))){
                    response.setMessage("Success").setResCode(100);
                    logger.info("Login successful for user : " + logInUsername);
                    sessionUsername = logInUsername;
                } else{
                    response.setMessage("Failed: Incorrect password").setResCode(410);
                    logger.info("Login failed for user : " + logInUsername);
                }


            } else{
                response.setMessage("Failed: user does not exist").setResCode(411);
                logger.info("Login failed for user : " + logInUsername);

            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void signUp(Server.credential request, StreamObserver<Server.response> responseObserver) {
        String signupUsername = request.getUsername();
        String signupPass = request.getPassword();

        logger.info("Sign Up Request from user: "+signupUsername);

        if(loggedIn(responseObserver)) return;

        Server.response.Builder response = Server.response.newBuilder();
        String query = "SELECT * FROM `tbluser` WHERE Username = \""+signupUsername+"\";";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                response.setMessage("User exists").setResCode(407);
                logger.info("Sign Up failed for user : " + signupUsername );
            } else {
                String[] tokens = PassHandler.hash(signupPass).split("jamil");
                query = "INSERT INTO TblUser(Username, Pass, salt, fName, mName, Dept, Reg, Name) VALUES(\""+signupUsername+"\", \""+tokens[0]+"\", \""+tokens[1]+"\", \"\", \"\", \"\", \"\", \"\");";
                statement.executeUpdate(query);
                response.setMessage("Success").setResCode(100);
                logger.info("Sign Up successful for user : " + signupUsername );
                sessionUsername = signupUsername;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void logOut(Server.Empty request, StreamObserver<Server.response> responseObserver) {
        logger.info("logging out: "+sessionUsername);
        if(loggedOut(responseObserver)) return;
        sessionUsername = "";
        Server.response.Builder response = Server.response.newBuilder();
        response.setMessage("Success").setResCode(100);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void updateDB(Server.updQuery request, StreamObserver<Server.response> responseObserver) {
        if(loggedOut(responseObserver)) return;
        Server.response.Builder response = Server.response.newBuilder();

        String field = request.getField();
        String value = request.getValue();
        String query = "SELECT * FROM INFORMATION_SCHEMA.Columns WHERE TABLE_NAME = 'tbluser' AND COLUMN_NAME = '"+field+"';";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                query = "UPDATE `tbluser` SET `"+field +"` = '"+value+"' WHERE `tbluser`.`Username` = '"+sessionUsername+"';";
                statement.executeUpdate(query);
                response.setMessage("Success").setResCode(100);
            } else {
                response.setMessage("Wrong field name").setResCode(409);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void fetchDB(Server.Empty request, StreamObserver<Server.responseAndData> responseObserver) {
        logger.info("Reporting for: "+sessionUsername);
        Server.responseAndData.Builder response = Server.responseAndData.newBuilder();
        if(sessionUsername.equals("")){
            response.setMessage("You are not logged in. Log in first to access this request.").setResCode(405);
        }else{
            String query = "SELECT * FROM `tbluser` WHERE Username = \""+sessionUsername+"\";";
            try {
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()){
                    response.setMessage("Success").setResCode(100)
                            .setUsername(resultSet.getString("Username"))
                            .setName(resultSet.getString("Name"))
                            .setFName(resultSet.getString("fName"))
                            .setMName(resultSet.getString("mName"))
                            .setDept(resultSet.getString("Dept"))
                            .setReg(resultSet.getString("Reg"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    boolean loggedIn(StreamObserver<Server.response> responseObserver){
        if(sessionUsername.equals("")) return false;
        Server.response.Builder response = Server.response.newBuilder();
        response.setMessage("A user is already logged in. Log out first to access this request.").setResCode(403);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
        return true;
    }

    boolean loggedOut(StreamObserver<Server.response> responseObserver){
        if(!sessionUsername.equals("")) return false;
        Server.response.Builder response = Server.response.newBuilder();
        response.setMessage("You are not logged in. Log in first to access this request.").setResCode(405);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
        return true;
    }

}
