// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The validation token. */
@Immutable
public final class ValidationTokenInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidationTokenInner.class);

    /*
     * The token property.
     */
    @JsonProperty(value = "token", access = JsonProperty.Access.WRITE_ONLY)
    private String token;

    /**
     * Get the token property: The token property.
     *
     * @return the token value.
     */
    public String token() {
        return this.token;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
