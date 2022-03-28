import generated.Server;
import generated.serverGrpc;
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
                    serverGrpc.serverBlockingStub signUpStub = serverGrpc.newBlockingStub(channel);
                    Server.credential signUpCredential = Server.credential.newBuilder()
                            .setUsername(tokens[1]).setPassword(cHash(tokens[2])).build();
                    Server.response signUpResponse = signUpStub.signUp(signUpCredential);
                    logger.info(signUpResponse.getResCode() + "\n" + signUpResponse.getMessage());
                    break;
                case "login":
                    serverGrpc.serverBlockingStub logInStub = serverGrpc.newBlockingStub(channel);
                    Server.credential logInCredential = Server.credential.newBuilder()
                            .setUsername(tokens[1]).setPassword(cHash(tokens[2])).build();
                    Server.response loginResponse = logInStub.logIn(logInCredential);
                    logger.info(loginResponse.getResCode() + "\n" + loginResponse.getMessage());
                    break;
                case "logout":
                    serverGrpc.serverBlockingStub logOutStub = serverGrpc.newBlockingStub(channel);
                    Server.Empty logOutEmpty = Server.Empty.newBuilder().build();
                    Server.response logOutResponse = logOutStub.logOut(logOutEmpty);
                    logger.info(logOutResponse.getResCode() + "\n" + logOutResponse.getMessage());
                    break;
                case "update":
                    String value = "";
                    for(int i=2; i<tokens.length; i++) value+=tokens[i]+" ";
                    serverGrpc.serverBlockingStub udpStub = serverGrpc.newBlockingStub(channel);
                    Server.updQuery updQuery = Server.updQuery.newBuilder()
                            .setField(tokens[1]).setValue(value).build();
                    Server.response updResponse = udpStub.updateDB(updQuery);
                    logger.info(updResponse.getResCode() + "\n" + updResponse.getMessage());
                    break;
                case "report":
                    serverGrpc.serverBlockingStub fetchStub = serverGrpc.newBlockingStub(channel);
                    Server.Empty fetchEmpty = Server.Empty.newBuilder().build();
                    Server.responseAndData details = fetchStub.fetchDB(fetchEmpty);
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
            }

        }

    }
    static String cHash(String str){
        char[] s = str.toCharArray();
        String ret = "";
        for(int i=0; i<str.length(); i++){
            ret+=(char)(s[i]+(i%17));
        }
        return ret;
    }
}
