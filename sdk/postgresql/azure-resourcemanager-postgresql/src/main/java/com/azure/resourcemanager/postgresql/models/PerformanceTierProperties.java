// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.models;

import com.azure.resourcemanager.postgresql.fluent.models.PerformanceTierPropertiesInner;
import java.util.List;

/** An immutable client-side representation of PerformanceTierProperties. */
public interface PerformanceTierProperties {
    /**
     * Gets the id property: ID of the performance tier.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the maxBackupRetentionDays property: Maximum Backup retention in days for the performance tier edition.
     *
     * @return the maxBackupRetentionDays value.
     */
    Integer maxBackupRetentionDays();

    /**
     * Gets the minBackupRetentionDays property: Minimum Backup retention in days for the performance tier edition.
     *
     * @return the minBackupRetentionDays value.
     */
    Integer minBackupRetentionDays();

    /**
     * Gets the maxStorageMB property: Max storage allowed for a server.
     *
     * @return the maxStorageMB value.
     */
    Integer maxStorageMB();

    /**
     * Gets the minLargeStorageMB property: Max storage allowed for a server.
     *
     * @return the minLargeStorageMB value.
     */
    Integer minLargeStorageMB();

    /**
     * Gets the maxLargeStorageMB property: Max storage allowed for a server.
     *
     * @return the maxLargeStorageMB value.
     */
    Integer maxLargeStorageMB();

    /**
     * Gets the minStorageMB property: Max storage allowed for a server.
     *
     * @return the minStorageMB value.
     */
    Integer minStorageMB();

    /**
     * Gets the serviceLevelObjectives property: Service level objectives associated with the performance tier.
     *
     * @return the serviceLevelObjectives value.
     */
    List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives();

    /**
     * Gets the inner com.azure.resourcemanager.postgresql.fluent.models.PerformanceTierPropertiesInner object.
     *
     * @return the inner object.
     */
    PerformanceTierPropertiesInner innerModel();
}
