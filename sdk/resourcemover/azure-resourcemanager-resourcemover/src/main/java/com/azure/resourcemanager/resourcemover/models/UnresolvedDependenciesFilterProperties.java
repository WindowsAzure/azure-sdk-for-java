// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UnresolvedDependenciesFilterProperties model. */
@Fluent
public final class UnresolvedDependenciesFilterProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UnresolvedDependenciesFilterProperties.class);

    /*
     * The count of the resource.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * Get the count property: The count of the resource.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: The count of the resource.
     *
     * @param count the count value to set.
     * @return the UnresolvedDependenciesFilterProperties object itself.
     */
    public UnresolvedDependenciesFilterProperties withCount(Integer count) {
        this.count = count;
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
