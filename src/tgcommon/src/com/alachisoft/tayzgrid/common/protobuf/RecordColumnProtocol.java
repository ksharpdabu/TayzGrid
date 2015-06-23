// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RecordColumn.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class RecordColumnProtocol {
  private RecordColumnProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class RecordColumn extends
      com.google.protobuf.GeneratedMessage {
    // Use RecordColumn.newBuilder() to construct.
    private RecordColumn() {
      initFields();
    }
    private RecordColumn(boolean noInit) {}
    
    private static final RecordColumn defaultInstance;
    public static RecordColumn getDefaultInstance() {
      return defaultInstance;
    }
    
    public RecordColumn getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_RecordColumn_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_RecordColumn_fieldAccessorTable;
    }
    
    // optional string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private boolean hasName;
    private java.lang.String name_ = "";
    public boolean hasName() { return hasName; }
    public java.lang.String getName() { return name_; }
    
    // optional bool isHidden = 2;
    public static final int ISHIDDEN_FIELD_NUMBER = 2;
    private boolean hasIsHidden;
    private boolean isHidden_ = false;
    public boolean hasIsHidden() { return hasIsHidden; }
    public boolean getIsHidden() { return isHidden_; }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.ColumnType columnType = 3 [default = ATTRIBUTE_COLUMN];
    public static final int COLUMNTYPE_FIELD_NUMBER = 3;
    private boolean hasColumnType;
    private com.alachisoft.tayzgrid.common.protobuf.ColumnTypeProtocol.ColumnType columnType_;
    public boolean hasColumnType() { return hasColumnType; }
    public com.alachisoft.tayzgrid.common.protobuf.ColumnTypeProtocol.ColumnType getColumnType() { return columnType_; }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.ColumnDataType dataType = 4 [default = OBJECT];
    public static final int DATATYPE_FIELD_NUMBER = 4;
    private boolean hasDataType;
    private com.alachisoft.tayzgrid.common.protobuf.ColumnDataTypeProtocol.ColumnDataType dataType_;
    public boolean hasDataType() { return hasDataType; }
    public com.alachisoft.tayzgrid.common.protobuf.ColumnDataTypeProtocol.ColumnDataType getDataType() { return dataType_; }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.AggregateFunctionType aggregateFunctionType = 5 [default = NOTAPPLICABLE];
    public static final int AGGREGATEFUNCTIONTYPE_FIELD_NUMBER = 5;
    private boolean hasAggregateFunctionType;
    private com.alachisoft.tayzgrid.common.protobuf.AggregateFunctionTypeProtocol.AggregateFunctionType aggregateFunctionType_;
    public boolean hasAggregateFunctionType() { return hasAggregateFunctionType; }
    public com.alachisoft.tayzgrid.common.protobuf.AggregateFunctionTypeProtocol.AggregateFunctionType getAggregateFunctionType() { return aggregateFunctionType_; }
    
    // repeated int32 keys = 6;
    public static final int KEYS_FIELD_NUMBER = 6;
    private java.util.List<java.lang.Integer> keys_ =
      java.util.Collections.emptyList();
    public java.util.List<java.lang.Integer> getKeysList() {
      return keys_;
    }
    public int getKeysCount() { return keys_.size(); }
    public int getKeys(int index) {
      return keys_.get(index);
    }
    
    // repeated .com.alachisoft.tayzgrid.common.protobuf.ColumnValue values = 7;
    public static final int VALUES_FIELD_NUMBER = 7;
    private java.util.List<com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue> values_ =
      java.util.Collections.emptyList();
    public java.util.List<com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue> getValuesList() {
      return values_;
    }
    public int getValuesCount() { return values_.size(); }
    public com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue getValues(int index) {
      return values_.get(index);
    }
    
    private void initFields() {
      columnType_ = com.alachisoft.tayzgrid.common.protobuf.ColumnTypeProtocol.ColumnType.ATTRIBUTE_COLUMN;
      dataType_ = com.alachisoft.tayzgrid.common.protobuf.ColumnDataTypeProtocol.ColumnDataType.OBJECT;
      aggregateFunctionType_ = com.alachisoft.tayzgrid.common.protobuf.AggregateFunctionTypeProtocol.AggregateFunctionType.NOTAPPLICABLE;
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasName()) {
        output.writeString(1, getName());
      }
      if (hasIsHidden()) {
        output.writeBool(2, getIsHidden());
      }
      if (hasColumnType()) {
        output.writeEnum(3, getColumnType().getNumber());
      }
      if (hasDataType()) {
        output.writeEnum(4, getDataType().getNumber());
      }
      if (hasAggregateFunctionType()) {
        output.writeEnum(5, getAggregateFunctionType().getNumber());
      }
      for (int element : getKeysList()) {
        output.writeInt32(6, element);
      }
      for (com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue element : getValuesList()) {
        output.writeMessage(7, element);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getName());
      }
      if (hasIsHidden()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, getIsHidden());
      }
      if (hasColumnType()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, getColumnType().getNumber());
      }
      if (hasDataType()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, getDataType().getNumber());
      }
      if (hasAggregateFunctionType()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, getAggregateFunctionType().getNumber());
      }
      {
        int dataSize = 0;
        for (int element : getKeysList()) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(element);
        }
        size += dataSize;
        size += 1 * getKeysList().size();
      }
      for (com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue element : getValuesList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, element);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.keys_ != java.util.Collections.EMPTY_LIST) {
          result.keys_ =
            java.util.Collections.unmodifiableList(result.keys_);
        }
        if (result.values_ != java.util.Collections.EMPTY_LIST) {
          result.values_ =
            java.util.Collections.unmodifiableList(result.values_);
        }
        com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn.getDefaultInstance()) return this;
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasIsHidden()) {
          setIsHidden(other.getIsHidden());
        }
        if (other.hasColumnType()) {
          setColumnType(other.getColumnType());
        }
        if (other.hasDataType()) {
          setDataType(other.getDataType());
        }
        if (other.hasAggregateFunctionType()) {
          setAggregateFunctionType(other.getAggregateFunctionType());
        }
        if (!other.keys_.isEmpty()) {
          if (result.keys_.isEmpty()) {
            result.keys_ = new java.util.ArrayList<java.lang.Integer>();
          }
          result.keys_.addAll(other.keys_);
        }
        if (!other.values_.isEmpty()) {
          if (result.values_.isEmpty()) {
            result.values_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue>();
          }
          result.values_.addAll(other.values_);
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
              setName(input.readString());
              break;
            }
            case 16: {
              setIsHidden(input.readBool());
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              com.alachisoft.tayzgrid.common.protobuf.ColumnTypeProtocol.ColumnType value = com.alachisoft.tayzgrid.common.protobuf.ColumnTypeProtocol.ColumnType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                setColumnType(value);
              }
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              com.alachisoft.tayzgrid.common.protobuf.ColumnDataTypeProtocol.ColumnDataType value = com.alachisoft.tayzgrid.common.protobuf.ColumnDataTypeProtocol.ColumnDataType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                setDataType(value);
              }
              break;
            }
            case 40: {
              int rawValue = input.readEnum();
              com.alachisoft.tayzgrid.common.protobuf.AggregateFunctionTypeProtocol.AggregateFunctionType value = com.alachisoft.tayzgrid.common.protobuf.AggregateFunctionTypeProtocol.AggregateFunctionType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(5, rawValue);
              } else {
                setAggregateFunctionType(value);
              }
              break;
            }
            case 48: {
              addKeys(input.readInt32());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addKeys(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 58: {
              com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addValues(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // optional string name = 1;
      public boolean hasName() {
        return result.hasName();
      }
      public java.lang.String getName() {
        return result.getName();
      }
      public Builder setName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasName = true;
        result.name_ = value;
        return this;
      }
      public Builder clearName() {
        result.hasName = false;
        result.name_ = getDefaultInstance().getName();
        return this;
      }
      
      // optional bool isHidden = 2;
      public boolean hasIsHidden() {
        return result.hasIsHidden();
      }
      public boolean getIsHidden() {
        return result.getIsHidden();
      }
      public Builder setIsHidden(boolean value) {
        result.hasIsHidden = true;
        result.isHidden_ = value;
        return this;
      }
      public Builder clearIsHidden() {
        result.hasIsHidden = false;
        result.isHidden_ = false;
        return this;
      }
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.ColumnType columnType = 3 [default = ATTRIBUTE_COLUMN];
      public boolean hasColumnType() {
        return result.hasColumnType();
      }
      public com.alachisoft.tayzgrid.common.protobuf.ColumnTypeProtocol.ColumnType getColumnType() {
        return result.getColumnType();
      }
      public Builder setColumnType(com.alachisoft.tayzgrid.common.protobuf.ColumnTypeProtocol.ColumnType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasColumnType = true;
        result.columnType_ = value;
        return this;
      }
      public Builder clearColumnType() {
        result.hasColumnType = false;
        result.columnType_ = com.alachisoft.tayzgrid.common.protobuf.ColumnTypeProtocol.ColumnType.ATTRIBUTE_COLUMN;
        return this;
      }
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.ColumnDataType dataType = 4 [default = OBJECT];
      public boolean hasDataType() {
        return result.hasDataType();
      }
      public com.alachisoft.tayzgrid.common.protobuf.ColumnDataTypeProtocol.ColumnDataType getDataType() {
        return result.getDataType();
      }
      public Builder setDataType(com.alachisoft.tayzgrid.common.protobuf.ColumnDataTypeProtocol.ColumnDataType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasDataType = true;
        result.dataType_ = value;
        return this;
      }
      public Builder clearDataType() {
        result.hasDataType = false;
        result.dataType_ = com.alachisoft.tayzgrid.common.protobuf.ColumnDataTypeProtocol.ColumnDataType.OBJECT;
        return this;
      }
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.AggregateFunctionType aggregateFunctionType = 5 [default = NOTAPPLICABLE];
      public boolean hasAggregateFunctionType() {
        return result.hasAggregateFunctionType();
      }
      public com.alachisoft.tayzgrid.common.protobuf.AggregateFunctionTypeProtocol.AggregateFunctionType getAggregateFunctionType() {
        return result.getAggregateFunctionType();
      }
      public Builder setAggregateFunctionType(com.alachisoft.tayzgrid.common.protobuf.AggregateFunctionTypeProtocol.AggregateFunctionType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasAggregateFunctionType = true;
        result.aggregateFunctionType_ = value;
        return this;
      }
      public Builder clearAggregateFunctionType() {
        result.hasAggregateFunctionType = false;
        result.aggregateFunctionType_ = com.alachisoft.tayzgrid.common.protobuf.AggregateFunctionTypeProtocol.AggregateFunctionType.NOTAPPLICABLE;
        return this;
      }
      
      // repeated int32 keys = 6;
      public java.util.List<java.lang.Integer> getKeysList() {
        return java.util.Collections.unmodifiableList(result.keys_);
      }
      public int getKeysCount() {
        return result.getKeysCount();
      }
      public int getKeys(int index) {
        return result.getKeys(index);
      }
      public Builder setKeys(int index, int value) {
        result.keys_.set(index, value);
        return this;
      }
      public Builder addKeys(int value) {
        if (result.keys_.isEmpty()) {
          result.keys_ = new java.util.ArrayList<java.lang.Integer>();
        }
        result.keys_.add(value);
        return this;
      }
      public Builder addAllKeys(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        if (result.keys_.isEmpty()) {
          result.keys_ = new java.util.ArrayList<java.lang.Integer>();
        }
        super.addAll(values, result.keys_);
        return this;
      }
      public Builder clearKeys() {
        result.keys_ = java.util.Collections.emptyList();
        return this;
      }
      
      // repeated .com.alachisoft.tayzgrid.common.protobuf.ColumnValue values = 7;
      public java.util.List<com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue> getValuesList() {
        return java.util.Collections.unmodifiableList(result.values_);
      }
      public int getValuesCount() {
        return result.getValuesCount();
      }
      public com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue getValues(int index) {
        return result.getValues(index);
      }
      public Builder setValues(int index, com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.values_.set(index, value);
        return this;
      }
      public Builder setValues(int index, com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue.Builder builderForValue) {
        result.values_.set(index, builderForValue.build());
        return this;
      }
      public Builder addValues(com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.values_.isEmpty()) {
          result.values_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue>();
        }
        result.values_.add(value);
        return this;
      }
      public Builder addValues(com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue.Builder builderForValue) {
        if (result.values_.isEmpty()) {
          result.values_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue>();
        }
        result.values_.add(builderForValue.build());
        return this;
      }
      public Builder addAllValues(
          java.lang.Iterable<? extends com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue> values) {
        if (result.values_.isEmpty()) {
          result.values_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue>();
        }
        super.addAll(values, result.values_);
        return this;
      }
      public Builder clearValues() {
        result.values_ = java.util.Collections.emptyList();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.RecordColumn)
    }
    
    static {
      defaultInstance = new RecordColumn(true);
      com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.RecordColumn)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_RecordColumn_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_RecordColumn_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022RecordColumn.proto\022\'com.alachisoft.tay" +
      "zgrid.common.protobuf\032\020ColumnType.proto\032" +
      "\021ColumnValue.proto\032\033AggregateFunctionTyp" +
      "e.proto\032\024ColumnDataType.proto\"\236\003\n\014Record" +
      "Column\022\014\n\004name\030\001 \001(\t\022\020\n\010isHidden\030\002 \001(\010\022Y" +
      "\n\ncolumnType\030\003 \001(\01623.com.alachisoft.tayz" +
      "grid.common.protobuf.ColumnType:\020ATTRIBU" +
      "TE_COLUMN\022Q\n\010dataType\030\004 \001(\01627.com.alachi" +
      "soft.tayzgrid.common.protobuf.ColumnData" +
      "Type:\006OBJECT\022l\n\025aggregateFunctionType\030\005 ",
      "\001(\0162>.com.alachisoft.tayzgrid.common.pro" +
      "tobuf.AggregateFunctionType:\rNOTAPPLICAB" +
      "LE\022\014\n\004keys\030\006 \003(\005\022D\n\006values\030\007 \003(\01324.com.a" +
      "lachisoft.tayzgrid.common.protobuf.Colum" +
      "nValueB\026B\024RecordColumnProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_RecordColumn_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_RecordColumn_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_RecordColumn_descriptor,
              new java.lang.String[] { "Name", "IsHidden", "ColumnType", "DataType", "AggregateFunctionType", "Keys", "Values", },
              com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn.class,
              com.alachisoft.tayzgrid.common.protobuf.RecordColumnProtocol.RecordColumn.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alachisoft.tayzgrid.common.protobuf.ColumnTypeProtocol.getDescriptor(),
          com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.getDescriptor(),
          com.alachisoft.tayzgrid.common.protobuf.AggregateFunctionTypeProtocol.getDescriptor(),
          com.alachisoft.tayzgrid.common.protobuf.ColumnDataTypeProtocol.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}