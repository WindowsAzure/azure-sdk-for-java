// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CommunicationIdentityCreateRequest model. */
@Fluent
public final class CommunicationIdentityCreateRequest {
    /*
     * Also create access token for the created identity.
     */
    @JsonProperty(value = "createTokenWithScopes")
    private List<CommunicationIdentityTokenScope> createTokenWithScopes;

    /**
     * Get the createTokenWithScopes property: Also create access token for the created identity.
     *
     * @return the createTokenWithScopes value.
     */
    public List<CommunicationIdentityTokenScope> getCreateTokenWithScopes() {
        return this.createTokenWithScopes;
    }

    /**
     * Set the createTokenWithScopes property: Also create access token for the created identity.
     *
     * @param createTokenWithScopes the createTokenWithScopes value to set.
     * @return the CommunicationIdentityCreateRequest object itself.
     */
    public CommunicationIdentityCreateRequest setCreateTokenWithScopes(
            List<CommunicationIdentityTokenScope> createTokenWithScopes) {
        this.createTokenWithScopes = createTokenWithScopes;
        return this;
    }
}
