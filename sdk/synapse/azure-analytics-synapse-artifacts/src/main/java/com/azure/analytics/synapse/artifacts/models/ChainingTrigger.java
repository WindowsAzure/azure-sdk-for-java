// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Trigger that allows the referenced pipeline to depend on other pipeline runs based on runDimension Name/Value pairs.
 * Upstream pipelines should declare the same runDimension Name and their runs should have the values for those
 * runDimensions. The referenced pipeline run would be triggered if the values for the runDimension match for all
 * upstream pipeline runs.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ChainingTrigger")
@JsonFlatten
@Fluent
public class ChainingTrigger extends Trigger {
    /*
     * Pipeline for which runs are created when all upstream pipelines complete
     * successfully.
     */
    @JsonProperty(value = "pipeline", required = true)
    private TriggerPipelineReference pipeline;

    /*
     * Upstream Pipelines.
     */
    @JsonProperty(value = "typeProperties.dependsOn", required = true)
    private List<PipelineReference> dependsOn;

    /*
     * Run Dimension property that needs to be emitted by upstream pipelines.
     */
    @JsonProperty(value = "typeProperties.runDimension", required = true)
    private String runDimension;

    /**
     * Get the pipeline property: Pipeline for which runs are created when all upstream pipelines complete successfully.
     *
     * @return the pipeline value.
     */
    public TriggerPipelineReference getPipeline() {
        return this.pipeline;
    }

    /**
     * Set the pipeline property: Pipeline for which runs are created when all upstream pipelines complete successfully.
     *
     * @param pipeline the pipeline value to set.
     * @return the ChainingTrigger object itself.
     */
    public ChainingTrigger setPipeline(TriggerPipelineReference pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Get the dependsOn property: Upstream Pipelines.
     *
     * @return the dependsOn value.
     */
    public List<PipelineReference> getDependsOn() {
        return this.dependsOn;
    }

    /**
     * Set the dependsOn property: Upstream Pipelines.
     *
     * @param dependsOn the dependsOn value to set.
     * @return the ChainingTrigger object itself.
     */
    public ChainingTrigger setDependsOn(List<PipelineReference> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Get the runDimension property: Run Dimension property that needs to be emitted by upstream pipelines.
     *
     * @return the runDimension value.
     */
    public String getRunDimension() {
        return this.runDimension;
    }

    /**
     * Set the runDimension property: Run Dimension property that needs to be emitted by upstream pipelines.
     *
     * @param runDimension the runDimension value to set.
     * @return the ChainingTrigger object itself.
     */
    public ChainingTrigger setRunDimension(String runDimension) {
        this.runDimension = runDimension;
        return this;
    }
}
