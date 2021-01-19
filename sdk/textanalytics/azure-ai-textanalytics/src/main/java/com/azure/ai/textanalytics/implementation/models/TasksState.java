// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TasksState model. */
@Fluent
public class TasksState {
    /*
     * The tasks property.
     */
    @JsonProperty(value = "tasks", required = true)
    private TasksStateTasks tasks;

    /**
     * Get the tasks property: The tasks property.
     *
     * @return the tasks value.
     */
    public TasksStateTasks getTasks() {
        return this.tasks;
    }

    /**
     * Set the tasks property: The tasks property.
     *
     * @param tasks the tasks value to set.
     * @return the TasksState object itself.
     */
    public TasksState setTasks(TasksStateTasks tasks) {
        this.tasks = tasks;
        return this;
    }
}
