// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.amqp.RetryOptions;
import com.azure.core.amqp.implementation.AmqpReceiveLink;
import com.azure.core.amqp.implementation.ConnectionOptions;
import com.azure.core.amqp.implementation.MessageSerializer;
import com.azure.core.amqp.implementation.StringUtil;
import com.azure.core.amqp.implementation.TracerProvider;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.eventhubs.implementation.EventHubManagementNode;
import com.azure.messaging.eventhubs.models.EventHubConsumerOptions;
import com.azure.messaging.eventhubs.models.EventPosition;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;

import java.io.Closeable;
import java.util.Locale;
import java.util.Objects;

/**
 * An <strong>asynchronous</strong> client that is the main point of interaction with Azure Event Hubs. It connects to a
 * specific Event Hub and allows operations for sending event data, receiving data, and inspecting the Event Hub's
 * metadata.
 *
 * <p>
 * Instantiated through {@link EventHubClientBuilder}.
 * </p>
 *
 * <p><strong>Creating an {@link EventHubConnection} using an Event Hubs namespace connection string</strong></p>
 *
 * {@codesnippet com.azure.messaging.eventhubs.eventhubasyncclient.instantiation#string-string}
 *
 * <p><strong>Creating an {@link EventHubConnection} using an Event Hub instance connection string</strong></p>
 *
 * {@codesnippet com.azure.messaging.eventhubs.eventhubasyncclient.instantiation#string}
 *
 * @see EventHubClientBuilder
 * @see EventHubClient See EventHubClient to communicate with an Event Hub using a synchronous client.
 * @see <a href="https://docs.microsoft.com/Azure/event-hubs/event-hubs-about">About Azure Event Hubs</a>
 */
@ServiceClient(builder = EventHubClientBuilder.class, isAsync = true)
public class EventHubConnection implements Closeable {
    private static final String RECEIVER_ENTITY_PATH_FORMAT = "%s/ConsumerGroups/%s/Partitions/%s";

    private final ClientLogger logger = new ClientLogger(EventHubConnection.class);
    private final MessageSerializer messageSerializer;
    private final EventHubLinkProvider linkProvider;
    private final ConnectionOptions connectionOptions;
    private final String eventHubName;
    private final EventHubConsumerOptions defaultConsumerOptions;
    private final TracerProvider tracerProvider;

    EventHubConnection(ConnectionOptions connectionOptions, TracerProvider tracerProvider,
        MessageSerializer messageSerializer, EventHubLinkProvider linkProvider) {

        this.connectionOptions = Objects.requireNonNull(connectionOptions, "'connectionOptions' cannot be null.");
        this.tracerProvider = Objects.requireNonNull(tracerProvider, "'tracerProvider' cannot be null.");
        this.eventHubName = connectionOptions.getEntityPath();
        this.messageSerializer = Objects.requireNonNull(messageSerializer, "'messageSerializer' cannot be null.");
        this.linkProvider = Objects.requireNonNull(linkProvider, "'linkProvider' cannot be null.");

        this.defaultConsumerOptions = new EventHubConsumerOptions();
    }

    /**
     * Gets the Event Hub name this client interacts with.
     *
     * @return The Event Hub name this client interacts with.
     */
    String getEventHubName() {
        return eventHubName;
    }

    RetryOptions getRetryOptions() {
        return connectionOptions.getRetry();
    }

    Scheduler getScheduler() {
        return connectionOptions.getScheduler();
    }

    /**
     * Retrieves information about an Event Hub, including the number of partitions present and their identifiers.
     *
     * @return The set of information for the Event Hub that this client is associated with.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<EventHubProperties> getProperties() {
        return linkProvider.getManagementNode().flatMap(EventHubManagementNode::getEventHubProperties);
    }

    /**
     * Retrieves the identifiers for the partitions of an Event Hub.
     *
     * @return A Flux of identifiers for the partitions of an Event Hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Flux<String> getPartitionIds() {
        return getProperties().flatMapMany(properties -> Flux.fromArray(properties.getPartitionIds()));
    }

    /**
     * Retrieves information about a specific partition for an Event Hub, including elements that describe the available
     * events in the partition event stream.
     *
     * @param partitionId The unique identifier of a partition associated with the Event Hub.
     * @return The set of information for the requested partition under the Event Hub this client is associated with.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PartitionProperties> getPartitionProperties(String partitionId) {
        return linkProvider.getManagementNode().flatMap(node -> node.getPartitionProperties(partitionId));
    }

    /**
     * Creates an Event Hub producer responsible for transmitting {@link EventData} to the Event Hub, grouped together
     * in batches.
     *
     * @return A new {@link EventHubProducerAsyncClient}.
     */
    EventHubProducerAsyncClient createProducer() {
        return new EventHubProducerAsyncClient(connectionOptions.getHostname(), getEventHubName(), linkProvider,
            connectionOptions.getRetry(), tracerProvider, messageSerializer);
    }

