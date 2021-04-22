// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object that represents a set of mutable event source resource properties. */
@Fluent
public class EventSourceMutableProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventSourceMutableProperties.class);

    /*
     * The event property that will be used as the event source's timestamp. If
     * a value isn't specified for timestampPropertyName, or if null or
     * empty-string is specified, the event creation time will be used.
     */
    @JsonProperty(value = "timestampPropertyName")
    private String timestampPropertyName;

    /*
     * An object that represents the local timestamp property. It contains the
     * format of local timestamp that needs to be used and the corresponding
     * timezone offset information. If a value isn't specified for
     * localTimestamp, or if null, then the local timestamp will not be
     * ingressed with the events.
     */
    @JsonProperty(value = "localTimestamp")
    private LocalTimestamp localTimestamp;

    /**
     * Get the timestampPropertyName property: The event property that will be used as the event source's timestamp. If
     * a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation
     * time will be used.
     *
     * @return the timestampPropertyName value.
     */
    public String timestampPropertyName() {
        return this.timestampPropertyName;
    }

    /**
     * Set the timestampPropertyName property: The event property that will be used as the event source's timestamp. If
     * a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation
     * time will be used.
     *
     * @param timestampPropertyName the timestampPropertyName value to set.
     * @return the EventSourceMutableProperties object itself.
     */
    public EventSourceMutableProperties withTimestampPropertyName(String timestampPropertyName) {
        this.timestampPropertyName = timestampPropertyName;
        return this;
    }

    /**
     * Get the localTimestamp property: An object that represents the local timestamp property. It contains the format
     * of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn't
     * specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     *
     * @return the localTimestamp value.
     */
    public LocalTimestamp localTimestamp() {
        return this.localTimestamp;
    }

    /**
     * Set the localTimestamp property: An object that represents the local timestamp property. It contains the format
     * of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn't
     * specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     *
     * @param localTimestamp the localTimestamp value to set.
     * @return the EventSourceMutableProperties object itself.
     */
    public EventSourceMutableProperties withLocalTimestamp(LocalTimestamp localTimestamp) {
        this.localTimestamp = localTimestamp;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (localTimestamp() != null) {
            localTimestamp().validate();
        }
    }
}