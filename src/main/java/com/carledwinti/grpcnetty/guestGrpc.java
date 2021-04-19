package com.carledwinti.grpcnetty;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: guest.proto")
public final class guestGrpc {

  private guestGrpc() {}

  public static final String SERVICE_NAME = "guest";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.carledwinti.grpcnetty.Guest.RegisterRequest,
      com.carledwinti.grpcnetty.Guest.RegisterResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = com.carledwinti.grpcnetty.Guest.RegisterRequest.class,
      responseType = com.carledwinti.grpcnetty.Guest.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.carledwinti.grpcnetty.Guest.RegisterRequest,
      com.carledwinti.grpcnetty.Guest.RegisterResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<com.carledwinti.grpcnetty.Guest.RegisterRequest, com.carledwinti.grpcnetty.Guest.RegisterResponse> getRegisterMethod;
    if ((getRegisterMethod = guestGrpc.getRegisterMethod) == null) {
      synchronized (guestGrpc.class) {
        if ((getRegisterMethod = guestGrpc.getRegisterMethod) == null) {
          guestGrpc.getRegisterMethod = getRegisterMethod = 
              io.grpc.MethodDescriptor.<com.carledwinti.grpcnetty.Guest.RegisterRequest, com.carledwinti.grpcnetty.Guest.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "guest", "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.carledwinti.grpcnetty.Guest.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.carledwinti.grpcnetty.Guest.RegisterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new guestMethodDescriptorSupplier("register"))
                  .build();
          }
        }
     }
     return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.carledwinti.grpcnetty.Guest.Empty,
      com.carledwinti.grpcnetty.Guest.DefaultResponse> getGreetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greeting",
      requestType = com.carledwinti.grpcnetty.Guest.Empty.class,
      responseType = com.carledwinti.grpcnetty.Guest.DefaultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.carledwinti.grpcnetty.Guest.Empty,
      com.carledwinti.grpcnetty.Guest.DefaultResponse> getGreetingMethod() {
    io.grpc.MethodDescriptor<com.carledwinti.grpcnetty.Guest.Empty, com.carledwinti.grpcnetty.Guest.DefaultResponse> getGreetingMethod;
    if ((getGreetingMethod = guestGrpc.getGreetingMethod) == null) {
      synchronized (guestGrpc.class) {
        if ((getGreetingMethod = guestGrpc.getGreetingMethod) == null) {
          guestGrpc.getGreetingMethod = getGreetingMethod = 
              io.grpc.MethodDescriptor.<com.carledwinti.grpcnetty.Guest.Empty, com.carledwinti.grpcnetty.Guest.DefaultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "guest", "greeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.carledwinti.grpcnetty.Guest.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.carledwinti.grpcnetty.Guest.DefaultResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new guestMethodDescriptorSupplier("greeting"))
                  .build();
          }
        }
     }
     return getGreetingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static guestStub newStub(io.grpc.Channel channel) {
    return new guestStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static guestBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new guestBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static guestFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new guestFutureStub(channel);
  }

  /**
   */
  public static abstract class guestImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(com.carledwinti.grpcnetty.Guest.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.carledwinti.grpcnetty.Guest.RegisterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void greeting(com.carledwinti.grpcnetty.Guest.Empty request,
        io.grpc.stub.StreamObserver<com.carledwinti.grpcnetty.Guest.DefaultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.carledwinti.grpcnetty.Guest.RegisterRequest,
                com.carledwinti.grpcnetty.Guest.RegisterResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getGreetingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.carledwinti.grpcnetty.Guest.Empty,
                com.carledwinti.grpcnetty.Guest.DefaultResponse>(
                  this, METHODID_GREETING)))
          .build();
    }
  }

  /**
   */
  public static final class guestStub extends io.grpc.stub.AbstractStub<guestStub> {
    private guestStub(io.grpc.Channel channel) {
      super(channel);
    }

    private guestStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected guestStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new guestStub(channel, callOptions);
    }

    /**
     */
    public void register(com.carledwinti.grpcnetty.Guest.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.carledwinti.grpcnetty.Guest.RegisterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void greeting(com.carledwinti.grpcnetty.Guest.Empty request,
        io.grpc.stub.StreamObserver<com.carledwinti.grpcnetty.Guest.DefaultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class guestBlockingStub extends io.grpc.stub.AbstractStub<guestBlockingStub> {
    private guestBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private guestBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected guestBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new guestBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.carledwinti.grpcnetty.Guest.RegisterResponse register(com.carledwinti.grpcnetty.Guest.RegisterRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.carledwinti.grpcnetty.Guest.DefaultResponse greeting(com.carledwinti.grpcnetty.Guest.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGreetingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class guestFutureStub extends io.grpc.stub.AbstractStub<guestFutureStub> {
    private guestFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private guestFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected guestFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new guestFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.carledwinti.grpcnetty.Guest.RegisterResponse> register(
        com.carledwinti.grpcnetty.Guest.RegisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.carledwinti.grpcnetty.Guest.DefaultResponse> greeting(
        com.carledwinti.grpcnetty.Guest.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_GREETING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final guestImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(guestImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((com.carledwinti.grpcnetty.Guest.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.carledwinti.grpcnetty.Guest.RegisterResponse>) responseObserver);
          break;
        case METHODID_GREETING:
          serviceImpl.greeting((com.carledwinti.grpcnetty.Guest.Empty) request,
              (io.grpc.stub.StreamObserver<com.carledwinti.grpcnetty.Guest.DefaultResponse>) responseObserver);
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

  private static abstract class guestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    guestBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.carledwinti.grpcnetty.Guest.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("guest");
    }
  }

  private static final class guestFileDescriptorSupplier
      extends guestBaseDescriptorSupplier {
    guestFileDescriptorSupplier() {}
  }

  private static final class guestMethodDescriptorSupplier
      extends guestBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    guestMethodDescriptorSupplier(String methodName) {
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
      synchronized (guestGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new guestFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getGreetingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
