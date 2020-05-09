/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a source based trigger.
 */
public class SourceTrigger {
    /**
     * The properties that describes the source(code) for the task.
     */
    @JsonProperty(value = "sourceRepository", required = true)
    private SourceProperties sourceRepository;

    /**
     * The source event corresponding to the trigger.
     */
    @JsonProperty(value = "sourceTriggerEvents", required = true)
    private List<SourceTriggerEvent> sourceTriggerEvents;

    /**
     * The current status of trigger. Possible values include: 'Enabled',
     * 'Disabled'.
     */
    @JsonProperty(value = "status")
    private TriggerStatus status;

    /**
     * The name of the trigger.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the properties that describes the source(code) for the task.
     *
     * @return the sourceRepository value
     */
    public SourceProperties sourceRepository() {
        return this.sourceRepository;
    }

    /**
     * Set the properties that describes the source(code) for the task.
     *
     * @param sourceRepository the sourceRepository value to set
     * @return the SourceTrigger object itself.
     */
    public SourceTrigger withSourceRepository(SourceProperties sourceRepository) {
        this.sourceRepository = sourceRepository;
        return this;
    }

    /**
     * Get the source event corresponding to the trigger.
     *
     * @return the sourceTriggerEvents value
     */
    public List<SourceTriggerEvent> sourceTriggerEvents() {
        return this.sourceTriggerEvents;
    }

    /**
     * Set the source event corresponding to the trigger.
     *
     * @param sourceTriggerEvents the sourceTriggerEvents value to set
     * @return the SourceTrigger object itself.
     */
    public SourceTrigger withSourceTriggerEvents(List<SourceTriggerEvent> sourceTriggerEvents) {
        this.sourceTriggerEvents = sourceTriggerEvents;
        return this;
    }

    /**
     * Get the current status of trigger. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the status value
     */
    public TriggerStatus status() {
        return this.status;
    }

    /**
     * Set the current status of trigger. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param status the status value to set
     * @return the SourceTrigger object itself.
     */
    public SourceTrigger withStatus(TriggerStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the name of the trigger.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the trigger.
     *
     * @param name the name value to set
     * @return the SourceTrigger object itself.
     */
    public SourceTrigger withName(String name) {
        this.name = name;
        return this;
    }

}
