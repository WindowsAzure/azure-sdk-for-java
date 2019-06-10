// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.eventhubs.implementation;

import com.azure.core.amqp.AmqpEndpointState;
import com.azure.core.amqp.AmqpShutdownSignal;
import com.azure.core.amqp.EndpointStateNotifier;
import com.azure.core.amqp.exception.ErrorContext;
import com.azure.core.implementation.logging.ServiceLogger;
import org.apache.qpid.proton.engine.EndpointState;
import reactor.core.Disposable;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.ReplayProcessor;

import java.io.Closeable;
import java.util.Objects;

abstract class EndpointStateNotifierBase implements EndpointStateNotifier, Closeable {
    private final ReplayProcessor<AmqpEndpointState> connectionStateProcessor = ReplayProcessor.cacheLastOrDefault(AmqpEndpointState.UNINITIALIZED);
    private final DirectProcessor<ErrorContext> errorContextProcessor = DirectProcessor.create();
    private final DirectProcessor<AmqpShutdownSignal> shutdownSignalProcessor = DirectProcessor.create();
    private final Disposable subscription;

    protected ServiceLogger logger;
    private volatile AmqpEndpointState state;

    EndpointStateNotifierBase(ServiceLogger logger) {
        Objects.requireNonNull(logger);

        this.logger = logger;
        this.subscription = connectionStateProcessor.subscribe(s -> this.state = s);
    }

    @Override
    public AmqpEndpointState getCurrentState() {
        return state;
    }

    @Override
    public Flux<ErrorContext> getErrors() {
        return errorContextProcessor;
    }

    @Override
    public Flux<AmqpEndpointState> getConnectionStates() {
        return connectionStateProcessor;
    }

    @Override
    public Flux<AmqpShutdownSignal> getShutdownSignals() {
        return shutdownSignalProcessor;
    }

    void notifyError(ErrorContext error) {
        Objects.requireNonNull(error);

        logger.asInfo().log("Notify error: {}", error);
        errorContextProcessor.onNext(error);
    }

    void notifyShutdown(AmqpShutdownSignal shutdownSignal) {
        Objects.requireNonNull(shutdownSignal);

        logger.asInfo().log("Notify shutdown signal: {}", shutdownSignal);
        shutdownSignalProcessor.onNext(shutdownSignal);
    }

    void notifyEndpointState(EndpointState endpointState) {
        Objects.requireNonNull(endpointState);

        logger.asInfo().log("Connection state: {}", endpointState);
        final AmqpEndpointState state = getConnectionState(endpointState);
        connectionStateProcessor.onNext(state);
    }

    private static AmqpEndpointState getConnectionState(EndpointState state) {
        switch (state) {
            case ACTIVE:
                return AmqpEndpointState.ACTIVE;
            case UNINITIALIZED:
                return AmqpEndpointState.UNINITIALIZED;
            case CLOSED:
                return AmqpEndpointState.CLOSED;
            default:
                throw new UnsupportedOperationException("This endpoint state is not supported. State:" + state);
        }
    }

    @Override
    public void close() {
        subscription.dispose();
        connectionStateProcessor.onComplete();
        errorContextProcessor.onComplete();
        shutdownSignalProcessor.onComplete();
    }
}
