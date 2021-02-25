/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.management.compute.v2020_10_01_preview.CloudServiceRoleSku;
import com.microsoft.azure.management.compute.v2020_10_01_preview.CloudServiceRoleProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a role of the cloud service.
 */
public class CloudServiceRoleInner {
    /**
     * Resource id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * The sku property.
     */
    @JsonProperty(value = "sku")
    private CloudServiceRoleSku sku;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private CloudServiceRoleProperties properties;

    /**
     * Get resource id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
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
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public CloudServiceRoleSku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the CloudServiceRoleInner object itself.
     */
    public CloudServiceRoleInner withSku(CloudServiceRoleSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public CloudServiceRoleProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the CloudServiceRoleInner object itself.
     */
    public CloudServiceRoleInner withProperties(CloudServiceRoleProperties properties) {
        this.properties = properties;
        return this;
    }

}
