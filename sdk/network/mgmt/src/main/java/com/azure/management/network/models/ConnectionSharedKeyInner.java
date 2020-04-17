// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ConnectionSharedKey model. */
@Fluent
public final class ConnectionSharedKeyInner extends SubResource {
    /*
     * The virtual network connection shared key value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the value property: The virtual network connection shared key value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The virtual network connection shared key value.
     *
     * @param value the value value to set.
     * @return the ConnectionSharedKeyInner object itself.
     */
    public ConnectionSharedKeyInner withValue(String value) {
        this.value = value;
        return this;
    }
}
