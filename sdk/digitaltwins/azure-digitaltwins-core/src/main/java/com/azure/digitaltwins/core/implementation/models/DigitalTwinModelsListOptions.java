// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DigitalTwinModelsListOptions model. */
@Fluent
public final class DigitalTwinModelsListOptions {
    /*
     * The maximum number of items to retrieve per request. The server may
     * choose to return less than the requested max.
     */
    @JsonProperty(value = "MaxItemCount")
    private Integer maxItemCount;

    /**
     * Get the maxItemCount property: The maximum number of items to retrieve per request. The server may choose to
     * return less than the requested max.
     *
     * @return the maxItemCount value.
     */
    public Integer getMaxItemCount() {
        return this.maxItemCount;
    }

    /**
     * Set the maxItemCount property: The maximum number of items to retrieve per request. The server may choose to
     * return less than the requested max.
     *
     * @param maxItemCount the maxItemCount value to set.
     * @return the DigitalTwinModelsListOptions object itself.
     */
    public DigitalTwinModelsListOptions setMaxItemCount(Integer maxItemCount) {
        this.maxItemCount = maxItemCount;
        return this;
    }
}
