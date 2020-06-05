// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Operations List.null. */
@Fluent
public final class OperationListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationListResultInner.class);

    /*
     * A list of operations supported by Microsoft.ManagedIdentity Resource
     * Provider.
     */
    @JsonProperty(value = "value")
    private List<OperationInner> value;

    /*
     * The url to get the next page of results, if any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of operations supported by Microsoft.ManagedIdentity Resource Provider.
     *
     * @return the value value.
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of operations supported by Microsoft.ManagedIdentity Resource Provider.
     *
     * @param value the value value to set.
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withValue(List<OperationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The url to get the next page of results, if any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The url to get the next page of results, if any.
     *
     * @param nextLink the nextLink value to set.
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withNextLink(String nextLink) {
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
