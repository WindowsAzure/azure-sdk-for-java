// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.implementation.handler;

import com.azure.core.util.logging.ClientLogger;
import org.apache.qpid.proton.engine.BaseHandler;
import org.apache.qpid.proton.engine.EndpointState;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.ReplayProcessor;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Handler extends BaseHandler implements Closeable {
    private final ClientLogger logger = new ClientLogger(Handler.class);
    private final AtomicBoolean isTerminal = new AtomicBoolean();
    private final ReplayProcessor<EndpointState> endpointStateProcessor =
        ReplayProcessor.cacheLastOrDefault(EndpointState.UNINITIALIZED);
    private final FluxSink<EndpointState> endpointSink = endpointStateProcessor.sink();
    private final String connectionId;
    private final String hostname;

    Handler(final String connectionId, final String hostname) {
        this.connectionId = connectionId;
        this.hostname = hostname;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public String getHostname() {
        return hostname;
    }

    public Flux<EndpointState> getEndpointStates() {
        return endpointStateProcessor.distinct();
    }

    void onNext(EndpointState state) {
        endpointSink.next(state);
    }

    void onError(Throwable error) {
        if (isTerminal.getAndSet(true)) {
            return;
        }

        endpointSink.next(EndpointState.CLOSED);
        endpointSink.error(error);
    }

    @Override
    public void close() {
        logger.verbose("Closing and cleaning.");
        if (isTerminal.getAndSet(true)) {
            return;
        }

        endpointSink.next(EndpointState.CLOSED);
        endpointSink.complete();
    }
}
