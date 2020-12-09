// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The SparkBatchJob model. */
@Fluent
public final class SparkBatchJob {
    /*
     * The livyInfo property.
     */
    @JsonProperty(value = "livyInfo")
    private SparkBatchJobState livyInfo;

    /*
     * The batch name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The workspace name.
     */
    @JsonProperty(value = "workspaceName")
    private String workspaceName;

    /*
     * The Spark pool name.
     */
    @JsonProperty(value = "sparkPoolName")
    private String sparkPoolName;

    /*
     * The submitter name.
     */
    @JsonProperty(value = "submitterName")
    private String submitterName;

    /*
     * The submitter identifier.
     */
    @JsonProperty(value = "submitterId")
    private String submitterId;

    /*
     * The artifact identifier.
     */
    @JsonProperty(value = "artifactId")
    private String artifactId;

    /*
     * The job type.
     */
    @JsonProperty(value = "jobType")
    private SparkJobType jobType;

    /*
     * The Spark batch job result.
     */
    @JsonProperty(value = "result")
    private SparkBatchJobResultType result;

    /*
     * The scheduler information.
     */
    @JsonProperty(value = "schedulerInfo")
    private SparkScheduler scheduler;

    /*
     * The plugin information.
     */
    @JsonProperty(value = "pluginInfo")
    private SparkServicePlugin plugin;

    /*
     * The error information.
     */
    @JsonProperty(value = "errorInfo")
    private List<SparkServiceError> errors;

    /*
     * The tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The session Id.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /*
     * The application id of this session
     */
    @JsonProperty(value = "appId")
    private String appId;

    /*
     * The detailed application info.
     */
    @JsonProperty(value = "appInfo")
    private Map<String, String> appInfo;

    /*
     * The batch state
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * The log lines.
     */
    @JsonProperty(value = "log")
    private List<String> logLines;

    /**
     * Get the livyInfo property: The livyInfo property.
     *
     * @return the livyInfo value.
     */
    public SparkBatchJobState getLivyInfo() {
        return this.livyInfo;
    }

    /**
     * Set the livyInfo property: The livyInfo property.
     *
     * @param livyInfo the livyInfo value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setLivyInfo(SparkBatchJobState livyInfo) {
        this.livyInfo = livyInfo;
        return this;
    }

    /**
     * Get the name property: The batch name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The batch name.
     *
     * @param name the name value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the workspaceName property: The workspace name.
     *
     * @return the workspaceName value.
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * Set the workspaceName property: The workspace name.
     *
     * @param workspaceName the workspaceName value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    /**
     * Get the sparkPoolName property: The Spark pool name.
     *
     * @return the sparkPoolName value.
     */
    public String getSparkPoolName() {
        return this.sparkPoolName;
    }

    /**
     * Set the sparkPoolName property: The Spark pool name.
     *
     * @param sparkPoolName the sparkPoolName value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setSparkPoolName(String sparkPoolName) {
        this.sparkPoolName = sparkPoolName;
        return this;
    }

    /**
     * Get the submitterName property: The submitter name.
     *
     * @return the submitterName value.
     */
    public String getSubmitterName() {
        return this.submitterName;
    }

    /**
     * Set the submitterName property: The submitter name.
     *
     * @param submitterName the submitterName value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setSubmitterName(String submitterName) {
        this.submitterName = submitterName;
        return this;
    }

    /**
     * Get the submitterId property: The submitter identifier.
     *
     * @return the submitterId value.
     */
    public String getSubmitterId() {
        return this.submitterId;
    }

    /**
     * Set the submitterId property: The submitter identifier.
     *
     * @param submitterId the submitterId value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
        return this;
    }

    /**
     * Get the artifactId property: The artifact identifier.
     *
     * @return the artifactId value.
     */
    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * Set the artifactId property: The artifact identifier.
     *
     * @param artifactId the artifactId value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    /**
     * Get the jobType property: The job type.
     *
     * @return the jobType value.
     */
    public SparkJobType getJobType() {
        return this.jobType;
    }

    /**
     * Set the jobType property: The job type.
     *
     * @param jobType the jobType value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setJobType(SparkJobType jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get the result property: The Spark batch job result.
     *
     * @return the result value.
     */
    public SparkBatchJobResultType getResult() {
        return this.result;
    }

    /**
     * Set the result property: The Spark batch job result.
     *
     * @param result the result value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setResult(SparkBatchJobResultType result) {
        this.result = result;
        return this;
    }

    /**
     * Get the scheduler property: The scheduler information.
     *
     * @return the scheduler value.
     */
    public SparkScheduler getScheduler() {
        return this.scheduler;
    }

    /**
     * Set the scheduler property: The scheduler information.
     *
     * @param scheduler the scheduler value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setScheduler(SparkScheduler scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    /**
     * Get the plugin property: The plugin information.
     *
     * @return the plugin value.
     */
    public SparkServicePlugin getPlugin() {
        return this.plugin;
    }

    /**
     * Set the plugin property: The plugin information.
     *
     * @param plugin the plugin value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setPlugin(SparkServicePlugin plugin) {
        this.plugin = plugin;
        return this;
    }

    /**
     * Get the errors property: The error information.
     *
     * @return the errors value.
     */
    public List<SparkServiceError> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: The error information.
     *
     * @param errors the errors value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setErrors(List<SparkServiceError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the tags property: The tags.
     *
     * @return the tags value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags.
     *
     * @param tags the tags value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the id property: The session Id.
     *
     * @return the id value.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set the id property: The session Id.
     *
     * @param id the id value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get the appId property: The application id of this session.
     *
     * @return the appId value.
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * Set the appId property: The application id of this session.
     *
     * @param appId the appId value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the appInfo property: The detailed application info.
     *
     * @return the appInfo value.
     */
    public Map<String, String> getAppInfo() {
        return this.appInfo;
    }

    /**
     * Set the appInfo property: The detailed application info.
     *
     * @param appInfo the appInfo value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setAppInfo(Map<String, String> appInfo) {
        this.appInfo = appInfo;
        return this;
    }

    /**
     * Get the state property: The batch state.
     *
     * @return the state value.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Set the state property: The batch state.
     *
     * @param state the state value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the logLines property: The log lines.
     *
     * @return the logLines value.
     */
    public List<String> getLogLines() {
        return this.logLines;
    }

    /**
     * Set the logLines property: The log lines.
     *
     * @param logLines the logLines value to set.
     * @return the SparkBatchJob object itself.
     */
    public SparkBatchJob setLogLines(List<String> logLines) {
        this.logLines = logLines;
        return this;
    }
}
