/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class represents the fabric replication group task details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType", defaultImpl = FabricReplicationGroupTaskDetails.class)
@JsonTypeName("FabricReplicationGroupTaskDetails")
public class FabricReplicationGroupTaskDetails extends TaskTypeDetails {
    /**
     * The skipped reason.
     */
    @JsonProperty(value = "skippedReason")
    private String skippedReason;

    /**
     * The skipped reason string.
     */
    @JsonProperty(value = "skippedReasonString")
    private String skippedReasonString;

    /**
     * The job entity.
     */
    @JsonProperty(value = "jobTask")
    private JobEntity jobTask;

    /**
     * Get the skipped reason.
     *
     * @return the skippedReason value
     */
    public String skippedReason() {
        return this.skippedReason;
    }

    /**
     * Set the skipped reason.
     *
     * @param skippedReason the skippedReason value to set
     * @return the FabricReplicationGroupTaskDetails object itself.
     */
    public FabricReplicationGroupTaskDetails withSkippedReason(String skippedReason) {
        this.skippedReason = skippedReason;
        return this;
    }

    /**
     * Get the skipped reason string.
     *
     * @return the skippedReasonString value
     */
    public String skippedReasonString() {
        return this.skippedReasonString;
    }

    /**
     * Set the skipped reason string.
     *
     * @param skippedReasonString the skippedReasonString value to set
     * @return the FabricReplicationGroupTaskDetails object itself.
     */
    public FabricReplicationGroupTaskDetails withSkippedReasonString(String skippedReasonString) {
        this.skippedReasonString = skippedReasonString;
        return this;
    }

    /**
     * Get the job entity.
     *
     * @return the jobTask value
     */
    public JobEntity jobTask() {
        return this.jobTask;
    }

    /**
     * Set the job entity.
     *
     * @param jobTask the jobTask value to set
     * @return the FabricReplicationGroupTaskDetails object itself.
     */
    public FabricReplicationGroupTaskDetails withJobTask(JobEntity jobTask) {
        this.jobTask = jobTask;
        return this;
    }

}
