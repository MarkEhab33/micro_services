package com.moviecatalogservice.resources;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.moviecatalogservice.generatedCode.TrendingMoviesGrpc;
import com.moviecatalogservice.generatedCode.TrendingMoviesRequest;
import com.moviecatalogservice.generatedCode.TrendingMoviesResponse;

public class MovieCatalogClient {
    private final ManagedChannel channel;
    private final TrendingMoviesGrpc.TrendingMoviesBlockingStub blockingStub;

    public TrendingMoviesClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
    }

    private TrendingMoviesClient(ManagedChannelBuilder<?> channelBuilder) {
        channel = channelBuilder.build();
        blockingStub = TrendingMoviesGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);
    }

    public TrendingMoviesResponse getTopTrendingMovies() {
        TrendingMoviesRequest request = TrendingMoviesRequest.newBuilder().build();
        return blockingStub.getTopTrendingMovies(request);
    }

    public static void main(String[] args) {
        TrendingMoviesClient client = new TrendingMoviesClient("localhost", 50051); // Change host and port accordingly
        try {
            TrendingMoviesResponse response = client.getTopTrendingMovies();
            for (int i = 0; i < response.getMoviesCount(); i++) {
                System.out.println("Movie ID: " + response.getMovies(i).getMovieID());
                System.out.println("Rating: " + response.getMovies(i).getRating());
            }
        } finally {
            try {
                client.shutdown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
