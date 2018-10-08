/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes a list of of inputs to a Job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.JobInputs")
public class JobInputs extends JobInput {
    /**
     * List of inputs to a Job.
     */
    @JsonProperty(value = "inputs")
    private List<JobInput> inputs;

    /**
     * Get list of inputs to a Job.
     *
     * @return the inputs value
     */
    public List<JobInput> inputs() {
        return this.inputs;
    }

    /**
     * Set list of inputs to a Job.
     *
     * @param inputs the inputs value to set
     * @return the JobInputs object itself.
     */
    public JobInputs withInputs(List<JobInput> inputs) {
        this.inputs = inputs;
        return this;
    }

}
