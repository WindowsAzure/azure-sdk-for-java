// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The TasksStateTasks model.
 */
@Fluent
public final class TasksStateTasks {
    /*
     * The details property.
     */
    @JsonProperty(value = "details")
    private List<TaskState> details;

    /*
     * The completed property.
     */
    @JsonProperty(value = "completed", required = true)
    private int completed;

    /*
     * The failed property.
     */
    @JsonProperty(value = "failed", required = true)
    private int failed;

    /*
     * The inProgress property.
     */
    @JsonProperty(value = "inProgress", required = true)
    private int inProgress;

    /*
     * The total property.
     */
    @JsonProperty(value = "total", required = true)
    private int total;

    /*
     * The entityRecognitionTasks property.
     */
    @JsonProperty(value = "entityRecognitionTasks")
    private List<TasksStateTasksEntityRecognitionTasksItem> entityRecognitionTasks;

    /*
     * The entityRecognitionPiiTasks property.
     */
    @JsonProperty(value = "entityRecognitionPiiTasks")
    private List<TasksStateTasksEntityRecognitionPiiTasksItem> entityRecognitionPiiTasks;

    /*
     * The keyPhraseExtractionTasks property.
     */
    @JsonProperty(value = "keyPhraseExtractionTasks")
    private List<TasksStateTasksKeyPhraseExtractionTasksItem> keyPhraseExtractionTasks;

    /**
     * Get the details property: The details property.
     * 
     * @return the details value.
     */
    public List<TaskState> getDetails() {
        return this.details;
    }

    /**
     * Set the details property: The details property.
     * 
     * @param details the details value to set.
     * @return the TasksStateTasks object itself.
     */
    public TasksStateTasks setDetails(List<TaskState> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the completed property: The completed property.
     * 
     * @return the completed value.
     */
    public int getCompleted() {
        return this.completed;
    }

    /**
     * Set the completed property: The completed property.
     * 
     * @param completed the completed value to set.
     * @return the TasksStateTasks object itself.
     */
    public TasksStateTasks setCompleted(int completed) {
        this.completed = completed;
        return this;
    }

    /**
     * Get the failed property: The failed property.
     * 
     * @return the failed value.
     */
    public int getFailed() {
        return this.failed;
    }

    /**
     * Set the failed property: The failed property.
     * 
     * @param failed the failed value to set.
     * @return the TasksStateTasks object itself.
     */
    public TasksStateTasks setFailed(int failed) {
        this.failed = failed;
        return this;
    }

    /**
     * Get the inProgress property: The inProgress property.
     * 
     * @return the inProgress value.
     */
    public int getInProgress() {
        return this.inProgress;
    }

    /**
     * Set the inProgress property: The inProgress property.
     * 
     * @param inProgress the inProgress value to set.
     * @return the TasksStateTasks object itself.
     */
    public TasksStateTasks setInProgress(int inProgress) {
        this.inProgress = inProgress;
        return this;
    }

    /**
     * Get the total property: The total property.
     * 
     * @return the total value.
     */
    public int getTotal() {
        return this.total;
    }

    /**
     * Set the total property: The total property.
     * 
     * @param total the total value to set.
     * @return the TasksStateTasks object itself.
     */
    public TasksStateTasks setTotal(int total) {
        this.total = total;
        return this;
    }

    /**
     * Get the entityRecognitionTasks property: The entityRecognitionTasks
     * property.
     * 
     * @return the entityRecognitionTasks value.
     */
    public List<TasksStateTasksEntityRecognitionTasksItem> getEntityRecognitionTasks() {
        return this.entityRecognitionTasks;
    }

    /**
     * Set the entityRecognitionTasks property: The entityRecognitionTasks
     * property.
     * 
     * @param entityRecognitionTasks the entityRecognitionTasks value to set.
     * @return the TasksStateTasks object itself.
     */
    public TasksStateTasks setEntityRecognitionTasks(List<TasksStateTasksEntityRecognitionTasksItem> entityRecognitionTasks) {
        this.entityRecognitionTasks = entityRecognitionTasks;
        return this;
    }

    /**
     * Get the entityRecognitionPiiTasks property: The
     * entityRecognitionPiiTasks property.
     * 
     * @return the entityRecognitionPiiTasks value.
     */
    public List<TasksStateTasksEntityRecognitionPiiTasksItem> getEntityRecognitionPiiTasks() {
        return this.entityRecognitionPiiTasks;
    }

    /**
     * Set the entityRecognitionPiiTasks property: The
     * entityRecognitionPiiTasks property.
     * 
     * @param entityRecognitionPiiTasks the entityRecognitionPiiTasks value to
     * set.
     * @return the TasksStateTasks object itself.
     */
    public TasksStateTasks setEntityRecognitionPiiTasks(List<TasksStateTasksEntityRecognitionPiiTasksItem> entityRecognitionPiiTasks) {
        this.entityRecognitionPiiTasks = entityRecognitionPiiTasks;
        return this;
    }

    /**
     * Get the keyPhraseExtractionTasks property: The keyPhraseExtractionTasks
     * property.
     * 
     * @return the keyPhraseExtractionTasks value.
     */
    public List<TasksStateTasksKeyPhraseExtractionTasksItem> getKeyPhraseExtractionTasks() {
        return this.keyPhraseExtractionTasks;
    }

    /**
     * Set the keyPhraseExtractionTasks property: The keyPhraseExtractionTasks
     * property.
     * 
     * @param keyPhraseExtractionTasks the keyPhraseExtractionTasks value to
     * set.
     * @return the TasksStateTasks object itself.
     */
    public TasksStateTasks setKeyPhraseExtractionTasks(List<TasksStateTasksKeyPhraseExtractionTasksItem> keyPhraseExtractionTasks) {
        this.keyPhraseExtractionTasks = keyPhraseExtractionTasks;
        return this;
    }
}
