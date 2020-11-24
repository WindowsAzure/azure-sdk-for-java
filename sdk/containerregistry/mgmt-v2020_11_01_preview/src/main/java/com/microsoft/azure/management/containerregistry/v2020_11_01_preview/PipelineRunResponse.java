/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response properties returned for a pipeline run.
 */
public class PipelineRunResponse {
    /**
     * The current status of the pipeline run.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The artifacts imported in the pipeline run.
     */
    @JsonProperty(value = "importedArtifacts")
    private List<String> importedArtifacts;

    /**
     * The current progress of the copy operation.
     */
    @JsonProperty(value = "progress")
    private ProgressProperties progress;

    /**
     * The time the pipeline run started.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * The time the pipeline run finished.
     */
    @JsonProperty(value = "finishTime")
    private DateTime finishTime;

    /**
     * The source of the pipeline run.
     */
    @JsonProperty(value = "source")
    private ImportPipelineSourceProperties source;

    /**
     * The target of the pipeline run.
     */
    @JsonProperty(value = "target")
    private ExportPipelineTargetProperties target;

    /**
     * The digest of the tar used to transfer the artifacts.
     */
    @JsonProperty(value = "catalogDigest")
    private String catalogDigest;

    /**
     * The trigger that caused the pipeline run.
     */
    @JsonProperty(value = "trigger")
    private PipelineTriggerDescriptor trigger;

    /**
     * The detailed error message for the pipeline run in the case of failure.
     */
    @JsonProperty(value = "pipelineRunErrorMessage")
    private String pipelineRunErrorMessage;

    /**
     * Get the current status of the pipeline run.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the current status of the pipeline run.
     *
     * @param status the status value to set
     * @return the PipelineRunResponse object itself.
     */
    public PipelineRunResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the artifacts imported in the pipeline run.
     *
     * @return the importedArtifacts value
     */
    public List<String> importedArtifacts() {
        return this.importedArtifacts;
    }

    /**
     * Set the artifacts imported in the pipeline run.
     *
     * @param importedArtifacts the importedArtifacts value to set
     * @return the PipelineRunResponse object itself.
     */
    public PipelineRunResponse withImportedArtifacts(List<String> importedArtifacts) {
        this.importedArtifacts = importedArtifacts;
        return this;
    }

    /**
     * Get the current progress of the copy operation.
     *
     * @return the progress value
     */
    public ProgressProperties progress() {
        return this.progress;
    }

    /**
     * Set the current progress of the copy operation.
     *
     * @param progress the progress value to set
     * @return the PipelineRunResponse object itself.
     */
    public PipelineRunResponse withProgress(ProgressProperties progress) {
        this.progress = progress;
        return this;
    }

    /**
     * Get the time the pipeline run started.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the time the pipeline run started.
     *
     * @param startTime the startTime value to set
     * @return the PipelineRunResponse object itself.
     */
    public PipelineRunResponse withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the time the pipeline run finished.
     *
     * @return the finishTime value
     */
    public DateTime finishTime() {
        return this.finishTime;
    }

    /**
     * Set the time the pipeline run finished.
     *
     * @param finishTime the finishTime value to set
     * @return the PipelineRunResponse object itself.
     */
    public PipelineRunResponse withFinishTime(DateTime finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * Get the source of the pipeline run.
     *
     * @return the source value
     */
    public ImportPipelineSourceProperties source() {
        return this.source;
    }

    /**
     * Set the source of the pipeline run.
     *
     * @param source the source value to set
     * @return the PipelineRunResponse object itself.
     */
    public PipelineRunResponse withSource(ImportPipelineSourceProperties source) {
        this.source = source;
        return this;
    }

    /**
     * Get the target of the pipeline run.
     *
     * @return the target value
     */
    public ExportPipelineTargetProperties target() {
        return this.target;
    }

    /**
     * Set the target of the pipeline run.
     *
     * @param target the target value to set
     * @return the PipelineRunResponse object itself.
     */
    public PipelineRunResponse withTarget(ExportPipelineTargetProperties target) {
        this.target = target;
        return this;
    }

    /**
     * Get the digest of the tar used to transfer the artifacts.
     *
     * @return the catalogDigest value
     */
    public String catalogDigest() {
        return this.catalogDigest;
    }

    /**
     * Set the digest of the tar used to transfer the artifacts.
     *
     * @param catalogDigest the catalogDigest value to set
     * @return the PipelineRunResponse object itself.
     */
    public PipelineRunResponse withCatalogDigest(String catalogDigest) {
        this.catalogDigest = catalogDigest;
        return this;
    }

    /**
     * Get the trigger that caused the pipeline run.
     *
     * @return the trigger value
     */
    public PipelineTriggerDescriptor trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger that caused the pipeline run.
     *
     * @param trigger the trigger value to set
     * @return the PipelineRunResponse object itself.
     */
    public PipelineRunResponse withTrigger(PipelineTriggerDescriptor trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Get the detailed error message for the pipeline run in the case of failure.
     *
     * @return the pipelineRunErrorMessage value
     */
    public String pipelineRunErrorMessage() {
        return this.pipelineRunErrorMessage;
    }

    /**
     * Set the detailed error message for the pipeline run in the case of failure.
     *
     * @param pipelineRunErrorMessage the pipelineRunErrorMessage value to set
     * @return the PipelineRunResponse object itself.
     */
    public PipelineRunResponse withPipelineRunErrorMessage(String pipelineRunErrorMessage) {
        this.pipelineRunErrorMessage = pipelineRunErrorMessage;
        return this;
    }

}
