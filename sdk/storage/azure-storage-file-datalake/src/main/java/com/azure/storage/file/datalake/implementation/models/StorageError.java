// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The StorageError model.
 */
@Fluent
public final class StorageError {
    /*
     * The service error response object.
     */
    @JsonProperty(value = "error")
    private StorageErrorError error;

    /**
     * Get the error property: The service error response object.
     *
     * @return the error value.
     */
    public StorageErrorError getError() {
        return this.error;
    }

    /**
     * Set the error property: The service error response object.
     *
     * @param error the error value to set.
     * @return the StorageError object itself.
     */
    public StorageError setError(StorageErrorError error) {
        this.error = error;
        return this;
    }
}
