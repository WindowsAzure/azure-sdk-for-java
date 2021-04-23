// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.customerinsights.fluent.models.ViewResourceFormatInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of list view operation. */
@Fluent
public final class ViewListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ViewListResult.class);

    /*
     * Results of the list operation.
     */
    @JsonProperty(value = "value")
    private List<ViewResourceFormatInner> value;

    /*
     * Link to the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Results of the list operation.
     *
     * @return the value value.
     */
    public List<ViewResourceFormatInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Results of the list operation.
     *
     * @param value the value value to set.
     * @return the ViewListResult object itself.
     */
    public ViewListResult withValue(List<ViewResourceFormatInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ViewListResult object itself.
     */
    public ViewListResult withNextLink(String nextLink) {
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
