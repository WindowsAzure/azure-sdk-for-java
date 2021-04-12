// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.mediaservices.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.mediaservices.fluent.models.PrivateLinkResourceListResultInner;
import com.azure.resourcemanager.mediaservices.models.PrivateLinkResource;
import com.azure.resourcemanager.mediaservices.models.PrivateLinkResourceListResult;
import com.azure.resourcemanager.mediaservices.models.PrivateLinkResources;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourcesImpl.class);

    private final PrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager;

    public PrivateLinkResourcesImpl(
        PrivateLinkResourcesClient innerClient,
        com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PrivateLinkResourceListResult list(String resourceGroupName, String accountName) {
        PrivateLinkResourceListResultInner inner = this.serviceClient().list(resourceGroupName, accountName);
        if (inner != null) {
            return new PrivateLinkResourceListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResourceListResult> listWithResponse(
        String resourceGroupName, String accountName, Context context) {
        Response<PrivateLinkResourceListResultInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourceListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateLinkResource get(String resourceGroupName, String accountName, String name) {
        PrivateLinkResourceInner inner = this.serviceClient().get(resourceGroupName, accountName, name);
        if (inner != null) {
            return new PrivateLinkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResource> getWithResponse(
        String resourceGroupName, String accountName, String name, Context context) {
        Response<PrivateLinkResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mediaservices.MediaServicesManager manager() {
        return this.serviceManager;
    }
}
