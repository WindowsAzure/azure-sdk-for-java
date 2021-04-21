// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.maintenance.fluent.MaintenanceConfigurationsClient;
import com.azure.resourcemanager.maintenance.fluent.models.MaintenanceConfigurationInner;
import com.azure.resourcemanager.maintenance.models.MaintenanceConfiguration;
import com.azure.resourcemanager.maintenance.models.MaintenanceConfigurations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MaintenanceConfigurationsImpl implements MaintenanceConfigurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MaintenanceConfigurationsImpl.class);

    private final MaintenanceConfigurationsClient innerClient;

    private final com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager;

    public MaintenanceConfigurationsImpl(
        MaintenanceConfigurationsClient innerClient,
        com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public MaintenanceConfiguration getByResourceGroup(String resourceGroupName, String resourceName) {
        MaintenanceConfigurationInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, resourceName);
        if (inner != null) {
            return new MaintenanceConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MaintenanceConfiguration> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<MaintenanceConfigurationInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MaintenanceConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MaintenanceConfiguration deleteByResourceGroup(String resourceGroupName, String resourceName) {
        MaintenanceConfigurationInner inner = this.serviceClient().delete(resourceGroupName, resourceName);
        if (inner != null) {
            return new MaintenanceConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MaintenanceConfiguration> deleteWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<MaintenanceConfigurationInner> inner =
            this.serviceClient().deleteWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MaintenanceConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<MaintenanceConfiguration> list() {
        PagedIterable<MaintenanceConfigurationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new MaintenanceConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<MaintenanceConfiguration> list(Context context) {
        PagedIterable<MaintenanceConfigurationInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new MaintenanceConfigurationImpl(inner1, this.manager()));
    }

    public MaintenanceConfiguration getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "maintenanceConfigurations");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'maintenanceConfigurations'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
    }

    public Response<MaintenanceConfiguration> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "maintenanceConfigurations");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'maintenanceConfigurations'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
    }

    public MaintenanceConfiguration deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "maintenanceConfigurations");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'maintenanceConfigurations'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
    }

    public Response<MaintenanceConfiguration> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "maintenanceConfigurations");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'maintenanceConfigurations'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, resourceName, context);
    }

    private MaintenanceConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.maintenance.MaintenanceManager manager() {
        return this.serviceManager;
    }

    public MaintenanceConfigurationImpl define(String name) {
        return new MaintenanceConfigurationImpl(name, this.manager());
    }
}
