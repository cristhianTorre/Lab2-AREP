package edu.escuelaing.arem.url;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlPrint {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http:....");
        String protocol = url.getProtocol();
        String authority = url.getAuthority();
        String host = url.getHost();
        int port = url.getPort();
        String path = url.getPath();
        String query = url.getQuery();
        String file = url.getFile();
        String ref = url.getRef();
        System.out.println("Protocol: "+protocol+"\nAuthority: "+authority+"\nHost: "+host+"\nPort: "+port+"\nPath: "+path+"\nQuery: "+query+"\nFile: "+file+"\nRef: "+ref);
    }
}
