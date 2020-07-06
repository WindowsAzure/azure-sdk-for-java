/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB resource throughput policy.
 */
public class ThroughputPolicyResource {
    /**
     * Determines whether the ThroughputPolicy is active or not.
     */
    @JsonProperty(value = "isEnabled")
    private Boolean isEnabled;

    /**
     * Represents the percentage by which throughput can increase every time
     * throughput policy kicks in.
     */
    @JsonProperty(value = "incrementPercent")
    private Integer incrementPercent;

    /**
     * Get determines whether the ThroughputPolicy is active or not.
     *
     * @return the isEnabled value
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set determines whether the ThroughputPolicy is active or not.
     *
     * @param isEnabled the isEnabled value to set
     * @return the ThroughputPolicyResource object itself.
     */
    public ThroughputPolicyResource withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get represents the percentage by which throughput can increase every time throughput policy kicks in.
     *
     * @return the incrementPercent value
     */
    public Integer incrementPercent() {
        return this.incrementPercent;
    }

    /**
     * Set represents the percentage by which throughput can increase every time throughput policy kicks in.
     *
     * @param incrementPercent the incrementPercent value to set
     * @return the ThroughputPolicyResource object itself.
     */
    public ThroughputPolicyResource withIncrementPercent(Integer incrementPercent) {
        this.incrementPercent = incrementPercent;
        return this;
    }

}
