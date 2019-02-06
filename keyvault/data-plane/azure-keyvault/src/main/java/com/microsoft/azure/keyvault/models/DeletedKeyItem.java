// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The deleted key item containing the deleted key metadata and information
 * about deletion.
 */
public class DeletedKeyItem extends KeyItem {
    /**
     * The url of the recovery object, used to identify and recover the deleted
     * key.
     */
    @JsonProperty(value = "recoveryId")
    private String recoveryId;

    /**
     * The time when the key is scheduled to be purged, in UTC.
     */
    @JsonProperty(value = "scheduledPurgeDate", access = JsonProperty.Access.WRITE_ONLY)
    private Long scheduledPurgeDate;

    /**
     * The time when the key was deleted, in UTC.
     */
    @JsonProperty(value = "deletedDate", access = JsonProperty.Access.WRITE_ONLY)
    private Long deletedDate;

    /**
     * Get the recoveryId value.
     *
     * @return the recoveryId value
     */
    public String recoveryId() {
        return this.recoveryId;
    }

    /**
     * Set the recoveryId value.
     *
     * @param recoveryId the recoveryId value to set
     * @return the DeletedKeyItem object itself.
     */
    public DeletedKeyItem withRecoveryId(String recoveryId) {
        this.recoveryId = recoveryId;
        return this;
    }

    /**
     * Get the scheduledPurgeDate value.
     *
     * @return the scheduledPurgeDate value
     */
    public DateTime scheduledPurgeDate() {
        if (this.scheduledPurgeDate == null) {
            return null;
        }
        return new DateTime(this.scheduledPurgeDate * 1000L, DateTimeZone.UTC);
    }

    /**
     * Get the deletedDate value.
     *
     * @return the deletedDate value
     */
    public DateTime deletedDate() {
        if (this.deletedDate == null) {
            return null;
        }
        return new DateTime(this.deletedDate * 1000L, DateTimeZone.UTC);
    }

}
