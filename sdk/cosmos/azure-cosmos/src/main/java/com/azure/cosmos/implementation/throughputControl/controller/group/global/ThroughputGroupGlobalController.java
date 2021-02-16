// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.throughputControl.controller.group.global;

import com.azure.cosmos.ConnectionMode;
import com.azure.cosmos.implementation.GlobalEndpointManager;
import com.azure.cosmos.implementation.caches.RxPartitionKeyRangeCache;
import com.azure.cosmos.implementation.changefeed.CancellationToken;
import com.azure.cosmos.implementation.guava25.collect.EvictingQueue;
import com.azure.cosmos.implementation.throughputControl.config.ThroughputGlobalControlGroup;
import com.azure.cosmos.implementation.throughputControl.controller.group.ThroughputGroupControllerBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicReference;

public class ThroughputGroupGlobalController extends ThroughputGroupControllerBase {
    private static final Logger logger = LoggerFactory.getLogger(ThroughputGroupGlobalController.class);
    private static final double INITIAL_CLIENT_THROUGHPUT_RU_SHARE = 1.0;
    private static final double INITIAL_THROUGHPUT_USAGE = 1.0;
    private static final int DEFAULT_THROUGHPUT_USAGE_QUEUE_SIZE = 300; // 5 mins windows since we refresh ru usage every 1s

    private final Duration controlItemRenewInterval;
    private final ThroughputControlContainerManager containerManager;
    private final EvictingQueue<ThroughputUsageSnapshot> throughputUsageSnapshotQueue;
    private final Object throughputUsageSnapshotQueueLock;
    private AtomicReference<Double> clientThroughputShare;

    public ThroughputGroupGlobalController(
        ConnectionMode connectionMode,
        GlobalEndpointManager globalEndpointManager,
        ThroughputGlobalControlGroup group,
        Integer maxContainerThroughput,
        RxPartitionKeyRangeCache partitionKeyRangeCache,
        String targetContainerRid) {
        super(connectionMode, globalEndpointManager, group, maxContainerThroughput, partitionKeyRangeCache, targetContainerRid);

        this.controlItemRenewInterval = group.getControlItemRenewInterval();
        this.containerManager = new ThroughputControlContainerManager(group);

        this.throughputUsageSnapshotQueue = EvictingQueue.create(DEFAULT_THROUGHPUT_USAGE_QUEUE_SIZE);
        this.throughputUsageSnapshotQueue.add(new ThroughputUsageSnapshot(INITIAL_THROUGHPUT_USAGE));
        this.throughputUsageSnapshotQueueLock = new Object();
        this.clientThroughputShare = new AtomicReference<>(INITIAL_CLIENT_THROUGHPUT_RU_SHARE);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> Mono<T> init() {
        return this.containerManager.validateControlContainer()
            .flatMap(dummy -> this.containerManager.getOrCreateConfigItem())
            .flatMap(dummy -> {
                double loadFactor = this.calculateLoadFactor();
                return this.containerManager.createGroupClientItem(loadFactor)
                    .flatMap(clientItem -> this.calculateClientThroughputShare(loadFactor));
            })
            .flatMap(dummy -> this.resolveRequestController())
            .doOnSuccess(dummy -> {
                this.throughputUsageCycleRenewTask(this.cancellationTokenSource.getToken()).publishOn(Schedulers.parallel()).subscribe();
                this.calculateClientThroughputShareTask(this.cancellationTokenSource.getToken()).publishOn(Schedulers.parallel()).subscribe();
            })
            .thenReturn((T)this);
    }

    @Override
    public double getClientThroughputShare() {
        return this.clientThroughputShare.get();
    }

    @Override
    public void recordThroughputUsage(double throughputUsage) {
        synchronized (this.throughputUsageSnapshotQueueLock) {
            this.throughputUsageSnapshotQueue.add(new ThroughputUsageSnapshot(throughputUsage));
        }
    }

    private Mono<ThroughputGroupGlobalController> calculateClientThroughputShare(double loadFactor) {
        return this.containerManager.queryLoadFactorFromAllClients()
            .doOnSuccess(totalLoads -> this.clientThroughputShare.set(loadFactor / totalLoads))
            .thenReturn(this);
    }

    private double calculateLoadFactor() {
        synchronized (this.throughputUsageSnapshotQueueLock) {
            Instant startTime = this.throughputUsageSnapshotQueue.peek().getTime();

            double totalWeight = 0.0;
            for (ThroughputUsageSnapshot throughputUsageSnapshot : this.throughputUsageSnapshotQueue) {
                totalWeight += throughputUsageSnapshot.calculateWeight(startTime);
            }

            double loadFactor = 0.0;
            for (ThroughputUsageSnapshot throughputUsageSnapshot : this.throughputUsageSnapshotQueue) {
                loadFactor += (throughputUsageSnapshot.getWeight() / totalWeight) * throughputUsageSnapshot.getThroughputUsage();
            }

            return loadFactor;
        }
    }

    private Flux<Void> calculateClientThroughputShareTask(CancellationToken cancellationToken) {
        return Mono.delay(controlItemRenewInterval)
            .flatMap(t -> {
                double loadFactor = this.calculateLoadFactor();
                return this.containerManager.replaceOrCreateGroupClientItem(loadFactor)
                    .flatMap(clientItem -> this.calculateClientThroughputShare(loadFactor));
            })
            .onErrorResume(throwable -> {
                logger.warn("Calculate throughput task failed ", throwable);
                return Mono.empty();
            })
            .then()
            .repeat(() -> !cancellationToken.isCancellationRequested());
    }
}
