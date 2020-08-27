/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_06_01.implementation;

import com.microsoft.azure.management.netapp.v2020_06_01.RelationshipStatus;
import com.microsoft.azure.management.netapp.v2020_06_01.MirrorState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Replication status.
 */
public class ReplicationStatusInner {
    /**
     * Replication health check.
     */
    @JsonProperty(value = "healthy")
    private Boolean healthy;

    /**
     * Status of the mirror relationship. Possible values include: 'Idle',
     * 'Transferring'.
     */
    @JsonProperty(value = "relationshipStatus")
    private RelationshipStatus relationshipStatus;

    /**
     * The status of the replication. Possible values include: 'Uninitialized',
     * 'Mirrored', 'Broken'.
     */
    @JsonProperty(value = "mirrorState")
    private MirrorState mirrorState;

    /**
     * The progress of the replication.
     */
    @JsonProperty(value = "totalProgress")
    private String totalProgress;

    /**
     * Displays error message if the replication is in an error state.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /**
     * Get replication health check.
     *
     * @return the healthy value
     */
    public Boolean healthy() {
        return this.healthy;
    }

    /**
     * Set replication health check.
     *
     * @param healthy the healthy value to set
     * @return the ReplicationStatusInner object itself.
     */
    public ReplicationStatusInner withHealthy(Boolean healthy) {
        this.healthy = healthy;
        return this;
    }

    /**
     * Get status of the mirror relationship. Possible values include: 'Idle', 'Transferring'.
     *
     * @return the relationshipStatus value
     */
    public RelationshipStatus relationshipStatus() {
        return this.relationshipStatus;
    }

    /**
     * Set status of the mirror relationship. Possible values include: 'Idle', 'Transferring'.
     *
     * @param relationshipStatus the relationshipStatus value to set
     * @return the ReplicationStatusInner object itself.
     */
    public ReplicationStatusInner withRelationshipStatus(RelationshipStatus relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
        return this;
    }

    /**
     * Get the status of the replication. Possible values include: 'Uninitialized', 'Mirrored', 'Broken'.
     *
     * @return the mirrorState value
     */
    public MirrorState mirrorState() {
        return this.mirrorState;
    }

    /**
     * Set the status of the replication. Possible values include: 'Uninitialized', 'Mirrored', 'Broken'.
     *
     * @param mirrorState the mirrorState value to set
     * @return the ReplicationStatusInner object itself.
     */
    public ReplicationStatusInner withMirrorState(MirrorState mirrorState) {
        this.mirrorState = mirrorState;
        return this;
    }

    /**
     * Get the progress of the replication.
     *
     * @return the totalProgress value
     */
    public String totalProgress() {
        return this.totalProgress;
    }

    /**
     * Set the progress of the replication.
     *
     * @param totalProgress the totalProgress value to set
     * @return the ReplicationStatusInner object itself.
     */
    public ReplicationStatusInner withTotalProgress(String totalProgress) {
        this.totalProgress = totalProgress;
        return this;
    }

    /**
     * Get displays error message if the replication is in an error state.
     *
     * @return the errorMessage value
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set displays error message if the replication is in an error state.
     *
     * @param errorMessage the errorMessage value to set
     * @return the ReplicationStatusInner object itself.
     */
    public ReplicationStatusInner withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

}
