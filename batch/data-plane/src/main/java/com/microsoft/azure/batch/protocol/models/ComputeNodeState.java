// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ComputeNodeState.
 */
public enum ComputeNodeState {
    /** The node is not currently running a task. */
    IDLE("idle"),

    /** The node is rebooting. */
    REBOOTING("rebooting"),

    /** The node is reimaging. */
    REIMAGING("reimaging"),

    /** The node is running one or more tasks (other than a start task). */
    RUNNING("running"),

    /** The node cannot be used for task execution due to errors. */
    UNUSABLE("unusable"),

    /** The Batch service has obtained the underlying virtual machine from Azure Compute, but it has not yet started to join the pool. */
    CREATING("creating"),

    /** The Batch service is starting on the underlying virtual machine. */
    STARTING("starting"),

    /** The start task has started running on the compute node, but waitForSuccess is set and the start task has not yet completed. */
    WAITING_FOR_START_TASK("waitingforstarttask"),

    /** The start task has failed on the compute node (and exhausted all retries), and waitForSuccess is set. The node is not usable for running tasks. */
    START_TASK_FAILED("starttaskfailed"),

    /** The Batch service has lost contact with the node, and does not know its true state. */
    UNKNOWN("unknown"),

    /** The node is leaving the pool, either because the user explicitly removed it or because the pool is resizing or autoscaling down. */
    LEAVING_POOL("leavingpool"),

    /** The node is not currently running a task, and scheduling of new tasks to the node is disabled. */
    OFFLINE("offline"),

    /** The low-priority node has been preempted. Tasks which were running on the node when it was pre-empted will be rescheduled when another node becomes available. */
    PREEMPTED("preempted");

    /** The actual serialized value for a ComputeNodeState instance. */
    private String value;

    ComputeNodeState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ComputeNodeState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ComputeNodeState object, or null if unable to parse.
     */
    @JsonCreator
    public static ComputeNodeState fromString(String value) {
        ComputeNodeState[] items = ComputeNodeState.values();
        for (ComputeNodeState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
