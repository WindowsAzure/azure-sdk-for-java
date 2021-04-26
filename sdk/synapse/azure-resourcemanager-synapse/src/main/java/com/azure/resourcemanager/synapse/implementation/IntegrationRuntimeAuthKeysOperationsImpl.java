// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.IntegrationRuntimeAuthKeysOperationsClient;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeAuthKeysInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeAuthKeys;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeAuthKeysOperations;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeRegenerateKeyParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IntegrationRuntimeAuthKeysOperationsImpl implements IntegrationRuntimeAuthKeysOperations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IntegrationRuntimeAuthKeysOperationsImpl.class);

    private final IntegrationRuntimeAuthKeysOperationsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public IntegrationRuntimeAuthKeysOperationsImpl(
        IntegrationRuntimeAuthKeysOperationsClient innerClient,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public IntegrationRuntimeAuthKeys regenerate(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters) {
        IntegrationRuntimeAuthKeysInner inner =
            this
                .serviceClient()
                .regenerate(resourceGroupName, workspaceName, integrationRuntimeName, regenerateKeyParameters);
        if (inner != null) {
            return new IntegrationRuntimeAuthKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IntegrationRuntimeAuthKeys> regenerateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        IntegrationRuntimeRegenerateKeyParameters regenerateKeyParameters,
        Context context) {
        Response<IntegrationRuntimeAuthKeysInner> inner =
            this
                .serviceClient()
                .regenerateWithResponse(
                    resourceGroupName, workspaceName, integrationRuntimeName, regenerateKeyParameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IntegrationRuntimeAuthKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IntegrationRuntimeAuthKeys list(
        String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        IntegrationRuntimeAuthKeysInner inner =
            this.serviceClient().list(resourceGroupName, workspaceName, integrationRuntimeName);
        if (inner != null) {
            return new IntegrationRuntimeAuthKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IntegrationRuntimeAuthKeys> listWithResponse(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        Response<IntegrationRuntimeAuthKeysInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, workspaceName, integrationRuntimeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IntegrationRuntimeAuthKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private IntegrationRuntimeAuthKeysOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
