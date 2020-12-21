// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure VM workload-specific protectable item representing SAP ASE System. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableItemType")
@JsonTypeName("SAPAseSystem")
@Immutable
public final class AzureVmWorkloadSapAseSystemProtectableItem extends AzureVmWorkloadProtectableItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureVmWorkloadSapAseSystemProtectableItem.class);

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseSystemProtectableItem withParentName(String parentName) {
        super.withParentName(parentName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseSystemProtectableItem withParentUniqueName(String parentUniqueName) {
        super.withParentUniqueName(parentUniqueName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseSystemProtectableItem withServerName(String serverName) {
        super.withServerName(serverName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseSystemProtectableItem withIsAutoProtectable(Boolean isAutoProtectable) {
        super.withIsAutoProtectable(isAutoProtectable);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseSystemProtectableItem withIsAutoProtected(Boolean isAutoProtected) {
        super.withIsAutoProtected(isAutoProtected);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseSystemProtectableItem withSubinquireditemcount(Integer subinquireditemcount) {
        super.withSubinquireditemcount(subinquireditemcount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseSystemProtectableItem withSubprotectableitemcount(Integer subprotectableitemcount) {
        super.withSubprotectableitemcount(subprotectableitemcount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseSystemProtectableItem withPrebackupvalidation(PreBackupValidation prebackupvalidation) {
        super.withPrebackupvalidation(prebackupvalidation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseSystemProtectableItem withBackupManagementType(String backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseSystemProtectableItem withWorkloadType(String workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseSystemProtectableItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseSystemProtectableItem withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
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
    }
}
