// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RoleAssignmentCreateParameters model. */
@Fluent
public final class RoleAssignmentCreateParameters {
    /*
     * Role assignment properties.
     */
    @JsonProperty(value = "properties", required = true)
    private RoleAssignmentProperties properties;

    /**
     * Get the properties property: Role assignment properties.
     *
     * @return the properties value.
     */
    public RoleAssignmentProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Role assignment properties.
     *
     * @param properties the properties value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters setProperties(RoleAssignmentProperties properties) {
        this.properties = properties;
        return this;
    }
}
