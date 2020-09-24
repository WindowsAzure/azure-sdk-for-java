// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The ModelData model. */
@Fluent
public final class ModelData {
    /*
     * A language map that contains the localized display names as specified in
     * the model definition.
     */
    @JsonProperty(value = "displayName")
    private Map<String, String> displayName;

    /*
     * A language map that contains the localized descriptions as specified in
     * the model definition.
     */
    @JsonProperty(value = "description")
    private Map<String, String> description;

    /*
     * The id of the model as specified in the model definition.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The time the model was uploaded to the service.
     */
    @JsonProperty(value = "uploadTime")
    private OffsetDateTime uploadTime;

    /*
     * Indicates if the model is decommissioned. Decommissioned models cannot
     * be referenced by newly created digital twins.
     */
    @JsonProperty(value = "decommissioned")
    private Boolean decommissioned;

    /*
     * The model definition.
     */
    @JsonProperty(value = "model")
    private Object model;

    /** Creates an instance of ModelData class. */
    @JsonCreator
    public ModelData(@JsonProperty(value = "id", required = true) String id) {
        this.id = id;
    }

    /**
     * Get the displayName property: A language map that contains the localized display names as specified in the model
     * definition.
     *
     * @return the displayName value.
     */
    public Map<String, String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: A language map that contains the localized display names as specified in the model
     * definition.
     *
     * @param displayName the displayName value to set.
     * @return the ModelData object itself.
     */
    public ModelData setDisplayName(Map<String, String> displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: A language map that contains the localized descriptions as specified in the model
     * definition.
     *
     * @return the description value.
     */
    public Map<String, String> getDescription() {
        return this.description;
    }

    /**
     * Set the description property: A language map that contains the localized descriptions as specified in the model
     * definition.
     *
     * @param description the description value to set.
     * @return the ModelData object itself.
     */
    public ModelData setDescription(Map<String, String> description) {
        this.description = description;
        return this;
    }

    /**
     * Get the id property: The id of the model as specified in the model definition.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the uploadTime property: The time the model was uploaded to the service.
     *
     * @return the uploadTime value.
     */
    public OffsetDateTime getUploadTime() {
        return this.uploadTime;
    }

    /**
     * Set the uploadTime property: The time the model was uploaded to the service.
     *
     * @param uploadTime the uploadTime value to set.
     * @return the ModelData object itself.
     */
    public ModelData setUploadTime(OffsetDateTime uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }

    /**
     * Get the decommissioned property: Indicates if the model is decommissioned. Decommissioned models cannot be
     * referenced by newly created digital twins.
     *
     * @return the decommissioned value.
     */
    public Boolean isDecommissioned() {
        return this.decommissioned;
    }

    /**
     * Set the decommissioned property: Indicates if the model is decommissioned. Decommissioned models cannot be
     * referenced by newly created digital twins.
     *
     * @param decommissioned the decommissioned value to set.
     * @return the ModelData object itself.
     */
    public ModelData setDecommissioned(Boolean decommissioned) {
        this.decommissioned = decommissioned;
        return this;
    }

    /**
     * Get the model property: The model definition.
     *
     * @return the model value.
     */
    public Object getModel() {
        return this.model;
    }

    /**
     * Set the model property: The model definition.
     *
     * @param model the model value to set.
     * @return the ModelData object itself.
     */
    public ModelData setModel(Object model) {
        this.model = model;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getId() == null) {
            throw new IllegalArgumentException("Missing required property id in model ModelData");
        }
    }
}
