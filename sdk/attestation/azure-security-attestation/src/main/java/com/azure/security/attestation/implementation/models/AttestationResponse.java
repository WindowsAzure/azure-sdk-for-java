// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result of an attestation operation. */
@Fluent
public final class AttestationResponse {
    /*
     * An RFC 7519 JSON Web Token, the body of which is an AttestationResult
     * object.
     */
    @JsonProperty(value = "token")
    private String token;

    /**
     * Get the token property: An RFC 7519 JSON Web Token, the body of which is an AttestationResult object.
     *
     * @return the token value.
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Set the token property: An RFC 7519 JSON Web Token, the body of which is an AttestationResult object.
     *
     * @param token the token value to set.
     * @return the AttestationResponse object itself.
     */
    public AttestationResponse setToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
