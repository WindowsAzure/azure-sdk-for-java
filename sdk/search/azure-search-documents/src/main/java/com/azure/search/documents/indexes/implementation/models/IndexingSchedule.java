// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/** The IndexingSchedule model. */
@Fluent
public final class IndexingSchedule {
    /*
     * The interval of time between indexer executions.
     */
    @JsonProperty(value = "interval", required = true)
    private Duration interval;

    /*
     * The time when an indexer should start running.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /** Creates an instance of IndexingSchedule class. */
    @JsonCreator
    public IndexingSchedule(@JsonProperty(value = "interval", required = true) Duration interval) {
        this.interval = interval;
    }

    /**
     * Get the interval property: The interval of time between indexer executions.
     *
     * @return the interval value.
     */
    public Duration getInterval() {
        return this.interval;
    }

    /**
     * Set the interval property: The interval of time between indexer executions.
     *
     * @param interval the interval value to set.
     * @return the IndexingSchedule object itself.
     */
    /**
     * Get the startTime property: The time when an indexer should start running.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The time when an indexer should start running.
     *
     * @param startTime the startTime value to set.
     * @return the IndexingSchedule object itself.
     */
    public IndexingSchedule setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getInterval() == null) {
            throw new IllegalArgumentException("Missing required property interval in model IndexingSchedule");
        }
    }
}
