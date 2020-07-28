/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The authorization properties for accessing the source code repository.
 */
public class AuthInfoUpdateParameters {
    /**
     * The type of Auth token. Possible values include: 'PAT', 'OAuth'.
     */
    @JsonProperty(value = "tokenType")
    private TokenType tokenType;

    /**
     * The access token used to access the source control provider.
     */
    @JsonProperty(value = "token")
    private String token;

    /**
     * The refresh token used to refresh the access token.
     */
    @JsonProperty(value = "refreshToken")
    private String refreshToken;

    /**
     * The scope of the access token.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /**
     * Time in seconds that the token remains valid.
     */
    @JsonProperty(value = "expiresIn")
    private Integer expiresIn;

    /**
     * Get the type of Auth token. Possible values include: 'PAT', 'OAuth'.
     *
     * @return the tokenType value
     */
    public TokenType tokenType() {
        return this.tokenType;
    }

    /**
     * Set the type of Auth token. Possible values include: 'PAT', 'OAuth'.
     *
     * @param tokenType the tokenType value to set
     * @return the AuthInfoUpdateParameters object itself.
     */
    public AuthInfoUpdateParameters withTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * Get the access token used to access the source control provider.
     *
     * @return the token value
     */
    public String token() {
        return this.token;
    }

    /**
     * Set the access token used to access the source control provider.
     *
     * @param token the token value to set
     * @return the AuthInfoUpdateParameters object itself.
     */
    public AuthInfoUpdateParameters withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get the refresh token used to refresh the access token.
     *
     * @return the refreshToken value
     */
    public String refreshToken() {
        return this.refreshToken;
    }

    /**
     * Set the refresh token used to refresh the access token.
     *
     * @param refreshToken the refreshToken value to set
     * @return the AuthInfoUpdateParameters object itself.
     */
    public AuthInfoUpdateParameters withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the scope of the access token.
     *
     * @return the scope value
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope of the access token.
     *
     * @param scope the scope value to set
     * @return the AuthInfoUpdateParameters object itself.
     */
    public AuthInfoUpdateParameters withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get time in seconds that the token remains valid.
     *
     * @return the expiresIn value
     */
    public Integer expiresIn() {
        return this.expiresIn;
    }

    /**
     * Set time in seconds that the token remains valid.
     *
     * @param expiresIn the expiresIn value to set
     * @return the AuthInfoUpdateParameters object itself.
     */
    public AuthInfoUpdateParameters withExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

}
