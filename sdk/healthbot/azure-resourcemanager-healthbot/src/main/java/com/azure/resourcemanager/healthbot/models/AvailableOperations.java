// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.healthbot.fluent.models.OperationDetailInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Available operations of the service. */
@Fluent
public final class AvailableOperations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailableOperations.class);

    /*
     * Collection of available operation details
     */
    @JsonProperty(value = "value")
    private List<OperationDetailInner> value;

    /*
     * URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Collection of available operation details.
     *
     * @return the value value.
     */
    public List<OperationDetailInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of available operation details.
     *
     * @param value the value value to set.
     * @return the AvailableOperations object itself.
     */
    public AvailableOperations withValue(List<OperationDetailInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL client should use to fetch the next page (per server side paging). It's null for
     * now, added for future use.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL client should use to fetch the next page (per server side paging). It's null for
     * now, added for future use.
     *
     * @param nextLink the nextLink value to set.
     * @return the AvailableOperations object itself.
     */
    public AvailableOperations withNextLink(String nextLink) {
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
