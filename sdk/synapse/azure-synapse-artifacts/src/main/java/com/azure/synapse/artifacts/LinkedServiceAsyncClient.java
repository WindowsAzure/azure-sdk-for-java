// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.synapse.artifacts.implementation.LinkedServicesImpl;
import com.azure.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.synapse.artifacts.models.CloudErrorException;
import com.azure.synapse.artifacts.models.LinkedServiceResource;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class LinkedServiceAsyncClient {
    private final LinkedServicesImpl serviceClient;

    /**
     * Initializes an instance of LinkedServices client.
     *
     * @param serviceClient the service client implementation.
     */
    LinkedServiceAsyncClient(LinkedServicesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists linked services.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of linked service resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<LinkedServiceResource>> getLinkedServicesByWorkspaceSinglePage() {
        return this.serviceClient.getLinkedServicesByWorkspaceSinglePageAsync();
    }

    /**
     * Lists linked services.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of linked service resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LinkedServiceResource> getLinkedServicesByWorkspace() {
        return this.serviceClient.getLinkedServicesByWorkspaceAsync();
    }

    /**
     * Creates or updates a linked service.
     *
     * @param linkedServiceName The linkedServiceName parameter.
     * @param linkedService Linked service resource type.
     * @param ifMatch The ifMatch parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return linked service resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LinkedServiceResource>> createOrUpdateLinkedServiceWithResponse(
            String linkedServiceName, LinkedServiceResource linkedService, String ifMatch) {
        return this.serviceClient.createOrUpdateLinkedServiceWithResponseAsync(
                linkedServiceName, linkedService, ifMatch);
    }

    /**
     * Creates or updates a linked service.
     *
     * @param linkedServiceName The linkedServiceName parameter.
     * @param linkedService Linked service resource type.
     * @param ifMatch The ifMatch parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return linked service resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LinkedServiceResource> createOrUpdateLinkedService(
            String linkedServiceName, LinkedServiceResource linkedService, String ifMatch) {
        return this.serviceClient.createOrUpdateLinkedServiceAsync(linkedServiceName, linkedService, ifMatch);
    }

    /**
     * Creates or updates a linked service.
     *
     * @param linkedServiceName The linkedServiceName parameter.
     * @param linkedService Linked service resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return linked service resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LinkedServiceResource> createOrUpdateLinkedService(
            String linkedServiceName, LinkedServiceResource linkedService) {
        return this.serviceClient.createOrUpdateLinkedServiceAsync(linkedServiceName, linkedService);
    }

    /**
     * Gets a linked service.
     *
     * @param linkedServiceName The linkedServiceName parameter.
     * @param ifNoneMatch The ifNoneMatch parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LinkedServiceResource>> getLinkedServiceWithResponse(
            String linkedServiceName, String ifNoneMatch) {
        return this.serviceClient.getLinkedServiceWithResponseAsync(linkedServiceName, ifNoneMatch);
    }

    /**
     * Gets a linked service.
     *
     * @param linkedServiceName The linkedServiceName parameter.
     * @param ifNoneMatch The ifNoneMatch parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LinkedServiceResource> getLinkedService(String linkedServiceName, String ifNoneMatch) {
        return this.serviceClient.getLinkedServiceAsync(linkedServiceName, ifNoneMatch);
    }

    /**
     * Gets a linked service.
     *
     * @param linkedServiceName The linkedServiceName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LinkedServiceResource> getLinkedService(String linkedServiceName) {
        return this.serviceClient.getLinkedServiceAsync(linkedServiceName);
    }

    /**
     * Deletes a linked service.
     *
     * @param linkedServiceName The linkedServiceName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteLinkedServiceWithResponse(String linkedServiceName) {
        return this.serviceClient.deleteLinkedServiceWithResponseAsync(linkedServiceName);
    }

    /**
     * Deletes a linked service.
     *
     * @param linkedServiceName The linkedServiceName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteLinkedService(String linkedServiceName) {
        return this.serviceClient.deleteLinkedServiceAsync(linkedServiceName);
    }

    /**
     * Renames a linked service.
     *
     * @param linkedServiceName The linkedServiceName parameter.
     * @param request Request body structure for rename artifact.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> renameLinkedServiceWithResponse(
            String linkedServiceName, ArtifactRenameRequest request) {
        return this.serviceClient.renameLinkedServiceWithResponseAsync(linkedServiceName, request);
    }

    /**
     * Renames a linked service.
     *
     * @param linkedServiceName The linkedServiceName parameter.
     * @param request Request body structure for rename artifact.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> renameLinkedService(String linkedServiceName, ArtifactRenameRequest request) {
        return this.serviceClient.renameLinkedServiceAsync(linkedServiceName, request);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of linked service resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<LinkedServiceResource>> getLinkedServicesByWorkspaceNextSinglePage(String nextLink) {
        return this.serviceClient.getLinkedServicesByWorkspaceNextSinglePageAsync(nextLink);
    }
}
