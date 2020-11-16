/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The baseline values for a single sensitivity value.
 */
public class SingleBaseline {
    /**
     * the sensitivity of the baseline. Possible values include: 'Low',
     * 'Medium', 'High'.
     */
    @JsonProperty(value = "sensitivity", required = true)
    private BaselineSensitivity sensitivity;

    /**
     * The low thresholds of the baseline.
     */
    @JsonProperty(value = "lowThresholds", required = true)
    private List<Double> lowThresholds;

    /**
     * The high thresholds of the baseline.
     */
    @JsonProperty(value = "highThresholds", required = true)
    private List<Double> highThresholds;

    /**
     * Get the sensitivity of the baseline. Possible values include: 'Low', 'Medium', 'High'.
     *
     * @return the sensitivity value
     */
    public BaselineSensitivity sensitivity() {
        return this.sensitivity;
    }

    /**
     * Set the sensitivity of the baseline. Possible values include: 'Low', 'Medium', 'High'.
     *
     * @param sensitivity the sensitivity value to set
     * @return the SingleBaseline object itself.
     */
    public SingleBaseline withSensitivity(BaselineSensitivity sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }

    /**
     * Get the low thresholds of the baseline.
     *
     * @return the lowThresholds value
     */
    public List<Double> lowThresholds() {
        return this.lowThresholds;
    }

    /**
     * Set the low thresholds of the baseline.
     *
     * @param lowThresholds the lowThresholds value to set
     * @return the SingleBaseline object itself.
     */
    public SingleBaseline withLowThresholds(List<Double> lowThresholds) {
        this.lowThresholds = lowThresholds;
        return this;
    }

    /**
     * Get the high thresholds of the baseline.
     *
     * @return the highThresholds value
     */
    public List<Double> highThresholds() {
        return this.highThresholds;
    }

    /**
     * Set the high thresholds of the baseline.
     *
     * @param highThresholds the highThresholds value to set
     * @return the SingleBaseline object itself.
     */
    public SingleBaseline withHighThresholds(List<Double> highThresholds) {
        this.highThresholds = highThresholds;
        return this;
    }

}
