// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AddressSpace model. */
@Fluent
public final class AddressSpace {
    /*
     * A list of address blocks reserved for this virtual network in CIDR
     * notation.
     */
    @JsonProperty(value = "addressPrefixes")
    private List<String> addressPrefixes;

    /**
     * Get the addressPrefixes property: A list of address blocks reserved for this virtual network in CIDR notation.
     *
     * @return the addressPrefixes value.
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Set the addressPrefixes property: A list of address blocks reserved for this virtual network in CIDR notation.
     *
     * @param addressPrefixes the addressPrefixes value to set.
     * @return the AddressSpace object itself.
     */
    public AddressSpace withAddressPrefixes(List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
        return this;
    }
}
