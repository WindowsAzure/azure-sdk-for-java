// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of Detector. */
@Immutable
public final class DetectorInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DetectorInfo.class);

    /*
     * Short description of the detector and its purpose
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Support Category
     */
    @JsonProperty(value = "category", access = JsonProperty.Access.WRITE_ONLY)
    private String category;

    /*
     * Support Sub Category
     */
    @JsonProperty(value = "subCategory", access = JsonProperty.Access.WRITE_ONLY)
    private String subCategory;

    /*
     * Support Topic Id
     */
    @JsonProperty(value = "supportTopicId", access = JsonProperty.Access.WRITE_ONLY)
    private String supportTopicId;

    /**
     * Get the description property: Short description of the detector and its purpose.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the category property: Support Category.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Get the subCategory property: Support Sub Category.
     *
     * @return the subCategory value.
     */
    public String subCategory() {
        return this.subCategory;
    }

    /**
     * Get the supportTopicId property: Support Topic Id.
     *
     * @return the supportTopicId value.
     */
    public String supportTopicId() {
        return this.supportTopicId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
