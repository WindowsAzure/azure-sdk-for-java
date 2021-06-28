// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Server endpoint recall error object. */
@Immutable
public final class ServerEndpointRecallError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerEndpointRecallError.class);

    /*
     * Error code (HResult)
     */
    @JsonProperty(value = "errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer errorCode;

    /*
     * Count of occurences of the error
     */
    @JsonProperty(value = "count", access = JsonProperty.Access.WRITE_ONLY)
    private Long count;

    /**
     * Get the errorCode property: Error code (HResult).
     *
     * @return the errorCode value.
     */
    public Integer errorCode() {
        return this.errorCode;
    }

    /**
     * Get the count property: Count of occurences of the error.
     *
     * @return the count value.
     */
    public Long count() {
        return this.count;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
