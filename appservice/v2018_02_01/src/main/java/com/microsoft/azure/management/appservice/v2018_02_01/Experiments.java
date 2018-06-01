/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Routing rules in production experiments.
 */
public class Experiments {
    /**
     * List of ramp-up rules.
     */
    @JsonProperty(value = "rampUpRules")
    private List<RampUpRule> rampUpRules;

    /**
     * Get the rampUpRules value.
     *
     * @return the rampUpRules value
     */
    public List<RampUpRule> rampUpRules() {
        return this.rampUpRules;
    }

    /**
     * Set the rampUpRules value.
     *
     * @param rampUpRules the rampUpRules value to set
     * @return the Experiments object itself.
     */
    public Experiments withRampUpRules(List<RampUpRule> rampUpRules) {
        this.rampUpRules = rampUpRules;
        return this;
    }

}
