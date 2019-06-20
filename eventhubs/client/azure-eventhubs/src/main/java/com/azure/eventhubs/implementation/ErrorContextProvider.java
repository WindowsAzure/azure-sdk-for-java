// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.eventhubs.implementation;

import com.azure.core.amqp.exception.ErrorContext;
import com.azure.core.amqp.exception.LinkErrorContext;
import com.azure.core.amqp.exception.SessionErrorContext;

/**
 * Generates contexts for AMQP errors that occur on a connection, link, or session handler.
 *
 * @see SessionErrorContext
 * @see LinkErrorContext
 */
@FunctionalInterface
interface ErrorContextProvider {
    /**
     * Gets the context this error occurred on.
     *
     * @return The context where this exception occurred.
     */
    ErrorContext getErrorContext();
}
