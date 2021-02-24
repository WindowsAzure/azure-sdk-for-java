// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Volume Backup Properties. */
@Fluent
public final class VolumeBackupProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VolumeBackupProperties.class);

    /*
     * Backup Policy Resource ID
     */
    @JsonProperty(value = "backupPolicyId")
    private String backupPolicyId;

    /*
     * Policy Enforced
     */
    @JsonProperty(value = "policyEnforced")
    private Boolean policyEnforced;

    /*
     * Vault Resource ID
     */
    @JsonProperty(value = "vaultId")
    private String vaultId;

    /*
     * Backup Enabled
     */
    @JsonProperty(value = "backupEnabled")
    private Boolean backupEnabled;

    /**
     * Get the backupPolicyId property: Backup Policy Resource ID.
     *
     * @return the backupPolicyId value.
     */
    public String backupPolicyId() {
        return this.backupPolicyId;
    }

    /**
     * Set the backupPolicyId property: Backup Policy Resource ID.
     *
     * @param backupPolicyId the backupPolicyId value to set.
     * @return the VolumeBackupProperties object itself.
     */
    public VolumeBackupProperties withBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
        return this;
    }

    /**
     * Get the policyEnforced property: Policy Enforced.
     *
     * @return the policyEnforced value.
     */
    public Boolean policyEnforced() {
        return this.policyEnforced;
    }

    /**
     * Set the policyEnforced property: Policy Enforced.
     *
     * @param policyEnforced the policyEnforced value to set.
     * @return the VolumeBackupProperties object itself.
     */
    public VolumeBackupProperties withPolicyEnforced(Boolean policyEnforced) {
        this.policyEnforced = policyEnforced;
        return this;
    }

    /**
     * Get the vaultId property: Vault Resource ID.
     *
     * @return the vaultId value.
     */
    public String vaultId() {
        return this.vaultId;
    }

    /**
     * Set the vaultId property: Vault Resource ID.
     *
     * @param vaultId the vaultId value to set.
     * @return the VolumeBackupProperties object itself.
     */
    public VolumeBackupProperties withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * Get the backupEnabled property: Backup Enabled.
     *
     * @return the backupEnabled value.
     */
    public Boolean backupEnabled() {
        return this.backupEnabled;
    }

    /**
     * Set the backupEnabled property: Backup Enabled.
     *
     * @param backupEnabled the backupEnabled value to set.
     * @return the VolumeBackupProperties object itself.
     */
    public VolumeBackupProperties withBackupEnabled(Boolean backupEnabled) {
        this.backupEnabled = backupEnabled;
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
