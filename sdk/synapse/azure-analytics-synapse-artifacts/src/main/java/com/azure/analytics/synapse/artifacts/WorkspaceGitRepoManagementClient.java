// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.WorkspaceGitRepoManagementsImpl;
import com.azure.analytics.synapse.artifacts.models.GitHubAccessTokenRequest;
import com.azure.analytics.synapse.artifacts.models.GitHubAccessTokenResponse;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class WorkspaceGitRepoManagementClient {
    private final WorkspaceGitRepoManagementsImpl serviceClient;

    /**
     * Initializes an instance of WorkspaceGitRepoManagements client.
     *
     * @param serviceClient the service client implementation.
     */
    WorkspaceGitRepoManagementClient(WorkspaceGitRepoManagementsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get the GitHub access token.
     *
     * @param gitHubAccessTokenRequest The gitHubAccessTokenRequest parameter.
     * @param clientRequestId Can provide a guid, which is helpful for debugging and to provide better customer support.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GitHub access token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GitHubAccessTokenResponse getGitHubAccessToken(
            GitHubAccessTokenRequest gitHubAccessTokenRequest, String clientRequestId) {
        return this.serviceClient.getGitHubAccessToken(gitHubAccessTokenRequest, clientRequestId);
    }

    /**
     * Get the GitHub access token.
     *
     * @param gitHubAccessTokenRequest The gitHubAccessTokenRequest parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GitHub access token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GitHubAccessTokenResponse getGitHubAccessToken(GitHubAccessTokenRequest gitHubAccessTokenRequest) {
        return this.serviceClient.getGitHubAccessToken(gitHubAccessTokenRequest);
    }

    /**
     * Get the GitHub access token.
     *
     * @param gitHubAccessTokenRequest The gitHubAccessTokenRequest parameter.
     * @param clientRequestId Can provide a guid, which is helpful for debugging and to provide better customer support.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GitHub access token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<GitHubAccessTokenResponse> getGitHubAccessTokenWithResponse(
            GitHubAccessTokenRequest gitHubAccessTokenRequest, String clientRequestId, Context context) {
        return this.serviceClient.getGitHubAccessTokenWithResponse(gitHubAccessTokenRequest, clientRequestId, context);
    }
}
