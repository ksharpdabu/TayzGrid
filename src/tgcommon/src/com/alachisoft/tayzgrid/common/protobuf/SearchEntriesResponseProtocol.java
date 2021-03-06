// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SearchEntriesResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class SearchEntriesResponseProtocol {
  private SearchEntriesResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class SearchEntriesResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use SearchEntriesResponse.newBuilder() to construct.
    private SearchEntriesResponse() {
      initFields();
    }
    private SearchEntriesResponse(boolean noInit) {}
    
    private static final SearchEntriesResponse defaultInstance;
    public static SearchEntriesResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public SearchEntriesResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_SearchEntriesResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_SearchEntriesResponse_fieldAccessorTable;
    }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponse keyValuePackage = 1;
    public static final int KEYVALUEPACKAGE_FIELD_NUMBER = 1;
    private boolean hasKeyValuePackage;
    private com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse keyValuePackage_;
    public boolean hasKeyValuePackage() { return hasKeyValuePackage; }
    public com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse getKeyValuePackage() { return keyValuePackage_; }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.QueryResultSet queryResultSet = 2;
    public static final int QUERYRESULTSET_FIELD_NUMBER = 2;
    private boolean hasQueryResultSet;
    private com.alachisoft.tayzgrid.common.protobuf.QueryResultSetProtocol.QueryResultSet queryResultSet_;
    public boolean hasQueryResultSet() { return hasQueryResultSet; }
    public com.alachisoft.tayzgrid.common.protobuf.QueryResultSetProtocol.QueryResultSet getQueryResultSet() { return queryResultSet_; }
    
    private void initFields() {
      keyValuePackage_ = com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse.getDefaultInstance();
      queryResultSet_ = com.alachisoft.tayzgrid.common.protobuf.QueryResultSetProtocol.QueryResultSet.getDefaultInstance();
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasKeyValuePackage()) {
        output.writeMessage(1, getKeyValuePackage());
      }
      if (hasQueryResultSet()) {
        output.writeMessage(2, getQueryResultSet());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasKeyValuePackage()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getKeyValuePackage());
      }
      if (hasQueryResultSet()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getQueryResultSet());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse.getDefaultInstance()) return this;
        if (other.hasKeyValuePackage()) {
          mergeKeyValuePackage(other.getKeyValuePackage());
        }
        if (other.hasQueryResultSet()) {
          mergeQueryResultSet(other.getQueryResultSet());
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
              com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse.newBuilder();
              if (hasKeyValuePackage()) {
                subBuilder.mergeFrom(getKeyValuePackage());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setKeyValuePackage(subBuilder.buildPartial());
              break;
            }
            case 18: {
              com.alachisoft.tayzgrid.common.protobuf.QueryResultSetProtocol.QueryResultSet.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.QueryResultSetProtocol.QueryResultSet.newBuilder();
              if (hasQueryResultSet()) {
                subBuilder.mergeFrom(getQueryResultSet());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setQueryResultSet(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponse keyValuePackage = 1;
      public boolean hasKeyValuePackage() {
        return result.hasKeyValuePackage();
      }
      public com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse getKeyValuePackage() {
        return result.getKeyValuePackage();
      }
      public Builder setKeyValuePackage(com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasKeyValuePackage = true;
        result.keyValuePackage_ = value;
        return this;
      }
      public Builder setKeyValuePackage(com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse.Builder builderForValue) {
        result.hasKeyValuePackage = true;
        result.keyValuePackage_ = builderForValue.build();
        return this;
      }
      public Builder mergeKeyValuePackage(com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse value) {
        if (result.hasKeyValuePackage() &&
            result.keyValuePackage_ != com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse.getDefaultInstance()) {
          result.keyValuePackage_ =
            com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse.newBuilder(result.keyValuePackage_).mergeFrom(value).buildPartial();
        } else {
          result.keyValuePackage_ = value;
        }
        result.hasKeyValuePackage = true;
        return this;
      }
      public Builder clearKeyValuePackage() {
        result.hasKeyValuePackage = false;
        result.keyValuePackage_ = com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse.getDefaultInstance();
        return this;
      }
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.QueryResultSet queryResultSet = 2;
      public boolean hasQueryResultSet() {
        return result.hasQueryResultSet();
      }
      public com.alachisoft.tayzgrid.common.protobuf.QueryResultSetProtocol.QueryResultSet getQueryResultSet() {
        return result.getQueryResultSet();
      }
      public Builder setQueryResultSet(com.alachisoft.tayzgrid.common.protobuf.QueryResultSetProtocol.QueryResultSet value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasQueryResultSet = true;
        result.queryResultSet_ = value;
        return this;
      }
      public Builder setQueryResultSet(com.alachisoft.tayzgrid.common.protobuf.QueryResultSetProtocol.QueryResultSet.Builder builderForValue) {
        result.hasQueryResultSet = true;
        result.queryResultSet_ = builderForValue.build();
        return this;
      }
      public Builder mergeQueryResultSet(com.alachisoft.tayzgrid.common.protobuf.QueryResultSetProtocol.QueryResultSet value) {
        if (result.hasQueryResultSet() &&
            result.queryResultSet_ != com.alachisoft.tayzgrid.common.protobuf.QueryResultSetProtocol.QueryResultSet.getDefaultInstance()) {
          result.queryResultSet_ =
            com.alachisoft.tayzgrid.common.protobuf.QueryResultSetProtocol.QueryResultSet.newBuilder(result.queryResultSet_).mergeFrom(value).buildPartial();
        } else {
          result.queryResultSet_ = value;
        }
        result.hasQueryResultSet = true;
        return this;
      }
      public Builder clearQueryResultSet() {
        result.hasQueryResultSet = false;
        result.queryResultSet_ = com.alachisoft.tayzgrid.common.protobuf.QueryResultSetProtocol.QueryResultSet.getDefaultInstance();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponse)
    }
    
    static {
      defaultInstance = new SearchEntriesResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_SearchEntriesResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_SearchEntriesResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SearchEntriesResponse.proto\022\'com.alach" +
      "isoft.tayzgrid.common.protobuf\032\035KeyValue" +
      "PackageResponse.proto\032\024QueryResultSet.pr" +
      "oto\"\303\001\n\025SearchEntriesResponse\022Y\n\017keyValu" +
      "ePackage\030\001 \001(\0132@.com.alachisoft.tayzgrid" +
      ".common.protobuf.KeyValuePackageResponse" +
      "\022O\n\016queryResultSet\030\002 \001(\01327.com.alachisof" +
      "t.tayzgrid.common.protobuf.QueryResultSe" +
      "tB\037B\035SearchEntriesResponseProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_SearchEntriesResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_SearchEntriesResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_SearchEntriesResponse_descriptor,
              new java.lang.String[] { "KeyValuePackage", "QueryResultSet", },
              com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.SearchEntriesResponseProtocol.SearchEntriesResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.getDescriptor(),
          com.alachisoft.tayzgrid.common.protobuf.QueryResultSetProtocol.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
