// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.eventhubs;

import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.implementation.util.ImplUtils;
import reactor.core.scheduler.Scheduler;

import java.time.Duration;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

/**
 * Options when receiving events from Event Hubs.
 */
public class ReceiverOptions {
    /**
     * The name of the default consumer group in the Event Hubs service.
     */
    public static final String DEFAULT_CONSUMER_GROUP_NAME = "$Default";

    // The maximum length, in characters, for the identifier assigned to a receiver.
    private static final int MAXIMUM_IDENTIFIER_LENGTH = 64;
    // The minimum value allowed for the prefetch count of the receiver.
    private static final int MINIMUM_PREFETCH_COUNT = 1;
    private static final int DEFAULT_PREFETCH_COUNT = 500;
    private static final int MAXIMUM_PREFETCH_COUNT = 8000;

    private String identifier;
    private String consumerGroup;
    private Long epoch;
    private RetryPolicy retryPolicy;
    private boolean keepUpdated;
    private Duration receiveTimeout;
    private Scheduler scheduler;
    private EventPosition beginReceivingAt;
    private int prefetchCount;

    /**
     * Creates a new instance with a position at the beginning of the partition stream, consumer group set to
     * {@link #DEFAULT_CONSUMER_GROUP_NAME},and the default prefetch amount.
     */
    public ReceiverOptions() {
        this.consumerGroup = DEFAULT_CONSUMER_GROUP_NAME;
        this.prefetchCount = DEFAULT_PREFETCH_COUNT;
        this.beginReceivingAt = EventPosition.firstAvailableEvent();
    }

    /**
     * Sets an optional text-based identifier label to assign to an event receiver.
     *
     * @param identifier The receiver name.
     * @return The updated ReceiverOptions object.
     */
    public ReceiverOptions identifier(String identifier) {
        validateIdentifier(identifier);
        this.identifier = identifier;
        return this;
    }

    /**
     * The position within the partition where the receiver should begin reading events.
     *
     * <p>
     * If not specified, the receiver will begin receiving all events that are contained in the partition, starting with
     * the first event that was enqueued and will continue receiving until there are no more events observed.
     *
     * @param position Position within the partition where the receiver should begin reading events.
     * @return The updated ReceiverOptions object.
     */
    public ReceiverOptions beginReceivingAt(EventPosition position) {
        this.beginReceivingAt = position;
        return this;
    }

