// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration parameters used while performing a rolling upgrade. */
@Fluent
public final class RollingUpgradePolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RollingUpgradePolicy.class);

    /*
     * The maximum percent of total virtual machine instances that will be
     * upgraded simultaneously by the rolling upgrade in one batch. As this is
     * a maximum, unhealthy instances in previous or future batches can cause
     * the percentage of instances in a batch to decrease to ensure higher
     * reliability. The default value for this parameter is 20%.
     */
    @JsonProperty(value = "maxBatchInstancePercent")
    private Integer maxBatchInstancePercent;

    /*
     * The maximum percentage of the total virtual machine instances in the
     * scale set that can be simultaneously unhealthy, either as a result of
     * being upgraded, or by being found in an unhealthy state by the virtual
     * machine health checks before the rolling upgrade aborts. This constraint
     * will be checked prior to starting any batch. The default value for this
     * parameter is 20%.
     */
    @JsonProperty(value = "maxUnhealthyInstancePercent")
    private Integer maxUnhealthyInstancePercent;

    /*
     * The maximum percentage of upgraded virtual machine instances that can be
     * found to be in an unhealthy state. This check will happen after each
     * batch is upgraded. If this percentage is ever exceeded, the rolling
     * update aborts. The default value for this parameter is 20%.
     */
    @JsonProperty(value = "maxUnhealthyUpgradedInstancePercent")
    private Integer maxUnhealthyUpgradedInstancePercent;

    /*
     * The wait time between completing the update for all virtual machines in
     * one batch and starting the next batch. The time duration should be
     * specified in ISO 8601 format. The default value is 0 seconds (PT0S).
     */
    @JsonProperty(value = "pauseTimeBetweenBatches")
    private String pauseTimeBetweenBatches;

    /*
     * Allow VMSS to ignore AZ boundaries when constructing upgrade batches.
     * Take into consideration the Update Domain and maxBatchInstancePercent to
     * determine the batch size.
     */
    @JsonProperty(value = "enableCrossZoneUpgrade")
    private Boolean enableCrossZoneUpgrade;

    /*
     * Upgrade all unhealthy instances in a scale set before any healthy
     * instances.
     */
    @JsonProperty(value = "prioritizeUnhealthyInstances")
    private Boolean prioritizeUnhealthyInstances;

    /**
     * Get the maxBatchInstancePercent property: The maximum percent of total virtual machine instances that will be
     * upgraded simultaneously by the rolling upgrade in one batch. As this is a maximum, unhealthy instances in
     * previous or future batches can cause the percentage of instances in a batch to decrease to ensure higher
     * reliability. The default value for this parameter is 20%.
     *
     * @return the maxBatchInstancePercent value.
     */
    public Integer maxBatchInstancePercent() {
        return this.maxBatchInstancePercent;
    }

    /**
     * Set the maxBatchInstancePercent property: The maximum percent of total virtual machine instances that will be
     * upgraded simultaneously by the rolling upgrade in one batch. As this is a maximum, unhealthy instances in
     * previous or future batches can cause the percentage of instances in a batch to decrease to ensure higher
     * reliability. The default value for this parameter is 20%.
     *
     * @param maxBatchInstancePercent the maxBatchInstancePercent value to set.
     * @return the RollingUpgradePolicy object itself.
     */
    public RollingUpgradePolicy withMaxBatchInstancePercent(Integer maxBatchInstancePercent) {
        this.maxBatchInstancePercent = maxBatchInstancePercent;
        return this;
    }

    /**
     * Get the maxUnhealthyInstancePercent property: The maximum percentage of the total virtual machine instances in
     * the scale set that can be simultaneously unhealthy, either as a result of being upgraded, or by being found in an
     * unhealthy state by the virtual machine health checks before the rolling upgrade aborts. This constraint will be
     * checked prior to starting any batch. The default value for this parameter is 20%.
     *
     * @return the maxUnhealthyInstancePercent value.
     */
    public Integer maxUnhealthyInstancePercent() {
        return this.maxUnhealthyInstancePercent;
    }

    /**
     * Set the maxUnhealthyInstancePercent property: The maximum percentage of the total virtual machine instances in
     * the scale set that can be simultaneously unhealthy, either as a result of being upgraded, or by being found in an
     * unhealthy state by the virtual machine health checks before the rolling upgrade aborts. This constraint will be
     * checked prior to starting any batch. The default value for this parameter is 20%.
     *
     * @param maxUnhealthyInstancePercent the maxUnhealthyInstancePercent value to set.
     * @return the RollingUpgradePolicy object itself.
     */
    public RollingUpgradePolicy withMaxUnhealthyInstancePercent(Integer maxUnhealthyInstancePercent) {
        this.maxUnhealthyInstancePercent = maxUnhealthyInstancePercent;
        return this;
    }

    /**
     * Get the maxUnhealthyUpgradedInstancePercent property: The maximum percentage of upgraded virtual machine
     * instances that can be found to be in an unhealthy state. This check will happen after each batch is upgraded. If
     * this percentage is ever exceeded, the rolling update aborts. The default value for this parameter is 20%.
     *
     * @return the maxUnhealthyUpgradedInstancePercent value.
     */
    public Integer maxUnhealthyUpgradedInstancePercent() {
        return this.maxUnhealthyUpgradedInstancePercent;
    }

    /**
     * Set the maxUnhealthyUpgradedInstancePercent property: The maximum percentage of upgraded virtual machine
     * instances that can be found to be in an unhealthy state. This check will happen after each batch is upgraded. If
     * this percentage is ever exceeded, the rolling update aborts. The default value for this parameter is 20%.
     *
     * @param maxUnhealthyUpgradedInstancePercent the maxUnhealthyUpgradedInstancePercent value to set.
     * @return the RollingUpgradePolicy object itself.
     */
    public RollingUpgradePolicy withMaxUnhealthyUpgradedInstancePercent(Integer maxUnhealthyUpgradedInstancePercent) {
        this.maxUnhealthyUpgradedInstancePercent = maxUnhealthyUpgradedInstancePercent;
        return this;
    }

    /**
     * Get the pauseTimeBetweenBatches property: The wait time between completing the update for all virtual machines in
     * one batch and starting the next batch. The time duration should be specified in ISO 8601 format. The default
     * value is 0 seconds (PT0S).
     *
     * @return the pauseTimeBetweenBatches value.
     */
    public String pauseTimeBetweenBatches() {
        return this.pauseTimeBetweenBatches;
    }

    /**
     * Set the pauseTimeBetweenBatches property: The wait time between completing the update for all virtual machines in
     * one batch and starting the next batch. The time duration should be specified in ISO 8601 format. The default
     * value is 0 seconds (PT0S).
     *
     * @param pauseTimeBetweenBatches the pauseTimeBetweenBatches value to set.
     * @return the RollingUpgradePolicy object itself.
     */
    public RollingUpgradePolicy withPauseTimeBetweenBatches(String pauseTimeBetweenBatches) {
        this.pauseTimeBetweenBatches = pauseTimeBetweenBatches;
        return this;
    }

    /**
     * Get the enableCrossZoneUpgrade property: Allow VMSS to ignore AZ boundaries when constructing upgrade batches.
     * Take into consideration the Update Domain and maxBatchInstancePercent to determine the batch size.
     *
     * @return the enableCrossZoneUpgrade value.
     */
    public Boolean enableCrossZoneUpgrade() {
        return this.enableCrossZoneUpgrade;
    }

    /**
     * Set the enableCrossZoneUpgrade property: Allow VMSS to ignore AZ boundaries when constructing upgrade batches.
     * Take into consideration the Update Domain and maxBatchInstancePercent to determine the batch size.
     *
     * @param enableCrossZoneUpgrade the enableCrossZoneUpgrade value to set.
     * @return the RollingUpgradePolicy object itself.
     */
    public RollingUpgradePolicy withEnableCrossZoneUpgrade(Boolean enableCrossZoneUpgrade) {
        this.enableCrossZoneUpgrade = enableCrossZoneUpgrade;
        return this;
    }

    /**
     * Get the prioritizeUnhealthyInstances property: Upgrade all unhealthy instances in a scale set before any healthy
     * instances.
     *
     * @return the prioritizeUnhealthyInstances value.
     */
    public Boolean prioritizeUnhealthyInstances() {
        return this.prioritizeUnhealthyInstances;
    }

    /**
     * Set the prioritizeUnhealthyInstances property: Upgrade all unhealthy instances in a scale set before any healthy
     * instances.
     *
     * @param prioritizeUnhealthyInstances the prioritizeUnhealthyInstances value to set.
     * @return the RollingUpgradePolicy object itself.
     */
    public RollingUpgradePolicy withPrioritizeUnhealthyInstances(Boolean prioritizeUnhealthyInstances) {
        this.prioritizeUnhealthyInstances = prioritizeUnhealthyInstances;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
