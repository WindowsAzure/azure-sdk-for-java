// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Schema of the Data property of an EventGridEvent for a Microsoft.AgFoodPlatform.FarmerChanged event. */
@Fluent
public final class FarmBeatsFarmerChangedEventData {
    /*
     * Action occurred on a resource.
     */
    @JsonProperty(value = "actionType")
    private FarmBeatsResourceActionType actionType;

    /*
     * Status of the resource.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Date-time when resource was last modified, sample format:
     * yyyy-MM-ddTHH:mm:ssZ.
     */
    @JsonProperty(value = "modifiedDateTime")
    private OffsetDateTime modifiedDateTime;

    /*
     * The ETag value to implement optimistic concurrency.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

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
     * Get the actionType property: Action occurred on a resource.
     *
     * @return the actionType value.
     */
    public FarmBeatsResourceActionType getActionType() {
        return this.actionType;
    }

    /**
     * Set the actionType property: Action occurred on a resource.
     *
     * @param actionType the actionType value to set.
     * @return the FarmBeatsFarmerChangedEventData object itself.
     */
    public FarmBeatsFarmerChangedEventData setActionType(FarmBeatsResourceActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * Get the status property: Status of the resource.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of the resource.
     *
     * @param status the status value to set.
     * @return the FarmBeatsFarmerChangedEventData object itself.
     */
    public FarmBeatsFarmerChangedEventData setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the modifiedDateTime property: Date-time when resource was last modified, sample format:
     * yyyy-MM-ddTHH:mm:ssZ.
     *
     * @return the modifiedDateTime value.
     */
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }

    /**
     * Set the modifiedDateTime property: Date-time when resource was last modified, sample format:
     * yyyy-MM-ddTHH:mm:ssZ.
     *
     * @param modifiedDateTime the modifiedDateTime value to set.
     * @return the FarmBeatsFarmerChangedEventData object itself.
     */
    public FarmBeatsFarmerChangedEventData setModifiedDateTime(OffsetDateTime modifiedDateTime) {
        this.modifiedDateTime = modifiedDateTime;
        return this;
    }

    /**
     * Get the eTag property: The ETag value to implement optimistic concurrency.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag value to implement optimistic concurrency.
     *
     * @param eTag the eTag value to set.
     * @return the FarmBeatsFarmerChangedEventData object itself.
     */
    public FarmBeatsFarmerChangedEventData setETag(String eTag) {
        this.eTag = eTag;
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
     * @return the FarmBeatsFarmerChangedEventData object itself.
     */
    public FarmBeatsFarmerChangedEventData setId(String id) {
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
     * @return the FarmBeatsFarmerChangedEventData object itself.
     */
    public FarmBeatsFarmerChangedEventData setName(String name) {
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
     * @return the FarmBeatsFarmerChangedEventData object itself.
     */
    public FarmBeatsFarmerChangedEventData setDescription(String description) {
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
     * @return the FarmBeatsFarmerChangedEventData object itself.
     */
    public FarmBeatsFarmerChangedEventData setCreatedDateTime(OffsetDateTime createdDateTime) {
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
     * @return the FarmBeatsFarmerChangedEventData object itself.
     */
    public FarmBeatsFarmerChangedEventData setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }
}
