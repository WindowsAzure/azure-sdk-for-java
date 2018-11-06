/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2015_07_01.implementation;

import com.microsoft.azure.management.authorization.v2015_07_01.RoleAssignmentPropertiesWithScope;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Role Assignments.
 */
public class RoleAssignmentInner {
    /**
     * The role assignment ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The role assignment name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The role assignment type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Role assignment properties.
     */
    @JsonProperty(value = "properties")
    private RoleAssignmentPropertiesWithScope properties;

    /**
     * Get the role assignment ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the role assignment name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the role assignment type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get role assignment properties.
     *
     * @return the properties value
     */
    public RoleAssignmentPropertiesWithScope properties() {
        return this.properties;
    }

    /**
     * Set role assignment properties.
     *
     * @param properties the properties value to set
     * @return the RoleAssignmentInner object itself.
     */
    public RoleAssignmentInner withProperties(RoleAssignmentPropertiesWithScope properties) {
        this.properties = properties;
        return this;
    }

}
