// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/**
 * Exception thrown for an invalid response with StorageError information.
 */
public final class StorageErrorException extends HttpResponseException {
    /**
     * Initializes a new instance of the StorageErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public StorageErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the StorageErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public StorageErrorException(String message, HttpResponse response, StorageError value) {
        super(message, response, value);
    }

    @Override
    public StorageError value() {
        return (StorageError) super.value();
    }
}
