/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import java.util.Map;
import com.microsoft.azure.management.datafactory.v2018_06_01.TriggerRuntimeState;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Azure data factory nested object which contains information about creating
 * pipeline run.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = TriggerInner.class)
@JsonTypeName("Trigger")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "RerunTumblingWindowTrigger", value = RerunTumblingWindowTrigger.class),
    @JsonSubTypes.Type(name = "ChainingTrigger", value = ChainingTrigger.class),
    @JsonSubTypes.Type(name = "TumblingWindowTrigger", value = TumblingWindowTrigger.class),
    @JsonSubTypes.Type(name = "MultiplePipelineTrigger", value = MultiplePipelineTrigger.class)
})
public class TriggerInner {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Trigger description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are
     * called on the Trigger. Possible values include: 'Started', 'Stopped',
     * 'Disabled'.
     */
    @JsonProperty(value = "runtimeState", access = JsonProperty.Access.WRITE_ONLY)
    private TriggerRuntimeState runtimeState;

    /**
     * List of tags that can be used for describing the trigger.
     */
    @JsonProperty(value = "annotations")
    private List<Object> annotations;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the TriggerInner object itself.
     */
    public TriggerInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get trigger description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set trigger description.
     *
     * @param description the description value to set
     * @return the TriggerInner object itself.
     */
    public TriggerInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger. Possible values include: 'Started', 'Stopped', 'Disabled'.
     *
     * @return the runtimeState value
     */
    public TriggerRuntimeState runtimeState() {
        return this.runtimeState;
    }

    /**
     * Get list of tags that can be used for describing the trigger.
     *
     * @return the annotations value
     */
    public List<Object> annotations() {
        return this.annotations;
    }

    /**
     * Set list of tags that can be used for describing the trigger.
     *
     * @param annotations the annotations value to set
     * @return the TriggerInner object itself.
     */
    public TriggerInner withAnnotations(List<Object> annotations) {
        this.annotations = annotations;
        return this;
    }

}
