// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.fluent.DisksClient;
import com.azure.resourcemanager.devtestlabs.fluent.models.DiskInner;
import com.azure.resourcemanager.devtestlabs.models.AttachDiskProperties;
import com.azure.resourcemanager.devtestlabs.models.DetachDiskProperties;
import com.azure.resourcemanager.devtestlabs.models.Disk;
import com.azure.resourcemanager.devtestlabs.models.Disks;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DisksImpl implements Disks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DisksImpl.class);

    private final DisksClient innerClient;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    public DisksImpl(DisksClient innerClient, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Disk> list(String resourceGroupName, String labName, String username) {
        PagedIterable<DiskInner> inner = this.serviceClient().list(resourceGroupName, labName, username);
        return Utils.mapPage(inner, inner1 -> new DiskImpl(inner1, this.manager()));
    }

    public PagedIterable<Disk> list(
        String resourceGroupName,
        String labName,
        String username,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context) {
        PagedIterable<DiskInner> inner =
            this.serviceClient().list(resourceGroupName, labName, username, expand, filter, top, orderby, context);
        return Utils.mapPage(inner, inner1 -> new DiskImpl(inner1, this.manager()));
    }

    public Disk get(String resourceGroupName, String labName, String username, String name) {
        DiskInner inner = this.serviceClient().get(resourceGroupName, labName, username, name);
        if (inner != null) {
            return new DiskImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Disk> getWithResponse(
        String resourceGroupName, String labName, String username, String name, String expand, Context context) {
        Response<DiskInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, labName, username, name, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiskImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String labName, String username, String name) {
        this.serviceClient().delete(resourceGroupName, labName, username, name);
    }

    public void delete(String resourceGroupName, String labName, String username, String name, Context context) {
        this.serviceClient().delete(resourceGroupName, labName, username, name, context);
    }

    public void attach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        AttachDiskProperties attachDiskProperties) {
        this.serviceClient().attach(resourceGroupName, labName, username, name, attachDiskProperties);
    }

    public void attach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        AttachDiskProperties attachDiskProperties,
        Context context) {
        this.serviceClient().attach(resourceGroupName, labName, username, name, attachDiskProperties, context);
    }

    public void detach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        DetachDiskProperties detachDiskProperties) {
        this.serviceClient().detach(resourceGroupName, labName, username, name, detachDiskProperties);
    }

    public void detach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        DetachDiskProperties detachDiskProperties,
        Context context) {
        this.serviceClient().detach(resourceGroupName, labName, username, name, detachDiskProperties, context);
    }

    public Disk getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String username = Utils.getValueFromIdByName(id, "users");
        if (username == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "disks");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'disks'.", id)));
        }
        String localExpand = null;
        return this.getWithResponse(resourceGroupName, labName, username, name, localExpand, Context.NONE).getValue();
    }

    public Response<Disk> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String username = Utils.getValueFromIdByName(id, "users");
        if (username == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "disks");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'disks'.", id)));
        }
        return this.getWithResponse(resourceGroupName, labName, username, name, expand, context);
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
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String username = Utils.getValueFromIdByName(id, "users");
        if (username == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "disks");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'disks'.", id)));
        }
        this.delete(resourceGroupName, labName, username, name, Context.NONE);
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
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String username = Utils.getValueFromIdByName(id, "users");
        if (username == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "disks");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'disks'.", id)));
        }
        this.delete(resourceGroupName, labName, username, name, context);
    }

    private DisksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    public DiskImpl define(String name) {
        return new DiskImpl(name, this.manager());
    }
}
