// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.amqp.implementation.TracerProvider;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.eventhubs.implementation.PartitionProcessor;
import com.azure.messaging.eventhubs.models.EventContext;
import com.azure.messaging.eventhubs.models.EventPosition;
import com.azure.messaging.eventhubs.models.ErrorContext;
import com.azure.messaging.eventhubs.models.PartitionContext;
import com.azure.messaging.eventhubs.models.PartitionEvent;
import com.azure.messaging.eventhubs.models.PartitionOwnership;
import com.azure.messaging.eventhubs.models.ReceiveOptions;
import java.util.HashMap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Unit tests for {@link PartitionBasedLoadBalancer}.
 */
public class PartitionBasedLoadBalancerTest {

    private final String fqNamespace = "fq-namespace";
    private final String eventHubName = "test-event-hub";
    private final String consumerGroupName = "test-consumer-group";
    private final ClientLogger logger = new ClientLogger(PartitionBasedLoadBalancerTest.class);

    private List<EventData> eventDataList;
    private CheckpointStore checkpointStore;

    @Mock
    private EventHubClientBuilder eventHubClientBuilder;

    @Mock
    private EventHubAsyncClient eventHubAsyncClient;

    @Mock
    private EventHubConsumerAsyncClient eventHubConsumer;

    @Mock
    private PartitionProcessor partitionProcessor;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);

        final Date enqueuedTime = Date.from(Instant.now());
        final byte[] contents = "Hello, world".getBytes(StandardCharsets.UTF_8);
        eventDataList = new ArrayList<>();
        IntStream.range(0, 25)
            .forEach(index -> {
                final EventData eventData = TestUtils.getEventData(contents, (long) index, (long) index, enqueuedTime);
                eventDataList.add(eventData);
            });
        when(eventHubClientBuilder.buildAsyncClient()).thenReturn(eventHubAsyncClient);
        this.checkpointStore = new InMemoryCheckpointStore();
    }

    @AfterEach
    public void teardown() {
        // Tear down any inline mocks to avoid memory leaks.
        // https://github.com/mockito/mockito/wiki/What's-new-in-Mockito-2#mockito-2250
        this.checkpointStore = null;
        Mockito.framework().clearInlineMocks();
        Mockito.reset(eventHubClientBuilder, eventHubAsyncClient, eventHubConsumer, partitionProcessor);
    }

    @Test
    public void testSingleEventProcessor() {
        System.out.println("Running testSingleEventProcessor");
        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        when(eventHubAsyncClient.createConsumer(anyString(), anyInt())).thenReturn(eventHubConsumer);

        when(eventHubConsumer.receiveFromPartition(any(), any(), any(ReceiveOptions.class)))
            .thenReturn(Flux.interval(Duration.ofSeconds(1)).map(index -> {
                final PartitionContext partitionContext = new PartitionContext("ns", "foo", "bar", "bazz");
                int i = index.intValue() % eventDataList.size();
                return new PartitionEvent(partitionContext, eventDataList.get(i), null);
            }));

        PartitionBasedLoadBalancer partitionBasedLoadBalancer = createPartitionLoadBalancer("owner1");

        IntStream.range(0, partitionIds.size()).forEach(index -> {
            partitionBasedLoadBalancer.loadBalance();
            List<PartitionOwnership> partitionOwnership = checkpointStore.listOwnership(fqNamespace, eventHubName,
                consumerGroupName).collectList().block();

            assertNotNull(partitionOwnership);
            assertEquals(index + 1, partitionOwnership.size());
            partitionOwnership.forEach(po -> assertEquals("owner1", partitionOwnership.get(0).getOwnerId()));
            assertEquals(index + 1, partitionOwnership.stream().map(po -> po.getPartitionId()).distinct().count());
        });
    }

    private void sleep(int secondsToSleep) {
        try {
            TimeUnit.SECONDS.sleep(secondsToSleep);
        } catch (InterruptedException ignored) {

        }
    }

    @Test
    public void testTwoEventProcessors() {
        System.out.println("Running testTwoEventProcessors");

        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        when(eventHubAsyncClient.createConsumer(anyString(), anyInt())).thenReturn(eventHubConsumer);
        when(eventHubConsumer.receiveFromPartition(anyString(), any(EventPosition.class), any(ReceiveOptions.class)))
            .thenReturn(Flux.interval(Duration.ofSeconds(1)).map(index -> {
                final PartitionContext partitionContext = new PartitionContext("ns", "foo", "bar", "bazz");
                int i = index.intValue() % eventDataList.size();
                return new PartitionEvent(partitionContext, eventDataList.get(i), null);
            }));

        PartitionBasedLoadBalancer partitionBasedLoadBalancer1 = createPartitionLoadBalancer("owner1");
        PartitionBasedLoadBalancer partitionBasedLoadBalancer2 = createPartitionLoadBalancer("owner2");

        IntStream.range(0, partitionIds.size()).forEach(index -> {
            partitionBasedLoadBalancer1.loadBalance();
            partitionBasedLoadBalancer2.loadBalance();
            List<PartitionOwnership> partitionOwnership = checkpointStore.listOwnership(fqNamespace, eventHubName,
                consumerGroupName).collectList().block();
            assertTrue(partitionOwnership.size() <= 3);
            assertEquals(2, partitionOwnership.stream().map(po -> po.getOwnerId()).distinct().count());
        });

        List<PartitionOwnership> partitionOwnership = checkpointStore.listOwnership(fqNamespace, eventHubName,
            consumerGroupName).collectList().block();
        // because owner1 runs first, it will have the chance to claim one additional partition
        assertEquals(2, partitionOwnership.stream().filter(po -> "owner1".equals(po.getOwnerId())).count());
        // after owner1 has 2 partitions and owner2 has 1 partition, owner2 runs again but this time the load
        // is balanced and owner2 should not claim any additional partition
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner2".equals(po.getOwnerId())).count());
    }

    @Test
    public void testPartitionStealing() {
        System.out.println("Running testPartitionStealing");

        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        when(eventHubAsyncClient.createConsumer(anyString(), anyInt())).thenReturn(eventHubConsumer);

        when(eventHubConsumer.receiveFromPartition(anyString(), any(EventPosition.class), any(ReceiveOptions.class)))
            .thenReturn(Flux.interval(Duration.ofSeconds(1)).map(index -> {
                final PartitionContext partitionContext = new PartitionContext("ns", "foo", "bar", "bazz");
                int i = index.intValue() % eventDataList.size();
                return new PartitionEvent(partitionContext, eventDataList.get(i), null);
            }));

        PartitionBasedLoadBalancer partitionBasedLoadBalancer1 = createPartitionLoadBalancer("owner1");

        // First event processor claims all partitions
        IntStream.range(0, partitionIds.size()).forEach(index -> {
            partitionBasedLoadBalancer1.loadBalance();
            List<PartitionOwnership> partitionOwnership = checkpointStore.listOwnership(fqNamespace, eventHubName,
                consumerGroupName).collectList().block();
            assertEquals(index + 1, partitionOwnership.size());
            partitionOwnership.forEach(po -> assertEquals("owner1", partitionOwnership.get(0).getOwnerId()));
            assertEquals(index + 1,
                partitionOwnership.stream().map(PartitionOwnership::getPartitionId).distinct().count());
        });

        // Now, second event processor comes online and steals a partition as the number of partitions
        // are not evenly distributed
        PartitionBasedLoadBalancer partitionBasedLoadBalancer2 = createPartitionLoadBalancer("owner2");
        partitionBasedLoadBalancer2.loadBalance();
        List<PartitionOwnership> partitionOwnership = checkpointStore.listOwnership(fqNamespace, eventHubName,
            consumerGroupName).collectList().block();
        assertEquals(3, partitionOwnership.size());
        assertEquals(2, partitionOwnership.stream().map(PartitionOwnership::getOwnerId).distinct().count());
        assertEquals(2, partitionOwnership.stream().filter(po -> po.getOwnerId().equals("owner1")).count());
        assertEquals(1, partitionOwnership.stream().filter(po -> po.getOwnerId().equals("owner2")).count());
    }

    @Test
    public void testMoreEventProcessorsThanPartitions() {
        System.out.println("Running testMoreEventProcessorsThanPartitions");

        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        when(eventHubAsyncClient.createConsumer(anyString(), anyInt())).thenReturn(eventHubConsumer);

        when(eventHubConsumer.receiveFromPartition(anyString(), any(EventPosition.class), any(ReceiveOptions.class)))
            .thenReturn(Flux.interval(Duration.ofSeconds(1)).map(index -> {
                final PartitionContext partitionContext = new PartitionContext("ns", "foo", "bar", "bazz");
                int i = index.intValue() % eventDataList.size();
                return new PartitionEvent(partitionContext, eventDataList.get(i), null);
            }));

        List<PartitionBasedLoadBalancer> loadBalancers = new ArrayList<>();
        IntStream.range(0, 4).forEach(index -> loadBalancers.add(createPartitionLoadBalancer("owner" + index)));

        IntStream.range(0, partitionIds.size()).forEach(index -> {
            loadBalancers.forEach(lb -> lb.loadBalance());
            List<PartitionOwnership> partitionOwnership = checkpointStore.listOwnership(fqNamespace, eventHubName,
                consumerGroupName).collectList().block();
            assertTrue(partitionOwnership.size() <= 3);
            assertEquals(3, partitionOwnership.stream().map(po -> po.getOwnerId()).distinct().count());
        });

        List<PartitionOwnership> partitionOwnership = checkpointStore.listOwnership(fqNamespace, eventHubName,
            consumerGroupName).collectList().block();

        assertEquals(3, partitionOwnership.stream().map(po -> po.getOwnerId()).distinct().count());

        // each should have 1 partition
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner0".equals(po.getOwnerId())).count());
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner1".equals(po.getOwnerId())).count());
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner2".equals(po.getOwnerId())).count());
        // owner4 should not be in the list
        assertTrue(partitionOwnership.stream().noneMatch(po -> po.getOwnerId().equals("owner4")));
    }

    @Test
    public void testEventProcessorInactive() {
        System.out.println("Running testEventProcessorInactive");

        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        when(eventHubAsyncClient.createConsumer(anyString(), anyInt())).thenReturn(eventHubConsumer);
        when(eventHubConsumer.receiveFromPartition(anyString(), any(EventPosition.class), any(ReceiveOptions.class)))
            .thenReturn(Flux.interval(Duration.ofSeconds(1)).map(index -> {
                final PartitionContext partitionContext = new PartitionContext("ns", "foo", "bar", "bazz");
                final int i = index.intValue() % eventDataList.size();
                return new PartitionEvent(partitionContext, eventDataList.get(i), null);
            }));

        List<PartitionBasedLoadBalancer> loadBalancers = new ArrayList<>();
        IntStream.range(0, 4).forEach(index -> loadBalancers.add(createPartitionLoadBalancer("owner" + index)));

        IntStream.range(0, partitionIds.size()).forEach(index -> {
            loadBalancers.forEach(lb -> lb.loadBalance());

            List<PartitionOwnership> partitionOwnership = checkpointStore.listOwnership(fqNamespace, eventHubName,
                consumerGroupName).collectList().block();
            assertTrue(partitionOwnership.size() <= 3);
            assertEquals(3, partitionOwnership.stream().map(po -> po.getOwnerId()).distinct().count());
        });

        List<PartitionOwnership> partitionOwnership = checkpointStore.listOwnership(fqNamespace, eventHubName,
            consumerGroupName).collectList().block();

        assertEquals(3, partitionOwnership.stream().map(po -> po.getOwnerId()).distinct().count());

        // each should have 1 partition
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner0".equals(po.getOwnerId())).count());
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner1".equals(po.getOwnerId())).count());
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner2".equals(po.getOwnerId())).count());
        // owner4 should not be in the list
        assertTrue(partitionOwnership.stream().noneMatch(po -> po.getOwnerId().equals("owner4")));

        sleep(10);
        IntStream.range(0, loadBalancers.size()).forEach(index -> {
            if (index != 1) {
                // run all but 2nd load balancer
                loadBalancers.get(index).loadBalance();
            }
        });

        sleep(10);
        partitionOwnership = checkpointStore.listOwnership(fqNamespace, eventHubName,
            consumerGroupName).collectList().block();

        assertEquals(3, partitionOwnership.stream().map(PartitionOwnership::getOwnerId).distinct().count());

        // each should have 1 partition
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner0".equals(po.getOwnerId())).count());
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner2".equals(po.getOwnerId())).count());
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner3".equals(po.getOwnerId())).count());
        // owner2 should not be in the list as it was stopped
        assertTrue(partitionOwnership.stream().noneMatch(po -> "owner1".equals(po.getOwnerId())));
    }

    @Test
    public void testReceiveFailure() {
        System.out.println("Running testReceiveFailure");

        TracerProvider tracerProvider = new TracerProvider(Collections.emptyList());

        doThrow(new IllegalStateException()).when(partitionProcessor).processEvent(any(EventContext.class));
        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        when(eventHubAsyncClient.createConsumer(anyString(), anyInt())).thenReturn(eventHubConsumer);
        when(eventHubConsumer.receiveFromPartition(anyString(), any(EventPosition.class), any(ReceiveOptions.class)))
            .thenReturn(Flux.error(new IllegalStateException()));

        PartitionPumpManager partitionPumpManager = new PartitionPumpManager(checkpointStore,
            () -> partitionProcessor, eventHubClientBuilder, false, tracerProvider, new HashMap<>());
        PartitionBasedLoadBalancer loadBalancer = new PartitionBasedLoadBalancer(checkpointStore,
            eventHubAsyncClient, fqNamespace, eventHubName, consumerGroupName, "owner", TimeUnit.SECONDS.toSeconds(5),
            partitionPumpManager, ec -> {
        });
        loadBalancer.loadBalance();
        sleep(2);
        verify(partitionProcessor, never()).processEvent(any(EventContext.class));
        verify(partitionProcessor, times(1)).processError(any(ErrorContext.class));
        verify(eventHubConsumer, times(1)).close();
    }

    @Test
    public void testCheckpointStoreFailure() {
        System.out.println("Running testCheckpointStoreFailure");

        TracerProvider tracerProvider = new TracerProvider(Collections.emptyList());
        CheckpointStore checkpointStore = mock(CheckpointStore.class);
        when(checkpointStore.listOwnership(any(), any(), any())).thenReturn(Flux.error(new Exception("Listing "
            + "failed")));
        doThrow(new IllegalStateException()).when(partitionProcessor).processEvent(any(EventContext.class));
        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        PartitionPumpManager partitionPumpManager = new PartitionPumpManager(checkpointStore,
            () -> partitionProcessor, eventHubClientBuilder, false, tracerProvider, new HashMap<>());
        PartitionBasedLoadBalancer loadBalancer = new PartitionBasedLoadBalancer(checkpointStore,
            eventHubAsyncClient, fqNamespace, eventHubName, consumerGroupName, "owner", TimeUnit.SECONDS.toSeconds(5),
            partitionPumpManager, ec -> {
        });
        loadBalancer.loadBalance();
        sleep(5);
        verify(eventHubAsyncClient, atLeast(1)).getPartitionIds();
        verify(eventHubAsyncClient, never()).createConsumer(anyString(), anyInt());
        verify(eventHubConsumer, never())
            .receiveFromPartition(anyString(), any(EventPosition.class), any(ReceiveOptions.class));
        verify(partitionProcessor, never()).processEvent(any(EventContext.class));
        verify(partitionProcessor, never()).processError(any(ErrorContext.class));
        verify(eventHubConsumer, never()).close();
    }

    @Test
    public void testEventHubClientFailure() {
        System.out.println("Running testEventHubClientFailure");

        TracerProvider tracerProvider = new TracerProvider(Collections.emptyList());
        doThrow(new IllegalStateException()).when(partitionProcessor).processEvent(any(EventContext.class));
        List<String> partitionIds = new ArrayList<>();
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        PartitionPumpManager partitionPumpManager = new PartitionPumpManager(checkpointStore,
            () -> partitionProcessor, eventHubClientBuilder, false, tracerProvider, new HashMap<>());
        PartitionBasedLoadBalancer loadBalancer = new PartitionBasedLoadBalancer(checkpointStore,
            eventHubAsyncClient, fqNamespace, eventHubName, consumerGroupName, "owner", TimeUnit.SECONDS.toSeconds(5),
            partitionPumpManager, ec -> {
        });
        loadBalancer.loadBalance();
        sleep(2);
        verify(eventHubAsyncClient, atLeast(1)).getPartitionIds();
        verify(eventHubAsyncClient, never()).createConsumer(anyString(), anyInt());
        verify(eventHubConsumer, never())
            .receiveFromPartition(anyString(), any(EventPosition.class), any(ReceiveOptions.class));
        verify(partitionProcessor, never()).processEvent(any(EventContext.class));
        verify(partitionProcessor, never()).processError(any(ErrorContext.class));
        verify(eventHubConsumer, never()).close();
    }

    @Test
    public void testEmptyOwnerId() {
        System.out.println("Running testEmptyOwnerId");

        // null owner id
        PartitionOwnership claim1 = new PartitionOwnership()
            .setEventHubName(eventHubName)
            .setConsumerGroup(consumerGroupName)
            .setPartitionId("1")
            .setETag(UUID.randomUUID().toString())
            .setLastModifiedTime(System.currentTimeMillis());
        // owner id is an empty string
        PartitionOwnership claim2 = new PartitionOwnership()
            .setEventHubName(eventHubName)
            .setConsumerGroup(consumerGroupName)
            .setPartitionId("2")
            .setETag(UUID.randomUUID().toString())
            .setLastModifiedTime(System.currentTimeMillis())
            .setOwnerId("");
        checkpointStore.claimOwnership(Arrays.asList(claim1, claim2)).subscribe();

        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        when(eventHubAsyncClient.createConsumer(anyString(), anyInt())).thenReturn(eventHubConsumer);
        when(eventHubConsumer.receiveFromPartition(anyString(), any(EventPosition.class), any(ReceiveOptions.class)))
            .thenReturn(Flux.interval(Duration.ofSeconds(1)).map(index -> {
                final PartitionContext partitionContext = new PartitionContext("ns", "foo", "bar", "bazz");
                final int i = index.intValue() % eventDataList.size();
                return new PartitionEvent(partitionContext, eventDataList.get(i), null);
            }));

        String ownerName = "owner1";
        PartitionBasedLoadBalancer partitionBasedLoadBalancer = createPartitionLoadBalancer(ownerName);

        IntStream.range(0, partitionIds.size()).forEach(index -> {
            partitionBasedLoadBalancer.loadBalance();
        });

        final Set<String> allPartitionIds = new HashSet<>(partitionIds);

        // Act & Assert
        StepVerifier.create(checkpointStore.listOwnership(fqNamespace, eventHubName, consumerGroupName))
            .assertNext(po -> {
                assertEquals(ownerName, po.getOwnerId());
                assertTrue(allPartitionIds.remove(po.getPartitionId()));
            })
            .assertNext(po -> {
                assertEquals(ownerName, po.getOwnerId());
                assertTrue(allPartitionIds.remove(po.getPartitionId()));
            })
            .assertNext(po -> {
                assertEquals(ownerName, po.getOwnerId());
                assertTrue(allPartitionIds.remove(po.getPartitionId()));
            })
            .expectComplete()
            .verify(Duration.ofSeconds(10));

        assertTrue(allPartitionIds.isEmpty(), "Expected it to claim all partitions.");
    }

    private PartitionBasedLoadBalancer createPartitionLoadBalancer(String owner) {
        TracerProvider tracerProvider = new TracerProvider(Collections.emptyList());
        PartitionPumpManager partitionPumpManager = new PartitionPumpManager(checkpointStore,
            () -> new PartitionProcessor() {
                @Override
                public void processEvent(EventContext eventContext) {
                    logger.info(
                        "Processing event: Event Hub name = {}; consumer group name = {}; partition id = {}; sequence number = {}",
                        eventContext.getPartitionContext().getEventHubName(),
                        eventContext.getPartitionContext().getConsumerGroup(),
                        eventContext.getPartitionContext().getPartitionId(),
                        eventContext.getEventData().getSequenceNumber());
                    eventContext.updateCheckpoint();
                }

                @Override
                public void processError(ErrorContext eventProcessingErrorContext) {
                    logger.warning("Error occurred in partition processor for partition {}",
                        eventProcessingErrorContext.getPartitionContext().getPartitionId(),
                        eventProcessingErrorContext.getThrowable());
                }
            }, eventHubClientBuilder, false, tracerProvider, new HashMap<>());
        return new PartitionBasedLoadBalancer(checkpointStore, eventHubAsyncClient, fqNamespace,
            eventHubName, consumerGroupName, owner, TimeUnit.SECONDS.toSeconds(5), partitionPumpManager,
            ec -> { });
    }
}
