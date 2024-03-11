package com.example.trendingservice.resources;

import com.example.trendingservice.data.RatingsResource;
import com.example.trendingservice.generated.MovieInfo;
import com.example.trendingservice.generated.TrendingMoviesGrpc;
import com.example.trendingservice.generated.TrendingMoviesRequest;
import com.example.trendingservice.generated.TrendingMoviesResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GrpcService
public class TrendingImpl extends TrendingMoviesGrpc.TrendingMoviesImplBase {
    @Autowired
    public RatingsResource rating = new RatingsResource();

    @Override
    public void getTopTrendingMovies(TrendingMoviesRequest request, StreamObserver<TrendingMoviesResponse> responseObserver) {
        System.out.println("In trending server i get the request");
        List<MovieInfo> movies = rating.getTopTenTrendings();

        TrendingMoviesResponse response = TrendingMoviesResponse.newBuilder().addAllMovies(movies).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
