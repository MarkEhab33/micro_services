//package com.example.trendingservice.resources;
//
//
//
//import com.example.trendingservice.generated.MovieInfo;
//import com.example.trendingservice.generated.TrendingMoviesGrpc;
//import com.example.trendingservice.generated.TrendingMoviesRequest;
//import com.example.trendingservice.generated.TrendingMoviesResponse;
//import io.grpc.stub.StreamObserver;
//
//import java.util.Arrays;
//import java.util.List;
//
//
//public class TrendingService extends TrendingMoviesGrpc.TrendingMoviesImplBase {
//
//    @Override
//    public void getTopTrendingMovies(TrendingMoviesRequest request, StreamObserver<TrendingMoviesResponse> responseObserver) {
//        System.out.println("In trending server i get the request");
//        List<MovieInfo> movies = Arrays.asList(
//                MovieInfo.newBuilder().setMovieID("550").setRating(4).build()
//        );
//
//        TrendingMoviesResponse response = TrendingMoviesResponse.newBuilder().addAllMovies(movies).build();
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();
//    }
//}
