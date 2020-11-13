/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResourceProviderDefaultErrorResponse model.
 */
public class ResourceProviderDefaultErrorResponse {
    /**
     * The error property.
     */
    @JsonProperty(value = "error")
    private ErrorResponseBody error;

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public ErrorResponseBody error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the ResourceProviderDefaultErrorResponse object itself.
     */
    public ResourceProviderDefaultErrorResponse withError(ErrorResponseBody error) {
        this.error = error;
        return this;
    }

}
