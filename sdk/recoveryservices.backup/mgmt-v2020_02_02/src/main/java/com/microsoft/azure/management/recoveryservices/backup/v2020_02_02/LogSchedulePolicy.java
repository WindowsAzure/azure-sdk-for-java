/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Log policy schedule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "schedulePolicyType", defaultImpl = LogSchedulePolicy.class)
@JsonTypeName("LogSchedulePolicy")
public class LogSchedulePolicy extends SchedulePolicy {
    /**
     * Frequency of the log schedule operation of this policy in minutes.
     */
    @JsonProperty(value = "scheduleFrequencyInMins")
    private Integer scheduleFrequencyInMins;

    /**
     * Get frequency of the log schedule operation of this policy in minutes.
     *
     * @return the scheduleFrequencyInMins value
     */
    public Integer scheduleFrequencyInMins() {
        return this.scheduleFrequencyInMins;
    }

    /**
     * Set frequency of the log schedule operation of this policy in minutes.
     *
     * @param scheduleFrequencyInMins the scheduleFrequencyInMins value to set
     * @return the LogSchedulePolicy object itself.
     */
    public LogSchedulePolicy withScheduleFrequencyInMins(Integer scheduleFrequencyInMins) {
        this.scheduleFrequencyInMins = scheduleFrequencyInMins;
        return this;
    }

}
