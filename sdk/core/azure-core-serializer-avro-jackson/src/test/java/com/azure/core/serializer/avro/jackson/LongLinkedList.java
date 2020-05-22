/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.azure.core.serializer.avro.jackson;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LongLinkedList extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8396451697217576999L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LongLinkedList\",\"namespace\":\"com.azure.core.serializer.avro.jackson\",\"fields\":[{\"name\":\"value\",\"type\":\"long\"},{\"name\":\"next\",\"type\":[\"null\",\"LongLinkedList\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<LongLinkedList> ENCODER =
      new BinaryMessageEncoder<LongLinkedList>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<LongLinkedList> DECODER =
      new BinaryMessageDecoder<LongLinkedList>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<LongLinkedList> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<LongLinkedList> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<LongLinkedList>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this LongLinkedList to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a LongLinkedList from a ByteBuffer. */
  public static LongLinkedList fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long value;
  @Deprecated public com.azure.core.serializer.avro.jackson.LongLinkedList next;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LongLinkedList() {}

  /**
   * All-args constructor.
   * @param value The new value for value
   * @param next The new value for next
   */
  public LongLinkedList(java.lang.Long value, com.azure.core.serializer.avro.jackson.LongLinkedList next) {
    this.value = value;
    this.next = next;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return value;
    case 1: return next;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: value = (java.lang.Long)value$; break;
    case 1: next = (com.azure.core.serializer.avro.jackson.LongLinkedList)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.lang.Long getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.Long value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'next' field.
   * @return The value of the 'next' field.
   */
  public com.azure.core.serializer.avro.jackson.LongLinkedList getNext() {
    return next;
  }

  /**
   * Sets the value of the 'next' field.
   * @param value the value to set.
   */
  public void setNext(com.azure.core.serializer.avro.jackson.LongLinkedList value) {
    this.next = value;
  }

  /**
   * Creates a new LongLinkedList RecordBuilder.
   * @return A new LongLinkedList RecordBuilder
   */
  public static com.azure.core.serializer.avro.jackson.LongLinkedList.Builder newBuilder() {
    return new com.azure.core.serializer.avro.jackson.LongLinkedList.Builder();
  }

  /**
   * Creates a new LongLinkedList RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LongLinkedList RecordBuilder
   */
  public static com.azure.core.serializer.avro.jackson.LongLinkedList.Builder newBuilder(com.azure.core.serializer.avro.jackson.LongLinkedList.Builder other) {
    return new com.azure.core.serializer.avro.jackson.LongLinkedList.Builder(other);
  }

  /**
   * Creates a new LongLinkedList RecordBuilder by copying an existing LongLinkedList instance.
   * @param other The existing instance to copy.
   * @return A new LongLinkedList RecordBuilder
   */
  public static com.azure.core.serializer.avro.jackson.LongLinkedList.Builder newBuilder(com.azure.core.serializer.avro.jackson.LongLinkedList other) {
    return new com.azure.core.serializer.avro.jackson.LongLinkedList.Builder(other);
  }

  /**
   * RecordBuilder for LongLinkedList instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LongLinkedList>
    implements org.apache.avro.data.RecordBuilder<LongLinkedList> {

    private long value;
    private com.azure.core.serializer.avro.jackson.LongLinkedList next;
    private com.azure.core.serializer.avro.jackson.LongLinkedList.Builder nextBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.azure.core.serializer.avro.jackson.LongLinkedList.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.next)) {
        this.next = data().deepCopy(fields()[1].schema(), other.next);
        fieldSetFlags()[1] = true;
      }
      if (other.hasNextBuilder()) {
        this.nextBuilder = com.azure.core.serializer.avro.jackson.LongLinkedList.newBuilder(other.getNextBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing LongLinkedList instance
     * @param other The existing instance to copy.
     */
    private Builder(com.azure.core.serializer.avro.jackson.LongLinkedList other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.value)) {
        this.value = data().deepCopy(fields()[0].schema(), other.value);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.next)) {
        this.next = data().deepCopy(fields()[1].schema(), other.next);
        fieldSetFlags()[1] = true;
      }
      this.nextBuilder = null;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.lang.Long getValue() {
      return value;
    }

    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public com.azure.core.serializer.avro.jackson.LongLinkedList.Builder setValue(long value) {
      validate(fields()[0], value);
      this.value = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public com.azure.core.serializer.avro.jackson.LongLinkedList.Builder clearValue() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'next' field.
      * @return The value.
      */
    public com.azure.core.serializer.avro.jackson.LongLinkedList getNext() {
      return next;
    }

    /**
      * Sets the value of the 'next' field.
      * @param value The value of 'next'.
      * @return This builder.
      */
    public com.azure.core.serializer.avro.jackson.LongLinkedList.Builder setNext(com.azure.core.serializer.avro.jackson.LongLinkedList value) {
      validate(fields()[1], value);
      this.nextBuilder = null;
      this.next = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'next' field has been set.
      * @return True if the 'next' field has been set, false otherwise.
      */
    public boolean hasNext() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'next' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.azure.core.serializer.avro.jackson.LongLinkedList.Builder getNextBuilder() {
      if (nextBuilder == null) {
        if (hasNext()) {
          setNextBuilder(com.azure.core.serializer.avro.jackson.LongLinkedList.newBuilder(next));
        } else {
          setNextBuilder(com.azure.core.serializer.avro.jackson.LongLinkedList.newBuilder());
        }
      }
      return nextBuilder;
    }

    /**
     * Sets the Builder instance for the 'next' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.azure.core.serializer.avro.jackson.LongLinkedList.Builder setNextBuilder(com.azure.core.serializer.avro.jackson.LongLinkedList.Builder value) {
      clearNext();
      nextBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'next' field has an active Builder instance
     * @return True if the 'next' field has an active Builder instance
     */
    public boolean hasNextBuilder() {
      return nextBuilder != null;
    }

    /**
      * Clears the value of the 'next' field.
      * @return This builder.
      */
    public com.azure.core.serializer.avro.jackson.LongLinkedList.Builder clearNext() {
      next = null;
      nextBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public LongLinkedList build() {
      try {
        LongLinkedList record = new LongLinkedList();
        record.value = fieldSetFlags()[0] ? this.value : (java.lang.Long) defaultValue(fields()[0]);
        if (nextBuilder != null) {
          record.next = this.nextBuilder.build();
        } else {
          record.next = fieldSetFlags()[1] ? this.next : (com.azure.core.serializer.avro.jackson.LongLinkedList) defaultValue(fields()[1]);
        }
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<LongLinkedList>
    WRITER$ = (org.apache.avro.io.DatumWriter<LongLinkedList>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<LongLinkedList>
    READER$ = (org.apache.avro.io.DatumReader<LongLinkedList>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
