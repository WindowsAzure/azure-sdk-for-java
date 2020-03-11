/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VMwareCbt specific enable migration input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType", defaultImpl = VMwareCbtEnableMigrationInput.class)
@JsonTypeName("VMwareCbt")
public class VMwareCbtEnableMigrationInput extends EnableMigrationProviderSpecificInput {
    /**
     * The ARM Id of the VM discovered in VMware.
     */
    @JsonProperty(value = "vmwareMachineId", required = true)
    private String vmwareMachineId;

    /**
     * The disks to include list.
     */
    @JsonProperty(value = "disksToInclude", required = true)
    private List<VMwareCbtDiskInput> disksToInclude;

    /**
     * License type. Possible values include: 'NotSpecified', 'NoLicenseType',
     * 'WindowsServer'.
     */
    @JsonProperty(value = "licenseType")
    private LicenseType licenseType;

    /**
     * The data mover RunAs account Id.
     */
    @JsonProperty(value = "dataMoverRunAsAccountId", required = true)
    private String dataMoverRunAsAccountId;

    /**
     * The snapshot RunAs account Id.
     */
    @JsonProperty(value = "snapshotRunAsAccountId", required = true)
    private String snapshotRunAsAccountId;

    /**
     * The target VM name.
     */
    @JsonProperty(value = "targetVmName")
    private String targetVmName;

    /**
     * The target VM size.
     */
    @JsonProperty(value = "targetVmSize")
    private String targetVmSize;

    /**
     * The target resource group ARM Id.
     */
    @JsonProperty(value = "targetResourceGroupId", required = true)
    private String targetResourceGroupId;

    /**
     * The target network ARM Id.
     */
    @JsonProperty(value = "targetNetworkId", required = true)
    private String targetNetworkId;

    /**
     * The target subnet name.
     */
    @JsonProperty(value = "targetSubnetName")
    private String targetSubnetName;

    /**
     * The target availability set ARM Id.
     */
    @JsonProperty(value = "targetAvailabilitySetId")
    private String targetAvailabilitySetId;

    /**
     * The target boot diagnostics storage account ARM Id.
     */
    @JsonProperty(value = "targetBootDiagnosticsStorageAccountId")
    private String targetBootDiagnosticsStorageAccountId;

    /**
     * A value indicating whether auto resync is to be done.
     */
    @JsonProperty(value = "performAutoResync")
    private String performAutoResync;

    /**
     * Get the ARM Id of the VM discovered in VMware.
     *
     * @return the vmwareMachineId value
     */
    public String vmwareMachineId() {
        return this.vmwareMachineId;
    }

    /**
     * Set the ARM Id of the VM discovered in VMware.
     *
     * @param vmwareMachineId the vmwareMachineId value to set
     * @return the VMwareCbtEnableMigrationInput object itself.
     */
    public VMwareCbtEnableMigrationInput withVmwareMachineId(String vmwareMachineId) {
        this.vmwareMachineId = vmwareMachineId;
        return this;
    }

    /**
     * Get the disks to include list.
     *
     * @return the disksToInclude value
     */
    public List<VMwareCbtDiskInput> disksToInclude() {
        return this.disksToInclude;
    }

    /**
     * Set the disks to include list.
     *
     * @param disksToInclude the disksToInclude value to set
     * @return the VMwareCbtEnableMigrationInput object itself.
     */
    public VMwareCbtEnableMigrationInput withDisksToInclude(List<VMwareCbtDiskInput> disksToInclude) {
        this.disksToInclude = disksToInclude;
        return this;
    }

    /**
     * Get license type. Possible values include: 'NotSpecified', 'NoLicenseType', 'WindowsServer'.
     *
     * @return the licenseType value
     */
    public LicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set license type. Possible values include: 'NotSpecified', 'NoLicenseType', 'WindowsServer'.
     *
     * @param licenseType the licenseType value to set
     * @return the VMwareCbtEnableMigrationInput object itself.
     */
    public VMwareCbtEnableMigrationInput withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the data mover RunAs account Id.
     *
     * @return the dataMoverRunAsAccountId value
     */
    public String dataMoverRunAsAccountId() {
        return this.dataMoverRunAsAccountId;
    }

    /**
     * Set the data mover RunAs account Id.
     *
     * @param dataMoverRunAsAccountId the dataMoverRunAsAccountId value to set
     * @return the VMwareCbtEnableMigrationInput object itself.
     */
    public VMwareCbtEnableMigrationInput withDataMoverRunAsAccountId(String dataMoverRunAsAccountId) {
        this.dataMoverRunAsAccountId = dataMoverRunAsAccountId;
        return this;
    }

    /**
     * Get the snapshot RunAs account Id.
     *
     * @return the snapshotRunAsAccountId value
     */
    public String snapshotRunAsAccountId() {
        return this.snapshotRunAsAccountId;
    }

