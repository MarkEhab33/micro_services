//package com.example.trendingservice.resources;
//
//import com.example.trendingservice.models.Rating;
//import com.example.trendingservice.models.UserRating;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Arrays;
//import java.util.List;
//
//
//
//import io.grpc.Server;
//import io.grpc.ServerBuilder;
//import java.io.IOException;
//
//
////@RestController
//public class TrendingResource {
//
////    @RequestMapping("/trending")
//
//    public static void main(String[] args) throws IOException, InterruptedException {
//        Server server = ServerBuilder.forPort(8089)
//                .addService(new TrendingService())
//                .build();
//
//        try {
//            server.start();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Server started, listening on port " + server.getPort());
//
//        server.awaitTermination();
//
//    }
//
//
//}
