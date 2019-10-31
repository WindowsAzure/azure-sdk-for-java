// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import static com.azure.core.util.tracing.Tracer.DIAGNOSTIC_ID_KEY;
import static com.azure.core.util.tracing.Tracer.SCOPE_KEY;
import static com.azure.core.util.tracing.Tracer.SPAN_CONTEXT_KEY;

import com.azure.core.amqp.exception.AmqpException;
import com.azure.core.amqp.implementation.TracerProvider;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.eventhubs.models.CloseContext;
import com.azure.messaging.eventhubs.models.CloseReason;
import com.azure.messaging.eventhubs.EventData;
import com.azure.messaging.eventhubs.EventHubClientBuilder;
import com.azure.core.util.tracing.ProcessKind;
import com.azure.messaging.eventhubs.EventHubConsumerAsyncClient;
import com.azure.messaging.eventhubs.EventHubConsumerClient;
import com.azure.messaging.eventhubs.EventProcessor;
import com.azure.messaging.eventhubs.EventProcessorStore;
import com.azure.messaging.eventhubs.models.EventProcessingErrorContext;
import com.azure.messaging.eventhubs.models.InitializationContext;
import com.azure.messaging.eventhubs.models.PartitionEvent;
import com.azure.messaging.eventhubs.PartitionProcessor;
import com.azure.messaging.eventhubs.models.EventHubConsumerOptions;
import com.azure.messaging.eventhubs.models.EventPosition;
import com.azure.messaging.eventhubs.models.PartitionContext;
import com.azure.messaging.eventhubs.models.PartitionOwnership;
import reactor.core.publisher.Signal;

import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/**
 * The partition pump manager that keeps track of all the partition pumps started by this {@link EventProcessor}. Each
 * partition pump is an {@link EventHubConsumerClient} that is receiving events from partitions this
 * {@link EventProcessor} has claimed ownership of.
 *
 * <p>
 * New partition pumps are created when this {@link EventProcessor} claims ownership of a new partition. When the {@link
 * EventProcessor} is requested to stop, this class is responsible for stopping all event processing tasks and closing
 * all connections to the Event Hub.
 * </p>
 */
class PartitionPumpManager {

    private final ClientLogger logger = new ClientLogger(PartitionPumpManager.class);
    private final EventProcessorStore eventProcessorStore;
    private final Map<String, EventHubConsumerAsyncClient> partitionPumps = new ConcurrentHashMap<>();
    private final Supplier<PartitionProcessor> partitionProcessorFactory;
    private final EventPosition initialEventPosition;
    private final EventHubClientBuilder eventHubClientBuilder;
    private final TracerProvider tracerProvider;

    /**
     * Creates an instance of partition pump manager.
     *
     * @param eventProcessorStore The partition manager that is used to store and update checkpoints.
     * @param partitionProcessorFactory The partition processor factory that is used to create new instances of {@link
     * PartitionProcessor} when new partition pumps are started.
     * @param initialEventPosition The initial event position to use when a new partition pump is created and no
     * checkpoint for the partition is available.
     * @param eventHubClientBuilder The client builder used to create new clients (and new connections) for each
     * partition processed by this {@link EventProcessor}.
     */
    PartitionPumpManager(EventProcessorStore eventProcessorStore,
        Supplier<PartitionProcessor> partitionProcessorFactory,
        EventPosition initialEventPosition, EventHubClientBuilder eventHubClientBuilder,
        TracerProvider tracerProvider) {
        this.eventProcessorStore = eventProcessorStore;
        this.partitionProcessorFactory = partitionProcessorFactory;
        this.initialEventPosition = initialEventPosition;
        this.eventHubClientBuilder = eventHubClientBuilder;
        this.tracerProvider = tracerProvider;
    }

    /**
     * Stops all partition pumps that are actively consuming events. This method is invoked when the {@link
     * EventProcessor} is requested to stop.
     */
    void stopAllPartitionPumps() {
        this.partitionPumps.forEach((partitionId, eventHubConsumer) -> {
            try {
                eventHubConsumer.close();
            } catch (Exception ex) {
                logger.warning("Failed to close consumer for partition {}", partitionId, ex);
            } finally {
                partitionPumps.remove(partitionId);
            }
        });
    }

