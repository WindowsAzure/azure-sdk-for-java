// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error details. */
@Immutable
public final class ErrorDetails extends ManagementError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ErrorDetails.class);

    /*
     * The HTTP status code.
     */
    @JsonProperty(value = "httpStatusCode", access = JsonProperty.Access.WRITE_ONLY)
    private String httpStatusCode;

    /**
     * Get the httpStatusCode property: The HTTP status code.
     *
     * @return the httpStatusCode value.
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
