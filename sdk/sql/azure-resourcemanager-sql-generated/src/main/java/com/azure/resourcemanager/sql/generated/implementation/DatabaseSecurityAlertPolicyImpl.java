// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseSecurityAlertPolicyInner;
import com.azure.resourcemanager.sql.generated.models.DatabaseSecurityAlertPolicy;
import com.azure.resourcemanager.sql.generated.models.SecurityAlertPolicyName;
import com.azure.resourcemanager.sql.generated.models.SecurityAlertsPolicyState;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class DatabaseSecurityAlertPolicyImpl
    implements DatabaseSecurityAlertPolicy, DatabaseSecurityAlertPolicy.Definition, DatabaseSecurityAlertPolicy.Update {
    private DatabaseSecurityAlertPolicyInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public SecurityAlertsPolicyState state() {
        return this.innerModel().state();
    }

    public List<String> disabledAlerts() {
        List<String> inner = this.innerModel().disabledAlerts();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> emailAddresses() {
        List<String> inner = this.innerModel().emailAddresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean emailAccountAdmins() {
        return this.innerModel().emailAccountAdmins();
    }

    public String storageEndpoint() {
        return this.innerModel().storageEndpoint();
    }

    public String storageAccountAccessKey() {
        return this.innerModel().storageAccountAccessKey();
    }

    public Integer retentionDays() {
        return this.innerModel().retentionDays();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public DatabaseSecurityAlertPolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String databaseName;

    private SecurityAlertPolicyName securityAlertPolicyName;

    public DatabaseSecurityAlertPolicyImpl withExistingDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    public DatabaseSecurityAlertPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseSecurityAlertPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serverName,
                    databaseName,
                    securityAlertPolicyName,
                    this.innerModel(),
                    Context.NONE)
                .getValue();
        return this;
    }

    public DatabaseSecurityAlertPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseSecurityAlertPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, databaseName, securityAlertPolicyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    DatabaseSecurityAlertPolicyImpl(
        SecurityAlertPolicyName name, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new DatabaseSecurityAlertPolicyInner();
        this.serviceManager = serviceManager;
        this.securityAlertPolicyName = name;
    }

    public DatabaseSecurityAlertPolicyImpl update() {
        return this;
    }

    public DatabaseSecurityAlertPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseSecurityAlertPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serverName,
                    databaseName,
                    securityAlertPolicyName,
                    this.innerModel(),
                    Context.NONE)
                .getValue();
        return this;
    }

    public DatabaseSecurityAlertPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseSecurityAlertPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, databaseName, securityAlertPolicyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    DatabaseSecurityAlertPolicyImpl(
        DatabaseSecurityAlertPolicyInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
        this.securityAlertPolicyName =
            SecurityAlertPolicyName.fromString(Utils.getValueFromIdByName(innerObject.id(), "securityAlertPolicies"));
    }

    public DatabaseSecurityAlertPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseSecurityAlertPolicies()
                .getWithResponse(resourceGroupName, serverName, databaseName, securityAlertPolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public DatabaseSecurityAlertPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseSecurityAlertPolicies()
                .getWithResponse(resourceGroupName, serverName, databaseName, securityAlertPolicyName, context)
                .getValue();
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withState(SecurityAlertsPolicyState state) {
        this.innerModel().withState(state);
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withDisabledAlerts(List<String> disabledAlerts) {
        this.innerModel().withDisabledAlerts(disabledAlerts);
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withEmailAddresses(List<String> emailAddresses) {
        this.innerModel().withEmailAddresses(emailAddresses);
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withEmailAccountAdmins(Boolean emailAccountAdmins) {
        this.innerModel().withEmailAccountAdmins(emailAccountAdmins);
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.innerModel().withStorageEndpoint(storageEndpoint);
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.innerModel().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    public DatabaseSecurityAlertPolicyImpl withRetentionDays(Integer retentionDays) {
        this.innerModel().withRetentionDays(retentionDays);
        return this;
    }
}
