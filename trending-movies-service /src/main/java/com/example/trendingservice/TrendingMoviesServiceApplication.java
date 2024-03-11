package com.example.trendingservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class TrendingMoviesServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrendingMoviesServiceApplication.class, args);
    }
}



//package com.example.trendingservice;
//
////import com.example.trendingservice.resources.TrendingServer;
//import com.example.trendingservice.resources.TrendingImpl;
//import com.example.trendingservice.resources.TrendingServer;
//import io.grpc.Grpc;
//import io.grpc.InsecureServerCredentials;
//import io.grpc.Server;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//@SpringBootApplication
//@EnableEurekaClient
//@EnableCircuitBreaker
//public class TrendingMoviesServiceApplication {
//
//    private Server server;
//
//    private void stop() throws InterruptedException {
//        if (server != null) {
//            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
//        }
//    }
//
//    private void start ()  throws IOException {
//        int port = 8089;
//        try {
//            server = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create())
//                    .addService(new TrendingImpl()).build().start();
//
//            Runtime.getRuntime().addShutdownHook(new Thread() {
//                @Override
//                public void run() {
//                    // Use stderr here since the logger may have been reset by its JVM shutdown hook.
//                    System.err.println("*** shutting down gRPC server since JVM is shutting down");
//                    try {
//                        TrendingMoviesServiceApplication.this.stop();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace(System.err);
//                    }
//                    System.err.println("*** server shut down");
//                }
//            });
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    private void blockUntilShutdown() throws InterruptedException {
//        if (server != null) {
//            server.awaitTermination();
//        }
//    }
//
//    public void startServer(){
//        System.out.println("start the server");
//        final  TrendingServer server = new TrendingServer();
//        server.start();
//        server.blockUntilShutdown();
//    }
//
//
//
//    public static void main(String[] args) {
//        SpringApplication.run(TrendingMoviesServiceApplication.class, args);
//    }
//}
