// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.accesscontrol.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RoleAssignmentsListRoleAssignmentsHeaders model. */
@Fluent
public final class RoleAssignmentsListRoleAssignmentsHeaders {
    /*
     * The x-ms-continuation property.
     */
    @JsonProperty(value = "x-ms-continuation")
    private String xMsContinuation;

    /**
     * Get the xMsContinuation property: The x-ms-continuation property.
     *
     * @return the xMsContinuation value.
     */
    public String getXMsContinuation() {
        return this.xMsContinuation;
    }

    /**
     * Set the xMsContinuation property: The x-ms-continuation property.
     *
     * @param xMsContinuation the xMsContinuation value to set.
     * @return the RoleAssignmentsListRoleAssignmentsHeaders object itself.
     */
    public RoleAssignmentsListRoleAssignmentsHeaders setXMsContinuation(String xMsContinuation) {
        this.xMsContinuation = xMsContinuation;
        return this;
    }
}
