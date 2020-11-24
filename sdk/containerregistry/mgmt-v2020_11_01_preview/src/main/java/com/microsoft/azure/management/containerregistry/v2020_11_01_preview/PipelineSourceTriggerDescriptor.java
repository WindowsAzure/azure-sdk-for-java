/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PipelineSourceTriggerDescriptor model.
 */
public class PipelineSourceTriggerDescriptor {
    /**
     * The timestamp when the source update happened.
     */
    @JsonProperty(value = "timestamp")
    private DateTime timestamp;

    /**
     * Get the timestamp when the source update happened.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp when the source update happened.
     *
     * @param timestamp the timestamp value to set
     * @return the PipelineSourceTriggerDescriptor object itself.
     */
    public PipelineSourceTriggerDescriptor withTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

}
