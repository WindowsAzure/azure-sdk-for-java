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
 * A2A enable protection input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
public class A2AEnableProtectionInput extends EnableProtectionProviderSpecificInput {
    /**
     * The fabric specific object Id of the virtual machine.
     */
    @JsonProperty(value = "fabricObjectId")
    private String fabricObjectId;

    /**
     * The recovery container Id.
     */
    @JsonProperty(value = "recoveryContainerId")
    private String recoveryContainerId;

    /**
     * The recovery resource group Id. Valid for V2 scenarios.
     */
    @JsonProperty(value = "recoveryResourceGroupId")
    private String recoveryResourceGroupId;

    /**
     * The recovery cloud service Id. Valid for V1 scenarios.
     */
    @JsonProperty(value = "recoveryCloudServiceId")
    private String recoveryCloudServiceId;

    /**
     * The recovery availability set Id.
     */
    @JsonProperty(value = "recoveryAvailabilitySetId")
    private String recoveryAvailabilitySetId;

    /**
     * The list of vm disk details.
     */
    @JsonProperty(value = "vmDisks")
    private List<A2AVmDiskInputDetails> vmDisks;

    /**
     * The list of vm managed disk details.
     */
    @JsonProperty(value = "vmManagedDisks")
    private List<A2AVmManagedDiskInputDetails> vmManagedDisks;

    /**
     * The multi vm group name.
     */
    @JsonProperty(value = "multiVmGroupName")
    private String multiVmGroupName;

    /**
     * The boot diagnostic storage account.
     */
    @JsonProperty(value = "recoveryBootDiagStorageAccountId")
    private String recoveryBootDiagStorageAccountId;

    /**
     * The recovery disk encryption information.
     */
    @JsonProperty(value = "diskEncryptionInfo")
    private DiskEncryptionInfo diskEncryptionInfo;

    /**
     * Get the fabric specific object Id of the virtual machine.
     *
     * @return the fabricObjectId value
     */
    public String fabricObjectId() {
        return this.fabricObjectId;
    }

    /**
     * Set the fabric specific object Id of the virtual machine.
     *
     * @param fabricObjectId the fabricObjectId value to set
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withFabricObjectId(String fabricObjectId) {
        this.fabricObjectId = fabricObjectId;
        return this;
    }

    /**
     * Get the recovery container Id.
     *
     * @return the recoveryContainerId value
     */
    public String recoveryContainerId() {
        return this.recoveryContainerId;
    }

    /**
     * Set the recovery container Id.
     *
     * @param recoveryContainerId the recoveryContainerId value to set
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryContainerId(String recoveryContainerId) {
        this.recoveryContainerId = recoveryContainerId;
        return this;
    }

    /**
     * Get the recovery resource group Id. Valid for V2 scenarios.
     *
     * @return the recoveryResourceGroupId value
     */
    public String recoveryResourceGroupId() {
        return this.recoveryResourceGroupId;
    }

    /**
     * Set the recovery resource group Id. Valid for V2 scenarios.
     *
     * @param recoveryResourceGroupId the recoveryResourceGroupId value to set
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryResourceGroupId(String recoveryResourceGroupId) {
        this.recoveryResourceGroupId = recoveryResourceGroupId;
        return this;
    }

    /**
     * Get the recovery cloud service Id. Valid for V1 scenarios.
     *
     * @return the recoveryCloudServiceId value
     */
    public String recoveryCloudServiceId() {
        return this.recoveryCloudServiceId;
    }

    /**
     * Set the recovery cloud service Id. Valid for V1 scenarios.
     *
     * @param recoveryCloudServiceId the recoveryCloudServiceId value to set
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryCloudServiceId(String recoveryCloudServiceId) {
        this.recoveryCloudServiceId = recoveryCloudServiceId;
        return this;
    }

    /**
     * Get the recovery availability set Id.
     *
     * @return the recoveryAvailabilitySetId value
     */
    public String recoveryAvailabilitySetId() {
        return this.recoveryAvailabilitySetId;
    }

    /**
     * Set the recovery availability set Id.
     *
     * @param recoveryAvailabilitySetId the recoveryAvailabilitySetId value to set
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryAvailabilitySetId(String recoveryAvailabilitySetId) {
        this.recoveryAvailabilitySetId = recoveryAvailabilitySetId;
        return this;
    }

    /**
     * Get the list of vm disk details.
     *
     * @return the vmDisks value
     */
    public List<A2AVmDiskInputDetails> vmDisks() {
        return this.vmDisks;
    }

    /**
     * Set the list of vm disk details.
     *
     * @param vmDisks the vmDisks value to set
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withVmDisks(List<A2AVmDiskInputDetails> vmDisks) {
        this.vmDisks = vmDisks;
        return this;
    }

    /**
     * Get the list of vm managed disk details.
     *
     * @return the vmManagedDisks value
     */
    public List<A2AVmManagedDiskInputDetails> vmManagedDisks() {
        return this.vmManagedDisks;
    }

    /**
     * Set the list of vm managed disk details.
     *
     * @param vmManagedDisks the vmManagedDisks value to set
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withVmManagedDisks(List<A2AVmManagedDiskInputDetails> vmManagedDisks) {
        this.vmManagedDisks = vmManagedDisks;
        return this;
    }

    /**
     * Get the multi vm group name.
     *
     * @return the multiVmGroupName value
     */
    public String multiVmGroupName() {
        return this.multiVmGroupName;
    }

    /**
     * Set the multi vm group name.
     *
     * @param multiVmGroupName the multiVmGroupName value to set
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withMultiVmGroupName(String multiVmGroupName) {
        this.multiVmGroupName = multiVmGroupName;
        return this;
    }

    /**
     * Get the boot diagnostic storage account.
     *
     * @return the recoveryBootDiagStorageAccountId value
     */
    public String recoveryBootDiagStorageAccountId() {
        return this.recoveryBootDiagStorageAccountId;
    }

    /**
     * Set the boot diagnostic storage account.
     *
     * @param recoveryBootDiagStorageAccountId the recoveryBootDiagStorageAccountId value to set
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withRecoveryBootDiagStorageAccountId(String recoveryBootDiagStorageAccountId) {
        this.recoveryBootDiagStorageAccountId = recoveryBootDiagStorageAccountId;
        return this;
    }

    /**
     * Get the recovery disk encryption information.
     *
     * @return the diskEncryptionInfo value
     */
    public DiskEncryptionInfo diskEncryptionInfo() {
        return this.diskEncryptionInfo;
    }

    /**
     * Set the recovery disk encryption information.
     *
     * @param diskEncryptionInfo the diskEncryptionInfo value to set
     * @return the A2AEnableProtectionInput object itself.
     */
    public A2AEnableProtectionInput withDiskEncryptionInfo(DiskEncryptionInfo diskEncryptionInfo) {
        this.diskEncryptionInfo = diskEncryptionInfo;
        return this;
    }

}
