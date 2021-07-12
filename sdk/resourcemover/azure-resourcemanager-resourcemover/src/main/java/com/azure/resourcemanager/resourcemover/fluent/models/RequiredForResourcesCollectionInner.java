// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Required for resources collection. */
@Fluent
public final class RequiredForResourcesCollectionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RequiredForResourcesCollectionInner.class);

    /*
     * Gets or sets the list of source Ids for which the input resource is
     * required.
     */
    @JsonProperty(value = "sourceIds")
    private List<String> sourceIds;

    /**
     * Get the sourceIds property: Gets or sets the list of source Ids for which the input resource is required.
     *
     * @return the sourceIds value.
     */
    public List<String> sourceIds() {
        return this.sourceIds;
    }

    /**
     * Set the sourceIds property: Gets or sets the list of source Ids for which the input resource is required.
     *
     * @param sourceIds the sourceIds value to set.
     * @return the RequiredForResourcesCollectionInner object itself.
     */
    public RequiredForResourcesCollectionInner withSourceIds(List<String> sourceIds) {
        this.sourceIds = sourceIds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
