// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The container instance state. */
@Immutable
public final class ContainerState {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerState.class);

    /*
     * The state of the container instance.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /*
     * The date-time when the container instance state started.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The container instance exit codes correspond to those from the `docker
     * run` command.
     */
    @JsonProperty(value = "exitCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer exitCode;

    /*
     * The date-time when the container instance state finished.
     */
    @JsonProperty(value = "finishTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime finishTime;

    /*
     * The human-readable status of the container instance state.
     */
    @JsonProperty(value = "detailStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String detailStatus;

    /**
     * Get the state property: The state of the container instance.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the startTime property: The date-time when the container instance state started.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the exitCode property: The container instance exit codes correspond to those from the `docker run` command.
     *
     * @return the exitCode value.
     */
    public Integer exitCode() {
        return this.exitCode;
    }

    /**
     * Get the finishTime property: The date-time when the container instance state finished.
     *
     * @return the finishTime value.
     */
    public OffsetDateTime finishTime() {
        return this.finishTime;
    }

    /**
     * Get the detailStatus property: The human-readable status of the container instance state.
     *
     * @return the detailStatus value.
     */
    public String detailStatus() {
        return this.detailStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
