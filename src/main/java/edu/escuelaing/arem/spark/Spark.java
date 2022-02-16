package edu.escuelaing.arem.spark;

public class Spark {
    public static void get(String route, String body){
        SparkServer pserver = SparkServer.getInstance();
        pserver.get(route, body);
    }

    public static void port(int port){
        SparkServer pserver = SparkServer.getInstance();
        pserver.port(port);
    }

    public static void startServer(){
        SparkServer pserver = SparkServer.getInstance();
        pserver.startServer();
    }
}
