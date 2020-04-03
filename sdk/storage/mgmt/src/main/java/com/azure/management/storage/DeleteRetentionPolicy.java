// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DeleteRetentionPolicy model.
 */
@Fluent
public final class DeleteRetentionPolicy {
    /*
     * Indicates whether DeleteRetentionPolicy is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Indicates the number of days that the deleted item should be retained.
     * The minimum specified value can be 1 and the maximum value can be 365.
     */
    @JsonProperty(value = "days")
    private Integer days;

    /**
     * Get the enabled property: Indicates whether DeleteRetentionPolicy is
     * enabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether DeleteRetentionPolicy is
     * enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the DeleteRetentionPolicy object itself.
     */
    public DeleteRetentionPolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the days property: Indicates the number of days that the deleted
     * item should be retained. The minimum specified value can be 1 and the
     * maximum value can be 365.
     * 
     * @return the days value.
     */
    public Integer days() {
        return this.days;
    }

    /**
     * Set the days property: Indicates the number of days that the deleted
     * item should be retained. The minimum specified value can be 1 and the
     * maximum value can be 365.
     * 
     * @param days the days value to set.
     * @return the DeleteRetentionPolicy object itself.
     */
    public DeleteRetentionPolicy withDays(Integer days) {
        this.days = days;
        return this;
    }
}
