package org.example.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: bank.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.grpc.stubs.Bank.ConvertCurrencyRequest,
      org.example.grpc.stubs.Bank.ConvertCurrencyResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = org.example.grpc.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = org.example.grpc.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.stubs.Bank.ConvertCurrencyRequest,
      org.example.grpc.stubs.Bank.ConvertCurrencyResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.stubs.Bank.ConvertCurrencyRequest, org.example.grpc.stubs.Bank.ConvertCurrencyResponse> getConvertMethod;
    if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertMethod = BankServiceGrpc.getConvertMethod) == null) {
          BankServiceGrpc.getConvertMethod = getConvertMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.stubs.Bank.ConvertCurrencyRequest, org.example.grpc.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convert"))
              .build();
        }
      }
    }
    return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.stubs.Bank.ConvertCurrencyRequest,
      org.example.grpc.stubs.Bank.ConvertCurrencyResponse> getGetCurrencyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCurrencyStream",
      requestType = org.example.grpc.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = org.example.grpc.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.grpc.stubs.Bank.ConvertCurrencyRequest,
      org.example.grpc.stubs.Bank.ConvertCurrencyResponse> getGetCurrencyStreamMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.stubs.Bank.ConvertCurrencyRequest, org.example.grpc.stubs.Bank.ConvertCurrencyResponse> getGetCurrencyStreamMethod;
    if ((getGetCurrencyStreamMethod = BankServiceGrpc.getGetCurrencyStreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetCurrencyStreamMethod = BankServiceGrpc.getGetCurrencyStreamMethod) == null) {
          BankServiceGrpc.getGetCurrencyStreamMethod = getGetCurrencyStreamMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.stubs.Bank.ConvertCurrencyRequest, org.example.grpc.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCurrencyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getCurrencyStream"))
              .build();
        }
      }
    }
    return getGetCurrencyStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.stubs.Bank.ConvertCurrencyRequest,
      org.example.grpc.stubs.Bank.ConvertCurrencyResponse> getPerformStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "performStream",
      requestType = org.example.grpc.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = org.example.grpc.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.grpc.stubs.Bank.ConvertCurrencyRequest,
      org.example.grpc.stubs.Bank.ConvertCurrencyResponse> getPerformStreamMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.stubs.Bank.ConvertCurrencyRequest, org.example.grpc.stubs.Bank.ConvertCurrencyResponse> getPerformStreamMethod;
    if ((getPerformStreamMethod = BankServiceGrpc.getPerformStreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getPerformStreamMethod = BankServiceGrpc.getPerformStreamMethod) == null) {
          BankServiceGrpc.getPerformStreamMethod = getPerformStreamMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.stubs.Bank.ConvertCurrencyRequest, org.example.grpc.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "performStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("performStream"))
              .build();
        }
      }
    }
    return getPerformStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.stubs.Bank.ConvertCurrencyRequest,
      org.example.grpc.stubs.Bank.ConvertCurrencyResponse> getFullCurrencyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullCurrencyStream",
      requestType = org.example.grpc.stubs.Bank.ConvertCurrencyRequest.class,
      responseType = org.example.grpc.stubs.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.grpc.stubs.Bank.ConvertCurrencyRequest,
      org.example.grpc.stubs.Bank.ConvertCurrencyResponse> getFullCurrencyStreamMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.stubs.Bank.ConvertCurrencyRequest, org.example.grpc.stubs.Bank.ConvertCurrencyResponse> getFullCurrencyStreamMethod;
    if ((getFullCurrencyStreamMethod = BankServiceGrpc.getFullCurrencyStreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getFullCurrencyStreamMethod = BankServiceGrpc.getFullCurrencyStreamMethod) == null) {
          BankServiceGrpc.getFullCurrencyStreamMethod = getFullCurrencyStreamMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.stubs.Bank.ConvertCurrencyRequest, org.example.grpc.stubs.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fullCurrencyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.stubs.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.stubs.Bank.ConvertCurrencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("fullCurrencyStream"))
              .build();
        }
      }
    }
    return getFullCurrencyStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceStub>() {
        @java.lang.Override
        public BankServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceStub(channel, callOptions);
        }
      };
    return BankServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub>() {
        @java.lang.Override
        public BankServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceBlockingStub(channel, callOptions);
        }
      };
    return BankServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub>() {
        @java.lang.Override
        public BankServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceFutureStub(channel, callOptions);
        }
      };
    return BankServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void convert(org.example.grpc.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     */
    public void getCurrencyStream(org.example.grpc.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrencyStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyRequest> performStream(
        io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPerformStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyRequest> fullCurrencyStream(
        io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFullCurrencyStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.stubs.Bank.ConvertCurrencyRequest,
                org.example.grpc.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetCurrencyStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.grpc.stubs.Bank.ConvertCurrencyRequest,
                org.example.grpc.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_GET_CURRENCY_STREAM)))
          .addMethod(
            getPerformStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.example.grpc.stubs.Bank.ConvertCurrencyRequest,
                org.example.grpc.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_PERFORM_STREAM)))
          .addMethod(
            getFullCurrencyStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.example.grpc.stubs.Bank.ConvertCurrencyRequest,
                org.example.grpc.stubs.Bank.ConvertCurrencyResponse>(
                  this, METHODID_FULL_CURRENCY_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractAsyncStub<BankServiceStub> {
    private BankServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     */
    public void convert(org.example.grpc.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrencyStream(org.example.grpc.stubs.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetCurrencyStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyRequest> performStream(
        io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getPerformStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyRequest> fullCurrencyStream(
        io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getFullCurrencyStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.grpc.stubs.Bank.ConvertCurrencyResponse convert(org.example.grpc.stubs.Bank.ConvertCurrencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.grpc.stubs.Bank.ConvertCurrencyResponse> getCurrencyStream(
        org.example.grpc.stubs.Bank.ConvertCurrencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetCurrencyStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BankServiceFutureStub> {
    private BankServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.stubs.Bank.ConvertCurrencyResponse> convert(
        org.example.grpc.stubs.Bank.ConvertCurrencyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_CURRENCY_STREAM = 1;
  private static final int METHODID_PERFORM_STREAM = 2;
  private static final int METHODID_FULL_CURRENCY_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((org.example.grpc.stubs.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENCY_STREAM:
          serviceImpl.getCurrencyStream((org.example.grpc.stubs.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
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
        case METHODID_PERFORM_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.performStream(
              (io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
        case METHODID_FULL_CURRENCY_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullCurrencyStream(
              (io.grpc.stub.StreamObserver<org.example.grpc.stubs.Bank.ConvertCurrencyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.grpc.stubs.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetCurrencyStreamMethod())
              .addMethod(getPerformStreamMethod())
              .addMethod(getFullCurrencyStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
