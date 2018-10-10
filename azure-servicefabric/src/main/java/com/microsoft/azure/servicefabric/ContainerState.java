/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The container state.
 */
public class ContainerState {
    /**
     * The state of this container.
     */
    @JsonProperty(value = "state")
    private String state;

    /**
     * Date/time when the container state started.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * The container exit code.
     */
    @JsonProperty(value = "exitCode")
    private String exitCode;

    /**
     * Date/time when the container state finished.
     */
    @JsonProperty(value = "finishTime")
    private DateTime finishTime;

    /**
     * Human-readable status of this state.
     */
    @JsonProperty(value = "detailStatus")
    private String detailStatus;

    /**
     * Get the state of this container.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state of this container.
     *
     * @param state the state value to set
     * @return the ContainerState object itself.
     */
    public ContainerState withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get date/time when the container state started.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set date/time when the container state started.
     *
     * @param startTime the startTime value to set
     * @return the ContainerState object itself.
     */
    public ContainerState withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the container exit code.
     *
     * @return the exitCode value
     */
    public String exitCode() {
        return this.exitCode;
    }

    /**
     * Set the container exit code.
     *
     * @param exitCode the exitCode value to set
     * @return the ContainerState object itself.
     */
    public ContainerState withExitCode(String exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * Get date/time when the container state finished.
     *
     * @return the finishTime value
     */
    public DateTime finishTime() {
        return this.finishTime;
    }

    /**
     * Set date/time when the container state finished.
     *
     * @param finishTime the finishTime value to set
     * @return the ContainerState object itself.
     */
    public ContainerState withFinishTime(DateTime finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * Get human-readable status of this state.
     *
     * @return the detailStatus value
     */
    public String detailStatus() {
        return this.detailStatus;
    }

    /**
     * Set human-readable status of this state.
     *
     * @param detailStatus the detailStatus value to set
     * @return the ContainerState object itself.
     */
    public ContainerState withDetailStatus(String detailStatus) {
        this.detailStatus = detailStatus;
        return this;
    }

}
