//package main;
//
//import com.sun.net.httpserver.HttpExchange;
//import com.sun.net.httpserver.HttpServer;
//import controller.LoginController;
//import controller.StudentController;
//import model.DBConnection;
//
//import java.io.IOException;
//import java.net.InetSocketAddress;
//
//public class main {
//    public static DBConnection conn = new DBConnection();
//    public static HttpExchange he;
//    public static void main(String[] args) throws IOException {
//        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
//        server.createContext("/findAll", new StudentController());
//
//        server.createContext("/login",new LoginController());
//
//        System.out.println("Start Port: " + server.getAddress());
//        server.start();
//
//    }
//}
