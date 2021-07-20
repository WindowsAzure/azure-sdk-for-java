// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.servicebus.stream.binder.properties;

import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;
import com.azure.spring.integration.core.api.CheckpointMode;

/**
 * @author Warren Zhu
 * @author Eduardo Sciullo
 */
public class ServiceBusConsumerProperties {
    private int prefetchCount = 1;
    private int concurrency = 1;
    private boolean sessionsEnabled = false;
    private boolean requeueRejected = false;
    private int maxConcurrentCalls = 1;
    private ServiceBusReceiveMode serviceBusReceiveMode = ServiceBusReceiveMode.PEEK_LOCK;

    private CheckpointMode checkpointMode = CheckpointMode.RECORD;

    public CheckpointMode getCheckpointMode() {
        return checkpointMode;
    }

    public void setCheckpointMode(CheckpointMode checkpointMode) {
        this.checkpointMode = checkpointMode;
    }

    public int getMaxConcurrentCalls() {
        return maxConcurrentCalls;
    }

    public void setMaxConcurrentCalls(int maxConcurrentCalls) {
        this.maxConcurrentCalls = maxConcurrentCalls;
    }

    /**
     * Prefetch count of underlying service bus client.
     *
     * <p>
     *
     * @return int, default : 1
     */
    public int getPrefetchCount() {
        return prefetchCount;
    }

    public void setPrefetchCount(int prefetchCount) {
        this.prefetchCount = prefetchCount;
    }

    /**
     * Controls the max concurrent calls of service bus message handler and
     * the size of fixed thread pool that handles user's business logic
     *
     * <p>
     * @return int, default : 1
     */
    public int getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(int concurrency) {
        this.concurrency = concurrency;
    }

    /**
     * Controls if is session aware
     *
     * <p>
     * @return boolean, default : false
     */
    public boolean isSessionsEnabled() {
        return sessionsEnabled;
    }

    public void setSessionsEnabled(boolean sessionsEnabled) {
        this.sessionsEnabled = sessionsEnabled;
    }

    /**
     * Controls if the failed messages are routed to the DLQ
     *
     * <p>
     * @return boolean, default : false
     */
    public boolean isRequeueRejected() {
        return requeueRejected;
    }

    public void setRequeueRejected(boolean requeueRejected) {
        this.requeueRejected = requeueRejected;
    }

    public ServiceBusReceiveMode getServiceBusReceiveMode() {
        return serviceBusReceiveMode;
    }

    public void setServiceBusReceiveMode(ServiceBusReceiveMode serviceBusReceiveMode) {
        this.serviceBusReceiveMode = serviceBusReceiveMode;
    }
}
