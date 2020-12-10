// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.IntegrationRuntimeNodesClient;
import com.azure.resourcemanager.synapse.fluent.models.SelfHostedIntegrationRuntimeNodeInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeNodes;
import com.azure.resourcemanager.synapse.models.SelfHostedIntegrationRuntimeNode;
import com.azure.resourcemanager.synapse.models.UpdateIntegrationRuntimeNodeRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IntegrationRuntimeNodesImpl implements IntegrationRuntimeNodes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IntegrationRuntimeNodesImpl.class);

    private final IntegrationRuntimeNodesClient innerClient;

    private final SynapseManager serviceManager;

    public IntegrationRuntimeNodesImpl(IntegrationRuntimeNodesClient innerClient, SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public SelfHostedIntegrationRuntimeNode get(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        SelfHostedIntegrationRuntimeNodeInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, integrationRuntimeName, nodeName);
        if (inner != null) {
            return new SelfHostedIntegrationRuntimeNodeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SelfHostedIntegrationRuntimeNode> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String nodeName,
        Context context) {
        Response<SelfHostedIntegrationRuntimeNodeInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, workspaceName, integrationRuntimeName, nodeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SelfHostedIntegrationRuntimeNodeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SelfHostedIntegrationRuntimeNode update(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String nodeName,
        UpdateIntegrationRuntimeNodeRequest updateIntegrationRuntimeNodeRequest) {
        SelfHostedIntegrationRuntimeNodeInner inner =
            this
                .serviceClient()
                .update(
                    resourceGroupName,
                    workspaceName,
                    integrationRuntimeName,
                    nodeName,
                    updateIntegrationRuntimeNodeRequest);
        if (inner != null) {
            return new SelfHostedIntegrationRuntimeNodeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SelfHostedIntegrationRuntimeNode> updateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String nodeName,
        UpdateIntegrationRuntimeNodeRequest updateIntegrationRuntimeNodeRequest,
        Context context) {
        Response<SelfHostedIntegrationRuntimeNodeInner> inner =
            this
                .serviceClient()
                .updateWithResponse(
                    resourceGroupName,
                    workspaceName,
                    integrationRuntimeName,
                    nodeName,
                    updateIntegrationRuntimeNodeRequest,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SelfHostedIntegrationRuntimeNodeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, integrationRuntimeName, nodeName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String nodeName,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, workspaceName, integrationRuntimeName, nodeName, context);
    }

    private IntegrationRuntimeNodesClient serviceClient() {
        return this.innerClient;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}
