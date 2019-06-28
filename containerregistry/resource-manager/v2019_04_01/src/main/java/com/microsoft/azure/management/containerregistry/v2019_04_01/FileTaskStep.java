/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The properties of a task step.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FileTask")
public class FileTaskStep extends TaskStepProperties {
    /**
     * The task template/definition file path relative to the source context.
     */
    @JsonProperty(value = "taskFilePath", required = true)
    private String taskFilePath;

    /**
     * The task values/parameters file path relative to the source context.
     */
    @JsonProperty(value = "valuesFilePath")
    private String valuesFilePath;

    /**
     * The collection of overridable values that can be passed when running a
     * task.
     */
    @JsonProperty(value = "values")
    private List<SetValue> values;

    /**
     * Get the task template/definition file path relative to the source context.
     *
     * @return the taskFilePath value
     */
    public String taskFilePath() {
        return this.taskFilePath;
    }

    /**
     * Set the task template/definition file path relative to the source context.
     *
     * @param taskFilePath the taskFilePath value to set
     * @return the FileTaskStep object itself.
     */
    public FileTaskStep withTaskFilePath(String taskFilePath) {
        this.taskFilePath = taskFilePath;
        return this;
    }

    /**
     * Get the task values/parameters file path relative to the source context.
     *
     * @return the valuesFilePath value
     */
    public String valuesFilePath() {
        return this.valuesFilePath;
    }

    /**
     * Set the task values/parameters file path relative to the source context.
     *
     * @param valuesFilePath the valuesFilePath value to set
     * @return the FileTaskStep object itself.
     */
    public FileTaskStep withValuesFilePath(String valuesFilePath) {
        this.valuesFilePath = valuesFilePath;
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
     * @return the FileTaskStep object itself.
     */
    public FileTaskStep withValues(List<SetValue> values) {
        this.values = values;
        return this;
    }

}
