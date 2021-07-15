// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.DeviceSecurityGroupsClient;
import com.azure.resourcemanager.security.fluent.models.DeviceSecurityGroupInner;
import com.azure.resourcemanager.security.models.DeviceSecurityGroup;
import com.azure.resourcemanager.security.models.DeviceSecurityGroups;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DeviceSecurityGroupsImpl implements DeviceSecurityGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeviceSecurityGroupsImpl.class);

    private final DeviceSecurityGroupsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public DeviceSecurityGroupsImpl(
        DeviceSecurityGroupsClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DeviceSecurityGroup> list(String resourceId) {
        PagedIterable<DeviceSecurityGroupInner> inner = this.serviceClient().list(resourceId);
        return Utils.mapPage(inner, inner1 -> new DeviceSecurityGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<DeviceSecurityGroup> list(String resourceId, Context context) {
        PagedIterable<DeviceSecurityGroupInner> inner = this.serviceClient().list(resourceId, context);
        return Utils.mapPage(inner, inner1 -> new DeviceSecurityGroupImpl(inner1, this.manager()));
    }

    public DeviceSecurityGroup get(String resourceId, String deviceSecurityGroupName) {
        DeviceSecurityGroupInner inner = this.serviceClient().get(resourceId, deviceSecurityGroupName);
        if (inner != null) {
            return new DeviceSecurityGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeviceSecurityGroup> getWithResponse(
        String resourceId, String deviceSecurityGroupName, Context context) {
        Response<DeviceSecurityGroupInner> inner =
            this.serviceClient().getWithResponse(resourceId, deviceSecurityGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeviceSecurityGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceId, String deviceSecurityGroupName) {
        this.serviceClient().delete(resourceId, deviceSecurityGroupName);
    }

    public Response<Void> deleteWithResponse(String resourceId, String deviceSecurityGroupName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceId, deviceSecurityGroupName, context);
    }

    public DeviceSecurityGroup getById(String id) {
        String resourceId =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{resourceId}/providers/Microsoft.Security/deviceSecurityGroups/{deviceSecurityGroupName}",
                    "resourceId");
        if (resourceId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resourceId'.", id)));
        }
        String deviceSecurityGroupName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{resourceId}/providers/Microsoft.Security/deviceSecurityGroups/{deviceSecurityGroupName}",
                    "deviceSecurityGroupName");
        if (deviceSecurityGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'deviceSecurityGroups'.",
                                id)));
        }
        return this.getWithResponse(resourceId, deviceSecurityGroupName, Context.NONE).getValue();
    }

    public Response<DeviceSecurityGroup> getByIdWithResponse(String id, Context context) {
        String resourceId =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{resourceId}/providers/Microsoft.Security/deviceSecurityGroups/{deviceSecurityGroupName}",
                    "resourceId");
        if (resourceId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resourceId'.", id)));
        }
        String deviceSecurityGroupName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{resourceId}/providers/Microsoft.Security/deviceSecurityGroups/{deviceSecurityGroupName}",
                    "deviceSecurityGroupName");
        if (deviceSecurityGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'deviceSecurityGroups'.",
                                id)));
        }
        return this.getWithResponse(resourceId, deviceSecurityGroupName, context);
    }

    public void deleteById(String id) {
        String resourceId =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{resourceId}/providers/Microsoft.Security/deviceSecurityGroups/{deviceSecurityGroupName}",
                    "resourceId");
        if (resourceId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resourceId'.", id)));
        }
        String deviceSecurityGroupName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{resourceId}/providers/Microsoft.Security/deviceSecurityGroups/{deviceSecurityGroupName}",
                    "deviceSecurityGroupName");
        if (deviceSecurityGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'deviceSecurityGroups'.",
                                id)));
        }
        this.deleteWithResponse(resourceId, deviceSecurityGroupName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceId =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{resourceId}/providers/Microsoft.Security/deviceSecurityGroups/{deviceSecurityGroupName}",
                    "resourceId");
        if (resourceId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resourceId'.", id)));
        }
        String deviceSecurityGroupName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{resourceId}/providers/Microsoft.Security/deviceSecurityGroups/{deviceSecurityGroupName}",
                    "deviceSecurityGroupName");
        if (deviceSecurityGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'deviceSecurityGroups'.",
                                id)));
        }
        return this.deleteWithResponse(resourceId, deviceSecurityGroupName, context);
    }

    private DeviceSecurityGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    public DeviceSecurityGroupImpl define(String name) {
        return new DeviceSecurityGroupImpl(name, this.manager());
    }
}
