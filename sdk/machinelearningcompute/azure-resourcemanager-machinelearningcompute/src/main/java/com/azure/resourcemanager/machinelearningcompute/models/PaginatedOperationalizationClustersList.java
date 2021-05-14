// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningcompute.fluent.models.OperationalizationClusterInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Paginated list of operationalization clusters. */
@Fluent
public final class PaginatedOperationalizationClustersList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PaginatedOperationalizationClustersList.class);

    /*
     * An array of cluster objects.
     */
    @JsonProperty(value = "value")
    private List<OperationalizationClusterInner> value;

    /*
     * A continuation link (absolute URI) to the next page of results in the
     * list.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: An array of cluster objects.
     *
     * @return the value value.
     */
    public List<OperationalizationClusterInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of cluster objects.
     *
     * @param value the value value to set.
     * @return the PaginatedOperationalizationClustersList object itself.
     */
    public PaginatedOperationalizationClustersList withValue(List<OperationalizationClusterInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A continuation link (absolute URI) to the next page of results in the list.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A continuation link (absolute URI) to the next page of results in the list.
     *
     * @param nextLink the nextLink value to set.
     * @return the PaginatedOperationalizationClustersList object itself.
     */
    public PaginatedOperationalizationClustersList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
