// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventgrid;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.BinaryData;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * The EventGridEvent model. This represents events in the EventGrid schema to be used with the EventGrid service.
 * @see EventGridPublisherAsyncClient
 * @see EventGridPublisherClient
 **/
@Fluent
public final class EventGridEvent {

    private final com.azure.messaging.eventgrid.implementation.models.EventGridEvent event;

    private static final ClientLogger logger = new ClientLogger(EventGridEvent.class);

    /**
     * Create a new instance of the EventGridEvent, with the given required fields.
     * @param subject     the subject of the event.
     * @param eventType   the type of the event, e.g. "Contoso.Items.ItemReceived".
     * @param data        the data associated with this event.
     * @param dataVersion the version of the data sent along with the event.
     */
    public EventGridEvent(String subject, String eventType, Object data, String dataVersion) {
        if (CoreUtils.isNullOrEmpty(subject)) {
            throw logger.logExceptionAsError(new IllegalArgumentException("subject cannot be null or empty"));
        } else if (CoreUtils.isNullOrEmpty(eventType)) {
            throw logger.logExceptionAsError(new IllegalArgumentException("event type cannot be null or empty"));
        } else if (CoreUtils.isNullOrEmpty(dataVersion)) {
            throw logger.logExceptionAsError(new IllegalArgumentException("data version cannot be null or empty"));
        }

        this.event = new com.azure.messaging.eventgrid.implementation.models.EventGridEvent()
            .setEventTime(OffsetDateTime.now())
            .setId(UUID.randomUUID().toString())
            .setSubject(subject)
            .setEventType(eventType)
            .setData(data)
            .setDataVersion(dataVersion);
    }

    /**
     * Parse the EventGrid Event from a JSON string. This can be used to interpret the event at the event destination
     * from raw JSON into rich event(s).
     * @param json the JSON payload containing one or more events.
     *
     * @return all of the events in the payload parsed as {@link EventGridEvent}s.
     */
    public static List<EventGridEvent> deserializeEventGridEvents(String json) {
        return EventGridDeserializer.deserializeEventGridEvents(json);
    }


    /**
     * Get the unique id associated with this event.
     * @return the id.
     */
    public String getId() {
        return this.event.getId();
    }

    /**
     * Set the unique id of the event. Note that a random id has already been set by default.
     * @param id the unique id to set.
     *
     * @return the event itself.
     */
    public EventGridEvent setId(String id) {
        if (CoreUtils.isNullOrEmpty(id)) {
            throw logger.logExceptionAsError(new IllegalArgumentException("id cannot be null or empty"));
        }
        this.event.setId(id);
        return this;
    }

    /**
     * Get the topic associated with this event if it is associated with a domain.
     * @return the topic, or null if the topic is not set (i.e. the event came from or is going to a domain).
     */
    public String getTopic() {
        return this.event.getTopic();
    }

    /**
     * Set the topic associated with this event. Used to route events from domain endpoints.
     * @param topic the topic to set.
     *
     * @return the event itself.
     */
    public EventGridEvent setTopic(String topic) {
        this.event.setTopic(topic);
        return this;
    }

    /**
     * Get the subject associated with this event.
     * @return the subject.
     */
    public String getSubject() {
        return this.event.getSubject();
    }

    /**
     * Get whether this event is a system event.
     * @see SystemEventMappings
     * @return {@code true} if the even is a system event, or {@code false} otherwise.
     */
    public boolean isSystemEvent() {
        String eventType = this.getEventType();
        return SystemEventMappings.getSystemEventMappings().containsKey(eventType);
    }

    /**
     * Convert the event's data into the system event data if the event is a system event.
     * @see SystemEventMappings
     * @return The system event if the event is a system event, or {@code null} if it's not.
     */
    public Object asSystemEventData() {
        if (event.getData() == null) {
            return null;
        }
        return EventGridDeserializer.getSystemEventData(this.getData(), event.getEventType());
    }

    /**
     * Convert the event's data into the system event data if the event is a system event.
     * @see SystemEventMappings
     * @return The system event if the event is a system event, or Mono.empty() if it's not.
     */
    public Mono<Object> asSystemEventDataAsync() {
        if (event.getData() == null) {
            return Mono.empty();
        }
        return EventGridDeserializer.getSystemEventDataAsync(this.getDataAsync(), event.getEventType());
    }

    /**
     * Get the data associated with this event as a {@link BinaryData}, which has API to deserialize the data into
     * a String, an Object, or a byte[].
     * @return A {@link BinaryData} that wraps the this event's data payload.
     */
    public BinaryData getData() {
        if (event.getData() != null) {
            return EventGridDeserializer.getData(event.getData());
        }
        return null;
    }

    /**
     * Get the data associated with this event as a {@link BinaryData}, which has API to deserialize the data into
     * a String, an Object, or a byte[].
     * @return A {@link BinaryData} that wraps the this event's data payload.
     */
    public Mono<BinaryData> getDataAsync() {
        if (event.getData() != null) {
            return Mono.defer(() -> Mono.just(EventGridDeserializer.getData(event.getData())));
        }
        return Mono.empty();
    }

    /**
     * Get the type of this event.
     * @return the event type.
     */
    public String getEventType() {
        return this.event.getEventType();
    }

    /**
     * Get the time associated with the occurrence of this event.
     * @return the event time.
     */
    public OffsetDateTime getEventTime() {
        return this.event.getEventTime();
    }

    /**
     * Set the time associated with the event. Note that a default time has already been set when the event was
     * constructed.
     * @param time the time to set.
     *
     * @return the event itself.
     */
    public EventGridEvent setEventTime(OffsetDateTime time) {
        this.event.setEventTime(time);
        return this;
    }

    /**
     * Get the version of the data in the event. This can be used to specify versioning of event data schemas over time.
     * @return the version of the event data.
     */
    public String getDataVersion() {
        return this.event.getDataVersion();
    }

    /**
     * Get the metadata version of this event. Note that metadata version is a read-only property set by the service.
     * @return the metadata version of this event.
     */
    public String getMetadataVersion() {
        return this.event.getMetadataVersion();
    }

    EventGridEvent(com.azure.messaging.eventgrid.implementation.models.EventGridEvent impl) {
        this.event = impl;
    }

    com.azure.messaging.eventgrid.implementation.models.EventGridEvent toImpl() {
        return this.event;
    }

}
