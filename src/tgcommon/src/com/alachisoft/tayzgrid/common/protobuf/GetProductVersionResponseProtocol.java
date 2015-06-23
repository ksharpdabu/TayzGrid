// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetProductVersionResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class GetProductVersionResponseProtocol {
  private GetProductVersionResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class GetProductVersionResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use GetProductVersionResponse.newBuilder() to construct.
    private GetProductVersionResponse() {
      initFields();
    }
    private GetProductVersionResponse(boolean noInit) {}
    
    private static final GetProductVersionResponse defaultInstance;
    public static GetProductVersionResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public GetProductVersionResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_GetProductVersionResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_GetProductVersionResponse_fieldAccessorTable;
    }
    
    // required .com.alachisoft.tayzgrid.common.protobuf.ProductVersion productVersion = 1;
    public static final int PRODUCTVERSION_FIELD_NUMBER = 1;
    private boolean hasProductVersion;
    private com.alachisoft.tayzgrid.common.protobuf.ProductVersionProtocol.ProductVersion productVersion_;
    public boolean hasProductVersion() { return hasProductVersion; }
    public com.alachisoft.tayzgrid.common.protobuf.ProductVersionProtocol.ProductVersion getProductVersion() { return productVersion_; }
    
    private void initFields() {
      productVersion_ = com.alachisoft.tayzgrid.common.protobuf.ProductVersionProtocol.ProductVersion.getDefaultInstance();
    }
    public final boolean isInitialized() {
      if (!hasProductVersion) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasProductVersion()) {
        output.writeMessage(1, getProductVersion());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasProductVersion()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getProductVersion());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse.getDefaultInstance()) return this;
        if (other.hasProductVersion()) {
          mergeProductVersion(other.getProductVersion());
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
              com.alachisoft.tayzgrid.common.protobuf.ProductVersionProtocol.ProductVersion.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.ProductVersionProtocol.ProductVersion.newBuilder();
              if (hasProductVersion()) {
                subBuilder.mergeFrom(getProductVersion());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setProductVersion(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // required .com.alachisoft.tayzgrid.common.protobuf.ProductVersion productVersion = 1;
      public boolean hasProductVersion() {
        return result.hasProductVersion();
      }
      public com.alachisoft.tayzgrid.common.protobuf.ProductVersionProtocol.ProductVersion getProductVersion() {
        return result.getProductVersion();
      }
      public Builder setProductVersion(com.alachisoft.tayzgrid.common.protobuf.ProductVersionProtocol.ProductVersion value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasProductVersion = true;
        result.productVersion_ = value;
        return this;
      }
      public Builder setProductVersion(com.alachisoft.tayzgrid.common.protobuf.ProductVersionProtocol.ProductVersion.Builder builderForValue) {
        result.hasProductVersion = true;
        result.productVersion_ = builderForValue.build();
        return this;
      }
      public Builder mergeProductVersion(com.alachisoft.tayzgrid.common.protobuf.ProductVersionProtocol.ProductVersion value) {
        if (result.hasProductVersion() &&
            result.productVersion_ != com.alachisoft.tayzgrid.common.protobuf.ProductVersionProtocol.ProductVersion.getDefaultInstance()) {
          result.productVersion_ =
            com.alachisoft.tayzgrid.common.protobuf.ProductVersionProtocol.ProductVersion.newBuilder(result.productVersion_).mergeFrom(value).buildPartial();
        } else {
          result.productVersion_ = value;
        }
        result.hasProductVersion = true;
        return this;
      }
      public Builder clearProductVersion() {
        result.hasProductVersion = false;
        result.productVersion_ = com.alachisoft.tayzgrid.common.protobuf.ProductVersionProtocol.ProductVersion.getDefaultInstance();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponse)
    }
    
    static {
      defaultInstance = new GetProductVersionResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_GetProductVersionResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_GetProductVersionResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037GetProductVersionResponse.proto\022\'com.a" +
      "lachisoft.tayzgrid.common.protobuf\032\024Prod" +
      "uctVersion.proto\"l\n\031GetProductVersionRes" +
      "ponse\022O\n\016productVersion\030\001 \002(\01327.com.alac" +
      "hisoft.tayzgrid.common.protobuf.ProductV" +
      "ersionB#B!GetProductVersionResponseProto" +
      "col"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_GetProductVersionResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_GetProductVersionResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_GetProductVersionResponse_descriptor,
              new java.lang.String[] { "ProductVersion", },
              com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.GetProductVersionResponseProtocol.GetProductVersionResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alachisoft.tayzgrid.common.protobuf.ProductVersionProtocol.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}