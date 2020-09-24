// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.fluent.inner.ManagedClusterInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ManagedClusterListResult model. */
@Fluent
public final class ManagedClusterListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterListResult.class);

    /*
     * The list of managed clusters.
     */
    @JsonProperty(value = "value")
    private List<ManagedClusterInner> value;

    /*
     * The URL to get the next set of managed cluster results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of managed clusters.
     *
     * @return the value value.
     */
    public List<ManagedClusterInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of managed clusters.
     *
     * @param value the value value to set.
     * @return the ManagedClusterListResult object itself.
     */
    public ManagedClusterListResult withValue(List<ManagedClusterInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of managed cluster results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
