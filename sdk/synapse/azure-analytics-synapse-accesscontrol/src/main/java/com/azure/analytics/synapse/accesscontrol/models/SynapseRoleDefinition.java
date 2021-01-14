// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.accesscontrol.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** Synapse role definition details. */
@Fluent
public final class SynapseRoleDefinition {
    /*
     * Role Definition ID
     */
    @JsonProperty(value = "id")
    private UUID id;

    /*
     * Name of the Synapse role
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Is a built-in role or not
     */
    @JsonProperty(value = "isBuiltIn")
    private Boolean isBuiltIn;

    /*
     * Description for the Synapse role
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Permissions for the Synapse role
     */
    @JsonProperty(value = "permissions")
    private List<SynapseRbacPermission> permissions;

    /*
     * Allowed scopes for the Synapse role
     */
    @JsonProperty(value = "scopes")
    private List<String> scopes;

    /*
     * Availability of the Synapse role
     */
    @JsonProperty(value = "availabilityStatus")
    private String availabilityStatus;

    /**
     * Get the id property: Role Definition ID.
     *
     * @return the id value.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Set the id property: Role Definition ID.
     *
     * @param id the id value to set.
     * @return the SynapseRoleDefinition object itself.
     */
    public SynapseRoleDefinition setId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name of the Synapse role.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Synapse role.
     *
     * @param name the name value to set.
     * @return the SynapseRoleDefinition object itself.
     */
    public SynapseRoleDefinition setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isBuiltIn property: Is a built-in role or not.
     *
     * @return the isBuiltIn value.
     */
    public Boolean isBuiltIn() {
        return this.isBuiltIn;
    }

    /**
     * Set the isBuiltIn property: Is a built-in role or not.
     *
     * @param isBuiltIn the isBuiltIn value to set.
     * @return the SynapseRoleDefinition object itself.
     */
    public SynapseRoleDefinition setIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
        return this;
    }

    /**
     * Get the description property: Description for the Synapse role.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Description for the Synapse role.
     *
     * @param description the description value to set.
     * @return the SynapseRoleDefinition object itself.
     */
    public SynapseRoleDefinition setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the permissions property: Permissions for the Synapse role.
     *
     * @return the permissions value.
     */
    public List<SynapseRbacPermission> getPermissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: Permissions for the Synapse role.
     *
     * @param permissions the permissions value to set.
     * @return the SynapseRoleDefinition object itself.
     */
    public SynapseRoleDefinition setPermissions(List<SynapseRbacPermission> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the scopes property: Allowed scopes for the Synapse role.
     *
     * @return the scopes value.
     */
    public List<String> getScopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: Allowed scopes for the Synapse role.
     *
     * @param scopes the scopes value to set.
     * @return the SynapseRoleDefinition object itself.
     */
    public SynapseRoleDefinition setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Get the availabilityStatus property: Availability of the Synapse role.
     *
     * @return the availabilityStatus value.
     */
    public String getAvailabilityStatus() {
        return this.availabilityStatus;
    }

    /**
     * Set the availabilityStatus property: Availability of the Synapse role.
     *
     * @param availabilityStatus the availabilityStatus value to set.
     * @return the SynapseRoleDefinition object itself.
     */
    public SynapseRoleDefinition setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
        return this;
    }
}
