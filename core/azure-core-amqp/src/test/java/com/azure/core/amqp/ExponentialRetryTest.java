// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp;

import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;

public class ExponentialRetryTest {
    private final Duration minBackoff = Duration.ofSeconds(15);
    private final Duration maxBackoff = Duration.ofSeconds(45);
    private final int retryAttempts = 4;

    /**
     * Verifies that when the service is busy and we retry an exception multiple times, the retry duration gets longer.
     */
    @Test
    public void retryDurationIncreases() {
        // Arrange
        final ExponentialRetry retry = new ExponentialRetry(minBackoff, maxBackoff, retryAttempts);
        final Duration baseWaitTime = Duration.ofSeconds(5);
        final Duration remainingTime = Duration.ofSeconds(60);

        // Act
        retry.incrementRetryCount();
        final Duration firstRetryInterval = retry.getNextRetryInterval(baseWaitTime, remainingTime);
        Assert.assertNotNull(firstRetryInterval);

        retry.incrementRetryCount();
        final Duration leftoverTime = remainingTime.minus(firstRetryInterval);
        final Duration secondRetryInterval = retry.getNextRetryInterval(baseWaitTime, leftoverTime);

        // Assert
        Assert.assertNotNull(secondRetryInterval);
        Assert.assertTrue(secondRetryInterval.toNanos() > firstRetryInterval.toNanos());
    }

    /**
     * Verifies that we can clone the retry instance and it behaves the same as its original.
     */
    @Test
    public void retryCloneBehavesSame() {
        // Arrange
        final ExponentialRetry retry = new ExponentialRetry(minBackoff, maxBackoff, retryAttempts);
        final ExponentialRetry clone = (ExponentialRetry) retry.clone();
        final Duration baseWaitTime = Duration.ofSeconds(5);

        final Duration remainingTime = Duration.ofSeconds(60);

        retry.incrementRetryCount();
        final Duration retryInterval = retry.getNextRetryInterval(baseWaitTime, remainingTime);

        clone.incrementRetryCount();
        clone.incrementRetryCount();
        clone.incrementRetryCount();
        final Duration cloneRetryInterval = clone.getNextRetryInterval(baseWaitTime, remainingTime);

        // Assert
        Assert.assertNotNull(retryInterval);
        Assert.assertNotNull(cloneRetryInterval);

        // The retry interval for the clone will be larger because we've incremented the retry count, so it should
        // calculate a longer waiting period.
        Assert.assertTrue(cloneRetryInterval.toNanos() > retryInterval.toNanos());
    }

    @Test
    public void retryClone() {
        // Arrange
        final ExponentialRetry retry = new ExponentialRetry(minBackoff, maxBackoff, retryAttempts);
        final ExponentialRetry clone = (ExponentialRetry) retry.clone();

        final Duration baseWaitTime = Duration.ofSeconds(5);
        final Duration remainingTime = Duration.ofSeconds(60);

        retry.incrementRetryCount();
        final Duration retryInterval = retry.getNextRetryInterval(baseWaitTime, remainingTime);

        clone.incrementRetryCount();
        final Duration cloneRetryInterval = clone.getNextRetryInterval(baseWaitTime, remainingTime);

        // Assert
        Assert.assertNotSame(retry, clone);
        Assert.assertEquals(retry, clone);
        Assert.assertEquals(retry.hashCode(), clone.hashCode());

        Assert.assertNotNull(retryInterval);
        Assert.assertNotNull(cloneRetryInterval);
        Assert.assertEquals(retryInterval, cloneRetryInterval);
    }
}
