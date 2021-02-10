// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specification for using a Virtual Network. */
@Fluent
public final class VirtualNetworkProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkProfile.class);

    /*
     * Resource id of the Virtual Network.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Name of the Virtual Network (read-only).
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type of the Virtual Network (read-only).
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Subnet within the Virtual Network.
     */
    @JsonProperty(value = "subnet")
    private String subnet;

    /**
     * Get the id property: Resource id of the Virtual Network.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource id of the Virtual Network.
     *
     * @param id the id value to set.
     * @return the VirtualNetworkProfile object itself.
     */
    public VirtualNetworkProfile withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name of the Virtual Network (read-only).
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type of the Virtual Network (read-only).
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the subnet property: Subnet within the Virtual Network.
     *
     * @return the subnet value.
     */
    public String subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Subnet within the Virtual Network.
     *
     * @param subnet the subnet value to set.
     * @return the VirtualNetworkProfile object itself.
     */
    public VirtualNetworkProfile withSubnet(String subnet) {
        this.subnet = subnet;
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
