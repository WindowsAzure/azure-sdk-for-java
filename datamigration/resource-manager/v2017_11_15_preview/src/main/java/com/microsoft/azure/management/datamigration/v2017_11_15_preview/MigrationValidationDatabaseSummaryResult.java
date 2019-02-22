/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Migration Validation Database level summary result.
 */
public class MigrationValidationDatabaseSummaryResult {
    /**
     * Result identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Migration Identifier.
     */
    @JsonProperty(value = "migrationId", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationId;

    /**
     * Name of the source database.
     */
    @JsonProperty(value = "sourceDatabaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceDatabaseName;

    /**
     * Name of the target database.
     */
    @JsonProperty(value = "targetDatabaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String targetDatabaseName;

    /**
     * Validation start time.
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startedOn;

    /**
     * Validation end time.
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endedOn;

    /**
     * Current status of validation at the database level. Possible values
     * include: 'Default', 'NotStarted', 'Initialized', 'InProgress',
     * 'Completed', 'CompletedWithIssues', 'Failed', 'Stopped'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ValidationStatus status;

    /**
     * Get result identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get migration Identifier.
     *
     * @return the migrationId value
     */
    public String migrationId() {
        return this.migrationId;
    }

    /**
     * Get name of the source database.
     *
     * @return the sourceDatabaseName value
     */
    public String sourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * Get name of the target database.
     *
     * @return the targetDatabaseName value
     */
    public String targetDatabaseName() {
        return this.targetDatabaseName;
    }

    /**
     * Get validation start time.
     *
     * @return the startedOn value
     */
    public DateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get validation end time.
     *
     * @return the endedOn value
     */
    public DateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get current status of validation at the database level. Possible values include: 'Default', 'NotStarted', 'Initialized', 'InProgress', 'Completed', 'CompletedWithIssues', 'Failed', 'Stopped'.
     *
     * @return the status value
     */
    public ValidationStatus status() {
        return this.status;
    }

}
