// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resourcehealth.fluent.OperationsClient;
import com.azure.resourcemanager.resourcehealth.fluent.models.OperationListResultInner;
import com.azure.resourcemanager.resourcehealth.models.OperationListResult;
import com.azure.resourcemanager.resourcehealth.models.Operations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.resourcehealth.ResourceHealthManager serviceManager;

    public OperationsImpl(
        OperationsClient innerClient, com.azure.resourcemanager.resourcehealth.ResourceHealthManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OperationListResult list() {
        OperationListResultInner inner = this.serviceClient().list();
        if (inner != null) {
            return new OperationListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OperationListResult> listWithResponse(Context context) {
        Response<OperationListResultInner> inner = this.serviceClient().listWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager() {
        return this.serviceManager;
    }
}
