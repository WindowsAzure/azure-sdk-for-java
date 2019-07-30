/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Azure specific enable protection input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaAzure")
public class HyperVReplicaAzureEnableProtectionInput extends EnableProtectionProviderSpecificInput {
    /**
     * The Hyper-V host Vm Id.
     */
    @JsonProperty(value = "hvHostVmId")
    private String hvHostVmId;

    /**
     * The Vm Name.
     */
    @JsonProperty(value = "vmName")
    private String vmName;

    /**
     * The OS type associated with vm.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /**
     * The OS disk VHD id associated with vm.
     */
    @JsonProperty(value = "vhdId")
    private String vhdId;

    /**
     * The storage account name.
     */
    @JsonProperty(value = "targetStorageAccountId")
    private String targetStorageAccountId;

    /**
     * The selected target Azure network Id.
     */
    @JsonProperty(value = "targetAzureNetworkId")
    private String targetAzureNetworkId;

    /**
     * The selected target Azure subnet Id.
     */
    @JsonProperty(value = "targetAzureSubnetId")
    private String targetAzureSubnetId;

    /**
     * The selected option to enable RDP\SSH on target vm after failover.
     * String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     */
    @JsonProperty(value = "enableRDPOnTargetOption")
    private String enableRDPOnTargetOption;

    /**
     * The target azure Vm Name.
     */
    @JsonProperty(value = "targetAzureVmName")
    private String targetAzureVmName;

    /**
     * The storage account to be used for logging during replication.
     */
    @JsonProperty(value = "logStorageAccountId")
    private String logStorageAccountId;

    /**
     * The list of VHD IDs of disks to be protected.
     */
    @JsonProperty(value = "disksToInclude")
    private List<String> disksToInclude;

    /**
     * The Id of the target resource group (for classic deployment) in which
     * the failover VM is to be created.
     */
    @JsonProperty(value = "targetAzureV1ResourceGroupId")
    private String targetAzureV1ResourceGroupId;

    /**
     * The Id of the target resource group (for resource manager deployment) in
     * which the failover VM is to be created.
     */
    @JsonProperty(value = "targetAzureV2ResourceGroupId")
    private String targetAzureV2ResourceGroupId;

    /**
     * A value indicating whether managed disks should be used during failover.
     */
    @JsonProperty(value = "useManagedDisks")
    private String useManagedDisks;

    /**
     * Get the Hyper-V host Vm Id.
     *
     * @return the hvHostVmId value
     */
    public String hvHostVmId() {
        return this.hvHostVmId;
    }

    /**
     * Set the Hyper-V host Vm Id.
     *
     * @param hvHostVmId the hvHostVmId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withHvHostVmId(String hvHostVmId) {
        this.hvHostVmId = hvHostVmId;
        return this;
    }

    /**
     * Get the Vm Name.
     *
     * @return the vmName value
     */
    public String vmName() {
        return this.vmName;
    }

    /**
     * Set the Vm Name.
     *
     * @param vmName the vmName value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withVmName(String vmName) {
        this.vmName = vmName;
        return this;
    }

    /**
     * Get the OS type associated with vm.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the OS type associated with vm.
     *
     * @param osType the osType value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the OS disk VHD id associated with vm.
     *
     * @return the vhdId value
     */
    public String vhdId() {
        return this.vhdId;
    }

    /**
     * Set the OS disk VHD id associated with vm.
     *
     * @param vhdId the vhdId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withVhdId(String vhdId) {
        this.vhdId = vhdId;
        return this;
    }

    /**
     * Get the storage account name.
     *
     * @return the targetStorageAccountId value
     */
    public String targetStorageAccountId() {
        return this.targetStorageAccountId;
    }

    /**
     * Set the storage account name.
     *
     * @param targetStorageAccountId the targetStorageAccountId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withTargetStorageAccountId(String targetStorageAccountId) {
        this.targetStorageAccountId = targetStorageAccountId;
        return this;
    }

    /**
     * Get the selected target Azure network Id.
     *
     * @return the targetAzureNetworkId value
     */
    public String targetAzureNetworkId() {
        return this.targetAzureNetworkId;
    }

