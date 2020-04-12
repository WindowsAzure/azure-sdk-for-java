/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User-assigned managed identity.
 */
public class UserAssignedIdentity {
    /**
     * Azure Active Directory principal ID associated with this Identity.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /**
     * Client App Id associated with this identity.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /**
     * Get azure Active Directory principal ID associated with this Identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set azure Active Directory principal ID associated with this Identity.
     *
     * @param principalId the principalId value to set
     * @return the UserAssignedIdentity object itself.
     */
    public UserAssignedIdentity withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get client App Id associated with this identity.
     *
     * @return the clientId value
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set client App Id associated with this identity.
     *
     * @param clientId the clientId value to set
     * @return the UserAssignedIdentity object itself.
     */
    public UserAssignedIdentity withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

}
