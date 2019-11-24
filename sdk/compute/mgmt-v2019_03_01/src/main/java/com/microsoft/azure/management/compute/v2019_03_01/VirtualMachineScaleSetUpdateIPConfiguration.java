/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01;

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
     * Specifies an array of references to application security group.
     */
    @JsonProperty(value = "properties.applicationSecurityGroups")
    private List<SubResource> applicationSecurityGroups;

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
     * Get the IP configuration name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the IP configuration name.
     *
     * @param name the name value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subnet.
     *
     * @return the subnet value
     */
    public ApiEntityReference subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet.
     *
     * @param subnet the subnet value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withSubnet(ApiEntityReference subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get specifies the primary IP Configuration in case the network interface has more than one IP Configuration.
     *
     * @return the primary value
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set specifies the primary IP Configuration in case the network interface has more than one IP Configuration.
     *
     * @param primary the primary value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the publicIPAddressConfiguration.
     *
     * @return the publicIPAddressConfiguration value
     */
    public VirtualMachineScaleSetUpdatePublicIPAddressConfiguration publicIPAddressConfiguration() {
        return this.publicIPAddressConfiguration;
    }

    /**
     * Set the publicIPAddressConfiguration.
     *
     * @param publicIPAddressConfiguration the publicIPAddressConfiguration value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withPublicIPAddressConfiguration(VirtualMachineScaleSetUpdatePublicIPAddressConfiguration publicIPAddressConfiguration) {
        this.publicIPAddressConfiguration = publicIPAddressConfiguration;
        return this;
    }

    /**
     * Get available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: 'IPv4' and 'IPv6'. Possible values include: 'IPv4', 'IPv6'.
     *
     * @return the privateIPAddressVersion value
     */
    public IPVersion privateIPAddressVersion() {
        return this.privateIPAddressVersion;
    }

    /**
     * Set available from Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.  Possible values are: 'IPv4' and 'IPv6'. Possible values include: 'IPv4', 'IPv6'.
     *
     * @param privateIPAddressVersion the privateIPAddressVersion value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withPrivateIPAddressVersion(IPVersion privateIPAddressVersion) {
        this.privateIPAddressVersion = privateIPAddressVersion;
        return this;
    }

    /**
     * Get the application gateway backend address pools.
     *
     * @return the applicationGatewayBackendAddressPools value
     */
    public List<SubResource> applicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools;
    }

    /**
     * Set the application gateway backend address pools.
     *
     * @param applicationGatewayBackendAddressPools the applicationGatewayBackendAddressPools value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withApplicationGatewayBackendAddressPools(List<SubResource> applicationGatewayBackendAddressPools) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        return this;
    }

    /**
     * Get specifies an array of references to application security group.
     *
     * @return the applicationSecurityGroups value
     */
    public List<SubResource> applicationSecurityGroups() {
        return this.applicationSecurityGroups;
    }

    /**
     * Set specifies an array of references to application security group.
     *
     * @param applicationSecurityGroups the applicationSecurityGroups value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withApplicationSecurityGroups(List<SubResource> applicationSecurityGroups) {
        this.applicationSecurityGroups = applicationSecurityGroups;
        return this;
    }

    /**
     * Get the load balancer backend address pools.
     *
     * @return the loadBalancerBackendAddressPools value
     */
    public List<SubResource> loadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools;
    }

    /**
     * Set the load balancer backend address pools.
     *
     * @param loadBalancerBackendAddressPools the loadBalancerBackendAddressPools value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withLoadBalancerBackendAddressPools(List<SubResource> loadBalancerBackendAddressPools) {
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        return this;
    }

    /**
     * Get the load balancer inbound nat pools.
     *
     * @return the loadBalancerInboundNatPools value
     */
    public List<SubResource> loadBalancerInboundNatPools() {
        return this.loadBalancerInboundNatPools;
    }

    /**
     * Set the load balancer inbound nat pools.
     *
     * @param loadBalancerInboundNatPools the loadBalancerInboundNatPools value to set
     * @return the VirtualMachineScaleSetUpdateIPConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateIPConfiguration withLoadBalancerInboundNatPools(List<SubResource> loadBalancerInboundNatPools) {
        this.loadBalancerInboundNatPools = loadBalancerInboundNatPools;
        return this;
    }

}
