// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The pending certificate signing request result.
 */
public class PendingCertificateSigningRequestResult {
    /**
     * The pending certificate signing request as Base64 encoded string.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

}
