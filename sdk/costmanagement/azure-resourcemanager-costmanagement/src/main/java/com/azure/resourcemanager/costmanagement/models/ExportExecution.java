// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** A export execution. */
@JsonFlatten
@Fluent
public class ExportExecution extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExportExecution.class);

    /*
     * The type of the export execution.
     */
    @JsonProperty(value = "properties.executionType")
    private ExecutionType executionType;

    /*
     * The status of the export execution.
     */
    @JsonProperty(value = "properties.status")
    private ExecutionStatus status;

    /*
     * The identifier for the entity that executed the export. For OnDemand
     * executions, it is the email id. For Scheduled executions, it is the
     * constant value - System.
     */
    @JsonProperty(value = "properties.submittedBy")
    private String submittedBy;

    /*
     * The time when export was queued to be executed.
     */
    @JsonProperty(value = "properties.submittedTime")
    private OffsetDateTime submittedTime;

    /*
     * The time when export was picked up to be executed.
     */
    @JsonProperty(value = "properties.processingStartTime")
    private OffsetDateTime processingStartTime;

    /*
     * The time when export execution finished.
     */
    @JsonProperty(value = "properties.processingEndTime")
    private OffsetDateTime processingEndTime;

    /*
     * The name of the file export got written to.
     */
    @JsonProperty(value = "properties.fileName")
    private String fileName;

    /*
     * The common properties of the export.
     */
    @JsonProperty(value = "properties.runSettings")
    private CommonExportProperties runSettings;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the executionType property: The type of the export execution.
     *
     * @return the executionType value.
     */
    public ExecutionType executionType() {
        return this.executionType;
    }

    /**
     * Set the executionType property: The type of the export execution.
     *
     * @param executionType the executionType value to set.
     * @return the ExportExecution object itself.
     */
    public ExportExecution withExecutionType(ExecutionType executionType) {
        this.executionType = executionType;
        return this;
    }

    /**
     * Get the status property: The status of the export execution.
     *
     * @return the status value.
     */
    public ExecutionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the export execution.
     *
     * @param status the status value to set.
     * @return the ExportExecution object itself.
     */
    public ExportExecution withStatus(ExecutionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the submittedBy property: The identifier for the entity that executed the export. For OnDemand executions, it
     * is the email id. For Scheduled executions, it is the constant value - System.
     *
     * @return the submittedBy value.
     */
    public String submittedBy() {
        return this.submittedBy;
    }

    /**
     * Set the submittedBy property: The identifier for the entity that executed the export. For OnDemand executions, it
     * is the email id. For Scheduled executions, it is the constant value - System.
     *
     * @param submittedBy the submittedBy value to set.
     * @return the ExportExecution object itself.
     */
    public ExportExecution withSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * Get the submittedTime property: The time when export was queued to be executed.
     *
     * @return the submittedTime value.
     */
    public OffsetDateTime submittedTime() {
        return this.submittedTime;
    }

    /**
     * Set the submittedTime property: The time when export was queued to be executed.
     *
     * @param submittedTime the submittedTime value to set.
     * @return the ExportExecution object itself.
     */
    public ExportExecution withSubmittedTime(OffsetDateTime submittedTime) {
        this.submittedTime = submittedTime;
        return this;
    }

    /**
     * Get the processingStartTime property: The time when export was picked up to be executed.
     *
     * @return the processingStartTime value.
     */
    public OffsetDateTime processingStartTime() {
        return this.processingStartTime;
    }

    /**
     * Set the processingStartTime property: The time when export was picked up to be executed.
     *
     * @param processingStartTime the processingStartTime value to set.
     * @return the ExportExecution object itself.
     */
    public ExportExecution withProcessingStartTime(OffsetDateTime processingStartTime) {
        this.processingStartTime = processingStartTime;
        return this;
    }

    /**
     * Get the processingEndTime property: The time when export execution finished.
     *
     * @return the processingEndTime value.
     */
    public OffsetDateTime processingEndTime() {
        return this.processingEndTime;
    }

    /**
     * Set the processingEndTime property: The time when export execution finished.
     *
     * @param processingEndTime the processingEndTime value to set.
     * @return the ExportExecution object itself.
     */
    public ExportExecution withProcessingEndTime(OffsetDateTime processingEndTime) {
        this.processingEndTime = processingEndTime;
        return this;
    }

    /**
     * Get the fileName property: The name of the file export got written to.
     *
     * @return the fileName value.
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: The name of the file export got written to.
     *
     * @param fileName the fileName value to set.
     * @return the ExportExecution object itself.
     */
    public ExportExecution withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the runSettings property: The common properties of the export.
     *
     * @return the runSettings value.
     */
    public CommonExportProperties runSettings() {
        return this.runSettings;
    }

    /**
     * Set the runSettings property: The common properties of the export.
     *
     * @param runSettings the runSettings value to set.
     * @return the ExportExecution object itself.
     */
    public ExportExecution withRunSettings(CommonExportProperties runSettings) {
        this.runSettings = runSettings;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (runSettings() != null) {
            runSettings().validate();
        }
    }
}
