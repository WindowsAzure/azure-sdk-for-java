// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OutboundEnvironmentEndpointCollection model. */
@Fluent
public final class OutboundEnvironmentEndpointCollectionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OutboundEnvironmentEndpointCollectionInner.class);

    /*
     * Collection of resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<OutboundEnvironmentEndpointInner> value;

    /*
     * Link to next page of resources.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Collection of resources.
     *
     * @return the value value.
     */
    public List<OutboundEnvironmentEndpointInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     *
     * @param value the value value to set.
     * @return the OutboundEnvironmentEndpointCollectionInner object itself.
     */
    public OutboundEnvironmentEndpointCollectionInner withValue(List<OutboundEnvironmentEndpointInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
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
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model OutboundEnvironmentEndpointCollectionInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
