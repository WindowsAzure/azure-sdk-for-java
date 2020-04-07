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
import java.util.List;

/**
 * The ContainerNetworkInterface model.
 */
@JsonFlatten
@Fluent
public class ContainerNetworkInterface extends SubResource {
    /*
     * The name of the resource. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Sub Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Container network interface configuration child resource.
     */
    @JsonProperty(value = "properties.containerNetworkInterfaceConfiguration")
    private ContainerNetworkInterfaceConfiguration containerNetworkInterfaceConfiguration;

    /*
     * Reference to container resource in remote resource provider.
     */
    @JsonProperty(value = "properties.container")
    private Container container;

    /*
     * Reference to the ip configuration on this container nic.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<ContainerNetworkInterfaceIpConfiguration> ipConfigurations;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the name property: The name of the resource. This name can be used
     * to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource. This name can be used
     * to access the resource.
     * 
     * @param name the name value to set.
     * @return the ContainerNetworkInterface object itself.
     */
    public ContainerNetworkInterface withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Sub Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
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
     * @return the ContainerNetworkInterface object itself.
     */
    public ContainerNetworkInterface withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the containerNetworkInterfaceConfiguration property: Container
     * network interface configuration child resource.
     * 
     * @return the containerNetworkInterfaceConfiguration value.
     */
    public ContainerNetworkInterfaceConfiguration containerNetworkInterfaceConfiguration() {
        return this.containerNetworkInterfaceConfiguration;
    }

    /**
     * Set the containerNetworkInterfaceConfiguration property: Container
     * network interface configuration child resource.
     * 
     * @param containerNetworkInterfaceConfiguration the
     * containerNetworkInterfaceConfiguration value to set.
     * @return the ContainerNetworkInterface object itself.
     */
    public ContainerNetworkInterface withContainerNetworkInterfaceConfiguration(ContainerNetworkInterfaceConfiguration containerNetworkInterfaceConfiguration) {
        this.containerNetworkInterfaceConfiguration = containerNetworkInterfaceConfiguration;
        return this;
    }

    /**
     * Get the container property: Reference to container resource in remote
     * resource provider.
     * 
     * @return the container value.
     */
    public Container container() {
        return this.container;
    }

    /**
     * Set the container property: Reference to container resource in remote
     * resource provider.
     * 
     * @param container the container value to set.
     * @return the ContainerNetworkInterface object itself.
     */
    public ContainerNetworkInterface withContainer(Container container) {
        this.container = container;
        return this;
    }

    /**
     * Get the ipConfigurations property: Reference to the ip configuration on
     * this container nic.
     * 
     * @return the ipConfigurations value.
     */
    public List<ContainerNetworkInterfaceIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: Reference to the ip configuration on
     * this container nic.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the ContainerNetworkInterface object itself.
     */
    public ContainerNetworkInterface withIpConfigurations(List<ContainerNetworkInterfaceIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the
     * resource.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }
}
