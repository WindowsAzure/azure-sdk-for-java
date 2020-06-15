// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DefaultErrorResponseError model. */
@Immutable
public final class DefaultErrorResponseError extends ManagementError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DefaultErrorResponseError.class);

    /*
     * More information to debug error.
     */
    @JsonProperty(value = "innererror", access = JsonProperty.Access.WRITE_ONLY)
    private String innererror;

    /**
     * Get the innererror property: More information to debug error.
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
