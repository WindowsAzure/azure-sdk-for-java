/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters to be applied to the cluster-autoscaler when enabled.
 */
public class ManagedClusterPropertiesAutoScalerProfile {
    /**
     * The balanceSimilarNodeGroups property.
     */
    @JsonProperty(value = "balance-similar-node-groups")
    private String balanceSimilarNodeGroups;

    /**
     * The scanInterval property.
     */
    @JsonProperty(value = "scan-interval")
    private String scanInterval;

    /**
     * The scaleDownDelayAfterAdd property.
     */
    @JsonProperty(value = "scale-down-delay-after-add")
    private String scaleDownDelayAfterAdd;

    /**
     * The scaleDownDelayAfterDelete property.
     */
    @JsonProperty(value = "scale-down-delay-after-delete")
    private String scaleDownDelayAfterDelete;

    /**
     * The scaleDownDelayAfterFailure property.
     */
    @JsonProperty(value = "scale-down-delay-after-failure")
    private String scaleDownDelayAfterFailure;

    /**
     * The scaleDownUnneededTime property.
     */
    @JsonProperty(value = "scale-down-unneeded-time")
    private String scaleDownUnneededTime;

    /**
     * The scaleDownUnreadyTime property.
     */
    @JsonProperty(value = "scale-down-unready-time")
    private String scaleDownUnreadyTime;

    /**
     * The scaleDownUtilizationThreshold property.
     */
    @JsonProperty(value = "scale-down-utilization-threshold")
    private String scaleDownUtilizationThreshold;

    /**
     * The maxGracefulTerminationSec property.
     */
    @JsonProperty(value = "max-graceful-termination-sec")
    private String maxGracefulTerminationSec;

    /**
     * Get the balanceSimilarNodeGroups value.
     *
     * @return the balanceSimilarNodeGroups value
     */
    public String balanceSimilarNodeGroups() {
        return this.balanceSimilarNodeGroups;
    }

    /**
     * Set the balanceSimilarNodeGroups value.
     *
     * @param balanceSimilarNodeGroups the balanceSimilarNodeGroups value to set
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withBalanceSimilarNodeGroups(String balanceSimilarNodeGroups) {
        this.balanceSimilarNodeGroups = balanceSimilarNodeGroups;
        return this;
    }

    /**
     * Get the scanInterval value.
     *
     * @return the scanInterval value
     */
    public String scanInterval() {
        return this.scanInterval;
    }

    /**
     * Set the scanInterval value.
     *
     * @param scanInterval the scanInterval value to set
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScanInterval(String scanInterval) {
        this.scanInterval = scanInterval;
        return this;
    }

    /**
     * Get the scaleDownDelayAfterAdd value.
     *
     * @return the scaleDownDelayAfterAdd value
     */
    public String scaleDownDelayAfterAdd() {
        return this.scaleDownDelayAfterAdd;
    }

    /**
     * Set the scaleDownDelayAfterAdd value.
     *
     * @param scaleDownDelayAfterAdd the scaleDownDelayAfterAdd value to set
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownDelayAfterAdd(String scaleDownDelayAfterAdd) {
        this.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
        return this;
    }

    /**
     * Get the scaleDownDelayAfterDelete value.
     *
     * @return the scaleDownDelayAfterDelete value
     */
    public String scaleDownDelayAfterDelete() {
        return this.scaleDownDelayAfterDelete;
    }

    /**
     * Set the scaleDownDelayAfterDelete value.
     *
     * @param scaleDownDelayAfterDelete the scaleDownDelayAfterDelete value to set
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownDelayAfterDelete(String scaleDownDelayAfterDelete) {
        this.scaleDownDelayAfterDelete = scaleDownDelayAfterDelete;
        return this;
    }

    /**
     * Get the scaleDownDelayAfterFailure value.
     *
     * @return the scaleDownDelayAfterFailure value
     */
    public String scaleDownDelayAfterFailure() {
        return this.scaleDownDelayAfterFailure;
    }

    /**
     * Set the scaleDownDelayAfterFailure value.
     *
     * @param scaleDownDelayAfterFailure the scaleDownDelayAfterFailure value to set
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownDelayAfterFailure(String scaleDownDelayAfterFailure) {
        this.scaleDownDelayAfterFailure = scaleDownDelayAfterFailure;
        return this;
    }

    /**
     * Get the scaleDownUnneededTime value.
     *
     * @return the scaleDownUnneededTime value
     */
    public String scaleDownUnneededTime() {
        return this.scaleDownUnneededTime;
    }

    /**
     * Set the scaleDownUnneededTime value.
     *
     * @param scaleDownUnneededTime the scaleDownUnneededTime value to set
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownUnneededTime(String scaleDownUnneededTime) {
        this.scaleDownUnneededTime = scaleDownUnneededTime;
        return this;
    }

    /**
     * Get the scaleDownUnreadyTime value.
     *
     * @return the scaleDownUnreadyTime value
     */
    public String scaleDownUnreadyTime() {
        return this.scaleDownUnreadyTime;
    }

    /**
     * Set the scaleDownUnreadyTime value.
     *
     * @param scaleDownUnreadyTime the scaleDownUnreadyTime value to set
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownUnreadyTime(String scaleDownUnreadyTime) {
        this.scaleDownUnreadyTime = scaleDownUnreadyTime;
        return this;
    }

    /**
     * Get the scaleDownUtilizationThreshold value.
     *
     * @return the scaleDownUtilizationThreshold value
     */
    public String scaleDownUtilizationThreshold() {
        return this.scaleDownUtilizationThreshold;
    }

    /**
     * Set the scaleDownUtilizationThreshold value.
     *
     * @param scaleDownUtilizationThreshold the scaleDownUtilizationThreshold value to set
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withScaleDownUtilizationThreshold(String scaleDownUtilizationThreshold) {
        this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
        return this;
    }

    /**
     * Get the maxGracefulTerminationSec value.
     *
     * @return the maxGracefulTerminationSec value
     */
    public String maxGracefulTerminationSec() {
        return this.maxGracefulTerminationSec;
    }

    /**
     * Set the maxGracefulTerminationSec value.
     *
     * @param maxGracefulTerminationSec the maxGracefulTerminationSec value to set
     * @return the ManagedClusterPropertiesAutoScalerProfile object itself.
     */
    public ManagedClusterPropertiesAutoScalerProfile withMaxGracefulTerminationSec(String maxGracefulTerminationSec) {
        this.maxGracefulTerminationSec = maxGracefulTerminationSec;
        return this;
    }

}
