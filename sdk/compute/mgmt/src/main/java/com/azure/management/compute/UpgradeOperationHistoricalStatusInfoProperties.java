// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UpgradeOperationHistoricalStatusInfoProperties model. */
@Immutable
public final class UpgradeOperationHistoricalStatusInfoProperties {
    /*
     * Information about the overall status of the upgrade operation.
     */
    @JsonProperty(value = "runningStatus", access = JsonProperty.Access.WRITE_ONLY)
    private UpgradeOperationHistoryStatus runningStatus;

    /*
     * Counts of the VMs in each state.
     */
    @JsonProperty(value = "progress", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradeProgressInfo progress;

    /*
     * Error Details for this upgrade if there are any.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ApiError error;

    /*
     * Invoker of the Upgrade Operation
     */
    @JsonProperty(value = "startedBy", access = JsonProperty.Access.WRITE_ONLY)
    private UpgradeOperationInvoker startedBy;

    /*
     * Image Reference details
     */
    @JsonProperty(value = "targetImageReference", access = JsonProperty.Access.WRITE_ONLY)
    private ImageReference targetImageReference;

    /*
     * Information about OS rollback if performed
     */
    @JsonProperty(value = "rollbackInfo", access = JsonProperty.Access.WRITE_ONLY)
    private RollbackStatusInfo rollbackInfo;

    /**
     * Get the runningStatus property: Information about the overall status of the upgrade operation.
     *
     * @return the runningStatus value.
     */
    public UpgradeOperationHistoryStatus runningStatus() {
        return this.runningStatus;
    }

    /**
     * Get the progress property: Counts of the VMs in each state.
     *
     * @return the progress value.
     */
    public RollingUpgradeProgressInfo progress() {
        return this.progress;
    }

    /**
     * Get the error property: Error Details for this upgrade if there are any.
     *
     * @return the error value.
     */
    public ApiError error() {
        return this.error;
    }

    /**
     * Get the startedBy property: Invoker of the Upgrade Operation.
     *
     * @return the startedBy value.
     */
    public UpgradeOperationInvoker startedBy() {
        return this.startedBy;
    }

    /**
     * Get the targetImageReference property: Image Reference details.
     *
     * @return the targetImageReference value.
     */
    public ImageReference targetImageReference() {
        return this.targetImageReference;
    }

    /**
     * Get the rollbackInfo property: Information about OS rollback if performed.
     *
     * @return the rollbackInfo value.
     */
    public RollbackStatusInfo rollbackInfo() {
        return this.rollbackInfo;
    }
}
