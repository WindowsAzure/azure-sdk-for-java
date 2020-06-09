// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The ConnectionStateSnapshot model. */
@Fluent
public final class ConnectionStateSnapshot {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionStateSnapshot.class);

    /*
     * The connection state.
     */
    @JsonProperty(value = "connectionState")
    private ConnectionState connectionState;

    /*
     * The start time of the connection snapshot.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The end time of the connection snapshot.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * Connectivity analysis evaluation state.
     */
    @JsonProperty(value = "evaluationState")
    private EvaluationState evaluationState;

    /*
     * Average latency in ms.
     */
    @JsonProperty(value = "avgLatencyInMs")
    private Integer avgLatencyInMs;

    /*
     * Minimum latency in ms.
     */
    @JsonProperty(value = "minLatencyInMs")
    private Integer minLatencyInMs;

    /*
     * Maximum latency in ms.
     */
    @JsonProperty(value = "maxLatencyInMs")
    private Integer maxLatencyInMs;

    /*
     * The number of sent probes.
     */
    @JsonProperty(value = "probesSent")
    private Integer probesSent;

    /*
     * The number of failed probes.
     */
    @JsonProperty(value = "probesFailed")
    private Integer probesFailed;

    /*
     * List of hops between the source and the destination.
     */
    @JsonProperty(value = "hops", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectivityHop> hops;

    /**
     * Get the connectionState property: The connection state.
     *
     * @return the connectionState value.
     */
    public ConnectionState connectionState() {
        return this.connectionState;
    }

    /**
     * Set the connectionState property: The connection state.
     *
     * @param connectionState the connectionState value to set.
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState;
        return this;
    }

    /**
     * Get the startTime property: The start time of the connection snapshot.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time of the connection snapshot.
     *
     * @param startTime the startTime value to set.
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time of the connection snapshot.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time of the connection snapshot.
     *
     * @param endTime the endTime value to set.
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the evaluationState property: Connectivity analysis evaluation state.
     *
     * @return the evaluationState value.
     */
    public EvaluationState evaluationState() {
        return this.evaluationState;
    }

    /**
     * Set the evaluationState property: Connectivity analysis evaluation state.
     *
     * @param evaluationState the evaluationState value to set.
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withEvaluationState(EvaluationState evaluationState) {
        this.evaluationState = evaluationState;
        return this;
    }

    /**
     * Get the avgLatencyInMs property: Average latency in ms.
     *
     * @return the avgLatencyInMs value.
     */
    public Integer avgLatencyInMs() {
        return this.avgLatencyInMs;
    }

    /**
     * Set the avgLatencyInMs property: Average latency in ms.
     *
     * @param avgLatencyInMs the avgLatencyInMs value to set.
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withAvgLatencyInMs(Integer avgLatencyInMs) {
        this.avgLatencyInMs = avgLatencyInMs;
        return this;
    }

    /**
     * Get the minLatencyInMs property: Minimum latency in ms.
     *
     * @return the minLatencyInMs value.
     */
    public Integer minLatencyInMs() {
        return this.minLatencyInMs;
    }

    /**
     * Set the minLatencyInMs property: Minimum latency in ms.
     *
     * @param minLatencyInMs the minLatencyInMs value to set.
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withMinLatencyInMs(Integer minLatencyInMs) {
        this.minLatencyInMs = minLatencyInMs;
        return this;
    }

    /**
     * Get the maxLatencyInMs property: Maximum latency in ms.
     *
     * @return the maxLatencyInMs value.
     */
    public Integer maxLatencyInMs() {
        return this.maxLatencyInMs;
    }

    /**
     * Set the maxLatencyInMs property: Maximum latency in ms.
     *
     * @param maxLatencyInMs the maxLatencyInMs value to set.
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withMaxLatencyInMs(Integer maxLatencyInMs) {
        this.maxLatencyInMs = maxLatencyInMs;
        return this;
    }

    /**
     * Get the probesSent property: The number of sent probes.
     *
     * @return the probesSent value.
     */
    public Integer probesSent() {
        return this.probesSent;
    }

    /**
     * Set the probesSent property: The number of sent probes.
     *
     * @param probesSent the probesSent value to set.
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withProbesSent(Integer probesSent) {
        this.probesSent = probesSent;
        return this;
    }

    /**
     * Get the probesFailed property: The number of failed probes.
     *
     * @return the probesFailed value.
     */
    public Integer probesFailed() {
        return this.probesFailed;
    }

    /**
     * Set the probesFailed property: The number of failed probes.
     *
     * @param probesFailed the probesFailed value to set.
     * @return the ConnectionStateSnapshot object itself.
     */
    public ConnectionStateSnapshot withProbesFailed(Integer probesFailed) {
        this.probesFailed = probesFailed;
        return this;
    }

    /**
     * Get the hops property: List of hops between the source and the destination.
     *
     * @return the hops value.
     */
    public List<ConnectivityHop> hops() {
        return this.hops;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hops() != null) {
            hops().forEach(e -> e.validate());
        }
    }
}
