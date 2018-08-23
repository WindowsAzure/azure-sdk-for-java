/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters for updating a task.
 */
@JsonFlatten
public class TaskUpdateParameters {
    /**
     * The current status of task. Possible values include: 'Disabled',
     * 'Enabled'.
     */
    @JsonProperty(value = "properties.status")
    private TaskStatus status;

    /**
     * The platform properties against which the run has to happen.
     */
    @JsonProperty(value = "properties.platform")
    private PlatformUpdateParameters platform;

    /**
     * The machine configuration of the run agent.
     */
    @JsonProperty(value = "properties.agentConfiguration")
    private AgentProperties agentConfiguration;

    /**
     * Run timeout in seconds.
     */
    @JsonProperty(value = "properties.timeout")
    private Integer timeout;

    /**
     * The properties for updating a task step.
     */
    @JsonProperty(value = "properties.step")
    private TaskStepUpdateParameters step;

    /**
     * The properties for updating trigger properties.
     */
    @JsonProperty(value = "properties.trigger")
    private TriggerUpdateParameters trigger;

    /**
     * The ARM resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the current status of task. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the status value
     */
    public TaskStatus status() {
        return this.status;
    }

    /**
     * Set the current status of task. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param status the status value to set
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withStatus(TaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the platform properties against which the run has to happen.
     *
     * @return the platform value
     */
    public PlatformUpdateParameters platform() {
        return this.platform;
    }

    /**
     * Set the platform properties against which the run has to happen.
     *
     * @param platform the platform value to set
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withPlatform(PlatformUpdateParameters platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the machine configuration of the run agent.
     *
     * @return the agentConfiguration value
     */
    public AgentProperties agentConfiguration() {
        return this.agentConfiguration;
    }

    /**
     * Set the machine configuration of the run agent.
     *
     * @param agentConfiguration the agentConfiguration value to set
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withAgentConfiguration(AgentProperties agentConfiguration) {
        this.agentConfiguration = agentConfiguration;
        return this;
    }

    /**
     * Get run timeout in seconds.
     *
     * @return the timeout value
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set run timeout in seconds.
     *
     * @param timeout the timeout value to set
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the properties for updating a task step.
     *
     * @return the step value
     */
    public TaskStepUpdateParameters step() {
        return this.step;
    }

    /**
     * Set the properties for updating a task step.
     *
     * @param step the step value to set
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withStep(TaskStepUpdateParameters step) {
        this.step = step;
        return this;
    }

    /**
     * Get the properties for updating trigger properties.
     *
     * @return the trigger value
     */
    public TriggerUpdateParameters trigger() {
        return this.trigger;
    }

    /**
     * Set the properties for updating trigger properties.
     *
     * @param trigger the trigger value to set
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withTrigger(TriggerUpdateParameters trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Get the ARM resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the ARM resource tags.
     *
     * @param tags the tags value to set
     * @return the TaskUpdateParameters object itself.
     */
    public TaskUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
