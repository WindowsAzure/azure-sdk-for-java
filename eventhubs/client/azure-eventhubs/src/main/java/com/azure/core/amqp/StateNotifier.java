// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp;

import com.azure.core.amqp.exception.ErrorContext;
import reactor.core.publisher.Flux;

/**
 * Notifies subscribers of the endpoint state and any errors that occur with the object.
 */
public interface StateNotifier {

    /**
     * Gets the current state of the endpoint.
     *
     * @return The current state of the endpoint.
     */
    ConnectionState getCurrentState();

    /**
     * Gets the errors that occurred in the AMQP endpoint.
     *
     * @return A stream of errors that occurred in the AMQP endpoint.
     */
    Flux<ErrorContext> getErrors();

    /**
     * Gets the endpoint states for the AMQP endpoint.
     *
     * @return A stream of endpoint states as they occur in the endpoint.
     */
    Flux<ConnectionState> getConnectionStates();

    /**
     * Gets any shutdown signals that occur in the AMQP endpoint.
     *
     * @return A stream of shutdown signals that occur in the AMQP endpoint.
     */
    Flux<ShutdownSignal> getShutdownSignals();
}
