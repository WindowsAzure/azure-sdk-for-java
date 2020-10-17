// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.directconnectivity;

import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.CosmosException;
import com.azure.cosmos.implementation.GoneException;
import com.azure.cosmos.implementation.InvalidPartitionException;
import com.azure.cosmos.implementation.PartitionIsMigratingException;
import com.azure.cosmos.implementation.PartitionKeyRangeGoneException;
import com.azure.cosmos.implementation.PartitionKeyRangeIsSplittingException;
import com.azure.cosmos.implementation.Quadruple;
import com.azure.cosmos.implementation.RetryPolicyWithDiagnostics;
import com.azure.cosmos.implementation.RetryWithException;
import com.azure.cosmos.implementation.RxDocumentServiceRequest;
import com.azure.cosmos.implementation.apachecommons.lang.time.StopWatch;
import com.azure.cosmos.implementation.apachecommons.lang.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Objects;

import static com.azure.cosmos.implementation.guava25.base.Preconditions.checkNotNull;

public class GoneRetryPolicy extends RetryPolicyWithDiagnostics {
    private final static Logger logger = LoggerFactory.getLogger(GoneRetryPolicy.class);
    private final static int DEFAULT_WAIT_TIME_IN_SECONDS = 30;
    private final static int MAXIMUM_BACKOFF_TIME_IN_SECONDS = 15;
    private final static int INITIAL_BACKOFF_TIME = 1;
    private final static int BACK_OFF_MULTIPLIER = 2;

    private final RxDocumentServiceRequest request;
    private volatile int attemptCount = 1;
    private volatile int attemptCountInvalidPartition = 1;
    private volatile int currentBackoffSeconds = GoneRetryPolicy.INITIAL_BACKOFF_TIME;
    private final StopWatch durationTimer = new StopWatch();
    private final int waitTimeInSeconds;
    //TODO once this is moved to IRetryPolicy, remove from here.
    public final static Quadruple<Boolean, Boolean, Duration, Integer> INITIAL_ARGUMENT_VALUE_POLICY_ARG = Quadruple.with(false, false,
        Duration.ofSeconds(60), 0);

    public GoneRetryPolicy(RxDocumentServiceRequest request, Integer waitTimeInSeconds) {
        checkNotNull(request, "request must not be null.");
        this.request = request;
        startStopWatch(this.durationTimer);
        this.waitTimeInSeconds = Objects.requireNonNullElse(waitTimeInSeconds,
            DEFAULT_WAIT_TIME_IN_SECONDS);
    }

    private boolean isRetryableException(Exception exception) {
        if (exception instanceof GoneException ||
            exception instanceof RetryWithException ||
            exception instanceof PartitionIsMigratingException ||
            exception instanceof PartitionKeyRangeIsSplittingException) {

            return true;
        }

        if (exception instanceof InvalidPartitionException) {
            return this.request.getPartitionKeyRangeIdentity() != null &&
                this.request.getPartitionKeyRangeIdentity().getCollectionRid() != null;
        }

        return false;
    }

    private CosmosException logAndWrapExceptionWithLastRetryWithException(Exception exception) {
        RetryWithException lastRetryWithException = this.request.getLastRetryWithException();

        String exceptionType;
        if (exception instanceof GoneException) {
            exceptionType = "GoneException";
        } else if (exception instanceof PartitionKeyRangeGoneException) {
            exceptionType = "PartitionKeyRangeGoneException";
        } else if (exception instanceof  InvalidPartitionException) {
            exceptionType = "InvalidPartitionException";
        } else if (exception instanceof  PartitionKeyRangeIsSplittingException) {
            exceptionType = "PartitionKeyRangeIsSplittingException";
        } else if (exception instanceof  RetryWithException) {

            exceptionType = "PartitionKeyRangeIsSplittingException";
        } else if (exception instanceof CosmosException) {
            logger.warn("Received CosmosException after backoff/retry. Will fail the request.",
                exception);

            return (CosmosException)exception;
        } else {
            throw new IllegalStateException("Invalid exception type", exception);
        }

        if (lastRetryWithException != null) {
            logger.warn(
                "Received {} after backoff/retry including at least one RetryWithException. "
                    + "Will fail the request with RetryWithException. {}: {}. RetryWithException: {}",
                exceptionType,
                exceptionType,
                exception,
                lastRetryWithException);

            return lastRetryWithException;
        }

        logger.warn(
            "Received {} after backoff/retry. Will fail the request. {}",
            exceptionType,
            exception);
        return BridgeInternal.createServiceUnavailableException(exception);
    }

