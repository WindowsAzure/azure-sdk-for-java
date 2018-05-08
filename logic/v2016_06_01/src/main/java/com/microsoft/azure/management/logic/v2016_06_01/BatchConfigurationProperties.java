/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The batch configuration properties definition.
 */
public class BatchConfigurationProperties extends ArtifactProperties {
    /**
     * The name of the batch group.
     */
    @JsonProperty(value = "batchGroupName", required = true)
    private String batchGroupName;

    /**
     * The batch release criteria.
     */
    @JsonProperty(value = "releaseCriteria", required = true)
    private BatchReleaseCriteria releaseCriteria;

    /**
     * Get the batchGroupName value.
     *
     * @return the batchGroupName value
     */
    public String batchGroupName() {
        return this.batchGroupName;
    }

    /**
     * Set the batchGroupName value.
     *
     * @param batchGroupName the batchGroupName value to set
     * @return the BatchConfigurationProperties object itself.
     */
    public BatchConfigurationProperties withBatchGroupName(String batchGroupName) {
        this.batchGroupName = batchGroupName;
        return this;
    }

    /**
     * Get the releaseCriteria value.
     *
     * @return the releaseCriteria value
     */
    public BatchReleaseCriteria releaseCriteria() {
        return this.releaseCriteria;
    }

    /**
     * Set the releaseCriteria value.
     *
     * @param releaseCriteria the releaseCriteria value to set
     * @return the BatchConfigurationProperties object itself.
     */
    public BatchConfigurationProperties withReleaseCriteria(BatchReleaseCriteria releaseCriteria) {
        this.releaseCriteria = releaseCriteria;
        return this;
    }

}
