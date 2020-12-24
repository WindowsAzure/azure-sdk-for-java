// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iotcentral.IotCentralManager;
import com.azure.resourcemanager.iotcentral.fluent.AppsClient;
import com.azure.resourcemanager.iotcentral.fluent.models.AppAvailabilityInfoInner;
import com.azure.resourcemanager.iotcentral.fluent.models.AppInner;
import com.azure.resourcemanager.iotcentral.fluent.models.AppTemplateInner;
import com.azure.resourcemanager.iotcentral.models.App;
import com.azure.resourcemanager.iotcentral.models.AppAvailabilityInfo;
import com.azure.resourcemanager.iotcentral.models.AppTemplate;
import com.azure.resourcemanager.iotcentral.models.Apps;
import com.azure.resourcemanager.iotcentral.models.OperationInputs;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AppsImpl implements Apps {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppsImpl.class);

    private final AppsClient innerClient;

    private final IotCentralManager serviceManager;

    public AppsImpl(AppsClient innerClient, IotCentralManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public App getByResourceGroup(String resourceGroupName, String resourceName) {
        AppInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, resourceName);
        if (inner != null) {
            return new AppImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<App> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<AppInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AppImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String resourceName) {
        this.serviceClient().delete(resourceGroupName, resourceName);
    }

    public void delete(String resourceGroupName, String resourceName, Context context) {
        this.serviceClient().delete(resourceGroupName, resourceName, context);
    }

    public PagedIterable<App> list() {
        PagedIterable<AppInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new AppImpl(inner1, this.manager()));
    }

    public PagedIterable<App> list(Context context) {
        PagedIterable<AppInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new AppImpl(inner1, this.manager()));
    }

    public PagedIterable<App> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AppInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new AppImpl(inner1, this.manager()));
    }

    public PagedIterable<App> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AppInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new AppImpl(inner1, this.manager()));
    }

    public AppAvailabilityInfo checkNameAvailability(OperationInputs operationInputs) {
        AppAvailabilityInfoInner inner = this.serviceClient().checkNameAvailability(operationInputs);
        if (inner != null) {
            return new AppAvailabilityInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AppAvailabilityInfo> checkNameAvailabilityWithResponse(
        OperationInputs operationInputs, Context context) {
        Response<AppAvailabilityInfoInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(operationInputs, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AppAvailabilityInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AppAvailabilityInfo checkSubdomainAvailability(OperationInputs operationInputs) {
        AppAvailabilityInfoInner inner = this.serviceClient().checkSubdomainAvailability(operationInputs);
        if (inner != null) {
            return new AppAvailabilityInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AppAvailabilityInfo> checkSubdomainAvailabilityWithResponse(
        OperationInputs operationInputs, Context context) {
        Response<AppAvailabilityInfoInner> inner =
            this.serviceClient().checkSubdomainAvailabilityWithResponse(operationInputs, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AppAvailabilityInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<AppTemplate> listTemplates() {
        PagedIterable<AppTemplateInner> inner = this.serviceClient().listTemplates();
        return inner.mapPage(inner1 -> new AppTemplateImpl(inner1, this.manager()));
    }

    public PagedIterable<AppTemplate> listTemplates(Context context) {
        PagedIterable<AppTemplateInner> inner = this.serviceClient().listTemplates(context);
        return inner.mapPage(inner1 -> new AppTemplateImpl(inner1, this.manager()));
    }

    public App getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "IoTApps");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IoTApps'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
    }

    public Response<App> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "IoTApps");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IoTApps'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
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
        String resourceName = Utils.getValueFromIdByName(id, "IoTApps");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IoTApps'.", id)));
        }
        this.delete(resourceGroupName, resourceName, Context.NONE);
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
        String resourceName = Utils.getValueFromIdByName(id, "IoTApps");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'IoTApps'.", id)));
        }
        this.delete(resourceGroupName, resourceName, context);
    }

    private AppsClient serviceClient() {
        return this.innerClient;
    }

    private IotCentralManager manager() {
        return this.serviceManager;
    }

    public AppImpl define(String name) {
        return new AppImpl(name, this.manager());
    }
}
