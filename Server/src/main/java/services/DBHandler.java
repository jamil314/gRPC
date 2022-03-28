package services;

import generated.Server;
import generated.serverGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.sql.*;
import java.util.logging.Logger;

public class DBHandler extends serverGrpc.serverImplBase{

    private final String DB = "jdbc:mysql://localhost/SimpleDB";
    private final String userName = "root";
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
        String logInPassword = sHash(request.getPassword());

        logger.info("Log In Request from user: "+logInUsername);

        if(loggedIn(responseObserver)) return;

        Server.response.Builder response = Server.response.newBuilder();

        String query = "SELECT * FROM `user` WHERE Username = \""+logInUsername+"\" and Pass = \""+logInPassword+"\";";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                response.setMessage("Success").setResCode(100);
                logger.info("Login successful for user : " + logInUsername);
                sessionUsername = logInUsername;

            } else{
                response.setMessage("Failed").setResCode(400);
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
        String signupPass = sHash(request.getPassword());

        logger.info("Sign Up Request from user: "+signupUsername);

        if(loggedIn(responseObserver)) return;

        Server.response.Builder response = Server.response.newBuilder();
        String query = "SELECT * FROM `user` WHERE Username = \""+signupUsername+"\";";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                response.setMessage("User exists").setResCode(407);
                logger.info("Sign Up failed for user : " + signupUsername );
            } else {
                query = "INSERT INTO User(Username, Pass, fName, mName, Dept, Reg, Name) VALUES(\""+signupUsername+"\", \""+signupPass+"\", \"\", \"\", \"\", \"\", \"\");";
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
        String query = "SELECT * FROM INFORMATION_SCHEMA.Columns WHERE TABLE_NAME = 'user' AND COLUMN_NAME = '"+field+"';";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                query = "UPDATE `user` SET `"+field +"` = '"+value+"' WHERE `user`.`Username` = '"+sessionUsername+"';";
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
            String query = "SELECT * FROM `user` WHERE Username = \""+sessionUsername+"\";";
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

    static String sHash(String str){
        char[] s = str.toCharArray();
        String ret = "";
        for(int i=0; i<str.length(); i+=2){
            ret+=(char)(s[i]+(i%31));
        }
        for(int i=1; i<str.length(); i+=2){
            ret+=(char)(s[i]+(i%39));
        }
        return ret;
    }


}
