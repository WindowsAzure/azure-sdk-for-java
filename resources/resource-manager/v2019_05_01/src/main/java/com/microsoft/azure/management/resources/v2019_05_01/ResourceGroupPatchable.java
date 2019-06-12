/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_05_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource group information.
 */
public class ResourceGroupPatchable {
    /**
     * The name of the resource group.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The resource group properties.
     */
    @JsonProperty(value = "properties")
    private ResourceGroupProperties properties;

    /**
     * The ID of the resource that manages this resource group.
     */
    @JsonProperty(value = "managedBy")
    private String managedBy;

    /**
     * The tags attached to the resource group.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the name of the resource group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource group.
     *
     * @param name the name value to set
     * @return the ResourceGroupPatchable object itself.
     */
    public ResourceGroupPatchable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resource group properties.
     *
     * @return the properties value
     */
    public ResourceGroupProperties properties() {
        return this.properties;
    }

    /**
     * Set the resource group properties.
     *
     * @param properties the properties value to set
     * @return the ResourceGroupPatchable object itself.
     */
    public ResourceGroupPatchable withProperties(ResourceGroupProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the ID of the resource that manages this resource group.
     *
     * @return the managedBy value
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Set the ID of the resource that manages this resource group.
     *
     * @param managedBy the managedBy value to set
     * @return the ResourceGroupPatchable object itself.
     */
    public ResourceGroupPatchable withManagedBy(String managedBy) {
        this.managedBy = managedBy;
        return this;
    }

    /**
     * Get the tags attached to the resource group.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags attached to the resource group.
     *
     * @param tags the tags value to set
     * @return the ResourceGroupPatchable object itself.
     */
    public ResourceGroupPatchable withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
