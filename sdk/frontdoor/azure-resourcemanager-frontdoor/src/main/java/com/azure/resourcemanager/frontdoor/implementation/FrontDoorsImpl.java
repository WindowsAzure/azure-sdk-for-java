// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.fluent.FrontDoorsClient;
import com.azure.resourcemanager.frontdoor.fluent.models.FrontDoorInner;
import com.azure.resourcemanager.frontdoor.fluent.models.ValidateCustomDomainOutputInner;
import com.azure.resourcemanager.frontdoor.models.FrontDoor;
import com.azure.resourcemanager.frontdoor.models.FrontDoors;
import com.azure.resourcemanager.frontdoor.models.ValidateCustomDomainInput;
import com.azure.resourcemanager.frontdoor.models.ValidateCustomDomainOutput;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class FrontDoorsImpl implements FrontDoors {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FrontDoorsImpl.class);

    private final FrontDoorsClient innerClient;

    private final com.azure.resourcemanager.frontdoor.FrontDoorManager serviceManager;

    public FrontDoorsImpl(
        FrontDoorsClient innerClient, com.azure.resourcemanager.frontdoor.FrontDoorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FrontDoor> list() {
        PagedIterable<FrontDoorInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new FrontDoorImpl(inner1, this.manager()));
    }

    public PagedIterable<FrontDoor> list(Context context) {
        PagedIterable<FrontDoorInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new FrontDoorImpl(inner1, this.manager()));
    }

    public PagedIterable<FrontDoor> listByResourceGroup(String resourceGroupName) {
        PagedIterable<FrontDoorInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new FrontDoorImpl(inner1, this.manager()));
    }

    public PagedIterable<FrontDoor> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<FrontDoorInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new FrontDoorImpl(inner1, this.manager()));
    }

    public FrontDoor getByResourceGroup(String resourceGroupName, String frontDoorName) {
        FrontDoorInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, frontDoorName);
        if (inner != null) {
            return new FrontDoorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<FrontDoor> getByResourceGroupWithResponse(
        String resourceGroupName, String frontDoorName, Context context) {
        Response<FrontDoorInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, frontDoorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FrontDoorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String frontDoorName) {
        this.serviceClient().delete(resourceGroupName, frontDoorName);
    }

    public void delete(String resourceGroupName, String frontDoorName, Context context) {
        this.serviceClient().delete(resourceGroupName, frontDoorName, context);
    }

    public ValidateCustomDomainOutput validateCustomDomain(
        String resourceGroupName, String frontDoorName, ValidateCustomDomainInput customDomainProperties) {
        ValidateCustomDomainOutputInner inner =
            this.serviceClient().validateCustomDomain(resourceGroupName, frontDoorName, customDomainProperties);
        if (inner != null) {
            return new ValidateCustomDomainOutputImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ValidateCustomDomainOutput> validateCustomDomainWithResponse(
        String resourceGroupName,
        String frontDoorName,
        ValidateCustomDomainInput customDomainProperties,
        Context context) {
        Response<ValidateCustomDomainOutputInner> inner =
            this
                .serviceClient()
                .validateCustomDomainWithResponse(resourceGroupName, frontDoorName, customDomainProperties, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ValidateCustomDomainOutputImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FrontDoor getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String frontDoorName = Utils.getValueFromIdByName(id, "frontDoors");
        if (frontDoorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'frontDoors'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, frontDoorName, Context.NONE).getValue();
    }

    public Response<FrontDoor> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String frontDoorName = Utils.getValueFromIdByName(id, "frontDoors");
        if (frontDoorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'frontDoors'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, frontDoorName, context);
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
        String frontDoorName = Utils.getValueFromIdByName(id, "frontDoors");
        if (frontDoorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'frontDoors'.", id)));
        }
        this.delete(resourceGroupName, frontDoorName, Context.NONE);
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
        String frontDoorName = Utils.getValueFromIdByName(id, "frontDoors");
        if (frontDoorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'frontDoors'.", id)));
        }
        this.delete(resourceGroupName, frontDoorName, context);
    }

    private FrontDoorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.frontdoor.FrontDoorManager manager() {
        return this.serviceManager;
    }

    public FrontDoorImpl define(String name) {
        return new FrontDoorImpl(name, this.manager());
    }
}
