// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Load balancer backend addresses. */
@JsonFlatten
@Fluent
public class LoadBalancerBackendAddress {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoadBalancerBackendAddress.class);

    /*
     * Name of the backend address.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Reference to an existing virtual network.
     */
    @JsonProperty(value = "properties.virtualNetwork")
    private SubResource virtualNetwork;

    /*
     * IP Address belonging to the referenced virtual network.
     */
    @JsonProperty(value = "properties.ipAddress")
    private String ipAddress;

    /*
     * Reference to IP address defined in network interfaces.
     */
    @JsonProperty(value = "properties.networkInterfaceIPConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource networkInterfaceIpConfiguration;

    /**
     * Get the name property: Name of the backend address.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the backend address.
     *
     * @param name the name value to set.
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the virtualNetwork property: Reference to an existing virtual network.
     *
     * @return the virtualNetwork value.
     */
    public SubResource virtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Set the virtualNetwork property: Reference to an existing virtual network.
     *
     * @param virtualNetwork the virtualNetwork value to set.
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withVirtualNetwork(SubResource virtualNetwork) {
        this.virtualNetwork = virtualNetwork;
        return this;
    }

    /**
     * Get the ipAddress property: IP Address belonging to the referenced virtual network.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: IP Address belonging to the referenced virtual network.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the networkInterfaceIpConfiguration property: Reference to IP address defined in network interfaces.
     *
     * @return the networkInterfaceIpConfiguration value.
     */
    public SubResource networkInterfaceIpConfiguration() {
        return this.networkInterfaceIpConfiguration;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
