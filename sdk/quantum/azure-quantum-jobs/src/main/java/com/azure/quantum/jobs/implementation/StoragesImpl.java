// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.quantum.jobs.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.quantum.jobs.models.BlobDetails;
import com.azure.quantum.jobs.models.RestErrorException;
import com.azure.quantum.jobs.models.SasUriResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Storages. */
public final class StoragesImpl {
    /** The proxy service used to perform REST calls. */
    private final StoragesService service;

    /** The service client containing this operation class. */
    private final QuantumClientImpl client;

    /**
     * Initializes an instance of StoragesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    StoragesImpl(QuantumClientImpl client) {
        this.service = RestProxy.create(StoragesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for QuantumClientStorages to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "QuantumClientStorage")
    private interface StoragesService {
        @Post(
                "/v1.0/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Quantum/workspaces/{workspaceName}/storage/sasUri")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(RestErrorException.class)
        Mono<Response<SasUriResponse>> sasUri(
                @HostParam("$host") String host,
                @PathParam("subscriptionId") String subscriptionId,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("workspaceName") String workspaceName,
                @BodyParam("application/json") BlobDetails blobDetails,
                @HeaderParam("Accept") String accept);
    }

    /**
     * Gets a URL with SAS token for a container/blob in the storage account associated with the workspace. The SAS URL
     * can be used to upload job input and/or download job output.
     *
     * @param blobDetails The details (name and container) of the blob to store or download data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL with SAS token for a container/blob in the storage account associated with the workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SasUriResponse>> sasUriWithResponseAsync(BlobDetails blobDetails) {
        final String accept = "application/json";
        return service.sasUri(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                this.client.getResourceGroupName(),
                this.client.getWorkspaceName(),
                blobDetails,
                accept);
    }

    /**
     * Gets a URL with SAS token for a container/blob in the storage account associated with the workspace. The SAS URL
     * can be used to upload job input and/or download job output.
     *
     * @param blobDetails The details (name and container) of the blob to store or download data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL with SAS token for a container/blob in the storage account associated with the workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SasUriResponse> sasUriAsync(BlobDetails blobDetails) {
        return sasUriWithResponseAsync(blobDetails)
                .flatMap(
                        (Response<SasUriResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Gets a URL with SAS token for a container/blob in the storage account associated with the workspace. The SAS URL
     * can be used to upload job input and/or download job output.
     *
     * @param blobDetails The details (name and container) of the blob to store or download data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL with SAS token for a container/blob in the storage account associated with the workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SasUriResponse sasUri(BlobDetails blobDetails) {
        return sasUriAsync(blobDetails).block();
    }
}
