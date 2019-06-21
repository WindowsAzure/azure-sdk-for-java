/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about the container which a Task is executing.
 */
public class TaskContainerExecutionInformation {
    /**
     * The ID of the container.
     */
    @JsonProperty(value = "containerId")
    private String containerId;

    /**
     * The state of the container.
     * This is the state of the container according to the Docker service. It
     * is equivalent to the status field returned by "docker inspect".
     */
    @JsonProperty(value = "state")
    private String state;

    /**
     * Detailed error information about the container.
     * This is the detailed error string from the Docker service, if available.
     * It is equivalent to the error field returned by "docker inspect".
     */
    @JsonProperty(value = "error")
    private String error;

    /**
     * Get the containerId value.
     *
     * @return the containerId value
     */
    public String containerId() {
        return this.containerId;
    }

    /**
     * Set the containerId value.
     *
     * @param containerId the containerId value to set
     * @return the TaskContainerExecutionInformation object itself.
     */
    public TaskContainerExecutionInformation withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * Get this is the state of the container according to the Docker service. It is equivalent to the status field returned by "docker inspect".
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set this is the state of the container according to the Docker service. It is equivalent to the status field returned by "docker inspect".
     *
     * @param state the state value to set
     * @return the TaskContainerExecutionInformation object itself.
     */
    public TaskContainerExecutionInformation withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get this is the detailed error string from the Docker service, if available. It is equivalent to the error field returned by "docker inspect".
     *
     * @return the error value
     */
    public String error() {
        return this.error;
    }

    /**
     * Set this is the detailed error string from the Docker service, if available. It is equivalent to the error field returned by "docker inspect".
     *
     * @param error the error value to set
     * @return the TaskContainerExecutionInformation object itself.
     */
    public TaskContainerExecutionInformation withError(String error) {
        this.error = error;
        return this;
    }

}
