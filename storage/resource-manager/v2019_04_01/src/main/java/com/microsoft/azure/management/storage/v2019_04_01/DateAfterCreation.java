/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object to define the number of days after creation.
 */
public class DateAfterCreation {
    /**
     * Integer value indicating the age in days after creation.
     */
    @JsonProperty(value = "daysAfterCreationGreaterThan", required = true)
    private int daysAfterCreationGreaterThan;

    /**
     * Get integer value indicating the age in days after creation.
     *
     * @return the daysAfterCreationGreaterThan value
     */
    public int daysAfterCreationGreaterThan() {
        return this.daysAfterCreationGreaterThan;
    }

    /**
     * Set integer value indicating the age in days after creation.
     *
     * @param daysAfterCreationGreaterThan the daysAfterCreationGreaterThan value to set
     * @return the DateAfterCreation object itself.
     */
    public DateAfterCreation withDaysAfterCreationGreaterThan(int daysAfterCreationGreaterThan) {
        this.daysAfterCreationGreaterThan = daysAfterCreationGreaterThan;
        return this;
    }

}
