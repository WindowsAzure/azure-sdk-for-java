/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error response.
 */
public class ErrorResponse {
    /**
     * Error description.
     */
    @JsonProperty(value = "error")
    private ErrorDefinition error;

    /**
     * Get error description.
     *
     * @return the error value
     */
    public ErrorDefinition error() {
        return this.error;
    }

    /**
     * Set error description.
     *
     * @param error the error value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withError(ErrorDefinition error) {
        this.error = error;
        return this;
    }

}
