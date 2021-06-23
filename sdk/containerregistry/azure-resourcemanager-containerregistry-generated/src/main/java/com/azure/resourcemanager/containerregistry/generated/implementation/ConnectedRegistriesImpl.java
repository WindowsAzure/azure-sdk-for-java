// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.generated.fluent.ConnectedRegistriesClient;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.ConnectedRegistryInner;
import com.azure.resourcemanager.containerregistry.generated.models.ConnectedRegistries;
import com.azure.resourcemanager.containerregistry.generated.models.ConnectedRegistry;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ConnectedRegistriesImpl implements ConnectedRegistries {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectedRegistriesImpl.class);

    private final ConnectedRegistriesClient innerClient;

    private final com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager;

    public ConnectedRegistriesImpl(
        ConnectedRegistriesClient innerClient,
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ConnectedRegistry get(String resourceGroupName, String registryName, String connectedRegistryName) {
        ConnectedRegistryInner inner = this.serviceClient().get(resourceGroupName, registryName, connectedRegistryName);
        if (inner != null) {
            return new ConnectedRegistryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ConnectedRegistry> getWithResponse(
        String resourceGroupName, String registryName, String connectedRegistryName, Context context) {
        Response<ConnectedRegistryInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, registryName, connectedRegistryName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConnectedRegistryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String registryName, String connectedRegistryName) {
        this.serviceClient().delete(resourceGroupName, registryName, connectedRegistryName);
    }

    public void delete(String resourceGroupName, String registryName, String connectedRegistryName, Context context) {
        this.serviceClient().delete(resourceGroupName, registryName, connectedRegistryName, context);
    }

    public PagedIterable<ConnectedRegistry> list(String resourceGroupName, String registryName) {
        PagedIterable<ConnectedRegistryInner> inner = this.serviceClient().list(resourceGroupName, registryName);
        return Utils.mapPage(inner, inner1 -> new ConnectedRegistryImpl(inner1, this.manager()));
    }

    public PagedIterable<ConnectedRegistry> list(
        String resourceGroupName, String registryName, String filter, Context context) {
        PagedIterable<ConnectedRegistryInner> inner =
            this.serviceClient().list(resourceGroupName, registryName, filter, context);
        return Utils.mapPage(inner, inner1 -> new ConnectedRegistryImpl(inner1, this.manager()));
    }

    public void deactivate(String resourceGroupName, String registryName, String connectedRegistryName) {
        this.serviceClient().deactivate(resourceGroupName, registryName, connectedRegistryName);
    }

    public void deactivate(
        String resourceGroupName, String registryName, String connectedRegistryName, Context context) {
        this.serviceClient().deactivate(resourceGroupName, registryName, connectedRegistryName, context);
    }

    public ConnectedRegistry getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String connectedRegistryName = Utils.getValueFromIdByName(id, "connectedRegistries");
        if (connectedRegistryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'connectedRegistries'.", id)));
        }
        return this.getWithResponse(resourceGroupName, registryName, connectedRegistryName, Context.NONE).getValue();
    }

    public Response<ConnectedRegistry> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String connectedRegistryName = Utils.getValueFromIdByName(id, "connectedRegistries");
        if (connectedRegistryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'connectedRegistries'.", id)));
        }
        return this.getWithResponse(resourceGroupName, registryName, connectedRegistryName, context);
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
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String connectedRegistryName = Utils.getValueFromIdByName(id, "connectedRegistries");
        if (connectedRegistryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'connectedRegistries'.", id)));
        }
        this.delete(resourceGroupName, registryName, connectedRegistryName, Context.NONE);
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
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String connectedRegistryName = Utils.getValueFromIdByName(id, "connectedRegistries");
        if (connectedRegistryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'connectedRegistries'.", id)));
        }
        this.delete(resourceGroupName, registryName, connectedRegistryName, context);
    }

    private ConnectedRegistriesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager() {
        return this.serviceManager;
    }

    public ConnectedRegistryImpl define(String name) {
        return new ConnectedRegistryImpl(name, this.manager());
    }
}
