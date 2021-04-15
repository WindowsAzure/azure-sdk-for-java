// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.models.ProvisioningState;
import com.azure.resourcemanager.automation.models.SyncType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Definition of the source control sync job. */
@JsonFlatten
@Fluent
public class SourceControlSyncJobInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SourceControlSyncJobInner.class);

    /*
     * Resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Resource id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The source control sync job id.
     */
    @JsonProperty(value = "properties.sourceControlSyncJobId")
    private String sourceControlSyncJobId;

    /*
     * The creation time of the job.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * The provisioning state of the job.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /*
     * The start time of the job.
     */
    @JsonProperty(value = "properties.startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The end time of the job.
     */
    @JsonProperty(value = "properties.endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * The sync type.
     */
    @JsonProperty(value = "properties.syncType")
    private SyncType syncType;

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the id property: Resource id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the sourceControlSyncJobId property: The source control sync job id.
     *
     * @return the sourceControlSyncJobId value.
     */
    public String sourceControlSyncJobId() {
        return this.sourceControlSyncJobId;
    }

    /**
     * Set the sourceControlSyncJobId property: The source control sync job id.
     *
     * @param sourceControlSyncJobId the sourceControlSyncJobId value to set.
     * @return the SourceControlSyncJobInner object itself.
     */
    public SourceControlSyncJobInner withSourceControlSyncJobId(String sourceControlSyncJobId) {
        this.sourceControlSyncJobId = sourceControlSyncJobId;
        return this;
    }

    /**
     * Get the creationTime property: The creation time of the job.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the provisioningState property: The provisioning state of the job.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the job.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the SourceControlSyncJobInner object itself.
     */
    public SourceControlSyncJobInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the startTime property: The start time of the job.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The end time of the job.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the syncType property: The sync type.
     *
     * @return the syncType value.
     */
    public SyncType syncType() {
        return this.syncType;
    }

    /**
     * Set the syncType property: The sync type.
     *
     * @param syncType the syncType value to set.
     * @return the SourceControlSyncJobInner object itself.
     */
    public SourceControlSyncJobInner withSyncType(SyncType syncType) {
        this.syncType = syncType;
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
