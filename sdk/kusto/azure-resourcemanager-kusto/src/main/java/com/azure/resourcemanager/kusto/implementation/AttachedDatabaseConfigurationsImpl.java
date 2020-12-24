// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.fluent.AttachedDatabaseConfigurationsClient;
import com.azure.resourcemanager.kusto.fluent.models.AttachedDatabaseConfigurationInner;
import com.azure.resourcemanager.kusto.models.AttachedDatabaseConfiguration;
import com.azure.resourcemanager.kusto.models.AttachedDatabaseConfigurations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AttachedDatabaseConfigurationsImpl implements AttachedDatabaseConfigurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AttachedDatabaseConfigurationsImpl.class);

    private final AttachedDatabaseConfigurationsClient innerClient;

    private final KustoManager serviceManager;

    public AttachedDatabaseConfigurationsImpl(
        AttachedDatabaseConfigurationsClient innerClient, KustoManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AttachedDatabaseConfiguration> listByCluster(String resourceGroupName, String clusterName) {
        PagedIterable<AttachedDatabaseConfigurationInner> inner =
            this.serviceClient().listByCluster(resourceGroupName, clusterName);
        return inner.mapPage(inner1 -> new AttachedDatabaseConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<AttachedDatabaseConfiguration> listByCluster(
        String resourceGroupName, String clusterName, Context context) {
        PagedIterable<AttachedDatabaseConfigurationInner> inner =
            this.serviceClient().listByCluster(resourceGroupName, clusterName, context);
        return inner.mapPage(inner1 -> new AttachedDatabaseConfigurationImpl(inner1, this.manager()));
    }

    public AttachedDatabaseConfiguration get(
        String resourceGroupName, String clusterName, String attachedDatabaseConfigurationName) {
        AttachedDatabaseConfigurationInner inner =
            this.serviceClient().get(resourceGroupName, clusterName, attachedDatabaseConfigurationName);
        if (inner != null) {
            return new AttachedDatabaseConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AttachedDatabaseConfiguration> getWithResponse(
        String resourceGroupName, String clusterName, String attachedDatabaseConfigurationName, Context context) {
        Response<AttachedDatabaseConfigurationInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, clusterName, attachedDatabaseConfigurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AttachedDatabaseConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String attachedDatabaseConfigurationName) {
        this.serviceClient().delete(resourceGroupName, clusterName, attachedDatabaseConfigurationName);
    }

    public void delete(
        String resourceGroupName, String clusterName, String attachedDatabaseConfigurationName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, attachedDatabaseConfigurationName, context);
    }

    public AttachedDatabaseConfiguration getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String attachedDatabaseConfigurationName = Utils.getValueFromIdByName(id, "attachedDatabaseConfigurations");
        if (attachedDatabaseConfigurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'attachedDatabaseConfigurations'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, clusterName, attachedDatabaseConfigurationName, Context.NONE)
            .getValue();
    }

    public Response<AttachedDatabaseConfiguration> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String attachedDatabaseConfigurationName = Utils.getValueFromIdByName(id, "attachedDatabaseConfigurations");
        if (attachedDatabaseConfigurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'attachedDatabaseConfigurations'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, attachedDatabaseConfigurationName, context);
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
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String attachedDatabaseConfigurationName = Utils.getValueFromIdByName(id, "attachedDatabaseConfigurations");
        if (attachedDatabaseConfigurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'attachedDatabaseConfigurations'.",
                                id)));
        }
        this.delete(resourceGroupName, clusterName, attachedDatabaseConfigurationName, Context.NONE);
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
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String attachedDatabaseConfigurationName = Utils.getValueFromIdByName(id, "attachedDatabaseConfigurations");
        if (attachedDatabaseConfigurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'attachedDatabaseConfigurations'.",
                                id)));
        }
        this.delete(resourceGroupName, clusterName, attachedDatabaseConfigurationName, context);
    }

    private AttachedDatabaseConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private KustoManager manager() {
        return this.serviceManager;
    }

    public AttachedDatabaseConfigurationImpl define(String name) {
        return new AttachedDatabaseConfigurationImpl(name, this.manager());
    }
}
