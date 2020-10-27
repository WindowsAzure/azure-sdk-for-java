/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01.implementation;

import java.util.List;
import com.microsoft.azure.management.compute.v2019_07_01.InstanceViewStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RunCommandResultInner model.
 */
public class RunCommandResultInner {
    /**
     * Run command operation response.
     */
    @JsonProperty(value = "value")
    private List<InstanceViewStatus> value;

    /**
     * Get run command operation response.
     *
     * @return the value value
     */
    public List<InstanceViewStatus> value() {
        return this.value;
    }

    /**
     * Set run command operation response.
     *
     * @param value the value value to set
     * @return the RunCommandResultInner object itself.
     */
    public RunCommandResultInner withValue(List<InstanceViewStatus> value) {
        this.value = value;
        return this;
    }

}
