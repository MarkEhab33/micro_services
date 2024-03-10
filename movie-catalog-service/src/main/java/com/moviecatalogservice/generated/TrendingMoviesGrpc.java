package com.moviecatalogservice.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Define the service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: schema.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrendingMoviesGrpc {

  private TrendingMoviesGrpc() {}

  public static final String SERVICE_NAME = "TrendingMovies";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.moviecatalogservice.generated.TrendingMoviesRequest,
      com.moviecatalogservice.generated.TrendingMoviesResponse> getGetTopTrendingMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTopTrendingMovies",
      requestType = com.moviecatalogservice.generated.TrendingMoviesRequest.class,
      responseType = com.moviecatalogservice.generated.TrendingMoviesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.moviecatalogservice.generated.TrendingMoviesRequest,
      com.moviecatalogservice.generated.TrendingMoviesResponse> getGetTopTrendingMoviesMethod() {
    io.grpc.MethodDescriptor<com.moviecatalogservice.generated.TrendingMoviesRequest, com.moviecatalogservice.generated.TrendingMoviesResponse> getGetTopTrendingMoviesMethod;
    if ((getGetTopTrendingMoviesMethod = TrendingMoviesGrpc.getGetTopTrendingMoviesMethod) == null) {
      synchronized (TrendingMoviesGrpc.class) {
        if ((getGetTopTrendingMoviesMethod = TrendingMoviesGrpc.getGetTopTrendingMoviesMethod) == null) {
          TrendingMoviesGrpc.getGetTopTrendingMoviesMethod = getGetTopTrendingMoviesMethod =
              io.grpc.MethodDescriptor.<com.moviecatalogservice.generated.TrendingMoviesRequest, com.moviecatalogservice.generated.TrendingMoviesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTopTrendingMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.moviecatalogservice.generated.TrendingMoviesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.moviecatalogservice.generated.TrendingMoviesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrendingMoviesMethodDescriptorSupplier("GetTopTrendingMovies"))
              .build();
        }
      }
    }
    return getGetTopTrendingMoviesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrendingMoviesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesStub>() {
        @java.lang.Override
        public TrendingMoviesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesStub(channel, callOptions);
        }
      };
    return TrendingMoviesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrendingMoviesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesBlockingStub>() {
        @java.lang.Override
        public TrendingMoviesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesBlockingStub(channel, callOptions);
        }
      };
    return TrendingMoviesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrendingMoviesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrendingMoviesFutureStub>() {
        @java.lang.Override
        public TrendingMoviesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrendingMoviesFutureStub(channel, callOptions);
        }
      };
    return TrendingMoviesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Define the service
   * </pre>
   */
  public static abstract class TrendingMoviesImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTopTrendingMovies(com.moviecatalogservice.generated.TrendingMoviesRequest request,
        io.grpc.stub.StreamObserver<com.moviecatalogservice.generated.TrendingMoviesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTopTrendingMoviesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTopTrendingMoviesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.moviecatalogservice.generated.TrendingMoviesRequest,
                com.moviecatalogservice.generated.TrendingMoviesResponse>(
                  this, METHODID_GET_TOP_TRENDING_MOVIES)))
          .build();
    }
  }

  /**
   * <pre>
   * Define the service
   * </pre>
   */
  public static final class TrendingMoviesStub extends io.grpc.stub.AbstractAsyncStub<TrendingMoviesStub> {
    private TrendingMoviesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesStub(channel, callOptions);
    }

    /**
     */
    public void getTopTrendingMovies(com.moviecatalogservice.generated.TrendingMoviesRequest request,
        io.grpc.stub.StreamObserver<com.moviecatalogservice.generated.TrendingMoviesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTopTrendingMoviesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define the service
   * </pre>
   */
  public static final class TrendingMoviesBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrendingMoviesBlockingStub> {
    private TrendingMoviesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.moviecatalogservice.generated.TrendingMoviesResponse getTopTrendingMovies(com.moviecatalogservice.generated.TrendingMoviesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTopTrendingMoviesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define the service
   * </pre>
   */
  public static final class TrendingMoviesFutureStub extends io.grpc.stub.AbstractFutureStub<TrendingMoviesFutureStub> {
    private TrendingMoviesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrendingMoviesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrendingMoviesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.moviecatalogservice.generated.TrendingMoviesResponse> getTopTrendingMovies(
        com.moviecatalogservice.generated.TrendingMoviesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTopTrendingMoviesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOP_TRENDING_MOVIES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrendingMoviesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrendingMoviesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOP_TRENDING_MOVIES:
          serviceImpl.getTopTrendingMovies((com.moviecatalogservice.generated.TrendingMoviesRequest) request,
              (io.grpc.stub.StreamObserver<com.moviecatalogservice.generated.TrendingMoviesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TrendingMoviesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrendingMoviesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.moviecatalogservice.generated.TrendingGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrendingMovies");
    }
  }

  private static final class TrendingMoviesFileDescriptorSupplier
      extends TrendingMoviesBaseDescriptorSupplier {
    TrendingMoviesFileDescriptorSupplier() {}
  }

  private static final class TrendingMoviesMethodDescriptorSupplier
      extends TrendingMoviesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrendingMoviesMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TrendingMoviesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrendingMoviesFileDescriptorSupplier())
              .addMethod(getGetTopTrendingMoviesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
