// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managementgroups.models.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The tenant backfill status. */
@Immutable
public final class TenantBackfillStatusResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TenantBackfillStatusResultInner.class);

    /*
     * The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The status of the Tenant Backfill
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private Status status;

    /**
     * Get the tenantId property: The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the status property: The status of the Tenant Backfill.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
