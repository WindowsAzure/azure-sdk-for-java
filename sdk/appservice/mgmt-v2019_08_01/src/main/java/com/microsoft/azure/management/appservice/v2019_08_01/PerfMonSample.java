/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Performance monitor sample in a set.
 */
public class PerfMonSample {
    /**
     * Point in time for which counter was measured.
     */
    @JsonProperty(value = "time")
    private DateTime time;

    /**
     * Name of the server on which the measurement is made.
     */
    @JsonProperty(value = "instanceName")
    private String instanceName;

    /**
     * Value of counter at a certain time.
     */
    @JsonProperty(value = "value")
    private Double value;

    /**
     * Get point in time for which counter was measured.
     *
     * @return the time value
     */
    public DateTime time() {
        return this.time;
    }

    /**
     * Set point in time for which counter was measured.
     *
     * @param time the time value to set
     * @return the PerfMonSample object itself.
     */
    public PerfMonSample withTime(DateTime time) {
        this.time = time;
        return this;
    }

    /**
     * Get name of the server on which the measurement is made.
     *
     * @return the instanceName value
     */
    public String instanceName() {
        return this.instanceName;
    }

    /**
     * Set name of the server on which the measurement is made.
     *
     * @param instanceName the instanceName value to set
     * @return the PerfMonSample object itself.
     */
    public PerfMonSample withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * Get value of counter at a certain time.
     *
     * @return the value value
     */
    public Double value() {
        return this.value;
    }

    /**
     * Set value of counter at a certain time.
     *
     * @param value the value value to set
     * @return the PerfMonSample object itself.
     */
    public PerfMonSample withValue(Double value) {
        this.value = value;
        return this;
    }

}
