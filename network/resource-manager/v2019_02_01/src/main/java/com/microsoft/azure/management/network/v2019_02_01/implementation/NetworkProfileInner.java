/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_02_01.ContainerNetworkInterface;
import com.microsoft.azure.management.network.v2019_02_01.ContainerNetworkInterfaceConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Network profile resource.
 */
@JsonFlatten
@SkipParentValidation
public class NetworkProfileInner extends Resource {
    /**
     * List of child container network interfaces.
     */
    @JsonProperty(value = "properties.containerNetworkInterfaces")
    private List<ContainerNetworkInterface> containerNetworkInterfaces;

    /**
     * List of chid container network interface configurations.
     */
    @JsonProperty(value = "properties.containerNetworkInterfaceConfigurations")
    private List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations;

    /**
     * The resource GUID property of the network interface resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get list of child container network interfaces.
     *
     * @return the containerNetworkInterfaces value
     */
    public List<ContainerNetworkInterface> containerNetworkInterfaces() {
        return this.containerNetworkInterfaces;
    }

    /**
     * Set list of child container network interfaces.
     *
     * @param containerNetworkInterfaces the containerNetworkInterfaces value to set
     * @return the NetworkProfileInner object itself.
     */
    public NetworkProfileInner withContainerNetworkInterfaces(List<ContainerNetworkInterface> containerNetworkInterfaces) {
        this.containerNetworkInterfaces = containerNetworkInterfaces;
        return this;
    }

    /**
     * Get list of chid container network interface configurations.
     *
     * @return the containerNetworkInterfaceConfigurations value
     */
    public List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations() {
        return this.containerNetworkInterfaceConfigurations;
    }

    /**
     * Set list of chid container network interface configurations.
     *
     * @param containerNetworkInterfaceConfigurations the containerNetworkInterfaceConfigurations value to set
     * @return the NetworkProfileInner object itself.
     */
    public NetworkProfileInner withContainerNetworkInterfaceConfigurations(List<ContainerNetworkInterfaceConfiguration> containerNetworkInterfaceConfigurations) {
        this.containerNetworkInterfaceConfigurations = containerNetworkInterfaceConfigurations;
        return this;
    }

    /**
     * Get the resource GUID property of the network interface resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
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
     * @return the NetworkProfileInner object itself.
     */
    public NetworkProfileInner withEtag(String etag) {
        this.etag = etag;
        return this;
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
     * @return the NetworkProfileInner object itself.
     */
    public NetworkProfileInner withId(String id) {
        this.id = id;
        return this;
    }

}
