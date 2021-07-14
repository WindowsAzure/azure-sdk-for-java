// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.IotSecuritySolutionAnalyticsClient;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionAnalyticsModelInner;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionAnalyticsModelListInner;
import com.azure.resourcemanager.security.models.IoTSecuritySolutionAnalyticsModel;
import com.azure.resourcemanager.security.models.IoTSecuritySolutionAnalyticsModelList;
import com.azure.resourcemanager.security.models.IotSecuritySolutionAnalytics;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IotSecuritySolutionAnalyticsImpl implements IotSecuritySolutionAnalytics {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotSecuritySolutionAnalyticsImpl.class);

    private final IotSecuritySolutionAnalyticsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public IotSecuritySolutionAnalyticsImpl(
        IotSecuritySolutionAnalyticsClient innerClient,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public IoTSecuritySolutionAnalyticsModelList list(String resourceGroupName, String solutionName) {
        IoTSecuritySolutionAnalyticsModelListInner inner = this.serviceClient().list(resourceGroupName, solutionName);
        if (inner != null) {
            return new IoTSecuritySolutionAnalyticsModelListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IoTSecuritySolutionAnalyticsModelList> listWithResponse(
        String resourceGroupName, String solutionName, Context context) {
        Response<IoTSecuritySolutionAnalyticsModelListInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, solutionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IoTSecuritySolutionAnalyticsModelListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IoTSecuritySolutionAnalyticsModel get(String resourceGroupName, String solutionName) {
        IoTSecuritySolutionAnalyticsModelInner inner = this.serviceClient().get(resourceGroupName, solutionName);
        if (inner != null) {
            return new IoTSecuritySolutionAnalyticsModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IoTSecuritySolutionAnalyticsModel> getWithResponse(
        String resourceGroupName, String solutionName, Context context) {
        Response<IoTSecuritySolutionAnalyticsModelInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, solutionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IoTSecuritySolutionAnalyticsModelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private IotSecuritySolutionAnalyticsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
