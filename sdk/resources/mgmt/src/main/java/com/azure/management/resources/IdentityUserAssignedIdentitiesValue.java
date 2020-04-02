// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IdentityUserAssignedIdentitiesValue model.
 */
public class IdentityUserAssignedIdentitiesValue {
    /**
     * The principal id of user assigned identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * The client id of user assigned identity.
     */
    @JsonProperty(value = "clientId", access = JsonProperty.Access.WRITE_ONLY)
    private String clientId;

    /**
     * Get the principal id of user assigned identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the client id of user assigned identity.
     *
     * @return the clientId value
     */
    public String clientId() {
        return this.clientId;
    }

}
