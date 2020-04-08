// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ContainerServiceMasterProfile model.
 */
@Fluent
public final class ContainerServiceMasterProfile {
    /*
     * Number of masters (VMs) in the container service cluster. Allowed values
     * are 1, 3, and 5. The default value is 1.
     */
    @JsonProperty(value = "count")
    private Count count;

    /*
     * DNS prefix to be used to create the FQDN for the master pool.
     */
    @JsonProperty(value = "dnsPrefix", required = true)
    private String dnsPrefix;

    /*
     * Size of agent VMs.
     */
    @JsonProperty(value = "vmSize", required = true)
    private ContainerServiceVMSizeTypes vmSize;

    /*
     * OS Disk Size in GB to be used to specify the disk size for every machine
     * in this master/agent pool. If you specify 0, it will apply the default
     * osDisk size according to the vmSize specified.
     */
    @JsonProperty(value = "osDiskSizeGB")
    private Integer osDiskSizeGB;

    /*
     * VNet SubnetID specifies the VNet's subnet identifier.
     */
    @JsonProperty(value = "vnetSubnetID")
    private String vnetSubnetID;

    /*
     * FirstConsecutiveStaticIP used to specify the first static ip of masters.
     */
    @JsonProperty(value = "firstConsecutiveStaticIP")
    private String firstConsecutiveStaticIP;

    /*
     * Storage profile specifies what kind of storage used. Choose from
     * StorageAccount and ManagedDisks. Leave it empty, we will choose for you
     * based on the orchestrator choice.
     */
    @JsonProperty(value = "storageProfile")
    private ContainerServiceStorageProfileTypes storageProfile;

    /*
     * FQDN for the master pool.
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /**
     * Get the count property: Number of masters (VMs) in the container service
     * cluster. Allowed values are 1, 3, and 5. The default value is 1.
     * 
     * @return the count value.
     */
    public Count count() {
        return this.count;
    }

    /**
     * Set the count property: Number of masters (VMs) in the container service
     * cluster. Allowed values are 1, 3, and 5. The default value is 1.
     * 
     * @param count the count value to set.
     * @return the ContainerServiceMasterProfile object itself.
     */
    public ContainerServiceMasterProfile withCount(Count count) {
        this.count = count;
        return this;
    }

    /**
     * Get the dnsPrefix property: DNS prefix to be used to create the FQDN for
     * the master pool.
     * 
     * @return the dnsPrefix value.
     */
    public String dnsPrefix() {
        return this.dnsPrefix;
    }

    /**
     * Set the dnsPrefix property: DNS prefix to be used to create the FQDN for
     * the master pool.
     * 
     * @param dnsPrefix the dnsPrefix value to set.
     * @return the ContainerServiceMasterProfile object itself.
     */
    public ContainerServiceMasterProfile withDnsPrefix(String dnsPrefix) {
        this.dnsPrefix = dnsPrefix;
        return this;
    }

    /**
     * Get the vmSize property: Size of agent VMs.
     * 
     * @return the vmSize value.
     */
    public ContainerServiceVMSizeTypes vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Size of agent VMs.
     * 
     * @param vmSize the vmSize value to set.
     * @return the ContainerServiceMasterProfile object itself.
     */
    public ContainerServiceMasterProfile withVmSize(ContainerServiceVMSizeTypes vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the osDiskSizeGB property: OS Disk Size in GB to be used to specify
     * the disk size for every machine in this master/agent pool. If you
     * specify 0, it will apply the default osDisk size according to the vmSize
     * specified.
     * 
     * @return the osDiskSizeGB value.
     */
    public Integer osDiskSizeGB() {
        return this.osDiskSizeGB;
    }

    /**
     * Set the osDiskSizeGB property: OS Disk Size in GB to be used to specify
     * the disk size for every machine in this master/agent pool. If you
     * specify 0, it will apply the default osDisk size according to the vmSize
     * specified.
     * 
     * @param osDiskSizeGB the osDiskSizeGB value to set.
     * @return the ContainerServiceMasterProfile object itself.
     */
    public ContainerServiceMasterProfile withOsDiskSizeGB(Integer osDiskSizeGB) {
        this.osDiskSizeGB = osDiskSizeGB;
        return this;
    }

    /**
     * Get the vnetSubnetID property: VNet SubnetID specifies the VNet's subnet
     * identifier.
     * 
     * @return the vnetSubnetID value.
     */
    public String vnetSubnetID() {
        return this.vnetSubnetID;
    }

    /**
     * Set the vnetSubnetID property: VNet SubnetID specifies the VNet's subnet
     * identifier.
     * 
     * @param vnetSubnetID the vnetSubnetID value to set.
     * @return the ContainerServiceMasterProfile object itself.
     */
    public ContainerServiceMasterProfile withVnetSubnetID(String vnetSubnetID) {
        this.vnetSubnetID = vnetSubnetID;
        return this;
    }

    /**
     * Get the firstConsecutiveStaticIP property: FirstConsecutiveStaticIP used
     * to specify the first static ip of masters.
     * 
     * @return the firstConsecutiveStaticIP value.
     */
    public String firstConsecutiveStaticIP() {
        return this.firstConsecutiveStaticIP;
    }

    /**
     * Set the firstConsecutiveStaticIP property: FirstConsecutiveStaticIP used
     * to specify the first static ip of masters.
     * 
     * @param firstConsecutiveStaticIP the firstConsecutiveStaticIP value to
     * set.
     * @return the ContainerServiceMasterProfile object itself.
     */
    public ContainerServiceMasterProfile withFirstConsecutiveStaticIP(String firstConsecutiveStaticIP) {
        this.firstConsecutiveStaticIP = firstConsecutiveStaticIP;
        return this;
    }

    /**
     * Get the storageProfile property: Storage profile specifies what kind of
     * storage used. Choose from StorageAccount and ManagedDisks. Leave it
     * empty, we will choose for you based on the orchestrator choice.
     * 
     * @return the storageProfile value.
     */
    public ContainerServiceStorageProfileTypes storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Storage profile specifies what kind of
     * storage used. Choose from StorageAccount and ManagedDisks. Leave it
     * empty, we will choose for you based on the orchestrator choice.
     * 
     * @param storageProfile the storageProfile value to set.
     * @return the ContainerServiceMasterProfile object itself.
     */
    public ContainerServiceMasterProfile withStorageProfile(ContainerServiceStorageProfileTypes storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the fqdn property: FQDN for the master pool.
     * 
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }
}
