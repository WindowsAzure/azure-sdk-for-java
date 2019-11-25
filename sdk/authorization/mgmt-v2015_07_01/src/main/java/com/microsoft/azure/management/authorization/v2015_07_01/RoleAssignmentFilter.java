/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2015_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Role Assignments filter.
 */
public class RoleAssignmentFilter {
    /**
     * Returns role assignment of the specific principal.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /**
     * Get returns role assignment of the specific principal.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set returns role assignment of the specific principal.
     *
     * @param principalId the principalId value to set
     * @return the RoleAssignmentFilter object itself.
     */
    public RoleAssignmentFilter withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

}
