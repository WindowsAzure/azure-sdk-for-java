// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.fluent.ClustersClient;
import com.azure.resourcemanager.avs.fluent.models.ClusterInner;
import com.azure.resourcemanager.avs.models.Cluster;
import com.azure.resourcemanager.avs.models.Clusters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ClustersImpl implements Clusters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClustersImpl.class);

    private final ClustersClient innerClient;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    public ClustersImpl(ClustersClient innerClient, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Cluster> list(String resourceGroupName, String privateCloudName) {
        PagedIterable<ClusterInner> inner = this.serviceClient().list(resourceGroupName, privateCloudName);
        return Utils.mapPage(inner, inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<Cluster> list(String resourceGroupName, String privateCloudName, Context context) {
        PagedIterable<ClusterInner> inner = this.serviceClient().list(resourceGroupName, privateCloudName, context);
        return Utils.mapPage(inner, inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public Cluster get(String resourceGroupName, String privateCloudName, String clusterName) {
        ClusterInner inner = this.serviceClient().get(resourceGroupName, privateCloudName, clusterName);
        if (inner != null) {
            return new ClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Cluster> getWithResponse(
        String resourceGroupName, String privateCloudName, String clusterName, Context context) {
        Response<ClusterInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, privateCloudName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String privateCloudName, String clusterName) {
        this.serviceClient().delete(resourceGroupName, privateCloudName, clusterName);
    }

    public void delete(String resourceGroupName, String privateCloudName, String clusterName, Context context) {
        this.serviceClient().delete(resourceGroupName, privateCloudName, clusterName, context);
    }

    public Cluster getById(String id) {
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
        return this.getWithResponse(resourceGroupName, privateCloudName, clusterName, Context.NONE).getValue();
    }

    public Response<Cluster> getByIdWithResponse(String id, Context context) {
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
        return this.getWithResponse(resourceGroupName, privateCloudName, clusterName, context);
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
        this.delete(resourceGroupName, privateCloudName, clusterName, Context.NONE);
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
        this.delete(resourceGroupName, privateCloudName, clusterName, context);
    }

    private ClustersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }

    public ClusterImpl define(String name) {
        return new ClusterImpl(name, this.manager());
    }
}
