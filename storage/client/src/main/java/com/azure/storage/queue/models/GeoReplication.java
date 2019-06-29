// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.models;

import com.azure.core.implementation.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * The GeoReplication model.
 */
@JacksonXmlRootElement(localName = "GeoReplication")
public final class GeoReplication {
    /*
     * The status of the secondary location. Possible values include: 'live',
     * 'bootstrap', 'unavailable'
     */
    @JsonProperty(value = "Status", required = true)
    private GeoReplicationStatusType status;

    /*
     * A GMT date/time value, to the second. All primary writes preceding this
     * value are guaranteed to be available for read operations at the
     * secondary. Primary writes after this point in time may or may not be
     * available for reads.
     */
    @JsonProperty(value = "LastSyncTime", required = true)
    private DateTimeRfc1123 lastSyncTime;

    /**
     * Get the status property: The status of the secondary location. Possible
     * values include: 'live', 'bootstrap', 'unavailable'.
     *
     * @return the status value.
     */
    public GeoReplicationStatusType status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the secondary location. Possible
     * values include: 'live', 'bootstrap', 'unavailable'.
     *
     * @param status the status value to set.
     * @return the GeoReplication object itself.
     */
    public GeoReplication status(GeoReplicationStatusType status) {
        this.status = status;
        return this;
    }

    /**
     * Get the lastSyncTime property: A GMT date/time value, to the second. All
     * primary writes preceding this value are guaranteed to be available for
     * read operations at the secondary. Primary writes after this point in
     * time may or may not be available for reads.
     *
     * @return the lastSyncTime value.
     */
    public OffsetDateTime lastSyncTime() {
        if (this.lastSyncTime == null) {
            return null;
        }
        return this.lastSyncTime.dateTime();
    }

    /**
     * Set the lastSyncTime property: A GMT date/time value, to the second. All
     * primary writes preceding this value are guaranteed to be available for
     * read operations at the secondary. Primary writes after this point in
     * time may or may not be available for reads.
     *
     * @param lastSyncTime the lastSyncTime value to set.
     * @return the GeoReplication object itself.
     */
    public GeoReplication lastSyncTime(OffsetDateTime lastSyncTime) {
        if (lastSyncTime == null) {
            this.lastSyncTime = null;
        } else {
            this.lastSyncTime = new DateTimeRfc1123(lastSyncTime);
        }
        return this;
    }
}
