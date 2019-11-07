/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB resource throughput object.
 */
public class ThroughputSettingsResource {
    /**
     * Value of the Cosmos DB resource throughput.
     */
    @JsonProperty(value = "throughput", required = true)
    private int throughput;

    /**
     * The minimum throughput of the resource.
     */
    @JsonProperty(value = "minimumThroughput", access = JsonProperty.Access.WRITE_ONLY)
    private String minimumThroughput;

    /**
     * The throughput replace is pending.
     */
    @JsonProperty(value = "offerReplacePending", access = JsonProperty.Access.WRITE_ONLY)
    private String offerReplacePending;

    /**
     * Get value of the Cosmos DB resource throughput.
     *
     * @return the throughput value
     */
    public int throughput() {
        return this.throughput;
    }

    /**
     * Set value of the Cosmos DB resource throughput.
     *
     * @param throughput the throughput value to set
     * @return the ThroughputSettingsResource object itself.
     */
    public ThroughputSettingsResource withThroughput(int throughput) {
        this.throughput = throughput;
        return this;
    }

    /**
     * Get the minimum throughput of the resource.
     *
     * @return the minimumThroughput value
     */
    public String minimumThroughput() {
        return this.minimumThroughput;
    }

    /**
     * Get the throughput replace is pending.
     *
     * @return the offerReplacePending value
     */
    public String offerReplacePending() {
        return this.offerReplacePending;
    }

}
