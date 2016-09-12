/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.IPAllocationMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Frontend IP address of the load balancer.
 */
@JsonFlatten
public class FrontendIPConfigurationInner extends SubResource {
    /**
     * Read only. Inbound rules URIs that use this frontend IP.
     */
    @JsonProperty(value = "properties.inboundNatRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> inboundNatRules;

    /**
     * Read only. Inbound pools URIs that use this frontend IP.
     */
    @JsonProperty(value = "properties.inboundNatPools", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> inboundNatPools;

    /**
     * Read only. Outbound rules URIs that use this frontend IP.
     */
    @JsonProperty(value = "properties.outboundNatRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> outboundNatRules;

    /**
     * Gets Load Balancing rules URIs that use this frontend IP.
     */
    @JsonProperty(value = "properties.loadBalancingRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> loadBalancingRules;

    /**
     * Gets or sets the privateIPAddress of the IP Configuration.
     */
    @JsonProperty(value = "properties.privateIPAddress")
    private String privateIPAddress;

    /**
     * Gets or sets PrivateIP allocation method. Possible values include:
     * 'Static', 'Dynamic'.
     */
    @JsonProperty(value = "properties.privateIPAllocationMethod")
    private IPAllocationMethod privateIPAllocationMethod;

    /**
     * Gets or sets the reference of the subnet resource.
     */
    @JsonProperty(value = "properties.subnet")
    private SubResource subnet;

    /**
     * Gets or sets the reference of the PublicIP resource.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private SubResource publicIPAddress;

    /**
     * Gets provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Get the inboundNatRules value.
     *
     * @return the inboundNatRules value
     */
    public List<SubResource> inboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Get the inboundNatPools value.
     *
     * @return the inboundNatPools value
     */
    public List<SubResource> inboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Get the outboundNatRules value.
     *
     * @return the outboundNatRules value
     */
    public List<SubResource> outboundNatRules() {
        return this.outboundNatRules;
    }

    /**
     * Get the loadBalancingRules value.
     *
     * @return the loadBalancingRules value
     */
    public List<SubResource> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Get the privateIPAddress value.
     *
     * @return the privateIPAddress value
     */
    public String privateIPAddress() {
        return this.privateIPAddress;
    }

    /**
     * Set the privateIPAddress value.
     *
     * @param privateIPAddress the privateIPAddress value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withPrivateIPAddress(String privateIPAddress) {
        this.privateIPAddress = privateIPAddress;
        return this;
    }

    /**
     * Get the privateIPAllocationMethod value.
     *
     * @return the privateIPAllocationMethod value
     */
    public IPAllocationMethod privateIPAllocationMethod() {
        return this.privateIPAllocationMethod;
    }

    /**
     * Set the privateIPAllocationMethod value.
     *
     * @param privateIPAllocationMethod the privateIPAllocationMethod value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withPrivateIPAllocationMethod(IPAllocationMethod privateIPAllocationMethod) {
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        return this;
    }

    /**
     * Get the subnet value.
     *
     * @return the subnet value
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet value.
     *
     * @param subnet the subnet value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIPAddress value.
     *
     * @return the publicIPAddress value
     */
    public SubResource publicIPAddress() {
        return this.publicIPAddress;
    }

    /**
     * Set the publicIPAddress value.
     *
     * @param publicIPAddress the publicIPAddress value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withPublicIPAddress(SubResource publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

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
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the FrontendIPConfigurationInner object itself.
     */
    public FrontendIPConfigurationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
