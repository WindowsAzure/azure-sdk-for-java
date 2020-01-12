/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2019_02_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sync Session status object.
 */
public class SyncActivityStatus {
    /**
     * Timestamp when properties were updated.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timestamp;

    /**
     * Per item error count.
     */
    @JsonProperty(value = "perItemErrorCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long perItemErrorCount;

    /**
     * Applied item count.
     */
    @JsonProperty(value = "appliedItemCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long appliedItemCount;

    /**
     * Total item count (if available).
     */
    @JsonProperty(value = "totalItemCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long totalItemCount;

    /**
     * Applied bytes.
     */
    @JsonProperty(value = "appliedBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long appliedBytes;

    /**
     * Total bytes (if available).
     */
    @JsonProperty(value = "totalBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long totalBytes;

    /**
     * Get timestamp when properties were updated.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get per item error count.
     *
     * @return the perItemErrorCount value
     */
    public Long perItemErrorCount() {
        return this.perItemErrorCount;
    }

    /**
     * Get applied item count.
     *
     * @return the appliedItemCount value
     */
    public Long appliedItemCount() {
        return this.appliedItemCount;
    }

    /**
     * Get total item count (if available).
     *
     * @return the totalItemCount value
     */
    public Long totalItemCount() {
        return this.totalItemCount;
    }

    /**
     * Get applied bytes.
     *
     * @return the appliedBytes value
     */
    public Long appliedBytes() {
        return this.appliedBytes;
    }

    /**
     * Get total bytes (if available).
     *
     * @return the totalBytes value
     */
    public Long totalBytes() {
        return this.totalBytes;
    }

}
