// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.SparkJobDefinitionsImpl;
import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.SparkBatchJob;
import com.azure.analytics.synapse.artifacts.models.SparkJobDefinitionResource;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class SparkJobDefinitionAsyncClient {
    private final SparkJobDefinitionsImpl serviceClient;

    /**
     * Initializes an instance of SparkJobDefinitions client.
     *
     * @param serviceClient the service client implementation.
     */
    SparkJobDefinitionAsyncClient(SparkJobDefinitionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists spark job definitions.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of spark job definitions resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SparkJobDefinitionResource>> getSparkJobDefinitionsByWorkspaceSinglePage() {
        return this.serviceClient.getSparkJobDefinitionsByWorkspaceSinglePageAsync();
    }

    /**
     * Lists spark job definitions.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of spark job definitions resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SparkJobDefinitionResource> getSparkJobDefinitionsByWorkspace() {
        return this.serviceClient.getSparkJobDefinitionsByWorkspaceAsync();
    }

    /**
     * Creates or updates a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param sparkJobDefinition Spark Job Definition resource definition.
     * @param ifMatch ETag of the Spark Job Definition entity. Should only be specified for update, for which it should
     *     match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return spark job definition resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SparkJobDefinitionResource>> createOrUpdateSparkJobDefinitionWithResponse(
            String sparkJobDefinitionName, SparkJobDefinitionResource sparkJobDefinition, String ifMatch) {
        return this.serviceClient.createOrUpdateSparkJobDefinitionWithResponseAsync(
                sparkJobDefinitionName, sparkJobDefinition, ifMatch);
    }

    /**
     * Creates or updates a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param sparkJobDefinition Spark Job Definition resource definition.
     * @param ifMatch ETag of the Spark Job Definition entity. Should only be specified for update, for which it should
     *     match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return spark job definition resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkJobDefinitionResource> createOrUpdateSparkJobDefinition(
            String sparkJobDefinitionName, SparkJobDefinitionResource sparkJobDefinition, String ifMatch) {
        return this.serviceClient.createOrUpdateSparkJobDefinitionAsync(
                sparkJobDefinitionName, sparkJobDefinition, ifMatch);
    }

    /**
     * Creates or updates a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param sparkJobDefinition Spark Job Definition resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return spark job definition resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkJobDefinitionResource> createOrUpdateSparkJobDefinition(
            String sparkJobDefinitionName, SparkJobDefinitionResource sparkJobDefinition) {
        return this.serviceClient.createOrUpdateSparkJobDefinitionAsync(sparkJobDefinitionName, sparkJobDefinition);
    }

    /**
     * Gets a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param ifNoneMatch ETag of the Spark Job Definition entity. Should only be specified for get. If the ETag matches
     *     the existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Spark Job Definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SparkJobDefinitionResource>> getSparkJobDefinitionWithResponse(
            String sparkJobDefinitionName, String ifNoneMatch) {
        return this.serviceClient.getSparkJobDefinitionWithResponseAsync(sparkJobDefinitionName, ifNoneMatch);
    }

    /**
     * Gets a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param ifNoneMatch ETag of the Spark Job Definition entity. Should only be specified for get. If the ETag matches
     *     the existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Spark Job Definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkJobDefinitionResource> getSparkJobDefinition(String sparkJobDefinitionName, String ifNoneMatch) {
        return this.serviceClient.getSparkJobDefinitionAsync(sparkJobDefinitionName, ifNoneMatch);
    }

    /**
     * Gets a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Spark Job Definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkJobDefinitionResource> getSparkJobDefinition(String sparkJobDefinitionName) {
        return this.serviceClient.getSparkJobDefinitionAsync(sparkJobDefinitionName);
    }

    /**
     * Deletes a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteSparkJobDefinitionWithResponse(String sparkJobDefinitionName) {
        return this.serviceClient.deleteSparkJobDefinitionWithResponseAsync(sparkJobDefinitionName);
    }

    /**
     * Deletes a Spark Job Definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteSparkJobDefinition(String sparkJobDefinitionName) {
        return this.serviceClient.deleteSparkJobDefinitionAsync(sparkJobDefinitionName);
    }

    /**
     * Executes the spark job definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SparkBatchJob>> executeSparkJobDefinitionWithResponse(String sparkJobDefinitionName) {
        return this.serviceClient.executeSparkJobDefinitionWithResponseAsync(sparkJobDefinitionName);
    }

    /**
     * Executes the spark job definition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkBatchJob> executeSparkJobDefinition(String sparkJobDefinitionName) {
        return this.serviceClient.executeSparkJobDefinitionAsync(sparkJobDefinitionName);
    }

    /**
     * Renames a sparkJobDefinition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> renameSparkJobDefinitionWithResponse(
            String sparkJobDefinitionName, ArtifactRenameRequest request) {
        return this.serviceClient.renameSparkJobDefinitionWithResponseAsync(sparkJobDefinitionName, request);
    }

    /**
     * Renames a sparkJobDefinition.
     *
     * @param sparkJobDefinitionName The spark job definition name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> renameSparkJobDefinition(String sparkJobDefinitionName, ArtifactRenameRequest request) {
        return this.serviceClient.renameSparkJobDefinitionAsync(sparkJobDefinitionName, request);
    }

    /**
     * Debug the spark job definition.
     *
     * @param sparkJobDefinitionAzureResource Spark Job Definition resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SparkBatchJob>> debugSparkJobDefinitionWithResponse(
            SparkJobDefinitionResource sparkJobDefinitionAzureResource) {
        return this.serviceClient.debugSparkJobDefinitionWithResponseAsync(sparkJobDefinitionAzureResource);
    }

    /**
     * Debug the spark job definition.
     *
     * @param sparkJobDefinitionAzureResource Spark Job Definition resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SparkBatchJob> debugSparkJobDefinition(SparkJobDefinitionResource sparkJobDefinitionAzureResource) {
        return this.serviceClient.debugSparkJobDefinitionAsync(sparkJobDefinitionAzureResource);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of spark job definitions resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SparkJobDefinitionResource>> getSparkJobDefinitionsByWorkspaceNextSinglePage(
            String nextLink) {
        return this.serviceClient.getSparkJobDefinitionsByWorkspaceNextSinglePageAsync(nextLink);
    }
}
