// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.generated.fluent.ProviderResourceTypesClient;
import com.azure.resourcemanager.resources.generated.fluent.models.ProviderResourceTypeListResultInner;
import com.azure.resourcemanager.resources.generated.models.ProviderResourceTypeListResult;
import com.azure.resourcemanager.resources.generated.models.ProviderResourceTypes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProviderResourceTypesImpl implements ProviderResourceTypes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProviderResourceTypesImpl.class);

    private final ProviderResourceTypesClient innerClient;

    private final com.azure.resourcemanager.resources.generated.ResourceManager serviceManager;

    public ProviderResourceTypesImpl(
        ProviderResourceTypesClient innerClient,
        com.azure.resourcemanager.resources.generated.ResourceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ProviderResourceTypeListResult list(String resourceProviderNamespace) {
        ProviderResourceTypeListResultInner inner = this.serviceClient().list(resourceProviderNamespace);
        if (inner != null) {
            return new ProviderResourceTypeListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProviderResourceTypeListResult> listWithResponse(
        String resourceProviderNamespace, String expand, Context context) {
        Response<ProviderResourceTypeListResultInner> inner =
            this.serviceClient().listWithResponse(resourceProviderNamespace, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProviderResourceTypeListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ProviderResourceTypesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.resources.generated.ResourceManager manager() {
        return this.serviceManager;
    }
}
