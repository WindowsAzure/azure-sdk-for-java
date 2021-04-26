// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.fluent.models.ServerSecurityAlertPolicyInner;
import com.azure.resourcemanager.mysql.models.SecurityAlertPolicyName;
import com.azure.resourcemanager.mysql.models.ServerSecurityAlertPolicy;
import com.azure.resourcemanager.mysql.models.ServerSecurityAlertPolicyState;
import java.util.Collections;
import java.util.List;

public final class ServerSecurityAlertPolicyImpl
    implements ServerSecurityAlertPolicy, ServerSecurityAlertPolicy.Definition, ServerSecurityAlertPolicy.Update {
    private ServerSecurityAlertPolicyInner innerObject;

    private final com.azure.resourcemanager.mysql.MySqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ServerSecurityAlertPolicyState state() {
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

    public ServerSecurityAlertPolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysql.MySqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private SecurityAlertPolicyName securityAlertPolicyName;

    public ServerSecurityAlertPolicyImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public ServerSecurityAlertPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerSecurityAlertPolicies()
                .createOrUpdate(
                    resourceGroupName, serverName, securityAlertPolicyName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerSecurityAlertPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerSecurityAlertPolicies()
                .createOrUpdate(resourceGroupName, serverName, securityAlertPolicyName, this.innerModel(), context);
        return this;
    }

    ServerSecurityAlertPolicyImpl(
        SecurityAlertPolicyName name, com.azure.resourcemanager.mysql.MySqlManager serviceManager) {
        this.innerObject = new ServerSecurityAlertPolicyInner();
        this.serviceManager = serviceManager;
        this.securityAlertPolicyName = name;
    }

    public ServerSecurityAlertPolicyImpl update() {
        return this;
    }

    public ServerSecurityAlertPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerSecurityAlertPolicies()
                .createOrUpdate(
                    resourceGroupName, serverName, securityAlertPolicyName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerSecurityAlertPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerSecurityAlertPolicies()
                .createOrUpdate(resourceGroupName, serverName, securityAlertPolicyName, this.innerModel(), context);
        return this;
    }

    ServerSecurityAlertPolicyImpl(
        ServerSecurityAlertPolicyInner innerObject, com.azure.resourcemanager.mysql.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.securityAlertPolicyName =
            SecurityAlertPolicyName.fromString(Utils.getValueFromIdByName(innerObject.id(), "securityAlertPolicies"));
    }

    public ServerSecurityAlertPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerSecurityAlertPolicies()
                .getWithResponse(resourceGroupName, serverName, securityAlertPolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public ServerSecurityAlertPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServerSecurityAlertPolicies()
                .getWithResponse(resourceGroupName, serverName, securityAlertPolicyName, context)
                .getValue();
        return this;
    }

    public ServerSecurityAlertPolicyImpl withState(ServerSecurityAlertPolicyState state) {
        this.innerModel().withState(state);
        return this;
    }

    public ServerSecurityAlertPolicyImpl withDisabledAlerts(List<String> disabledAlerts) {
        this.innerModel().withDisabledAlerts(disabledAlerts);
        return this;
    }

    public ServerSecurityAlertPolicyImpl withEmailAddresses(List<String> emailAddresses) {
        this.innerModel().withEmailAddresses(emailAddresses);
        return this;
    }

    public ServerSecurityAlertPolicyImpl withEmailAccountAdmins(Boolean emailAccountAdmins) {
        this.innerModel().withEmailAccountAdmins(emailAccountAdmins);
        return this;
    }

    public ServerSecurityAlertPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.innerModel().withStorageEndpoint(storageEndpoint);
        return this;
    }

    public ServerSecurityAlertPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.innerModel().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    public ServerSecurityAlertPolicyImpl withRetentionDays(Integer retentionDays) {
        this.innerModel().withRetentionDays(retentionDays);
        return this;
    }
}
