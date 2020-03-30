/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.ProtectionContainerInner;

/**
 * IaaS VM workload-specific container.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "containerType", defaultImpl = IaaSVMContainer.class)
@JsonTypeName("IaaSVMContainer")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Microsoft.ClassicCompute/virtualMachines", value = AzureIaaSClassicComputeVMContainer.class),
    @JsonSubTypes.Type(name = "Microsoft.Compute/virtualMachines", value = AzureIaaSComputeVMContainer.class)
})
public class IaaSVMContainer extends ProtectionContainerInner {
    /**
     * Fully qualified ARM url of the virtual machine represented by this Azure
     * IaaS VM container.
     */
    @JsonProperty(value = "virtualMachineId")
    private String virtualMachineId;

    /**
     * Specifies whether the container represents a Classic or an Azure
     * Resource Manager VM.
     */
    @JsonProperty(value = "virtualMachineVersion")
    private String virtualMachineVersion;

    /**
     * Resource group name of Recovery Services Vault.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /**
     * Get fully qualified ARM url of the virtual machine represented by this Azure IaaS VM container.
     *
     * @return the virtualMachineId value
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     * Set fully qualified ARM url of the virtual machine represented by this Azure IaaS VM container.
     *
     * @param virtualMachineId the virtualMachineId value to set
     * @return the IaaSVMContainer object itself.
     */
    public IaaSVMContainer withVirtualMachineId(String virtualMachineId) {
        this.virtualMachineId = virtualMachineId;
        return this;
    }

    /**
     * Get specifies whether the container represents a Classic or an Azure Resource Manager VM.
     *
     * @return the virtualMachineVersion value
     */
    public String virtualMachineVersion() {
        return this.virtualMachineVersion;
    }

    /**
     * Set specifies whether the container represents a Classic or an Azure Resource Manager VM.
     *
     * @param virtualMachineVersion the virtualMachineVersion value to set
     * @return the IaaSVMContainer object itself.
     */
    public IaaSVMContainer withVirtualMachineVersion(String virtualMachineVersion) {
        this.virtualMachineVersion = virtualMachineVersion;
        return this;
    }

    /**
     * Get resource group name of Recovery Services Vault.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set resource group name of Recovery Services Vault.
     *
     * @param resourceGroup the resourceGroup value to set
     * @return the IaaSVMContainer object itself.
     */
    public IaaSVMContainer withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

}
