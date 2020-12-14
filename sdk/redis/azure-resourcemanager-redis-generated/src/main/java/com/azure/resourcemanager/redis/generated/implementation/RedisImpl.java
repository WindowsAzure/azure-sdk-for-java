// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redis.generated.RedisManager;
import com.azure.resourcemanager.redis.generated.fluent.RedisClient;
import com.azure.resourcemanager.redis.generated.fluent.models.NotificationListResponseInner;
import com.azure.resourcemanager.redis.generated.fluent.models.RedisAccessKeysInner;
import com.azure.resourcemanager.redis.generated.fluent.models.RedisForceRebootResponseInner;
import com.azure.resourcemanager.redis.generated.fluent.models.RedisResourceInner;
import com.azure.resourcemanager.redis.generated.models.CheckNameAvailabilityParameters;
import com.azure.resourcemanager.redis.generated.models.ExportRdbParameters;
import com.azure.resourcemanager.redis.generated.models.ImportRdbParameters;
import com.azure.resourcemanager.redis.generated.models.NotificationListResponse;
import com.azure.resourcemanager.redis.generated.models.Redis;
import com.azure.resourcemanager.redis.generated.models.RedisAccessKeys;
import com.azure.resourcemanager.redis.generated.models.RedisForceRebootResponse;
import com.azure.resourcemanager.redis.generated.models.RedisRebootParameters;
import com.azure.resourcemanager.redis.generated.models.RedisRegenerateKeyParameters;
import com.azure.resourcemanager.redis.generated.models.RedisResource;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RedisImpl implements Redis {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RedisImpl.class);

    private final RedisClient innerClient;

    private final RedisManager serviceManager;

    public RedisImpl(RedisClient innerClient, RedisManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void checkNameAvailability(CheckNameAvailabilityParameters parameters) {
        this.serviceClient().checkNameAvailability(parameters);
    }

    public Response<Void> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityParameters parameters, Context context) {
        return this.serviceClient().checkNameAvailabilityWithResponse(parameters, context);
    }

    public NotificationListResponse listUpgradeNotifications(String resourceGroupName, String name, double history) {
        NotificationListResponseInner inner =
            this.serviceClient().listUpgradeNotifications(resourceGroupName, name, history);
        if (inner != null) {
            return new NotificationListResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NotificationListResponse> listUpgradeNotificationsWithResponse(
        String resourceGroupName, String name, double history, Context context) {
        Response<NotificationListResponseInner> inner =
            this.serviceClient().listUpgradeNotificationsWithResponse(resourceGroupName, name, history, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NotificationListResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String name) {
        this.serviceClient().delete(resourceGroupName, name);
    }

    public void delete(String resourceGroupName, String name, Context context) {
        this.serviceClient().delete(resourceGroupName, name, context);
    }

    public RedisResource getByResourceGroup(String resourceGroupName, String name) {
        RedisResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, name);
        if (inner != null) {
            return new RedisResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RedisResource> getByResourceGroupWithResponse(
        String resourceGroupName, String name, Context context) {
        Response<RedisResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RedisResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<RedisResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<RedisResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new RedisResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<RedisResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<RedisResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new RedisResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<RedisResource> list() {
        PagedIterable<RedisResourceInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new RedisResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<RedisResource> list(Context context) {
        PagedIterable<RedisResourceInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new RedisResourceImpl(inner1, this.manager()));
    }

    public RedisAccessKeys listKeys(String resourceGroupName, String name) {
        RedisAccessKeysInner inner = this.serviceClient().listKeys(resourceGroupName, name);
        if (inner != null) {
            return new RedisAccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RedisAccessKeys> listKeysWithResponse(String resourceGroupName, String name, Context context) {
        Response<RedisAccessKeysInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RedisAccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RedisAccessKeys regenerateKey(
        String resourceGroupName, String name, RedisRegenerateKeyParameters parameters) {
        RedisAccessKeysInner inner = this.serviceClient().regenerateKey(resourceGroupName, name, parameters);
        if (inner != null) {
            return new RedisAccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RedisAccessKeys> regenerateKeyWithResponse(
        String resourceGroupName, String name, RedisRegenerateKeyParameters parameters, Context context) {
        Response<RedisAccessKeysInner> inner =
            this.serviceClient().regenerateKeyWithResponse(resourceGroupName, name, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RedisAccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RedisForceRebootResponse forceReboot(
        String resourceGroupName, String name, RedisRebootParameters parameters) {
        RedisForceRebootResponseInner inner = this.serviceClient().forceReboot(resourceGroupName, name, parameters);
        if (inner != null) {
            return new RedisForceRebootResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RedisForceRebootResponse> forceRebootWithResponse(
        String resourceGroupName, String name, RedisRebootParameters parameters, Context context) {
        Response<RedisForceRebootResponseInner> inner =
            this.serviceClient().forceRebootWithResponse(resourceGroupName, name, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RedisForceRebootResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void importData(String resourceGroupName, String name, ImportRdbParameters parameters) {
        this.serviceClient().importData(resourceGroupName, name, parameters);
    }

    public void importData(String resourceGroupName, String name, ImportRdbParameters parameters, Context context) {
        this.serviceClient().importData(resourceGroupName, name, parameters, context);
    }

    public void exportData(String resourceGroupName, String name, ExportRdbParameters parameters) {
        this.serviceClient().exportData(resourceGroupName, name, parameters);
    }

    public void exportData(String resourceGroupName, String name, ExportRdbParameters parameters, Context context) {
        this.serviceClient().exportData(resourceGroupName, name, parameters, context);
    }

    public RedisResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "redis");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'redis'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE).getValue();
    }

    public Response<RedisResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "redis");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'redis'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, name, context);
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
        String name = Utils.getValueFromIdByName(id, "redis");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'redis'.", id)));
        }
        this.delete(resourceGroupName, name, Context.NONE);
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
        String name = Utils.getValueFromIdByName(id, "redis");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'redis'.", id)));
        }
        this.delete(resourceGroupName, name, context);
    }

    private RedisClient serviceClient() {
        return this.innerClient;
    }

    private RedisManager manager() {
        return this.serviceManager;
    }

    public RedisResourceImpl define(String name) {
        return new RedisResourceImpl(name, this.manager());
    }
}
