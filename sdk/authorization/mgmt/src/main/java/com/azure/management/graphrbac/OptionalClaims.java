// Copyright (c) Microsoft Corporation. All rights reserved.// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OptionalClaims model. */
@Fluent
public final class OptionalClaims {
    /*
     * Optional claims requested to be included in the id token.
     */
    @JsonProperty(value = "idToken")
    private List<OptionalClaim> idToken;

    /*
     * Optional claims requested to be included in the access token.
     */
    @JsonProperty(value = "accessToken")
    private List<OptionalClaim> accessToken;

    /*
     * Optional claims requested to be included in the saml token.
     */
    @JsonProperty(value = "samlToken")
    private List<OptionalClaim> samlToken;

    /**
     * Get the idToken property: Optional claims requested to be included in the id token.
     *
     * @return the idToken value.
     */
    public List<OptionalClaim> idToken() {
        return this.idToken;
    }

    /**
     * Set the idToken property: Optional claims requested to be included in the id token.
     *
     * @param idToken the idToken value to set.
     * @return the OptionalClaims object itself.
     */
    public OptionalClaims withIdToken(List<OptionalClaim> idToken) {
        this.idToken = idToken;
        return this;
    }

    /**
     * Get the accessToken property: Optional claims requested to be included in the access token.
     *
     * @return the accessToken value.
     */
    public List<OptionalClaim> accessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: Optional claims requested to be included in the access token.
     *
     * @param accessToken the accessToken value to set.
     * @return the OptionalClaims object itself.
     */
    public OptionalClaims withAccessToken(List<OptionalClaim> accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the samlToken property: Optional claims requested to be included in the saml token.
     *
     * @return the samlToken value.
     */
    public List<OptionalClaim> samlToken() {
        return this.samlToken;
    }

    /**
     * Set the samlToken property: Optional claims requested to be included in the saml token.
     *
     * @param samlToken the samlToken value to set.
     * @return the OptionalClaims object itself.
     */
    public OptionalClaims withSamlToken(List<OptionalClaim> samlToken) {
        this.samlToken = samlToken;
        return this;
    }
}
