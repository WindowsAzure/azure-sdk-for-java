// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.ExposureControlsClient;
import com.azure.resourcemanager.datafactory.fluent.models.ExposureControlBatchResponseInner;
import com.azure.resourcemanager.datafactory.fluent.models.ExposureControlResponseInner;
import com.azure.resourcemanager.datafactory.models.ExposureControlBatchRequest;
import com.azure.resourcemanager.datafactory.models.ExposureControlBatchResponse;
import com.azure.resourcemanager.datafactory.models.ExposureControlRequest;
import com.azure.resourcemanager.datafactory.models.ExposureControlResponse;
import com.azure.resourcemanager.datafactory.models.ExposureControls;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ExposureControlsImpl implements ExposureControls {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExposureControlsImpl.class);

    private final ExposureControlsClient innerClient;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public ExposureControlsImpl(
        ExposureControlsClient innerClient, com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ExposureControlResponse getFeatureValue(String locationId, ExposureControlRequest exposureControlRequest) {
        ExposureControlResponseInner inner = this.serviceClient().getFeatureValue(locationId, exposureControlRequest);
        if (inner != null) {
            return new ExposureControlResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExposureControlResponse> getFeatureValueWithResponse(
        String locationId, ExposureControlRequest exposureControlRequest, Context context) {
        Response<ExposureControlResponseInner> inner =
            this.serviceClient().getFeatureValueWithResponse(locationId, exposureControlRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExposureControlResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExposureControlResponse getFeatureValueByFactory(
        String resourceGroupName, String factoryName, ExposureControlRequest exposureControlRequest) {
        ExposureControlResponseInner inner =
            this.serviceClient().getFeatureValueByFactory(resourceGroupName, factoryName, exposureControlRequest);
        if (inner != null) {
            return new ExposureControlResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExposureControlResponse> getFeatureValueByFactoryWithResponse(
        String resourceGroupName, String factoryName, ExposureControlRequest exposureControlRequest, Context context) {
        Response<ExposureControlResponseInner> inner =
            this
                .serviceClient()
                .getFeatureValueByFactoryWithResponse(resourceGroupName, factoryName, exposureControlRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExposureControlResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExposureControlBatchResponse queryFeatureValuesByFactory(
        String resourceGroupName, String factoryName, ExposureControlBatchRequest exposureControlBatchRequest) {
        ExposureControlBatchResponseInner inner =
            this
                .serviceClient()
                .queryFeatureValuesByFactory(resourceGroupName, factoryName, exposureControlBatchRequest);
        if (inner != null) {
            return new ExposureControlBatchResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExposureControlBatchResponse> queryFeatureValuesByFactoryWithResponse(
        String resourceGroupName,
        String factoryName,
        ExposureControlBatchRequest exposureControlBatchRequest,
        Context context) {
        Response<ExposureControlBatchResponseInner> inner =
            this
                .serviceClient()
                .queryFeatureValuesByFactoryWithResponse(
                    resourceGroupName, factoryName, exposureControlBatchRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExposureControlBatchResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ExposureControlsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