    /**
     * Set the snapshot RunAs account Id.
     *
     * @param snapshotRunAsAccountId the snapshotRunAsAccountId value to set
     * @return the VMwareCbtEnableMigrationInput object itself.
     */
    public VMwareCbtEnableMigrationInput withSnapshotRunAsAccountId(String snapshotRunAsAccountId) {
        this.snapshotRunAsAccountId = snapshotRunAsAccountId;
        return this;
    }

    /**
     * Get the target VM name.
     *
     * @return the targetVmName value
     */
    public String targetVmName() {
        return this.targetVmName;
    }

    /**
     * Set the target VM name.
     *
     * @param targetVmName the targetVmName value to set
     * @return the VMwareCbtEnableMigrationInput object itself.
     */
    public VMwareCbtEnableMigrationInput withTargetVmName(String targetVmName) {
        this.targetVmName = targetVmName;
        return this;
    }

    /**
     * Get the target VM size.
     *
     * @return the targetVmSize value
     */
    public String targetVmSize() {
        return this.targetVmSize;
    }

    /**
     * Set the target VM size.
     *
     * @param targetVmSize the targetVmSize value to set
     * @return the VMwareCbtEnableMigrationInput object itself.
     */
    public VMwareCbtEnableMigrationInput withTargetVmSize(String targetVmSize) {
        this.targetVmSize = targetVmSize;
        return this;
    }

    /**
     * Get the target resource group ARM Id.
     *
     * @return the targetResourceGroupId value
     */
    public String targetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    /**
     * Set the target resource group ARM Id.
     *
     * @param targetResourceGroupId the targetResourceGroupId value to set
     * @return the VMwareCbtEnableMigrationInput object itself.
     */
    public VMwareCbtEnableMigrationInput withTargetResourceGroupId(String targetResourceGroupId) {
        this.targetResourceGroupId = targetResourceGroupId;
        return this;
    }

    /**
     * Get the target network ARM Id.
     *
     * @return the targetNetworkId value
     */
    public String targetNetworkId() {
        return this.targetNetworkId;
    }

    /**
     * Set the target network ARM Id.
     *
     * @param targetNetworkId the targetNetworkId value to set
     * @return the VMwareCbtEnableMigrationInput object itself.
     */
    public VMwareCbtEnableMigrationInput withTargetNetworkId(String targetNetworkId) {
        this.targetNetworkId = targetNetworkId;
        return this;
    }

    /**
     * Get the target subnet name.
     *
     * @return the targetSubnetName value
     */
    public String targetSubnetName() {
        return this.targetSubnetName;
    }

    /**
     * Set the target subnet name.
     *
     * @param targetSubnetName the targetSubnetName value to set
     * @return the VMwareCbtEnableMigrationInput object itself.
     */
    public VMwareCbtEnableMigrationInput withTargetSubnetName(String targetSubnetName) {
        this.targetSubnetName = targetSubnetName;
        return this;
    }

    /**
     * Get the target availability set ARM Id.
     *
     * @return the targetAvailabilitySetId value
     */
    public String targetAvailabilitySetId() {
        return this.targetAvailabilitySetId;
    }

    /**
     * Set the target availability set ARM Id.
     *
     * @param targetAvailabilitySetId the targetAvailabilitySetId value to set
     * @return the VMwareCbtEnableMigrationInput object itself.
     */
    public VMwareCbtEnableMigrationInput withTargetAvailabilitySetId(String targetAvailabilitySetId) {
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        return this;
    }

    /**
     * Get the target boot diagnostics storage account ARM Id.
     *
     * @return the targetBootDiagnosticsStorageAccountId value
     */
    public String targetBootDiagnosticsStorageAccountId() {
        return this.targetBootDiagnosticsStorageAccountId;
    }

    /**
     * Set the target boot diagnostics storage account ARM Id.
     *
     * @param targetBootDiagnosticsStorageAccountId the targetBootDiagnosticsStorageAccountId value to set
     * @return the VMwareCbtEnableMigrationInput object itself.
     */
    public VMwareCbtEnableMigrationInput withTargetBootDiagnosticsStorageAccountId(String targetBootDiagnosticsStorageAccountId) {
        this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
        return this;
    }

    /**
     * Get a value indicating whether auto resync is to be done.
     *
     * @return the performAutoResync value
     */
    public String performAutoResync() {
        return this.performAutoResync;
    }

    /**
     * Set a value indicating whether auto resync is to be done.
     *
     * @param performAutoResync the performAutoResync value to set
     * @return the VMwareCbtEnableMigrationInput object itself.
     */
    public VMwareCbtEnableMigrationInput withPerformAutoResync(String performAutoResync) {
        this.performAutoResync = performAutoResync;
        return this;
    }

}
