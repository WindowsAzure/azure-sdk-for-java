package com.azure.messaging.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.messaging.eventgrid.EventSchema;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

/** The EventGridEvent model. */
@Fluent
public final class EventGridEvent implements EventSchema {
    /*
     * An unique identifier for the event.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The resource path of the event source.
     */
    @JsonProperty(value = "topic")
    private String topic;

    /*
     * A resource path relative to the topic path.
     */
    @JsonProperty(value = "subject", required = true)
    private String subject;

    /*
     * Event data specific to the event type.
     */
    @JsonProperty(value = "data", required = true)
    private Object data;

    /*
     * The type of the event that occurred.
     */
    @JsonProperty(value = "eventType", required = true)
    private String eventType;

    /*
     * The time (in UTC) the event was generated.
     */
    @JsonProperty(value = "eventTime", required = true)
    private OffsetDateTime eventTime;

    /*
     * The schema version of the event metadata.
     */
    @JsonProperty(value = "metadataVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String metadataVersion;

    /*
     * The schema version of the data object.
     */
    @JsonProperty(value = "dataVersion", required = true)
    private String dataVersion;

    /**
     * Get the id property: An unique identifier for the event.
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: An unique identifier for the event.
     * @param id the id value to set.
     *
     * @return the EventGridEvent object itself.
     */
    public EventGridEvent setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the topic property: The resource path of the event source.
     * @return the topic value.
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * Set the topic property: The resource path of the event source.
     * @param topic the topic value to set.
     *
     * @return the EventGridEvent object itself.
     */
    public EventGridEvent setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Get the subject property: A resource path relative to the topic path.
     * @return the subject value.
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Set the subject property: A resource path relative to the topic path.
     * @param subject the subject value to set.
     *
     * @return the EventGridEvent object itself.
     */
    public EventGridEvent setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public boolean isCloudEvent() {
        return false;
    }

    @Override
    public boolean isEventGridEvent() {
        return true;
    }

    @Override
    public boolean isCustomEvent() {
        return false;
    }

    /**
     * Get the data property: Event data specific to the event type.
     * @return the data value.
     */
    @Override
    public Object getData() {
        return this.data;
    }

    /**
     * Set the data property: Event data specific to the event type.
     * @param data the data value to set.
     *
     * @return the EventGridEvent object itself.
     */
    public EventGridEvent setData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * Get the eventType property: The type of the event that occurred.
     * @return the eventType value.
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * Set the eventType property: The type of the event that occurred.
     * @param eventType the eventType value to set.
     *
     * @return the EventGridEvent object itself.
     */
    public EventGridEvent setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get the eventTime property: The time (in UTC) the event was generated.
     * @return the eventTime value.
     */
    public OffsetDateTime getEventTime() {
        return this.eventTime;
    }

    /**
     * Set the eventTime property: The time (in UTC) the event was generated.
     * @param eventTime the eventTime value to set.
     *
     * @return the EventGridEvent object itself.
     */
    public EventGridEvent setEventTime(OffsetDateTime eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * Get the metadataVersion property: The schema version of the event metadata.
     * @return the metadataVersion value.
     */
    public String getMetadataVersion() {
        return this.metadataVersion;
    }

    /**
     * Get the dataVersion property: The schema version of the data object.
     * @return the dataVersion value.
     */
    public String getDataVersion() {
        return this.dataVersion;
    }

    /**
     * Set the dataVersion property: The schema version of the data object.
     * @param dataVersion the dataVersion value to set.
     *
     * @return the EventGridEvent object itself.
     */
    public EventGridEvent setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
        return this;
    }
}
