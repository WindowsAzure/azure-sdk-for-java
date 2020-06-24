/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.microsoft.azure.management.network.v2020_05_01.implementation.SubnetInner;
import com.microsoft.azure.management.network.v2020_05_01.implementation.PublicIPAddressInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * IP configuration.
 */
@JsonFlatten
public class IPConfiguration extends SubResource {
    /**
     * The private IP address of the IP configuration.
     */
    @JsonProperty(value = "properties.privateIPAddress")
    private String privateIPAddress;

    /**
     * The private IP address allocation method. Possible values include:
     * 'Static', 'Dynamic'.
     */
    @JsonProperty(value = "properties.privateIPAllocationMethod")
    private IPAllocationMethod privateIPAllocationMethod;

    /**
     * The reference to the subnet resource.
     */
    @JsonProperty(value = "properties.subnet")
    private SubnetInner subnet;

    /**
     * The reference to the public IP resource.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private PublicIPAddressInner publicIPAddress;

    /**
     * The provisioning state of the IP configuration resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the private IP address of the IP configuration.
     *
     * @return the privateIPAddress value
     */
    public String privateIPAddress() {
        return this.privateIPAddress;
    }

    /**
     * Set the private IP address of the IP configuration.
     *
     * @param privateIPAddress the privateIPAddress value to set
     * @return the IPConfiguration object itself.
     */
    public IPConfiguration withPrivateIPAddress(String privateIPAddress) {
        this.privateIPAddress = privateIPAddress;
        return this;
    }

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
     * @return the IPConfiguration object itself.
     */
    public IPConfiguration withPrivateIPAllocationMethod(IPAllocationMethod privateIPAllocationMethod) {
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        return this;
    }

    /**
     * Get the reference to the subnet resource.
     *
     * @return the subnet value
     */
    public SubnetInner subnet() {
        return this.subnet;
    }

    /**
     * Set the reference to the subnet resource.
     *
     * @param subnet the subnet value to set
     * @return the IPConfiguration object itself.
     */
    public IPConfiguration withSubnet(SubnetInner subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the reference to the public IP resource.
     *
     * @return the publicIPAddress value
     */
    public PublicIPAddressInner publicIPAddress() {
        return this.publicIPAddress;
    }

    /**
     * Set the reference to the public IP resource.
     *
     * @param publicIPAddress the publicIPAddress value to set
     * @return the IPConfiguration object itself.
     */
    public IPConfiguration withPublicIPAddress(PublicIPAddressInner publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
        return this;
    }

    /**
     * Get the provisioning state of the IP configuration resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
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
     * @return the IPConfiguration object itself.
     */
    public IPConfiguration withName(String name) {
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

}
