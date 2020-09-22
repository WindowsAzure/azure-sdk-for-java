/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridkubernetes.v2020_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AuthenticationDetailsValue model.
 */
public class AuthenticationDetailsValue {
    /**
     * Authentication token.
     */
    @JsonProperty(value = "token")
    private String token;

    /**
     * Get authentication token.
     *
     * @return the token value
     */
    public String token() {
        return this.token;
    }

    /**
     * Set authentication token.
     *
     * @param token the token value to set
     * @return the AuthenticationDetailsValue object itself.
     */
    public AuthenticationDetailsValue withToken(String token) {
        this.token = token;
        return this;
    }

}
