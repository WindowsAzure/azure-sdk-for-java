// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GitHubAccessTokenResponse model. */
@Fluent
public final class GitHubAccessTokenResponse {
    /*
     * The gitHubAccessToken property.
     */
    @JsonProperty(value = "gitHubAccessToken")
    private String gitHubAccessToken;

    /**
     * Get the gitHubAccessToken property: The gitHubAccessToken property.
     *
     * @return the gitHubAccessToken value.
     */
    public String getGitHubAccessToken() {
        return this.gitHubAccessToken;
    }

    /**
     * Set the gitHubAccessToken property: The gitHubAccessToken property.
     *
     * @param gitHubAccessToken the gitHubAccessToken value to set.
     * @return the GitHubAccessTokenResponse object itself.
     */
    public GitHubAccessTokenResponse setGitHubAccessToken(String gitHubAccessToken) {
        this.gitHubAccessToken = gitHubAccessToken;
        return this;
    }
}
