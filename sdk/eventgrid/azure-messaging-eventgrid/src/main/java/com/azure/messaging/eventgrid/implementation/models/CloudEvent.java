// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** Properties of an event published to an Event Grid topic using the CloudEvent 1.0 Schema. */
@Fluent
public final class CloudEvent {
    /*
     * An identifier for the event. The combination of id and source must be
     * unique for each distinct event.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Identifies the context in which an event happened. The combination of id
     * and source must be unique for each distinct event.
     */
    @JsonProperty(value = "source", required = true)
    private String source;

    /*
     * Event data specific to the event type.
     */
    @JsonProperty(value = "data")
    private Object data;

    /*
     * Event data specific to the event type, encoded as a base64 string.
     */
    @JsonProperty(value = "data_base64")
    private byte[] dataBase64;

    /*
     * Type of event related to the originating occurrence.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * The time (in UTC) the event was generated, in RFC3339 format.
     */
    @JsonProperty(value = "time")
    private OffsetDateTime time;

    /*
     * The version of the CloudEvents specification which the event uses.
     */
    @JsonProperty(value = "specversion", required = true)
    private String specversion;

    /*
     * Identifies the schema that data adheres to.
     */
    @JsonProperty(value = "dataschema")
    private String dataschema;

    /*
     * Content type of data value.
     */
    @JsonProperty(value = "datacontenttype")
    private String datacontenttype;

    /*
     * This describes the subject of the event in the context of the event
     * producer (identified by source).
     */
    @JsonProperty(value = "subject")
    private String subject;

    /*
     * Properties of an event published to an Event Grid topic using the
     * CloudEvent 1.0 Schema
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the id property: An identifier for the event. The combination of id and source must be unique for each
     * distinct event.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: An identifier for the event. The combination of id and source must be unique for each
     * distinct event.
     *
     * @param id the id value to set.
     * @return the CloudEvent object itself.
     */
    public CloudEvent setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the source property: Identifies the context in which an event happened. The combination of id and source must
     * be unique for each distinct event.
     *
     * @return the source value.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Set the source property: Identifies the context in which an event happened. The combination of id and source must
     * be unique for each distinct event.
     *
     * @param source the source value to set.
     * @return the CloudEvent object itself.
     */
    public CloudEvent setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the data property: Event data specific to the event type.
     *
     * @return the data value.
     */
    public Object getData() {
        return this.data;
    }

    /**
     * Set the data property: Event data specific to the event type.
     *
     * @param data the data value to set.
     * @return the CloudEvent object itself.
     */
    public CloudEvent setData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * Get the dataBase64 property: Event data specific to the event type, encoded as a base64 string.
     *
     * @return the dataBase64 value.
     */
    public byte[] getDataBase64() {
        return CoreUtils.clone(this.dataBase64);
    }

    /**
     * Set the dataBase64 property: Event data specific to the event type, encoded as a base64 string.
     *
     * @param dataBase64 the dataBase64 value to set.
     * @return the CloudEvent object itself.
     */
    public CloudEvent setDataBase64(byte[] dataBase64) {
        this.dataBase64 = CoreUtils.clone(dataBase64);
        return this;
    }

    /**
     * Get the type property: Type of event related to the originating occurrence.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Type of event related to the originating occurrence.
     *
     * @param type the type value to set.
     * @return the CloudEvent object itself.
     */
    public CloudEvent setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the time property: The time (in UTC) the event was generated, in RFC3339 format.
     *
     * @return the time value.
     */
    public OffsetDateTime getTime() {
        return this.time;
    }

    /**
     * Set the time property: The time (in UTC) the event was generated, in RFC3339 format.
     *
     * @param time the time value to set.
     * @return the CloudEvent object itself.
     */
    public CloudEvent setTime(OffsetDateTime time) {
        this.time = time;
        return this;
    }

    /**
     * Get the specversion property: The version of the CloudEvents specification which the event uses.
     *
     * @return the specversion value.
     */
    public String getSpecversion() {
        return this.specversion;
    }

    /**
     * Set the specversion property: The version of the CloudEvents specification which the event uses.
     *
     * @param specversion the specversion value to set.
     * @return the CloudEvent object itself.
     */
    public CloudEvent setSpecversion(String specversion) {
        this.specversion = specversion;
        return this;
    }

    /**
     * Get the dataschema property: Identifies the schema that data adheres to.
     *
     * @return the dataschema value.
     */
    public String getDataschema() {
        return this.dataschema;
    }

    /**
     * Set the dataschema property: Identifies the schema that data adheres to.
     *
     * @param dataschema the dataschema value to set.
     * @return the CloudEvent object itself.
     */
    public CloudEvent setDataschema(String dataschema) {
        this.dataschema = dataschema;
        return this;
    }

    /**
     * Get the datacontenttype property: Content type of data value.
     *
     * @return the datacontenttype value.
     */
    public String getDatacontenttype() {
        return this.datacontenttype;
    }

    /**
     * Set the datacontenttype property: Content type of data value.
     *
     * @param datacontenttype the datacontenttype value to set.
     * @return the CloudEvent object itself.
     */
    public CloudEvent setDatacontenttype(String datacontenttype) {
        this.datacontenttype = datacontenttype;
        return this;
    }

    /**
     * Get the subject property: This describes the subject of the event in the context of the event producer
     * (identified by source).
     *
     * @return the subject value.
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Set the subject property: This describes the subject of the event in the context of the event producer
     * (identified by source).
     *
     * @param subject the subject value to set.
     * @return the CloudEvent object itself.
     */
    public CloudEvent setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the additionalProperties property: Properties of an event published to an Event Grid topic using the
     * CloudEvent 1.0 Schema.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Properties of an event published to an Event Grid topic using the
     * CloudEvent 1.0 Schema.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the CloudEvent object itself.
     */
    public CloudEvent setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
