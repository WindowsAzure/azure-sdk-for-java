/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result of adding a collection of Tasks to a Job.
 */
public class TaskAddCollectionResult {
    /**
     * The results of the add Task collection operation.
     */
    @JsonProperty(value = "value")
    private List<TaskAddResult> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<TaskAddResult> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the TaskAddCollectionResult object itself.
     */
    public TaskAddCollectionResult withValue(List<TaskAddResult> value) {
        this.value = value;
        return this;
    }

}
