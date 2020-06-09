// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Identifier model. */
@JsonFlatten
@Fluent
public class IdentifierInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IdentifierInner.class);

    /*
     * String representation of the identity.
     */
    @JsonProperty(value = "properties.id")
    private String value;

    /**
     * Get the value property: String representation of the identity.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: String representation of the identity.
     *
     * @param value the value value to set.
     * @return the IdentifierInner object itself.
     */
    public IdentifierInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
