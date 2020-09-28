// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The CommunicationIdentityToken model. */
@Fluent
public final class CommunicationIdentityToken {
    /*
     * Identifier of the identity owning the token.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The token issued for the identity.
     */
    @JsonProperty(value = "token", required = true)
    private String token;

    /*
     * The expiry time of the token.
     */
    @JsonProperty(value = "expiresOn", required = true)
    private OffsetDateTime expiresOn;

    /**
     * Get the id property: Identifier of the identity owning the token.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Identifier of the identity owning the token.
     *
     * @param id the id value to set.
     * @return the CommunicationIdentityToken object itself.
     */
    public CommunicationIdentityToken setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the token property: The token issued for the identity.
     *
     * @return the token value.
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Set the token property: The token issued for the identity.
     *
     * @param token the token value to set.
     * @return the CommunicationIdentityToken object itself.
     */
    public CommunicationIdentityToken setToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get the expiresOn property: The expiry time of the token.
     *
     * @return the expiresOn value.
     */
    public OffsetDateTime getExpiresOn() {
        return this.expiresOn;
    }

    /**
     * Set the expiresOn property: The expiry time of the token.
     *
     * @param expiresOn the expiresOn value to set.
     * @return the CommunicationIdentityToken object itself.
     */
    public CommunicationIdentityToken setExpiresOn(OffsetDateTime expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }
}
