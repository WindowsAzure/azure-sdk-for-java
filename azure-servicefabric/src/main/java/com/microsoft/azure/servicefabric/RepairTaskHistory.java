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
 * A record of the times when the repair task entered each state.
 *
 * This type supports the Service Fabric platform; it is not meant to be used
 * directly from your code.
 */
public class RepairTaskHistory {
    /**
     * The time when the repair task entered the Created state.
     */
    @JsonProperty(value = "CreatedUtcTimestamp")
    private DateTime createdUtcTimestamp;

    /**
     * The time when the repair task entered the Claimed state.
     */
    @JsonProperty(value = "ClaimedUtcTimestamp")
    private DateTime claimedUtcTimestamp;

    /**
     * The time when the repair task entered the Preparing state.
     */
    @JsonProperty(value = "PreparingUtcTimestamp")
    private DateTime preparingUtcTimestamp;

    /**
     * The time when the repair task entered the Approved state.
     */
    @JsonProperty(value = "ApprovedUtcTimestamp")
    private DateTime approvedUtcTimestamp;

    /**
     * The time when the repair task entered the Executing state.
     */
    @JsonProperty(value = "ExecutingUtcTimestamp")
    private DateTime executingUtcTimestamp;

    /**
     * The time when the repair task entered the Restoring state.
     */
    @JsonProperty(value = "RestoringUtcTimestamp")
    private DateTime restoringUtcTimestamp;

    /**
     * The time when the repair task entered the Completed state.
     */
    @JsonProperty(value = "CompletedUtcTimestamp")
    private DateTime completedUtcTimestamp;

    /**
     * The time when the repair task started the health check in the Preparing
     * state.
     */
    @JsonProperty(value = "PreparingHealthCheckStartUtcTimestamp")
    private DateTime preparingHealthCheckStartUtcTimestamp;

    /**
     * The time when the repair task completed the health check in the
     * Preparing state.
     */
    @JsonProperty(value = "PreparingHealthCheckEndUtcTimestamp")
    private DateTime preparingHealthCheckEndUtcTimestamp;

    /**
     * The time when the repair task started the health check in the Restoring
     * state.
     */
    @JsonProperty(value = "RestoringHealthCheckStartUtcTimestamp")
    private DateTime restoringHealthCheckStartUtcTimestamp;

    /**
     * The time when the repair task completed the health check in the
     * Restoring state.
     */
    @JsonProperty(value = "RestoringHealthCheckEndUtcTimestamp")
    private DateTime restoringHealthCheckEndUtcTimestamp;

    /**
     * Get the time when the repair task entered the Created state.
     *
     * @return the createdUtcTimestamp value
     */
    public DateTime createdUtcTimestamp() {
        return this.createdUtcTimestamp;
    }

    /**
     * Set the time when the repair task entered the Created state.
     *
     * @param createdUtcTimestamp the createdUtcTimestamp value to set
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory withCreatedUtcTimestamp(DateTime createdUtcTimestamp) {
        this.createdUtcTimestamp = createdUtcTimestamp;
        return this;
    }

    /**
     * Get the time when the repair task entered the Claimed state.
     *
     * @return the claimedUtcTimestamp value
     */
    public DateTime claimedUtcTimestamp() {
        return this.claimedUtcTimestamp;
    }

    /**
     * Set the time when the repair task entered the Claimed state.
     *
     * @param claimedUtcTimestamp the claimedUtcTimestamp value to set
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory withClaimedUtcTimestamp(DateTime claimedUtcTimestamp) {
        this.claimedUtcTimestamp = claimedUtcTimestamp;
        return this;
    }

    /**
     * Get the time when the repair task entered the Preparing state.
     *
     * @return the preparingUtcTimestamp value
     */
    public DateTime preparingUtcTimestamp() {
        return this.preparingUtcTimestamp;
    }

    /**
     * Set the time when the repair task entered the Preparing state.
     *
     * @param preparingUtcTimestamp the preparingUtcTimestamp value to set
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory withPreparingUtcTimestamp(DateTime preparingUtcTimestamp) {
        this.preparingUtcTimestamp = preparingUtcTimestamp;
        return this;
    }

    /**
     * Get the time when the repair task entered the Approved state.
     *
     * @return the approvedUtcTimestamp value
     */
    public DateTime approvedUtcTimestamp() {
        return this.approvedUtcTimestamp;
    }

    /**
     * Set the time when the repair task entered the Approved state.
     *
     * @param approvedUtcTimestamp the approvedUtcTimestamp value to set
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory withApprovedUtcTimestamp(DateTime approvedUtcTimestamp) {
        this.approvedUtcTimestamp = approvedUtcTimestamp;
        return this;
    }

    /**
     * Get the time when the repair task entered the Executing state.
     *
     * @return the executingUtcTimestamp value
     */
    public DateTime executingUtcTimestamp() {
        return this.executingUtcTimestamp;
    }

