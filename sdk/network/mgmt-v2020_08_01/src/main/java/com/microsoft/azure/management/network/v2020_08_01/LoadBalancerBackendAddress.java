/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Load balancer backend addresses.
 */
@JsonFlatten
public class LoadBalancerBackendAddress {
    /**
     * Reference to an existing virtual network.
     */
    @JsonProperty(value = "properties.virtualNetwork")
    private SubResource virtualNetwork;

    /**
     * IP Address belonging to the referenced virtual network.
     */
    @JsonProperty(value = "properties.ipAddress")
    private String ipAddress;

    /**
     * Reference to IP address defined in network interfaces.
     */
    @JsonProperty(value = "properties.networkInterfaceIPConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource networkInterfaceIPConfiguration;

    /**
     * Reference to the frontend ip address configuration defined in regional
     * loadbalancer.
     */
    @JsonProperty(value = "properties.loadBalancerFrontendIPConfiguration")
    private SubResource loadBalancerFrontendIPConfiguration;

    /**
     * Name of the backend address.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get reference to an existing virtual network.
     *
     * @return the virtualNetwork value
     */
    public SubResource virtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Set reference to an existing virtual network.
     *
     * @param virtualNetwork the virtualNetwork value to set
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withVirtualNetwork(SubResource virtualNetwork) {
        this.virtualNetwork = virtualNetwork;
        return this;
    }

    /**
     * Get iP Address belonging to the referenced virtual network.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set iP Address belonging to the referenced virtual network.
     *
     * @param ipAddress the ipAddress value to set
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get reference to IP address defined in network interfaces.
     *
     * @return the networkInterfaceIPConfiguration value
     */
    public SubResource networkInterfaceIPConfiguration() {
        return this.networkInterfaceIPConfiguration;
    }

    /**
     * Get reference to the frontend ip address configuration defined in regional loadbalancer.
     *
     * @return the loadBalancerFrontendIPConfiguration value
     */
    public SubResource loadBalancerFrontendIPConfiguration() {
        return this.loadBalancerFrontendIPConfiguration;
    }

    /**
     * Set reference to the frontend ip address configuration defined in regional loadbalancer.
     *
     * @param loadBalancerFrontendIPConfiguration the loadBalancerFrontendIPConfiguration value to set
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withLoadBalancerFrontendIPConfiguration(SubResource loadBalancerFrontendIPConfiguration) {
        this.loadBalancerFrontendIPConfiguration = loadBalancerFrontendIPConfiguration;
        return this;
    }

    /**
     * Get name of the backend address.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the backend address.
     *
     * @param name the name value to set
     * @return the LoadBalancerBackendAddress object itself.
     */
    public LoadBalancerBackendAddress withName(String name) {
        this.name = name;
        return this;
    }

}
