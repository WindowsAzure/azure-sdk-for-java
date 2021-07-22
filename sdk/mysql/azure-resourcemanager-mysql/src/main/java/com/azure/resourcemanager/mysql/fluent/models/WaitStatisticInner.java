// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Represents a Wait Statistic. */
@Fluent
public final class WaitStatisticInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WaitStatisticInner.class);

    /*
     * The properties of a wait statistic.
     */
    @JsonProperty(value = "properties")
    private WaitStatisticProperties properties;

    /**
     * Get the properties property: The properties of a wait statistic.
     *
     * @return the properties value.
     */
    private WaitStatisticProperties properties() {
        return this.properties;
    }

    /**
     * Get the startTime property: Observation start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.properties() == null ? null : this.properties().startTime();
    }

    /**
     * Set the startTime property: Observation start time.
     *
     * @param startTime the startTime value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withStartTime(OffsetDateTime startTime) {
        if (this.properties() == null) {
            this.properties = new WaitStatisticProperties();
        }
        this.properties().withStartTime(startTime);
        return this;
    }

    /**
     * Get the endTime property: Observation end time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.properties() == null ? null : this.properties().endTime();
    }

    /**
     * Set the endTime property: Observation end time.
     *
     * @param endTime the endTime value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withEndTime(OffsetDateTime endTime) {
        if (this.properties() == null) {
            this.properties = new WaitStatisticProperties();
        }
        this.properties().withEndTime(endTime);
        return this;
    }

    /**
     * Get the eventName property: Wait event name.
     *
     * @return the eventName value.
     */
    public String eventName() {
        return this.properties() == null ? null : this.properties().eventName();
    }

    /**
     * Set the eventName property: Wait event name.
     *
     * @param eventName the eventName value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withEventName(String eventName) {
        if (this.properties() == null) {
            this.properties = new WaitStatisticProperties();
        }
        this.properties().withEventName(eventName);
        return this;
    }

    /**
     * Get the eventTypeName property: Wait event type name.
     *
     * @return the eventTypeName value.
     */
    public String eventTypeName() {
        return this.properties() == null ? null : this.properties().eventTypeName();
    }

    /**
     * Set the eventTypeName property: Wait event type name.
     *
     * @param eventTypeName the eventTypeName value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withEventTypeName(String eventTypeName) {
        if (this.properties() == null) {
            this.properties = new WaitStatisticProperties();
        }
        this.properties().withEventTypeName(eventTypeName);
        return this;
    }

    /**
     * Get the queryId property: Database query identifier.
     *
     * @return the queryId value.
     */
    public Long queryId() {
        return this.properties() == null ? null : this.properties().queryId();
    }

    /**
     * Set the queryId property: Database query identifier.
     *
     * @param queryId the queryId value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withQueryId(Long queryId) {
        if (this.properties() == null) {
            this.properties = new WaitStatisticProperties();
        }
        this.properties().withQueryId(queryId);
        return this;
    }

    /**
     * Get the databaseName property: Database Name.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.properties() == null ? null : this.properties().databaseName();
    }

    /**
     * Set the databaseName property: Database Name.
     *
     * @param databaseName the databaseName value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withDatabaseName(String databaseName) {
        if (this.properties() == null) {
            this.properties = new WaitStatisticProperties();
        }
        this.properties().withDatabaseName(databaseName);
        return this;
    }

    /**
     * Get the userId property: Database user identifier.
     *
     * @return the userId value.
     */
    public Long userId() {
        return this.properties() == null ? null : this.properties().userId();
    }

    /**
     * Set the userId property: Database user identifier.
     *
     * @param userId the userId value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withUserId(Long userId) {
        if (this.properties() == null) {
            this.properties = new WaitStatisticProperties();
        }
        this.properties().withUserId(userId);
        return this;
    }

    /**
     * Get the count property: Wait event count observed in this time interval.
     *
     * @return the count value.
     */
    public Long count() {
        return this.properties() == null ? null : this.properties().count();
    }

    /**
     * Set the count property: Wait event count observed in this time interval.
     *
     * @param count the count value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withCount(Long count) {
        if (this.properties() == null) {
            this.properties = new WaitStatisticProperties();
        }
        this.properties().withCount(count);
        return this;
    }

    /**
     * Get the totalTimeInMs property: Total time of wait in milliseconds in this time interval.
     *
     * @return the totalTimeInMs value.
     */
    public Double totalTimeInMs() {
        return this.properties() == null ? null : this.properties().totalTimeInMs();
    }

    /**
     * Set the totalTimeInMs property: Total time of wait in milliseconds in this time interval.
     *
     * @param totalTimeInMs the totalTimeInMs value to set.
     * @return the WaitStatisticInner object itself.
     */
    public WaitStatisticInner withTotalTimeInMs(Double totalTimeInMs) {
        if (this.properties() == null) {
            this.properties = new WaitStatisticProperties();
        }
        this.properties().withTotalTimeInMs(totalTimeInMs);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
