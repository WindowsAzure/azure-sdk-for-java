// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.inner.AutoApprovedPrivateLinkServiceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AutoApprovedPrivateLinkServicesResult model. */
@Fluent
public final class AutoApprovedPrivateLinkServicesResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutoApprovedPrivateLinkServicesResult.class);

    /*
     * An array of auto approved private link service.
     */
    @JsonProperty(value = "value")
    private List<AutoApprovedPrivateLinkServiceInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: An array of auto approved private link service.
     *
     * @return the value value.
     */
    public List<AutoApprovedPrivateLinkServiceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of auto approved private link service.
     *
     * @param value the value value to set.
     * @return the AutoApprovedPrivateLinkServicesResult object itself.
     */
    public AutoApprovedPrivateLinkServicesResult withValue(List<AutoApprovedPrivateLinkServiceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
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