    /**
     * Starts a new partition pump for the newly claimed partition. If the partition already has an active partition
     * pump, this will not create a new consumer.
     *
     * @param claimedOwnership The details of partition ownership for which new partition pump is requested to start.
     */
    void startPartitionPump(PartitionOwnership claimedOwnership) {
        if (partitionPumps.containsKey(claimedOwnership.getPartitionId())) {
            logger.info("Consumer is already running for this partition  {}", claimedOwnership.getPartitionId());
            return;
        }

        PartitionContext partitionContext = new PartitionContext(claimedOwnership.getPartitionId(),
            claimedOwnership.getEventHubName(), claimedOwnership.getConsumerGroupName(),
            claimedOwnership.getOwnerId(), claimedOwnership.getETag(), eventProcessorStore);
        PartitionProcessor partitionProcessor = this.partitionProcessorFactory.get();

        InitializationContext initializationContext = new InitializationContext(partitionContext,
            EventPosition.earliest());
        partitionProcessor.initialize(initializationContext);

        EventPosition startFromEventPosition;
        if (claimedOwnership.getOffset() != null) {
            startFromEventPosition = EventPosition.fromOffset(claimedOwnership.getOffset());
        } else if (claimedOwnership.getSequenceNumber() != null) {
            startFromEventPosition = EventPosition.fromSequenceNumber(claimedOwnership.getSequenceNumber());
        } else {
            startFromEventPosition = initialEventPosition;
        }

        EventHubConsumerOptions eventHubConsumerOptions = new EventHubConsumerOptions().setOwnerLevel(0L);
        EventHubConsumerAsyncClient eventHubConsumer = eventHubClientBuilder.buildAsyncClient()
            .createConsumer(claimedOwnership.getConsumerGroupName(), startFromEventPosition, eventHubConsumerOptions);

        partitionPumps.put(claimedOwnership.getPartitionId(), eventHubConsumer);
        eventHubConsumer.receive(claimedOwnership.getPartitionId()).subscribe(partitionEvent -> {
            EventData eventData = partitionEvent.getEventData();
            try {
                Context processSpanContext = startProcessTracingSpan(eventData);
                if (processSpanContext.getData(SPAN_CONTEXT_KEY).isPresent()) {
                    eventData.addContext(SPAN_CONTEXT_KEY, processSpanContext);
                }
                partitionProcessor.processEvent(new PartitionEvent(partitionContext, eventData)).doOnEach(signal ->
                    endProcessTracingSpan(processSpanContext, signal)).subscribe(unused -> {
                    }, /* event processing returned error */ ex -> handleProcessingError(claimedOwnership,
                    eventHubConsumer, partitionProcessor, ex, partitionContext));
            } catch (Exception ex) {
                /* event processing threw an exception */
                handleProcessingError(claimedOwnership, eventHubConsumer, partitionProcessor, ex, partitionContext);
            }
        }, /* EventHubConsumer receive() returned an error */
            ex -> handleReceiveError(claimedOwnership, eventHubConsumer, partitionProcessor, ex, partitionContext),
            () -> partitionProcessor.close(new CloseContext(partitionContext, CloseReason.EVENT_PROCESSOR_SHUTDOWN)));
    }

    private void handleProcessingError(PartitionOwnership claimedOwnership,
            EventHubConsumerAsyncClient eventHubConsumer, PartitionProcessor partitionProcessor, Throwable error,
            PartitionContext partitionContext) {
        try {
            // There was an error in process event (user provided code), call process error and if that
            // also fails just log and continue
            partitionProcessor.processError(new EventProcessingErrorContext(partitionContext, error));
        } catch (Exception ex) {
            logger.warning("Failed while processing error {}", claimedOwnership.getPartitionId(), ex);
        }
    }

    private void handleReceiveError(PartitionOwnership claimedOwnership, EventHubConsumerAsyncClient eventHubConsumer,
        PartitionProcessor partitionProcessor, Throwable error, PartitionContext partitionContext) {
        try {
            // if there was an error on receive, it also marks the end of the event data stream
            partitionProcessor.processError(new EventProcessingErrorContext(partitionContext, error));
            CloseReason closeReason = CloseReason.EVENT_HUB_EXCEPTION;
            // If the exception indicates that the partition was stolen (i.e some other consumer with same ownerlevel
            // started consuming the partition), update the closeReason
            // TODO: Find right exception type to determine stolen partition
            if (error instanceof AmqpException) {
                closeReason = CloseReason.LOST_PARTITION_OWNERSHIP;
            }
            partitionProcessor.close(new CloseContext(partitionContext, closeReason));
        } catch (Exception ex) {
            logger.warning("Failed while processing error on receive {}", claimedOwnership.getPartitionId(), ex);
        } finally {
            try {
                // close the consumer
                eventHubConsumer.close();
            } finally {
                // finally, remove the partition from partitionPumps map
                partitionPumps.remove(claimedOwnership.getPartitionId());
            }
        }
    }

    /*
     * Starts a new process tracing span and attached context the EventData object for users.
     */
    private Context startProcessTracingSpan(EventData eventData) {
        Object diagnosticId = eventData.getProperties().get(DIAGNOSTIC_ID_KEY);
        if (diagnosticId == null || !tracerProvider.isEnabled()) {
            return Context.NONE;
        }
        Context spanContext = tracerProvider.extractContext(diagnosticId.toString(), Context.NONE);
        return tracerProvider.startSpan(spanContext, ProcessKind.PROCESS);
    }

    /*
     * Ends the process tracing span and the scope of that span.
     */
    private void endProcessTracingSpan(Context processSpanContext, Signal<Void> signal) {
        Optional<Object> spanScope = processSpanContext.getData(SCOPE_KEY);
        // Disposes of the scope when the trace span closes.
        if (!spanScope.isPresent() || !tracerProvider.isEnabled()) {
            return;
        }
        if (spanScope.get() instanceof Closeable) {
            Closeable close = (Closeable) processSpanContext.getData(SCOPE_KEY).get();
            try {
                close.close();
                tracerProvider.endSpan(processSpanContext, signal);
            } catch (IOException ioException) {
                logger.error("EventProcessor.run() endTracingSpan().close() failed with an error %s", ioException);
            }

        } else {
            logger.warning(String.format(Locale.US,
                "Process span scope type is not of type Closeable, but type: %s. Not closing the scope and span",
                spanScope.get() != null ? spanScope.getClass() : "null"));
        }
    }
}
