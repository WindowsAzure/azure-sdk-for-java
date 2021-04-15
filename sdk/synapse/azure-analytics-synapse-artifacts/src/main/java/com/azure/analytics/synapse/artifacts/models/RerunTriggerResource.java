// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RerunTrigger resource type. */
@Fluent
public final class RerunTriggerResource extends SubResource {
    /*
     * Properties of the rerun trigger.
     */
    @JsonProperty(value = "properties", required = true)
    private RerunTumblingWindowTrigger properties;

    /**
     * Get the properties property: Properties of the rerun trigger.
     *
     * @return the properties value.
     */
    public RerunTumblingWindowTrigger getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the rerun trigger.
     *
     * @param properties the properties value to set.
     * @return the RerunTriggerResource object itself.
     */
    public RerunTriggerResource setProperties(RerunTumblingWindowTrigger properties) {
        this.properties = properties;
        return this;
    }
}
