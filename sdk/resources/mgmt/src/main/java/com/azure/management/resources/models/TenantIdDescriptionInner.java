// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TenantIdDescription model. */
@Immutable
public final class TenantIdDescriptionInner {
    /*
     * The fully qualified ID of the tenant. For example,
     * /tenants/00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The tenant ID. For example, 00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Get the id property: The fully qualified ID of the tenant. For example,
     * /tenants/00000000-0000-0000-0000-000000000000.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the tenantId property: The tenant ID. For example, 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }
}