    /**
     * Set the time when the repair task entered the Executing state.
     *
     * @param executingUtcTimestamp the executingUtcTimestamp value to set
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory withExecutingUtcTimestamp(DateTime executingUtcTimestamp) {
        this.executingUtcTimestamp = executingUtcTimestamp;
        return this;
    }

    /**
     * Get the time when the repair task entered the Restoring state.
     *
     * @return the restoringUtcTimestamp value
     */
    public DateTime restoringUtcTimestamp() {
        return this.restoringUtcTimestamp;
    }

    /**
     * Set the time when the repair task entered the Restoring state.
     *
     * @param restoringUtcTimestamp the restoringUtcTimestamp value to set
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory withRestoringUtcTimestamp(DateTime restoringUtcTimestamp) {
        this.restoringUtcTimestamp = restoringUtcTimestamp;
        return this;
    }

    /**
     * Get the time when the repair task entered the Completed state.
     *
     * @return the completedUtcTimestamp value
     */
    public DateTime completedUtcTimestamp() {
        return this.completedUtcTimestamp;
    }

    /**
     * Set the time when the repair task entered the Completed state.
     *
     * @param completedUtcTimestamp the completedUtcTimestamp value to set
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory withCompletedUtcTimestamp(DateTime completedUtcTimestamp) {
        this.completedUtcTimestamp = completedUtcTimestamp;
        return this;
    }

    /**
     * Get the time when the repair task started the health check in the Preparing state.
     *
     * @return the preparingHealthCheckStartUtcTimestamp value
     */
    public DateTime preparingHealthCheckStartUtcTimestamp() {
        return this.preparingHealthCheckStartUtcTimestamp;
    }

    /**
     * Set the time when the repair task started the health check in the Preparing state.
     *
     * @param preparingHealthCheckStartUtcTimestamp the preparingHealthCheckStartUtcTimestamp value to set
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory withPreparingHealthCheckStartUtcTimestamp(DateTime preparingHealthCheckStartUtcTimestamp) {
        this.preparingHealthCheckStartUtcTimestamp = preparingHealthCheckStartUtcTimestamp;
        return this;
    }

    /**
     * Get the time when the repair task completed the health check in the Preparing state.
     *
     * @return the preparingHealthCheckEndUtcTimestamp value
     */
    public DateTime preparingHealthCheckEndUtcTimestamp() {
        return this.preparingHealthCheckEndUtcTimestamp;
    }

    /**
     * Set the time when the repair task completed the health check in the Preparing state.
     *
     * @param preparingHealthCheckEndUtcTimestamp the preparingHealthCheckEndUtcTimestamp value to set
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory withPreparingHealthCheckEndUtcTimestamp(DateTime preparingHealthCheckEndUtcTimestamp) {
        this.preparingHealthCheckEndUtcTimestamp = preparingHealthCheckEndUtcTimestamp;
        return this;
    }

    /**
     * Get the time when the repair task started the health check in the Restoring state.
     *
     * @return the restoringHealthCheckStartUtcTimestamp value
     */
    public DateTime restoringHealthCheckStartUtcTimestamp() {
        return this.restoringHealthCheckStartUtcTimestamp;
    }

    /**
     * Set the time when the repair task started the health check in the Restoring state.
     *
     * @param restoringHealthCheckStartUtcTimestamp the restoringHealthCheckStartUtcTimestamp value to set
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory withRestoringHealthCheckStartUtcTimestamp(DateTime restoringHealthCheckStartUtcTimestamp) {
        this.restoringHealthCheckStartUtcTimestamp = restoringHealthCheckStartUtcTimestamp;
        return this;
    }

    /**
     * Get the time when the repair task completed the health check in the Restoring state.
     *
     * @return the restoringHealthCheckEndUtcTimestamp value
     */
    public DateTime restoringHealthCheckEndUtcTimestamp() {
        return this.restoringHealthCheckEndUtcTimestamp;
    }

    /**
     * Set the time when the repair task completed the health check in the Restoring state.
     *
     * @param restoringHealthCheckEndUtcTimestamp the restoringHealthCheckEndUtcTimestamp value to set
     * @return the RepairTaskHistory object itself.
     */
    public RepairTaskHistory withRestoringHealthCheckEndUtcTimestamp(DateTime restoringHealthCheckEndUtcTimestamp) {
        this.restoringHealthCheckEndUtcTimestamp = restoringHealthCheckEndUtcTimestamp;
        return this;
    }

}
