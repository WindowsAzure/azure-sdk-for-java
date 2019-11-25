/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_03_20;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The core summary of a search.
 */
public class CoreSummary {
    /**
     * The status of a core summary.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The number of documents of a core summary.
     */
    @JsonProperty(value = "numberOfDocuments", required = true)
    private long numberOfDocuments;

    /**
     * Get the status of a core summary.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status of a core summary.
     *
     * @param status the status value to set
     * @return the CoreSummary object itself.
     */
    public CoreSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the number of documents of a core summary.
     *
     * @return the numberOfDocuments value
     */
    public long numberOfDocuments() {
        return this.numberOfDocuments;
    }

    /**
     * Set the number of documents of a core summary.
     *
     * @param numberOfDocuments the numberOfDocuments value to set
     * @return the CoreSummary object itself.
     */
    public CoreSummary withNumberOfDocuments(long numberOfDocuments) {
        this.numberOfDocuments = numberOfDocuments;
        return this;
    }

}
