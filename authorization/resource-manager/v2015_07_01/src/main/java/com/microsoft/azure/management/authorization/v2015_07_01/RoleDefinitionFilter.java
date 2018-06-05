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
 * Role Definitions filter.
 */
public class RoleDefinitionFilter {
    /**
     * Returns role definition with the specific name.
     */
    @JsonProperty(value = "roleName")
    private String roleName;

    /**
     * Get the roleName value.
     *
     * @return the roleName value
     */
    public String roleName() {
        return this.roleName;
    }

    /**
     * Set the roleName value.
     *
     * @param roleName the roleName value to set
     * @return the RoleDefinitionFilter object itself.
     */
    public RoleDefinitionFilter withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

}
