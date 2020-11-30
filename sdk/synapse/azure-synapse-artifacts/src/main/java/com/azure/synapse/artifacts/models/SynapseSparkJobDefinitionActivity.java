// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Execute spark job activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SparkJob")
@JsonFlatten
@Fluent
public class SynapseSparkJobDefinitionActivity extends Activity {
    /*
     * Synapse spark job reference.
     */
    @JsonProperty(value = "typeProperties.sparkJob", required = true)
    private SynapseSparkJobReference sparkJob;

    /**
     * Get the sparkJob property: Synapse spark job reference.
     *
     * @return the sparkJob value.
     */
    public SynapseSparkJobReference getSparkJob() {
        return this.sparkJob;
    }

    /**
     * Set the sparkJob property: Synapse spark job reference.
     *
     * @param sparkJob the sparkJob value to set.
     * @return the SynapseSparkJobDefinitionActivity object itself.
     */
    public SynapseSparkJobDefinitionActivity setSparkJob(SynapseSparkJobReference sparkJob) {
        this.sparkJob = sparkJob;
        return this;
    }
}
