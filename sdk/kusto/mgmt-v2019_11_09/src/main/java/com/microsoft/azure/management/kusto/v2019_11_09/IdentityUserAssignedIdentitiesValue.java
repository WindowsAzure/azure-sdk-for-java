/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_11_09;

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
