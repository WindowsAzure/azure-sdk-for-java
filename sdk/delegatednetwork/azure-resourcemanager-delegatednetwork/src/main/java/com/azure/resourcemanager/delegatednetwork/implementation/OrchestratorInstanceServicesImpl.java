// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.delegatednetwork.fluent.OrchestratorInstanceServicesClient;
import com.azure.resourcemanager.delegatednetwork.fluent.models.OrchestratorInner;
import com.azure.resourcemanager.delegatednetwork.models.Orchestrator;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorInstanceServices;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OrchestratorInstanceServicesImpl implements OrchestratorInstanceServices {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrchestratorInstanceServicesImpl.class);

    private final OrchestratorInstanceServicesClient innerClient;

    private final com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager serviceManager;

    public OrchestratorInstanceServicesImpl(
        OrchestratorInstanceServicesClient innerClient,
        com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Orchestrator getByResourceGroup(String resourceGroupName, String resourceName) {
        OrchestratorInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, resourceName);
        if (inner != null) {
            return new OrchestratorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Orchestrator> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<OrchestratorInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OrchestratorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String resourceName) {
        this.serviceClient().delete(resourceGroupName, resourceName);
    }

    public void delete(String resourceGroupName, String resourceName, Context context) {
        this.serviceClient().delete(resourceGroupName, resourceName, context);
    }

    public PagedIterable<Orchestrator> list() {
        PagedIterable<OrchestratorInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new OrchestratorImpl(inner1, this.manager()));
    }

    public PagedIterable<Orchestrator> list(Context context) {
        PagedIterable<OrchestratorInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new OrchestratorImpl(inner1, this.manager()));
    }

    public PagedIterable<Orchestrator> listByResourceGroup(String resourceGroupName) {
        PagedIterable<OrchestratorInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new OrchestratorImpl(inner1, this.manager()));
    }

    public PagedIterable<Orchestrator> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<OrchestratorInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new OrchestratorImpl(inner1, this.manager()));
    }

    public Orchestrator getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "orchestrators");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'orchestrators'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
    }

    public Response<Orchestrator> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "orchestrators");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'orchestrators'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
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
        String resourceName = Utils.getValueFromIdByName(id, "orchestrators");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'orchestrators'.", id)));
        }
        this.delete(resourceGroupName, resourceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "orchestrators");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'orchestrators'.", id)));
        }
        this.delete(resourceGroupName, resourceName, context);
    }

    private OrchestratorInstanceServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager manager() {
        return this.serviceManager;
    }

    public OrchestratorImpl define(String name) {
        return new OrchestratorImpl(name, this.manager());
    }
}
