// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.MySqlManager;
import com.azure.resourcemanager.mysql.fluent.LocationBasedRecommendedActionSessionsOperationStatusClient;
import com.azure.resourcemanager.mysql.fluent.models.RecommendedActionSessionsOperationStatusInner;
import com.azure.resourcemanager.mysql.models.LocationBasedRecommendedActionSessionsOperationStatus;
import com.azure.resourcemanager.mysql.models.RecommendedActionSessionsOperationStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LocationBasedRecommendedActionSessionsOperationStatusImpl
    implements LocationBasedRecommendedActionSessionsOperationStatus {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(LocationBasedRecommendedActionSessionsOperationStatusImpl.class);

    private final LocationBasedRecommendedActionSessionsOperationStatusClient innerClient;

    private final MySqlManager serviceManager;

    public LocationBasedRecommendedActionSessionsOperationStatusImpl(
        LocationBasedRecommendedActionSessionsOperationStatusClient innerClient, MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public RecommendedActionSessionsOperationStatus get(String locationName, String operationId) {
        RecommendedActionSessionsOperationStatusInner inner = this.serviceClient().get(locationName, operationId);
        if (inner != null) {
            return new RecommendedActionSessionsOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RecommendedActionSessionsOperationStatus> getWithResponse(
        String locationName, String operationId, Context context) {
        Response<RecommendedActionSessionsOperationStatusInner> inner =
            this.serviceClient().getWithResponse(locationName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RecommendedActionSessionsOperationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private LocationBasedRecommendedActionSessionsOperationStatusClient serviceClient() {
        return this.innerClient;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }
}
