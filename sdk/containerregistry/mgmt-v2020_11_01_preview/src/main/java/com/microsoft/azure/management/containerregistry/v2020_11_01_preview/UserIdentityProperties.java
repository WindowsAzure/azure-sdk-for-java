/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The UserIdentityProperties model.
 */
public class UserIdentityProperties {
    /**
     * The principal id of user assigned identity.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /**
     * The client id of user assigned identity.
     */
    @JsonProperty(value = "clientId")
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
     * Set the principal id of user assigned identity.
     *
     * @param principalId the principalId value to set
     * @return the UserIdentityProperties object itself.
     */
    public UserIdentityProperties withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the client id of user assigned identity.
     *
     * @return the clientId value
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the client id of user assigned identity.
     *
     * @param clientId the clientId value to set
     * @return the UserIdentityProperties object itself.
     */
    public UserIdentityProperties withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

}
