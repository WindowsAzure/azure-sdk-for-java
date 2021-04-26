// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** The properties of a stateful service resource. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "serviceKind")
@JsonTypeName("Stateful")
@Fluent
public final class StatefulServiceProperties extends ServiceResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StatefulServiceProperties.class);

    /*
     * A flag indicating whether this is a persistent service which stores
     * states on the local disk. If it is then the value of this property is
     * true, if not it is false.
     */
    @JsonProperty(value = "hasPersistedState")
    private Boolean hasPersistedState;

    /*
     * The target replica set size as a number.
     */
    @JsonProperty(value = "targetReplicaSetSize")
    private Integer targetReplicaSetSize;

    /*
     * The minimum replica set size as a number.
     */
    @JsonProperty(value = "minReplicaSetSize")
    private Integer minReplicaSetSize;

    /*
     * The duration between when a replica goes down and when a new replica is
     * created, represented in ISO 8601 format (hh:mm:ss.s).
     */
    @JsonProperty(value = "replicaRestartWaitDuration")
    private OffsetDateTime replicaRestartWaitDuration;

    /*
     * The maximum duration for which a partition is allowed to be in a state
     * of quorum loss, represented in ISO 8601 format (hh:mm:ss.s).
     */
    @JsonProperty(value = "quorumLossWaitDuration")
    private OffsetDateTime quorumLossWaitDuration;

    /*
     * The definition on how long StandBy replicas should be maintained before
     * being removed, represented in ISO 8601 format (hh:mm:ss.s).
     */
    @JsonProperty(value = "standByReplicaKeepDuration")
    private OffsetDateTime standByReplicaKeepDuration;

    /**
     * Get the hasPersistedState property: A flag indicating whether this is a persistent service which stores states on
     * the local disk. If it is then the value of this property is true, if not it is false.
     *
     * @return the hasPersistedState value.
     */
    public Boolean hasPersistedState() {
        return this.hasPersistedState;
    }

    /**
     * Set the hasPersistedState property: A flag indicating whether this is a persistent service which stores states on
     * the local disk. If it is then the value of this property is true, if not it is false.
     *
     * @param hasPersistedState the hasPersistedState value to set.
     * @return the StatefulServiceProperties object itself.
     */
    public StatefulServiceProperties withHasPersistedState(Boolean hasPersistedState) {
        this.hasPersistedState = hasPersistedState;
        return this;
    }

    /**
     * Get the targetReplicaSetSize property: The target replica set size as a number.
     *
     * @return the targetReplicaSetSize value.
     */
    public Integer targetReplicaSetSize() {
        return this.targetReplicaSetSize;
    }

    /**
     * Set the targetReplicaSetSize property: The target replica set size as a number.
     *
     * @param targetReplicaSetSize the targetReplicaSetSize value to set.
     * @return the StatefulServiceProperties object itself.
     */
    public StatefulServiceProperties withTargetReplicaSetSize(Integer targetReplicaSetSize) {
        this.targetReplicaSetSize = targetReplicaSetSize;
        return this;
    }

    /**
     * Get the minReplicaSetSize property: The minimum replica set size as a number.
     *
     * @return the minReplicaSetSize value.
     */
    public Integer minReplicaSetSize() {
        return this.minReplicaSetSize;
    }

    /**
     * Set the minReplicaSetSize property: The minimum replica set size as a number.
     *
     * @param minReplicaSetSize the minReplicaSetSize value to set.
     * @return the StatefulServiceProperties object itself.
     */
    public StatefulServiceProperties withMinReplicaSetSize(Integer minReplicaSetSize) {
        this.minReplicaSetSize = minReplicaSetSize;
        return this;
    }

    /**
     * Get the replicaRestartWaitDuration property: The duration between when a replica goes down and when a new replica
     * is created, represented in ISO 8601 format (hh:mm:ss.s).
     *
     * @return the replicaRestartWaitDuration value.
     */
    public OffsetDateTime replicaRestartWaitDuration() {
        return this.replicaRestartWaitDuration;
    }

    /**
     * Set the replicaRestartWaitDuration property: The duration between when a replica goes down and when a new replica
     * is created, represented in ISO 8601 format (hh:mm:ss.s).
     *
     * @param replicaRestartWaitDuration the replicaRestartWaitDuration value to set.
     * @return the StatefulServiceProperties object itself.
     */
    public StatefulServiceProperties withReplicaRestartWaitDuration(OffsetDateTime replicaRestartWaitDuration) {
        this.replicaRestartWaitDuration = replicaRestartWaitDuration;
        return this;
    }

    /**
     * Get the quorumLossWaitDuration property: The maximum duration for which a partition is allowed to be in a state
     * of quorum loss, represented in ISO 8601 format (hh:mm:ss.s).
     *
     * @return the quorumLossWaitDuration value.
     */
    public OffsetDateTime quorumLossWaitDuration() {
        return this.quorumLossWaitDuration;
    }

    /**
     * Set the quorumLossWaitDuration property: The maximum duration for which a partition is allowed to be in a state
     * of quorum loss, represented in ISO 8601 format (hh:mm:ss.s).
     *
     * @param quorumLossWaitDuration the quorumLossWaitDuration value to set.
     * @return the StatefulServiceProperties object itself.
     */
    public StatefulServiceProperties withQuorumLossWaitDuration(OffsetDateTime quorumLossWaitDuration) {
        this.quorumLossWaitDuration = quorumLossWaitDuration;
        return this;
    }

    /**
     * Get the standByReplicaKeepDuration property: The definition on how long StandBy replicas should be maintained
     * before being removed, represented in ISO 8601 format (hh:mm:ss.s).
     *
     * @return the standByReplicaKeepDuration value.
     */
    public OffsetDateTime standByReplicaKeepDuration() {
        return this.standByReplicaKeepDuration;
    }

    /**
     * Set the standByReplicaKeepDuration property: The definition on how long StandBy replicas should be maintained
     * before being removed, represented in ISO 8601 format (hh:mm:ss.s).
     *
     * @param standByReplicaKeepDuration the standByReplicaKeepDuration value to set.
     * @return the StatefulServiceProperties object itself.
     */
    public StatefulServiceProperties withStandByReplicaKeepDuration(OffsetDateTime standByReplicaKeepDuration) {
        this.standByReplicaKeepDuration = standByReplicaKeepDuration;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatefulServiceProperties withServiceTypeName(String serviceTypeName) {
        super.withServiceTypeName(serviceTypeName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatefulServiceProperties withPartitionDescription(PartitionSchemeDescription partitionDescription) {
        super.withPartitionDescription(partitionDescription);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatefulServiceProperties withServicePackageActivationMode(
        ArmServicePackageActivationMode servicePackageActivationMode) {
        super.withServicePackageActivationMode(servicePackageActivationMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatefulServiceProperties withPlacementConstraints(String placementConstraints) {
        super.withPlacementConstraints(placementConstraints);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatefulServiceProperties withCorrelationScheme(List<ServiceCorrelationDescription> correlationScheme) {
        super.withCorrelationScheme(correlationScheme);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatefulServiceProperties withServiceLoadMetrics(List<ServiceLoadMetricDescription> serviceLoadMetrics) {
        super.withServiceLoadMetrics(serviceLoadMetrics);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatefulServiceProperties withServicePlacementPolicies(
        List<ServicePlacementPolicyDescription> servicePlacementPolicies) {
        super.withServicePlacementPolicies(servicePlacementPolicies);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatefulServiceProperties withDefaultMoveCost(MoveCost defaultMoveCost) {
        super.withDefaultMoveCost(defaultMoveCost);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
