/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Constraints associated with the Job.
 */
public class JobBasePropertiesConstraints {
    /**
     * Max time the job can run.
     * Default Value = 1 week.
     */
    @JsonProperty(value = "maxWallClockTime")
    private Period maxWallClockTime;

    /**
     * Get the maxWallClockTime value.
     *
     * @return the maxWallClockTime value
     */
    public Period maxWallClockTime() {
        return this.maxWallClockTime;
    }

    /**
     * Set the maxWallClockTime value.
     *
     * @param maxWallClockTime the maxWallClockTime value to set
     * @return the JobBasePropertiesConstraints object itself.
     */
    public JobBasePropertiesConstraints withMaxWallClockTime(Period maxWallClockTime) {
        this.maxWallClockTime = maxWallClockTime;
        return this;
    }

}
