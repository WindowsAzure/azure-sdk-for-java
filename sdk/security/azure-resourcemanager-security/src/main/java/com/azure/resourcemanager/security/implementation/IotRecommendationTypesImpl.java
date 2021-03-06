// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.IotRecommendationTypesClient;
import com.azure.resourcemanager.security.fluent.models.IotRecommendationTypeInner;
import com.azure.resourcemanager.security.fluent.models.IotRecommendationTypeListInner;
import com.azure.resourcemanager.security.models.IotRecommendationType;
import com.azure.resourcemanager.security.models.IotRecommendationTypeList;
import com.azure.resourcemanager.security.models.IotRecommendationTypes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IotRecommendationTypesImpl implements IotRecommendationTypes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotRecommendationTypesImpl.class);

    private final IotRecommendationTypesClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public IotRecommendationTypesImpl(
        IotRecommendationTypesClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public IotRecommendationTypeList list() {
        IotRecommendationTypeListInner inner = this.serviceClient().list();
        if (inner != null) {
            return new IotRecommendationTypeListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IotRecommendationTypeList> listWithResponse(Context context) {
        Response<IotRecommendationTypeListInner> inner = this.serviceClient().listWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IotRecommendationTypeListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IotRecommendationType get(String iotRecommendationTypeName) {
        IotRecommendationTypeInner inner = this.serviceClient().get(iotRecommendationTypeName);
        if (inner != null) {
            return new IotRecommendationTypeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IotRecommendationType> getWithResponse(String iotRecommendationTypeName, Context context) {
        Response<IotRecommendationTypeInner> inner =
            this.serviceClient().getWithResponse(iotRecommendationTypeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IotRecommendationTypeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private IotRecommendationTypesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
