/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_07_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Statistics related to replication for storage account's Blob, Table, Queue
 * and File services. It is only available when geo-redundant replication is
 * enabled for the storage account.
 */
public class GeoReplicationStats {
    /**
     * The status of the secondary location. Possible values are: - Live:
     * Indicates that the secondary location is active and operational. -
     * Bootstrap: Indicates initial synchronization from the primary location
     * to the secondary location is in progress.This typically occurs when
     * replication is first enabled. - Unavailable: Indicates that the
     * secondary location is temporarily unavailable. Possible values include:
     * 'Live', 'Bootstrap', 'Unavailable'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private GeoReplicationStatus status;

    /**
     * All primary writes preceding this UTC date/time value are guaranteed to
     * be available for read operations. Primary writes following this point in
     * time may or may not be available for reads. Element may be default value
     * if value of LastSyncTime is not available, this can happen if secondary
     * is offline or we are in bootstrap.
     */
    @JsonProperty(value = "lastSyncTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastSyncTime;

    /**
     * A boolean flag which indicates whether or not account failover is
     * supported for the account.
     */
    @JsonProperty(value = "canFailover", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean canFailover;

    /**
     * Get the status of the secondary location. Possible values are: - Live: Indicates that the secondary location is active and operational. - Bootstrap: Indicates initial synchronization from the primary location to the secondary location is in progress.This typically occurs when replication is first enabled. - Unavailable: Indicates that the secondary location is temporarily unavailable. Possible values include: 'Live', 'Bootstrap', 'Unavailable'.
     *
     * @return the status value
     */
    public GeoReplicationStatus status() {
        return this.status;
    }

    /**
     * Get all primary writes preceding this UTC date/time value are guaranteed to be available for read operations. Primary writes following this point in time may or may not be available for reads. Element may be default value if value of LastSyncTime is not available, this can happen if secondary is offline or we are in bootstrap.
     *
     * @return the lastSyncTime value
     */
    public DateTime lastSyncTime() {
        return this.lastSyncTime;
    }

    /**
     * Get a boolean flag which indicates whether or not account failover is supported for the account.
     *
     * @return the canFailover value
     */
    public Boolean canFailover() {
        return this.canFailover;
    }

}
