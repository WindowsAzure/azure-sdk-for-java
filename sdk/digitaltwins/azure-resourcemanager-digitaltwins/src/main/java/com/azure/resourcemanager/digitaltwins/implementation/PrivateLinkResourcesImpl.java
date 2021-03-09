// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.digitaltwins.AzureDigitalTwinsManager;
import com.azure.resourcemanager.digitaltwins.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.digitaltwins.fluent.models.GroupIdInformationInner;
import com.azure.resourcemanager.digitaltwins.fluent.models.GroupIdInformationResponseInner;
import com.azure.resourcemanager.digitaltwins.models.GroupIdInformation;
import com.azure.resourcemanager.digitaltwins.models.GroupIdInformationResponse;
import com.azure.resourcemanager.digitaltwins.models.PrivateLinkResources;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourcesImpl.class);

    private final PrivateLinkResourcesClient innerClient;

    private final AzureDigitalTwinsManager serviceManager;

    public PrivateLinkResourcesImpl(PrivateLinkResourcesClient innerClient, AzureDigitalTwinsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public GroupIdInformationResponse list(String resourceGroupName, String resourceName) {
        GroupIdInformationResponseInner inner = this.serviceClient().list(resourceGroupName, resourceName);
        if (inner != null) {
            return new GroupIdInformationResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GroupIdInformationResponse> listWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<GroupIdInformationResponseInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GroupIdInformationResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public GroupIdInformation get(String resourceGroupName, String resourceName, String resourceId) {
        GroupIdInformationInner inner = this.serviceClient().get(resourceGroupName, resourceName, resourceId);
        if (inner != null) {
            return new GroupIdInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GroupIdInformation> getWithResponse(
        String resourceGroupName, String resourceName, String resourceId, Context context) {
        Response<GroupIdInformationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, resourceName, resourceId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GroupIdInformationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private AzureDigitalTwinsManager manager() {
        return this.serviceManager;
    }
}
