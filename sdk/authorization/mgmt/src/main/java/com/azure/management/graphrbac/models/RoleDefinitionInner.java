// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The RoleDefinition model.
 */
@Fluent
@JsonFlatten
public final class RoleDefinitionInner {
    /*
     * The role definition ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The role definition name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The role definition type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The role name.
     */
    @JsonProperty(value = "properties.roleName")
    private String roleName;

    /*
     * The role definition description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The role type.
     */
    @JsonProperty(value = "properties.type")
    private String roleType;

    /*
     * Role definition permissions.
     */
    @JsonProperty(value = "properties.permissions")
    private List<PermissionInner> permissions;

    /*
     * Role definition assignable scopes.
     */
    @JsonProperty(value = "properties.assignableScopes")
    private List<String> assignableScopes;

    /**
     * Get the id property: The role definition ID.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The role definition name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the type property: The role definition type.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the roleName property: The role name.
     * 
     * @return the roleName value.
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * Set the roleName property: The role name.
     * 
     * @param roleName the roleName value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get the description property: The role definition description.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The role definition description.
     * 
     * @param description the description value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the roleType property: The role type.
     * 
     * @return the roleType value.
     */
    public String getRoleType() {
        return this.roleType;
    }

    /**
     * Set the roleType property: The role type.
     * 
     * @param roleType the roleType value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * Get the permissions property: Role definition permissions.
     * 
     * @return the permissions value.
     */
    public List<PermissionInner> getPermissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: Role definition permissions.
     * 
     * @param permissions the permissions value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner setPermissions(List<PermissionInner> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the assignableScopes property: Role definition assignable scopes.
     * 
     * @return the assignableScopes value.
     */
    public List<String> getAssignableScopes() {
        return this.assignableScopes;
    }

    /**
     * Set the assignableScopes property: Role definition assignable scopes.
     * 
     * @param assignableScopes the assignableScopes value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner setAssignableScopes(List<String> assignableScopes) {
        this.assignableScopes = assignableScopes;
        return this;
    }
}
