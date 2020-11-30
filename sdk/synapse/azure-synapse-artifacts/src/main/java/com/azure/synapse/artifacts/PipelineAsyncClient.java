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
import com.azure.synapse.artifacts.implementation.PipelinesImpl;
import com.azure.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.synapse.artifacts.models.CloudErrorException;
import com.azure.synapse.artifacts.models.CreateRunResponse;
import com.azure.synapse.artifacts.models.PipelineResource;
import java.util.Map;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class PipelineAsyncClient {
    private final PipelinesImpl serviceClient;

    /**
     * Initializes an instance of Pipelines client.
     *
     * @param serviceClient the service client implementation.
     */
    PipelineAsyncClient(PipelinesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists pipelines.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of pipeline resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<PipelineResource>> getPipelinesByWorkspaceSinglePage() {
        return this.serviceClient.getPipelinesByWorkspaceSinglePageAsync();
    }

    /**
     * Lists pipelines.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of pipeline resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PipelineResource> getPipelinesByWorkspace() {
        return this.serviceClient.getPipelinesByWorkspaceAsync();
    }

    /**
     * Creates or updates a pipeline.
     *
     * @param pipelineName The pipelineName parameter.
     * @param pipeline Pipeline resource type.
     * @param ifMatch The ifMatch parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pipeline resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PipelineResource>> createOrUpdatePipelineWithResponse(
            String pipelineName, PipelineResource pipeline, String ifMatch) {
        return this.serviceClient.createOrUpdatePipelineWithResponseAsync(pipelineName, pipeline, ifMatch);
    }

    /**
     * Creates or updates a pipeline.
     *
     * @param pipelineName The pipelineName parameter.
     * @param pipeline Pipeline resource type.
     * @param ifMatch The ifMatch parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pipeline resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PipelineResource> createOrUpdatePipeline(
            String pipelineName, PipelineResource pipeline, String ifMatch) {
        return this.serviceClient.createOrUpdatePipelineAsync(pipelineName, pipeline, ifMatch);
    }

    /**
     * Creates or updates a pipeline.
     *
     * @param pipelineName The pipelineName parameter.
     * @param pipeline Pipeline resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pipeline resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PipelineResource> createOrUpdatePipeline(String pipelineName, PipelineResource pipeline) {
        return this.serviceClient.createOrUpdatePipelineAsync(pipelineName, pipeline);
    }

    /**
     * Gets a pipeline.
     *
     * @param pipelineName The pipelineName parameter.
     * @param ifNoneMatch The ifNoneMatch parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PipelineResource>> getPipelineWithResponse(String pipelineName, String ifNoneMatch) {
        return this.serviceClient.getPipelineWithResponseAsync(pipelineName, ifNoneMatch);
    }

    /**
     * Gets a pipeline.
     *
     * @param pipelineName The pipelineName parameter.
     * @param ifNoneMatch The ifNoneMatch parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PipelineResource> getPipeline(String pipelineName, String ifNoneMatch) {
        return this.serviceClient.getPipelineAsync(pipelineName, ifNoneMatch);
    }

    /**
     * Gets a pipeline.
     *
     * @param pipelineName The pipelineName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PipelineResource> getPipeline(String pipelineName) {
        return this.serviceClient.getPipelineAsync(pipelineName);
    }

    /**
     * Deletes a pipeline.
     *
     * @param pipelineName The pipelineName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deletePipelineWithResponse(String pipelineName) {
        return this.serviceClient.deletePipelineWithResponseAsync(pipelineName);
    }

    /**
     * Deletes a pipeline.
     *
     * @param pipelineName The pipelineName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deletePipeline(String pipelineName) {
        return this.serviceClient.deletePipelineAsync(pipelineName);
    }

    /**
     * Renames a pipeline.
     *
     * @param pipelineName The pipelineName parameter.
     * @param request Request body structure for rename artifact.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> renamePipelineWithResponse(String pipelineName, ArtifactRenameRequest request) {
        return this.serviceClient.renamePipelineWithResponseAsync(pipelineName, request);
    }

    /**
     * Renames a pipeline.
     *
     * @param pipelineName The pipelineName parameter.
     * @param request Request body structure for rename artifact.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> renamePipeline(String pipelineName, ArtifactRenameRequest request) {
        return this.serviceClient.renamePipelineAsync(pipelineName, request);
    }

    /**
     * Creates a run of a pipeline.
     *
     * @param pipelineName The pipelineName parameter.
     * @param referencePipelineRunId The referencePipelineRunId parameter.
     * @param isRecovery The isRecovery parameter.
     * @param startActivityName The startActivityName parameter.
     * @param parameters An object mapping parameter names to argument values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body with a run identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CreateRunResponse>> createPipelineRunWithResponse(
            String pipelineName,
            String referencePipelineRunId,
            Boolean isRecovery,
            String startActivityName,
            Map<String, Object> parameters) {
        return this.serviceClient.createPipelineRunWithResponseAsync(
                pipelineName, referencePipelineRunId, isRecovery, startActivityName, parameters);
    }

    /**
     * Creates a run of a pipeline.
     *
     * @param pipelineName The pipelineName parameter.
     * @param referencePipelineRunId The referencePipelineRunId parameter.
     * @param isRecovery The isRecovery parameter.
     * @param startActivityName The startActivityName parameter.
     * @param parameters An object mapping parameter names to argument values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body with a run identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CreateRunResponse> createPipelineRun(
            String pipelineName,
            String referencePipelineRunId,
            Boolean isRecovery,
            String startActivityName,
            Map<String, Object> parameters) {
        return this.serviceClient.createPipelineRunAsync(
                pipelineName, referencePipelineRunId, isRecovery, startActivityName, parameters);
    }

    /**
     * Creates a run of a pipeline.
     *
     * @param pipelineName The pipelineName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body with a run identifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CreateRunResponse> createPipelineRun(String pipelineName) {
        return this.serviceClient.createPipelineRunAsync(pipelineName);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of pipeline resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<PipelineResource>> getPipelinesByWorkspaceNextSinglePage(String nextLink) {
        return this.serviceClient.getPipelinesByWorkspaceNextSinglePageAsync(nextLink);
    }
}
