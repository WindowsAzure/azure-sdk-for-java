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

/** A2A specific switch protection input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
@Fluent
public final class A2ASwitchProtectionInput extends SwitchProtectionProviderSpecificInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(A2ASwitchProtectionInput.class);

    /*
     * The recovery container Id.
     */
    @JsonProperty(value = "recoveryContainerId")
    private String recoveryContainerId;

    /*
     * The list of vm disk details.
     */
    @JsonProperty(value = "vmDisks")
    private List<A2AVmDiskInputDetails> vmDisks;

    /*
     * The list of vm managed disk details.
     */
    @JsonProperty(value = "vmManagedDisks")
    private List<A2AVmManagedDiskInputDetails> vmManagedDisks;

    /*
     * The recovery resource group Id. Valid for V2 scenarios.
     */
    @JsonProperty(value = "recoveryResourceGroupId")
    private String recoveryResourceGroupId;

    /*
     * The recovery cloud service Id. Valid for V1 scenarios.
     */
    @JsonProperty(value = "recoveryCloudServiceId")
    private String recoveryCloudServiceId;

    /*
     * The recovery availability set.
     */
    @JsonProperty(value = "recoveryAvailabilitySetId")
    private String recoveryAvailabilitySetId;

    /*
     * The recovery proximity placement group Id.
     */
    @JsonProperty(value = "recoveryProximityPlacementGroupId")
    private String recoveryProximityPlacementGroupId;

    /*
     * The Policy Id.
     */
    @JsonProperty(value = "policyId")
    private String policyId;

    /*
     * The boot diagnostic storage account.
     */
    @JsonProperty(value = "recoveryBootDiagStorageAccountId")
    private String recoveryBootDiagStorageAccountId;

    /*
     * The recovery disk encryption information.
     */
    @JsonProperty(value = "diskEncryptionInfo")
    private DiskEncryptionInfo diskEncryptionInfo;

    /**
     * Get the recoveryContainerId property: The recovery container Id.
     *
     * @return the recoveryContainerId value.
     */
    public String recoveryContainerId() {
        return this.recoveryContainerId;
    }

    /**
     * Set the recoveryContainerId property: The recovery container Id.
     *
     * @param recoveryContainerId the recoveryContainerId value to set.
     * @return the A2ASwitchProtectionInput object itself.
     */
    public A2ASwitchProtectionInput withRecoveryContainerId(String recoveryContainerId) {
        this.recoveryContainerId = recoveryContainerId;
        return this;
    }

    /**
     * Get the vmDisks property: The list of vm disk details.
     *
     * @return the vmDisks value.
     */
    public List<A2AVmDiskInputDetails> vmDisks() {
        return this.vmDisks;
    }

    /**
     * Set the vmDisks property: The list of vm disk details.
     *
     * @param vmDisks the vmDisks value to set.
     * @return the A2ASwitchProtectionInput object itself.
     */
    public A2ASwitchProtectionInput withVmDisks(List<A2AVmDiskInputDetails> vmDisks) {
        this.vmDisks = vmDisks;
        return this;
    }

    /**
     * Get the vmManagedDisks property: The list of vm managed disk details.
     *
     * @return the vmManagedDisks value.
     */
    public List<A2AVmManagedDiskInputDetails> vmManagedDisks() {
        return this.vmManagedDisks;
    }

    /**
     * Set the vmManagedDisks property: The list of vm managed disk details.
     *
     * @param vmManagedDisks the vmManagedDisks value to set.
     * @return the A2ASwitchProtectionInput object itself.
     */
    public A2ASwitchProtectionInput withVmManagedDisks(List<A2AVmManagedDiskInputDetails> vmManagedDisks) {
        this.vmManagedDisks = vmManagedDisks;
        return this;
    }

    /**
     * Get the recoveryResourceGroupId property: The recovery resource group Id. Valid for V2 scenarios.
     *
     * @return the recoveryResourceGroupId value.
     */
    public String recoveryResourceGroupId() {
        return this.recoveryResourceGroupId;
    }

    /**
     * Set the recoveryResourceGroupId property: The recovery resource group Id. Valid for V2 scenarios.
     *
     * @param recoveryResourceGroupId the recoveryResourceGroupId value to set.
     * @return the A2ASwitchProtectionInput object itself.
     */
    public A2ASwitchProtectionInput withRecoveryResourceGroupId(String recoveryResourceGroupId) {
        this.recoveryResourceGroupId = recoveryResourceGroupId;
        return this;
    }

    /**
     * Get the recoveryCloudServiceId property: The recovery cloud service Id. Valid for V1 scenarios.
     *
     * @return the recoveryCloudServiceId value.
     */
    public String recoveryCloudServiceId() {
        return this.recoveryCloudServiceId;
    }

    /**
     * Set the recoveryCloudServiceId property: The recovery cloud service Id. Valid for V1 scenarios.
     *
     * @param recoveryCloudServiceId the recoveryCloudServiceId value to set.
     * @return the A2ASwitchProtectionInput object itself.
     */
    public A2ASwitchProtectionInput withRecoveryCloudServiceId(String recoveryCloudServiceId) {
        this.recoveryCloudServiceId = recoveryCloudServiceId;
        return this;
    }

    /**
     * Get the recoveryAvailabilitySetId property: The recovery availability set.
     *
     * @return the recoveryAvailabilitySetId value.
     */
    public String recoveryAvailabilitySetId() {
        return this.recoveryAvailabilitySetId;
    }

    /**
     * Set the recoveryAvailabilitySetId property: The recovery availability set.
     *
     * @param recoveryAvailabilitySetId the recoveryAvailabilitySetId value to set.
     * @return the A2ASwitchProtectionInput object itself.
     */
    public A2ASwitchProtectionInput withRecoveryAvailabilitySetId(String recoveryAvailabilitySetId) {
        this.recoveryAvailabilitySetId = recoveryAvailabilitySetId;
        return this;
    }

    /**
     * Get the recoveryProximityPlacementGroupId property: The recovery proximity placement group Id.
     *
     * @return the recoveryProximityPlacementGroupId value.
     */
    public String recoveryProximityPlacementGroupId() {
        return this.recoveryProximityPlacementGroupId;
    }

    /**
     * Set the recoveryProximityPlacementGroupId property: The recovery proximity placement group Id.
     *
     * @param recoveryProximityPlacementGroupId the recoveryProximityPlacementGroupId value to set.
     * @return the A2ASwitchProtectionInput object itself.
     */
    public A2ASwitchProtectionInput withRecoveryProximityPlacementGroupId(String recoveryProximityPlacementGroupId) {
        this.recoveryProximityPlacementGroupId = recoveryProximityPlacementGroupId;
        return this;
    }

    /**
     * Get the policyId property: The Policy Id.
     *
     * @return the policyId value.
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Set the policyId property: The Policy Id.
     *
     * @param policyId the policyId value to set.
     * @return the A2ASwitchProtectionInput object itself.
     */
    public A2ASwitchProtectionInput withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * Get the recoveryBootDiagStorageAccountId property: The boot diagnostic storage account.
     *
     * @return the recoveryBootDiagStorageAccountId value.
     */
    public String recoveryBootDiagStorageAccountId() {
        return this.recoveryBootDiagStorageAccountId;
    }

    /**
     * Set the recoveryBootDiagStorageAccountId property: The boot diagnostic storage account.
     *
     * @param recoveryBootDiagStorageAccountId the recoveryBootDiagStorageAccountId value to set.
     * @return the A2ASwitchProtectionInput object itself.
     */
    public A2ASwitchProtectionInput withRecoveryBootDiagStorageAccountId(String recoveryBootDiagStorageAccountId) {
        this.recoveryBootDiagStorageAccountId = recoveryBootDiagStorageAccountId;
        return this;
    }

    /**
     * Get the diskEncryptionInfo property: The recovery disk encryption information.
     *
     * @return the diskEncryptionInfo value.
     */
    public DiskEncryptionInfo diskEncryptionInfo() {
        return this.diskEncryptionInfo;
    }

    /**
     * Set the diskEncryptionInfo property: The recovery disk encryption information.
     *
     * @param diskEncryptionInfo the diskEncryptionInfo value to set.
     * @return the A2ASwitchProtectionInput object itself.
     */
    public A2ASwitchProtectionInput withDiskEncryptionInfo(DiskEncryptionInfo diskEncryptionInfo) {
        this.diskEncryptionInfo = diskEncryptionInfo;
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
        if (vmDisks() != null) {
            vmDisks().forEach(e -> e.validate());
        }
        if (vmManagedDisks() != null) {
            vmManagedDisks().forEach(e -> e.validate());
        }
        if (diskEncryptionInfo() != null) {
            diskEncryptionInfo().validate();
        }
    }
}
