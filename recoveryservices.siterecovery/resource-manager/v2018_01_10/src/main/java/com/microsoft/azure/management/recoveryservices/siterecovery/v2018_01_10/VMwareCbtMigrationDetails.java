/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VMwareCbt provider specific settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VMwareCbt")
public class VMwareCbtMigrationDetails extends MigrationProviderSpecificSettings {
    /**
     * The ARM Id of the VM discovered in VMware.
     */
    @JsonProperty(value = "vmwareMachineId", access = JsonProperty.Access.WRITE_ONLY)
    private String vmwareMachineId;

    /**
     * The type of the OS on the VM.
     */
    @JsonProperty(value = "osType", access = JsonProperty.Access.WRITE_ONLY)
    private String osType;

    /**
     * License Type of the VM to be used.
     */
    @JsonProperty(value = "licenseType")
    private String licenseType;

    /**
     * The data mover RunAs account Id.
     */
    @JsonProperty(value = "dataMoverRunAsAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String dataMoverRunAsAccountId;

    /**
     * The snapshot RunAs account Id.
     */
    @JsonProperty(value = "snapshotRunAsAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String snapshotRunAsAccountId;

    /**
     * Target VM name.
     */
    @JsonProperty(value = "targetVmName")
    private String targetVmName;

    /**
     * The target VM size.
     */
    @JsonProperty(value = "targetVmSize")
    private String targetVmSize;

    /**
     * The target location.
     */
    @JsonProperty(value = "targetLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String targetLocation;

    /**
     * The target resource group Id.
     */
    @JsonProperty(value = "targetResourceGroupId")
    private String targetResourceGroupId;

    /**
     * The target availability set Id.
     */
    @JsonProperty(value = "targetAvailabilitySetId")
    private String targetAvailabilitySetId;

    /**
     * The target boot diagnostics storage account ARM Id.
     */
    @JsonProperty(value = "targetBootDiagnosticsStorageAccountId")
    private String targetBootDiagnosticsStorageAccountId;

    /**
     * The list of protected disks.
     */
    @JsonProperty(value = "protectedDisks")
    private List<VMwareCbtProtectedDiskDetails> protectedDisks;

    /**
     * The target network Id.
     */
    @JsonProperty(value = "targetNetworkId")
    private String targetNetworkId;

    /**
     * The network details.
     */
    @JsonProperty(value = "vmNics")
    private List<VMwareCbtNicDetails> vmNics;

    /**
     * The recovery point Id to which the VM was migrated.
     */
    @JsonProperty(value = "migrationRecoveryPointId", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationRecoveryPointId;

    /**
     * The last recovery point received time.
     */
    @JsonProperty(value = "lastRecoveryPointReceived", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastRecoveryPointReceived;

    /**
     * Get the ARM Id of the VM discovered in VMware.
     *
     * @return the vmwareMachineId value
     */
    public String vmwareMachineId() {
        return this.vmwareMachineId;
    }

    /**
     * Get the type of the OS on the VM.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Get license Type of the VM to be used.
     *
     * @return the licenseType value
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set license Type of the VM to be used.
     *
     * @param licenseType the licenseType value to set
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withLicenseType(String licenseType) {
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
     * Get the snapshot RunAs account Id.
     *
     * @return the snapshotRunAsAccountId value
     */
    public String snapshotRunAsAccountId() {
        return this.snapshotRunAsAccountId;
    }

    /**
     * Get target VM name.
     *
     * @return the targetVmName value
     */
    public String targetVmName() {
        return this.targetVmName;
    }

    /**
     * Set target VM name.
     *
     * @param targetVmName the targetVmName value to set
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetVmName(String targetVmName) {
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
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetVmSize(String targetVmSize) {
        this.targetVmSize = targetVmSize;
        return this;
    }

    /**
     * Get the target location.
     *
     * @return the targetLocation value
     */
    public String targetLocation() {
        return this.targetLocation;
    }

    /**
     * Get the target resource group Id.
     *
     * @return the targetResourceGroupId value
     */
    public String targetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    /**
     * Set the target resource group Id.
     *
     * @param targetResourceGroupId the targetResourceGroupId value to set
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetResourceGroupId(String targetResourceGroupId) {
        this.targetResourceGroupId = targetResourceGroupId;
        return this;
    }

    /**
     * Get the target availability set Id.
     *
     * @return the targetAvailabilitySetId value
     */
    public String targetAvailabilitySetId() {
        return this.targetAvailabilitySetId;
    }

    /**
     * Set the target availability set Id.
     *
     * @param targetAvailabilitySetId the targetAvailabilitySetId value to set
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetAvailabilitySetId(String targetAvailabilitySetId) {
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
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetBootDiagnosticsStorageAccountId(String targetBootDiagnosticsStorageAccountId) {
        this.targetBootDiagnosticsStorageAccountId = targetBootDiagnosticsStorageAccountId;
        return this;
    }

    /**
     * Get the list of protected disks.
     *
     * @return the protectedDisks value
     */
    public List<VMwareCbtProtectedDiskDetails> protectedDisks() {
        return this.protectedDisks;
    }

    /**
     * Set the list of protected disks.
     *
     * @param protectedDisks the protectedDisks value to set
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withProtectedDisks(List<VMwareCbtProtectedDiskDetails> protectedDisks) {
        this.protectedDisks = protectedDisks;
        return this;
    }

    /**
     * Get the target network Id.
     *
     * @return the targetNetworkId value
     */
    public String targetNetworkId() {
        return this.targetNetworkId;
    }

    /**
     * Set the target network Id.
     *
     * @param targetNetworkId the targetNetworkId value to set
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withTargetNetworkId(String targetNetworkId) {
        this.targetNetworkId = targetNetworkId;
        return this;
    }

    /**
     * Get the network details.
     *
     * @return the vmNics value
     */
    public List<VMwareCbtNicDetails> vmNics() {
        return this.vmNics;
    }

    /**
     * Set the network details.
     *
     * @param vmNics the vmNics value to set
     * @return the VMwareCbtMigrationDetails object itself.
     */
    public VMwareCbtMigrationDetails withVmNics(List<VMwareCbtNicDetails> vmNics) {
        this.vmNics = vmNics;
        return this;
    }

    /**
     * Get the recovery point Id to which the VM was migrated.
     *
     * @return the migrationRecoveryPointId value
     */
    public String migrationRecoveryPointId() {
        return this.migrationRecoveryPointId;
    }

    /**
     * Get the last recovery point received time.
     *
     * @return the lastRecoveryPointReceived value
     */
    public DateTime lastRecoveryPointReceived() {
        return this.lastRecoveryPointReceived;
    }

}
