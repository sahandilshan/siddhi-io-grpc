/*
 * Copyright (c)  2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package io.siddhi.extension.io.grpc.proto;

/**
 * Protobuf type {@code RequestWithMap}
 */
public  final class RequestWithMap extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RequestWithMap)
        RequestWithMapOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestWithMap.newBuilder() to construct.
  private RequestWithMap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestWithMap() {
    stringValue_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RequestWithMap(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            String s = input.readStringRequireUtf8();

            stringValue_ = s;
            break;
          }
          case 16: {

            intValue_ = input.readInt32();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              map_ = com.google.protobuf.MapField.newMapField(
                  MapDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000004;
            }
            com.google.protobuf.MapEntry<String, String>
            map__ = input.readMessage(
                MapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            map_.getMutableMap().put(
                map__.getKey(), map__.getValue());
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.siddhi.extension.io.grpc.proto.Sample.internal_static_RequestWithMap_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetMap();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.siddhi.extension.io.grpc.proto.Sample.internal_static_RequestWithMap_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.siddhi.extension.io.grpc.proto.RequestWithMap.class, io.siddhi.extension.io.grpc.proto.RequestWithMap.Builder.class);
  }

  private int bitField0_;
  public static final int STRINGVALUE_FIELD_NUMBER = 1;
  private volatile Object stringValue_;
  /**
   * <code>string stringValue = 1;</code>
   */
  public String getStringValue() {
    Object ref = stringValue_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      stringValue_ = s;
      return s;
    }
  }
  /**
   * <code>string stringValue = 1;</code>
   */
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    Object ref = stringValue_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      stringValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTVALUE_FIELD_NUMBER = 2;
  private int intValue_;
  /**
   * <code>int32 intValue = 2;</code>
   */
  public int getIntValue() {
    return intValue_;
  }

  public static final int MAP_FIELD_NUMBER = 3;
  private static final class MapDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        String, String> defaultEntry =
            com.google.protobuf.MapEntry
            .<String, String>newDefaultInstance(
                io.siddhi.extension.io.grpc.proto.Sample.internal_static_RequestWithMap_MapEntry_descriptor,
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      String, String> map_;
  private com.google.protobuf.MapField<String, String>
  internalGetMap() {
    if (map_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          MapDefaultEntryHolder.defaultEntry);
    }
    return map_;
  }

  public int getMapCount() {
    return internalGetMap().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; map = 3;</code>
   */

  public boolean containsMap(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    return internalGetMap().getMap().containsKey(key);
  }
  /**
   * Use {@link #getMapMap()} instead.
   */
  @Deprecated
  public java.util.Map<String, String> getMap() {
    return getMapMap();
  }
  /**
   * <code>map&lt;string, string&gt; map = 3;</code>
   */

  public java.util.Map<String, String> getMapMap() {
    return internalGetMap().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; map = 3;</code>
   */

  public String getMapOrDefault(
      String key,
      String defaultValue) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, String> map =
        internalGetMap().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; map = 3;</code>
   */

  public String getMapOrThrow(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, String> map =
        internalGetMap().getMap();
    if (!map.containsKey(key)) {
      throw new IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getStringValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stringValue_);
    }
    if (intValue_ != 0) {
      output.writeInt32(2, intValue_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetMap(),
        MapDefaultEntryHolder.defaultEntry,
        3);
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getStringValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, stringValue_);
    }
    if (intValue_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, intValue_);
    }
    for (java.util.Map.Entry<String, String> entry
         : internalGetMap().getMap().entrySet()) {
      com.google.protobuf.MapEntry<String, String>
      map__ = MapDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, map__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.siddhi.extension.io.grpc.proto.RequestWithMap)) {
      return super.equals(obj);
    }
    io.siddhi.extension.io.grpc.proto.RequestWithMap other = (io.siddhi.extension.io.grpc.proto.RequestWithMap) obj;

    if (!getStringValue()
        .equals(other.getStringValue())) return false;
    if (getIntValue()
        != other.getIntValue()) return false;
    if (!internalGetMap().equals(
        other.internalGetMap())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STRINGVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getStringValue().hashCode();
    hash = (37 * hash) + INTVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getIntValue();
    if (!internalGetMap().getMap().isEmpty()) {
      hash = (37 * hash) + MAP_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMap().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.siddhi.extension.io.grpc.proto.RequestWithMap parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.siddhi.extension.io.grpc.proto.RequestWithMap parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.siddhi.extension.io.grpc.proto.RequestWithMap parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.siddhi.extension.io.grpc.proto.RequestWithMap parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.siddhi.extension.io.grpc.proto.RequestWithMap parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.siddhi.extension.io.grpc.proto.RequestWithMap parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.siddhi.extension.io.grpc.proto.RequestWithMap parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.siddhi.extension.io.grpc.proto.RequestWithMap parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.siddhi.extension.io.grpc.proto.RequestWithMap parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.siddhi.extension.io.grpc.proto.RequestWithMap parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.siddhi.extension.io.grpc.proto.RequestWithMap parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.siddhi.extension.io.grpc.proto.RequestWithMap parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.siddhi.extension.io.grpc.proto.RequestWithMap prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code RequestWithMap}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RequestWithMap)
      io.siddhi.extension.io.grpc.proto.RequestWithMapOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.siddhi.extension.io.grpc.proto.Sample.internal_static_RequestWithMap_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.siddhi.extension.io.grpc.proto.Sample.internal_static_RequestWithMap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.siddhi.extension.io.grpc.proto.RequestWithMap.class, io.siddhi.extension.io.grpc.proto.RequestWithMap.Builder.class);
    }

    // Construct using io.siddhi.extension.io.grpc.proto.RequestWithMap.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      stringValue_ = "";

      intValue_ = 0;

      internalGetMutableMap().clear();
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.siddhi.extension.io.grpc.proto.Sample.internal_static_RequestWithMap_descriptor;
    }

    @Override
    public io.siddhi.extension.io.grpc.proto.RequestWithMap getDefaultInstanceForType() {
      return io.siddhi.extension.io.grpc.proto.RequestWithMap.getDefaultInstance();
    }

    @Override
    public io.siddhi.extension.io.grpc.proto.RequestWithMap build() {
      io.siddhi.extension.io.grpc.proto.RequestWithMap result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public io.siddhi.extension.io.grpc.proto.RequestWithMap buildPartial() {
      io.siddhi.extension.io.grpc.proto.RequestWithMap result = new io.siddhi.extension.io.grpc.proto.RequestWithMap(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.stringValue_ = stringValue_;
      result.intValue_ = intValue_;
      result.map_ = internalGetMap();
      result.map_.makeImmutable();
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.siddhi.extension.io.grpc.proto.RequestWithMap) {
        return mergeFrom((io.siddhi.extension.io.grpc.proto.RequestWithMap)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.siddhi.extension.io.grpc.proto.RequestWithMap other) {
      if (other == io.siddhi.extension.io.grpc.proto.RequestWithMap.getDefaultInstance()) return this;
      if (!other.getStringValue().isEmpty()) {
        stringValue_ = other.stringValue_;
        onChanged();
      }
      if (other.getIntValue() != 0) {
        setIntValue(other.getIntValue());
      }
      internalGetMutableMap().mergeFrom(
          other.internalGetMap());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.siddhi.extension.io.grpc.proto.RequestWithMap parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.siddhi.extension.io.grpc.proto.RequestWithMap) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object stringValue_ = "";
    /**
     * <code>string stringValue = 1;</code>
     */
    public String getStringValue() {
      Object ref = stringValue_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        stringValue_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string stringValue = 1;</code>
     */
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      Object ref = stringValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        stringValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stringValue = 1;</code>
     */
    public Builder setStringValue(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      stringValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stringValue = 1;</code>
     */
    public Builder clearStringValue() {

      stringValue_ = getDefaultInstance().getStringValue();
      onChanged();
      return this;
    }
    /**
     * <code>string stringValue = 1;</code>
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      stringValue_ = value;
      onChanged();
      return this;
    }

    private int intValue_ ;
    /**
     * <code>int32 intValue = 2;</code>
     */
    public int getIntValue() {
      return intValue_;
    }
    /**
     * <code>int32 intValue = 2;</code>
     */
    public Builder setIntValue(int value) {

      intValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 intValue = 2;</code>
     */
    public Builder clearIntValue() {

      intValue_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        String, String> map_;
    private com.google.protobuf.MapField<String, String>
    internalGetMap() {
      if (map_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MapDefaultEntryHolder.defaultEntry);
      }
      return map_;
    }
    private com.google.protobuf.MapField<String, String>
    internalGetMutableMap() {
      onChanged();;
      if (map_ == null) {
        map_ = com.google.protobuf.MapField.newMapField(
            MapDefaultEntryHolder.defaultEntry);
      }
      if (!map_.isMutable()) {
        map_ = map_.copy();
      }
      return map_;
    }

    public int getMapCount() {
      return internalGetMap().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; map = 3;</code>
     */

    public boolean containsMap(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      return internalGetMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMapMap()} instead.
     */
    @Deprecated
    public java.util.Map<String, String> getMap() {
      return getMapMap();
    }
    /**
     * <code>map&lt;string, string&gt; map = 3;</code>
     */

    public java.util.Map<String, String> getMapMap() {
      return internalGetMap().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; map = 3;</code>
     */

    public String getMapOrDefault(
        String key,
        String defaultValue) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, String> map =
          internalGetMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; map = 3;</code>
     */

    public String getMapOrThrow(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, String> map =
          internalGetMap().getMap();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearMap() {
      internalGetMutableMap().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; map = 3;</code>
     */

    public Builder removeMap(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      internalGetMutableMap().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @Deprecated
    public java.util.Map<String, String>
    getMutableMap() {
      return internalGetMutableMap().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; map = 3;</code>
     */
    public Builder putMap(
        String key,
        String value) {
      if (key == null) { throw new NullPointerException(); }
      if (value == null) { throw new NullPointerException(); }
      internalGetMutableMap().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; map = 3;</code>
     */

    public Builder putAllMap(
        java.util.Map<String, String> values) {
      internalGetMutableMap().getMutableMap()
          .putAll(values);
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:RequestWithMap)
  }

  // @@protoc_insertion_point(class_scope:RequestWithMap)
  private static final io.siddhi.extension.io.grpc.proto.RequestWithMap DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.siddhi.extension.io.grpc.proto.RequestWithMap();
  }

  public static io.siddhi.extension.io.grpc.proto.RequestWithMap getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestWithMap>
      PARSER = new com.google.protobuf.AbstractParser<RequestWithMap>() {
    @Override
    public RequestWithMap parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestWithMap(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestWithMap> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<RequestWithMap> getParserForType() {
    return PARSER;
  }

  @Override
  public io.siddhi.extension.io.grpc.proto.RequestWithMap getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

