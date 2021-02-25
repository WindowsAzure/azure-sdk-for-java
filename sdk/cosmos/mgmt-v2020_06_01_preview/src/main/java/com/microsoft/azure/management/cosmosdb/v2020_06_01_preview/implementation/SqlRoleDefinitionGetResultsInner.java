/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.RoleDefinitionType;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.Permission;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ARMProxyResource;

/**
 * An Azure Cosmos DB SQL Role Definition.
 */
@JsonFlatten
public class SqlRoleDefinitionGetResultsInner extends ARMProxyResource {
    /**
     * A user-friendly name for the Role Definition. Must be unique for the
     * database account.
     */
    @JsonProperty(value = "properties.roleName")
    private String roleName;

    /**
     * Indicates whether the Role Definition was built-in or user created.
     * Possible values include: 'BuiltInRole', 'CustomRole'.
     */
    @JsonProperty(value = "properties.type")
    private RoleDefinitionType sqlRoleDefinitionGetResultsType;

    /**
     * A set of fully qualified Scopes at or below which Role Assignments may
     * be created using this Role Definition. This will allow application of
     * this Role Definition on the entire database account or any underlying
     * Database / Collection. Must have at least one element. Scopes higher
     * than Database account are not enforceable as assignable Scopes. Note
     * that resources referenced in assignable Scopes need not exist.
     */
    @JsonProperty(value = "properties.assignableScopes")
    private List<String> assignableScopes;

    /**
     * The set of operations allowed through this Role Definition.
     */
    @JsonProperty(value = "properties.permissions")
    private List<Permission> permissions;

    /**
     * Get a user-friendly name for the Role Definition. Must be unique for the database account.
     *
     * @return the roleName value
     */
    public String roleName() {
        return this.roleName;
    }

    /**
     * Set a user-friendly name for the Role Definition. Must be unique for the database account.
     *
     * @param roleName the roleName value to set
     * @return the SqlRoleDefinitionGetResultsInner object itself.
     */
    public SqlRoleDefinitionGetResultsInner withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get indicates whether the Role Definition was built-in or user created. Possible values include: 'BuiltInRole', 'CustomRole'.
     *
     * @return the sqlRoleDefinitionGetResultsType value
     */
    public RoleDefinitionType sqlRoleDefinitionGetResultsType() {
        return this.sqlRoleDefinitionGetResultsType;
    }

    /**
     * Set indicates whether the Role Definition was built-in or user created. Possible values include: 'BuiltInRole', 'CustomRole'.
     *
     * @param sqlRoleDefinitionGetResultsType the sqlRoleDefinitionGetResultsType value to set
     * @return the SqlRoleDefinitionGetResultsInner object itself.
     */
    public SqlRoleDefinitionGetResultsInner withSqlRoleDefinitionGetResultsType(RoleDefinitionType sqlRoleDefinitionGetResultsType) {
        this.sqlRoleDefinitionGetResultsType = sqlRoleDefinitionGetResultsType;
        return this;
    }

    /**
     * Get a set of fully qualified Scopes at or below which Role Assignments may be created using this Role Definition. This will allow application of this Role Definition on the entire database account or any underlying Database / Collection. Must have at least one element. Scopes higher than Database account are not enforceable as assignable Scopes. Note that resources referenced in assignable Scopes need not exist.
     *
     * @return the assignableScopes value
     */
    public List<String> assignableScopes() {
        return this.assignableScopes;
    }

    /**
     * Set a set of fully qualified Scopes at or below which Role Assignments may be created using this Role Definition. This will allow application of this Role Definition on the entire database account or any underlying Database / Collection. Must have at least one element. Scopes higher than Database account are not enforceable as assignable Scopes. Note that resources referenced in assignable Scopes need not exist.
     *
     * @param assignableScopes the assignableScopes value to set
     * @return the SqlRoleDefinitionGetResultsInner object itself.
     */
    public SqlRoleDefinitionGetResultsInner withAssignableScopes(List<String> assignableScopes) {
        this.assignableScopes = assignableScopes;
        return this;
    }

    /**
     * Get the set of operations allowed through this Role Definition.
     *
     * @return the permissions value
     */
    public List<Permission> permissions() {
        return this.permissions;
    }

    /**
     * Set the set of operations allowed through this Role Definition.
     *
     * @param permissions the permissions value to set
     * @return the SqlRoleDefinitionGetResultsInner object itself.
     */
    public SqlRoleDefinitionGetResultsInner withPermissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

}
