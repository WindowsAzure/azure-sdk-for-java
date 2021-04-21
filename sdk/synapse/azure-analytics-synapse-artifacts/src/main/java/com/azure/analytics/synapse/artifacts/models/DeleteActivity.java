// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Delete activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Delete")
@JsonFlatten
@Fluent
public class DeleteActivity extends ExecutionActivity {
    /*
     * If true, files or sub-folders under current folder path will be deleted
     * recursively. Default is false. Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "typeProperties.recursive")
    private Object recursive;

    /*
     * The max concurrent connections to connect data source at the same time.
     */
    @JsonProperty(value = "typeProperties.maxConcurrentConnections")
    private Integer maxConcurrentConnections;

    /*
     * Whether to record detailed logs of delete-activity execution. Default
     * value is false. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.enableLogging")
    private Object enableLogging;

    /*
     * Log storage settings customer need to provide when enableLogging is
     * true.
     */
    @JsonProperty(value = "typeProperties.logStorageSettings")
    private LogStorageSettings logStorageSettings;

    /*
     * Delete activity dataset reference.
     */
    @JsonProperty(value = "typeProperties.dataset", required = true)
    private DatasetReference dataset;

    /*
     * Delete activity store settings.
     */
    @JsonProperty(value = "typeProperties.storeSettings")
    private StoreReadSettings storeSettings;

    /**
     * Get the recursive property: If true, files or sub-folders under current folder path will be deleted recursively.
     * Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the recursive value.
     */
    public Object getRecursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files or sub-folders under current folder path will be deleted recursively.
     * Default is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param recursive the recursive value to set.
     * @return the DeleteActivity object itself.
     */
    public DeleteActivity setRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the maxConcurrentConnections property: The max concurrent connections to connect data source at the same
     * time.
     *
     * @return the maxConcurrentConnections value.
     */
    public Integer getMaxConcurrentConnections() {
        return this.maxConcurrentConnections;
    }

    /**
     * Set the maxConcurrentConnections property: The max concurrent connections to connect data source at the same
     * time.
     *
     * @param maxConcurrentConnections the maxConcurrentConnections value to set.
     * @return the DeleteActivity object itself.
     */
    public DeleteActivity setMaxConcurrentConnections(Integer maxConcurrentConnections) {
        this.maxConcurrentConnections = maxConcurrentConnections;
        return this;
    }

    /**
     * Get the enableLogging property: Whether to record detailed logs of delete-activity execution. Default value is
     * false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableLogging value.
     */
    public Object getEnableLogging() {
        return this.enableLogging;
    }

    /**
     * Set the enableLogging property: Whether to record detailed logs of delete-activity execution. Default value is
     * false. Type: boolean (or Expression with resultType boolean).
     *
     * @param enableLogging the enableLogging value to set.
     * @return the DeleteActivity object itself.
     */
    public DeleteActivity setEnableLogging(Object enableLogging) {
        this.enableLogging = enableLogging;
        return this;
    }

    /**
     * Get the logStorageSettings property: Log storage settings customer need to provide when enableLogging is true.
     *
     * @return the logStorageSettings value.
     */
    public LogStorageSettings getLogStorageSettings() {
        return this.logStorageSettings;
    }

    /**
     * Set the logStorageSettings property: Log storage settings customer need to provide when enableLogging is true.
     *
     * @param logStorageSettings the logStorageSettings value to set.
     * @return the DeleteActivity object itself.
     */
    public DeleteActivity setLogStorageSettings(LogStorageSettings logStorageSettings) {
        this.logStorageSettings = logStorageSettings;
        return this;
    }

    /**
     * Get the dataset property: Delete activity dataset reference.
     *
     * @return the dataset value.
     */
    public DatasetReference getDataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: Delete activity dataset reference.
     *
     * @param dataset the dataset value to set.
     * @return the DeleteActivity object itself.
     */
    public DeleteActivity setDataset(DatasetReference dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get the storeSettings property: Delete activity store settings.
     *
     * @return the storeSettings value.
     */
    public StoreReadSettings getStoreSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: Delete activity store settings.
     *
     * @param storeSettings the storeSettings value to set.
     * @return the DeleteActivity object itself.
     */
    public DeleteActivity setStoreSettings(StoreReadSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }
}
