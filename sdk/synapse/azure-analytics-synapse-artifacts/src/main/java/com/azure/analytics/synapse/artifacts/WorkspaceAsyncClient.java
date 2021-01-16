// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.WorkspacesImpl;
import com.azure.analytics.synapse.artifacts.models.ErrorContractException;
import com.azure.analytics.synapse.artifacts.models.Workspace;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class WorkspaceAsyncClient {
    private final WorkspacesImpl serviceClient;

    /**
     * Initializes an instance of Workspaces client.
     *
     * @param serviceClient the service client implementation.
     */
    WorkspaceAsyncClient(WorkspacesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get Workspace.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Workspace>> getWithResponse() {
        return this.serviceClient.getWithResponseAsync();
    }

    /**
     * Get Workspace.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Workspace> get() {
        return this.serviceClient.getAsync();
    }
}
