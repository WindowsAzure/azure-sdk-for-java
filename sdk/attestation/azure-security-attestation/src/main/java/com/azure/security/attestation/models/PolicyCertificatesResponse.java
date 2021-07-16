// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The response to an attestation policy management API. */
@Fluent
public final class PolicyCertificatesResponse {
    /*
     * An RFC7519 JSON Web Token structure containing a
     * PolicyCertificatesResults object which contains the certificates used to
     * validate policy changes
     */
    @JsonProperty(value = "token")
    private String token;

    /**
     * Get the token property: An RFC7519 JSON Web Token structure containing a PolicyCertificatesResults object which
     * contains the certificates used to validate policy changes.
     *
     * @return the token value.
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Set the token property: An RFC7519 JSON Web Token structure containing a PolicyCertificatesResults object which
     * contains the certificates used to validate policy changes.
     *
     * @param token the token value to set.
     * @return the PolicyCertificatesResponse object itself.
     */
    public PolicyCertificatesResponse setToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}


    /**
     *
     * @param generated
     * @return
     */
    public static PolicyCertificatesResponse fromGenerated(com.azure.security.attestation.implementation.models.PolicyCertificatesResponse generated) {
        return new PolicyCertificatesResponse().setToken(generated.getToken());
    }

}
