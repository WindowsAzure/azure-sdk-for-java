// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure VM managed disk input details. */
@Fluent
public final class A2AVmManagedDiskDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(A2AVmManagedDiskDetails.class);

    /*
     * The disk Id.
     */
    @JsonProperty(value = "diskId")
    private String diskId;

    /*
     * The primary staging storage account Arm Id.
     */
    @JsonProperty(value = "primaryStagingAzureStorageAccountId")
    private String primaryStagingAzureStorageAccountId;

    /*
     * The target resource group Arm Id.
     */
    @JsonProperty(value = "recoveryResourceGroupId")
    private String recoveryResourceGroupId;

    /*
     * The replica disk type.
     */
    @JsonProperty(value = "recoveryReplicaDiskAccountType")
    private String recoveryReplicaDiskAccountType;

    /*
     * The target disk type after failover.
     */
    @JsonProperty(value = "recoveryTargetDiskAccountType")
    private String recoveryTargetDiskAccountType;

    /*
     * The recovery disk encryption set Id.
     */
    @JsonProperty(value = "recoveryDiskEncryptionSetId")
    private String recoveryDiskEncryptionSetId;

    /*
     * The recovery disk encryption information (for one / single pass flows).
     */
    @JsonProperty(value = "diskEncryptionInfo")
    private DiskEncryptionInfo diskEncryptionInfo;

    /**
     * Get the diskId property: The disk Id.
     *
     * @return the diskId value.
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Set the diskId property: The disk Id.
     *
     * @param diskId the diskId value to set.
     * @return the A2AVmManagedDiskDetails object itself.
     */
    public A2AVmManagedDiskDetails withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * Get the primaryStagingAzureStorageAccountId property: The primary staging storage account Arm Id.
     *
     * @return the primaryStagingAzureStorageAccountId value.
     */
    public String primaryStagingAzureStorageAccountId() {
        return this.primaryStagingAzureStorageAccountId;
    }

    /**
     * Set the primaryStagingAzureStorageAccountId property: The primary staging storage account Arm Id.
     *
     * @param primaryStagingAzureStorageAccountId the primaryStagingAzureStorageAccountId value to set.
     * @return the A2AVmManagedDiskDetails object itself.
     */
    public A2AVmManagedDiskDetails withPrimaryStagingAzureStorageAccountId(String primaryStagingAzureStorageAccountId) {
        this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
        return this;
    }

    /**
     * Get the recoveryResourceGroupId property: The target resource group Arm Id.
     *
     * @return the recoveryResourceGroupId value.
     */
    public String recoveryResourceGroupId() {
        return this.recoveryResourceGroupId;
    }

    /**
     * Set the recoveryResourceGroupId property: The target resource group Arm Id.
     *
     * @param recoveryResourceGroupId the recoveryResourceGroupId value to set.
     * @return the A2AVmManagedDiskDetails object itself.
     */
    public A2AVmManagedDiskDetails withRecoveryResourceGroupId(String recoveryResourceGroupId) {
        this.recoveryResourceGroupId = recoveryResourceGroupId;
        return this;
    }

    /**
     * Get the recoveryReplicaDiskAccountType property: The replica disk type.
     *
     * @return the recoveryReplicaDiskAccountType value.
     */
    public String recoveryReplicaDiskAccountType() {
        return this.recoveryReplicaDiskAccountType;
    }

    /**
     * Set the recoveryReplicaDiskAccountType property: The replica disk type.
     *
     * @param recoveryReplicaDiskAccountType the recoveryReplicaDiskAccountType value to set.
     * @return the A2AVmManagedDiskDetails object itself.
     */
    public A2AVmManagedDiskDetails withRecoveryReplicaDiskAccountType(String recoveryReplicaDiskAccountType) {
        this.recoveryReplicaDiskAccountType = recoveryReplicaDiskAccountType;
        return this;
    }

    /**
     * Get the recoveryTargetDiskAccountType property: The target disk type after failover.
     *
     * @return the recoveryTargetDiskAccountType value.
     */
    public String recoveryTargetDiskAccountType() {
        return this.recoveryTargetDiskAccountType;
    }

    /**
     * Set the recoveryTargetDiskAccountType property: The target disk type after failover.
     *
     * @param recoveryTargetDiskAccountType the recoveryTargetDiskAccountType value to set.
     * @return the A2AVmManagedDiskDetails object itself.
     */
    public A2AVmManagedDiskDetails withRecoveryTargetDiskAccountType(String recoveryTargetDiskAccountType) {
        this.recoveryTargetDiskAccountType = recoveryTargetDiskAccountType;
        return this;
    }

    /**
     * Get the recoveryDiskEncryptionSetId property: The recovery disk encryption set Id.
     *
     * @return the recoveryDiskEncryptionSetId value.
     */
    public String recoveryDiskEncryptionSetId() {
        return this.recoveryDiskEncryptionSetId;
    }

    /**
     * Set the recoveryDiskEncryptionSetId property: The recovery disk encryption set Id.
     *
     * @param recoveryDiskEncryptionSetId the recoveryDiskEncryptionSetId value to set.
     * @return the A2AVmManagedDiskDetails object itself.
     */
    public A2AVmManagedDiskDetails withRecoveryDiskEncryptionSetId(String recoveryDiskEncryptionSetId) {
        this.recoveryDiskEncryptionSetId = recoveryDiskEncryptionSetId;
        return this;
    }

    /**
     * Get the diskEncryptionInfo property: The recovery disk encryption information (for one / single pass flows).
     *
     * @return the diskEncryptionInfo value.
     */
    public DiskEncryptionInfo diskEncryptionInfo() {
        return this.diskEncryptionInfo;
    }

    /**
     * Set the diskEncryptionInfo property: The recovery disk encryption information (for one / single pass flows).
     *
     * @param diskEncryptionInfo the diskEncryptionInfo value to set.
     * @return the A2AVmManagedDiskDetails object itself.
     */
    public A2AVmManagedDiskDetails withDiskEncryptionInfo(DiskEncryptionInfo diskEncryptionInfo) {
        this.diskEncryptionInfo = diskEncryptionInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (diskEncryptionInfo() != null) {
            diskEncryptionInfo().validate();
        }
    }
}
