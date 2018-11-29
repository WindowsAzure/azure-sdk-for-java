/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Represents the base for all Replica Events.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ReplicaEvent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "StatefulReplicaHealthReportCreated", value = StatefulReplicaHealthReportCreatedEvent.class),
    @JsonSubTypes.Type(name = "StatefulReplicaHealthReportExpired", value = StatefulReplicaHealthReportExpiredEvent.class),
    @JsonSubTypes.Type(name = "StatelessReplicaHealthReportCreated", value = StatelessReplicaHealthReportCreatedEvent.class),
    @JsonSubTypes.Type(name = "StatelessReplicaHealthReportExpired", value = StatelessReplicaHealthReportExpiredEvent.class),
    @JsonSubTypes.Type(name = "ChaosRemoveReplicaFaultScheduled", value = ChaosRemoveReplicaFaultScheduledEvent.class),
    @JsonSubTypes.Type(name = "ChaosRemoveReplicaFaultCompleted", value = ChaosRemoveReplicaFaultCompletedEvent.class),
    @JsonSubTypes.Type(name = "ChaosRestartReplicaFaultScheduled", value = ChaosRestartReplicaFaultScheduledEvent.class)
})
public class ReplicaEventInner extends FabricEventInner {
    /**
     * An internal ID used by Service Fabric to uniquely identify a partition.
     * This is a randomly generated GUID when the service was created. The
     * partition ID is unique and does not change for the lifetime of the
     * service. If the same service was deleted and recreated the IDs of its
     * partitions would be different.
     */
    @JsonProperty(value = "PartitionId", required = true)
    private UUID partitionId;

    /**
     * Id of a stateful service replica. ReplicaId is used by Service Fabric to
     * uniquely identify a replica of a partition. It is unique within a
     * partition and does not change for the lifetime of the replica. If a
     * replica gets dropped and another replica gets created on the same node
     * for the same partition, it will get a different value for the id.
     * Sometimes the id of a stateless service instance is also referred as a
     * replica id.
     */
    @JsonProperty(value = "ReplicaId", required = true)
    private long replicaId;

    /**
     * Get an internal ID used by Service Fabric to uniquely identify a partition. This is a randomly generated GUID when the service was created. The partition ID is unique and does not change for the lifetime of the service. If the same service was deleted and recreated the IDs of its partitions would be different.
     *
     * @return the partitionId value
     */
    public UUID partitionId() {
        return this.partitionId;
    }

    /**
     * Set an internal ID used by Service Fabric to uniquely identify a partition. This is a randomly generated GUID when the service was created. The partition ID is unique and does not change for the lifetime of the service. If the same service was deleted and recreated the IDs of its partitions would be different.
     *
     * @param partitionId the partitionId value to set
     * @return the ReplicaEventInner object itself.
     */
    public ReplicaEventInner withPartitionId(UUID partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get id of a stateful service replica. ReplicaId is used by Service Fabric to uniquely identify a replica of a partition. It is unique within a partition and does not change for the lifetime of the replica. If a replica gets dropped and another replica gets created on the same node for the same partition, it will get a different value for the id. Sometimes the id of a stateless service instance is also referred as a replica id.
     *
     * @return the replicaId value
     */
    public long replicaId() {
        return this.replicaId;
    }

    /**
     * Set id of a stateful service replica. ReplicaId is used by Service Fabric to uniquely identify a replica of a partition. It is unique within a partition and does not change for the lifetime of the replica. If a replica gets dropped and another replica gets created on the same node for the same partition, it will get a different value for the id. Sometimes the id of a stateless service instance is also referred as a replica id.
     *
     * @param replicaId the replicaId value to set
     * @return the ReplicaEventInner object itself.
     */
    public ReplicaEventInner withReplicaId(long replicaId) {
        this.replicaId = replicaId;
        return this;
    }

}
