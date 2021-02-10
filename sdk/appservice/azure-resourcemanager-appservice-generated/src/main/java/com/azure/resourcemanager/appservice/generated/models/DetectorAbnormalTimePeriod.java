// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Class representing Abnormal Time Period detected. */
@Fluent
public final class DetectorAbnormalTimePeriod {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DetectorAbnormalTimePeriod.class);

    /*
     * Start time of the correlated event
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * End time of the correlated event
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * Message describing the event
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Represents the name of the Detector
     */
    @JsonProperty(value = "source")
    private String source;

    /*
     * Represents the rank of the Detector
     */
    @JsonProperty(value = "priority")
    private Double priority;

    /*
     * Downtime metadata
     */
    @JsonProperty(value = "metaData")
    private List<List<NameValuePair>> metadata;

    /*
     * Represents the type of the Detector
     */
    @JsonProperty(value = "type")
    private IssueType type;

    /*
     * List of proposed solutions
     */
    @JsonProperty(value = "solutions")
    private List<Solution> solutions;

    /**
     * Get the startTime property: Start time of the correlated event.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of the correlated event.
     *
     * @param startTime the startTime value to set.
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: End time of the correlated event.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time of the correlated event.
     *
     * @param endTime the endTime value to set.
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the message property: Message describing the event.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Message describing the event.
     *
     * @param message the message value to set.
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the source property: Represents the name of the Detector.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Represents the name of the Detector.
     *
     * @param source the source value to set.
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the priority property: Represents the rank of the Detector.
     *
     * @return the priority value.
     */
    public Double priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Represents the rank of the Detector.
     *
     * @param priority the priority value to set.
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withPriority(Double priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the metadata property: Downtime metadata.
     *
     * @return the metadata value.
     */
    public List<List<NameValuePair>> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Downtime metadata.
     *
     * @param metadata the metadata value to set.
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withMetadata(List<List<NameValuePair>> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the type property: Represents the type of the Detector.
     *
     * @return the type value.
     */
    public IssueType type() {
        return this.type;
    }

    /**
     * Set the type property: Represents the type of the Detector.
     *
     * @param type the type value to set.
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withType(IssueType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the solutions property: List of proposed solutions.
     *
     * @return the solutions value.
     */
    public List<Solution> solutions() {
        return this.solutions;
    }

    /**
     * Set the solutions property: List of proposed solutions.
     *
     * @param solutions the solutions value to set.
     * @return the DetectorAbnormalTimePeriod object itself.
     */
    public DetectorAbnormalTimePeriod withSolutions(List<Solution> solutions) {
        this.solutions = solutions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().forEach(e -> e.forEach(e1 -> e1.validate()));
        }
        if (solutions() != null) {
            solutions().forEach(e -> e.validate());
        }
    }
}
