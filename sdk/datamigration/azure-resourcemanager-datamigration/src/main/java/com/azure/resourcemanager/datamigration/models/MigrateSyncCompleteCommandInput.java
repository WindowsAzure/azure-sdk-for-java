// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Input for command that completes sync migration for a database. */
@Fluent
public final class MigrateSyncCompleteCommandInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MigrateSyncCompleteCommandInput.class);

    /*
     * Name of database
     */
    @JsonProperty(value = "databaseName", required = true)
    private String databaseName;

    /*
     * Time stamp to complete
     */
    @JsonProperty(value = "commitTimeStamp")
    private OffsetDateTime commitTimestamp;

    /**
     * Get the databaseName property: Name of database.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: Name of database.
     *
     * @param databaseName the databaseName value to set.
     * @return the MigrateSyncCompleteCommandInput object itself.
     */
    public MigrateSyncCompleteCommandInput withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the commitTimestamp property: Time stamp to complete.
     *
     * @return the commitTimestamp value.
     */
    public OffsetDateTime commitTimestamp() {
        return this.commitTimestamp;
    }

    /**
     * Set the commitTimestamp property: Time stamp to complete.
     *
     * @param commitTimestamp the commitTimestamp value to set.
     * @return the MigrateSyncCompleteCommandInput object itself.
     */
    public MigrateSyncCompleteCommandInput withCommitTimestamp(OffsetDateTime commitTimestamp) {
        this.commitTimestamp = commitTimestamp;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (databaseName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property databaseName in model MigrateSyncCompleteCommandInput"));
        }
    }
}