    /**
     * Set the selected target Azure network Id.
     *
     * @param targetAzureNetworkId the targetAzureNetworkId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withTargetAzureNetworkId(String targetAzureNetworkId) {
        this.targetAzureNetworkId = targetAzureNetworkId;
        return this;
    }

    /**
     * Get the selected target Azure subnet Id.
     *
     * @return the targetAzureSubnetId value
     */
    public String targetAzureSubnetId() {
        return this.targetAzureSubnetId;
    }

    /**
     * Set the selected target Azure subnet Id.
     *
     * @param targetAzureSubnetId the targetAzureSubnetId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withTargetAzureSubnetId(String targetAzureSubnetId) {
        this.targetAzureSubnetId = targetAzureSubnetId;
        return this;
    }

    /**
     * Get the selected option to enable RDP\SSH on target vm after failover. String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     *
     * @return the enableRDPOnTargetOption value
     */
    public String enableRDPOnTargetOption() {
        return this.enableRDPOnTargetOption;
    }

    /**
     * Set the selected option to enable RDP\SSH on target vm after failover. String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     *
     * @param enableRDPOnTargetOption the enableRDPOnTargetOption value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withEnableRDPOnTargetOption(String enableRDPOnTargetOption) {
        this.enableRDPOnTargetOption = enableRDPOnTargetOption;
        return this;
    }

    /**
     * Get the target azure Vm Name.
     *
     * @return the targetAzureVmName value
     */
    public String targetAzureVmName() {
        return this.targetAzureVmName;
    }

    /**
     * Set the target azure Vm Name.
     *
     * @param targetAzureVmName the targetAzureVmName value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withTargetAzureVmName(String targetAzureVmName) {
        this.targetAzureVmName = targetAzureVmName;
        return this;
    }

    /**
     * Get the storage account to be used for logging during replication.
     *
     * @return the logStorageAccountId value
     */
    public String logStorageAccountId() {
        return this.logStorageAccountId;
    }

    /**
     * Set the storage account to be used for logging during replication.
     *
     * @param logStorageAccountId the logStorageAccountId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withLogStorageAccountId(String logStorageAccountId) {
        this.logStorageAccountId = logStorageAccountId;
        return this;
    }

    /**
     * Get the list of VHD IDs of disks to be protected.
     *
     * @return the disksToInclude value
     */
    public List<String> disksToInclude() {
        return this.disksToInclude;
    }

    /**
     * Set the list of VHD IDs of disks to be protected.
     *
     * @param disksToInclude the disksToInclude value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withDisksToInclude(List<String> disksToInclude) {
        this.disksToInclude = disksToInclude;
        return this;
    }

    /**
     * Get the Id of the target resource group (for classic deployment) in which the failover VM is to be created.
     *
     * @return the targetAzureV1ResourceGroupId value
     */
    public String targetAzureV1ResourceGroupId() {
        return this.targetAzureV1ResourceGroupId;
    }

    /**
     * Set the Id of the target resource group (for classic deployment) in which the failover VM is to be created.
     *
     * @param targetAzureV1ResourceGroupId the targetAzureV1ResourceGroupId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withTargetAzureV1ResourceGroupId(String targetAzureV1ResourceGroupId) {
        this.targetAzureV1ResourceGroupId = targetAzureV1ResourceGroupId;
        return this;
    }

    /**
     * Get the Id of the target resource group (for resource manager deployment) in which the failover VM is to be created.
     *
     * @return the targetAzureV2ResourceGroupId value
     */
    public String targetAzureV2ResourceGroupId() {
        return this.targetAzureV2ResourceGroupId;
    }

    /**
     * Set the Id of the target resource group (for resource manager deployment) in which the failover VM is to be created.
     *
     * @param targetAzureV2ResourceGroupId the targetAzureV2ResourceGroupId value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withTargetAzureV2ResourceGroupId(String targetAzureV2ResourceGroupId) {
        this.targetAzureV2ResourceGroupId = targetAzureV2ResourceGroupId;
        return this;
    }

    /**
     * Get a value indicating whether managed disks should be used during failover.
     *
     * @return the useManagedDisks value
     */
    public String useManagedDisks() {
        return this.useManagedDisks;
    }

    /**
     * Set a value indicating whether managed disks should be used during failover.
     *
     * @param useManagedDisks the useManagedDisks value to set
     * @return the HyperVReplicaAzureEnableProtectionInput object itself.
     */
    public HyperVReplicaAzureEnableProtectionInput withUseManagedDisks(String useManagedDisks) {
        this.useManagedDisks = useManagedDisks;
        return this;
    }

}
