// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DefaultErrorResponseErrorDetailsItem model.
 */
@Immutable
public final class DefaultErrorResponseErrorDetailsItem {
    /*
     * Standardized string to programmatically identify the error.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * Detailed error description and debugging information.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Detailed error description and debugging information.
     */
    @JsonProperty(value = "target", access = JsonProperty.Access.WRITE_ONLY)
    private String target;

    /**
     * Get the code property: Standardized string to programmatically identify
     * the error.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message property: Detailed error description and debugging
     * information.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the target property: Detailed error description and debugging
     * information.
     * 
     * @return the target value.
     */
    public String target() {
        return this.target;
    }
}
