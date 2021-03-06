/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sankuai.meituan;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * define business struct
 */
public class UserProfile implements org.apache.thrift.TBase<UserProfile, UserProfile._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserProfile");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("useName", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserProfileStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UserProfileTupleSchemeFactory());
  }

  public int userId; // required
  public String useName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "userId"),
    USE_NAME((short)2, "useName");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USER_ID
          return USER_ID;
        case 2: // USE_NAME
          return USE_NAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __USERID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USE_NAME, new org.apache.thrift.meta_data.FieldMetaData("useName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserProfile.class, metaDataMap);
  }

  public UserProfile() {
  }

  public UserProfile(
    int userId,
    String useName)
  {
    this();
    this.userId = userId;
    setUserIdIsSet(true);
    this.useName = useName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserProfile(UserProfile other) {
    __isset_bitfield = other.__isset_bitfield;
    this.userId = other.userId;
    if (other.isSetUseName()) {
      this.useName = other.useName;
    }
  }

  public UserProfile deepCopy() {
    return new UserProfile(this);
  }

  @Override
  public void clear() {
    setUserIdIsSet(false);
    this.userId = 0;
    this.useName = null;
  }

  public int getUserId() {
    return this.userId;
  }

  public UserProfile setUserId(int userId) {
    this.userId = userId;
    setUserIdIsSet(true);
    return this;
  }

  public void unsetUserId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  public void setUserIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
  }

  public String getUseName() {
    return this.useName;
  }

  public UserProfile setUseName(String useName) {
    this.useName = useName;
    return this;
  }

  public void unsetUseName() {
    this.useName = null;
  }

  /** Returns true if field useName is set (has been assigned a value) and false otherwise */
  public boolean isSetUseName() {
    return this.useName != null;
  }

  public void setUseNameIsSet(boolean value) {
    if (!value) {
      this.useName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((Integer)value);
      }
      break;

    case USE_NAME:
      if (value == null) {
        unsetUseName();
      } else {
        setUseName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return Integer.valueOf(getUserId());

    case USE_NAME:
      return getUseName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUserId();
    case USE_NAME:
      return isSetUseName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserProfile)
      return this.equals((UserProfile)that);
    return false;
  }

  public boolean equals(UserProfile that) {
    if (that == null)
      return false;

    boolean this_present_userId = true;
    boolean that_present_userId = true;
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (this.userId != that.userId)
        return false;
    }

    boolean this_present_useName = true && this.isSetUseName();
    boolean that_present_useName = true && that.isSetUseName();
    if (this_present_useName || that_present_useName) {
      if (!(this_present_useName && that_present_useName))
        return false;
      if (!this.useName.equals(that.useName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(UserProfile other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    UserProfile typedOther = (UserProfile)other;

    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(typedOther.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, typedOther.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUseName()).compareTo(typedOther.isSetUseName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUseName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.useName, typedOther.useName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("UserProfile(");
    boolean first = true;

    sb.append("userId:");
    sb.append(this.userId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("useName:");
    if (this.useName == null) {
      sb.append("null");
    } else {
      sb.append(this.useName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserProfileStandardSchemeFactory implements SchemeFactory {
    public UserProfileStandardScheme getScheme() {
      return new UserProfileStandardScheme();
    }
  }

  private static class UserProfileStandardScheme extends StandardScheme<UserProfile> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserProfile struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.userId = iprot.readI32();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.useName = iprot.readString();
              struct.setUseNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserProfile struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeI32(struct.userId);
      oprot.writeFieldEnd();
      if (struct.useName != null) {
        oprot.writeFieldBegin(USE_NAME_FIELD_DESC);
        oprot.writeString(struct.useName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserProfileTupleSchemeFactory implements SchemeFactory {
    public UserProfileTupleScheme getScheme() {
      return new UserProfileTupleScheme();
    }
  }

  private static class UserProfileTupleScheme extends TupleScheme<UserProfile> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserProfile struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUserId()) {
        optionals.set(0);
      }
      if (struct.isSetUseName()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUserId()) {
        oprot.writeI32(struct.userId);
      }
      if (struct.isSetUseName()) {
        oprot.writeString(struct.useName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserProfile struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.userId = iprot.readI32();
        struct.setUserIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.useName = iprot.readString();
        struct.setUseNameIsSet(true);
      }
    }
  }

}