    /**
     * Creates an Event Hub consumer responsible for reading {@link EventData} from a specific Event Hub partition, as a
     * member of the specified consumer group, and begins reading events from the {@code eventPosition}.
     *
     * The consumer created is non-exclusive, allowing multiple consumers from the same consumer group to be actively
     * reading events from the partition. These non-exclusive consumers are sometimes referred to as "Non-epoch
     * Consumers".
     *
     * @param consumerGroup The name of the consumer group this consumer is associated with. Events are read in the
     * context of this group. The name of the consumer group that is created by default is {@link
     * EventHubClientBuilder#DEFAULT_CONSUMER_GROUP_NAME "$Default"}.
     * @param partitionId The identifier of the Event Hub partition.
     * @param eventPosition The position within the partition where the consumer should begin reading events.
     * @return A new {@link EventHubAsyncConsumer} that receives events from the partition at the given position.
     * @throws NullPointerException If {@code eventPosition}, or {@code options} is {@code null}.
     * @throws IllegalArgumentException If {@code consumerGroup} or {@code partitionId} is {@code null} or an empty
     * string.
     */
    EventHubAsyncConsumer createConsumer(String consumerGroup, String partitionId, EventPosition eventPosition) {
        return createConsumer(consumerGroup, partitionId, eventPosition, defaultConsumerOptions);
    }

    /**
     * Creates an Event Hub consumer responsible for reading {@link EventData} from a specific Event Hub partition, as a
     * member of the configured consumer group, and begins reading events from the specified {@code eventPosition}.
     *
     * <p>
     * A consumer may be exclusive, which asserts ownership over the partition for the consumer group to ensure that
     * only one consumer from that group is reading the from the partition. These exclusive consumers are sometimes
     * referred to as "Epoch Consumers."
     *
     * A consumer may also be non-exclusive, allowing multiple consumers from the same consumer group to be actively
     * reading events from the partition. These non-exclusive consumers are sometimes referred to as "Non-epoch
     * Consumers."
     *
     * Designating a consumer as exclusive may be specified in the {@code options}, by setting {@link
     * EventHubConsumerOptions#setOwnerLevel(Long)} to a non-null value. By default, consumers are created as
     * non-exclusive.
     * </p>
     *
     * @param consumerGroup The name of the consumer group this consumer is associated with. Events are read in the
     * context of this group. The name of the consumer group that is created by default is {@link
     * EventHubClientBuilder#DEFAULT_CONSUMER_GROUP_NAME "$Default"}.
     * @param partitionId The identifier of the Event Hub partition from which events will be received.
     * @param eventPosition The position within the partition where the consumer should begin reading events.
     * @param options The set of options to apply when creating the consumer.
     * @return An new {@link EventHubAsyncConsumer} that receives events from the partition with all configured {@link
     * EventHubConsumerOptions}.
     * @throws NullPointerException If {@code eventPosition}, {@code consumerGroup}, {@code partitionId}, or
     * {@code options} is {@code null}.
     * @throws IllegalArgumentException If {@code consumerGroup} or {@code partitionId} is an empty string.
     */
    public EventHubAsyncConsumer createConsumer(String consumerGroup, String partitionId, EventPosition eventPosition,
        EventHubConsumerOptions options) {
        Objects.requireNonNull(eventPosition, "'eventPosition' cannot be null.");
        Objects.requireNonNull(consumerGroup, "'consumerGroup' cannot be null.");
        Objects.requireNonNull(partitionId, "'partitionId' cannot be null.");
        Objects.requireNonNull(options, "'options' cannot be null.");

        if (consumerGroup.isEmpty()) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("'consumerGroup' cannot be an empty string."));
        } else if (partitionId.isEmpty()) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("'partitionId' cannot be an empty string."));
        }

        final EventHubConsumerOptions clonedOptions = options.clone();

        final String linkName = StringUtil.getRandomString("PR");
        final String entityPath =
            String.format(Locale.US, RECEIVER_ENTITY_PATH_FORMAT, eventHubName, consumerGroup, partitionId);

        final Mono<AmqpReceiveLink> receiveLinkMono =
            linkProvider.createReceiveLink(linkName, entityPath, eventPosition, getRetryOptions(), clonedOptions)
                .doOnNext(next -> logger.verbose("Creating consumer for path: {}", next.getEntityPath()));

        return new EventHubAsyncConsumer(receiveLinkMono, messageSerializer, clonedOptions);
    }

    /**
     * Closes and disposes of connection to service. Any {@link EventHubAsyncConsumer EventHubConsumers} and {@link
     * EventHubProducerAsyncClient EventHubProducers} created with this instance will have their connections closed.
     */
    @Override
    public void close() {
        linkProvider.close();
    }
}
