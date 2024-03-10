package com.moviecatalogservice.resources;

import com.moviecatalogservice.generated.*;
import io.grpc.*;

import java.util.concurrent.TimeUnit;

public class MovieCatalogClient {

    private final TrendingMoviesGrpc.TrendingMoviesBlockingStub blockingStub;

    public MovieCatalogClient(Channel channel) {
        blockingStub = TrendingMoviesGrpc.newBlockingStub(channel);
    }

    public void getTrending() {
        TrendingMoviesRequest request = TrendingMoviesRequest.newBuilder().build();

        TrendingMoviesResponse response;
        try {
            response = blockingStub.getTopTrendingMovies(request);
            System.out.println("Received response from server:");
            for (MovieInfo movie : response.getMoviesList()) {
                System.out.println("Movie ID: " + movie.getMovieID());
                System.out.println("Rating: " + movie.getRating());
                System.out.println();
            }
        } catch (StatusRuntimeException e) {
            throw e;
        }

    }
}

//    public void connection() {
//
//
//        // Create a channel to the server
//        System.out.println("Start Connection in client side");
////        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8089)
////                .usePlaintext()  // Use plaintext communication (for demonstration)
////                .build();
//
//
//        // Create a stub (client) for the TrendingMovies service
//        TrendingMoviesGrpc.TrendingMoviesBlockingStub stub = TrendingMoviesGrpc.newBlockingStub(channel);
//
//        // Create a request message
//        TrendingMoviesRequest request = TrendingMoviesRequest.newBuilder().build();
//
//        // Call the RPC and get the response
//        TrendingMoviesResponse response = stub.getTopTrendingMovies(request);
//
//        System.out.println("Back :)))");
//        // Print the response
//        for (MovieInfo movie : response.getMoviesList()) {
//            System.out.println("Movie ID: " + movie.getMovieID());
//            System.out.println("Rating: " + movie.getRating());
//            System.out.println();
//        }
//
//        // Shutdown the channel
//        channel.shutdown();
//    }


//
//public static void Main(){
//
//
//
//}
