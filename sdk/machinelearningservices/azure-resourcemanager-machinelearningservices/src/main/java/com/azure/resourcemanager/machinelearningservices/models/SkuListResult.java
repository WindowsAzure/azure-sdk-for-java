// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.fluent.models.WorkspaceSkuInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of skus with features. */
@Fluent
public final class SkuListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuListResult.class);

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<WorkspaceSkuInner> value;

    /*
     * The URI to fetch the next page of Workspace Skus. Call ListNext() with
     * this URI to fetch the next page of Workspace Skus
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<WorkspaceSkuInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the SkuListResult object itself.
     */
    public SkuListResult withValue(List<WorkspaceSkuInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of Workspace Skus. Call ListNext() with this URI to
     * fetch the next page of Workspace Skus.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of Workspace Skus. Call ListNext() with this URI to
     * fetch the next page of Workspace Skus.
     *
     * @param nextLink the nextLink value to set.
     * @return the SkuListResult object itself.
     */
    public SkuListResult withNextLink(String nextLink) {
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
