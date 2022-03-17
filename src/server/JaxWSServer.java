package server;

import ws.BankService;

import javax.xml.ws.Endpoint;

public class JaxWSServer {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8585/";
        Endpoint.publish(url, new BankService());
        System.out.println("Web service running in "+ url);
    }
}
