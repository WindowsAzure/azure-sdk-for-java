/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The blob service properties for blob restore policy.
 */
public class RestorePolicyProperties {
    /**
     * Blob restore is enabled if set to true.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /**
     * how long this blob can be restored. It should be great than zero and
     * less than DeleteRetentionPolicy.days.
     */
    @JsonProperty(value = "days")
    private Integer days;

    /**
     * Deprecated in favor of minRestoreTime property.
     */
    @JsonProperty(value = "lastEnabledTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastEnabledTime;

    /**
     * Returns the minimum date and time that the restore can be started.
     */
    @JsonProperty(value = "minRestoreTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime minRestoreTime;

    /**
     * Get blob restore is enabled if set to true.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set blob restore is enabled if set to true.
     *
     * @param enabled the enabled value to set
     * @return the RestorePolicyProperties object itself.
     */
    public RestorePolicyProperties withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get how long this blob can be restored. It should be great than zero and less than DeleteRetentionPolicy.days.
     *
     * @return the days value
     */
    public Integer days() {
        return this.days;
    }

    /**
     * Set how long this blob can be restored. It should be great than zero and less than DeleteRetentionPolicy.days.
     *
     * @param days the days value to set
     * @return the RestorePolicyProperties object itself.
     */
    public RestorePolicyProperties withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * Get deprecated in favor of minRestoreTime property.
     *
     * @return the lastEnabledTime value
     */
    public DateTime lastEnabledTime() {
        return this.lastEnabledTime;
    }

    /**
     * Get returns the minimum date and time that the restore can be started.
     *
     * @return the minRestoreTime value
     */
    public DateTime minRestoreTime() {
        return this.minRestoreTime;
    }

}
