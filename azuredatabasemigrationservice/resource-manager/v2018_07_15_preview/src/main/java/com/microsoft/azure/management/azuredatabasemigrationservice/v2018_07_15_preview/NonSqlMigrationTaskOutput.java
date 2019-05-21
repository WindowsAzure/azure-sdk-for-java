/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import org.joda.time.DateTime;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Base class for non sql migration task output.
 */
public class NonSqlMigrationTaskOutput {
    /**
     * Result identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Migration start time.
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startedOn;

    /**
     * Migration end time.
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endedOn;

    /**
     * Current state of migration. Possible values include: 'Default',
     * 'Connecting', 'SourceAndTargetSelected', 'SelectLogins', 'Configured',
     * 'Running', 'Error', 'Stopped', 'Completed', 'CompletedWithWarnings'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationStatus status;

    /**
     * Results of the migration. The key contains the table name and the value
     * the table result object.
     */
    @JsonProperty(value = "dataMigrationTableResults", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, NonSqlDataMigrationTableResult> dataMigrationTableResults;

    /**
     * Message about the progress of the migration.
     */
    @JsonProperty(value = "progressMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String progressMessage;

    /**
     * Name of source server.
     */
    @JsonProperty(value = "sourceServerName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerName;

    /**
     * Name of target server.
     */
    @JsonProperty(value = "targetServerName", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerName;

    /**
     * Get result identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get migration start time.
     *
     * @return the startedOn value
     */
    public DateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get migration end time.
     *
     * @return the endedOn value
     */
    public DateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get current state of migration. Possible values include: 'Default', 'Connecting', 'SourceAndTargetSelected', 'SelectLogins', 'Configured', 'Running', 'Error', 'Stopped', 'Completed', 'CompletedWithWarnings'.
     *
     * @return the status value
     */
    public MigrationStatus status() {
        return this.status;
    }

    /**
     * Get results of the migration. The key contains the table name and the value the table result object.
     *
     * @return the dataMigrationTableResults value
     */
    public Map<String, NonSqlDataMigrationTableResult> dataMigrationTableResults() {
        return this.dataMigrationTableResults;
    }

    /**
     * Get message about the progress of the migration.
     *
     * @return the progressMessage value
     */
    public String progressMessage() {
        return this.progressMessage;
    }

    /**
     * Get name of source server.
     *
     * @return the sourceServerName value
     */
    public String sourceServerName() {
        return this.sourceServerName;
    }

    /**
     * Get name of target server.
     *
     * @return the targetServerName value
     */
    public String targetServerName() {
        return this.targetServerName;
    }

}
