// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policyinsights.PolicyInsightsManager;
import com.azure.resourcemanager.policyinsights.fluent.OperationsClient;
import com.azure.resourcemanager.policyinsights.fluent.models.OperationsListResultsInner;
import com.azure.resourcemanager.policyinsights.models.Operations;
import com.azure.resourcemanager.policyinsights.models.OperationsListResults;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final PolicyInsightsManager serviceManager;

    public OperationsImpl(OperationsClient innerClient, PolicyInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OperationsListResults list() {
        OperationsListResultsInner inner = this.serviceClient().list();
        if (inner != null) {
            return new OperationsListResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OperationsListResults> listWithResponse(Context context) {
        Response<OperationsListResultsInner> inner = this.serviceClient().listWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationsListResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private PolicyInsightsManager manager() {
        return this.serviceManager;
    }
}
