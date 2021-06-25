// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.SqlRoleAssignmentGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.SqlRoleAssignmentCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.generated.models.SqlRoleAssignmentGetResults;

public final class SqlRoleAssignmentGetResultsImpl
    implements SqlRoleAssignmentGetResults, SqlRoleAssignmentGetResults.Definition, SqlRoleAssignmentGetResults.Update {
    private SqlRoleAssignmentGetResultsInner innerObject;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String roleDefinitionId() {
        return this.innerModel().roleDefinitionId();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public String principalId() {
        return this.innerModel().principalId();
    }

    public SqlRoleAssignmentGetResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }

    private String roleAssignmentId;

    private String resourceGroupName;

    private String accountName;

    private SqlRoleAssignmentCreateUpdateParameters createCreateUpdateSqlRoleAssignmentParameters;

    private SqlRoleAssignmentCreateUpdateParameters updateCreateUpdateSqlRoleAssignmentParameters;

    public SqlRoleAssignmentGetResultsImpl withExistingDatabaseAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public SqlRoleAssignmentGetResults create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .createUpdateSqlRoleAssignment(
                    roleAssignmentId,
                    resourceGroupName,
                    accountName,
                    createCreateUpdateSqlRoleAssignmentParameters,
                    Context.NONE);
        return this;
    }

    public SqlRoleAssignmentGetResults create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .createUpdateSqlRoleAssignment(
                    roleAssignmentId,
                    resourceGroupName,
                    accountName,
                    createCreateUpdateSqlRoleAssignmentParameters,
                    context);
        return this;
    }

    SqlRoleAssignmentGetResultsImpl(
        String name, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = new SqlRoleAssignmentGetResultsInner();
        this.serviceManager = serviceManager;
        this.roleAssignmentId = name;
        this.createCreateUpdateSqlRoleAssignmentParameters = new SqlRoleAssignmentCreateUpdateParameters();
    }

    public SqlRoleAssignmentGetResultsImpl update() {
        this.updateCreateUpdateSqlRoleAssignmentParameters = new SqlRoleAssignmentCreateUpdateParameters();
        return this;
    }

    public SqlRoleAssignmentGetResults apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .createUpdateSqlRoleAssignment(
                    roleAssignmentId,
                    resourceGroupName,
                    accountName,
                    updateCreateUpdateSqlRoleAssignmentParameters,
                    Context.NONE);
        return this;
    }

    public SqlRoleAssignmentGetResults apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .createUpdateSqlRoleAssignment(
                    roleAssignmentId,
                    resourceGroupName,
                    accountName,
                    updateCreateUpdateSqlRoleAssignmentParameters,
                    context);
        return this;
    }

    SqlRoleAssignmentGetResultsImpl(
        SqlRoleAssignmentGetResultsInner innerObject,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.roleAssignmentId = Utils.getValueFromIdByName(innerObject.id(), "sqlRoleAssignments");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "databaseAccounts");
    }

    public SqlRoleAssignmentGetResults refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .getSqlRoleAssignmentWithResponse(roleAssignmentId, resourceGroupName, accountName, Context.NONE)
                .getValue();
        return this;
    }

    public SqlRoleAssignmentGetResults refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .getSqlRoleAssignmentWithResponse(roleAssignmentId, resourceGroupName, accountName, context)
                .getValue();
        return this;
    }

    public SqlRoleAssignmentGetResultsImpl withRoleDefinitionId(String roleDefinitionId) {
        if (isInCreateMode()) {
            this.createCreateUpdateSqlRoleAssignmentParameters.withRoleDefinitionId(roleDefinitionId);
            return this;
        } else {
            this.updateCreateUpdateSqlRoleAssignmentParameters.withRoleDefinitionId(roleDefinitionId);
            return this;
        }
    }

    public SqlRoleAssignmentGetResultsImpl withScope(String scope) {
        if (isInCreateMode()) {
            this.createCreateUpdateSqlRoleAssignmentParameters.withScope(scope);
            return this;
        } else {
            this.updateCreateUpdateSqlRoleAssignmentParameters.withScope(scope);
            return this;
        }
    }

    public SqlRoleAssignmentGetResultsImpl withPrincipalId(String principalId) {
        if (isInCreateMode()) {
            this.createCreateUpdateSqlRoleAssignmentParameters.withPrincipalId(principalId);
            return this;
        } else {
            this.updateCreateUpdateSqlRoleAssignmentParameters.withPrincipalId(principalId);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
