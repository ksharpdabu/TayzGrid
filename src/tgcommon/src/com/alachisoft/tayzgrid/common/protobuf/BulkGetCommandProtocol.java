// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BulkGetCommand.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class BulkGetCommandProtocol {
  private BulkGetCommandProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class BulkGetCommand extends
      com.google.protobuf.GeneratedMessage {
    // Use BulkGetCommand.newBuilder() to construct.
    private BulkGetCommand() {
      initFields();
    }
    private BulkGetCommand(boolean noInit) {}
    
    private static final BulkGetCommand defaultInstance;
    public static BulkGetCommand getDefaultInstance() {
      return defaultInstance;
    }
    
    public BulkGetCommand getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_BulkGetCommand_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_BulkGetCommand_fieldAccessorTable;
    }
    
    // repeated bytes keys = 1;
    public static final int KEYS_FIELD_NUMBER = 1;
    private java.util.List<com.google.protobuf.ByteString> keys_ =
      java.util.Collections.emptyList();
    public java.util.List<com.google.protobuf.ByteString> getKeysList() {
      return keys_;
    }
    public int getKeysCount() { return keys_.size(); }
    public com.google.protobuf.ByteString getKeys(int index) {
      return keys_.get(index);
    }
    
    // optional int64 requestId = 2;
    public static final int REQUESTID_FIELD_NUMBER = 2;
    private boolean hasRequestId;
    private long requestId_ = 0L;
    public boolean hasRequestId() { return hasRequestId; }
    public long getRequestId() { return requestId_; }
    
    // optional int32 flag = 3;
    public static final int FLAG_FIELD_NUMBER = 3;
    private boolean hasFlag;
    private int flag_ = 0;
    public boolean hasFlag() { return hasFlag; }
    public int getFlag() { return flag_; }
    
    // optional string providerName = 4;
    public static final int PROVIDERNAME_FIELD_NUMBER = 4;
    private boolean hasProviderName;
    private java.lang.String providerName_ = "";
    public boolean hasProviderName() { return hasProviderName; }
    public java.lang.String getProviderName() { return providerName_; }
    
    // optional bool isAsync = 5 [default = false];
    public static final int ISASYNC_FIELD_NUMBER = 5;
    private boolean hasIsAsync;
    private boolean isAsync_ = false;
    public boolean hasIsAsync() { return hasIsAsync; }
    public boolean getIsAsync() { return isAsync_; }
    
    // optional sint32 jCacheListenerId = 6 [default = -1];
    public static final int JCACHELISTENERID_FIELD_NUMBER = 6;
    private boolean hasJCacheListenerId;
    private int jCacheListenerId_ = -1;
    public boolean hasJCacheListenerId() { return hasJCacheListenerId; }
    public int getJCacheListenerId() { return jCacheListenerId_; }
    
    // optional bool replaceExistingValues = 7 [default = false];
    public static final int REPLACEEXISTINGVALUES_FIELD_NUMBER = 7;
    private boolean hasReplaceExistingValues;
    private boolean replaceExistingValues_ = false;
    public boolean hasReplaceExistingValues() { return hasReplaceExistingValues; }
    public boolean getReplaceExistingValues() { return replaceExistingValues_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (com.google.protobuf.ByteString element : getKeysList()) {
        output.writeBytes(1, element);
      }
      if (hasRequestId()) {
        output.writeInt64(2, getRequestId());
      }
      if (hasFlag()) {
        output.writeInt32(3, getFlag());
      }
      if (hasProviderName()) {
        output.writeString(4, getProviderName());
      }
      if (hasIsAsync()) {
        output.writeBool(5, getIsAsync());
      }
      if (hasJCacheListenerId()) {
        output.writeSInt32(6, getJCacheListenerId());
      }
      if (hasReplaceExistingValues()) {
        output.writeBool(7, getReplaceExistingValues());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      {
        int dataSize = 0;
        for (com.google.protobuf.ByteString element : getKeysList()) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(element);
        }
        size += dataSize;
        size += 1 * getKeysList().size();
      }
      if (hasRequestId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, getRequestId());
      }
      if (hasFlag()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, getFlag());
      }
      if (hasProviderName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getProviderName());
      }
      if (hasIsAsync()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, getIsAsync());
      }
      if (hasJCacheListenerId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(6, getJCacheListenerId());
      }
      if (hasReplaceExistingValues()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, getReplaceExistingValues());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.keys_ != java.util.Collections.EMPTY_LIST) {
          result.keys_ =
            java.util.Collections.unmodifiableList(result.keys_);
        }
        com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand.getDefaultInstance()) return this;
        if (!other.keys_.isEmpty()) {
          if (result.keys_.isEmpty()) {
            result.keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
          }
          result.keys_.addAll(other.keys_);
        }
        if (other.hasRequestId()) {
          setRequestId(other.getRequestId());
        }
        if (other.hasFlag()) {
          setFlag(other.getFlag());
        }
        if (other.hasProviderName()) {
          setProviderName(other.getProviderName());
        }
        if (other.hasIsAsync()) {
          setIsAsync(other.getIsAsync());
        }
        if (other.hasJCacheListenerId()) {
          setJCacheListenerId(other.getJCacheListenerId());
        }
        if (other.hasReplaceExistingValues()) {
          setReplaceExistingValues(other.getReplaceExistingValues());
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
              addKeys(input.readBytes());
              break;
            }
            case 16: {
              setRequestId(input.readInt64());
              break;
            }
            case 24: {
              setFlag(input.readInt32());
              break;
            }
            case 34: {
              setProviderName(input.readString());
              break;
            }
            case 40: {
              setIsAsync(input.readBool());
              break;
            }
            case 48: {
              setJCacheListenerId(input.readSInt32());
              break;
            }
            case 56: {
              setReplaceExistingValues(input.readBool());
              break;
            }
          }
        }
      }
      
      
      // repeated bytes keys = 1;
      public java.util.List<com.google.protobuf.ByteString> getKeysList() {
        return java.util.Collections.unmodifiableList(result.keys_);
      }
      public int getKeysCount() {
        return result.getKeysCount();
      }
      public com.google.protobuf.ByteString getKeys(int index) {
        return result.getKeys(index);
      }
      public Builder setKeys(int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.keys_.set(index, value);
        return this;
      }
      public Builder addKeys(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  if (result.keys_.isEmpty()) {
          result.keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
        }
        result.keys_.add(value);
        return this;
      }
      public Builder addAllKeys(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        if (result.keys_.isEmpty()) {
          result.keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
        }
        super.addAll(values, result.keys_);
        return this;
      }
      public Builder clearKeys() {
        result.keys_ = java.util.Collections.emptyList();
        return this;
      }
      
      // optional int64 requestId = 2;
      public boolean hasRequestId() {
        return result.hasRequestId();
      }
      public long getRequestId() {
        return result.getRequestId();
      }
      public Builder setRequestId(long value) {
        result.hasRequestId = true;
        result.requestId_ = value;
        return this;
      }
      public Builder clearRequestId() {
        result.hasRequestId = false;
        result.requestId_ = 0L;
        return this;
      }
      
      // optional int32 flag = 3;
      public boolean hasFlag() {
        return result.hasFlag();
      }
      public int getFlag() {
        return result.getFlag();
      }
      public Builder setFlag(int value) {
        result.hasFlag = true;
        result.flag_ = value;
        return this;
      }
      public Builder clearFlag() {
        result.hasFlag = false;
        result.flag_ = 0;
        return this;
      }
      
      // optional string providerName = 4;
      public boolean hasProviderName() {
        return result.hasProviderName();
      }
      public java.lang.String getProviderName() {
        return result.getProviderName();
      }
      public Builder setProviderName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasProviderName = true;
        result.providerName_ = value;
        return this;
      }
      public Builder clearProviderName() {
        result.hasProviderName = false;
        result.providerName_ = getDefaultInstance().getProviderName();
        return this;
      }
      
      // optional bool isAsync = 5 [default = false];
      public boolean hasIsAsync() {
        return result.hasIsAsync();
      }
      public boolean getIsAsync() {
        return result.getIsAsync();
      }
      public Builder setIsAsync(boolean value) {
        result.hasIsAsync = true;
        result.isAsync_ = value;
        return this;
      }
      public Builder clearIsAsync() {
        result.hasIsAsync = false;
        result.isAsync_ = false;
        return this;
      }
      
      // optional sint32 jCacheListenerId = 6 [default = -1];
      public boolean hasJCacheListenerId() {
        return result.hasJCacheListenerId();
      }
      public int getJCacheListenerId() {
        return result.getJCacheListenerId();
      }
      public Builder setJCacheListenerId(int value) {
        result.hasJCacheListenerId = true;
        result.jCacheListenerId_ = value;
        return this;
      }
      public Builder clearJCacheListenerId() {
        result.hasJCacheListenerId = false;
        result.jCacheListenerId_ = -1;
        return this;
      }
      
      // optional bool replaceExistingValues = 7 [default = false];
      public boolean hasReplaceExistingValues() {
        return result.hasReplaceExistingValues();
      }
      public boolean getReplaceExistingValues() {
        return result.getReplaceExistingValues();
      }
      public Builder setReplaceExistingValues(boolean value) {
        result.hasReplaceExistingValues = true;
        result.replaceExistingValues_ = value;
        return this;
      }
      public Builder clearReplaceExistingValues() {
        result.hasReplaceExistingValues = false;
        result.replaceExistingValues_ = false;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.BulkGetCommand)
    }
    
    static {
      defaultInstance = new BulkGetCommand(true);
      com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.BulkGetCommand)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_BulkGetCommand_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_BulkGetCommand_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024BulkGetCommand.proto\022\'com.alachisoft.t" +
      "ayzgrid.common.protobuf\"\261\001\n\016BulkGetComma" +
      "nd\022\014\n\004keys\030\001 \003(\014\022\021\n\trequestId\030\002 \001(\003\022\014\n\004f" +
      "lag\030\003 \001(\005\022\024\n\014providerName\030\004 \001(\t\022\026\n\007isAsy" +
      "nc\030\005 \001(\010:\005false\022\034\n\020jCacheListenerId\030\006 \001(" +
      "\021:\002-1\022$\n\025replaceExistingValues\030\007 \001(\010:\005fa" +
      "lseB\030B\026BulkGetCommandProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_BulkGetCommand_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_BulkGetCommand_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_BulkGetCommand_descriptor,
              new java.lang.String[] { "Keys", "RequestId", "Flag", "ProviderName", "IsAsync", "JCacheListenerId", "ReplaceExistingValues", },
              com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand.class,
              com.alachisoft.tayzgrid.common.protobuf.BulkGetCommandProtocol.BulkGetCommand.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
