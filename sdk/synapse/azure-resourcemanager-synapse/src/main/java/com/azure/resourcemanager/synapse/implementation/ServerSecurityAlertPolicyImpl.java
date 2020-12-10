// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.ServerSecurityAlertPolicyInner;
import com.azure.resourcemanager.synapse.models.SecurityAlertPolicyNameAutoGenerated;
import com.azure.resourcemanager.synapse.models.SecurityAlertPolicyState;
import com.azure.resourcemanager.synapse.models.ServerSecurityAlertPolicy;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class ServerSecurityAlertPolicyImpl
    implements ServerSecurityAlertPolicy, ServerSecurityAlertPolicy.Definition, ServerSecurityAlertPolicy.Update {
    private ServerSecurityAlertPolicyInner innerObject;

    private final SynapseManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SecurityAlertPolicyState state() {
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

    public ServerSecurityAlertPolicyInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName;

    public ServerSecurityAlertPolicyImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public ServerSecurityAlertPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaceManagedSqlServerSecurityAlertPolicies()
                .createOrUpdate(
                    resourceGroupName, workspaceName, securityAlertPolicyName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerSecurityAlertPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaceManagedSqlServerSecurityAlertPolicies()
                .createOrUpdate(resourceGroupName, workspaceName, securityAlertPolicyName, this.innerModel(), context);
        return this;
    }

    public ServerSecurityAlertPolicyImpl(SecurityAlertPolicyNameAutoGenerated name, SynapseManager serviceManager) {
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
                .getWorkspaceManagedSqlServerSecurityAlertPolicies()
                .createOrUpdate(
                    resourceGroupName, workspaceName, securityAlertPolicyName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServerSecurityAlertPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaceManagedSqlServerSecurityAlertPolicies()
                .createOrUpdate(resourceGroupName, workspaceName, securityAlertPolicyName, this.innerModel(), context);
        return this;
    }

    public ServerSecurityAlertPolicyImpl(ServerSecurityAlertPolicyInner innerObject, SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.securityAlertPolicyName =
            SecurityAlertPolicyNameAutoGenerated
                .fromString(Utils.getValueFromIdByName(innerObject.id(), "securityAlertPolicies"));
    }

    public ServerSecurityAlertPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaceManagedSqlServerSecurityAlertPolicies()
                .getWithResponse(resourceGroupName, workspaceName, securityAlertPolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public ServerSecurityAlertPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaceManagedSqlServerSecurityAlertPolicies()
                .getWithResponse(resourceGroupName, workspaceName, securityAlertPolicyName, context)
                .getValue();
        return this;
    }

    public ServerSecurityAlertPolicyImpl withState(SecurityAlertPolicyState state) {
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
