// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Github access token for Appservice CLI github integration. */
@Fluent
public final class AppserviceGithubTokenInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppserviceGithubTokenInner.class);

    /*
     * Github access token for Appservice CLI github integration
     */
    @JsonProperty(value = "accessToken")
    private String accessToken;

    /*
     * Scope of the github access token
     */
    @JsonProperty(value = "scope")
    private String scope;

    /*
     * token type
     */
    @JsonProperty(value = "tokenType")
    private String tokenType;

    /*
     * True if valid github token received, False otherwise
     */
    @JsonProperty(value = "gotToken")
    private Boolean gotToken;

    /*
     * Error message if unable to get token
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /**
     * Get the accessToken property: Github access token for Appservice CLI github integration.
     *
     * @return the accessToken value.
     */
    public String accessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: Github access token for Appservice CLI github integration.
     *
     * @param accessToken the accessToken value to set.
     * @return the AppserviceGithubTokenInner object itself.
     */
    public AppserviceGithubTokenInner withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the scope property: Scope of the github access token.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: Scope of the github access token.
     *
     * @param scope the scope value to set.
     * @return the AppserviceGithubTokenInner object itself.
     */
    public AppserviceGithubTokenInner withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the tokenType property: token type.
     *
     * @return the tokenType value.
     */
    public String tokenType() {
        return this.tokenType;
    }

    /**
     * Set the tokenType property: token type.
     *
     * @param tokenType the tokenType value to set.
     * @return the AppserviceGithubTokenInner object itself.
     */
    public AppserviceGithubTokenInner withTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * Get the gotToken property: True if valid github token received, False otherwise.
     *
     * @return the gotToken value.
     */
    public Boolean gotToken() {
        return this.gotToken;
    }

    /**
     * Set the gotToken property: True if valid github token received, False otherwise.
     *
     * @param gotToken the gotToken value to set.
     * @return the AppserviceGithubTokenInner object itself.
     */
    public AppserviceGithubTokenInner withGotToken(Boolean gotToken) {
        this.gotToken = gotToken;
        return this;
    }

    /**
     * Get the errorMessage property: Error message if unable to get token.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Error message if unable to get token.
     *
     * @param errorMessage the errorMessage value to set.
     * @return the AppserviceGithubTokenInner object itself.
     */
    public AppserviceGithubTokenInner withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
