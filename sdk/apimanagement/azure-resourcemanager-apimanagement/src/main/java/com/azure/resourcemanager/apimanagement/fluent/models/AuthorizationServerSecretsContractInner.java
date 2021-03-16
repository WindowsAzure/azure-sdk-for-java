// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OAuth Server Secrets Contract. */
@Fluent
public final class AuthorizationServerSecretsContractInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AuthorizationServerSecretsContractInner.class);

    /*
     * oAuth Authorization Server Secrets.
     */
    @JsonProperty(value = "clientSecret")
    private String clientSecret;

    /*
     * Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner username.
     */
    @JsonProperty(value = "resourceOwnerUsername")
    private String resourceOwnerUsername;

    /*
     * Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner password.
     */
    @JsonProperty(value = "resourceOwnerPassword")
    private String resourceOwnerPassword;

    /**
     * Get the clientSecret property: oAuth Authorization Server Secrets.
     *
     * @return the clientSecret value.
     */
    public String clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: oAuth Authorization Server Secrets.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the AuthorizationServerSecretsContractInner object itself.
     */
    public AuthorizationServerSecretsContractInner withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the resourceOwnerUsername property: Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner username.
     *
     * @return the resourceOwnerUsername value.
     */
    public String resourceOwnerUsername() {
        return this.resourceOwnerUsername;
    }

    /**
     * Set the resourceOwnerUsername property: Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner username.
     *
     * @param resourceOwnerUsername the resourceOwnerUsername value to set.
     * @return the AuthorizationServerSecretsContractInner object itself.
     */
    public AuthorizationServerSecretsContractInner withResourceOwnerUsername(String resourceOwnerUsername) {
        this.resourceOwnerUsername = resourceOwnerUsername;
        return this;
    }

    /**
     * Get the resourceOwnerPassword property: Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner password.
     *
     * @return the resourceOwnerPassword value.
     */
    public String resourceOwnerPassword() {
        return this.resourceOwnerPassword;
    }

    /**
     * Set the resourceOwnerPassword property: Can be optionally specified when resource owner password grant type is
     * supported by this authorization server. Default resource owner password.
     *
     * @param resourceOwnerPassword the resourceOwnerPassword value to set.
     * @return the AuthorizationServerSecretsContractInner object itself.
     */
    public AuthorizationServerSecretsContractInner withResourceOwnerPassword(String resourceOwnerPassword) {
        this.resourceOwnerPassword = resourceOwnerPassword;
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
