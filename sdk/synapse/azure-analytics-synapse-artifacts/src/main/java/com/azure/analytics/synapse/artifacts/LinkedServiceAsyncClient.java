// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.LinkedServicesImpl;
import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.LinkedServiceResource;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
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
     * @param linkedServiceName The linked service name.
     * @param linkedService Linked service resource definition.
     * @param ifMatch ETag of the linkedService entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
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
     * @param linkedServiceName The linked service name.
     * @param linkedService Linked service resource definition.
     * @param ifMatch ETag of the linkedService entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
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
     * @param linkedServiceName The linked service name.
     * @param linkedService Linked service resource definition.
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
     * @param linkedServiceName The linked service name.
     * @param ifNoneMatch ETag of the linked service entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
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
     * @param linkedServiceName The linked service name.
     * @param ifNoneMatch ETag of the linked service entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
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
     * @param linkedServiceName The linked service name.
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
     * @param linkedServiceName The linked service name.
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
     * @param linkedServiceName The linked service name.
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
     * @param linkedServiceName The linked service name.
     * @param request proposed new name.
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
     * @param linkedServiceName The linked service name.
     * @param request proposed new name.
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
     * @param nextLink The nextLink parameter.
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
