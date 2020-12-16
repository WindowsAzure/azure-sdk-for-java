// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The IP address range in the CIDR scheme. */
@Fluent
public final class IpRange {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpRange.class);

    /*
     * The friendly name for the IP address range.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The IP address.
     */
    @JsonProperty(value = "address")
    private String address;

    /*
     * The subnet mask prefix length (see CIDR notation).
     */
    @JsonProperty(value = "subnetPrefixLength")
    private Integer subnetPrefixLength;

    /**
     * Get the name property: The friendly name for the IP address range.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The friendly name for the IP address range.
     *
     * @param name the name value to set.
     * @return the IpRange object itself.
     */
    public IpRange withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the address property: The IP address.
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: The IP address.
     *
     * @param address the address value to set.
     * @return the IpRange object itself.
     */
    public IpRange withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the subnetPrefixLength property: The subnet mask prefix length (see CIDR notation).
     *
     * @return the subnetPrefixLength value.
     */
    public Integer subnetPrefixLength() {
        return this.subnetPrefixLength;
    }

    /**
     * Set the subnetPrefixLength property: The subnet mask prefix length (see CIDR notation).
     *
     * @param subnetPrefixLength the subnetPrefixLength value to set.
     * @return the IpRange object itself.
     */
    public IpRange withSubnetPrefixLength(Integer subnetPrefixLength) {
        this.subnetPrefixLength = subnetPrefixLength;
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
