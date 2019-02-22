// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result of listing the subtasks of a task.
 */
public class CloudTaskListSubtasksResult {
    /**
     * The list of subtasks.
     */
    @JsonProperty(value = "value")
    private List<SubtaskInformation> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<SubtaskInformation> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the CloudTaskListSubtasksResult object itself.
     */
    public CloudTaskListSubtasksResult withValue(List<SubtaskInformation> value) {
        this.value = value;
        return this;
    }

}
