/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the move resource status.
 */
public class MoveResourceStatus {
    /**
     * Possible values include: 'AssignmentPending', 'PreparePending',
     * 'PrepareInProgress', 'PrepareFailed', 'MovePending', 'MoveInProgress',
     * 'MoveFailed', 'DiscardInProgress', 'DiscardFailed', 'CommitPending',
     * 'CommitInProgress', 'CommitFailed', 'Committed', 'DeleteSourcePending',
     * 'ResourceMoveCompleted'.
     */
    @JsonProperty(value = "moveState")
    private MoveState moveState;

    /**
     * The jobStatus property.
     */
    @JsonProperty(value = "jobStatus")
    private JobStatus jobStatus;

    /**
     * The errors property.
     */
    @JsonProperty(value = "errors")
    private MoveResourceError errors;

    /**
     * Get possible values include: 'AssignmentPending', 'PreparePending', 'PrepareInProgress', 'PrepareFailed', 'MovePending', 'MoveInProgress', 'MoveFailed', 'DiscardInProgress', 'DiscardFailed', 'CommitPending', 'CommitInProgress', 'CommitFailed', 'Committed', 'DeleteSourcePending', 'ResourceMoveCompleted'.
     *
     * @return the moveState value
     */
    public MoveState moveState() {
        return this.moveState;
    }

    /**
     * Set possible values include: 'AssignmentPending', 'PreparePending', 'PrepareInProgress', 'PrepareFailed', 'MovePending', 'MoveInProgress', 'MoveFailed', 'DiscardInProgress', 'DiscardFailed', 'CommitPending', 'CommitInProgress', 'CommitFailed', 'Committed', 'DeleteSourcePending', 'ResourceMoveCompleted'.
     *
     * @param moveState the moveState value to set
     * @return the MoveResourceStatus object itself.
     */
    public MoveResourceStatus withMoveState(MoveState moveState) {
        this.moveState = moveState;
        return this;
    }

    /**
     * Get the jobStatus value.
     *
     * @return the jobStatus value
     */
    public JobStatus jobStatus() {
        return this.jobStatus;
    }

    /**
     * Set the jobStatus value.
     *
     * @param jobStatus the jobStatus value to set
     * @return the MoveResourceStatus object itself.
     */
    public MoveResourceStatus withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * Get the errors value.
     *
     * @return the errors value
     */
    public MoveResourceError errors() {
        return this.errors;
    }

    /**
     * Set the errors value.
     *
     * @param errors the errors value to set
     * @return the MoveResourceStatus object itself.
     */
    public MoveResourceStatus withErrors(MoveResourceError errors) {
        this.errors = errors;
        return this;
    }

}
