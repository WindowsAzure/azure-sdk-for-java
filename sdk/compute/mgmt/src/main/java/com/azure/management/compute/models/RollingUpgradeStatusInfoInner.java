// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.compute.ApiError;
import com.azure.management.compute.RollingUpgradePolicy;
import com.azure.management.compute.RollingUpgradeProgressInfo;
import com.azure.management.compute.RollingUpgradeRunningStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RollingUpgradeStatusInfo model.
 */
@JsonFlatten
@Immutable
public class RollingUpgradeStatusInfoInner extends Resource {
    /*
     * The configuration parameters used while performing a rolling upgrade.
     */
    @JsonProperty(value = "properties.policy", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradePolicy policy;

    /*
     * Information about the current running state of the overall upgrade.
     */
    @JsonProperty(value = "properties.runningStatus", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradeRunningStatus runningStatus;

    /*
     * Information about the number of virtual machine instances in each
     * upgrade state.
     */
    @JsonProperty(value = "properties.progress", access = JsonProperty.Access.WRITE_ONLY)
    private RollingUpgradeProgressInfo progress;

    /*
     * Api error.
     */
    @JsonProperty(value = "properties.error", access = JsonProperty.Access.WRITE_ONLY)
    private ApiError error;

    /**
     * Get the policy property: The configuration parameters used while
     * performing a rolling upgrade.
     * 
     * @return the policy value.
     */
    public RollingUpgradePolicy policy() {
        return this.policy;
    }

    /**
     * Get the runningStatus property: Information about the current running
     * state of the overall upgrade.
     * 
     * @return the runningStatus value.
     */
    public RollingUpgradeRunningStatus runningStatus() {
        return this.runningStatus;
    }

    /**
     * Get the progress property: Information about the number of virtual
     * machine instances in each upgrade state.
     * 
     * @return the progress value.
     */
    public RollingUpgradeProgressInfo progress() {
        return this.progress;
    }

    /**
     * Get the error property: Api error.
     * 
     * @return the error value.
     */
    public ApiError error() {
        return this.error;
    }
}
