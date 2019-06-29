// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * the retention policy which determines how long the associated data should
 * persist.
 */
@JacksonXmlRootElement(localName = "RetentionPolicy")
public final class RetentionPolicy {
    /*
     * Indicates whether a retention policy is enabled for the storage service
     */
    @JsonProperty(value = "Enabled", required = true)
    private boolean enabled;

    /*
     * Indicates the number of days that metrics or logging or soft-deleted
     * data should be retained. All data older than this value will be deleted
     */
    @JsonProperty(value = "Days")
    private Integer days;

    /**
     * Get the enabled property: Indicates whether a retention policy is
     * enabled for the storage service.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether a retention policy is
     * enabled for the storage service.
     *
     * @param enabled the enabled value to set.
     * @return the RetentionPolicy object itself.
     */
    public RetentionPolicy enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the days property: Indicates the number of days that metrics or
     * logging or soft-deleted data should be retained. All data older than
     * this value will be deleted.
     *
     * @return the days value.
     */
    public Integer days() {
        return this.days;
    }

    /**
     * Set the days property: Indicates the number of days that metrics or
     * logging or soft-deleted data should be retained. All data older than
     * this value will be deleted.
     *
     * @param days the days value to set.
     * @return the RetentionPolicy object itself.
     */
    public RetentionPolicy days(Integer days) {
        this.days = days;
        return this;
    }
}
