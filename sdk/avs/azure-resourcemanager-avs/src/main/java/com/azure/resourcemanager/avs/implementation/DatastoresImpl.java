// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.fluent.DatastoresClient;
import com.azure.resourcemanager.avs.fluent.models.DatastoreInner;
import com.azure.resourcemanager.avs.models.Datastore;
import com.azure.resourcemanager.avs.models.Datastores;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DatastoresImpl implements Datastores {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatastoresImpl.class);

    private final DatastoresClient innerClient;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    public DatastoresImpl(DatastoresClient innerClient, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Datastore> list(String resourceGroupName, String privateCloudName, String clusterName) {
        PagedIterable<DatastoreInner> inner =
            this.serviceClient().list(resourceGroupName, privateCloudName, clusterName);
        return Utils.mapPage(inner, inner1 -> new DatastoreImpl(inner1, this.manager()));
    }

    public PagedIterable<Datastore> list(
        String resourceGroupName, String privateCloudName, String clusterName, Context context) {
        PagedIterable<DatastoreInner> inner =
            this.serviceClient().list(resourceGroupName, privateCloudName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new DatastoreImpl(inner1, this.manager()));
    }

    public Datastore get(String resourceGroupName, String privateCloudName, String clusterName, String datastoreName) {
        DatastoreInner inner =
            this.serviceClient().get(resourceGroupName, privateCloudName, clusterName, datastoreName);
        if (inner != null) {
            return new DatastoreImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Datastore> getWithResponse(
        String resourceGroupName, String privateCloudName, String clusterName, String datastoreName, Context context) {
        Response<DatastoreInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, privateCloudName, clusterName, datastoreName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatastoreImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String privateCloudName, String clusterName, String datastoreName) {
        this.serviceClient().delete(resourceGroupName, privateCloudName, clusterName, datastoreName);
    }

    public void delete(
        String resourceGroupName, String privateCloudName, String clusterName, String datastoreName, Context context) {
        this.serviceClient().delete(resourceGroupName, privateCloudName, clusterName, datastoreName, context);
    }

    public Datastore getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String datastoreName = Utils.getValueFromIdByName(id, "datastores");
        if (datastoreName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'datastores'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, privateCloudName, clusterName, datastoreName, Context.NONE)
            .getValue();
    }

    public Response<Datastore> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String datastoreName = Utils.getValueFromIdByName(id, "datastores");
        if (datastoreName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'datastores'.", id)));
        }
        return this.getWithResponse(resourceGroupName, privateCloudName, clusterName, datastoreName, context);
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
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String datastoreName = Utils.getValueFromIdByName(id, "datastores");
        if (datastoreName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'datastores'.", id)));
        }
        this.delete(resourceGroupName, privateCloudName, clusterName, datastoreName, Context.NONE);
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
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String datastoreName = Utils.getValueFromIdByName(id, "datastores");
        if (datastoreName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'datastores'.", id)));
        }
        this.delete(resourceGroupName, privateCloudName, clusterName, datastoreName, context);
    }

    private DatastoresClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }

    public DatastoreImpl define(String name) {
        return new DatastoreImpl(name, this.manager());
    }
}
