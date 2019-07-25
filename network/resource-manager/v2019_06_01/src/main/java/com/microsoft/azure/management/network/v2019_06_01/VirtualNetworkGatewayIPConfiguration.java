/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * IP configuration for virtual network gateway.
 */
@JsonFlatten
public class VirtualNetworkGatewayIPConfiguration extends SubResource {
    /**
     * The private IP address allocation method. Possible values include:
     * 'Static', 'Dynamic'.
     */
    @JsonProperty(value = "properties.privateIPAllocationMethod")
    private IPAllocationMethod privateIPAllocationMethod;

    /**
     * The reference of the subnet resource.
     */
    @JsonProperty(value = "properties.subnet")
    private SubResource subnet;

    /**
     * The reference of the public IP resource.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private SubResource publicIPAddress;

    /**
     * The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the private IP address allocation method. Possible values include: 'Static', 'Dynamic'.
     *
     * @return the privateIPAllocationMethod value
     */
    public IPAllocationMethod privateIPAllocationMethod() {
        return this.privateIPAllocationMethod;
    }

    /**
     * Set the private IP address allocation method. Possible values include: 'Static', 'Dynamic'.
     *
     * @param privateIPAllocationMethod the privateIPAllocationMethod value to set
     * @return the VirtualNetworkGatewayIPConfiguration object itself.
     */
    public VirtualNetworkGatewayIPConfiguration withPrivateIPAllocationMethod(IPAllocationMethod privateIPAllocationMethod) {
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        return this;
    }

    /**
     * Get the reference of the subnet resource.
     *
     * @return the subnet value
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the reference of the subnet resource.
     *
     * @param subnet the subnet value to set
     * @return the VirtualNetworkGatewayIPConfiguration object itself.
     */
    public VirtualNetworkGatewayIPConfiguration withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the reference of the public IP resource.
     *
     * @return the publicIPAddress value
     */
    public SubResource publicIPAddress() {
        return this.publicIPAddress;
    }

    /**
     * Set the reference of the public IP resource.
     *
     * @param publicIPAddress the publicIPAddress value to set
     * @return the VirtualNetworkGatewayIPConfiguration object itself.
     */
    public VirtualNetworkGatewayIPConfiguration withPublicIPAddress(SubResource publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
        return this;
    }

    /**
     * Get the provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the VirtualNetworkGatewayIPConfiguration object itself.
     */
    public VirtualNetworkGatewayIPConfiguration withName(String name) {
        this.name = name;
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
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the VirtualNetworkGatewayIPConfiguration object itself.
     */
    public VirtualNetworkGatewayIPConfiguration withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
