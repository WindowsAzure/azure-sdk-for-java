// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Base class for all triggers that support one to many model for trigger to pipeline. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = MultiplePipelineTrigger.class)
@JsonTypeName("MultiplePipelineTrigger")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ScheduleTrigger", value = ScheduleTrigger.class),
    @JsonSubTypes.Type(name = "BlobTrigger", value = BlobTrigger.class),
    @JsonSubTypes.Type(name = "BlobEventsTrigger", value = BlobEventsTrigger.class)
})
@Fluent
public class MultiplePipelineTrigger extends Trigger {
    /*
     * Pipelines that need to be started.
     */
    @JsonProperty(value = "pipelines")
    private List<TriggerPipelineReference> pipelines;

    /**
     * Get the pipelines property: Pipelines that need to be started.
     *
     * @return the pipelines value.
     */
    public List<TriggerPipelineReference> getPipelines() {
        return this.pipelines;
    }

    /**
     * Set the pipelines property: Pipelines that need to be started.
     *
     * @param pipelines the pipelines value to set.
     * @return the MultiplePipelineTrigger object itself.
     */
    public MultiplePipelineTrigger setPipelines(List<TriggerPipelineReference> pipelines) {
        this.pipelines = pipelines;
        return this;
    }
}