    @Override
    public Mono<ShouldRetryResult> shouldRetry(Exception exception) {
        CosmosException exceptionToThrow;
        Duration backoffTime = Duration.ofSeconds(0);
        Duration timeout;
        boolean forceRefreshAddressCache;
        if (!isRetryableException(exception)) {

            logger.warn("Operation will NOT be retried. Current attempt {}, Exception: ", this.attemptCount,
                exception);
            stopStopWatch(this.durationTimer);
            return Mono.just(ShouldRetryResult.noRetry());
        } else if (exception instanceof GoneException &&
            !request.isReadOnly() &&
            BridgeInternal.hasSendingRequestStarted((CosmosException)exception)) {

            logger.warn(
                "Operation will NOT be retried. Write operations can not be retried safely when sending the request " +
                    "to the service because they aren't idempotent. Current attempt {}, Exception: ",
                this.attemptCount,
                exception);
            stopStopWatch(this.durationTimer);

            return Mono.just(ShouldRetryResult.noRetry(
                Quadruple.with(true, true, Duration.ofMillis(0), this.attemptCount)));
        }

        long remainingSeconds = this.waitTimeInSeconds - this.durationTimer.getTime() / 1000;
        int currentRetryAttemptCount = this.attemptCount;
        if (this.attemptCount++ > 1) {
            if (remainingSeconds <= 0) {
                exceptionToThrow = logAndWrapExceptionWithLastRetryWithException(exception);
                stopStopWatch(this.durationTimer);

                return Mono.just(ShouldRetryResult.error(exceptionToThrow));
            }

            backoffTime = Duration.ofSeconds(Math.min(Math.min(this.currentBackoffSeconds, remainingSeconds),
                GoneRetryPolicy.MAXIMUM_BACKOFF_TIME_IN_SECONDS));
            this.currentBackoffSeconds *= GoneRetryPolicy.BACK_OFF_MULTIPLIER;
            logger.debug("BackoffTime: {} seconds.", backoffTime.getSeconds());
        }

        // Calculate the remaining time based after accounting for the backoff that we
        // will perform
        long timeoutInMillSec = remainingSeconds*1000 - backoffTime.toMillis();
        timeout = timeoutInMillSec > 0 ? Duration.ofMillis(timeoutInMillSec)
            : Duration.ofSeconds(GoneRetryPolicy.MAXIMUM_BACKOFF_TIME_IN_SECONDS);

        Pair<Mono<ShouldRetryResult>, Boolean> exceptionHandlingResult = handleException(exception);
        Mono<ShouldRetryResult> result = exceptionHandlingResult.getLeft();
        if (result != null) {
            return result;
        }

        forceRefreshAddressCache = exceptionHandlingResult.getRight();

        return Mono.just(ShouldRetryResult.retryAfter(backoffTime,
            Quadruple.with(forceRefreshAddressCache, true, timeout, currentRetryAttemptCount)));
    }

    private Pair<Mono<ShouldRetryResult>, Boolean> handleException(Exception exception) {
        if (exception instanceof GoneException) {
            return handleGoneException((GoneException)exception);
        } else if (exception instanceof PartitionIsMigratingException) {
            return handlePartitionIsMigratingException((PartitionIsMigratingException)exception);
        } else if (exception instanceof InvalidPartitionException) {
            return handleInvalidPartitionException((InvalidPartitionException)exception);
        } else if (exception instanceof PartitionKeyRangeIsSplittingException) {
            return handlePartitionKeyIsSplittingException((PartitionKeyRangeIsSplittingException) exception);
        }

        throw new IllegalStateException("Invalid exception type", exception);
    }

    private Pair<Mono<ShouldRetryResult>, Boolean> handleGoneException(GoneException exception) {
        logger.debug("Received gone exception, will retry, {}", exception.toString());
        return Pair.of(null, true); // indicate we are in retry.
    }

    private Pair<Mono<ShouldRetryResult>, Boolean> handlePartitionIsMigratingException(PartitionIsMigratingException exception) {
        logger.warn("Received PartitionIsMigratingException, will retry, {}", exception.toString());
        this.request.forceCollectionRoutingMapRefresh = true;
        return Pair.of(null, true);
    }

    private Pair<Mono<ShouldRetryResult>, Boolean> handlePartitionKeyIsSplittingException(PartitionKeyRangeIsSplittingException exception) {
        this.request.requestContext.resolvedPartitionKeyRange = null;
        this.request.requestContext.quorumSelectedLSN = -1;
        this.request.requestContext.quorumSelectedStoreResponse = null;
        logger.info("Received partition key range splitting exception, will retry, {}", exception.toString());
        this.request.forcePartitionKeyRangeRefresh = true;
        return Pair.of(null, false);
    }

    private Pair<Mono<ShouldRetryResult>, Boolean> handleInvalidPartitionException(InvalidPartitionException exception) {
        this.request.requestContext.quorumSelectedLSN = -1;
        this.request.requestContext.resolvedPartitionKeyRange = null;
        this.request.requestContext.quorumSelectedStoreResponse = null;
        this.request.requestContext.globalCommittedSelectedLSN = -1;
        if (this.attemptCountInvalidPartition++ > 2) {
            // for second InvalidPartitionException, stop retrying.
            logger.warn("Received second InvalidPartitionException after backoff/retry. Will fail the request. {}",
                exception.toString());
            return Pair.of(
                Mono.just(ShouldRetryResult.error(BridgeInternal.createServiceUnavailableException(exception))),
                false);
        }

        logger.warn("Received invalid collection exception, will retry, {}", exception.toString());
        this.request.forceNameCacheRefresh = true;

        return Pair.of(null, false);
    }

    private void stopStopWatch(StopWatch stopwatch) {
        synchronized (stopwatch) {
            stopwatch.stop();
        }
    }

    private void startStopWatch(StopWatch stopwatch) {
        synchronized (stopwatch) {
            stopwatch.start();
        }
    }
}
