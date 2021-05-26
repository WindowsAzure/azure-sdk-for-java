// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** IaaS VM workload-specific backup item representing the Azure Resource Manager VM. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectedItemType")
@JsonTypeName("Microsoft.Compute/virtualMachines")
@Immutable
public final class AzureIaaSComputeVMProtectedItem extends AzureIaaSvmProtectedItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureIaaSComputeVMProtectedItem.class);

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withVirtualMachineId(String virtualMachineId) {
        super.withVirtualMachineId(virtualMachineId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withProtectionStatus(String protectionStatus) {
        super.withProtectionStatus(protectionStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withProtectionState(ProtectionState protectionState) {
        super.withProtectionState(protectionState);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withHealthStatus(HealthStatus healthStatus) {
        super.withHealthStatus(healthStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withHealthDetails(List<AzureIaaSvmHealthDetails> healthDetails) {
        super.withHealthDetails(healthDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withKpisHealths(Map<String, KpiResourceHealthDetails> kpisHealths) {
        super.withKpisHealths(kpisHealths);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withLastBackupStatus(String lastBackupStatus) {
        super.withLastBackupStatus(lastBackupStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withLastBackupTime(OffsetDateTime lastBackupTime) {
        super.withLastBackupTime(lastBackupTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withProtectedItemDataId(String protectedItemDataId) {
        super.withProtectedItemDataId(protectedItemDataId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withExtendedInfo(AzureIaaSvmProtectedItemExtendedInfo extendedInfo) {
        super.withExtendedInfo(extendedInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withExtendedProperties(ExtendedProperties extendedProperties) {
        super.withExtendedProperties(extendedProperties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withWorkloadType(DataSourceType workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withContainerName(String containerName) {
        super.withContainerName(containerName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withPolicyId(String policyId) {
        super.withPolicyId(policyId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withLastRecoveryPoint(OffsetDateTime lastRecoveryPoint) {
        super.withLastRecoveryPoint(lastRecoveryPoint);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withBackupSetName(String backupSetName) {
        super.withBackupSetName(backupSetName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withCreateMode(CreateMode createMode) {
        super.withCreateMode(createMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withDeferredDeleteTimeInUtc(OffsetDateTime deferredDeleteTimeInUtc) {
        super.withDeferredDeleteTimeInUtc(deferredDeleteTimeInUtc);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withIsScheduledForDeferredDelete(Boolean isScheduledForDeferredDelete) {
        super.withIsScheduledForDeferredDelete(isScheduledForDeferredDelete);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withDeferredDeleteTimeRemaining(String deferredDeleteTimeRemaining) {
        super.withDeferredDeleteTimeRemaining(deferredDeleteTimeRemaining);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withIsDeferredDeleteScheduleUpcoming(
        Boolean isDeferredDeleteScheduleUpcoming) {
        super.withIsDeferredDeleteScheduleUpcoming(isDeferredDeleteScheduleUpcoming);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSComputeVMProtectedItem withIsRehydrate(Boolean isRehydrate) {
        super.withIsRehydrate(isRehydrate);
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
