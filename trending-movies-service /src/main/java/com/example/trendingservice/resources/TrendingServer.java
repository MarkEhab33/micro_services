package com.example.trendingservice.resources;

import com.example.trendingservice.generated.MovieInfo;
import com.example.trendingservice.generated.TrendingMoviesGrpc;
import com.example.trendingservice.generated.TrendingMoviesRequest;
import com.example.trendingservice.generated.TrendingMoviesResponse;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TrendingServer {

    private Server server;

    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    private void start ()  throws IOException{
        int port = 8089;
        try {
             server = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create())
                    .addService(new TrendingImpl()).build().start();

            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
                    // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                    System.err.println("*** shutting down gRPC server since JVM is shutting down");
                    try {
                        TrendingServer.this.stop();
                    } catch (InterruptedException e) {
                        e.printStackTrace(System.err);
                    }
                    System.err.println("*** server shut down");
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("start the server");
        final  TrendingServer server = new TrendingServer();
        server.start();
        server.blockUntilShutdown();
    }


    static class TrendingImpl extends TrendingMoviesGrpc.TrendingMoviesImplBase {

        @Override
        public void getTopTrendingMovies(TrendingMoviesRequest request, StreamObserver<TrendingMoviesResponse> responseObserver) {
            System.out.println("In trending server i get the request");
            List<MovieInfo> movies = Arrays.asList(
                    MovieInfo.newBuilder().setMovieID("550").setRating(4).build()
            );

            TrendingMoviesResponse response = TrendingMoviesResponse.newBuilder().addAllMovies(movies).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }




}
