// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Trigger referenced dependency. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = TriggerDependencyReference.class)
@JsonTypeName("TriggerDependencyReference")
@JsonSubTypes({
    @JsonSubTypes.Type(
            name = "TumblingWindowTriggerDependencyReference",
            value = TumblingWindowTriggerDependencyReference.class)
})
@Fluent
public class TriggerDependencyReference extends DependencyReference {
    /*
     * Referenced trigger.
     */
    @JsonProperty(value = "referenceTrigger", required = true)
    private TriggerReference referenceTrigger;

    /**
     * Get the referenceTrigger property: Referenced trigger.
     *
     * @return the referenceTrigger value.
     */
    public TriggerReference getReferenceTrigger() {
        return this.referenceTrigger;
    }

    /**
     * Set the referenceTrigger property: Referenced trigger.
     *
     * @param referenceTrigger the referenceTrigger value to set.
     * @return the TriggerDependencyReference object itself.
     */
    public TriggerDependencyReference setReferenceTrigger(TriggerReference referenceTrigger) {
        this.referenceTrigger = referenceTrigger;
        return this;
    }
}
