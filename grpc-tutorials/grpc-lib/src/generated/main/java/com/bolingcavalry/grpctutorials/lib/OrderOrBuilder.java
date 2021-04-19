// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mall.proto

package com.bolingcavalry.grpctutorials.lib;

public interface OrderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Order)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 订单ID
   * </pre>
   *
   * <code>int32 orderId = 1;</code>
   * @return The orderId.
   */
  int getOrderId();

  /**
   * <pre>
   * 商品ID
   * </pre>
   *
   * <code>int32 productId = 2;</code>
   * @return The productId.
   */
  int getProductId();

  /**
   * <pre>
   * 交易时间
   * </pre>
   *
   * <code>int64 orderTime = 3;</code>
   * @return The orderTime.
   */
  long getOrderTime();

  /**
   * <pre>
   * 买家备注
   * </pre>
   *
   * <code>string buyerRemark = 4;</code>
   * @return The buyerRemark.
   */
  java.lang.String getBuyerRemark();
  /**
   * <pre>
   * 买家备注
   * </pre>
   *
   * <code>string buyerRemark = 4;</code>
   * @return The bytes for buyerRemark.
   */
  com.google.protobuf.ByteString
      getBuyerRemarkBytes();
}
