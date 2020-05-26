// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The BackupSchedule model. */
@Fluent
public final class BackupSchedule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupSchedule.class);

    /*
     * How often the backup should be executed (e.g. for weekly backup, this
     * should be set to 7 and FrequencyUnit should be set to Day)
     */
    @JsonProperty(value = "frequencyInterval", required = true)
    private int frequencyInterval;

    /*
     * The unit of time for how often the backup should be executed (e.g. for
     * weekly backup, this should be set to Day and FrequencyInterval should be
     * set to 7)
     */
    @JsonProperty(value = "frequencyUnit", required = true)
    private FrequencyUnit frequencyUnit;

    /*
     * True if the retention policy should always keep at least one backup in
     * the storage account, regardless how old it is; false otherwise.
     */
    @JsonProperty(value = "keepAtLeastOneBackup", required = true)
    private boolean keepAtLeastOneBackup;

    /*
     * After how many days backups should be deleted.
     */
    @JsonProperty(value = "retentionPeriodInDays", required = true)
    private int retentionPeriodInDays;

    /*
     * When the schedule should start working.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * Last time when this schedule was triggered.
     */
    @JsonProperty(value = "lastExecutionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastExecutionTime;

    /**
     * Get the frequencyInterval property: How often the backup should be executed (e.g. for weekly backup, this should
     * be set to 7 and FrequencyUnit should be set to Day).
     *
     * @return the frequencyInterval value.
     */
    public int frequencyInterval() {
        return this.frequencyInterval;
    }

    /**
     * Set the frequencyInterval property: How often the backup should be executed (e.g. for weekly backup, this should
     * be set to 7 and FrequencyUnit should be set to Day).
     *
     * @param frequencyInterval the frequencyInterval value to set.
     * @return the BackupSchedule object itself.
     */
    public BackupSchedule withFrequencyInterval(int frequencyInterval) {
        this.frequencyInterval = frequencyInterval;
        return this;
    }

    /**
     * Get the frequencyUnit property: The unit of time for how often the backup should be executed (e.g. for weekly
     * backup, this should be set to Day and FrequencyInterval should be set to 7).
     *
     * @return the frequencyUnit value.
     */
    public FrequencyUnit frequencyUnit() {
        return this.frequencyUnit;
    }

    /**
     * Set the frequencyUnit property: The unit of time for how often the backup should be executed (e.g. for weekly
     * backup, this should be set to Day and FrequencyInterval should be set to 7).
     *
     * @param frequencyUnit the frequencyUnit value to set.
     * @return the BackupSchedule object itself.
     */
    public BackupSchedule withFrequencyUnit(FrequencyUnit frequencyUnit) {
        this.frequencyUnit = frequencyUnit;
        return this;
    }

    /**
     * Get the keepAtLeastOneBackup property: True if the retention policy should always keep at least one backup in the
     * storage account, regardless how old it is; false otherwise.
     *
     * @return the keepAtLeastOneBackup value.
     */
    public boolean keepAtLeastOneBackup() {
        return this.keepAtLeastOneBackup;
    }

    /**
     * Set the keepAtLeastOneBackup property: True if the retention policy should always keep at least one backup in the
     * storage account, regardless how old it is; false otherwise.
     *
     * @param keepAtLeastOneBackup the keepAtLeastOneBackup value to set.
     * @return the BackupSchedule object itself.
     */
    public BackupSchedule withKeepAtLeastOneBackup(boolean keepAtLeastOneBackup) {
        this.keepAtLeastOneBackup = keepAtLeastOneBackup;
        return this;
    }

    /**
     * Get the retentionPeriodInDays property: After how many days backups should be deleted.
     *
     * @return the retentionPeriodInDays value.
     */
    public int retentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    /**
     * Set the retentionPeriodInDays property: After how many days backups should be deleted.
     *
     * @param retentionPeriodInDays the retentionPeriodInDays value to set.
     * @return the BackupSchedule object itself.
     */
    public BackupSchedule withRetentionPeriodInDays(int retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
        return this;
    }

    /**
     * Get the startTime property: When the schedule should start working.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: When the schedule should start working.
     *
     * @param startTime the startTime value to set.
     * @return the BackupSchedule object itself.
     */
    public BackupSchedule withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the lastExecutionTime property: Last time when this schedule was triggered.
     *
     * @return the lastExecutionTime value.
     */
    public OffsetDateTime lastExecutionTime() {
        return this.lastExecutionTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (frequencyUnit() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property frequencyUnit in model BackupSchedule"));
        }
    }
}
