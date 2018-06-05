/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2015_07_01.implementation;

import com.microsoft.azure.management.authorization.v2015_07_01.RoleDefinitionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Role definition.
 */
public class RoleDefinitionInner {
    /**
     * The role definition ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The role definition name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The role definition type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Role definition properties.
     */
    @JsonProperty(value = "properties")
    private RoleDefinitionProperties properties;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public RoleDefinitionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner withProperties(RoleDefinitionProperties properties) {
        this.properties = properties;
        return this;
    }

}
