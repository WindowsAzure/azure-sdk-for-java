// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * The FileTaskStepUpdateParameters model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FileTask")
@Fluent
public final class FileTaskStepUpdateParameters extends TaskStepUpdateParameters {
    /*
     * The task template/definition file path relative to the source context.
     */
    @JsonProperty(value = "taskFilePath")
    private String taskFilePath;

    /*
     * The values/parameters file path relative to the source context.
     */
    @JsonProperty(value = "valuesFilePath")
    private String valuesFilePath;

    /*
     * The collection of overridable values that can be passed when running a
     * task.
     */
    @JsonProperty(value = "values")
    private List<SetValue> values;

    /**
     * Get the taskFilePath property: The task template/definition file path
     * relative to the source context.
     * 
     * @return the taskFilePath value.
     */
    public String taskFilePath() {
        return this.taskFilePath;
    }

    /**
     * Set the taskFilePath property: The task template/definition file path
     * relative to the source context.
     * 
     * @param taskFilePath the taskFilePath value to set.
     * @return the FileTaskStepUpdateParameters object itself.
     */
    public FileTaskStepUpdateParameters withTaskFilePath(String taskFilePath) {
        this.taskFilePath = taskFilePath;
        return this;
    }

    /**
     * Get the valuesFilePath property: The values/parameters file path
     * relative to the source context.
     * 
     * @return the valuesFilePath value.
     */
    public String valuesFilePath() {
        return this.valuesFilePath;
    }

    /**
     * Set the valuesFilePath property: The values/parameters file path
     * relative to the source context.
     * 
     * @param valuesFilePath the valuesFilePath value to set.
     * @return the FileTaskStepUpdateParameters object itself.
     */
    public FileTaskStepUpdateParameters withValuesFilePath(String valuesFilePath) {
        this.valuesFilePath = valuesFilePath;
        return this;
    }

    /**
     * Get the values property: The collection of overridable values that can
     * be passed when running a task.
     * 
     * @return the values value.
     */
    public List<SetValue> values() {
        return this.values;
    }

    /**
     * Set the values property: The collection of overridable values that can
     * be passed when running a task.
     * 
     * @param values the values value to set.
     * @return the FileTaskStepUpdateParameters object itself.
     */
    public FileTaskStepUpdateParameters withValues(List<SetValue> values) {
        this.values = values;
        return this;
    }
}
