/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The properties of a generic task run step.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("RunTask")
public class RunTaskStep extends TaskStepProperties {
    /**
     * Base64 encoded value of the template/definition file content.
     */
    @JsonProperty(value = "taskDefinitionContent", required = true)
    private String taskDefinitionContent;

    /**
     * Base64 encoded value of the parameters/values file content.
     */
    @JsonProperty(value = "valuesContent")
    private String valuesContent;

    /**
     * The collection of overridable values that can be passed when running a
     * task.
     */
    @JsonProperty(value = "values")
    private List<SetValue> values;

    /**
     * Get base64 encoded value of the template/definition file content.
     *
     * @return the taskDefinitionContent value
     */
    public String taskDefinitionContent() {
        return this.taskDefinitionContent;
    }

    /**
     * Set base64 encoded value of the template/definition file content.
     *
     * @param taskDefinitionContent the taskDefinitionContent value to set
     * @return the RunTaskStep object itself.
     */
    public RunTaskStep withTaskDefinitionContent(String taskDefinitionContent) {
        this.taskDefinitionContent = taskDefinitionContent;
        return this;
    }

    /**
     * Get base64 encoded value of the parameters/values file content.
     *
     * @return the valuesContent value
     */
    public String valuesContent() {
        return this.valuesContent;
    }

    /**
     * Set base64 encoded value of the parameters/values file content.
     *
     * @param valuesContent the valuesContent value to set
     * @return the RunTaskStep object itself.
     */
    public RunTaskStep withValuesContent(String valuesContent) {
        this.valuesContent = valuesContent;
        return this;
    }

    /**
     * Get the collection of overridable values that can be passed when running a task.
     *
     * @return the values value
     */
    public List<SetValue> values() {
        return this.values;
    }

    /**
     * Set the collection of overridable values that can be passed when running a task.
     *
     * @param values the values value to set
     * @return the RunTaskStep object itself.
     */
    public RunTaskStep withValues(List<SetValue> values) {
        this.values = values;
        return this;
    }

}
