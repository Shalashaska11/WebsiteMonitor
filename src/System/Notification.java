package System;

public class Notification {
    public static void sendmessage(User user, String message){
        System.out.println("System.User: " + user.getName() + " Email: " + user.getEmail() + " \t  Message: " + message);
    }
}