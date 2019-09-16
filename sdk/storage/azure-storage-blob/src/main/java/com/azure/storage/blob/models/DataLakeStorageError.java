// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * The DataLakeStorageError model.
 */
@JacksonXmlRootElement(localName = "DataLakeStorageError")
@Fluent
public final class DataLakeStorageError {
    /*
     * The service error response object.
     */
    @JsonProperty(value = "error")
    private DataLakeStorageErrorError error;

    /**
     * Get the error property: The service error response object.
     *
     * @return the error value.
     */
    public DataLakeStorageErrorError getError() {
        return this.error;
    }

    /**
     * Set the error property: The service error response object.
     *
     * @param error the error value to set.
     * @return the DataLakeStorageError object itself.
     */
    public DataLakeStorageError setError(DataLakeStorageErrorError error) {
        this.error = error;
        return this;
    }
}
