// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.batch;

import com.azure.cosmos.BulkProcessingOptions;
import com.azure.cosmos.implementation.apachecommons.lang.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.util.function.Tuple2;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

import static com.azure.cosmos.implementation.guava25.base.Preconditions.checkNotNull;

public class PartitionScopeThresholds<TContext> {
    private final static Logger logger = LoggerFactory.getLogger(PartitionScopeThresholds.class);

    private final String pkRangeId;
    private final BulkProcessingOptions<TContext> options;
    private int targetMicroBatchSize;
    private final AtomicLong totalOperationCount;
    private final AtomicReference<CurrentIntervalThresholds> currentThresholds;
    private final String identifier = UUID.randomUUID().toString();

    public PartitionScopeThresholds(String pkRangeId, BulkProcessingOptions<TContext> options) {
        checkNotNull(pkRangeId, "expected non-null pkRangeId");
        checkNotNull(options, "expected non-null options");

        this.pkRangeId = pkRangeId;
        this.options = options;
        this.targetMicroBatchSize = options.getMaxMicroBatchSize();
        this.totalOperationCount = new AtomicLong(0);
        this.currentThresholds = new AtomicReference<>(new CurrentIntervalThresholds());
    }

    public String getPartitionKeyRangeId() {
        return this.pkRangeId;
    }

    private Pair<Boolean, Boolean> shouldReevaluateThresholds(long totalSnapshot, long currentSnapshot) {
        if (totalSnapshot < 1_000) {

            return Pair.of(currentSnapshot == 100, false);
        }

        if (totalSnapshot < 10_000) {
            return Pair.of(currentSnapshot == 1_000, false);
        }

        return Pair.of(currentSnapshot % 1_000 == 0, currentSnapshot % 10_000 == 0);
    }

    private void recordOperation(boolean isRetry) {
        long totalSnapshot = this.totalOperationCount.incrementAndGet();
        CurrentIntervalThresholds currentThresholdsSnapshot = this.currentThresholds.get();
        long currentTotalCountSnapshot = currentThresholdsSnapshot.currentOperationCount.incrementAndGet();
        long currentRetryCountSnapshot;
        if (isRetry) {
            currentRetryCountSnapshot = currentThresholdsSnapshot.currentRetriedOperationCount.incrementAndGet();
        } else {
            currentRetryCountSnapshot = currentThresholdsSnapshot.currentRetriedOperationCount.get();
        }

        double retryRate = (double)currentRetryCountSnapshot / currentTotalCountSnapshot;
        Pair<Boolean, Boolean> shouldReevaluateResult =
            this.shouldReevaluateThresholds(totalSnapshot, currentTotalCountSnapshot);
        boolean shouldReevaluate = shouldReevaluateResult.getLeft();
        if (shouldReevaluate) {
            boolean onlyUpscale = shouldReevaluateResult.getRight();
            if (onlyUpscale ||
                this.currentThresholds.compareAndSet(currentThresholdsSnapshot, new CurrentIntervalThresholds())) {

                this.reevaluateThresholds(
                    totalSnapshot,
                    currentTotalCountSnapshot,
                    currentRetryCountSnapshot,
                    retryRate,
                    shouldReevaluateResult.getRight());
            }
        }
    }

    private synchronized void reevaluateThresholds(
        long totalCount,
        long currentCount,
        long retryCount,
        double retryRate,
        boolean onlyUpscale) {

        int microBatchSizeBefore = this.targetMicroBatchSize;

        if (retryRate == 0 &&
            this.targetMicroBatchSize < this.options.getMaxMicroBatchSize()) {

            this.targetMicroBatchSize = Math.min(
                Math.min(
                    this.targetMicroBatchSize * 2,
                    this.targetMicroBatchSize +
                        (int)(this.options.getMaxMicroBatchSize() * this.options.getMaxMicroBatchRetryRate())),
                this.options.getMaxMicroBatchSize());
        } else if (!onlyUpscale && retryRate > this.options.getMaxMicroBatchRetryRate() &&
            this.targetMicroBatchSize > 1) {

            double deltaRate = retryRate - this.options.getMaxMicroBatchRetryRate();
            this.targetMicroBatchSize = Math.max(1, (int) (this.targetMicroBatchSize * (1 - deltaRate)));
        }

        // TODO @fabianm - change to DEBUG after testing
        logger.info(
            "Reevaluated thresholds for PKRange '{}#{}' (TotalCount: {}, CurrentCount: {}, CurrentRetryCount: {}, " +
                "CurrentRetryRate: {} - BatchSize {} -> {}, OlyUpscale: {})",
            this.pkRangeId,
            this.identifier,
            totalCount,
            currentCount,
            retryCount,
            retryRate,
            microBatchSizeBefore,
            this.targetMicroBatchSize,
            onlyUpscale);
    }

    public void recordSuccessfulOperation() {
        this.recordOperation(false);
    }

    public void recordEnqueuedRetry() {
        this.recordOperation(true);
    }

    public int  getTargetMicroBatchSizeSnapshot() {
        return this.targetMicroBatchSize;
    }

    private static class CurrentIntervalThresholds {
        public final AtomicLong currentOperationCount = new AtomicLong(0);
        public final AtomicLong currentRetriedOperationCount = new AtomicLong(0);
    }
}
