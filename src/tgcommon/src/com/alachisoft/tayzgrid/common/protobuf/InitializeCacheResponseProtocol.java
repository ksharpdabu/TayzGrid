// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InitializeCacheResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class InitializeCacheResponseProtocol {
  private InitializeCacheResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class InitializeCacheResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use InitializeCacheResponse.newBuilder() to construct.
    private InitializeCacheResponse() {
      initFields();
    }
    private InitializeCacheResponse(boolean noInit) {}
    
    private static final InitializeCacheResponse defaultInstance;
    public static InitializeCacheResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public InitializeCacheResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_InitializeCacheResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_InitializeCacheResponse_fieldAccessorTable;
    }
    
    // optional string cacheType = 1;
    public static final int CACHETYPE_FIELD_NUMBER = 1;
    private boolean hasCacheType;
    private java.lang.String cacheType_ = "";
    public boolean hasCacheType() { return hasCacheType; }
    public java.lang.String getCacheType() { return cacheType_; }
    
    // optional string targetCacheUniqueID = 2;
    public static final int TARGETCACHEUNIQUEID_FIELD_NUMBER = 2;
    private boolean hasTargetCacheUniqueID;
    private java.lang.String targetCacheUniqueID_ = "";
    public boolean hasTargetCacheUniqueID() { return hasTargetCacheUniqueID; }
    public java.lang.String getTargetCacheUniqueID() { return targetCacheUniqueID_; }
    
    // optional bool isPersistenceEnabled = 3;
    public static final int ISPERSISTENCEENABLED_FIELD_NUMBER = 3;
    private boolean hasIsPersistenceEnabled;
    private boolean isPersistenceEnabled_ = false;
    public boolean hasIsPersistenceEnabled() { return hasIsPersistenceEnabled; }
    public boolean getIsPersistenceEnabled() { return isPersistenceEnabled_; }
    
    // optional int32 persistenceInterval = 4;
    public static final int PERSISTENCEINTERVAL_FIELD_NUMBER = 4;
    private boolean hasPersistenceInterval;
    private int persistenceInterval_ = 0;
    public boolean hasPersistenceInterval() { return hasPersistenceInterval; }
    public int getPersistenceInterval() { return persistenceInterval_; }
    
    // optional bool isShutDownProcessEnabled = 5;
    public static final int ISSHUTDOWNPROCESSENABLED_FIELD_NUMBER = 5;
    private boolean hasIsShutDownProcessEnabled;
    private boolean isShutDownProcessEnabled_ = false;
    public boolean hasIsShutDownProcessEnabled() { return hasIsShutDownProcessEnabled; }
    public boolean getIsShutDownProcessEnabled() { return isShutDownProcessEnabled_; }
    
    // repeated .com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfo shutDownServerInfo = 6;
    public static final int SHUTDOWNSERVERINFO_FIELD_NUMBER = 6;
    private java.util.List<com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo> shutDownServerInfo_ =
      java.util.Collections.emptyList();
    public java.util.List<com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo> getShutDownServerInfoList() {
      return shutDownServerInfo_;
    }
    public int getShutDownServerInfoCount() { return shutDownServerInfo_.size(); }
    public com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo getShutDownServerInfo(int index) {
      return shutDownServerInfo_.get(index);
    }
    
    // optional int32 expirationType = 7;
    public static final int EXPIRATIONTYPE_FIELD_NUMBER = 7;
    private boolean hasExpirationType;
    private int expirationType_ = 0;
    public boolean hasExpirationType() { return hasExpirationType; }
    public int getExpirationType() { return expirationType_; }
    
    // optional int64 duration = 8;
    public static final int DURATION_FIELD_NUMBER = 8;
    private boolean hasDuration;
    private long duration_ = 0L;
    public boolean hasDuration() { return hasDuration; }
    public long getDuration() { return duration_; }
    
    // optional int32 expirationUnit = 9;
    public static final int EXPIRATIONUNIT_FIELD_NUMBER = 9;
    private boolean hasExpirationUnit;
    private int expirationUnit_ = 0;
    public boolean hasExpirationUnit() { return hasExpirationUnit; }
    public int getExpirationUnit() { return expirationUnit_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasCacheType()) {
        output.writeString(1, getCacheType());
      }
      if (hasTargetCacheUniqueID()) {
        output.writeString(2, getTargetCacheUniqueID());
      }
      if (hasIsPersistenceEnabled()) {
        output.writeBool(3, getIsPersistenceEnabled());
      }
      if (hasPersistenceInterval()) {
        output.writeInt32(4, getPersistenceInterval());
      }
      if (hasIsShutDownProcessEnabled()) {
        output.writeBool(5, getIsShutDownProcessEnabled());
      }
      for (com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo element : getShutDownServerInfoList()) {
        output.writeMessage(6, element);
      }
      if (hasExpirationType()) {
        output.writeInt32(7, getExpirationType());
      }
      if (hasDuration()) {
        output.writeInt64(8, getDuration());
      }
      if (hasExpirationUnit()) {
        output.writeInt32(9, getExpirationUnit());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasCacheType()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getCacheType());
      }
      if (hasTargetCacheUniqueID()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getTargetCacheUniqueID());
      }
      if (hasIsPersistenceEnabled()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, getIsPersistenceEnabled());
      }
      if (hasPersistenceInterval()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, getPersistenceInterval());
      }
      if (hasIsShutDownProcessEnabled()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, getIsShutDownProcessEnabled());
      }
      for (com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo element : getShutDownServerInfoList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, element);
      }
      if (hasExpirationType()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, getExpirationType());
      }
      if (hasDuration()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(8, getDuration());
      }
      if (hasExpirationUnit()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, getExpirationUnit());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.shutDownServerInfo_ != java.util.Collections.EMPTY_LIST) {
          result.shutDownServerInfo_ =
            java.util.Collections.unmodifiableList(result.shutDownServerInfo_);
        }
        com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse.getDefaultInstance()) return this;
        if (other.hasCacheType()) {
          setCacheType(other.getCacheType());
        }
        if (other.hasTargetCacheUniqueID()) {
          setTargetCacheUniqueID(other.getTargetCacheUniqueID());
        }
        if (other.hasIsPersistenceEnabled()) {
          setIsPersistenceEnabled(other.getIsPersistenceEnabled());
        }
        if (other.hasPersistenceInterval()) {
          setPersistenceInterval(other.getPersistenceInterval());
        }
        if (other.hasIsShutDownProcessEnabled()) {
          setIsShutDownProcessEnabled(other.getIsShutDownProcessEnabled());
        }
        if (!other.shutDownServerInfo_.isEmpty()) {
          if (result.shutDownServerInfo_.isEmpty()) {
            result.shutDownServerInfo_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo>();
          }
          result.shutDownServerInfo_.addAll(other.shutDownServerInfo_);
        }
        if (other.hasExpirationType()) {
          setExpirationType(other.getExpirationType());
        }
        if (other.hasDuration()) {
          setDuration(other.getDuration());
        }
        if (other.hasExpirationUnit()) {
          setExpirationUnit(other.getExpirationUnit());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setCacheType(input.readString());
              break;
            }
            case 18: {
              setTargetCacheUniqueID(input.readString());
              break;
            }
            case 24: {
              setIsPersistenceEnabled(input.readBool());
              break;
            }
            case 32: {
              setPersistenceInterval(input.readInt32());
              break;
            }
            case 40: {
              setIsShutDownProcessEnabled(input.readBool());
              break;
            }
            case 50: {
              com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addShutDownServerInfo(subBuilder.buildPartial());
              break;
            }
            case 56: {
              setExpirationType(input.readInt32());
              break;
            }
            case 64: {
              setDuration(input.readInt64());
              break;
            }
            case 72: {
              setExpirationUnit(input.readInt32());
              break;
            }
          }
        }
      }
      
      
      // optional string cacheType = 1;
      public boolean hasCacheType() {
        return result.hasCacheType();
      }
      public java.lang.String getCacheType() {
        return result.getCacheType();
      }
      public Builder setCacheType(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasCacheType = true;
        result.cacheType_ = value;
        return this;
      }
      public Builder clearCacheType() {
        result.hasCacheType = false;
        result.cacheType_ = getDefaultInstance().getCacheType();
        return this;
      }
      
      // optional string targetCacheUniqueID = 2;
      public boolean hasTargetCacheUniqueID() {
        return result.hasTargetCacheUniqueID();
      }
      public java.lang.String getTargetCacheUniqueID() {
        return result.getTargetCacheUniqueID();
      }
      public Builder setTargetCacheUniqueID(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasTargetCacheUniqueID = true;
        result.targetCacheUniqueID_ = value;
        return this;
      }
      public Builder clearTargetCacheUniqueID() {
        result.hasTargetCacheUniqueID = false;
        result.targetCacheUniqueID_ = getDefaultInstance().getTargetCacheUniqueID();
        return this;
      }
      
      // optional bool isPersistenceEnabled = 3;
      public boolean hasIsPersistenceEnabled() {
        return result.hasIsPersistenceEnabled();
      }
      public boolean getIsPersistenceEnabled() {
        return result.getIsPersistenceEnabled();
      }
      public Builder setIsPersistenceEnabled(boolean value) {
        result.hasIsPersistenceEnabled = true;
        result.isPersistenceEnabled_ = value;
        return this;
      }
      public Builder clearIsPersistenceEnabled() {
        result.hasIsPersistenceEnabled = false;
        result.isPersistenceEnabled_ = false;
        return this;
      }
      
      // optional int32 persistenceInterval = 4;
      public boolean hasPersistenceInterval() {
        return result.hasPersistenceInterval();
      }
      public int getPersistenceInterval() {
        return result.getPersistenceInterval();
      }
      public Builder setPersistenceInterval(int value) {
        result.hasPersistenceInterval = true;
        result.persistenceInterval_ = value;
        return this;
      }
      public Builder clearPersistenceInterval() {
        result.hasPersistenceInterval = false;
        result.persistenceInterval_ = 0;
        return this;
      }
      
      // optional bool isShutDownProcessEnabled = 5;
      public boolean hasIsShutDownProcessEnabled() {
        return result.hasIsShutDownProcessEnabled();
      }
      public boolean getIsShutDownProcessEnabled() {
        return result.getIsShutDownProcessEnabled();
      }
      public Builder setIsShutDownProcessEnabled(boolean value) {
        result.hasIsShutDownProcessEnabled = true;
        result.isShutDownProcessEnabled_ = value;
        return this;
      }
      public Builder clearIsShutDownProcessEnabled() {
        result.hasIsShutDownProcessEnabled = false;
        result.isShutDownProcessEnabled_ = false;
        return this;
      }
      
      // repeated .com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfo shutDownServerInfo = 6;
      public java.util.List<com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo> getShutDownServerInfoList() {
        return java.util.Collections.unmodifiableList(result.shutDownServerInfo_);
      }
      public int getShutDownServerInfoCount() {
        return result.getShutDownServerInfoCount();
      }
      public com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo getShutDownServerInfo(int index) {
        return result.getShutDownServerInfo(index);
      }
      public Builder setShutDownServerInfo(int index, com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.shutDownServerInfo_.set(index, value);
        return this;
      }
      public Builder setShutDownServerInfo(int index, com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo.Builder builderForValue) {
        result.shutDownServerInfo_.set(index, builderForValue.build());
        return this;
      }
      public Builder addShutDownServerInfo(com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.shutDownServerInfo_.isEmpty()) {
          result.shutDownServerInfo_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo>();
        }
        result.shutDownServerInfo_.add(value);
        return this;
      }
      public Builder addShutDownServerInfo(com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo.Builder builderForValue) {
        if (result.shutDownServerInfo_.isEmpty()) {
          result.shutDownServerInfo_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo>();
        }
        result.shutDownServerInfo_.add(builderForValue.build());
        return this;
      }
      public Builder addAllShutDownServerInfo(
          java.lang.Iterable<? extends com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo> values) {
        if (result.shutDownServerInfo_.isEmpty()) {
          result.shutDownServerInfo_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.ShutDownServerInfo>();
        }
        super.addAll(values, result.shutDownServerInfo_);
        return this;
      }
      public Builder clearShutDownServerInfo() {
        result.shutDownServerInfo_ = java.util.Collections.emptyList();
        return this;
      }
      
      // optional int32 expirationType = 7;
      public boolean hasExpirationType() {
        return result.hasExpirationType();
      }
      public int getExpirationType() {
        return result.getExpirationType();
      }
      public Builder setExpirationType(int value) {
        result.hasExpirationType = true;
        result.expirationType_ = value;
        return this;
      }
      public Builder clearExpirationType() {
        result.hasExpirationType = false;
        result.expirationType_ = 0;
        return this;
      }
      
      // optional int64 duration = 8;
      public boolean hasDuration() {
        return result.hasDuration();
      }
      public long getDuration() {
        return result.getDuration();
      }
      public Builder setDuration(long value) {
        result.hasDuration = true;
        result.duration_ = value;
        return this;
      }
      public Builder clearDuration() {
        result.hasDuration = false;
        result.duration_ = 0L;
        return this;
      }
      
      // optional int32 expirationUnit = 9;
      public boolean hasExpirationUnit() {
        return result.hasExpirationUnit();
      }
      public int getExpirationUnit() {
        return result.getExpirationUnit();
      }
      public Builder setExpirationUnit(int value) {
        result.hasExpirationUnit = true;
        result.expirationUnit_ = value;
        return this;
      }
      public Builder clearExpirationUnit() {
        result.hasExpirationUnit = false;
        result.expirationUnit_ = 0;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponse)
    }
    
    static {
      defaultInstance = new InitializeCacheResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_InitializeCacheResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_InitializeCacheResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035InitializeCacheResponse.proto\022\'com.ala" +
      "chisoft.tayzgrid.common.protobuf\032\030ShutDo" +
      "wnServerInfo.proto\"\301\002\n\027InitializeCacheRe" +
      "sponse\022\021\n\tcacheType\030\001 \001(\t\022\033\n\023targetCache" +
      "UniqueID\030\002 \001(\t\022\034\n\024isPersistenceEnabled\030\003" +
      " \001(\010\022\033\n\023persistenceInterval\030\004 \001(\005\022 \n\030isS" +
      "hutDownProcessEnabled\030\005 \001(\010\022W\n\022shutDownS" +
      "erverInfo\030\006 \003(\0132;.com.alachisoft.tayzgri" +
      "d.common.protobuf.ShutDownServerInfo\022\026\n\016" +
      "expirationType\030\007 \001(\005\022\020\n\010duration\030\010 \001(\003\022\026",
      "\n\016expirationUnit\030\t \001(\005B!B\037InitializeCach" +
      "eResponseProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_InitializeCacheResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_InitializeCacheResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_InitializeCacheResponse_descriptor,
              new java.lang.String[] { "CacheType", "TargetCacheUniqueID", "IsPersistenceEnabled", "PersistenceInterval", "IsShutDownProcessEnabled", "ShutDownServerInfo", "ExpirationType", "Duration", "ExpirationUnit", },
              com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.InitializeCacheResponseProtocol.InitializeCacheResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alachisoft.tayzgrid.common.protobuf.ShutDownServerInfoProtocol.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
