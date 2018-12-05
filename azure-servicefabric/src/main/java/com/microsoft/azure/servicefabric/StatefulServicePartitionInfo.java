/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.ServicePartitionInfoInner;

/**
 * Information about a partition of a stateful Service Fabric service..
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ServiceKind")
@JsonTypeName("Stateful")
public class StatefulServicePartitionInfo extends ServicePartitionInfoInner {
    /**
     * The target replica set size as a number.
     */
    @JsonProperty(value = "TargetReplicaSetSize")
    private Long targetReplicaSetSize;

    /**
     * The minimum replica set size as a number.
     */
    @JsonProperty(value = "MinReplicaSetSize")
    private Long minReplicaSetSize;

    /**
     * The duration for which this partition was in quorum loss. If the
     * partition is currently in quorum loss, it returns the duration since it
     * has been in that state. This field is using ISO8601 format for
     * specifying the duration.
     */
    @JsonProperty(value = "LastQuorumLossDuration")
    private Period lastQuorumLossDuration;

    /**
     * An Epoch is a configuration number for the partition as a whole. When
     * the configuration of the replica set changes, for example when the
     * Primary replica changes, the operations that are replicated from the new
     * Primary replica are said to be a new Epoch from the ones which were sent
     * by the old Primary replica.
     */
    @JsonProperty(value = "PrimaryEpoch")
    private Epoch primaryEpoch;

    /**
     * Get the target replica set size as a number.
     *
     * @return the targetReplicaSetSize value
     */
    public Long targetReplicaSetSize() {
        return this.targetReplicaSetSize;
    }

    /**
     * Set the target replica set size as a number.
     *
     * @param targetReplicaSetSize the targetReplicaSetSize value to set
     * @return the StatefulServicePartitionInfo object itself.
     */
    public StatefulServicePartitionInfo withTargetReplicaSetSize(Long targetReplicaSetSize) {
        this.targetReplicaSetSize = targetReplicaSetSize;
        return this;
    }

    /**
     * Get the minimum replica set size as a number.
     *
     * @return the minReplicaSetSize value
     */
    public Long minReplicaSetSize() {
        return this.minReplicaSetSize;
    }

    /**
     * Set the minimum replica set size as a number.
     *
     * @param minReplicaSetSize the minReplicaSetSize value to set
     * @return the StatefulServicePartitionInfo object itself.
     */
    public StatefulServicePartitionInfo withMinReplicaSetSize(Long minReplicaSetSize) {
        this.minReplicaSetSize = minReplicaSetSize;
        return this;
    }

    /**
     * Get the duration for which this partition was in quorum loss. If the partition is currently in quorum loss, it returns the duration since it has been in that state. This field is using ISO8601 format for specifying the duration.
     *
     * @return the lastQuorumLossDuration value
     */
    public Period lastQuorumLossDuration() {
        return this.lastQuorumLossDuration;
    }

    /**
     * Set the duration for which this partition was in quorum loss. If the partition is currently in quorum loss, it returns the duration since it has been in that state. This field is using ISO8601 format for specifying the duration.
     *
     * @param lastQuorumLossDuration the lastQuorumLossDuration value to set
     * @return the StatefulServicePartitionInfo object itself.
     */
    public StatefulServicePartitionInfo withLastQuorumLossDuration(Period lastQuorumLossDuration) {
        this.lastQuorumLossDuration = lastQuorumLossDuration;
        return this;
    }

    /**
     * Get an Epoch is a configuration number for the partition as a whole. When the configuration of the replica set changes, for example when the Primary replica changes, the operations that are replicated from the new Primary replica are said to be a new Epoch from the ones which were sent by the old Primary replica.
     *
     * @return the primaryEpoch value
     */
    public Epoch primaryEpoch() {
        return this.primaryEpoch;
    }

    /**
     * Set an Epoch is a configuration number for the partition as a whole. When the configuration of the replica set changes, for example when the Primary replica changes, the operations that are replicated from the new Primary replica are said to be a new Epoch from the ones which were sent by the old Primary replica.
     *
     * @param primaryEpoch the primaryEpoch value to set
     * @return the StatefulServicePartitionInfo object itself.
     */
    public StatefulServicePartitionInfo withPrimaryEpoch(Epoch primaryEpoch) {
        this.primaryEpoch = primaryEpoch;
        return this;
    }

}
