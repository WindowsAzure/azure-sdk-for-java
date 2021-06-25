// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The object representing the state of the migration between the backup policies. */
@Fluent
public final class BackupPolicyMigrationState {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupPolicyMigrationState.class);

    /*
     * Describes the status of migration between backup policy types.
     */
    @JsonProperty(value = "status")
    private BackupPolicyMigrationStatus status;

    /*
     * Describes the target backup policy type of the backup policy migration.
     */
    @JsonProperty(value = "targetType")
    private BackupPolicyType targetType;

    /*
     * Time at which the backup policy migration started (ISO-8601 format).
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /**
     * Get the status property: Describes the status of migration between backup policy types.
     *
     * @return the status value.
     */
    public BackupPolicyMigrationStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Describes the status of migration between backup policy types.
     *
     * @param status the status value to set.
     * @return the BackupPolicyMigrationState object itself.
     */
    public BackupPolicyMigrationState withStatus(BackupPolicyMigrationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the targetType property: Describes the target backup policy type of the backup policy migration.
     *
     * @return the targetType value.
     */
    public BackupPolicyType targetType() {
        return this.targetType;
    }

    /**
     * Set the targetType property: Describes the target backup policy type of the backup policy migration.
     *
     * @param targetType the targetType value to set.
     * @return the BackupPolicyMigrationState object itself.
     */
    public BackupPolicyMigrationState withTargetType(BackupPolicyType targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * Get the startTime property: Time at which the backup policy migration started (ISO-8601 format).
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Time at which the backup policy migration started (ISO-8601 format).
     *
     * @param startTime the startTime value to set.
     * @return the BackupPolicyMigrationState object itself.
     */
    public BackupPolicyMigrationState withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
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
