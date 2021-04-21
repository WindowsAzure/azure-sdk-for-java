// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.fluent.IntegrationAccountAssembliesClient;
import com.azure.resourcemanager.logic.fluent.models.AssemblyDefinitionInner;
import com.azure.resourcemanager.logic.fluent.models.WorkflowTriggerCallbackUrlInner;
import com.azure.resourcemanager.logic.models.AssemblyDefinition;
import com.azure.resourcemanager.logic.models.IntegrationAccountAssemblies;
import com.azure.resourcemanager.logic.models.WorkflowTriggerCallbackUrl;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IntegrationAccountAssembliesImpl implements IntegrationAccountAssemblies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IntegrationAccountAssembliesImpl.class);

    private final IntegrationAccountAssembliesClient innerClient;

    private final com.azure.resourcemanager.logic.LogicManager serviceManager;

    public IntegrationAccountAssembliesImpl(
        IntegrationAccountAssembliesClient innerClient, com.azure.resourcemanager.logic.LogicManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AssemblyDefinition> list(String resourceGroupName, String integrationAccountName) {
        PagedIterable<AssemblyDefinitionInner> inner =
            this.serviceClient().list(resourceGroupName, integrationAccountName);
        return Utils.mapPage(inner, inner1 -> new AssemblyDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<AssemblyDefinition> list(
        String resourceGroupName, String integrationAccountName, Context context) {
        PagedIterable<AssemblyDefinitionInner> inner =
            this.serviceClient().list(resourceGroupName, integrationAccountName, context);
        return Utils.mapPage(inner, inner1 -> new AssemblyDefinitionImpl(inner1, this.manager()));
    }

    public AssemblyDefinition get(
        String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        AssemblyDefinitionInner inner =
            this.serviceClient().get(resourceGroupName, integrationAccountName, assemblyArtifactName);
        if (inner != null) {
            return new AssemblyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AssemblyDefinition> getWithResponse(
        String resourceGroupName, String integrationAccountName, String assemblyArtifactName, Context context) {
        Response<AssemblyDefinitionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, integrationAccountName, assemblyArtifactName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AssemblyDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        this.serviceClient().delete(resourceGroupName, integrationAccountName, assemblyArtifactName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String integrationAccountName, String assemblyArtifactName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, integrationAccountName, assemblyArtifactName, context);
    }

    public WorkflowTriggerCallbackUrl listContentCallbackUrl(
        String resourceGroupName, String integrationAccountName, String assemblyArtifactName) {
        WorkflowTriggerCallbackUrlInner inner =
            this
                .serviceClient()
                .listContentCallbackUrl(resourceGroupName, integrationAccountName, assemblyArtifactName);
        if (inner != null) {
            return new WorkflowTriggerCallbackUrlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkflowTriggerCallbackUrl> listContentCallbackUrlWithResponse(
        String resourceGroupName, String integrationAccountName, String assemblyArtifactName, Context context) {
        Response<WorkflowTriggerCallbackUrlInner> inner =
            this
                .serviceClient()
                .listContentCallbackUrlWithResponse(
                    resourceGroupName, integrationAccountName, assemblyArtifactName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkflowTriggerCallbackUrlImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AssemblyDefinition getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String integrationAccountName = Utils.getValueFromIdByName(id, "integrationAccounts");
        if (integrationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'integrationAccounts'.", id)));
        }
        String assemblyArtifactName = Utils.getValueFromIdByName(id, "assemblies");
        if (assemblyArtifactName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assemblies'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, integrationAccountName, assemblyArtifactName, Context.NONE)
            .getValue();
    }

    public Response<AssemblyDefinition> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String integrationAccountName = Utils.getValueFromIdByName(id, "integrationAccounts");
        if (integrationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'integrationAccounts'.", id)));
        }
        String assemblyArtifactName = Utils.getValueFromIdByName(id, "assemblies");
        if (assemblyArtifactName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assemblies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, integrationAccountName, assemblyArtifactName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String integrationAccountName = Utils.getValueFromIdByName(id, "integrationAccounts");
        if (integrationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'integrationAccounts'.", id)));
        }
        String assemblyArtifactName = Utils.getValueFromIdByName(id, "assemblies");
        if (assemblyArtifactName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assemblies'.", id)));
        }
        this
            .deleteWithResponse(resourceGroupName, integrationAccountName, assemblyArtifactName, Context.NONE)
            .getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String integrationAccountName = Utils.getValueFromIdByName(id, "integrationAccounts");
        if (integrationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'integrationAccounts'.", id)));
        }
        String assemblyArtifactName = Utils.getValueFromIdByName(id, "assemblies");
        if (assemblyArtifactName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'assemblies'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, integrationAccountName, assemblyArtifactName, context);
    }

    private IntegrationAccountAssembliesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.logic.LogicManager manager() {
        return this.serviceManager;
    }

    public AssemblyDefinitionImpl define(String name) {
        return new AssemblyDefinitionImpl(name, this.manager());
    }
}
