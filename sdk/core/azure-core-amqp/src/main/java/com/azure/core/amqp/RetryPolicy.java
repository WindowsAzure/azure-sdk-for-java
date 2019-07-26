// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp;

import com.azure.core.amqp.exception.AmqpException;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;

import static com.azure.core.amqp.exception.ErrorCondition.SERVER_BUSY_ERROR;

/**
 * An abstract representation of a policy to govern retrying of messaging operations.
 */
public abstract class RetryPolicy implements Cloneable {
    static final long NANOS_PER_SECOND = 1000_000_000L;

    private static final double JITTER_FACTOR = 0.08;
    // Base sleep wait time.
    private static final Duration SERVER_BUSY_WAIT_TIME = Duration.ofSeconds(4);

    private final RetryOptions retryOptions;
    private final Duration baseJitter;

    /**
     * Creates an instance with the given retry options.
     *
     * @param retryOptions The options to set on this retry policy.
     */
    protected RetryPolicy(RetryOptions retryOptions) {
        this.retryOptions = (RetryOptions) retryOptions.clone();

        // 1 second = 1.0 * 10^9 nanoseconds.
        final Double jitterInNanos = (retryOptions.delay().getSeconds() * JITTER_FACTOR) * NANOS_PER_SECOND;
        baseJitter = Duration.ofNanos(jitterInNanos.longValue());
    }

    /**
     * Gets the set of options used to configure this retry policy.
     *
     * @return The set of options used to configure this retry policy.
     */
    protected RetryOptions getRetryOptions() {
        return retryOptions;
    }

    /**
     * Calculates the amount of time to delay before the next retry attempt.
     *
     * @param lastException The last exception that was observed for the operation to be retried.
     * @param remainingTime The amount of time remaining for the cumulative timeout across retry attempts.
     * @param retryCount The number of attempts that have been made, including the initial attempt before any
     *         retries.
     * @return The amount of time to delay before retrying the associated operation; if {@code null}, then the operation
     *         is no longer eligible to be retried.
     */
    public Duration calculateRetryDelay(Exception lastException, Duration remainingTime, int retryCount) {
        if (retryOptions.delay() == Duration.ZERO
            || retryOptions.maxDelay() == Duration.ZERO
            || retryCount > retryOptions.maxRetries()
            || !isRetriableException(lastException)) {
            return null;
        }

        if (!(lastException instanceof AmqpException)) {
            return null;
        }

        final Duration baseDelay = ((AmqpException) lastException).getErrorCondition() == SERVER_BUSY_ERROR
            ? retryOptions.delay().plus(SERVER_BUSY_WAIT_TIME)
            : retryOptions.delay();

        final Duration delay = calculateRetryDelay(retryCount, baseDelay, baseJitter, ThreadLocalRandom.current());

        return delay.compareTo(remainingTime) <= 0
            ? delay
            : null;
    }

    protected abstract Duration calculateRetryDelay(int retryCount, Duration baseDelay, Duration baseJitter,
                                                    ThreadLocalRandom random);

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return retryOptions.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RetryPolicy)) {
            return false;
        }

        final RetryPolicy other = (RetryPolicy) obj;
        return retryOptions.equals(other.retryOptions);
    }

    /**
     * Check if the existing exception is a retriable exception.
     *
     * @param exception An exception that was observed for the operation to be retried.
     * @return true if the exception is a retriable exception, otherwise false.
     */
    private static boolean isRetriableException(Exception exception) {
        return (exception instanceof AmqpException) && ((AmqpException) exception).isTransient();
    }
}
