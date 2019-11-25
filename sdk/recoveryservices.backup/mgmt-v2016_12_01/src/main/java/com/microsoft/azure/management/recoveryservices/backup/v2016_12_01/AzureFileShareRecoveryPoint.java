/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation.RecoveryPointInner;

/**
 * Azure File Share workload specific backup copy.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureFileShareRecoveryPoint")
public class AzureFileShareRecoveryPoint extends RecoveryPointInner {
    /**
     * Type of the backup copy. Specifies whether it is a crash consistent
     * backup or app consistent.
     */
    @JsonProperty(value = "recoveryPointType")
    private String recoveryPointType;

    /**
     * Time at which this backup copy was created.
     */
    @JsonProperty(value = "recoveryPointTime")
    private DateTime recoveryPointTime;

    /**
     * Contains Url to the snapshot of fileshare, if applicable.
     */
    @JsonProperty(value = "fileShareSnapshotUri")
    private String fileShareSnapshotUri;

    /**
     * Get type of the backup copy. Specifies whether it is a crash consistent backup or app consistent.
     *
     * @return the recoveryPointType value
     */
    public String recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set type of the backup copy. Specifies whether it is a crash consistent backup or app consistent.
     *
     * @param recoveryPointType the recoveryPointType value to set
     * @return the AzureFileShareRecoveryPoint object itself.
     */
    public AzureFileShareRecoveryPoint withRecoveryPointType(String recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

    /**
     * Get time at which this backup copy was created.
     *
     * @return the recoveryPointTime value
     */
    public DateTime recoveryPointTime() {
        return this.recoveryPointTime;
    }

    /**
     * Set time at which this backup copy was created.
     *
     * @param recoveryPointTime the recoveryPointTime value to set
     * @return the AzureFileShareRecoveryPoint object itself.
     */
    public AzureFileShareRecoveryPoint withRecoveryPointTime(DateTime recoveryPointTime) {
        this.recoveryPointTime = recoveryPointTime;
        return this;
    }

    /**
     * Get contains Url to the snapshot of fileshare, if applicable.
     *
     * @return the fileShareSnapshotUri value
     */
    public String fileShareSnapshotUri() {
        return this.fileShareSnapshotUri;
    }

    /**
     * Set contains Url to the snapshot of fileshare, if applicable.
     *
     * @param fileShareSnapshotUri the fileShareSnapshotUri value to set
     * @return the AzureFileShareRecoveryPoint object itself.
     */
    public AzureFileShareRecoveryPoint withFileShareSnapshotUri(String fileShareSnapshotUri) {
        this.fileShareSnapshotUri = fileShareSnapshotUri;
        return this;
    }

}
