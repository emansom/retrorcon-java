package com.github.emansom.retrorcon;

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
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: rcon.proto")
public final class RconGrpc {

  private RconGrpc() {}

  public static final String SERVICE_NAME = "RetroRCON.Rcon";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPingMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> METHOD_PING = getPingMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getPingMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getPingMethod() {
    return getPingMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getPingMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.github.emansom.retrorcon.Response> getPingMethod;
    if ((getPingMethod = RconGrpc.getPingMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getPingMethod = RconGrpc.getPingMethod) == null) {
          RconGrpc.getPingMethod = getPingMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("Ping"))
                  .build();
          }
        }
     }
     return getPingMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetOnlineCountMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.OnlineCountResponse> METHOD_GET_ONLINE_COUNT = getGetOnlineCountMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.OnlineCountResponse> getGetOnlineCountMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.OnlineCountResponse> getGetOnlineCountMethod() {
    return getGetOnlineCountMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.OnlineCountResponse> getGetOnlineCountMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.github.emansom.retrorcon.OnlineCountResponse> getGetOnlineCountMethod;
    if ((getGetOnlineCountMethod = RconGrpc.getGetOnlineCountMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getGetOnlineCountMethod = RconGrpc.getGetOnlineCountMethod) == null) {
          RconGrpc.getGetOnlineCountMethod = getGetOnlineCountMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.github.emansom.retrorcon.OnlineCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "GetOnlineCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.OnlineCountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("GetOnlineCount"))
                  .build();
          }
        }
     }
     return getGetOnlineCountMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRefreshAppearanceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RefreshAppearanceRequest,
      com.github.emansom.retrorcon.Response> METHOD_REFRESH_APPEARANCE = getRefreshAppearanceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RefreshAppearanceRequest,
      com.github.emansom.retrorcon.Response> getRefreshAppearanceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RefreshAppearanceRequest,
      com.github.emansom.retrorcon.Response> getRefreshAppearanceMethod() {
    return getRefreshAppearanceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RefreshAppearanceRequest,
      com.github.emansom.retrorcon.Response> getRefreshAppearanceMethodHelper() {
    io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RefreshAppearanceRequest, com.github.emansom.retrorcon.Response> getRefreshAppearanceMethod;
    if ((getRefreshAppearanceMethod = RconGrpc.getRefreshAppearanceMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getRefreshAppearanceMethod = RconGrpc.getRefreshAppearanceMethod) == null) {
          RconGrpc.getRefreshAppearanceMethod = getRefreshAppearanceMethod = 
              io.grpc.MethodDescriptor.<com.github.emansom.retrorcon.RefreshAppearanceRequest, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "RefreshAppearance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.RefreshAppearanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("RefreshAppearance"))
                  .build();
          }
        }
     }
     return getRefreshAppearanceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRefreshBadgesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RefreshBadgesRequest,
      com.github.emansom.retrorcon.Response> METHOD_REFRESH_BADGES = getRefreshBadgesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RefreshBadgesRequest,
      com.github.emansom.retrorcon.Response> getRefreshBadgesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RefreshBadgesRequest,
      com.github.emansom.retrorcon.Response> getRefreshBadgesMethod() {
    return getRefreshBadgesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RefreshBadgesRequest,
      com.github.emansom.retrorcon.Response> getRefreshBadgesMethodHelper() {
    io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RefreshBadgesRequest, com.github.emansom.retrorcon.Response> getRefreshBadgesMethod;
    if ((getRefreshBadgesMethod = RconGrpc.getRefreshBadgesMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getRefreshBadgesMethod = RconGrpc.getRefreshBadgesMethod) == null) {
          RconGrpc.getRefreshBadgesMethod = getRefreshBadgesMethod = 
              io.grpc.MethodDescriptor.<com.github.emansom.retrorcon.RefreshBadgesRequest, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "RefreshBadges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.RefreshBadgesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("RefreshBadges"))
                  .build();
          }
        }
     }
     return getRefreshBadgesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRefreshEventsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> METHOD_REFRESH_EVENTS = getRefreshEventsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getRefreshEventsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getRefreshEventsMethod() {
    return getRefreshEventsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getRefreshEventsMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.github.emansom.retrorcon.Response> getRefreshEventsMethod;
    if ((getRefreshEventsMethod = RconGrpc.getRefreshEventsMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getRefreshEventsMethod = RconGrpc.getRefreshEventsMethod) == null) {
          RconGrpc.getRefreshEventsMethod = getRefreshEventsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "RefreshEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("RefreshEvents"))
                  .build();
          }
        }
     }
     return getRefreshEventsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRefreshCatalogueMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> METHOD_REFRESH_CATALOGUE = getRefreshCatalogueMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getRefreshCatalogueMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getRefreshCatalogueMethod() {
    return getRefreshCatalogueMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getRefreshCatalogueMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.github.emansom.retrorcon.Response> getRefreshCatalogueMethod;
    if ((getRefreshCatalogueMethod = RconGrpc.getRefreshCatalogueMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getRefreshCatalogueMethod = RconGrpc.getRefreshCatalogueMethod) == null) {
          RconGrpc.getRefreshCatalogueMethod = getRefreshCatalogueMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "RefreshCatalogue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("RefreshCatalogue"))
                  .build();
          }
        }
     }
     return getRefreshCatalogueMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getOpenInfobusMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> METHOD_OPEN_INFOBUS = getOpenInfobusMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getOpenInfobusMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getOpenInfobusMethod() {
    return getOpenInfobusMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getOpenInfobusMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.github.emansom.retrorcon.Response> getOpenInfobusMethod;
    if ((getOpenInfobusMethod = RconGrpc.getOpenInfobusMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getOpenInfobusMethod = RconGrpc.getOpenInfobusMethod) == null) {
          RconGrpc.getOpenInfobusMethod = getOpenInfobusMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "OpenInfobus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("OpenInfobus"))
                  .build();
          }
        }
     }
     return getOpenInfobusMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCloseInfobusMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> METHOD_CLOSE_INFOBUS = getCloseInfobusMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getCloseInfobusMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getCloseInfobusMethod() {
    return getCloseInfobusMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.github.emansom.retrorcon.Response> getCloseInfobusMethodHelper() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.github.emansom.retrorcon.Response> getCloseInfobusMethod;
    if ((getCloseInfobusMethod = RconGrpc.getCloseInfobusMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getCloseInfobusMethod = RconGrpc.getCloseInfobusMethod) == null) {
          RconGrpc.getCloseInfobusMethod = getCloseInfobusMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "CloseInfobus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("CloseInfobus"))
                  .build();
          }
        }
     }
     return getCloseInfobusMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAlertRoomMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RoomAlertRequest,
      com.github.emansom.retrorcon.Response> METHOD_ALERT_ROOM = getAlertRoomMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RoomAlertRequest,
      com.github.emansom.retrorcon.Response> getAlertRoomMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RoomAlertRequest,
      com.github.emansom.retrorcon.Response> getAlertRoomMethod() {
    return getAlertRoomMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RoomAlertRequest,
      com.github.emansom.retrorcon.Response> getAlertRoomMethodHelper() {
    io.grpc.MethodDescriptor<com.github.emansom.retrorcon.RoomAlertRequest, com.github.emansom.retrorcon.Response> getAlertRoomMethod;
    if ((getAlertRoomMethod = RconGrpc.getAlertRoomMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getAlertRoomMethod = RconGrpc.getAlertRoomMethod) == null) {
          RconGrpc.getAlertRoomMethod = getAlertRoomMethod = 
              io.grpc.MethodDescriptor.<com.github.emansom.retrorcon.RoomAlertRequest, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "AlertRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.RoomAlertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("AlertRoom"))
                  .build();
          }
        }
     }
     return getAlertRoomMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAlertUserMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UserAlertRequest,
      com.github.emansom.retrorcon.Response> METHOD_ALERT_USER = getAlertUserMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UserAlertRequest,
      com.github.emansom.retrorcon.Response> getAlertUserMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UserAlertRequest,
      com.github.emansom.retrorcon.Response> getAlertUserMethod() {
    return getAlertUserMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UserAlertRequest,
      com.github.emansom.retrorcon.Response> getAlertUserMethodHelper() {
    io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UserAlertRequest, com.github.emansom.retrorcon.Response> getAlertUserMethod;
    if ((getAlertUserMethod = RconGrpc.getAlertUserMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getAlertUserMethod = RconGrpc.getAlertUserMethod) == null) {
          RconGrpc.getAlertUserMethod = getAlertUserMethod = 
              io.grpc.MethodDescriptor.<com.github.emansom.retrorcon.UserAlertRequest, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "AlertUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.UserAlertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("AlertUser"))
                  .build();
          }
        }
     }
     return getAlertUserMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAlertHotelMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.github.emansom.retrorcon.HotelAlertRequest,
      com.github.emansom.retrorcon.Response> METHOD_ALERT_HOTEL = getAlertHotelMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.github.emansom.retrorcon.HotelAlertRequest,
      com.github.emansom.retrorcon.Response> getAlertHotelMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.HotelAlertRequest,
      com.github.emansom.retrorcon.Response> getAlertHotelMethod() {
    return getAlertHotelMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.HotelAlertRequest,
      com.github.emansom.retrorcon.Response> getAlertHotelMethodHelper() {
    io.grpc.MethodDescriptor<com.github.emansom.retrorcon.HotelAlertRequest, com.github.emansom.retrorcon.Response> getAlertHotelMethod;
    if ((getAlertHotelMethod = RconGrpc.getAlertHotelMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getAlertHotelMethod = RconGrpc.getAlertHotelMethod) == null) {
          RconGrpc.getAlertHotelMethod = getAlertHotelMethod = 
              io.grpc.MethodDescriptor.<com.github.emansom.retrorcon.HotelAlertRequest, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "AlertHotel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.HotelAlertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("AlertHotel"))
                  .build();
          }
        }
     }
     return getAlertHotelMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getIsUserOnlineMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UserOnlineRequest,
      com.github.emansom.retrorcon.UserOnlineResponse> METHOD_IS_USER_ONLINE = getIsUserOnlineMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UserOnlineRequest,
      com.github.emansom.retrorcon.UserOnlineResponse> getIsUserOnlineMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UserOnlineRequest,
      com.github.emansom.retrorcon.UserOnlineResponse> getIsUserOnlineMethod() {
    return getIsUserOnlineMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UserOnlineRequest,
      com.github.emansom.retrorcon.UserOnlineResponse> getIsUserOnlineMethodHelper() {
    io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UserOnlineRequest, com.github.emansom.retrorcon.UserOnlineResponse> getIsUserOnlineMethod;
    if ((getIsUserOnlineMethod = RconGrpc.getIsUserOnlineMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getIsUserOnlineMethod = RconGrpc.getIsUserOnlineMethod) == null) {
          RconGrpc.getIsUserOnlineMethod = getIsUserOnlineMethod = 
              io.grpc.MethodDescriptor.<com.github.emansom.retrorcon.UserOnlineRequest, com.github.emansom.retrorcon.UserOnlineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "IsUserOnline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.UserOnlineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.UserOnlineResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("IsUserOnline"))
                  .build();
          }
        }
     }
     return getIsUserOnlineMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getChangeRoomMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.github.emansom.retrorcon.Room,
      com.github.emansom.retrorcon.Response> METHOD_CHANGE_ROOM = getChangeRoomMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.github.emansom.retrorcon.Room,
      com.github.emansom.retrorcon.Response> getChangeRoomMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.Room,
      com.github.emansom.retrorcon.Response> getChangeRoomMethod() {
    return getChangeRoomMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.Room,
      com.github.emansom.retrorcon.Response> getChangeRoomMethodHelper() {
    io.grpc.MethodDescriptor<com.github.emansom.retrorcon.Room, com.github.emansom.retrorcon.Response> getChangeRoomMethod;
    if ((getChangeRoomMethod = RconGrpc.getChangeRoomMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getChangeRoomMethod = RconGrpc.getChangeRoomMethod) == null) {
          RconGrpc.getChangeRoomMethod = getChangeRoomMethod = 
              io.grpc.MethodDescriptor.<com.github.emansom.retrorcon.Room, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "ChangeRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Room.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("ChangeRoom"))
                  .build();
          }
        }
     }
     return getChangeRoomMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getChangeUserMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.github.emansom.retrorcon.User,
      com.github.emansom.retrorcon.Response> METHOD_CHANGE_USER = getChangeUserMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.github.emansom.retrorcon.User,
      com.github.emansom.retrorcon.Response> getChangeUserMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.User,
      com.github.emansom.retrorcon.Response> getChangeUserMethod() {
    return getChangeUserMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.User,
      com.github.emansom.retrorcon.Response> getChangeUserMethodHelper() {
    io.grpc.MethodDescriptor<com.github.emansom.retrorcon.User, com.github.emansom.retrorcon.Response> getChangeUserMethod;
    if ((getChangeUserMethod = RconGrpc.getChangeUserMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getChangeUserMethod = RconGrpc.getChangeUserMethod) == null) {
          RconGrpc.getChangeUserMethod = getChangeUserMethod = 
              io.grpc.MethodDescriptor.<com.github.emansom.retrorcon.User, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "ChangeUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("ChangeUser"))
                  .build();
          }
        }
     }
     return getChangeUserMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBanMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.github.emansom.retrorcon.BanRequest,
      com.github.emansom.retrorcon.Response> METHOD_BAN = getBanMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.github.emansom.retrorcon.BanRequest,
      com.github.emansom.retrorcon.Response> getBanMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.BanRequest,
      com.github.emansom.retrorcon.Response> getBanMethod() {
    return getBanMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.BanRequest,
      com.github.emansom.retrorcon.Response> getBanMethodHelper() {
    io.grpc.MethodDescriptor<com.github.emansom.retrorcon.BanRequest, com.github.emansom.retrorcon.Response> getBanMethod;
    if ((getBanMethod = RconGrpc.getBanMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getBanMethod = RconGrpc.getBanMethod) == null) {
          RconGrpc.getBanMethod = getBanMethod = 
              io.grpc.MethodDescriptor.<com.github.emansom.retrorcon.BanRequest, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "Ban"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.BanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("Ban"))
                  .build();
          }
        }
     }
     return getBanMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUnbanMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UnbanRequest,
      com.github.emansom.retrorcon.Response> METHOD_UNBAN = getUnbanMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UnbanRequest,
      com.github.emansom.retrorcon.Response> getUnbanMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UnbanRequest,
      com.github.emansom.retrorcon.Response> getUnbanMethod() {
    return getUnbanMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UnbanRequest,
      com.github.emansom.retrorcon.Response> getUnbanMethodHelper() {
    io.grpc.MethodDescriptor<com.github.emansom.retrorcon.UnbanRequest, com.github.emansom.retrorcon.Response> getUnbanMethod;
    if ((getUnbanMethod = RconGrpc.getUnbanMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getUnbanMethod = RconGrpc.getUnbanMethod) == null) {
          RconGrpc.getUnbanMethod = getUnbanMethod = 
              io.grpc.MethodDescriptor.<com.github.emansom.retrorcon.UnbanRequest, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "Unban"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.UnbanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("Unban"))
                  .build();
          }
        }
     }
     return getUnbanMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateStarterRoomMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.github.emansom.retrorcon.StarterRoomRequest,
      com.github.emansom.retrorcon.Response> METHOD_CREATE_STARTER_ROOM = getCreateStarterRoomMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.github.emansom.retrorcon.StarterRoomRequest,
      com.github.emansom.retrorcon.Response> getCreateStarterRoomMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.StarterRoomRequest,
      com.github.emansom.retrorcon.Response> getCreateStarterRoomMethod() {
    return getCreateStarterRoomMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.github.emansom.retrorcon.StarterRoomRequest,
      com.github.emansom.retrorcon.Response> getCreateStarterRoomMethodHelper() {
    io.grpc.MethodDescriptor<com.github.emansom.retrorcon.StarterRoomRequest, com.github.emansom.retrorcon.Response> getCreateStarterRoomMethod;
    if ((getCreateStarterRoomMethod = RconGrpc.getCreateStarterRoomMethod) == null) {
      synchronized (RconGrpc.class) {
        if ((getCreateStarterRoomMethod = RconGrpc.getCreateStarterRoomMethod) == null) {
          RconGrpc.getCreateStarterRoomMethod = getCreateStarterRoomMethod = 
              io.grpc.MethodDescriptor.<com.github.emansom.retrorcon.StarterRoomRequest, com.github.emansom.retrorcon.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RetroRCON.Rcon", "CreateStarterRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.StarterRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.emansom.retrorcon.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new RconMethodDescriptorSupplier("CreateStarterRoom"))
                  .build();
          }
        }
     }
     return getCreateStarterRoomMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RconStub newStub(io.grpc.Channel channel) {
    return new RconStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RconBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RconBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RconFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RconFutureStub(channel);
  }

  /**
   */
  public static abstract class RconImplBase implements io.grpc.BindableService {

    /**
     */
    public void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethodHelper(), responseObserver);
    }

    /**
     */
    public void getOnlineCount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.OnlineCountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOnlineCountMethodHelper(), responseObserver);
    }

    /**
     */
    public void refreshAppearance(com.github.emansom.retrorcon.RefreshAppearanceRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRefreshAppearanceMethodHelper(), responseObserver);
    }

    /**
     */
    public void refreshBadges(com.github.emansom.retrorcon.RefreshBadgesRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRefreshBadgesMethodHelper(), responseObserver);
    }

    /**
     */
    public void refreshEvents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRefreshEventsMethodHelper(), responseObserver);
    }

    /**
     */
    public void refreshCatalogue(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRefreshCatalogueMethodHelper(), responseObserver);
    }

    /**
     */
    public void openInfobus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getOpenInfobusMethodHelper(), responseObserver);
    }

    /**
     */
    public void closeInfobus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseInfobusMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * TODO: Alert function with enum type
     * </pre>
     */
    public void alertRoom(com.github.emansom.retrorcon.RoomAlertRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAlertRoomMethodHelper(), responseObserver);
    }

    /**
     */
    public void alertUser(com.github.emansom.retrorcon.UserAlertRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAlertUserMethodHelper(), responseObserver);
    }

    /**
     */
    public void alertHotel(com.github.emansom.retrorcon.HotelAlertRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAlertHotelMethodHelper(), responseObserver);
    }

    /**
     */
    public void isUserOnline(com.github.emansom.retrorcon.UserOnlineRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.UserOnlineResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIsUserOnlineMethodHelper(), responseObserver);
    }

    /**
     */
    public void changeRoom(com.github.emansom.retrorcon.Room request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeRoomMethodHelper(), responseObserver);
    }

    /**
     */
    public void changeUser(com.github.emansom.retrorcon.User request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeUserMethodHelper(), responseObserver);
    }

    /**
     */
    public void ban(com.github.emansom.retrorcon.BanRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getBanMethodHelper(), responseObserver);
    }

    /**
     */
    public void unban(com.github.emansom.retrorcon.UnbanRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUnbanMethodHelper(), responseObserver);
    }

    /**
     */
    public void createStarterRoom(com.github.emansom.retrorcon.StarterRoomRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateStarterRoomMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_PING)))
          .addMethod(
            getGetOnlineCountMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.github.emansom.retrorcon.OnlineCountResponse>(
                  this, METHODID_GET_ONLINE_COUNT)))
          .addMethod(
            getRefreshAppearanceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.emansom.retrorcon.RefreshAppearanceRequest,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_REFRESH_APPEARANCE)))
          .addMethod(
            getRefreshBadgesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.emansom.retrorcon.RefreshBadgesRequest,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_REFRESH_BADGES)))
          .addMethod(
            getRefreshEventsMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_REFRESH_EVENTS)))
          .addMethod(
            getRefreshCatalogueMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_REFRESH_CATALOGUE)))
          .addMethod(
            getOpenInfobusMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_OPEN_INFOBUS)))
          .addMethod(
            getCloseInfobusMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_CLOSE_INFOBUS)))
          .addMethod(
            getAlertRoomMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.emansom.retrorcon.RoomAlertRequest,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_ALERT_ROOM)))
          .addMethod(
            getAlertUserMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.emansom.retrorcon.UserAlertRequest,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_ALERT_USER)))
          .addMethod(
            getAlertHotelMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.emansom.retrorcon.HotelAlertRequest,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_ALERT_HOTEL)))
          .addMethod(
            getIsUserOnlineMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.emansom.retrorcon.UserOnlineRequest,
                com.github.emansom.retrorcon.UserOnlineResponse>(
                  this, METHODID_IS_USER_ONLINE)))
          .addMethod(
            getChangeRoomMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.emansom.retrorcon.Room,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_CHANGE_ROOM)))
          .addMethod(
            getChangeUserMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.emansom.retrorcon.User,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_CHANGE_USER)))
          .addMethod(
            getBanMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.emansom.retrorcon.BanRequest,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_BAN)))
          .addMethod(
            getUnbanMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.emansom.retrorcon.UnbanRequest,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_UNBAN)))
          .addMethod(
            getCreateStarterRoomMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.github.emansom.retrorcon.StarterRoomRequest,
                com.github.emansom.retrorcon.Response>(
                  this, METHODID_CREATE_STARTER_ROOM)))
          .build();
    }
  }

  /**
   */
  public static final class RconStub extends io.grpc.stub.AbstractStub<RconStub> {
    private RconStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RconStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RconStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RconStub(channel, callOptions);
    }

    /**
     */
    public void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOnlineCount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.OnlineCountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOnlineCountMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void refreshAppearance(com.github.emansom.retrorcon.RefreshAppearanceRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRefreshAppearanceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void refreshBadges(com.github.emansom.retrorcon.RefreshBadgesRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRefreshBadgesMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void refreshEvents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRefreshEventsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void refreshCatalogue(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRefreshCatalogueMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void openInfobus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOpenInfobusMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeInfobus(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseInfobusMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO: Alert function with enum type
     * </pre>
     */
    public void alertRoom(com.github.emansom.retrorcon.RoomAlertRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAlertRoomMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void alertUser(com.github.emansom.retrorcon.UserAlertRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAlertUserMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void alertHotel(com.github.emansom.retrorcon.HotelAlertRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAlertHotelMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isUserOnline(com.github.emansom.retrorcon.UserOnlineRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.UserOnlineResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsUserOnlineMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeRoom(com.github.emansom.retrorcon.Room request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeRoomMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeUser(com.github.emansom.retrorcon.User request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeUserMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ban(com.github.emansom.retrorcon.BanRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBanMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unban(com.github.emansom.retrorcon.UnbanRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnbanMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createStarterRoom(com.github.emansom.retrorcon.StarterRoomRequest request,
        io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateStarterRoomMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RconBlockingStub extends io.grpc.stub.AbstractStub<RconBlockingStub> {
    private RconBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RconBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RconBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RconBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.emansom.retrorcon.Response ping(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getPingMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.OnlineCountResponse getOnlineCount(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetOnlineCountMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.Response refreshAppearance(com.github.emansom.retrorcon.RefreshAppearanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getRefreshAppearanceMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.Response refreshBadges(com.github.emansom.retrorcon.RefreshBadgesRequest request) {
      return blockingUnaryCall(
          getChannel(), getRefreshBadgesMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.Response refreshEvents(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getRefreshEventsMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.Response refreshCatalogue(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getRefreshCatalogueMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.Response openInfobus(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getOpenInfobusMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.Response closeInfobus(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getCloseInfobusMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO: Alert function with enum type
     * </pre>
     */
    public com.github.emansom.retrorcon.Response alertRoom(com.github.emansom.retrorcon.RoomAlertRequest request) {
      return blockingUnaryCall(
          getChannel(), getAlertRoomMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.Response alertUser(com.github.emansom.retrorcon.UserAlertRequest request) {
      return blockingUnaryCall(
          getChannel(), getAlertUserMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.Response alertHotel(com.github.emansom.retrorcon.HotelAlertRequest request) {
      return blockingUnaryCall(
          getChannel(), getAlertHotelMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.UserOnlineResponse isUserOnline(com.github.emansom.retrorcon.UserOnlineRequest request) {
      return blockingUnaryCall(
          getChannel(), getIsUserOnlineMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.Response changeRoom(com.github.emansom.retrorcon.Room request) {
      return blockingUnaryCall(
          getChannel(), getChangeRoomMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.Response changeUser(com.github.emansom.retrorcon.User request) {
      return blockingUnaryCall(
          getChannel(), getChangeUserMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.Response ban(com.github.emansom.retrorcon.BanRequest request) {
      return blockingUnaryCall(
          getChannel(), getBanMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.Response unban(com.github.emansom.retrorcon.UnbanRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnbanMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.github.emansom.retrorcon.Response createStarterRoom(com.github.emansom.retrorcon.StarterRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateStarterRoomMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RconFutureStub extends io.grpc.stub.AbstractStub<RconFutureStub> {
    private RconFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RconFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RconFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RconFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> ping(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.OnlineCountResponse> getOnlineCount(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOnlineCountMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> refreshAppearance(
        com.github.emansom.retrorcon.RefreshAppearanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRefreshAppearanceMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> refreshBadges(
        com.github.emansom.retrorcon.RefreshBadgesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRefreshBadgesMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> refreshEvents(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getRefreshEventsMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> refreshCatalogue(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getRefreshCatalogueMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> openInfobus(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getOpenInfobusMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> closeInfobus(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseInfobusMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO: Alert function with enum type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> alertRoom(
        com.github.emansom.retrorcon.RoomAlertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAlertRoomMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> alertUser(
        com.github.emansom.retrorcon.UserAlertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAlertUserMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> alertHotel(
        com.github.emansom.retrorcon.HotelAlertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAlertHotelMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.UserOnlineResponse> isUserOnline(
        com.github.emansom.retrorcon.UserOnlineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIsUserOnlineMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> changeRoom(
        com.github.emansom.retrorcon.Room request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeRoomMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> changeUser(
        com.github.emansom.retrorcon.User request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeUserMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> ban(
        com.github.emansom.retrorcon.BanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBanMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> unban(
        com.github.emansom.retrorcon.UnbanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnbanMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.emansom.retrorcon.Response> createStarterRoom(
        com.github.emansom.retrorcon.StarterRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateStarterRoomMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_GET_ONLINE_COUNT = 1;
  private static final int METHODID_REFRESH_APPEARANCE = 2;
  private static final int METHODID_REFRESH_BADGES = 3;
  private static final int METHODID_REFRESH_EVENTS = 4;
  private static final int METHODID_REFRESH_CATALOGUE = 5;
  private static final int METHODID_OPEN_INFOBUS = 6;
  private static final int METHODID_CLOSE_INFOBUS = 7;
  private static final int METHODID_ALERT_ROOM = 8;
  private static final int METHODID_ALERT_USER = 9;
  private static final int METHODID_ALERT_HOTEL = 10;
  private static final int METHODID_IS_USER_ONLINE = 11;
  private static final int METHODID_CHANGE_ROOM = 12;
  private static final int METHODID_CHANGE_USER = 13;
  private static final int METHODID_BAN = 14;
  private static final int METHODID_UNBAN = 15;
  private static final int METHODID_CREATE_STARTER_ROOM = 16;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RconImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RconImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
          break;
        case METHODID_GET_ONLINE_COUNT:
          serviceImpl.getOnlineCount((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.OnlineCountResponse>) responseObserver);
          break;
        case METHODID_REFRESH_APPEARANCE:
          serviceImpl.refreshAppearance((com.github.emansom.retrorcon.RefreshAppearanceRequest) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
          break;
        case METHODID_REFRESH_BADGES:
          serviceImpl.refreshBadges((com.github.emansom.retrorcon.RefreshBadgesRequest) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
          break;
        case METHODID_REFRESH_EVENTS:
          serviceImpl.refreshEvents((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
          break;
        case METHODID_REFRESH_CATALOGUE:
          serviceImpl.refreshCatalogue((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
          break;
        case METHODID_OPEN_INFOBUS:
          serviceImpl.openInfobus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
          break;
        case METHODID_CLOSE_INFOBUS:
          serviceImpl.closeInfobus((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
          break;
        case METHODID_ALERT_ROOM:
          serviceImpl.alertRoom((com.github.emansom.retrorcon.RoomAlertRequest) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
          break;
        case METHODID_ALERT_USER:
          serviceImpl.alertUser((com.github.emansom.retrorcon.UserAlertRequest) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
          break;
        case METHODID_ALERT_HOTEL:
          serviceImpl.alertHotel((com.github.emansom.retrorcon.HotelAlertRequest) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
          break;
        case METHODID_IS_USER_ONLINE:
          serviceImpl.isUserOnline((com.github.emansom.retrorcon.UserOnlineRequest) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.UserOnlineResponse>) responseObserver);
          break;
        case METHODID_CHANGE_ROOM:
          serviceImpl.changeRoom((com.github.emansom.retrorcon.Room) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
          break;
        case METHODID_CHANGE_USER:
          serviceImpl.changeUser((com.github.emansom.retrorcon.User) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
          break;
        case METHODID_BAN:
          serviceImpl.ban((com.github.emansom.retrorcon.BanRequest) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
          break;
        case METHODID_UNBAN:
          serviceImpl.unban((com.github.emansom.retrorcon.UnbanRequest) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
          break;
        case METHODID_CREATE_STARTER_ROOM:
          serviceImpl.createStarterRoom((com.github.emansom.retrorcon.StarterRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.github.emansom.retrorcon.Response>) responseObserver);
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

  private static abstract class RconBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RconBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.emansom.retrorcon.RconProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Rcon");
    }
  }

  private static final class RconFileDescriptorSupplier
      extends RconBaseDescriptorSupplier {
    RconFileDescriptorSupplier() {}
  }

  private static final class RconMethodDescriptorSupplier
      extends RconBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RconMethodDescriptorSupplier(String methodName) {
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
      synchronized (RconGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RconFileDescriptorSupplier())
              .addMethod(getPingMethodHelper())
              .addMethod(getGetOnlineCountMethodHelper())
              .addMethod(getRefreshAppearanceMethodHelper())
              .addMethod(getRefreshBadgesMethodHelper())
              .addMethod(getRefreshEventsMethodHelper())
              .addMethod(getRefreshCatalogueMethodHelper())
              .addMethod(getOpenInfobusMethodHelper())
              .addMethod(getCloseInfobusMethodHelper())
              .addMethod(getAlertRoomMethodHelper())
              .addMethod(getAlertUserMethodHelper())
              .addMethod(getAlertHotelMethodHelper())
              .addMethod(getIsUserOnlineMethodHelper())
              .addMethod(getChangeRoomMethodHelper())
              .addMethod(getChangeUserMethodHelper())
              .addMethod(getBanMethodHelper())
              .addMethod(getUnbanMethodHelper())
              .addMethod(getCreateStarterRoomMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
