// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ApplicationGatewayFrontendIPConfiguration model.
 */
@JsonFlatten
@Fluent
public class ApplicationGatewayFrontendIPConfiguration extends SubResource {
    /*
     * Name of the frontend IP configuration that is unique within an
     * Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * PrivateIPAddress of the network interface IP Configuration.
     */
    @JsonProperty(value = "properties.privateIPAddress")
    private String privateIPAddress;

    /*
     * IP address allocation method.
     */
    @JsonProperty(value = "properties.privateIPAllocationMethod")
    private IPAllocationMethod privateIPAllocationMethod;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.subnet")
    private SubResource subnet;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private SubResource publicIPAddress;

    /*
     * Provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name property: Name of the frontend IP configuration that is
     * unique within an Application Gateway.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the frontend IP configuration that is
     * unique within an Application Gateway.
     * 
     * @param name the name value to set.
     * @return the ApplicationGatewayFrontendIPConfiguration object itself.
     */
    public ApplicationGatewayFrontendIPConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @param etag the etag value to set.
     * @return the ApplicationGatewayFrontendIPConfiguration object itself.
     */
    public ApplicationGatewayFrontendIPConfiguration withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     * 
     * @param type the type value to set.
     * @return the ApplicationGatewayFrontendIPConfiguration object itself.
     */
    public ApplicationGatewayFrontendIPConfiguration withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the privateIPAddress property: PrivateIPAddress of the network
     * interface IP Configuration.
     * 
     * @return the privateIPAddress value.
     */
    public String privateIPAddress() {
        return this.privateIPAddress;
    }

    /**
     * Set the privateIPAddress property: PrivateIPAddress of the network
     * interface IP Configuration.
     * 
     * @param privateIPAddress the privateIPAddress value to set.
     * @return the ApplicationGatewayFrontendIPConfiguration object itself.
     */
    public ApplicationGatewayFrontendIPConfiguration withPrivateIPAddress(String privateIPAddress) {
        this.privateIPAddress = privateIPAddress;
        return this;
    }

    /**
     * Get the privateIPAllocationMethod property: IP address allocation
     * method.
     * 
     * @return the privateIPAllocationMethod value.
     */
    public IPAllocationMethod privateIPAllocationMethod() {
        return this.privateIPAllocationMethod;
    }

    /**
     * Set the privateIPAllocationMethod property: IP address allocation
     * method.
     * 
     * @param privateIPAllocationMethod the privateIPAllocationMethod value to
     * set.
     * @return the ApplicationGatewayFrontendIPConfiguration object itself.
     */
    public ApplicationGatewayFrontendIPConfiguration withPrivateIPAllocationMethod(IPAllocationMethod privateIPAllocationMethod) {
        this.privateIPAllocationMethod = privateIPAllocationMethod;
        return this;
    }

    /**
     * Get the subnet property: Reference to another subresource.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Reference to another subresource.
     * 
     * @param subnet the subnet value to set.
     * @return the ApplicationGatewayFrontendIPConfiguration object itself.
     */
    public ApplicationGatewayFrontendIPConfiguration withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIPAddress property: Reference to another subresource.
     * 
     * @return the publicIPAddress value.
     */
    public SubResource publicIPAddress() {
        return this.publicIPAddress;
    }

    /**
     * Set the publicIPAddress property: Reference to another subresource.
     * 
     * @param publicIPAddress the publicIPAddress value to set.
     * @return the ApplicationGatewayFrontendIPConfiguration object itself.
     */
    public ApplicationGatewayFrontendIPConfiguration withPublicIPAddress(SubResource publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the public IP
     * resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the public IP
     * resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayFrontendIPConfiguration object itself.
     */
    public ApplicationGatewayFrontendIPConfiguration withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }
}
