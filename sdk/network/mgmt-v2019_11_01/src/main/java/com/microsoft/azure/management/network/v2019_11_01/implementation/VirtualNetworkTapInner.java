/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_11_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Virtual Network Tap resource.
 */
@JsonFlatten
@SkipParentValidation
public class VirtualNetworkTapInner extends Resource {
    /**
     * Specifies the list of resource IDs for the network interface IP
     * configuration that needs to be tapped.
     */
    @JsonProperty(value = "properties.networkInterfaceTapConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceTapConfigurationInner> networkInterfaceTapConfigurations;

    /**
     * The resource GUID property of the virtual network tap resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * The provisioning state of the virtual network tap resource. Possible
     * values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The reference to the private IP Address of the collector nic that will
     * receive the tap.
     */
    @JsonProperty(value = "properties.destinationNetworkInterfaceIPConfiguration")
    private NetworkInterfaceIPConfigurationInner destinationNetworkInterfaceIPConfiguration;

    /**
     * The reference to the private IP address on the internal Load Balancer
     * that will receive the tap.
     */
    @JsonProperty(value = "properties.destinationLoadBalancerFrontEndIPConfiguration")
    private FrontendIPConfigurationInner destinationLoadBalancerFrontEndIPConfiguration;

    /**
     * The VXLAN destination port that will receive the tapped traffic.
     */
    @JsonProperty(value = "properties.destinationPort")
    private Integer destinationPort;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get specifies the list of resource IDs for the network interface IP configuration that needs to be tapped.
     *
     * @return the networkInterfaceTapConfigurations value
     */
    public List<NetworkInterfaceTapConfigurationInner> networkInterfaceTapConfigurations() {
        return this.networkInterfaceTapConfigurations;
    }

    /**
     * Get the resource GUID property of the virtual network tap resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioning state of the virtual network tap resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the reference to the private IP Address of the collector nic that will receive the tap.
     *
     * @return the destinationNetworkInterfaceIPConfiguration value
     */
    public NetworkInterfaceIPConfigurationInner destinationNetworkInterfaceIPConfiguration() {
        return this.destinationNetworkInterfaceIPConfiguration;
    }

    /**
     * Set the reference to the private IP Address of the collector nic that will receive the tap.
     *
     * @param destinationNetworkInterfaceIPConfiguration the destinationNetworkInterfaceIPConfiguration value to set
     * @return the VirtualNetworkTapInner object itself.
     */
    public VirtualNetworkTapInner withDestinationNetworkInterfaceIPConfiguration(NetworkInterfaceIPConfigurationInner destinationNetworkInterfaceIPConfiguration) {
        this.destinationNetworkInterfaceIPConfiguration = destinationNetworkInterfaceIPConfiguration;
        return this;
    }

    /**
     * Get the reference to the private IP address on the internal Load Balancer that will receive the tap.
     *
     * @return the destinationLoadBalancerFrontEndIPConfiguration value
     */
    public FrontendIPConfigurationInner destinationLoadBalancerFrontEndIPConfiguration() {
        return this.destinationLoadBalancerFrontEndIPConfiguration;
    }

    /**
     * Set the reference to the private IP address on the internal Load Balancer that will receive the tap.
     *
     * @param destinationLoadBalancerFrontEndIPConfiguration the destinationLoadBalancerFrontEndIPConfiguration value to set
     * @return the VirtualNetworkTapInner object itself.
     */
    public VirtualNetworkTapInner withDestinationLoadBalancerFrontEndIPConfiguration(FrontendIPConfigurationInner destinationLoadBalancerFrontEndIPConfiguration) {
        this.destinationLoadBalancerFrontEndIPConfiguration = destinationLoadBalancerFrontEndIPConfiguration;
        return this;
    }

    /**
     * Get the VXLAN destination port that will receive the tapped traffic.
     *
     * @return the destinationPort value
     */
    public Integer destinationPort() {
        return this.destinationPort;
    }

    /**
     * Set the VXLAN destination port that will receive the tapped traffic.
     *
     * @param destinationPort the destinationPort value to set
     * @return the VirtualNetworkTapInner object itself.
     */
    public VirtualNetworkTapInner withDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the VirtualNetworkTapInner object itself.
     */
    public VirtualNetworkTapInner withId(String id) {
        this.id = id;
        return this;
    }

}
