// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagesync.fluent.SyncGroupsClient;
import com.azure.resourcemanager.storagesync.fluent.models.SyncGroupInner;
import com.azure.resourcemanager.storagesync.models.SyncGroup;
import com.azure.resourcemanager.storagesync.models.SyncGroups;
import com.azure.resourcemanager.storagesync.models.SyncGroupsDeleteResponse;
import com.azure.resourcemanager.storagesync.models.SyncGroupsGetResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SyncGroupsImpl implements SyncGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SyncGroupsImpl.class);

    private final SyncGroupsClient innerClient;

    private final com.azure.resourcemanager.storagesync.StoragesyncManager serviceManager;

    public SyncGroupsImpl(
        SyncGroupsClient innerClient, com.azure.resourcemanager.storagesync.StoragesyncManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SyncGroup> listByStorageSyncService(String resourceGroupName, String storageSyncServiceName) {
        PagedIterable<SyncGroupInner> inner =
            this.serviceClient().listByStorageSyncService(resourceGroupName, storageSyncServiceName);
        return Utils.mapPage(inner, inner1 -> new SyncGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<SyncGroup> listByStorageSyncService(
        String resourceGroupName, String storageSyncServiceName, Context context) {
        PagedIterable<SyncGroupInner> inner =
            this.serviceClient().listByStorageSyncService(resourceGroupName, storageSyncServiceName, context);
        return Utils.mapPage(inner, inner1 -> new SyncGroupImpl(inner1, this.manager()));
    }

    public SyncGroup get(String resourceGroupName, String storageSyncServiceName, String syncGroupName) {
        SyncGroupInner inner = this.serviceClient().get(resourceGroupName, storageSyncServiceName, syncGroupName);
        if (inner != null) {
            return new SyncGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SyncGroup> getWithResponse(
        String resourceGroupName, String storageSyncServiceName, String syncGroupName, Context context) {
        SyncGroupsGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, storageSyncServiceName, syncGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SyncGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String storageSyncServiceName, String syncGroupName) {
        this.serviceClient().delete(resourceGroupName, storageSyncServiceName, syncGroupName);
    }

    public SyncGroupsDeleteResponse deleteWithResponse(
        String resourceGroupName, String storageSyncServiceName, String syncGroupName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, storageSyncServiceName, syncGroupName, context);
    }

    public SyncGroup getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageSyncServiceName = Utils.getValueFromIdByName(id, "storageSyncServices");
        if (storageSyncServiceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storageSyncServices'.", id)));
        }
        String syncGroupName = Utils.getValueFromIdByName(id, "syncGroups");
        if (syncGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'syncGroups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, storageSyncServiceName, syncGroupName, Context.NONE).getValue();
    }

    public Response<SyncGroup> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageSyncServiceName = Utils.getValueFromIdByName(id, "storageSyncServices");
        if (storageSyncServiceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storageSyncServices'.", id)));
        }
        String syncGroupName = Utils.getValueFromIdByName(id, "syncGroups");
        if (syncGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'syncGroups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, storageSyncServiceName, syncGroupName, context);
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
        String storageSyncServiceName = Utils.getValueFromIdByName(id, "storageSyncServices");
        if (storageSyncServiceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storageSyncServices'.", id)));
        }
        String syncGroupName = Utils.getValueFromIdByName(id, "syncGroups");
        if (syncGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'syncGroups'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, storageSyncServiceName, syncGroupName, Context.NONE).getValue();
    }

    public SyncGroupsDeleteResponse deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageSyncServiceName = Utils.getValueFromIdByName(id, "storageSyncServices");
        if (storageSyncServiceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'storageSyncServices'.", id)));
        }
        String syncGroupName = Utils.getValueFromIdByName(id, "syncGroups");
        if (syncGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'syncGroups'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, storageSyncServiceName, syncGroupName, context);
    }

    private SyncGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storagesync.StoragesyncManager manager() {
        return this.serviceManager;
    }

    public SyncGroupImpl define(String name) {
        return new SyncGroupImpl(name, this.manager());
    }
}
