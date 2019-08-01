/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Authorization header information.
 */
public class BackendAuthorizationHeaderCredentials {
    /**
     * Authentication Scheme name.
     */
    @JsonProperty(value = "scheme", required = true)
    private String scheme;

    /**
     * Authentication Parameter value.
     */
    @JsonProperty(value = "parameter", required = true)
    private String parameter;

    /**
     * Get authentication Scheme name.
     *
     * @return the scheme value
     */
    public String scheme() {
        return this.scheme;
    }

    /**
     * Set authentication Scheme name.
     *
     * @param scheme the scheme value to set
     * @return the BackendAuthorizationHeaderCredentials object itself.
     */
    public BackendAuthorizationHeaderCredentials withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Get authentication Parameter value.
     *
     * @return the parameter value
     */
    public String parameter() {
        return this.parameter;
    }

    /**
     * Set authentication Parameter value.
     *
     * @param parameter the parameter value to set
     * @return the BackendAuthorizationHeaderCredentials object itself.
     */
    public BackendAuthorizationHeaderCredentials withParameter(String parameter) {
        this.parameter = parameter;
        return this;
    }

}
