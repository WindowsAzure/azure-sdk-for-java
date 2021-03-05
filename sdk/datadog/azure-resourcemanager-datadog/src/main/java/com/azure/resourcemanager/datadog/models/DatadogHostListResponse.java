// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datadog.fluent.models.DatadogHostInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response of a list operation. */
@Fluent
public final class DatadogHostListResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatadogHostListResponse.class);

    /*
     * Results of a list operation.
     */
    @JsonProperty(value = "value")
    private List<DatadogHostInner> value;

    /*
     * Link to the next set of results, if any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Results of a list operation.
     *
     * @return the value value.
     */
    public List<DatadogHostInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Results of a list operation.
     *
     * @param value the value value to set.
     * @return the DatadogHostListResponse object itself.
     */
    public DatadogHostListResponse withValue(List<DatadogHostInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results, if any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results, if any.
     *
     * @param nextLink the nextLink value to set.
     * @return the DatadogHostListResponse object itself.
     */
    public DatadogHostListResponse withNextLink(String nextLink) {
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
