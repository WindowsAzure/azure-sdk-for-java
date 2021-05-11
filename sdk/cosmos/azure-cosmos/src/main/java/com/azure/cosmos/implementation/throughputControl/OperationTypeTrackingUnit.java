// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.throughputControl;

import com.azure.cosmos.implementation.OperationType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class OperationTypeTrackingUnit {
    private static final Logger logger = LoggerFactory.getLogger(OperationTypeTrackingUnit.class);

    private final AtomicInteger rejectedRequests;
    private final AtomicInteger passedRequests;
    private final AtomicReference<Double> successRuUsage;
    private final AtomicInteger successResponse;
    private final AtomicInteger failedResponse;
    private final OperationType operationType;

    public OperationTypeTrackingUnit(OperationType operationType) {
        this.rejectedRequests = new AtomicInteger(0);
        this.passedRequests = new AtomicInteger(0);
        this.successRuUsage = new AtomicReference<>(0d);
        this.operationType = operationType;
        this.successResponse = new AtomicInteger(0);
        this.failedResponse = new AtomicInteger(0);
    }

    public String logStatistics() {
        double sAvgRuPerRequest = 0.0;
        if (this.successResponse.get() != 0) {
            sAvgRuPerRequest = successRuUsage.get() / this.successResponse.get();
        }

        return String.format(
            "Operation type: %s: [rejectedRequests: %s, passedRequests: %s, sAvgRu: %s, successResponse: %s, failedResponse: %s]",
            this.operationType.toString(),
            this.rejectedRequests.get(),
            this.passedRequests.get(),
            sAvgRuPerRequest,
            this.successResponse.get(),
            this.failedResponse.get());
    }

    public void reset() {
        this.rejectedRequests.set(0);
        this.passedRequests.set(0);
        this.successRuUsage.set(0d);
        this.successResponse.set(0);
        this.failedResponse.set(0);
    }

    public void increasePassedRequest(){
        this.passedRequests.incrementAndGet();
    }

    public void increaseRejectedRequest(){
        this.rejectedRequests.incrementAndGet();
    }

    public void increaseSuccessResponse() {
        this.successResponse.incrementAndGet();
    }

    public void increaseFailedresponse() {
        this.failedResponse.incrementAndGet();
    }

    public void trackRRuUsage(double ruUsage) {
        this.successRuUsage.getAndAccumulate(ruUsage, (available, newRu) -> available + newRu);
    }

    public int getRejectedRequests() {
        return rejectedRequests.get();
    }

    public int getPassedRequests() {
        return passedRequests.get();
    }
}
