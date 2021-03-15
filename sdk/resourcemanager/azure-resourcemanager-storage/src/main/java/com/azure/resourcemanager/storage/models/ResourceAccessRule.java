// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resource Access Rule. */
@Fluent
public final class ResourceAccessRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceAccessRule.class);

    /*
     * Tenant Id
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * Resource Id
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Get the tenantId property: Tenant Id.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Tenant Id.
     *
     * @param tenantId the tenantId value to set.
     * @return the ResourceAccessRule object itself.
     */
    public ResourceAccessRule withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the resourceId property: Resource Id.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Resource Id.
     *
     * @param resourceId the resourceId value to set.
     * @return the ResourceAccessRule object itself.
     */
    public ResourceAccessRule withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
