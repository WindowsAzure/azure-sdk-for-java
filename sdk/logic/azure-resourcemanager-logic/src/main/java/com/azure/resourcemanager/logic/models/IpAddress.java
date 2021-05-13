// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ip address. */
@Fluent
public final class IpAddress {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpAddress.class);

    /*
     * The address.
     */
    @JsonProperty(value = "address")
    private String address;

    /**
     * Get the address property: The address.
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: The address.
     *
     * @param address the address value to set.
     * @return the IpAddress object itself.
     */
    public IpAddress withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
