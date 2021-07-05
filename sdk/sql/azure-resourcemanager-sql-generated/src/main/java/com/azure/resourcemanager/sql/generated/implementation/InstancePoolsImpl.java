// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.InstancePoolsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.InstancePoolInner;
import com.azure.resourcemanager.sql.generated.models.InstancePool;
import com.azure.resourcemanager.sql.generated.models.InstancePools;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class InstancePoolsImpl implements InstancePools {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InstancePoolsImpl.class);

    private final InstancePoolsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public InstancePoolsImpl(
        InstancePoolsClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public InstancePool getByResourceGroup(String resourceGroupName, String instancePoolName) {
        InstancePoolInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, instancePoolName);
        if (inner != null) {
            return new InstancePoolImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<InstancePool> getByResourceGroupWithResponse(
        String resourceGroupName, String instancePoolName, Context context) {
        Response<InstancePoolInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, instancePoolName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new InstancePoolImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String instancePoolName) {
        this.serviceClient().delete(resourceGroupName, instancePoolName);
    }

    public void delete(String resourceGroupName, String instancePoolName, Context context) {
        this.serviceClient().delete(resourceGroupName, instancePoolName, context);
    }

    public PagedIterable<InstancePool> listByResourceGroup(String resourceGroupName) {
        PagedIterable<InstancePoolInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new InstancePoolImpl(inner1, this.manager()));
    }

    public PagedIterable<InstancePool> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<InstancePoolInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new InstancePoolImpl(inner1, this.manager()));
    }

    public PagedIterable<InstancePool> list() {
        PagedIterable<InstancePoolInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new InstancePoolImpl(inner1, this.manager()));
    }

    public PagedIterable<InstancePool> list(Context context) {
        PagedIterable<InstancePoolInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new InstancePoolImpl(inner1, this.manager()));
    }

    public InstancePool getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String instancePoolName = Utils.getValueFromIdByName(id, "instancePools");
        if (instancePoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'instancePools'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, instancePoolName, Context.NONE).getValue();
    }

    public Response<InstancePool> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String instancePoolName = Utils.getValueFromIdByName(id, "instancePools");
        if (instancePoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'instancePools'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, instancePoolName, context);
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
        String instancePoolName = Utils.getValueFromIdByName(id, "instancePools");
        if (instancePoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'instancePools'.", id)));
        }
        this.delete(resourceGroupName, instancePoolName, Context.NONE);
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
        String instancePoolName = Utils.getValueFromIdByName(id, "instancePools");
        if (instancePoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'instancePools'.", id)));
        }
        this.delete(resourceGroupName, instancePoolName, context);
    }

    private InstancePoolsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public InstancePoolImpl define(String name) {
        return new InstancePoolImpl(name, this.manager());
    }
}
