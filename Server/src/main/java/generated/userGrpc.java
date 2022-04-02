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
    comments = "Source: user.proto")
public final class userGrpc {

  private userGrpc() {}

  public static final String SERVICE_NAME = "userPackage.user";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.User.credential,
      generated.User.response> getLogInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logIn",
      requestType = generated.User.credential.class,
      responseType = generated.User.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.User.credential,
      generated.User.response> getLogInMethod() {
    io.grpc.MethodDescriptor<generated.User.credential, generated.User.response> getLogInMethod;
    if ((getLogInMethod = userGrpc.getLogInMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLogInMethod = userGrpc.getLogInMethod) == null) {
          userGrpc.getLogInMethod = getLogInMethod = 
              io.grpc.MethodDescriptor.<generated.User.credential, generated.User.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userPackage.user", "logIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.User.credential.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.User.response.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("logIn"))
                  .build();
          }
        }
     }
     return getLogInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.User.credential,
      generated.User.response> getSignUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "signUp",
      requestType = generated.User.credential.class,
      responseType = generated.User.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.User.credential,
      generated.User.response> getSignUpMethod() {
    io.grpc.MethodDescriptor<generated.User.credential, generated.User.response> getSignUpMethod;
    if ((getSignUpMethod = userGrpc.getSignUpMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getSignUpMethod = userGrpc.getSignUpMethod) == null) {
          userGrpc.getSignUpMethod = getSignUpMethod = 
              io.grpc.MethodDescriptor.<generated.User.credential, generated.User.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userPackage.user", "signUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.User.credential.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.User.response.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("signUp"))
                  .build();
          }
        }
     }
     return getSignUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.User.Empty,
      generated.User.response> getLogOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logOut",
      requestType = generated.User.Empty.class,
      responseType = generated.User.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.User.Empty,
      generated.User.response> getLogOutMethod() {
    io.grpc.MethodDescriptor<generated.User.Empty, generated.User.response> getLogOutMethod;
    if ((getLogOutMethod = userGrpc.getLogOutMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLogOutMethod = userGrpc.getLogOutMethod) == null) {
          userGrpc.getLogOutMethod = getLogOutMethod = 
              io.grpc.MethodDescriptor.<generated.User.Empty, generated.User.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userPackage.user", "logOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.User.response.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("logOut"))
                  .build();
          }
        }
     }
     return getLogOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.User.updQuery,
      generated.User.response> getUpdateDBMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateDB",
      requestType = generated.User.updQuery.class,
      responseType = generated.User.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.User.updQuery,
      generated.User.response> getUpdateDBMethod() {
    io.grpc.MethodDescriptor<generated.User.updQuery, generated.User.response> getUpdateDBMethod;
    if ((getUpdateDBMethod = userGrpc.getUpdateDBMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getUpdateDBMethod = userGrpc.getUpdateDBMethod) == null) {
          userGrpc.getUpdateDBMethod = getUpdateDBMethod = 
              io.grpc.MethodDescriptor.<generated.User.updQuery, generated.User.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userPackage.user", "updateDB"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.User.updQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.User.response.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("updateDB"))
                  .build();
          }
        }
     }
     return getUpdateDBMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.User.Empty,
      generated.User.responseAndData> getFetchDBMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fetchDB",
      requestType = generated.User.Empty.class,
      responseType = generated.User.responseAndData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.User.Empty,
      generated.User.responseAndData> getFetchDBMethod() {
    io.grpc.MethodDescriptor<generated.User.Empty, generated.User.responseAndData> getFetchDBMethod;
    if ((getFetchDBMethod = userGrpc.getFetchDBMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getFetchDBMethod = userGrpc.getFetchDBMethod) == null) {
          userGrpc.getFetchDBMethod = getFetchDBMethod = 
              io.grpc.MethodDescriptor.<generated.User.Empty, generated.User.responseAndData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userPackage.user", "fetchDB"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.User.responseAndData.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("fetchDB"))
                  .build();
          }
        }
     }
     return getFetchDBMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.User.Empty,
      generated.User.sessionUser> getGetSessionUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSessionUser",
      requestType = generated.User.Empty.class,
      responseType = generated.User.sessionUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.User.Empty,
      generated.User.sessionUser> getGetSessionUserMethod() {
    io.grpc.MethodDescriptor<generated.User.Empty, generated.User.sessionUser> getGetSessionUserMethod;
    if ((getGetSessionUserMethod = userGrpc.getGetSessionUserMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getGetSessionUserMethod = userGrpc.getGetSessionUserMethod) == null) {
          userGrpc.getGetSessionUserMethod = getGetSessionUserMethod = 
              io.grpc.MethodDescriptor.<generated.User.Empty, generated.User.sessionUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userPackage.user", "getSessionUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.User.sessionUser.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("getSessionUser"))
                  .build();
          }
        }
     }
     return getGetSessionUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userStub newStub(io.grpc.Channel channel) {
    return new userStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userFutureStub(channel);
  }

  /**
   */
  public static abstract class userImplBase implements io.grpc.BindableService {

    /**
     */
    public void logIn(generated.User.credential request,
        io.grpc.stub.StreamObserver<generated.User.response> responseObserver) {
      asyncUnimplementedUnaryCall(getLogInMethod(), responseObserver);
    }

    /**
     */
    public void signUp(generated.User.credential request,
        io.grpc.stub.StreamObserver<generated.User.response> responseObserver) {
      asyncUnimplementedUnaryCall(getSignUpMethod(), responseObserver);
    }

    /**
     */
    public void logOut(generated.User.Empty request,
        io.grpc.stub.StreamObserver<generated.User.response> responseObserver) {
      asyncUnimplementedUnaryCall(getLogOutMethod(), responseObserver);
    }

    /**
     */
    public void updateDB(generated.User.updQuery request,
        io.grpc.stub.StreamObserver<generated.User.response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDBMethod(), responseObserver);
    }

    /**
     */
    public void fetchDB(generated.User.Empty request,
        io.grpc.stub.StreamObserver<generated.User.responseAndData> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchDBMethod(), responseObserver);
    }

    /**
     */
    public void getSessionUser(generated.User.Empty request,
        io.grpc.stub.StreamObserver<generated.User.sessionUser> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSessionUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLogInMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.User.credential,
                generated.User.response>(
                  this, METHODID_LOG_IN)))
          .addMethod(
            getSignUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.User.credential,
                generated.User.response>(
                  this, METHODID_SIGN_UP)))
          .addMethod(
            getLogOutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.User.Empty,
                generated.User.response>(
                  this, METHODID_LOG_OUT)))
          .addMethod(
            getUpdateDBMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.User.updQuery,
                generated.User.response>(
                  this, METHODID_UPDATE_DB)))
          .addMethod(
            getFetchDBMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.User.Empty,
                generated.User.responseAndData>(
                  this, METHODID_FETCH_DB)))
          .addMethod(
            getGetSessionUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.User.Empty,
                generated.User.sessionUser>(
                  this, METHODID_GET_SESSION_USER)))
          .build();
    }
  }

  /**
   */
  public static final class userStub extends io.grpc.stub.AbstractStub<userStub> {
    private userStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userStub(channel, callOptions);
    }

    /**
     */
    public void logIn(generated.User.credential request,
        io.grpc.stub.StreamObserver<generated.User.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signUp(generated.User.credential request,
        io.grpc.stub.StreamObserver<generated.User.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logOut(generated.User.Empty request,
        io.grpc.stub.StreamObserver<generated.User.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDB(generated.User.updQuery request,
        io.grpc.stub.StreamObserver<generated.User.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDBMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchDB(generated.User.Empty request,
        io.grpc.stub.StreamObserver<generated.User.responseAndData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchDBMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSessionUser(generated.User.Empty request,
        io.grpc.stub.StreamObserver<generated.User.sessionUser> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSessionUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userBlockingStub extends io.grpc.stub.AbstractStub<userBlockingStub> {
    private userBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.User.response logIn(generated.User.credential request) {
      return blockingUnaryCall(
          getChannel(), getLogInMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.User.response signUp(generated.User.credential request) {
      return blockingUnaryCall(
          getChannel(), getSignUpMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.User.response logOut(generated.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogOutMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.User.response updateDB(generated.User.updQuery request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDBMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.User.responseAndData fetchDB(generated.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getFetchDBMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.User.sessionUser getSessionUser(generated.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetSessionUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userFutureStub extends io.grpc.stub.AbstractStub<userFutureStub> {
    private userFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.User.response> logIn(
        generated.User.credential request) {
      return futureUnaryCall(
          getChannel().newCall(getLogInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.User.response> signUp(
        generated.User.credential request) {
      return futureUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.User.response> logOut(
        generated.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogOutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.User.response> updateDB(
        generated.User.updQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDBMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.User.responseAndData> fetchDB(
        generated.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchDBMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.User.sessionUser> getSessionUser(
        generated.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSessionUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOG_IN = 0;
  private static final int METHODID_SIGN_UP = 1;
  private static final int METHODID_LOG_OUT = 2;
  private static final int METHODID_UPDATE_DB = 3;
  private static final int METHODID_FETCH_DB = 4;
  private static final int METHODID_GET_SESSION_USER = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOG_IN:
          serviceImpl.logIn((generated.User.credential) request,
              (io.grpc.stub.StreamObserver<generated.User.response>) responseObserver);
          break;
        case METHODID_SIGN_UP:
          serviceImpl.signUp((generated.User.credential) request,
              (io.grpc.stub.StreamObserver<generated.User.response>) responseObserver);
          break;
        case METHODID_LOG_OUT:
          serviceImpl.logOut((generated.User.Empty) request,
              (io.grpc.stub.StreamObserver<generated.User.response>) responseObserver);
          break;
        case METHODID_UPDATE_DB:
          serviceImpl.updateDB((generated.User.updQuery) request,
              (io.grpc.stub.StreamObserver<generated.User.response>) responseObserver);
          break;
        case METHODID_FETCH_DB:
          serviceImpl.fetchDB((generated.User.Empty) request,
              (io.grpc.stub.StreamObserver<generated.User.responseAndData>) responseObserver);
          break;
        case METHODID_GET_SESSION_USER:
          serviceImpl.getSessionUser((generated.User.Empty) request,
              (io.grpc.stub.StreamObserver<generated.User.sessionUser>) responseObserver);
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

  private static abstract class userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("user");
    }
  }

  private static final class userFileDescriptorSupplier
      extends userBaseDescriptorSupplier {
    userFileDescriptorSupplier() {}
  }

  private static final class userMethodDescriptorSupplier
      extends userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userMethodDescriptorSupplier(String methodName) {
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
      synchronized (userGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userFileDescriptorSupplier())
              .addMethod(getLogInMethod())
              .addMethod(getSignUpMethod())
              .addMethod(getLogOutMethod())
              .addMethod(getUpdateDBMethod())
              .addMethod(getFetchDBMethod())
              .addMethod(getGetSessionUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
