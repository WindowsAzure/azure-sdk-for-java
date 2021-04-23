// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobByIdInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of SourceControlSyncJobById. */
public interface SourceControlSyncJobById {
    /**
     * Gets the id property: The id of the job.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the sourceControlSyncJobId property: The source control sync job id.
     *
     * @return the sourceControlSyncJobId value.
     */
    String sourceControlSyncJobId();

    /**
     * Gets the creationTime property: The creation time of the job.
     *
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * Gets the provisioningState property: The provisioning state of the job.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the startTime property: The start time of the job.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: The end time of the job.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the syncType property: The sync type.
     *
     * @return the syncType value.
     */
    SyncType syncType();

    /**
     * Gets the exception property: The exceptions that occurred while running the sync job.
     *
     * @return the exception value.
     */
    String exception();

    /**
     * Gets the inner com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobByIdInner object.
     *
     * @return the inner object.
     */
    SourceControlSyncJobByIdInner innerModel();
}
