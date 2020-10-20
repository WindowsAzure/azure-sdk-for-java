// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.fluent.models.ProviderOperationsMetadataInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Provider operations metadata list. */
@Fluent
public final class ProviderOperationsMetadataListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProviderOperationsMetadataListResult.class);

    /*
     * The list of providers.
     */
    @JsonProperty(value = "value")
    private List<ProviderOperationsMetadataInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of providers.
     *
     * @return the value value.
     */
    public List<ProviderOperationsMetadataInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of providers.
     *
     * @param value the value value to set.
     * @return the ProviderOperationsMetadataListResult object itself.
     */
    public ProviderOperationsMetadataListResult withValue(List<ProviderOperationsMetadataInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ProviderOperationsMetadataListResult object itself.
     */
    public ProviderOperationsMetadataListResult withNextLink(String nextLink) {
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
