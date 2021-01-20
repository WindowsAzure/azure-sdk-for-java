// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.throughputControl;

import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.CosmosException;
import com.azure.cosmos.implementation.HttpConstants;
import com.azure.cosmos.implementation.RequestRateTooLargeException;
import com.azure.cosmos.implementation.RxDocumentServiceRequest;
import com.azure.cosmos.implementation.RxDocumentServiceResponse;
import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.implementation.directconnectivity.StoreResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * This is the place where we tracking the RU usage, and make decision whether we should block the request.
 */
public class ThroughputRequestThrottler {
    private static final Logger logger = LoggerFactory.getLogger(ThroughputRequestThrottler.class);

    private final AtomicReference<Double> availableThroughput;
    private final AtomicReference<Double> scheduledThroughput;


    public ThroughputRequestThrottler(double scheduledThroughput) {
        this.availableThroughput = new AtomicReference<>(scheduledThroughput);
        this.scheduledThroughput = new AtomicReference<>(scheduledThroughput);
    }

    public Mono<Void> renewThroughputUsageCycle(double scheduledThroughput) {
        this.scheduledThroughput.set(scheduledThroughput);
        this.updateAvailableThroughput();
        return Mono.empty();
    }

    private void updateAvailableThroughput() {
        this.availableThroughput.getAndAccumulate(this.scheduledThroughput.get(), (available, refill) -> Math.min(available,0) + refill);
    }

    public <T> Mono<T> processRequest(RxDocumentServiceRequest request, Mono<T> nextRequestMono) {
        if (this.availableThroughput.get() > 0) {
            return nextRequestMono
                .doOnSuccess(response -> {
                    this.trackRequestCharge(response);
                })
                .onErrorResume(throwable -> {
                    this.trackRequestCharge(throwable);

                    return Mono.error(throwable);
                });
        } else {
            // there is no enough throughput left, block request
            RequestRateTooLargeException requestRateTooLargeException = new RequestRateTooLargeException();

            int backoffTimeInMilliSeconds = (int)Math.floor(Math.abs(this.availableThroughput.get() * 1000 / this.scheduledThroughput.get()));
            requestRateTooLargeException.getResponseHeaders().put(
                HttpConstants.HttpHeaders.RETRY_AFTER_IN_MILLISECONDS,
                String.valueOf(backoffTimeInMilliSeconds));

            requestRateTooLargeException.getResponseHeaders().put(
                HttpConstants.HttpHeaders.SUB_STATUS,
                String.valueOf(HttpConstants.SubStatusCodes.THROUGHPUT_CONTROL_REQUEST_RATE_TOO_LARGE));

            if (request.requestContext != null) {
                BridgeInternal.setResourceAddress(requestRateTooLargeException, request.requestContext.resourcePhysicalAddress);
            }

            return Mono.error(requestRateTooLargeException);
        }
    }

    private <T> void trackRequestCharge (T response) {
        double requestCharge = 0;
        if (response instanceof StoreResponse) {
            requestCharge = ((StoreResponse)response).getRequestCharge();
        } else if (response instanceof RxDocumentServiceResponse) {
            requestCharge = ((RxDocumentServiceResponse)response).getRequestCharge();
        } else if (response instanceof Throwable) {
            CosmosException cosmosException = Utils.as(response, CosmosException.class);
            if (cosmosException != null) {
                requestCharge = cosmosException.getRequestCharge();
            }
        }
        this.availableThroughput.getAndAccumulate(requestCharge, (available, consumed) -> available - consumed);
    }

    public double getAvailableThroughput() {
        return this.availableThroughput.get();
    }

    public double getScheduledThroughput() {
        return this.scheduledThroughput.get();
    }
}
