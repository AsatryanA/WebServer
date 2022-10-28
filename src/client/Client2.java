package client;

public class Client2 {
    public static String ipAddr = "localhost";
    public static int port = 8000;

    public static void main(String[] args) {
        new  ClientService(ipAddr,port);

    }
}
