/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2019_12_01.implementation;

import com.microsoft.azure.management.containerinstance.v2019_12_01.CapabilitiesCapabilities;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The regional capabilities.
 */
public class CapabilitiesInner {
    /**
     * The resource type that this capability describes.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /**
     * The OS type that this capability describes.
     */
    @JsonProperty(value = "osType", access = JsonProperty.Access.WRITE_ONLY)
    private String osType;

    /**
     * The resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * The ip address type that this capability describes.
     */
    @JsonProperty(value = "ipAddressType", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddressType;

    /**
     * The GPU sku that this capability describes.
     */
    @JsonProperty(value = "gpu", access = JsonProperty.Access.WRITE_ONLY)
    private String gpu;

    /**
     * The supported capabilities.
     */
    @JsonProperty(value = "capabilities", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilitiesCapabilities capabilities;

    /**
     * Get the resource type that this capability describes.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the OS type that this capability describes.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Get the resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the ip address type that this capability describes.
     *
     * @return the ipAddressType value
     */
    public String ipAddressType() {
        return this.ipAddressType;
    }

    /**
     * Get the GPU sku that this capability describes.
     *
     * @return the gpu value
     */
    public String gpu() {
        return this.gpu;
    }

    /**
     * Get the supported capabilities.
     *
     * @return the capabilities value
     */
    public CapabilitiesCapabilities capabilities() {
        return this.capabilities;
    }

}
