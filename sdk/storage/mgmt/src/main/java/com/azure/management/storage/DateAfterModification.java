// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DateAfterModification model.
 */
@Fluent
public final class DateAfterModification {
    /*
     * Value indicating the age in days after last modification
     */
    @JsonProperty(value = "daysAfterModificationGreaterThan", required = true)
    private float daysAfterModificationGreaterThan;

    /**
     * Get the daysAfterModificationGreaterThan property: Value indicating the
     * age in days after last modification.
     * 
     * @return the daysAfterModificationGreaterThan value.
     */
    public float getDaysAfterModificationGreaterThan() {
        return this.daysAfterModificationGreaterThan;
    }

    /**
     * Set the daysAfterModificationGreaterThan property: Value indicating the
     * age in days after last modification.
     * 
     * @param daysAfterModificationGreaterThan the
     * daysAfterModificationGreaterThan value to set.
     * @return the DateAfterModification object itself.
     */
    public DateAfterModification setDaysAfterModificationGreaterThan(float daysAfterModificationGreaterThan) {
        this.daysAfterModificationGreaterThan = daysAfterModificationGreaterThan;
        return this;
    }
}
