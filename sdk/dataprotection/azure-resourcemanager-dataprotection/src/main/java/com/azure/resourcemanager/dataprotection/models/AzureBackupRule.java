// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure backup rule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureBackupRule")
@Fluent
public final class AzureBackupRule extends BasePolicyRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureBackupRule.class);

    /*
     * BackupParameters base
     */
    @JsonProperty(value = "backupParameters")
    private BackupParameters backupParameters;

    /*
     * DataStoreInfo base
     */
    @JsonProperty(value = "dataStore", required = true)
    private DataStoreInfoBase dataStore;

    /*
     * Trigger context
     */
    @JsonProperty(value = "trigger", required = true)
    private TriggerContext trigger;

    /**
     * Get the backupParameters property: BackupParameters base.
     *
     * @return the backupParameters value.
     */
    public BackupParameters backupParameters() {
        return this.backupParameters;
    }

    /**
     * Set the backupParameters property: BackupParameters base.
     *
     * @param backupParameters the backupParameters value to set.
     * @return the AzureBackupRule object itself.
     */
    public AzureBackupRule withBackupParameters(BackupParameters backupParameters) {
        this.backupParameters = backupParameters;
        return this;
    }

    /**
     * Get the dataStore property: DataStoreInfo base.
     *
     * @return the dataStore value.
     */
    public DataStoreInfoBase dataStore() {
        return this.dataStore;
    }

    /**
     * Set the dataStore property: DataStoreInfo base.
     *
     * @param dataStore the dataStore value to set.
     * @return the AzureBackupRule object itself.
     */
    public AzureBackupRule withDataStore(DataStoreInfoBase dataStore) {
        this.dataStore = dataStore;
        return this;
    }

    /**
     * Get the trigger property: Trigger context.
     *
     * @return the trigger value.
     */
    public TriggerContext trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: Trigger context.
     *
     * @param trigger the trigger value to set.
     * @return the AzureBackupRule object itself.
     */
    public AzureBackupRule withTrigger(TriggerContext trigger) {
        this.trigger = trigger;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBackupRule withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (backupParameters() != null) {
            backupParameters().validate();
        }
        if (dataStore() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dataStore in model AzureBackupRule"));
        } else {
            dataStore().validate();
        }
        if (trigger() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property trigger in model AzureBackupRule"));
        } else {
            trigger().validate();
        }
    }
}
