/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Constraints associated with the Job.
 */
public class JobPropertiesConstraints {
    /**
     * Max time the job can run.
     * Default Value = 1 week.
     */
    @JsonProperty(value = "maxWallClockTime")
    private Period maxWallClockTime;

    /**
     * Get default Value = 1 week.
     *
     * @return the maxWallClockTime value
     */
    public Period maxWallClockTime() {
        return this.maxWallClockTime;
    }

    /**
     * Set default Value = 1 week.
     *
     * @param maxWallClockTime the maxWallClockTime value to set
     * @return the JobPropertiesConstraints object itself.
     */
    public JobPropertiesConstraints withMaxWallClockTime(Period maxWallClockTime) {
        this.maxWallClockTime = maxWallClockTime;
        return this;
    }

}
