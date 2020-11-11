// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.amqp.AmqpMessageConstant;
import com.azure.core.experimental.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.ObjectSerializer;
import com.azure.core.util.serializer.TypeReference;
import reactor.core.publisher.Mono;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static com.azure.core.amqp.AmqpMessageConstant.ENQUEUED_TIME_UTC_ANNOTATION_NAME;
import static com.azure.core.amqp.AmqpMessageConstant.OFFSET_ANNOTATION_NAME;
import static com.azure.core.amqp.AmqpMessageConstant.PARTITION_KEY_ANNOTATION_NAME;
import static com.azure.core.amqp.AmqpMessageConstant.SEQUENCE_NUMBER_ANNOTATION_NAME;
import static com.azure.core.amqp.AmqpMessageConstant.PRODUCER_SEQUENCE_NUMBER_ANNOTATION_NAME;
import static com.azure.core.amqp.AmqpMessageConstant.PRODUCER_EPOCH_ANNOTATION_NAME;
import static com.azure.core.amqp.AmqpMessageConstant.PRODUCER_ID_ANNOTATION_NAME;
import static com.azure.core.util.FluxUtil.monoError;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * The data structure encapsulating the event being sent-to and received-from Event Hubs. Each Event Hub partition can
 * be visualized as a stream of {@link EventData}.
 *
 * <p>
 * Here's how AMQP message sections map to {@link EventData}. For reference, the specification can be found here:
 * <a href="http://docs.oasis-open.org/amqp/core/v1.0/os/amqp-core-complete-v1.0-os.pdf">AMQP 1.0 specification</a>
 *
 * <ol>
 * <li>{@link #getProperties()} - AMQPMessage.ApplicationProperties section</li>
 * <li>{@link #getBody()} - if AMQPMessage.Body has Data section</li>
 * </ol>
 *
 * <p>
 * Serializing a received {@link EventData} with AMQP sections other than ApplicationProperties (with primitive Java
 * types) and Data section is not supported.
 * </p>
 *
 * @see EventDataBatch
 * @see EventHubProducerClient
 * @see EventHubProducerAsyncClient
 */
public class EventData {
    /*
     * These are properties owned by the service and set when a message is received.
     */
    static final Set<String> RESERVED_SYSTEM_PROPERTIES;

    private final ClientLogger logger = new ClientLogger(EventData.class);
    private final Map<String, Object> properties;
    private final BinaryData body;
    private final SystemProperties systemProperties;
    private ObjectSerializer serializer;
    private Context context;

    private Long publishedGroupId;
    private Short publishedOwnerLevel;
    private Integer publishedSequenceNumber;

    static {
        final Set<String> properties = new HashSet<>();
        properties.add(OFFSET_ANNOTATION_NAME.getValue());
        properties.add(PARTITION_KEY_ANNOTATION_NAME.getValue());
        properties.add(SEQUENCE_NUMBER_ANNOTATION_NAME.getValue());
        properties.add(ENQUEUED_TIME_UTC_ANNOTATION_NAME.getValue());

        RESERVED_SYSTEM_PROPERTIES = Collections.unmodifiableSet(properties);
    }

    /**
     * Creates an event containing the {@code body}.
     *
     * @param body The data to set for this event.
     * @throws NullPointerException if {@code body} is {@code null}.
     */
    public EventData(byte[] body) {
        this(BinaryData.fromBytes(Objects.requireNonNull(body, "'body' cannot be null.")));
    }

    /**
     * Creates an event containing the {@code body}.
     *
     * @param body The data to set for this event.
     * @throws NullPointerException if {@code body} is {@code null}.
     */
    public EventData(ByteBuffer body) {
        this(Objects.requireNonNull(body, "'body' cannot be null.").array());
    }

    /**
     * Creates an event by encoding the {@code body} using UTF-8 charset.
     *
     * @param body The string that will be UTF-8 encoded to create an event.
     * @throws NullPointerException if {@code body} is {@code null}.
     */
    public EventData(String body) {
        this(Objects.requireNonNull(body, "'body' cannot be null.").getBytes(UTF_8));
    }

    /**
     * Creates an event with the provided {@link BinaryData} as payload.
     *
     * @param body The {@link BinaryData} payload for this event.
     */
    public EventData(BinaryData body) {
        this(Objects.requireNonNull(body, "'body' cannot be null."), new SystemProperties(), Context.NONE);
    }

    /**
     * Creates an event with the given {@code body}, system properties and context.
     *
     * @param body The data to set for this event.
     * @param systemProperties System properties set by message broker for this event.
     * @param context A specified key-value pair of type {@link Context}.
     * @throws NullPointerException if {@code body}, {@code systemProperties}, or {@code context} is {@code null}.
     */
    EventData(BinaryData body, SystemProperties systemProperties, Context context) {
        this.body = Objects.requireNonNull(body, "'body' cannot be null.");
        this.context = Objects.requireNonNull(context, "'context' cannot be null.");
        this.systemProperties =  Objects.requireNonNull(systemProperties, "'systemProperties' cannot be null.");
        this.properties = new HashMap<>();
        this.commitProducerDataFromSysProperties();  // populate producer publishing when receiving an event.
    }

    /**
     * Gets the set of free-form event properties which may be used for passing metadata associated with the event with
     * the event body during Event Hubs operations. A common use-case for {@code properties()} is to associate
     * serialization hints for the {@link #getBody()} as an aid to consumers who wish to deserialize the binary data.
     *
     * <p><strong>Adding serialization hint using {@code getProperties()}</strong></p>
     * <p>In the sample, the type of telemetry is indicated by adding an application property with key "eventType".</p>
     *
     * {@codesnippet com.azure.messaging.eventhubs.eventdata.getProperties}
     *
     * @return Application properties associated with this {@link EventData}.
     */
    public Map<String, Object> getProperties() {
        return properties;
    }

    /**
     * Properties that are populated by Event Hubs service. As these are populated by the Event Hubs service, they are
     * only present on a <b>received</b> {@link EventData}.
     *
     * @return An encapsulation of all system properties appended by EventHubs service into {@link EventData}.
     *     {@code null} if the {@link EventData} is not received from the Event Hubs service.
     */
    public Map<String, Object> getSystemProperties() {
        return systemProperties;
    }

    /**
     * Gets the actual payload/data wrapped by EventData.
     *
     * <p>
     * If the means for deserializing the raw data is not apparent to consumers, a common technique is to make use of
     * {@link #getProperties()} when creating the event, to associate serialization hints as an aid to consumers who
     * wish to deserialize the binary data.
     * </p>
     *
     * @return A byte array representing the data.
     */
    public byte[] getBody() {
        return body.toBytes();
    }

    /**
     * Returns event data as UTF-8 decoded string.
     *
     * @return UTF-8 decoded string representation of the event data.
     */
    public String getBodyAsString() {
        return new String(body.toBytes(), UTF_8);
    }

    /**
     * Returns the {@link BinaryData} payload associated with this event.
     *
     * @return the {@link BinaryData} payload associated with this event.
     */
    public BinaryData getBodyAsBinaryData() {
        return body;
    }

    /**
     * Gets the offset of the event when it was received from the associated Event Hub partition. This is only present
     * on a <b>received</b> {@link EventData}.
     *
     * @return The offset within the Event Hub partition of the received event. {@code null} if the {@link EventData}
     *     was not received from Event Hubs service.
     */
    public Long getOffset() {
        return systemProperties.getOffset();
    }

    /**
     * Gets the partition hashing key if it was set when originally publishing the event. If it exists, this value was
     * used to compute a hash to select a partition to send the message to. This is only present on a <b>received</b>
     * {@link EventData}.
     *
     * @return A partition key for this Event Data. {@code null} if the {@link EventData} was not received from Event
     *     Hubs service or there was no partition key set when the event was sent to the Event Hub.
     */
    public String getPartitionKey() {
        return systemProperties.getPartitionKey();
    }

    /**
     * Gets the instant, in UTC, of when the event was enqueued in the Event Hub partition. This is only present on a
     * <b>received</b> {@link EventData}.
     *
     * @return The instant, in UTC, this was enqueued in the Event Hub partition. {@code null} if the {@link EventData}
     *     was not received from Event Hubs service.
     */
    public Instant getEnqueuedTime() {
        return systemProperties.getEnqueuedTime();
    }

    /**
     * Gets the sequence number assigned to the event when it was enqueued in the associated Event Hub partition. This
     * is unique for every message received in the Event Hub partition. This is only present on a <b>received</b>
     * {@link EventData}.
     *
     * @return The sequence number for this event. {@code null} if the {@link EventData} was not received from Event
     *     Hubs service.
     */
    public Long getSequenceNumber() {
        return systemProperties.getSequenceNumber();
    }

    /**
     * Gets the producer sequence number that was assigned during publishing, if the event was successfully
     * published by a sequence-aware producer.  If the producer was not configured to apply
     * sequence numbering or if the event has not yet been successfully published, this member
     * will be {@code null}.
     *
     * The published sequence number is only populated and relevant when certain features
     * of the producer are enabled. For example, it is used by idempotent publishing.
     *
     * @return The publishing sequence number assigned to the event at the time it was successfully published.
     * {@code null} if the {@link EventData} hasn't been sent or it's sent without idempotent publishing enabled.
     */
    public Integer getPublishedSequenceNumber() {
        return publishedSequenceNumber;
    }

    /**
     * Gets the producer group id that was assigned during publishing, if the event was successfully
     * published by a sequence-aware producer.  If the producer was not configured to apply
     * sequence numbering or if the event has not yet been successfully published, this member
     * will be {@code null}.
     *
     * The producer group id is only populated and relevant when certain features
     * of the producer are enabled. For example, it is used by idempotent publishing.
     *
     * @return The producer group id assigned to the event at the time it was successfully published.
     * {@code null} if the {@link EventData} hasn't been sent or it's sent without idempotent publishing enabled.
     */
    Long getPublishedGroupId() {
        return publishedGroupId;
    }

    /**
     * Gets the producer owner level that was assigned during publishing, if the event was successfully
     * published by a sequence-aware producer.  If the producer was not configured to apply
     * sequence numbering or if the event has not yet been successfully published, this member
     * will be {@code null}.
     *
     * The producer owner level is only populated and relevant when certain features
     * of the producer are enabled. For example, it is used by idempotent publishing.
     *
     * @return The producer owner level assigned to the event at the time it was successfully published.
     * {@code null} if the {@link EventData} hasn't been sent or it's sent without idempotent publishing enabled.
     */
    Short getPublishedOwnerLevel() {
        return publishedOwnerLevel;
    }

    void setProducerGroupIdInSysProperties(Long producerGroupId) {
        this.getSystemProperties().put(
            AmqpMessageConstant.PRODUCER_ID_ANNOTATION_NAME.getValue(),
            producerGroupId
        );
    }

    void setProducerOwnerLevelInSysProperties(Short producerOwnerLevel) {
        this.getSystemProperties().put(
            AmqpMessageConstant.PRODUCER_EPOCH_ANNOTATION_NAME.getValue(),
            producerOwnerLevel
        );
    }

    void setPublishedSequenceNumberInSysProperties(Integer publishedSequenceNumber) {
        this.getSystemProperties().put(
            AmqpMessageConstant.PRODUCER_SEQUENCE_NUMBER_ANNOTATION_NAME.getValue(),
            publishedSequenceNumber);
    }

    void commitProducerDataFromSysProperties() {
        this.publishedGroupId = this.systemProperties.getPublishedGroupId();
        this.publishedOwnerLevel = this.systemProperties.getPublishedOwnerLevel();
        this.publishedSequenceNumber = this.systemProperties.getPublishedSequenceNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EventData eventData = (EventData) o;
        return Arrays.equals(body.toBytes(), eventData.body.toBytes());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Arrays.hashCode(body.toBytes());
    }

    /**
     * A specified key-value pair of type {@link Context} to set additional information on the event.
     *
     * @return the {@link Context} object set on the event
     */
    Context getContext() {
        return context;
    }

    /**
     * Adds a new key value pair to the existing context on Event Data.
     *
     * @param key The key for this context object
     * @param value The value for this context object.
     * @throws NullPointerException if {@code key} or {@code value} is null.
     * @return The updated {@link EventData}.
     */
    public EventData addContext(String key, Object value) {
        Objects.requireNonNull(key, "The 'key' parameter cannot be null.");
        Objects.requireNonNull(value, "The 'value' parameter cannot be null.");
        this.context = context.addData(key, value);

        return this;
    }


    /**
     * Deserializes event payload into an object of type {@code T}.
     *
     * @param objectType Class object of type T.
     * @param <T> object type for deserialization.
     * @return deserialized object as type T.
     */
    public <T> T getDeserializedObject(Class<T> objectType) {
        return getDeserializedObjectAsync(objectType).block();
    }

    /**
     * Deserializes event payload into object.
     *
     * @param objectType Class object of type T
     * @param <T> object type for deserialization
     * @return deserialized object as type T
     */
    public <T> Mono<T> getDeserializedObjectAsync(Class<T> objectType) {
        if (this.serializer == null) {
            return monoError(logger,
                new NullPointerException("No serializer set for deserializing EventData payload."));
        }
        if (objectType == null) {
            return monoError(logger, new IllegalArgumentException("objectType cannot be null."));
        }

        return serializer.deserializeAsync(new ByteArrayInputStream(getBody()),
            TypeReference.createInstance(objectType));
    }

    EventData setSerializer(ObjectSerializer serializer) {
        this.serializer = serializer;
        return this;
    }

    /**
     * A collection of properties populated by Azure Event Hubs service.
     */
    static class SystemProperties extends HashMap<String, Object> {
        private static final long serialVersionUID = -2827050124966993723L;
        private final Long offset;
        private final String partitionKey;
        private final Instant enqueuedTime;
        private final Long sequenceNumber;

        SystemProperties() {
            super();
            offset = null;
            partitionKey = null;
            enqueuedTime = null;
            sequenceNumber = null;
        }

        SystemProperties(final Map<String, Object> map) {
            super(map);
            this.partitionKey = removeSystemProperty(PARTITION_KEY_ANNOTATION_NAME.getValue());

            final String offset = removeSystemProperty(OFFSET_ANNOTATION_NAME.getValue());
            if (offset == null) {
                throw new IllegalStateException(String.format(Locale.US,
                    "offset: %s should always be in map.", OFFSET_ANNOTATION_NAME.getValue()));
            }
            this.offset = Long.valueOf(offset);
            put(OFFSET_ANNOTATION_NAME.getValue(), this.offset);

            final Date enqueuedTimeValue = removeSystemProperty(ENQUEUED_TIME_UTC_ANNOTATION_NAME.getValue());
            if (enqueuedTimeValue == null) {
                throw new IllegalStateException(String.format(Locale.US,
                    "enqueuedTime: %s should always be in map.", ENQUEUED_TIME_UTC_ANNOTATION_NAME.getValue()));
            }
            this.enqueuedTime = enqueuedTimeValue.toInstant();
            put(ENQUEUED_TIME_UTC_ANNOTATION_NAME.getValue(), this.enqueuedTime);

            final Long sequenceNumber = removeSystemProperty(SEQUENCE_NUMBER_ANNOTATION_NAME.getValue());
            if (sequenceNumber == null) {
                throw new IllegalStateException(String.format(Locale.US,
                    "sequenceNumber: %s should always be in map.", SEQUENCE_NUMBER_ANNOTATION_NAME.getValue()));
            }
            this.sequenceNumber = sequenceNumber;
            put(SEQUENCE_NUMBER_ANNOTATION_NAME.getValue(), this.sequenceNumber);
        }

        /**
         * Gets the offset within the Event Hubs stream.
         *
         * @return The offset within the Event Hubs stream.
         */
        private Long getOffset() {
            return offset;
        }

        /**
         * Gets a partition key used for message partitioning. If it exists, this value was used to compute a hash to
         * select a partition to send the message to.
         *
         * @return A partition key for this Event Data.
         */
        private String getPartitionKey() {
            return partitionKey;
        }

        /**
         * Gets the time this event was enqueued in the Event Hub.
         *
         * @return The time this was enqueued in the service.
         */
        private Instant getEnqueuedTime() {
            return enqueuedTime;
        }

        /**
         * Gets the sequence number in the event stream for this event. This is unique for every message received in the
         * Event Hub.
         *
         * @return Sequence number for this event.
         * @throws IllegalStateException if {@link SystemProperties} does not contain the sequence number in a retrieved
         * event.
         */
        private Long getSequenceNumber() {
            return sequenceNumber;
        }

        private Integer getPublishedSequenceNumber() {
            return (Integer) this.get(PRODUCER_SEQUENCE_NUMBER_ANNOTATION_NAME.getValue());
        }

        private Long getPublishedGroupId() {
            return (Long) this.get(PRODUCER_ID_ANNOTATION_NAME.getValue());
        }

        private Short getPublishedOwnerLevel() {
            return (Short) this.get(PRODUCER_EPOCH_ANNOTATION_NAME.getValue());
        }

        @SuppressWarnings("unchecked")
        private <T> T removeSystemProperty(final String key) {
            if (this.containsKey(key)) {
                return (T) (this.remove(key));
            }

            return null;
        }
    }
}
