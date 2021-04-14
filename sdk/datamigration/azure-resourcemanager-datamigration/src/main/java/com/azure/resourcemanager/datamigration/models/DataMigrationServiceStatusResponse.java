// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.resourcemanager.datamigration.fluent.models.DataMigrationServiceStatusResponseInner;
import java.util.List;

/** An immutable client-side representation of DataMigrationServiceStatusResponse. */
public interface DataMigrationServiceStatusResponse {
    /**
     * Gets the agentVersion property: The DMS instance agent version.
     *
     * @return the agentVersion value.
     */
    String agentVersion();

    /**
     * Gets the status property: The machine-readable status, such as 'Initializing', 'Offline', 'Online', 'Deploying',
     * 'Deleting', 'Stopped', 'Stopping', 'Starting', 'FailedToStart', 'FailedToStop' or 'Failed'.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the vmSize property: The services virtual machine size, such as 'Standard_D2_v2'.
     *
     * @return the vmSize value.
     */
    String vmSize();

    /**
     * Gets the supportedTaskTypes property: The list of supported task types.
     *
     * @return the supportedTaskTypes value.
     */
    List<String> supportedTaskTypes();

    /**
     * Gets the inner com.azure.resourcemanager.datamigration.fluent.models.DataMigrationServiceStatusResponseInner
     * object.
     *
     * @return the inner object.
     */
    DataMigrationServiceStatusResponseInner innerModel();
}
