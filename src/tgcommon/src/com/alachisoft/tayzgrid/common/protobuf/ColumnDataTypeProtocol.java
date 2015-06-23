// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ColumnDataType.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class ColumnDataTypeProtocol {
  private ColumnDataTypeProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum ColumnDataType
      implements com.google.protobuf.ProtocolMessageEnum {
    OBJECT(0, 0),
    BOOL(1, 1),
    CHAR(2, 2),
    DATETIME(3, 3),
    DECIMAL(4, 4),
    DOUBLE(5, 5),
    FLOAT(6, 6),
    INT16(7, 7),
    INT32(8, 8),
    INT64(9, 9),
    UINT16(10, 10),
    UINT32(11, 11),
    UINT64(12, 12),
    STRING(13, 13),
    BYTE(14, 14),
    SBYTE(15, 15),
    AVERAGERESULT(16, 16),
    ;
    
    
    public final int getNumber() { return value; }
    
    public static ColumnDataType valueOf(int value) {
      switch (value) {
        case 0: return OBJECT;
        case 1: return BOOL;
        case 2: return CHAR;
        case 3: return DATETIME;
        case 4: return DECIMAL;
        case 5: return DOUBLE;
        case 6: return FLOAT;
        case 7: return INT16;
        case 8: return INT32;
        case 9: return INT64;
        case 10: return UINT16;
        case 11: return UINT32;
        case 12: return UINT64;
        case 13: return STRING;
        case 14: return BYTE;
        case 15: return SBYTE;
        case 16: return AVERAGERESULT;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<ColumnDataType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ColumnDataType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ColumnDataType>() {
            public ColumnDataType findValueByNumber(int number) {
              return ColumnDataType.valueOf(number)
    ;        }
          };
    
    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.ColumnDataTypeProtocol.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final ColumnDataType[] VALUES = {
      OBJECT, BOOL, CHAR, DATETIME, DECIMAL, DOUBLE, FLOAT, INT16, INT32, INT64, UINT16, UINT32, UINT64, STRING, BYTE, SBYTE, AVERAGERESULT, 
    };
    public static ColumnDataType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    private final int index;
    private final int value;
    private ColumnDataType(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    static {
      com.alachisoft.tayzgrid.common.protobuf.ColumnDataTypeProtocol.getDescriptor();
    }
    
    // @@protoc_insertion_point(enum_scope:com.alachisoft.tayzgrid.common.protobuf.ColumnDataType)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ColumnDataType.proto\022\'com.alachisoft.t" +
      "ayzgrid.common.protobuf*\333\001\n\016ColumnDataTy" +
      "pe\022\n\n\006OBJECT\020\000\022\010\n\004BOOL\020\001\022\010\n\004CHAR\020\002\022\014\n\010DA" +
      "TETIME\020\003\022\013\n\007DECIMAL\020\004\022\n\n\006DOUBLE\020\005\022\t\n\005FLO" +
      "AT\020\006\022\t\n\005INT16\020\007\022\t\n\005INT32\020\010\022\t\n\005INT64\020\t\022\n\n" +
      "\006UINT16\020\n\022\n\n\006UINT32\020\013\022\n\n\006UINT64\020\014\022\n\n\006STR" +
      "ING\020\r\022\010\n\004BYTE\020\016\022\t\n\005SBYTE\020\017\022\021\n\rAVERAGERES" +
      "ULT\020\020B\030B\026ColumnDataTypeProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
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