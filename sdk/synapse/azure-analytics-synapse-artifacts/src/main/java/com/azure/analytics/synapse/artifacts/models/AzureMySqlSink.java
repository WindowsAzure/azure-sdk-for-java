// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Azure MySql sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureMySqlSink")
@Fluent
public final class AzureMySqlSink extends CopySink {
    /*
     * A query to execute before starting the copy. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /**
     * Get the preCopyScript property: A query to execute before starting the copy. Type: string (or Expression with
     * resultType string).
     *
     * @return the preCopyScript value.
     */
    public Object getPreCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set the preCopyScript property: A query to execute before starting the copy. Type: string (or Expression with
     * resultType string).
     *
     * @param preCopyScript the preCopyScript value to set.
     * @return the AzureMySqlSink object itself.
     */
    public AzureMySqlSink setPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }
}
