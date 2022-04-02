import generated.User;
import generated.userGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;
import java.util.logging.Logger;

public class grpcClient {

    private static final Logger logger = Logger.getLogger(grpcClient.class.getName());

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        Scanner scanner = new Scanner(System.in);
        boolean toInput = true;
        while(toInput){
            String command = scanner.nextLine();
            String[] tokens = command.split(" ");
            switch (tokens[0]){
                case "terminate":
                    toInput = false;
                    break;
                case "signup":
                    userGrpc.userBlockingStub signUpStub = userGrpc.newBlockingStub(channel);
                    User.credential signUpCredential = User.credential.newBuilder()
                            .setUsername(tokens[1]).setPassword(cHash(tokens[2])).build();
                    User.response signUpResponse = signUpStub.signUp(signUpCredential);
                    logger.info(signUpResponse.getResCode() + "\n" + signUpResponse.getMessage());
                    break;
                case "login":
                    userGrpc.userBlockingStub logInStub = userGrpc.newBlockingStub(channel);
                    User.credential logInCredential = User.credential.newBuilder()
                            .setUsername(tokens[1]).setPassword(cHash(tokens[2])).build();
                    User.response loginResponse = logInStub.logIn(logInCredential);
                    logger.info(loginResponse.getResCode() + "\n" + loginResponse.getMessage());
                    break;
                case "logout":
                    userGrpc.userBlockingStub logOutStub = userGrpc.newBlockingStub(channel);
                    User.Empty logOutEmpty = User.Empty.newBuilder().build();
                    User.response logOutResponse = logOutStub.logOut(logOutEmpty);
                    logger.info(logOutResponse.getResCode() + "\n" + logOutResponse.getMessage());
                    break;
                case "update":
                    String value = "";
                    for(int i=2; i<tokens.length; i++) value+=tokens[i]+" ";
                    userGrpc.userBlockingStub udpStub = userGrpc.newBlockingStub(channel);
                    User.updQuery updQuery = User.updQuery.newBuilder()
                            .setField(tokens[1]).setValue(value).build();
                    User.response updResponse = udpStub.updateDB(updQuery);
                    logger.info(updResponse.getResCode() + "\n" + updResponse.getMessage());
                    break;
                case "report":
                    userGrpc.userBlockingStub fetchStub = userGrpc.newBlockingStub(channel);
                    User.Empty fetchEmpty = User.Empty.newBuilder().build();
                    User.responseAndData details = fetchStub.fetchDB(fetchEmpty);
                    String log = details.getResCode() + "\n" + details.getMessage();
                    System.out.println(log);
                    if(details.getResCode() == 100){
                        log+="\nUsername: "+details.getUsername();
                        log+="\nFull Name: "+details.getName();
                        log+="\nFather's name: "+details.getFName();
                        log+="\nMother's Name: "+details.getMName();
                        log+="\nDepartment: "+details.getDept();
                        log+="\nRegistration No: "+details.getReg();
                    }
                    System.out.println(log);
                    logger.info(log);
                    break;
                case "who":
                    userGrpc.userBlockingStub sessionStub = userGrpc.newBlockingStub(channel);
                    User.Empty whoEmpty = User.Empty.newBuilder().build();
                    User.sessionUser sessionUser = sessionStub.getSessionUser(whoEmpty);
                    logger.info("Session User: "+sessionUser.getName());
                    break;
            }

        }

    }
    static String cHash(String str){
//        char[] s = str.toCharArray();
//        String ret = "";
//        for(int i=0; i<str.length(); i++){
//            ret+=(char)(s[i]+(i%17));
//        }
//        return ret;
        return str;
    }
}
