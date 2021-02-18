// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.NetAppManager;
import com.azure.resourcemanager.netapp.fluent.NetAppResourcesClient;
import com.azure.resourcemanager.netapp.fluent.models.CheckAvailabilityResponseInner;
import com.azure.resourcemanager.netapp.models.CheckAvailabilityResponse;
import com.azure.resourcemanager.netapp.models.NetAppResources;
import com.azure.resourcemanager.netapp.models.QuotaAvailabilityRequest;
import com.azure.resourcemanager.netapp.models.ResourceNameAvailabilityRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class NetAppResourcesImpl implements NetAppResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetAppResourcesImpl.class);

    private final NetAppResourcesClient innerClient;

    private final NetAppManager serviceManager;

    public NetAppResourcesImpl(NetAppResourcesClient innerClient, NetAppManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckAvailabilityResponse checkNameAvailability(String location, ResourceNameAvailabilityRequest body) {
        CheckAvailabilityResponseInner inner = this.serviceClient().checkNameAvailability(location, body);
        if (inner != null) {
            return new CheckAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckAvailabilityResponse> checkNameAvailabilityWithResponse(
        String location, ResourceNameAvailabilityRequest body, Context context) {
        Response<CheckAvailabilityResponseInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(location, body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckAvailabilityResponse checkFilePathAvailability(String location, ResourceNameAvailabilityRequest body) {
        CheckAvailabilityResponseInner inner = this.serviceClient().checkFilePathAvailability(location, body);
        if (inner != null) {
            return new CheckAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckAvailabilityResponse> checkFilePathAvailabilityWithResponse(
        String location, ResourceNameAvailabilityRequest body, Context context) {
        Response<CheckAvailabilityResponseInner> inner =
            this.serviceClient().checkFilePathAvailabilityWithResponse(location, body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckAvailabilityResponse checkQuotaAvailability(String location, QuotaAvailabilityRequest body) {
        CheckAvailabilityResponseInner inner = this.serviceClient().checkQuotaAvailability(location, body);
        if (inner != null) {
            return new CheckAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckAvailabilityResponse> checkQuotaAvailabilityWithResponse(
        String location, QuotaAvailabilityRequest body, Context context) {
        Response<CheckAvailabilityResponseInner> inner =
            this.serviceClient().checkQuotaAvailabilityWithResponse(location, body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private NetAppResourcesClient serviceClient() {
        return this.innerClient;
    }

    private NetAppManager manager() {
        return this.serviceManager;
    }
}
