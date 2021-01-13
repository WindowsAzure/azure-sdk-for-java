// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** VMware Azure specific enable protection input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageAzureV2")
@Fluent
public final class InMageAzureV2EnableProtectionInput extends EnableProtectionProviderSpecificInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InMageAzureV2EnableProtectionInput.class);

    /*
     * The Master target Id.
     */
    @JsonProperty(value = "masterTargetId")
    private String masterTargetId;

    /*
     * The Process Server Id.
     */
    @JsonProperty(value = "processServerId")
    private String processServerId;

    /*
     * The storage account name.
     */
    @JsonProperty(value = "storageAccountId")
    private String storageAccountId;

    /*
     * The CS account Id.
     */
    @JsonProperty(value = "runAsAccountId")
    private String runAsAccountId;

    /*
     * The multi vm group Id.
     */
    @JsonProperty(value = "multiVmGroupId")
    private String multiVmGroupId;

    /*
     * The multi vm group name.
     */
    @JsonProperty(value = "multiVmGroupName")
    private String multiVmGroupName;

    /*
     * The disks to include list.
     */
    @JsonProperty(value = "disksToInclude")
    private List<InMageAzureV2DiskInputDetails> disksToInclude;

    /*
     * The selected target Azure network Id.
     */
    @JsonProperty(value = "targetAzureNetworkId")
    private String targetAzureNetworkId;

    /*
     * The selected target Azure subnet Id.
     */
    @JsonProperty(value = "targetAzureSubnetId")
    private String targetAzureSubnetId;

    /*
     * The selected option to enable RDP\SSH on target vm after failover.
     * String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     */
    @JsonProperty(value = "enableRdpOnTargetOption")
    private String enableRdpOnTargetOption;

    /*
     * The target azure Vm Name.
     */
    @JsonProperty(value = "targetAzureVmName")
    private String targetAzureVmName;

    /*
     * The storage account to be used for logging during replication.
     */
    @JsonProperty(value = "logStorageAccountId")
    private String logStorageAccountId;

    /*
     * The Id of the target resource group (for classic deployment) in which
     * the failover VM is to be created.
     */
    @JsonProperty(value = "targetAzureV1ResourceGroupId")
    private String targetAzureV1ResourceGroupId;

    /*
     * The Id of the target resource group (for resource manager deployment) in
     * which the failover VM is to be created.
     */
    @JsonProperty(value = "targetAzureV2ResourceGroupId")
    private String targetAzureV2ResourceGroupId;

    /*
     * The DiskType.
     */
    @JsonProperty(value = "diskType")
    private DiskAccountType diskType;

    /*
     * The DiskEncryptionSet ARM ID.
     */
    @JsonProperty(value = "diskEncryptionSetId")
    private String diskEncryptionSetId;

    /*
     * The target availability zone.
     */
    @JsonProperty(value = "targetAvailabilityZone")
    private String targetAvailabilityZone;

    /*
     * The proximity placement group ARM Id.
     */
    @JsonProperty(value = "targetProximityPlacementGroupId")
    private String targetProximityPlacementGroupId;

    /*
     * The availability set ARM Id.
     */
    @JsonProperty(value = "targetAvailabilitySetId")
    private String targetAvailabilitySetId;

    /**
     * Get the masterTargetId property: The Master target Id.
     *
     * @return the masterTargetId value.
     */
    public String masterTargetId() {
        return this.masterTargetId;
    }

    /**
     * Set the masterTargetId property: The Master target Id.
     *
     * @param masterTargetId the masterTargetId value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withMasterTargetId(String masterTargetId) {
        this.masterTargetId = masterTargetId;
        return this;
    }

    /**
     * Get the processServerId property: The Process Server Id.
     *
     * @return the processServerId value.
     */
    public String processServerId() {
        return this.processServerId;
    }

    /**
     * Set the processServerId property: The Process Server Id.
     *
     * @param processServerId the processServerId value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withProcessServerId(String processServerId) {
        this.processServerId = processServerId;
        return this;
    }

    /**
     * Get the storageAccountId property: The storage account name.
     *
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the storageAccountId property: The storage account name.
     *
     * @param storageAccountId the storageAccountId value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Get the runAsAccountId property: The CS account Id.
     *
     * @return the runAsAccountId value.
     */
    public String runAsAccountId() {
        return this.runAsAccountId;
    }

    /**
     * Set the runAsAccountId property: The CS account Id.
     *
     * @param runAsAccountId the runAsAccountId value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withRunAsAccountId(String runAsAccountId) {
        this.runAsAccountId = runAsAccountId;
        return this;
    }

    /**
     * Get the multiVmGroupId property: The multi vm group Id.
     *
     * @return the multiVmGroupId value.
     */
    public String multiVmGroupId() {
        return this.multiVmGroupId;
    }

    /**
     * Set the multiVmGroupId property: The multi vm group Id.
     *
     * @param multiVmGroupId the multiVmGroupId value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withMultiVmGroupId(String multiVmGroupId) {
        this.multiVmGroupId = multiVmGroupId;
        return this;
    }

    /**
     * Get the multiVmGroupName property: The multi vm group name.
     *
     * @return the multiVmGroupName value.
     */
    public String multiVmGroupName() {
        return this.multiVmGroupName;
    }

    /**
     * Set the multiVmGroupName property: The multi vm group name.
     *
     * @param multiVmGroupName the multiVmGroupName value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withMultiVmGroupName(String multiVmGroupName) {
        this.multiVmGroupName = multiVmGroupName;
        return this;
    }

    /**
     * Get the disksToInclude property: The disks to include list.
     *
     * @return the disksToInclude value.
     */
    public List<InMageAzureV2DiskInputDetails> disksToInclude() {
        return this.disksToInclude;
    }

    /**
     * Set the disksToInclude property: The disks to include list.
     *
     * @param disksToInclude the disksToInclude value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withDisksToInclude(List<InMageAzureV2DiskInputDetails> disksToInclude) {
        this.disksToInclude = disksToInclude;
        return this;
    }

    /**
     * Get the targetAzureNetworkId property: The selected target Azure network Id.
     *
     * @return the targetAzureNetworkId value.
     */
    public String targetAzureNetworkId() {
        return this.targetAzureNetworkId;
    }

    /**
     * Set the targetAzureNetworkId property: The selected target Azure network Id.
     *
     * @param targetAzureNetworkId the targetAzureNetworkId value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withTargetAzureNetworkId(String targetAzureNetworkId) {
        this.targetAzureNetworkId = targetAzureNetworkId;
        return this;
    }

    /**
     * Get the targetAzureSubnetId property: The selected target Azure subnet Id.
     *
     * @return the targetAzureSubnetId value.
     */
    public String targetAzureSubnetId() {
        return this.targetAzureSubnetId;
    }

    /**
     * Set the targetAzureSubnetId property: The selected target Azure subnet Id.
     *
     * @param targetAzureSubnetId the targetAzureSubnetId value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withTargetAzureSubnetId(String targetAzureSubnetId) {
        this.targetAzureSubnetId = targetAzureSubnetId;
        return this;
    }

    /**
     * Get the enableRdpOnTargetOption property: The selected option to enable RDP\SSH on target vm after failover.
     * String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     *
     * @return the enableRdpOnTargetOption value.
     */
    public String enableRdpOnTargetOption() {
        return this.enableRdpOnTargetOption;
    }

    /**
     * Set the enableRdpOnTargetOption property: The selected option to enable RDP\SSH on target vm after failover.
     * String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     *
     * @param enableRdpOnTargetOption the enableRdpOnTargetOption value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withEnableRdpOnTargetOption(String enableRdpOnTargetOption) {
        this.enableRdpOnTargetOption = enableRdpOnTargetOption;
        return this;
    }

    /**
     * Get the targetAzureVmName property: The target azure Vm Name.
     *
     * @return the targetAzureVmName value.
     */
    public String targetAzureVmName() {
        return this.targetAzureVmName;
    }

    /**
     * Set the targetAzureVmName property: The target azure Vm Name.
     *
     * @param targetAzureVmName the targetAzureVmName value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withTargetAzureVmName(String targetAzureVmName) {
        this.targetAzureVmName = targetAzureVmName;
        return this;
    }

    /**
     * Get the logStorageAccountId property: The storage account to be used for logging during replication.
     *
     * @return the logStorageAccountId value.
     */
    public String logStorageAccountId() {
        return this.logStorageAccountId;
    }

    /**
     * Set the logStorageAccountId property: The storage account to be used for logging during replication.
     *
     * @param logStorageAccountId the logStorageAccountId value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withLogStorageAccountId(String logStorageAccountId) {
        this.logStorageAccountId = logStorageAccountId;
        return this;
    }

    /**
     * Get the targetAzureV1ResourceGroupId property: The Id of the target resource group (for classic deployment) in
     * which the failover VM is to be created.
     *
     * @return the targetAzureV1ResourceGroupId value.
     */
    public String targetAzureV1ResourceGroupId() {
        return this.targetAzureV1ResourceGroupId;
    }

    /**
     * Set the targetAzureV1ResourceGroupId property: The Id of the target resource group (for classic deployment) in
     * which the failover VM is to be created.
     *
     * @param targetAzureV1ResourceGroupId the targetAzureV1ResourceGroupId value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withTargetAzureV1ResourceGroupId(String targetAzureV1ResourceGroupId) {
        this.targetAzureV1ResourceGroupId = targetAzureV1ResourceGroupId;
        return this;
    }

    /**
     * Get the targetAzureV2ResourceGroupId property: The Id of the target resource group (for resource manager
     * deployment) in which the failover VM is to be created.
     *
     * @return the targetAzureV2ResourceGroupId value.
     */
    public String targetAzureV2ResourceGroupId() {
        return this.targetAzureV2ResourceGroupId;
    }

    /**
     * Set the targetAzureV2ResourceGroupId property: The Id of the target resource group (for resource manager
     * deployment) in which the failover VM is to be created.
     *
     * @param targetAzureV2ResourceGroupId the targetAzureV2ResourceGroupId value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withTargetAzureV2ResourceGroupId(String targetAzureV2ResourceGroupId) {
        this.targetAzureV2ResourceGroupId = targetAzureV2ResourceGroupId;
        return this;
    }

    /**
     * Get the diskType property: The DiskType.
     *
     * @return the diskType value.
     */
    public DiskAccountType diskType() {
        return this.diskType;
    }

    /**
     * Set the diskType property: The DiskType.
     *
     * @param diskType the diskType value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withDiskType(DiskAccountType diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * Get the diskEncryptionSetId property: The DiskEncryptionSet ARM ID.
     *
     * @return the diskEncryptionSetId value.
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }

    /**
     * Set the diskEncryptionSetId property: The DiskEncryptionSet ARM ID.
     *
     * @param diskEncryptionSetId the diskEncryptionSetId value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withDiskEncryptionSetId(String diskEncryptionSetId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        return this;
    }

    /**
     * Get the targetAvailabilityZone property: The target availability zone.
     *
     * @return the targetAvailabilityZone value.
     */
    public String targetAvailabilityZone() {
        return this.targetAvailabilityZone;
    }

    /**
     * Set the targetAvailabilityZone property: The target availability zone.
     *
     * @param targetAvailabilityZone the targetAvailabilityZone value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withTargetAvailabilityZone(String targetAvailabilityZone) {
        this.targetAvailabilityZone = targetAvailabilityZone;
        return this;
    }

    /**
     * Get the targetProximityPlacementGroupId property: The proximity placement group ARM Id.
     *
     * @return the targetProximityPlacementGroupId value.
     */
    public String targetProximityPlacementGroupId() {
        return this.targetProximityPlacementGroupId;
    }

    /**
     * Set the targetProximityPlacementGroupId property: The proximity placement group ARM Id.
     *
     * @param targetProximityPlacementGroupId the targetProximityPlacementGroupId value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withTargetProximityPlacementGroupId(
        String targetProximityPlacementGroupId) {
        this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
        return this;
    }

    /**
     * Get the targetAvailabilitySetId property: The availability set ARM Id.
     *
     * @return the targetAvailabilitySetId value.
     */
    public String targetAvailabilitySetId() {
        return this.targetAvailabilitySetId;
    }

    /**
     * Set the targetAvailabilitySetId property: The availability set ARM Id.
     *
     * @param targetAvailabilitySetId the targetAvailabilitySetId value to set.
     * @return the InMageAzureV2EnableProtectionInput object itself.
     */
    public InMageAzureV2EnableProtectionInput withTargetAvailabilitySetId(String targetAvailabilitySetId) {
        this.targetAvailabilitySetId = targetAvailabilitySetId;
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
        if (disksToInclude() != null) {
            disksToInclude().forEach(e -> e.validate());
        }
    }
}
