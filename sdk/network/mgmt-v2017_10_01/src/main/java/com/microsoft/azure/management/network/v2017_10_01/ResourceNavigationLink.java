/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * ResourceNavigationLink resource.
 */
@JsonFlatten
public class ResourceNavigationLink extends SubResource {
    /**
     * Resource type of the linked resource.
     */
    @JsonProperty(value = "properties.linkedResourceType")
    private String linkedResourceType;

    /**
     * Link to the external resource.
     */
    @JsonProperty(value = "properties.link")
    private String link;

    /**
     * Provisioning state of the ResourceNavigationLink resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get resource type of the linked resource.
     *
     * @return the linkedResourceType value
     */
    public String linkedResourceType() {
        return this.linkedResourceType;
    }

    /**
     * Set resource type of the linked resource.
     *
     * @param linkedResourceType the linkedResourceType value to set
     * @return the ResourceNavigationLink object itself.
     */
    public ResourceNavigationLink withLinkedResourceType(String linkedResourceType) {
        this.linkedResourceType = linkedResourceType;
        return this;
    }

    /**
     * Get link to the external resource.
     *
     * @return the link value
     */
    public String link() {
        return this.link;
    }

    /**
     * Set link to the external resource.
     *
     * @param link the link value to set
     * @return the ResourceNavigationLink object itself.
     */
    public ResourceNavigationLink withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * Get provisioning state of the ResourceNavigationLink resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the ResourceNavigationLink object itself.
     */
    public ResourceNavigationLink withName(String name) {
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
