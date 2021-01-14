// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SSIS execution parameter. */
@Fluent
public final class SsisExecutionParameter {
    /*
     * SSIS package execution parameter value. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "value", required = true)
    private Object value;

    /**
     * Get the value property: SSIS package execution parameter value. Type: string (or Expression with resultType
     * string).
     *
     * @return the value value.
     */
    public Object getValue() {
        return this.value;
    }

    /**
     * Set the value property: SSIS package execution parameter value. Type: string (or Expression with resultType
     * string).
     *
     * @param value the value value to set.
     * @return the SsisExecutionParameter object itself.
     */
    public SsisExecutionParameter setValue(Object value) {
        this.value = value;
        return this;
    }
}
