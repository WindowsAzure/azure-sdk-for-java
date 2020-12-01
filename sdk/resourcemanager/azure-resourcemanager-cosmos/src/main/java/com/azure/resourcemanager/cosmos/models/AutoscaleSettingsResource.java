// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB provisioned throughput settings object. */
@Fluent
public final class AutoscaleSettingsResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutoscaleSettingsResource.class);

    /*
     * Represents maximum throughput container can scale up to.
     */
    @JsonProperty(value = "maxThroughput", required = true)
    private int maxThroughput;

    /*
     * Cosmos DB resource auto-upgrade policy
     */
    @JsonProperty(value = "autoUpgradePolicy")
    private AutoUpgradePolicyResource autoUpgradePolicy;

    /*
     * Represents target maximum throughput container can scale up to once
     * offer is no longer in pending state.
     */
    @JsonProperty(value = "targetMaxThroughput", access = JsonProperty.Access.WRITE_ONLY)
    private Integer targetMaxThroughput;

    /**
     * Get the maxThroughput property: Represents maximum throughput container can scale up to.
     *
     * @return the maxThroughput value.
     */
    public int maxThroughput() {
        return this.maxThroughput;
    }

    /**
     * Set the maxThroughput property: Represents maximum throughput container can scale up to.
     *
     * @param maxThroughput the maxThroughput value to set.
     * @return the AutoscaleSettingsResource object itself.
     */
    public AutoscaleSettingsResource withMaxThroughput(int maxThroughput) {
        this.maxThroughput = maxThroughput;
        return this;
    }

    /**
     * Get the autoUpgradePolicy property: Cosmos DB resource auto-upgrade policy.
     *
     * @return the autoUpgradePolicy value.
     */
    public AutoUpgradePolicyResource autoUpgradePolicy() {
        return this.autoUpgradePolicy;
    }

    /**
     * Set the autoUpgradePolicy property: Cosmos DB resource auto-upgrade policy.
     *
     * @param autoUpgradePolicy the autoUpgradePolicy value to set.
     * @return the AutoscaleSettingsResource object itself.
     */
    public AutoscaleSettingsResource withAutoUpgradePolicy(AutoUpgradePolicyResource autoUpgradePolicy) {
        this.autoUpgradePolicy = autoUpgradePolicy;
        return this;
    }

    /**
     * Get the targetMaxThroughput property: Represents target maximum throughput container can scale up to once offer
     * is no longer in pending state.
     *
     * @return the targetMaxThroughput value.
     */
    public Integer targetMaxThroughput() {
        return this.targetMaxThroughput;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (autoUpgradePolicy() != null) {
            autoUpgradePolicy().validate();
        }
    }
}
