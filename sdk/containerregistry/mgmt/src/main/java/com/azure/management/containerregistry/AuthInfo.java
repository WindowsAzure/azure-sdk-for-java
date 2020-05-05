// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AuthInfo model. */
@Fluent
public final class AuthInfo {
    /*
     * The type of Auth token.
     */
    @JsonProperty(value = "tokenType", required = true)
    private TokenType tokenType;

    /*
     * The access token used to access the source control provider.
     */
    @JsonProperty(value = "token", required = true)
    private String token;

    /*
     * The refresh token used to refresh the access token.
     */
    @JsonProperty(value = "refreshToken")
    private String refreshToken;

    /*
     * The scope of the access token.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /*
     * Time in seconds that the token remains valid
     */
    @JsonProperty(value = "expiresIn")
    private Integer expiresIn;

    /**
     * Get the tokenType property: The type of Auth token.
     *
     * @return the tokenType value.
     */
    public TokenType tokenType() {
        return this.tokenType;
    }

    /**
     * Set the tokenType property: The type of Auth token.
     *
     * @param tokenType the tokenType value to set.
     * @return the AuthInfo object itself.
     */
    public AuthInfo withTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * Get the token property: The access token used to access the source control provider.
     *
     * @return the token value.
     */
    public String token() {
        return this.token;
    }

    /**
     * Set the token property: The access token used to access the source control provider.
     *
     * @param token the token value to set.
     * @return the AuthInfo object itself.
     */
    public AuthInfo withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get the refreshToken property: The refresh token used to refresh the access token.
     *
     * @return the refreshToken value.
     */
    public String refreshToken() {
        return this.refreshToken;
    }

    /**
     * Set the refreshToken property: The refresh token used to refresh the access token.
     *
     * @param refreshToken the refreshToken value to set.
     * @return the AuthInfo object itself.
     */
    public AuthInfo withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the scope property: The scope of the access token.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope of the access token.
     *
     * @param scope the scope value to set.
     * @return the AuthInfo object itself.
     */
    public AuthInfo withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the expiresIn property: Time in seconds that the token remains valid.
     *
     * @return the expiresIn value.
     */
    public Integer expiresIn() {
        return this.expiresIn;
    }

    /**
     * Set the expiresIn property: Time in seconds that the token remains valid.
     *
     * @param expiresIn the expiresIn value to set.
     * @return the AuthInfo object itself.
     */
    public AuthInfo withExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
}
