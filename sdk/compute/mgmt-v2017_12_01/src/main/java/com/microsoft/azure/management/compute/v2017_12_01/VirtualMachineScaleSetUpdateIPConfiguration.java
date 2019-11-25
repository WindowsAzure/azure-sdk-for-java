/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a virtual machine scale set network profile's IP configuration.
 */
@JsonFlatten
public class VirtualMachineScaleSetUpdateIPConfiguration extends SubResource {
    /**
     * The IP configuration name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The subnet.
     */
    @JsonProperty(value = "properties.subnet")
    private ApiEntityReference subnet;

    /**
     * Specifies the primary IP Configuration in case the network interface has
     * more than one IP Configuration.
     */
    @JsonProperty(value = "properties.primary")
    private Boolean primary;

    /**
     * The publicIPAddressConfiguration.
     */
    @JsonProperty(value = "properties.publicIPAddressConfiguration")
    private VirtualMachineScaleSetUpdatePublicIPAddressConfiguration publicIPAddressConfiguration;

    /**
     * Available from Api-Version 2017-03-30 onwards, it represents whether the
     * specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.
     * Possible values are: 'IPv4' and 'IPv6'. Possible values include: 'IPv4',
     * 'IPv6'.
     */
    @JsonProperty(value = "properties.privateIPAddressVersion")
    private IPVersion privateIPAddressVersion;

    /**
     * The application gateway backend address pools.
     */
    @JsonProperty(value = "properties.applicationGatewayBackendAddressPools")
    private List<SubResource> applicationGatewayBackendAddressPools;

    /**
     * The load balancer backend address pools.
     */
    @JsonProperty(value = "properties.loadBalancerBackendAddressPools")
    private List<SubResource> loadBalancerBackendAddressPools;

    /**
     * The load balancer inbound nat pools.
     */
    @JsonProperty(value = "properties.loadBalancerInboundNatPools")
    private List<SubResource> loadBalancerInboundNatPools;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subnet value.
     *
     * @return the subnet value
     */
    public ApiEntityReference subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet value.
     *
     * @param subnet the subnet value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withSubnet(ApiEntityReference subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the primary value.
     *
     * @return the primary value
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary value.
     *
     * @param primary the primary value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the publicIPAddressConfiguration value.
     *
     * @return the publicIPAddressConfiguration value
     */
    public VirtualMachineScaleSetUpdatePublicIPAddressConfiguration publicIPAddressConfiguration() {
        return this.publicIPAddressConfiguration;
    }

    /**
     * Set the publicIPAddressConfiguration value.
     *
     * @param publicIPAddressConfiguration the publicIPAddressConfiguration value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withPublicIPAddressConfiguration(VirtualMachineScaleSetUpdatePublicIPAddressConfiguration publicIPAddressConfiguration) {
        this.publicIPAddressConfiguration = publicIPAddressConfiguration;
        return this;
    }

    /**
     * Get the privateIPAddressVersion value.
     *
     * @return the privateIPAddressVersion value
     */
    public IPVersion privateIPAddressVersion() {
        return this.privateIPAddressVersion;
    }

    /**
     * Set the privateIPAddressVersion value.
     *
     * @param privateIPAddressVersion the privateIPAddressVersion value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withPrivateIPAddressVersion(IPVersion privateIPAddressVersion) {
        this.privateIPAddressVersion = privateIPAddressVersion;
        return this;
    }

    /**
     * Get the applicationGatewayBackendAddressPools value.
     *
     * @return the applicationGatewayBackendAddressPools value
     */
    public List<SubResource> applicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools;
    }

    /**
     * Set the applicationGatewayBackendAddressPools value.
     *
     * @param applicationGatewayBackendAddressPools the applicationGatewayBackendAddressPools value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withApplicationGatewayBackendAddressPools(List<SubResource> applicationGatewayBackendAddressPools) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        return this;
    }

    /**
     * Get the loadBalancerBackendAddressPools value.
     *
     * @return the loadBalancerBackendAddressPools value
     */
    public List<SubResource> loadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools;
    }

    /**
     * Set the loadBalancerBackendAddressPools value.
     *
     * @param loadBalancerBackendAddressPools the loadBalancerBackendAddressPools value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withLoadBalancerBackendAddressPools(List<SubResource> loadBalancerBackendAddressPools) {
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        return this;
    }

    /**
     * Get the loadBalancerInboundNatPools value.
     *
     * @return the loadBalancerInboundNatPools value
     */
    public List<SubResource> loadBalancerInboundNatPools() {
        return this.loadBalancerInboundNatPools;
    }

    /**
     * Set the loadBalancerInboundNatPools value.
     *
     * @param loadBalancerInboundNatPools the loadBalancerInboundNatPools value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withLoadBalancerInboundNatPools(List<SubResource> loadBalancerInboundNatPools) {
        this.loadBalancerInboundNatPools = loadBalancerInboundNatPools;
        return this;
    }

}
