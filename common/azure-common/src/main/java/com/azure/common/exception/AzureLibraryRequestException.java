// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.common.exception;

/**
 * The exception thrown when client error building the request to service.
 */
public class AzureLibraryRequestException extends AzureLibraryException {

    /**
     * Initializes a new instance of the AzureLibraryRequestException class.
     *
     * @param message
     */
    public AzureLibraryRequestException(String message) {
        super(message);
    }

    /**
     * Initializes a new instance of the AzureLibraryRequestException class.
     *
     * @param message the exception message.
     * @param cause the Throwable which caused the creation of this AzureLibraryRequestException.
     */
    public AzureLibraryRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
