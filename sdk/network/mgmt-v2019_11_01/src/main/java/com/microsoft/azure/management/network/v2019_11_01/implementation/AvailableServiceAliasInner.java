/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The available service alias.
 */
public class AvailableServiceAliasInner {
    /**
     * The name of the service alias.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The ID of the service alias.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The resource name of the service alias.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /**
     * Get the name of the service alias.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the service alias.
     *
     * @param name the name value to set
     * @return the AvailableServiceAliasInner object itself.
     */
    public AvailableServiceAliasInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the ID of the service alias.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID of the service alias.
     *
     * @param id the id value to set
     * @return the AvailableServiceAliasInner object itself.
     */
    public AvailableServiceAliasInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the resource.
     *
     * @param type the type value to set
     * @return the AvailableServiceAliasInner object itself.
     */
    public AvailableServiceAliasInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the resource name of the service alias.
     *
     * @return the resourceName value
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resource name of the service alias.
     *
     * @param resourceName the resourceName value to set
     * @return the AvailableServiceAliasInner object itself.
     */
    public AvailableServiceAliasInner withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

}
