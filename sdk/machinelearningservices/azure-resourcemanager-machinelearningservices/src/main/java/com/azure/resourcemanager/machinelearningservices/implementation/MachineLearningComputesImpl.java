// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.fluent.MachineLearningComputesClient;
import com.azure.resourcemanager.machinelearningservices.fluent.models.ComputeResourceInner;
import com.azure.resourcemanager.machinelearningservices.fluent.models.ComputeSecretsInner;
import com.azure.resourcemanager.machinelearningservices.models.AmlComputeNodeInformation;
import com.azure.resourcemanager.machinelearningservices.models.ComputeResource;
import com.azure.resourcemanager.machinelearningservices.models.ComputeSecrets;
import com.azure.resourcemanager.machinelearningservices.models.MachineLearningComputes;
import com.azure.resourcemanager.machinelearningservices.models.UnderlyingResourceAction;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MachineLearningComputesImpl implements MachineLearningComputes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MachineLearningComputesImpl.class);

    private final MachineLearningComputesClient innerClient;

    private final com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager;

    public MachineLearningComputesImpl(
        MachineLearningComputesClient innerClient,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ComputeResource> listByWorkspace(String resourceGroupName, String workspaceName) {
        PagedIterable<ComputeResourceInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new ComputeResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ComputeResource> listByWorkspace(
        String resourceGroupName, String workspaceName, String skip, Context context) {
        PagedIterable<ComputeResourceInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, skip, context);
        return Utils.mapPage(inner, inner1 -> new ComputeResourceImpl(inner1, this.manager()));
    }

    public ComputeResource get(String resourceGroupName, String workspaceName, String computeName) {
        ComputeResourceInner inner = this.serviceClient().get(resourceGroupName, workspaceName, computeName);
        if (inner != null) {
            return new ComputeResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ComputeResource> getWithResponse(
        String resourceGroupName, String workspaceName, String computeName, Context context) {
        Response<ComputeResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, computeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ComputeResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName,
        String workspaceName,
        String computeName,
        UnderlyingResourceAction underlyingResourceAction) {
        this.serviceClient().delete(resourceGroupName, workspaceName, computeName, underlyingResourceAction);
    }

    public void delete(
        String resourceGroupName,
        String workspaceName,
        String computeName,
        UnderlyingResourceAction underlyingResourceAction,
        Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, computeName, underlyingResourceAction, context);
    }

    public PagedIterable<AmlComputeNodeInformation> listNodes(
        String resourceGroupName, String workspaceName, String computeName) {
        return this.serviceClient().listNodes(resourceGroupName, workspaceName, computeName);
    }

    public PagedIterable<AmlComputeNodeInformation> listNodes(
        String resourceGroupName, String workspaceName, String computeName, Context context) {
        return this.serviceClient().listNodes(resourceGroupName, workspaceName, computeName, context);
    }

    public ComputeSecrets listKeys(String resourceGroupName, String workspaceName, String computeName) {
        ComputeSecretsInner inner = this.serviceClient().listKeys(resourceGroupName, workspaceName, computeName);
        if (inner != null) {
            return new ComputeSecretsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ComputeSecrets> listKeysWithResponse(
        String resourceGroupName, String workspaceName, String computeName, Context context) {
        Response<ComputeSecretsInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, workspaceName, computeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ComputeSecretsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void start(String resourceGroupName, String workspaceName, String computeName) {
        this.serviceClient().start(resourceGroupName, workspaceName, computeName);
    }

    public void start(String resourceGroupName, String workspaceName, String computeName, Context context) {
        this.serviceClient().start(resourceGroupName, workspaceName, computeName, context);
    }

    public void stop(String resourceGroupName, String workspaceName, String computeName) {
        this.serviceClient().stop(resourceGroupName, workspaceName, computeName);
    }

    public void stop(String resourceGroupName, String workspaceName, String computeName, Context context) {
        this.serviceClient().stop(resourceGroupName, workspaceName, computeName, context);
    }

    public void restart(String resourceGroupName, String workspaceName, String computeName) {
        this.serviceClient().restart(resourceGroupName, workspaceName, computeName);
    }

    public Response<Void> restartWithResponse(
        String resourceGroupName, String workspaceName, String computeName, Context context) {
        return this.serviceClient().restartWithResponse(resourceGroupName, workspaceName, computeName, context);
    }

    public ComputeResource getById(String id) {
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
        String computeName = Utils.getValueFromIdByName(id, "computes");
        if (computeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'computes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, computeName, Context.NONE).getValue();
    }

    public Response<ComputeResource> getByIdWithResponse(String id, Context context) {
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
        String computeName = Utils.getValueFromIdByName(id, "computes");
        if (computeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'computes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, computeName, context);
    }

    private MachineLearningComputesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }

    public ComputeResourceImpl define(String name) {
        return new ComputeResourceImpl(name, this.manager());
    }
}
