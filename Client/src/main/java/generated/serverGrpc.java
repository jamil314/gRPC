package generated;

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
    comments = "Source: server.proto")
public final class serverGrpc {

  private serverGrpc() {}

  public static final String SERVICE_NAME = "server";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.Server.credential,
      generated.Server.response> getLogInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logIn",
      requestType = generated.Server.credential.class,
      responseType = generated.Server.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Server.credential,
      generated.Server.response> getLogInMethod() {
    io.grpc.MethodDescriptor<generated.Server.credential, generated.Server.response> getLogInMethod;
    if ((getLogInMethod = serverGrpc.getLogInMethod) == null) {
      synchronized (serverGrpc.class) {
        if ((getLogInMethod = serverGrpc.getLogInMethod) == null) {
          serverGrpc.getLogInMethod = getLogInMethod = 
              io.grpc.MethodDescriptor.<generated.Server.credential, generated.Server.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "server", "logIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Server.credential.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Server.response.getDefaultInstance()))
                  .setSchemaDescriptor(new serverMethodDescriptorSupplier("logIn"))
                  .build();
          }
        }
     }
     return getLogInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Server.credential,
      generated.Server.response> getSignUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "signUp",
      requestType = generated.Server.credential.class,
      responseType = generated.Server.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Server.credential,
      generated.Server.response> getSignUpMethod() {
    io.grpc.MethodDescriptor<generated.Server.credential, generated.Server.response> getSignUpMethod;
    if ((getSignUpMethod = serverGrpc.getSignUpMethod) == null) {
      synchronized (serverGrpc.class) {
        if ((getSignUpMethod = serverGrpc.getSignUpMethod) == null) {
          serverGrpc.getSignUpMethod = getSignUpMethod = 
              io.grpc.MethodDescriptor.<generated.Server.credential, generated.Server.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "server", "signUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Server.credential.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Server.response.getDefaultInstance()))
                  .setSchemaDescriptor(new serverMethodDescriptorSupplier("signUp"))
                  .build();
          }
        }
     }
     return getSignUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Server.Empty,
      generated.Server.response> getLogOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logOut",
      requestType = generated.Server.Empty.class,
      responseType = generated.Server.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Server.Empty,
      generated.Server.response> getLogOutMethod() {
    io.grpc.MethodDescriptor<generated.Server.Empty, generated.Server.response> getLogOutMethod;
    if ((getLogOutMethod = serverGrpc.getLogOutMethod) == null) {
      synchronized (serverGrpc.class) {
        if ((getLogOutMethod = serverGrpc.getLogOutMethod) == null) {
          serverGrpc.getLogOutMethod = getLogOutMethod = 
              io.grpc.MethodDescriptor.<generated.Server.Empty, generated.Server.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "server", "logOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Server.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Server.response.getDefaultInstance()))
                  .setSchemaDescriptor(new serverMethodDescriptorSupplier("logOut"))
                  .build();
          }
        }
     }
     return getLogOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Server.updQuery,
      generated.Server.response> getUpdateDBMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateDB",
      requestType = generated.Server.updQuery.class,
      responseType = generated.Server.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Server.updQuery,
      generated.Server.response> getUpdateDBMethod() {
    io.grpc.MethodDescriptor<generated.Server.updQuery, generated.Server.response> getUpdateDBMethod;
    if ((getUpdateDBMethod = serverGrpc.getUpdateDBMethod) == null) {
      synchronized (serverGrpc.class) {
        if ((getUpdateDBMethod = serverGrpc.getUpdateDBMethod) == null) {
          serverGrpc.getUpdateDBMethod = getUpdateDBMethod = 
              io.grpc.MethodDescriptor.<generated.Server.updQuery, generated.Server.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "server", "updateDB"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Server.updQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Server.response.getDefaultInstance()))
                  .setSchemaDescriptor(new serverMethodDescriptorSupplier("updateDB"))
                  .build();
          }
        }
     }
     return getUpdateDBMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Server.Empty,
      generated.Server.responseAndData> getFetchDBMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fetchDB",
      requestType = generated.Server.Empty.class,
      responseType = generated.Server.responseAndData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Server.Empty,
      generated.Server.responseAndData> getFetchDBMethod() {
    io.grpc.MethodDescriptor<generated.Server.Empty, generated.Server.responseAndData> getFetchDBMethod;
    if ((getFetchDBMethod = serverGrpc.getFetchDBMethod) == null) {
      synchronized (serverGrpc.class) {
        if ((getFetchDBMethod = serverGrpc.getFetchDBMethod) == null) {
          serverGrpc.getFetchDBMethod = getFetchDBMethod = 
              io.grpc.MethodDescriptor.<generated.Server.Empty, generated.Server.responseAndData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "server", "fetchDB"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Server.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Server.responseAndData.getDefaultInstance()))
                  .setSchemaDescriptor(new serverMethodDescriptorSupplier("fetchDB"))
                  .build();
          }
        }
     }
     return getFetchDBMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static serverStub newStub(io.grpc.Channel channel) {
    return new serverStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static serverBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new serverBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static serverFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new serverFutureStub(channel);
  }

  /**
   */
  public static abstract class serverImplBase implements io.grpc.BindableService {

    /**
     */
    public void logIn(generated.Server.credential request,
        io.grpc.stub.StreamObserver<generated.Server.response> responseObserver) {
      asyncUnimplementedUnaryCall(getLogInMethod(), responseObserver);
    }

    /**
     */
    public void signUp(generated.Server.credential request,
        io.grpc.stub.StreamObserver<generated.Server.response> responseObserver) {
      asyncUnimplementedUnaryCall(getSignUpMethod(), responseObserver);
    }

    /**
     */
    public void logOut(generated.Server.Empty request,
        io.grpc.stub.StreamObserver<generated.Server.response> responseObserver) {
      asyncUnimplementedUnaryCall(getLogOutMethod(), responseObserver);
    }

    /**
     */
    public void updateDB(generated.Server.updQuery request,
        io.grpc.stub.StreamObserver<generated.Server.response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDBMethod(), responseObserver);
    }

    /**
     */
    public void fetchDB(generated.Server.Empty request,
        io.grpc.stub.StreamObserver<generated.Server.responseAndData> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchDBMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLogInMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Server.credential,
                generated.Server.response>(
                  this, METHODID_LOG_IN)))
          .addMethod(
            getSignUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Server.credential,
                generated.Server.response>(
                  this, METHODID_SIGN_UP)))
          .addMethod(
            getLogOutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Server.Empty,
                generated.Server.response>(
                  this, METHODID_LOG_OUT)))
          .addMethod(
            getUpdateDBMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Server.updQuery,
                generated.Server.response>(
                  this, METHODID_UPDATE_DB)))
          .addMethod(
            getFetchDBMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Server.Empty,
                generated.Server.responseAndData>(
                  this, METHODID_FETCH_DB)))
          .build();
    }
  }

  /**
   */
  public static final class serverStub extends io.grpc.stub.AbstractStub<serverStub> {
    private serverStub(io.grpc.Channel channel) {
      super(channel);
    }

    private serverStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serverStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new serverStub(channel, callOptions);
    }

    /**
     */
    public void logIn(generated.Server.credential request,
        io.grpc.stub.StreamObserver<generated.Server.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signUp(generated.Server.credential request,
        io.grpc.stub.StreamObserver<generated.Server.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logOut(generated.Server.Empty request,
        io.grpc.stub.StreamObserver<generated.Server.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDB(generated.Server.updQuery request,
        io.grpc.stub.StreamObserver<generated.Server.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDBMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchDB(generated.Server.Empty request,
        io.grpc.stub.StreamObserver<generated.Server.responseAndData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchDBMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class serverBlockingStub extends io.grpc.stub.AbstractStub<serverBlockingStub> {
    private serverBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private serverBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serverBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new serverBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.Server.response logIn(generated.Server.credential request) {
      return blockingUnaryCall(
          getChannel(), getLogInMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Server.response signUp(generated.Server.credential request) {
      return blockingUnaryCall(
          getChannel(), getSignUpMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Server.response logOut(generated.Server.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogOutMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Server.response updateDB(generated.Server.updQuery request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDBMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Server.responseAndData fetchDB(generated.Server.Empty request) {
      return blockingUnaryCall(
          getChannel(), getFetchDBMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class serverFutureStub extends io.grpc.stub.AbstractStub<serverFutureStub> {
    private serverFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private serverFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serverFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new serverFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Server.response> logIn(
        generated.Server.credential request) {
      return futureUnaryCall(
          getChannel().newCall(getLogInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Server.response> signUp(
        generated.Server.credential request) {
      return futureUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Server.response> logOut(
        generated.Server.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogOutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Server.response> updateDB(
        generated.Server.updQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDBMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Server.responseAndData> fetchDB(
        generated.Server.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchDBMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOG_IN = 0;
  private static final int METHODID_SIGN_UP = 1;
  private static final int METHODID_LOG_OUT = 2;
  private static final int METHODID_UPDATE_DB = 3;
  private static final int METHODID_FETCH_DB = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final serverImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(serverImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOG_IN:
          serviceImpl.logIn((generated.Server.credential) request,
              (io.grpc.stub.StreamObserver<generated.Server.response>) responseObserver);
          break;
        case METHODID_SIGN_UP:
          serviceImpl.signUp((generated.Server.credential) request,
              (io.grpc.stub.StreamObserver<generated.Server.response>) responseObserver);
          break;
        case METHODID_LOG_OUT:
          serviceImpl.logOut((generated.Server.Empty) request,
              (io.grpc.stub.StreamObserver<generated.Server.response>) responseObserver);
          break;
        case METHODID_UPDATE_DB:
          serviceImpl.updateDB((generated.Server.updQuery) request,
              (io.grpc.stub.StreamObserver<generated.Server.response>) responseObserver);
          break;
        case METHODID_FETCH_DB:
          serviceImpl.fetchDB((generated.Server.Empty) request,
              (io.grpc.stub.StreamObserver<generated.Server.responseAndData>) responseObserver);
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

  private static abstract class serverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    serverBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.Server.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("server");
    }
  }

  private static final class serverFileDescriptorSupplier
      extends serverBaseDescriptorSupplier {
    serverFileDescriptorSupplier() {}
  }

  private static final class serverMethodDescriptorSupplier
      extends serverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    serverMethodDescriptorSupplier(String methodName) {
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
      synchronized (serverGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new serverFileDescriptorSupplier())
              .addMethod(getLogInMethod())
              .addMethod(getSignUpMethod())
              .addMethod(getLogOutMethod())
              .addMethod(getUpdateDBMethod())
              .addMethod(getFetchDBMethod())
              .build();
        }
      }
    }
    return result;
  }
}
