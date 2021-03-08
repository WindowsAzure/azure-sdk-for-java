// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.relay.fluent.models.RelayNamespaceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response from the list namespace operation. */
@Fluent
public final class RelayNamespaceListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RelayNamespaceListResult.class);

    /*
     * Result of the list namespace operation.
     */
    @JsonProperty(value = "value")
    private List<RelayNamespaceInner> value;

    /*
     * Link to the next set of results. Not empty if value contains incomplete
     * list of namespaces.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Result of the list namespace operation.
     *
     * @return the value value.
     */
    public List<RelayNamespaceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the list namespace operation.
     *
     * @param value the value value to set.
     * @return the RelayNamespaceListResult object itself.
     */
    public RelayNamespaceListResult withValue(List<RelayNamespaceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if value contains incomplete list of
     * namespaces.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if value contains incomplete list of
     * namespaces.
     *
     * @param nextLink the nextLink value to set.
     * @return the RelayNamespaceListResult object itself.
     */
    public RelayNamespaceListResult withNextLink(String nextLink) {
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