    /**
     * Sets the name of the consumer group.
     *
     * @param consumerGroup The name of the consumer group.
     * @return The updated ReceiverOptions object.
     */
    public ReceiverOptions consumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }

    /**
     * Sets the epoch value on this receiver. When specified, this becomes an Epoch {@link EventReceiver}.
     * An Epoch receiver guarantees that only one {@link EventReceiver} can listen to each
     * "partition + consumer group" combination.
     *
     * @param epoch The Epoch value for this receiver.
     * @return The updated ReceiverOptions object.
     */
    public ReceiverOptions epoch(long epoch) {
        this.epoch = epoch;
        return this;
    }

    /**
     * Sets the retry policy used to govern retry attempts for receiving events. If not specified, the retry policy
     * configured on the associated {@link EventHubClient} is used.
     *
     * @param retryPolicy The retry policy to use when receiving events.
     * @return The updated ReceiverOptions object.
     */
    public ReceiverOptions retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Sets the timeout to apply when receiving events. If not specified, the timeout configured with the associated
     * {@link EventHubClient} is used.
     *
     * @param duration The timeout when receiving events.
     * @return The updated ReceiverOptions object.
     */
    public ReceiverOptions defaultMaximumReceiveWaitTime(Duration duration) {
        this.receiveTimeout = duration;
        return this;
    }

    /**
     * Sets the count used by the receiver to control the number of events this receiver will actively receive and queue
     * locally without regard to whether a receive operation is currently active.
     *
     * @param prefetchCount The amount of events to queue locally.
     * @return The updated ReceiverOptions object.
     */
    public ReceiverOptions prefetchCount(int prefetchCount) {
        if (prefetchCount < MINIMUM_PREFETCH_COUNT) {
            throw new IllegalArgumentException(String.format(Locale.US,
                "PrefetchCount, '%s' has to be above %s", prefetchCount, MINIMUM_PREFETCH_COUNT));
        }

        if (prefetchCount > MAXIMUM_PREFETCH_COUNT) {
            throw new IllegalArgumentException(String.format(Locale.US,
                "PrefetchCount, '%s', has to be below %s", prefetchCount, MAXIMUM_PREFETCH_COUNT));
        }

        this.prefetchCount = prefetchCount;
        return this;
    }

    /**
     * Sets whether or not the {@link EventReceiver#partitionInformation()} is updated when the receiver reads
     * events.
     *
     * @param keepUpdated {@code true} if the partition information should be kept up-to-date as events are received;
     * otherwise, false.
     * @return The updated ReceiverOptions object.
     */
    public ReceiverOptions keepPartitionInformationUpdated(boolean keepUpdated) {
        this.keepUpdated = keepUpdated;
        return this;
    }

    /**
     * Sets the scheduler for receiving events from Event Hubs. If not specified, the scheduler configured with the
     * associated {@link EventHubClient} is used.
     *
     * @param scheduler The scheduler for receiving events.
     * @return The updated EventHubClientBuilder object.
     */
    public ReceiverOptions scheduler(Scheduler scheduler) {
        Objects.requireNonNull(scheduler);
        this.scheduler = scheduler;
        return this;
    }

    /**
     * Gets the optional text-based identifier label to assign to an event receiver.
     * The identifier is used for informational purposes only.  If not specified, the receiver will have no assigned
     * identifier label.
     *
     * @return The identifier of the receiver.
     */
    String identifier() {
        return identifier;
    }

    /**
     * Gets the position within the partition where the receiver should begin reading events.
     *
     * @return The position within the partition where the receiver should begin reading events.
     */
    EventPosition beginReceivingAt() {
        return this.beginReceivingAt;
    }

    /**
     * Gets the name of the consumer group.
     *
     * @return The name of the consumer group.
     */
    String consumerGroup() {
        return consumerGroup;
    }

    /**
     * Gets the retry policy when receiving events. If not specified, the retry policy configured on the associated
     * {@link EventHubClient} is used.
     *
     * @return The retry policy when receiving events.
     */
    RetryPolicy retryPolicy() {
        return retryPolicy;
    }

    /**
     * Gets the epoch for this receiver. If {@link Optional#isPresent()} is {@code false}, then this is not an epoch
     * receiver. Otherwise, it is and there can only be one receiver per (partition + consumer group) combination.
     *
     * @return An optional epoch for this receiver.
     */
    Optional<Long> epoch() {
        return Optional.ofNullable(epoch);
    }

    /**
     * Gets whether or not the {@link EventReceiver#partitionInformation()} is updated when the receiver reads
     * events.
     *
     * @return {@code true} if the partition information should be kept up-to-date as events are received; otherwise,
     * false.
     */
    boolean keepPartitionInformationUpdated() {
        return this.keepUpdated;
    }

    /**
     * Gets the timeout to apply when receiving events. If not specified, the timeout configured with the associated
     * {@link EventHubClient} is used.
     *
     * @return The timeout when receiving events.
     */
    Duration receiveTimeout() {
        return this.receiveTimeout;
    }

    /**
     * Gets the scheduler for receiving events from Event Hubs. If not specified, the scheduler configured with the
     * associated {@link EventHubClient} is used.
     *
     * @return The scheduler for receiving events.
     */
    Scheduler scheduler() {
        return scheduler;
    }

    /**
     * Gets the count used by the receiver to control the number of events this receiver will actively receive and queue
     * locally without regard to whether a receive operation is currently active.
     *
     * @return The prefetch count receiver will receive and queue locally regardless of whether or not a receive
     * operation is active.
     */
    int prefetchCount() {
        return prefetchCount;
    }

    private void validateIdentifier(String identifier) {
        if (ImplUtils.isNullOrEmpty(identifier) && identifier.length() > MAXIMUM_IDENTIFIER_LENGTH) {
            throw new IllegalArgumentException(String.format(Locale.US,
                "identifier length cannot exceed %s", MAXIMUM_IDENTIFIER_LENGTH));
        }
    }
}
