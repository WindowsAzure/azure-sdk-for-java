// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.exception;

/**
 * The exception occurred while attempting to connect a socket to a azure service address and port.
 * Typically, the connection was refused remotely (e.g., no process is listening on the azure service address/port).
 *
 * These errors are safe to retry.
 */
public class ServiceRequestException extends AzureException {

    /**
     * Initializes a new instance of the ServiceRequestException class.
     *
     * @param message the exception message or the response content if a message is not available
     */
    public ServiceRequestException(final String message) {
        super(message);
    }

    /**
     * Initializes a new instance of the ServiceRequestException class.
     *
     * @param message the exception message or the response content if a message is not available
     * @param cause the Throwable which caused the creation of this ServiceRequestException
     */
    public ServiceRequestException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
