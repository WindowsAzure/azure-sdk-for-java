// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** The MigrateSqlServerSqlDbSyncTaskOutputDatabaseLevel model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("DatabaseLevelOutput")
@Immutable
public final class MigrateSqlServerSqlDbSyncTaskOutputDatabaseLevel extends MigrateSqlServerSqlDbSyncTaskOutput {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(MigrateSqlServerSqlDbSyncTaskOutputDatabaseLevel.class);

    /*
     * Name of the database
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * Migration start time
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startedOn;

    /*
     * Migration end time
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endedOn;

    /*
     * Migration state that this database is in
     */
    @JsonProperty(value = "migrationState", access = JsonProperty.Access.WRITE_ONLY)
    private SyncDatabaseMigrationReportingState migrationState;

    /*
     * Number of incoming changes
     */
    @JsonProperty(value = "incomingChanges", access = JsonProperty.Access.WRITE_ONLY)
    private Long incomingChanges;

    /*
     * Number of applied changes
     */
    @JsonProperty(value = "appliedChanges", access = JsonProperty.Access.WRITE_ONLY)
    private Long appliedChanges;

    /*
     * Number of cdc inserts
     */
    @JsonProperty(value = "cdcInsertCounter", access = JsonProperty.Access.WRITE_ONLY)
    private Long cdcInsertCounter;

    /*
     * Number of cdc deletes
     */
    @JsonProperty(value = "cdcDeleteCounter", access = JsonProperty.Access.WRITE_ONLY)
    private Long cdcDeleteCounter;

    /*
     * Number of cdc updates
     */
    @JsonProperty(value = "cdcUpdateCounter", access = JsonProperty.Access.WRITE_ONLY)
    private Long cdcUpdateCounter;

    /*
     * Number of tables completed in full load
     */
    @JsonProperty(value = "fullLoadCompletedTables", access = JsonProperty.Access.WRITE_ONLY)
    private Long fullLoadCompletedTables;

    /*
     * Number of tables loading in full load
     */
    @JsonProperty(value = "fullLoadLoadingTables", access = JsonProperty.Access.WRITE_ONLY)
    private Long fullLoadLoadingTables;

    /*
     * Number of tables queued in full load
     */
    @JsonProperty(value = "fullLoadQueuedTables", access = JsonProperty.Access.WRITE_ONLY)
    private Long fullLoadQueuedTables;

    /*
     * Number of tables errored in full load
     */
    @JsonProperty(value = "fullLoadErroredTables", access = JsonProperty.Access.WRITE_ONLY)
    private Long fullLoadErroredTables;

    /*
     * Indicates if initial load (full load) has been completed
     */
    @JsonProperty(value = "initializationCompleted", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean initializationCompleted;

    /*
     * CDC apply latency
     */
    @JsonProperty(value = "latency", access = JsonProperty.Access.WRITE_ONLY)
    private Long latency;

    /**
     * Get the databaseName property: Name of the database.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the startedOn property: Migration start time.
     *
     * @return the startedOn value.
     */
    public OffsetDateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get the endedOn property: Migration end time.
     *
     * @return the endedOn value.
     */
    public OffsetDateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get the migrationState property: Migration state that this database is in.
     *
     * @return the migrationState value.
     */
    public SyncDatabaseMigrationReportingState migrationState() {
        return this.migrationState;
    }

    /**
     * Get the incomingChanges property: Number of incoming changes.
     *
     * @return the incomingChanges value.
     */
    public Long incomingChanges() {
        return this.incomingChanges;
    }

    /**
     * Get the appliedChanges property: Number of applied changes.
     *
     * @return the appliedChanges value.
     */
    public Long appliedChanges() {
        return this.appliedChanges;
    }

    /**
     * Get the cdcInsertCounter property: Number of cdc inserts.
     *
     * @return the cdcInsertCounter value.
     */
    public Long cdcInsertCounter() {
        return this.cdcInsertCounter;
    }

    /**
     * Get the cdcDeleteCounter property: Number of cdc deletes.
     *
     * @return the cdcDeleteCounter value.
     */
    public Long cdcDeleteCounter() {
        return this.cdcDeleteCounter;
    }

    /**
     * Get the cdcUpdateCounter property: Number of cdc updates.
     *
     * @return the cdcUpdateCounter value.
     */
    public Long cdcUpdateCounter() {
        return this.cdcUpdateCounter;
    }

    /**
     * Get the fullLoadCompletedTables property: Number of tables completed in full load.
     *
     * @return the fullLoadCompletedTables value.
     */
    public Long fullLoadCompletedTables() {
        return this.fullLoadCompletedTables;
    }

    /**
     * Get the fullLoadLoadingTables property: Number of tables loading in full load.
     *
     * @return the fullLoadLoadingTables value.
     */
    public Long fullLoadLoadingTables() {
        return this.fullLoadLoadingTables;
    }

    /**
     * Get the fullLoadQueuedTables property: Number of tables queued in full load.
     *
     * @return the fullLoadQueuedTables value.
     */
    public Long fullLoadQueuedTables() {
        return this.fullLoadQueuedTables;
    }

    /**
     * Get the fullLoadErroredTables property: Number of tables errored in full load.
     *
     * @return the fullLoadErroredTables value.
     */
    public Long fullLoadErroredTables() {
        return this.fullLoadErroredTables;
    }

    /**
     * Get the initializationCompleted property: Indicates if initial load (full load) has been completed.
     *
     * @return the initializationCompleted value.
     */
    public Boolean initializationCompleted() {
        return this.initializationCompleted;
    }

    /**
     * Get the latency property: CDC apply latency.
     *
     * @return the latency value.
     */
    public Long latency() {
        return this.latency;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
