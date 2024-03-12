package com.moviecatalogservice.resources;

import com.moviecatalogservice.generated.*;
import com.moviecatalogservice.models.CatalogItem;
import com.moviecatalogservice.models.Rating;
import com.moviecatalogservice.services.MovieInfoService;
import io.grpc.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MovieCatalogClient {
    private final TrendingMoviesGrpc.TrendingMoviesBlockingStub blockingStub;
    public MovieCatalogClient(Channel channel) {
        blockingStub = TrendingMoviesGrpc.newBlockingStub(channel);
    }



    public List<CatalogItem> getTrending(MovieInfoService m) {
        TrendingMoviesRequest request = TrendingMoviesRequest.newBuilder().build();
        TrendingMoviesResponse response;
        List <CatalogItem> trendingMovies = new ArrayList<>();
        try {
            response = blockingStub.getTopTrendingMovies(request);

            System.out.println("Received response from server:");
            for (MovieInfo movie : response.getMoviesList()) {
                System.out.println("Movie ID: " + movie.getMovieID() + "  Rating: " +movie.getRating() );
                Rating r = new Rating(movie.getMovieID() , movie.getRating());
                CatalogItem c = m.getCatalogItem(r);
                System.out.println(c.getName() + " " + c.getDescription() + " " + c.getRating());
                trendingMovies.add(c);

            }
        } catch (StatusRuntimeException e) {
            throw e;
        }
        return trendingMovies;

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
