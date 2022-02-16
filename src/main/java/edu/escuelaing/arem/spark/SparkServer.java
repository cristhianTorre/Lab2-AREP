package edu.escuelaing.arem.spark;

import edu.escuelaing.arem.server.HttpServer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SparkServer {
    private static SparkServer _instance = new SparkServer();
    private int httpPort = 36000;

    private SparkServer(){

    }

    public static SparkServer getInstance() {
        return _instance;
    }

    Map<String, String> functions = new HashMap();
    HttpServer http = new HttpServer();

    public void get(String route, String body){
        functions.put(body, route);
    }

    public void startServer(){
        try {
            http.startServer(httpPort);
        } catch (IOException ex) {
            Logger.getLogger(SparkServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void port(int serverPort){
        this.httpPort = serverPort;
    }
}
