// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.WorkspaceManagedSqlServerSecurityAlertPoliciesClient;
import com.azure.resourcemanager.synapse.fluent.models.ServerSecurityAlertPolicyInner;
import com.azure.resourcemanager.synapse.models.SecurityAlertPolicyNameAutoGenerated;
import com.azure.resourcemanager.synapse.models.ServerSecurityAlertPolicy;
import com.azure.resourcemanager.synapse.models.WorkspaceManagedSqlServerSecurityAlertPolicies;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WorkspaceManagedSqlServerSecurityAlertPoliciesImpl
    implements WorkspaceManagedSqlServerSecurityAlertPolicies {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(WorkspaceManagedSqlServerSecurityAlertPoliciesImpl.class);

    private final WorkspaceManagedSqlServerSecurityAlertPoliciesClient innerClient;

    private final SynapseManager serviceManager;

    public WorkspaceManagedSqlServerSecurityAlertPoliciesImpl(
        WorkspaceManagedSqlServerSecurityAlertPoliciesClient innerClient, SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ServerSecurityAlertPolicy get(
        String resourceGroupName, String workspaceName, SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName) {
        ServerSecurityAlertPolicyInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, securityAlertPolicyName);
        if (inner != null) {
            return new ServerSecurityAlertPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServerSecurityAlertPolicy> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName,
        Context context) {
        Response<ServerSecurityAlertPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, securityAlertPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerSecurityAlertPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ServerSecurityAlertPolicy> list(String resourceGroupName, String workspaceName) {
        PagedIterable<ServerSecurityAlertPolicyInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName);
        return inner.mapPage(inner1 -> new ServerSecurityAlertPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerSecurityAlertPolicy> list(
        String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<ServerSecurityAlertPolicyInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, context);
        return inner.mapPage(inner1 -> new ServerSecurityAlertPolicyImpl(inner1, this.manager()));
    }

    public ServerSecurityAlertPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName =
            SecurityAlertPolicyNameAutoGenerated.fromString(Utils.getValueFromIdByName(id, "securityAlertPolicies"));
        if (securityAlertPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityAlertPolicies'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, securityAlertPolicyName, Context.NONE).getValue();
    }

    public Response<ServerSecurityAlertPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        SecurityAlertPolicyNameAutoGenerated securityAlertPolicyName =
            SecurityAlertPolicyNameAutoGenerated.fromString(Utils.getValueFromIdByName(id, "securityAlertPolicies"));
        if (securityAlertPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityAlertPolicies'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, securityAlertPolicyName, context);
    }

    private WorkspaceManagedSqlServerSecurityAlertPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }

    public ServerSecurityAlertPolicyImpl define(SecurityAlertPolicyNameAutoGenerated name) {
        return new ServerSecurityAlertPolicyImpl(name, this.manager());
    }
}
