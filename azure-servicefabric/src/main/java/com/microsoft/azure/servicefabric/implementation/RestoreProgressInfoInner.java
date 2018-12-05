/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.microsoft.azure.servicefabric.RestoreState;
import org.joda.time.DateTime;
import com.microsoft.azure.servicefabric.Epoch;
import com.microsoft.azure.servicefabric.FabricErrorError;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the progress of a restore operation on a partition.
 */
public class RestoreProgressInfoInner {
    /**
     * Represents the current state of the partition restore operation.
     * Possible values include: 'Invalid', 'Accepted', 'RestoreInProgress',
     * 'Success', 'Failure', 'Timeout'.
     */
    @JsonProperty(value = "RestoreState")
    private RestoreState restoreState;

    /**
     * Timestamp when operation succeeded or failed.
     */
    @JsonProperty(value = "TimeStampUtc")
    private DateTime timeStampUtc;

    /**
     * Describes the epoch at which the partition is restored.
     */
    @JsonProperty(value = "RestoredEpoch")
    private Epoch restoredEpoch;

    /**
     * Restored LSN.
     */
    @JsonProperty(value = "RestoredLsn")
    private String restoredLsn;

    /**
     * Denotes the failure encountered in performing restore operation.
     */
    @JsonProperty(value = "FailureError")
    private FabricErrorError failureError;

    /**
     * Get represents the current state of the partition restore operation. Possible values include: 'Invalid', 'Accepted', 'RestoreInProgress', 'Success', 'Failure', 'Timeout'.
     *
     * @return the restoreState value
     */
    public RestoreState restoreState() {
        return this.restoreState;
    }

    /**
     * Set represents the current state of the partition restore operation. Possible values include: 'Invalid', 'Accepted', 'RestoreInProgress', 'Success', 'Failure', 'Timeout'.
     *
     * @param restoreState the restoreState value to set
     * @return the RestoreProgressInfoInner object itself.
     */
    public RestoreProgressInfoInner withRestoreState(RestoreState restoreState) {
        this.restoreState = restoreState;
        return this;
    }

    /**
     * Get timestamp when operation succeeded or failed.
     *
     * @return the timeStampUtc value
     */
    public DateTime timeStampUtc() {
        return this.timeStampUtc;
    }

    /**
     * Set timestamp when operation succeeded or failed.
     *
     * @param timeStampUtc the timeStampUtc value to set
     * @return the RestoreProgressInfoInner object itself.
     */
    public RestoreProgressInfoInner withTimeStampUtc(DateTime timeStampUtc) {
        this.timeStampUtc = timeStampUtc;
        return this;
    }

    /**
     * Get describes the epoch at which the partition is restored.
     *
     * @return the restoredEpoch value
     */
    public Epoch restoredEpoch() {
        return this.restoredEpoch;
    }

    /**
     * Set describes the epoch at which the partition is restored.
     *
     * @param restoredEpoch the restoredEpoch value to set
     * @return the RestoreProgressInfoInner object itself.
     */
    public RestoreProgressInfoInner withRestoredEpoch(Epoch restoredEpoch) {
        this.restoredEpoch = restoredEpoch;
        return this;
    }

    /**
     * Get restored LSN.
     *
     * @return the restoredLsn value
     */
    public String restoredLsn() {
        return this.restoredLsn;
    }

    /**
     * Set restored LSN.
     *
     * @param restoredLsn the restoredLsn value to set
     * @return the RestoreProgressInfoInner object itself.
     */
    public RestoreProgressInfoInner withRestoredLsn(String restoredLsn) {
        this.restoredLsn = restoredLsn;
        return this;
    }

    /**
     * Get denotes the failure encountered in performing restore operation.
     *
     * @return the failureError value
     */
    public FabricErrorError failureError() {
        return this.failureError;
    }

    /**
     * Set denotes the failure encountered in performing restore operation.
     *
     * @param failureError the failureError value to set
     * @return the RestoreProgressInfoInner object itself.
     */
    public RestoreProgressInfoInner withFailureError(FabricErrorError failureError) {
        this.failureError = failureError;
        return this;
    }

}
