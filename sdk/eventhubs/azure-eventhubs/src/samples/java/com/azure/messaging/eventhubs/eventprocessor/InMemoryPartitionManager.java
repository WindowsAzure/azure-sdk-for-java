// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs.eventprocessor;

import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.eventhubs.PartitionManager;
import com.azure.messaging.eventhubs.eventprocessor.models.Checkpoint;
import com.azure.messaging.eventhubs.eventprocessor.models.PartitionOwnership;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * A simple in-memory implementation of a {@link PartitionManager}.
 */
public class InMemoryPartitionManager implements PartitionManager {

    private static final long OWNERSHIP_EXPIRATION_TIME_IN_MILLIS = 30000; // 30 seconds
    private final Map<String, PartitionOwnership> partitionOwnershipMap = new ConcurrentHashMap<>();
    private final ClientLogger logger = new ClientLogger(InMemoryPartitionManager.class);

    @Override
    public Flux<PartitionOwnership> listOwnership(String eventHubName, String consumerGroupName) {
        logger.info("Listing partition ownership");
        return Flux.fromIterable(partitionOwnershipMap.values());
    }

    @Override
    public Flux<PartitionOwnership> claimOwnership(
        List<PartitionOwnership> requestedPartitionOwnerships) {

        return Flux.fromIterable(requestedPartitionOwnerships)
            .doOnNext(partitionOwnership -> logger
                .info("Is this partition {} already owned? {} ", partitionOwnership.partitionId(), partitionOwnershipMap
                    .containsKey(partitionOwnership.partitionId())))
            .filter(partitionOwnership -> {
                return !partitionOwnershipMap.containsKey(partitionOwnership.partitionId())
                    || partitionOwnershipMap.get(partitionOwnership.partitionId()).eTag().equals(partitionOwnership.eTag());
            })
            .doOnNext(partitionOwnership -> logger
                .info("Ownership of partition {} claimed by {}", partitionOwnership.partitionId(),
                    partitionOwnership.instanceId()))
            .map(partitionOwnership -> {
                partitionOwnership.eTag(UUID.randomUUID().toString()); // set new etag
                partitionOwnership.lastModifiedTime(System.currentTimeMillis());
                partitionOwnershipMap.put(partitionOwnership.partitionId(), partitionOwnership);
                return partitionOwnership;
            });
    }

    @Override
    public Mono<String> updateCheckpoint(Checkpoint checkpoint) {
        String updatedETag = UUID.randomUUID().toString();
        partitionOwnershipMap.get(checkpoint.partitionId())
            .sequenceNumber(checkpoint.sequenceNumber())
            .offset(checkpoint.offset())
            .eTag(updatedETag);
        logger.info("Updated checkpoint for partition {} with sequence number {}", checkpoint.partitionId(),
            checkpoint.sequenceNumber());
        return Mono.just(updatedETag);
    }
}
