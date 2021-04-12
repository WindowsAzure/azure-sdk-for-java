// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.TriggerRunsClient;
import com.azure.resourcemanager.datafactory.fluent.models.TriggerRunsQueryResponseInner;
import com.azure.resourcemanager.datafactory.models.RunFilterParameters;
import com.azure.resourcemanager.datafactory.models.TriggerRuns;
import com.azure.resourcemanager.datafactory.models.TriggerRunsQueryResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TriggerRunsImpl implements TriggerRuns {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TriggerRunsImpl.class);

    private final TriggerRunsClient innerClient;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public TriggerRunsImpl(
        TriggerRunsClient innerClient, com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void rerun(String resourceGroupName, String factoryName, String triggerName, String runId) {
        this.serviceClient().rerun(resourceGroupName, factoryName, triggerName, runId);
    }

    public Response<Void> rerunWithResponse(
        String resourceGroupName, String factoryName, String triggerName, String runId, Context context) {
        return this.serviceClient().rerunWithResponse(resourceGroupName, factoryName, triggerName, runId, context);
    }

    public void cancel(String resourceGroupName, String factoryName, String triggerName, String runId) {
        this.serviceClient().cancel(resourceGroupName, factoryName, triggerName, runId);
    }

    public Response<Void> cancelWithResponse(
        String resourceGroupName, String factoryName, String triggerName, String runId, Context context) {
        return this.serviceClient().cancelWithResponse(resourceGroupName, factoryName, triggerName, runId, context);
    }

    public TriggerRunsQueryResponse queryByFactory(
        String resourceGroupName, String factoryName, RunFilterParameters filterParameters) {
        TriggerRunsQueryResponseInner inner =
            this.serviceClient().queryByFactory(resourceGroupName, factoryName, filterParameters);
        if (inner != null) {
            return new TriggerRunsQueryResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TriggerRunsQueryResponse> queryByFactoryWithResponse(
        String resourceGroupName, String factoryName, RunFilterParameters filterParameters, Context context) {
        Response<TriggerRunsQueryResponseInner> inner =
            this.serviceClient().queryByFactoryWithResponse(resourceGroupName, factoryName, filterParameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TriggerRunsQueryResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private TriggerRunsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
