/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The information of an AvailablePrivateEndpointType.
 */
public class AvailablePrivateEndpointTypeInner {
    /**
     * The name of the service and resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique identifier of the AvailablePrivateEndpoint Type resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The name of the service and resource.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /**
     * Get the name of the service and resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the service and resource.
     *
     * @param name the name value to set
     * @return the AvailablePrivateEndpointTypeInner object itself.
     */
    public AvailablePrivateEndpointTypeInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique identifier of the AvailablePrivateEndpoint Type resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set a unique identifier of the AvailablePrivateEndpoint Type resource.
     *
     * @param id the id value to set
     * @return the AvailablePrivateEndpointTypeInner object itself.
     */
    public AvailablePrivateEndpointTypeInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set resource type.
     *
     * @param type the type value to set
     * @return the AvailablePrivateEndpointTypeInner object itself.
     */
    public AvailablePrivateEndpointTypeInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name of the service and resource.
     *
     * @return the resourceName value
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the name of the service and resource.
     *
     * @param resourceName the resourceName value to set
     * @return the AvailablePrivateEndpointTypeInner object itself.
     */
    public AvailablePrivateEndpointTypeInner withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

}
