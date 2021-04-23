// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains details when the response code indicates an error. */
@Immutable
public final class ErrorInfo extends ManagementError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ErrorInfo.class);

    /*
     * Inner error details if they exist.
     */
    @JsonProperty(value = "innererror", access = JsonProperty.Access.WRITE_ONLY)
    private String innererror;

    /**
     * Get the innererror property: Inner error details if they exist.
     *
     * @return the innererror value.
     */
    public String getInnererror() {
        return this.innererror;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
