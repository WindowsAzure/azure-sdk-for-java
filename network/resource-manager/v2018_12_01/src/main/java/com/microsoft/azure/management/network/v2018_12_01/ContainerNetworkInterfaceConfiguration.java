/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Container network interface configuration child resource.
 */
@JsonFlatten
public class ContainerNetworkInterfaceConfiguration extends SubResource {
    /**
     * A list of ip configurations of the container network interface
     * configuration.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<IPConfigurationProfile> ipConfigurations;

    /**
     * A list of container network interfaces created from this container
     * network interface configuration.
     */
    @JsonProperty(value = "properties.containerNetworkInterfaces")
    private List<SubResource> containerNetworkInterfaces;

    /**
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The name of the resource. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Sub Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get a list of ip configurations of the container network interface configuration.
     *
     * @return the ipConfigurations value
     */
    public List<IPConfigurationProfile> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set a list of ip configurations of the container network interface configuration.
     *
     * @param ipConfigurations the ipConfigurations value to set
     * @return the ContainerNetworkInterfaceConfiguration object itself.
     */
    public ContainerNetworkInterfaceConfiguration withIpConfigurations(List<IPConfigurationProfile> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get a list of container network interfaces created from this container network interface configuration.
     *
     * @return the containerNetworkInterfaces value
     */
    public List<SubResource> containerNetworkInterfaces() {
        return this.containerNetworkInterfaces;
    }

    /**
     * Set a list of container network interfaces created from this container network interface configuration.
     *
     * @param containerNetworkInterfaces the containerNetworkInterfaces value to set
     * @return the ContainerNetworkInterfaceConfiguration object itself.
     */
    public ContainerNetworkInterfaceConfiguration withContainerNetworkInterfaces(List<SubResource> containerNetworkInterfaces) {
        this.containerNetworkInterfaces = containerNetworkInterfaces;
        return this;
    }

    /**
     * Get the provisioning state of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the resource. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the ContainerNetworkInterfaceConfiguration object itself.
     */
    public ContainerNetworkInterfaceConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get sub Resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
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
     * @return the ContainerNetworkInterfaceConfiguration object itself.
     */
    public ContainerNetworkInterfaceConfiguration withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
