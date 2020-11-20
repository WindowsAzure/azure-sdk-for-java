/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of an hourly schedule.
 */
public class HourDetailsFragment {
    /**
     * Minutes of the hour the schedule will run.
     */
    @JsonProperty(value = "minute")
    private Integer minute;

    /**
     * Get minutes of the hour the schedule will run.
     *
     * @return the minute value
     */
    public Integer minute() {
        return this.minute;
    }

    /**
     * Set minutes of the hour the schedule will run.
     *
     * @param minute the minute value to set
     * @return the HourDetailsFragment object itself.
     */
    public HourDetailsFragment withMinute(Integer minute) {
        this.minute = minute;
        return this;
    }

}
