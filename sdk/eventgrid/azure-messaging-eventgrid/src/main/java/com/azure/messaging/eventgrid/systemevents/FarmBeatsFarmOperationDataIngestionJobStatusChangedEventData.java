// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Schema of the Data property of an EventGridEvent for a
 * Microsoft.AgFoodPlatform.FarmOperationDataIngestionJobStatusChanged event.
 */
@Fluent
public final class FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData {
    /*
     * Farmer id for which job was created.
     */
    @JsonProperty(value = "farmerId")
    private String farmerId;

    /*
     * Status message to capture more details of the job.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Various states a job can be in.
     */
    @JsonProperty(value = "status")
    private FarmBeatsJobStatus status;

    /*
     * Date-time when last action was taken on job, sample format:
     * yyyy-MM-ddTHH:mm:ssZ.
     */
    @JsonProperty(value = "lastActionDateTime")
    private OffsetDateTime lastActionDateTime;

    /*
     * Flag that gets set when job cancellation is requested.
     */
    @JsonProperty(value = "isCancellationRequested")
    private Boolean isCancellationRequested;

    /*
     * Unique id of resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Name to identify resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Textual description of resource.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Date-time when resource was created, sample format:
     * yyyy-MM-ddTHH:mm:ssZ.
     */
    @JsonProperty(value = "createdDateTime")
    private OffsetDateTime createdDateTime;

    /*
     * A list of key value pairs that describe the resource.
     * Only string and numeral values are supported.
     */
    @JsonProperty(value = "properties")
    private Map<String, Object> properties;

    /**
     * Get the farmerId property: Farmer id for which job was created.
     *
     * @return the farmerId value.
     */
    public String getFarmerId() {
        return this.farmerId;
    }

    /**
     * Set the farmerId property: Farmer id for which job was created.
     *
     * @param farmerId the farmerId value to set.
     * @return the FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData object itself.
     */
    public FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData setFarmerId(String farmerId) {
        this.farmerId = farmerId;
        return this;
    }

    /**
     * Get the message property: Status message to capture more details of the job.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Status message to capture more details of the job.
     *
     * @param message the message value to set.
     * @return the FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData object itself.
     */
    public FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the status property: Various states a job can be in.
     *
     * @return the status value.
     */
    public FarmBeatsJobStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Various states a job can be in.
     *
     * @param status the status value to set.
     * @return the FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData object itself.
     */
    public FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData setStatus(FarmBeatsJobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the lastActionDateTime property: Date-time when last action was taken on job, sample format:
     * yyyy-MM-ddTHH:mm:ssZ.
     *
     * @return the lastActionDateTime value.
     */
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }

    /**
     * Set the lastActionDateTime property: Date-time when last action was taken on job, sample format:
     * yyyy-MM-ddTHH:mm:ssZ.
     *
     * @param lastActionDateTime the lastActionDateTime value to set.
     * @return the FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData object itself.
     */
    public FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData setLastActionDateTime(
            OffsetDateTime lastActionDateTime) {
        this.lastActionDateTime = lastActionDateTime;
        return this;
    }

    /**
     * Get the isCancellationRequested property: Flag that gets set when job cancellation is requested.
     *
     * @return the isCancellationRequested value.
     */
    public Boolean isCancellationRequested() {
        return this.isCancellationRequested;
    }

    /**
     * Set the isCancellationRequested property: Flag that gets set when job cancellation is requested.
     *
     * @param isCancellationRequested the isCancellationRequested value to set.
     * @return the FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData object itself.
     */
    public FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData setIsCancellationRequested(
            Boolean isCancellationRequested) {
        this.isCancellationRequested = isCancellationRequested;
        return this;
    }

    /**
     * Get the id property: Unique id of resource.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Unique id of resource.
     *
     * @param id the id value to set.
     * @return the FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData object itself.
     */
    public FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name to identify resource.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name to identify resource.
     *
     * @param name the name value to set.
     * @return the FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData object itself.
     */
    public FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Textual description of resource.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Textual description of resource.
     *
     * @param description the description value to set.
     * @return the FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData object itself.
     */
    public FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the createdDateTime property: Date-time when resource was created, sample format: yyyy-MM-ddTHH:mm:ssZ.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Date-time when resource was created, sample format: yyyy-MM-ddTHH:mm:ssZ.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData object itself.
     */
    public FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData setCreatedDateTime(
            OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the properties property: A list of key value pairs that describe the resource. Only string and numeral values
     * are supported.
     *
     * @return the properties value.
     */
    public Map<String, Object> getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: A list of key value pairs that describe the resource. Only string and numeral values
     * are supported.
     *
     * @param properties the properties value to set.
     * @return the FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData object itself.
     */
    public FarmBeatsFarmOperationDataIngestionJobStatusChangedEventData setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }
}
