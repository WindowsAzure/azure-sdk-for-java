// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Fields for tracking refresh job on the share or container. */
@Fluent
public final class RefreshDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RefreshDetails.class);

    /*
     * If a refresh job is currently in progress on this share or container,
     * this field indicates the ARM resource ID of that job. The field is empty
     * if no job is in progress.
     */
    @JsonProperty(value = "inProgressRefreshJobId")
    private String inProgressRefreshJobId;

    /*
     * Indicates the completed time for the last refresh job on this particular
     * share or container, if any.This could be a failed job or a successful
     * job.
     */
    @JsonProperty(value = "lastCompletedRefreshJobTimeInUTC")
    private OffsetDateTime lastCompletedRefreshJobTimeInUtc;

    /*
     * Indicates the relative path of the error xml for the last refresh job on
     * this particular share or container, if any. This could be a failed job
     * or a successful job.
     */
    @JsonProperty(value = "errorManifestFile")
    private String errorManifestFile;

    /*
     * Indicates the id of the last refresh job on this particular share or
     * container,if any. This could be a failed job or a successful job.
     */
    @JsonProperty(value = "lastJob")
    private String lastJob;

    /**
     * Get the inProgressRefreshJobId property: If a refresh job is currently in progress on this share or container,
     * this field indicates the ARM resource ID of that job. The field is empty if no job is in progress.
     *
     * @return the inProgressRefreshJobId value.
     */
    public String inProgressRefreshJobId() {
        return this.inProgressRefreshJobId;
    }

    /**
     * Set the inProgressRefreshJobId property: If a refresh job is currently in progress on this share or container,
     * this field indicates the ARM resource ID of that job. The field is empty if no job is in progress.
     *
     * @param inProgressRefreshJobId the inProgressRefreshJobId value to set.
     * @return the RefreshDetails object itself.
     */
    public RefreshDetails withInProgressRefreshJobId(String inProgressRefreshJobId) {
        this.inProgressRefreshJobId = inProgressRefreshJobId;
        return this;
    }

    /**
     * Get the lastCompletedRefreshJobTimeInUtc property: Indicates the completed time for the last refresh job on this
     * particular share or container, if any.This could be a failed job or a successful job.
     *
     * @return the lastCompletedRefreshJobTimeInUtc value.
     */
    public OffsetDateTime lastCompletedRefreshJobTimeInUtc() {
        return this.lastCompletedRefreshJobTimeInUtc;
    }

    /**
     * Set the lastCompletedRefreshJobTimeInUtc property: Indicates the completed time for the last refresh job on this
     * particular share or container, if any.This could be a failed job or a successful job.
     *
     * @param lastCompletedRefreshJobTimeInUtc the lastCompletedRefreshJobTimeInUtc value to set.
     * @return the RefreshDetails object itself.
     */
    public RefreshDetails withLastCompletedRefreshJobTimeInUtc(OffsetDateTime lastCompletedRefreshJobTimeInUtc) {
        this.lastCompletedRefreshJobTimeInUtc = lastCompletedRefreshJobTimeInUtc;
        return this;
    }

    /**
     * Get the errorManifestFile property: Indicates the relative path of the error xml for the last refresh job on this
     * particular share or container, if any. This could be a failed job or a successful job.
     *
     * @return the errorManifestFile value.
     */
    public String errorManifestFile() {
        return this.errorManifestFile;
    }

    /**
     * Set the errorManifestFile property: Indicates the relative path of the error xml for the last refresh job on this
     * particular share or container, if any. This could be a failed job or a successful job.
     *
     * @param errorManifestFile the errorManifestFile value to set.
     * @return the RefreshDetails object itself.
     */
    public RefreshDetails withErrorManifestFile(String errorManifestFile) {
        this.errorManifestFile = errorManifestFile;
        return this;
    }

    /**
     * Get the lastJob property: Indicates the id of the last refresh job on this particular share or container,if any.
     * This could be a failed job or a successful job.
     *
     * @return the lastJob value.
     */
    public String lastJob() {
        return this.lastJob;
    }

    /**
     * Set the lastJob property: Indicates the id of the last refresh job on this particular share or container,if any.
     * This could be a failed job or a successful job.
     *
     * @param lastJob the lastJob value to set.
     * @return the RefreshDetails object itself.
     */
    public RefreshDetails withLastJob(String lastJob) {
        this.lastJob = lastJob;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
