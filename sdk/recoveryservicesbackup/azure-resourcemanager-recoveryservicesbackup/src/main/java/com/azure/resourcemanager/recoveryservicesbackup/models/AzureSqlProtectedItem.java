// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Azure SQL workload-specific backup item. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectedItemType")
@JsonTypeName("Microsoft.Sql/servers/databases")
@Fluent
public final class AzureSqlProtectedItem extends ProtectedItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureSqlProtectedItem.class);

    /*
     * Internal ID of a backup item. Used by Azure SQL Backup engine to contact
     * Recovery Services.
     */
    @JsonProperty(value = "protectedItemDataId")
    private String protectedItemDataId;

    /*
     * Backup state of the backed up item.
     */
    @JsonProperty(value = "protectionState")
    private ProtectedItemState protectionState;

    /*
     * Additional information for this backup item.
     */
    @JsonProperty(value = "extendedInfo")
    private AzureSqlProtectedItemExtendedInfo extendedInfo;

    /**
     * Get the protectedItemDataId property: Internal ID of a backup item. Used by Azure SQL Backup engine to contact
     * Recovery Services.
     *
     * @return the protectedItemDataId value.
     */
    public String protectedItemDataId() {
        return this.protectedItemDataId;
    }

    /**
     * Set the protectedItemDataId property: Internal ID of a backup item. Used by Azure SQL Backup engine to contact
     * Recovery Services.
     *
     * @param protectedItemDataId the protectedItemDataId value to set.
     * @return the AzureSqlProtectedItem object itself.
     */
    public AzureSqlProtectedItem withProtectedItemDataId(String protectedItemDataId) {
        this.protectedItemDataId = protectedItemDataId;
        return this;
    }

    /**
     * Get the protectionState property: Backup state of the backed up item.
     *
     * @return the protectionState value.
     */
    public ProtectedItemState protectionState() {
        return this.protectionState;
    }

    /**
     * Set the protectionState property: Backup state of the backed up item.
     *
     * @param protectionState the protectionState value to set.
     * @return the AzureSqlProtectedItem object itself.
     */
    public AzureSqlProtectedItem withProtectionState(ProtectedItemState protectionState) {
        this.protectionState = protectionState;
        return this;
    }

    /**
     * Get the extendedInfo property: Additional information for this backup item.
     *
     * @return the extendedInfo value.
     */
    public AzureSqlProtectedItemExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set the extendedInfo property: Additional information for this backup item.
     *
     * @param extendedInfo the extendedInfo value to set.
     * @return the AzureSqlProtectedItem object itself.
     */
    public AzureSqlProtectedItem withExtendedInfo(AzureSqlProtectedItemExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectedItem withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectedItem withWorkloadType(DataSourceType workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectedItem withContainerName(String containerName) {
        super.withContainerName(containerName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectedItem withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectedItem withPolicyId(String policyId) {
        super.withPolicyId(policyId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectedItem withLastRecoveryPoint(OffsetDateTime lastRecoveryPoint) {
        super.withLastRecoveryPoint(lastRecoveryPoint);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectedItem withBackupSetName(String backupSetName) {
        super.withBackupSetName(backupSetName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectedItem withCreateMode(CreateMode createMode) {
        super.withCreateMode(createMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectedItem withDeferredDeleteTimeInUtc(OffsetDateTime deferredDeleteTimeInUtc) {
        super.withDeferredDeleteTimeInUtc(deferredDeleteTimeInUtc);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectedItem withIsScheduledForDeferredDelete(Boolean isScheduledForDeferredDelete) {
        super.withIsScheduledForDeferredDelete(isScheduledForDeferredDelete);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectedItem withDeferredDeleteTimeRemaining(String deferredDeleteTimeRemaining) {
        super.withDeferredDeleteTimeRemaining(deferredDeleteTimeRemaining);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectedItem withIsDeferredDeleteScheduleUpcoming(Boolean isDeferredDeleteScheduleUpcoming) {
        super.withIsDeferredDeleteScheduleUpcoming(isDeferredDeleteScheduleUpcoming);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectedItem withIsRehydrate(Boolean isRehydrate) {
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
        if (extendedInfo() != null) {
            extendedInfo().validate();
        }
    }
}
