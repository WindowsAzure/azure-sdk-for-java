/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile for the container service agent pool.
 */
public class ContainerServiceAgentPoolProfile {
    /**
     * Unique name of the agent pool profile in the context of the subscription
     * and resource group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Number of agents (VMs) to host docker containers. Allowed values must be
     * in the range of 1 to 100 (inclusive). The default value is 1.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * Size of agent VMs. Possible values include: 'Standard_A1',
     * 'Standard_A10', 'Standard_A11', 'Standard_A1_v2', 'Standard_A2',
     * 'Standard_A2_v2', 'Standard_A2m_v2', 'Standard_A3', 'Standard_A4',
     * 'Standard_A4_v2', 'Standard_A4m_v2', 'Standard_A5', 'Standard_A6',
     * 'Standard_A7', 'Standard_A8', 'Standard_A8_v2', 'Standard_A8m_v2',
     * 'Standard_A9', 'Standard_B2ms', 'Standard_B2s', 'Standard_B4ms',
     * 'Standard_B8ms', 'Standard_D1', 'Standard_D11', 'Standard_D11_v2',
     * 'Standard_D11_v2_Promo', 'Standard_D12', 'Standard_D12_v2',
     * 'Standard_D12_v2_Promo', 'Standard_D13', 'Standard_D13_v2',
     * 'Standard_D13_v2_Promo', 'Standard_D14', 'Standard_D14_v2',
     * 'Standard_D14_v2_Promo', 'Standard_D15_v2', 'Standard_D16_v3',
     * 'Standard_D16s_v3', 'Standard_D1_v2', 'Standard_D2', 'Standard_D2_v2',
     * 'Standard_D2_v2_Promo', 'Standard_D2_v3', 'Standard_D2s_v3',
     * 'Standard_D3', 'Standard_D32_v3', 'Standard_D32s_v3', 'Standard_D3_v2',
     * 'Standard_D3_v2_Promo', 'Standard_D4', 'Standard_D4_v2',
     * 'Standard_D4_v2_Promo', 'Standard_D4_v3', 'Standard_D4s_v3',
     * 'Standard_D5_v2', 'Standard_D5_v2_Promo', 'Standard_D64_v3',
     * 'Standard_D64s_v3', 'Standard_D8_v3', 'Standard_D8s_v3', 'Standard_DS1',
     * 'Standard_DS11', 'Standard_DS11_v2', 'Standard_DS11_v2_Promo',
     * 'Standard_DS12', 'Standard_DS12_v2', 'Standard_DS12_v2_Promo',
     * 'Standard_DS13', 'Standard_DS13-2_v2', 'Standard_DS13-4_v2',
     * 'Standard_DS13_v2', 'Standard_DS13_v2_Promo', 'Standard_DS14',
     * 'Standard_DS14-4_v2', 'Standard_DS14-8_v2', 'Standard_DS14_v2',
     * 'Standard_DS14_v2_Promo', 'Standard_DS15_v2', 'Standard_DS1_v2',
     * 'Standard_DS2', 'Standard_DS2_v2', 'Standard_DS2_v2_Promo',
     * 'Standard_DS3', 'Standard_DS3_v2', 'Standard_DS3_v2_Promo',
     * 'Standard_DS4', 'Standard_DS4_v2', 'Standard_DS4_v2_Promo',
     * 'Standard_DS5_v2', 'Standard_DS5_v2_Promo', 'Standard_E16_v3',
     * 'Standard_E16s_v3', 'Standard_E2_v3', 'Standard_E2s_v3',
     * 'Standard_E32-16s_v3', 'Standard_E32-8s_v3', 'Standard_E32_v3',
     * 'Standard_E32s_v3', 'Standard_E4_v3', 'Standard_E4s_v3',
     * 'Standard_E64-16s_v3', 'Standard_E64-32s_v3', 'Standard_E64_v3',
     * 'Standard_E64s_v3', 'Standard_E8_v3', 'Standard_E8s_v3', 'Standard_F1',
     * 'Standard_F16', 'Standard_F16s', 'Standard_F16s_v2', 'Standard_F1s',
     * 'Standard_F2', 'Standard_F2s', 'Standard_F2s_v2', 'Standard_F32s_v2',
     * 'Standard_F4', 'Standard_F4s', 'Standard_F4s_v2', 'Standard_F64s_v2',
     * 'Standard_F72s_v2', 'Standard_F8', 'Standard_F8s', 'Standard_F8s_v2',
     * 'Standard_G1', 'Standard_G2', 'Standard_G3', 'Standard_G4',
     * 'Standard_G5', 'Standard_GS1', 'Standard_GS2', 'Standard_GS3',
     * 'Standard_GS4', 'Standard_GS4-4', 'Standard_GS4-8', 'Standard_GS5',
     * 'Standard_GS5-16', 'Standard_GS5-8', 'Standard_H16', 'Standard_H16m',
     * 'Standard_H16mr', 'Standard_H16r', 'Standard_H8', 'Standard_H8m',
     * 'Standard_L16s', 'Standard_L32s', 'Standard_L4s', 'Standard_L8s',
     * 'Standard_M128-32ms', 'Standard_M128-64ms', 'Standard_M128ms',
     * 'Standard_M128s', 'Standard_M64-16ms', 'Standard_M64-32ms',
     * 'Standard_M64ms', 'Standard_M64s', 'Standard_NC12', 'Standard_NC12s_v2',
     * 'Standard_NC12s_v3', 'Standard_NC24', 'Standard_NC24r',
     * 'Standard_NC24rs_v2', 'Standard_NC24rs_v3', 'Standard_NC24s_v2',
     * 'Standard_NC24s_v3', 'Standard_NC6', 'Standard_NC6s_v2',
     * 'Standard_NC6s_v3', 'Standard_ND12s', 'Standard_ND24rs',
     * 'Standard_ND24s', 'Standard_ND6s', 'Standard_NV12', 'Standard_NV24',
     * 'Standard_NV6'.
     */
    @JsonProperty(value = "vmSize", required = true)
    private ContainerServiceVMSizeTypes vmSize;

    /**
     * OS Disk Size in GB to be used to specify the disk size for every machine
     * in this master/agent pool. If you specify 0, it will apply the default
     * osDisk size according to the vmSize specified.
     */
    @JsonProperty(value = "osDiskSizeGB")
    private Integer osDiskSizeGB;

    /**
     * DNS prefix to be used to create the FQDN for the agent pool.
     */
    @JsonProperty(value = "dnsPrefix")
    private String dnsPrefix;

    /**
     * FQDN for the agent pool.
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /**
     * Ports number array used to expose on this agent pool. The default opened
     * ports are different based on your choice of orchestrator.
     */
    @JsonProperty(value = "ports")
    private List<Integer> ports;

    /**
     * Storage profile specifies what kind of storage used. Choose from
     * StorageAccount and ManagedDisks. Leave it empty, we will choose for you
     * based on the orchestrator choice. Possible values include:
     * 'StorageAccount', 'ManagedDisks'.
     */
    @JsonProperty(value = "storageProfile")
    private ContainerServiceStorageProfileTypes storageProfile;

    /**
     * VNet SubnetID specifies the VNet's subnet identifier.
     */
    @JsonProperty(value = "vnetSubnetID")
    private String vnetSubnetID;

    /**
     * OsType to be used to specify os type. Choose from Linux and Windows.
     * Default to Linux. Possible values include: 'Linux', 'Windows'.
     */
    @JsonProperty(value = "osType")
    private OSType osType;

    /**
     * Get unique name of the agent pool profile in the context of the subscription and resource group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set unique name of the agent pool profile in the context of the subscription and resource group.
     *
     * @param name the name value to set
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get number of agents (VMs) to host docker containers. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set number of agents (VMs) to host docker containers. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
     *
     * @param count the count value to set
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get size of agent VMs. Possible values include: 'Standard_A1', 'Standard_A10', 'Standard_A11', 'Standard_A1_v2', 'Standard_A2', 'Standard_A2_v2', 'Standard_A2m_v2', 'Standard_A3', 'Standard_A4', 'Standard_A4_v2', 'Standard_A4m_v2', 'Standard_A5', 'Standard_A6', 'Standard_A7', 'Standard_A8', 'Standard_A8_v2', 'Standard_A8m_v2', 'Standard_A9', 'Standard_B2ms', 'Standard_B2s', 'Standard_B4ms', 'Standard_B8ms', 'Standard_D1', 'Standard_D11', 'Standard_D11_v2', 'Standard_D11_v2_Promo', 'Standard_D12', 'Standard_D12_v2', 'Standard_D12_v2_Promo', 'Standard_D13', 'Standard_D13_v2', 'Standard_D13_v2_Promo', 'Standard_D14', 'Standard_D14_v2', 'Standard_D14_v2_Promo', 'Standard_D15_v2', 'Standard_D16_v3', 'Standard_D16s_v3', 'Standard_D1_v2', 'Standard_D2', 'Standard_D2_v2', 'Standard_D2_v2_Promo', 'Standard_D2_v3', 'Standard_D2s_v3', 'Standard_D3', 'Standard_D32_v3', 'Standard_D32s_v3', 'Standard_D3_v2', 'Standard_D3_v2_Promo', 'Standard_D4', 'Standard_D4_v2', 'Standard_D4_v2_Promo', 'Standard_D4_v3', 'Standard_D4s_v3', 'Standard_D5_v2', 'Standard_D5_v2_Promo', 'Standard_D64_v3', 'Standard_D64s_v3', 'Standard_D8_v3', 'Standard_D8s_v3', 'Standard_DS1', 'Standard_DS11', 'Standard_DS11_v2', 'Standard_DS11_v2_Promo', 'Standard_DS12', 'Standard_DS12_v2', 'Standard_DS12_v2_Promo', 'Standard_DS13', 'Standard_DS13-2_v2', 'Standard_DS13-4_v2', 'Standard_DS13_v2', 'Standard_DS13_v2_Promo', 'Standard_DS14', 'Standard_DS14-4_v2', 'Standard_DS14-8_v2', 'Standard_DS14_v2', 'Standard_DS14_v2_Promo', 'Standard_DS15_v2', 'Standard_DS1_v2', 'Standard_DS2', 'Standard_DS2_v2', 'Standard_DS2_v2_Promo', 'Standard_DS3', 'Standard_DS3_v2', 'Standard_DS3_v2_Promo', 'Standard_DS4', 'Standard_DS4_v2', 'Standard_DS4_v2_Promo', 'Standard_DS5_v2', 'Standard_DS5_v2_Promo', 'Standard_E16_v3', 'Standard_E16s_v3', 'Standard_E2_v3', 'Standard_E2s_v3', 'Standard_E32-16s_v3', 'Standard_E32-8s_v3', 'Standard_E32_v3', 'Standard_E32s_v3', 'Standard_E4_v3', 'Standard_E4s_v3', 'Standard_E64-16s_v3', 'Standard_E64-32s_v3', 'Standard_E64_v3', 'Standard_E64s_v3', 'Standard_E8_v3', 'Standard_E8s_v3', 'Standard_F1', 'Standard_F16', 'Standard_F16s', 'Standard_F16s_v2', 'Standard_F1s', 'Standard_F2', 'Standard_F2s', 'Standard_F2s_v2', 'Standard_F32s_v2', 'Standard_F4', 'Standard_F4s', 'Standard_F4s_v2', 'Standard_F64s_v2', 'Standard_F72s_v2', 'Standard_F8', 'Standard_F8s', 'Standard_F8s_v2', 'Standard_G1', 'Standard_G2', 'Standard_G3', 'Standard_G4', 'Standard_G5', 'Standard_GS1', 'Standard_GS2', 'Standard_GS3', 'Standard_GS4', 'Standard_GS4-4', 'Standard_GS4-8', 'Standard_GS5', 'Standard_GS5-16', 'Standard_GS5-8', 'Standard_H16', 'Standard_H16m', 'Standard_H16mr', 'Standard_H16r', 'Standard_H8', 'Standard_H8m', 'Standard_L16s', 'Standard_L32s', 'Standard_L4s', 'Standard_L8s', 'Standard_M128-32ms', 'Standard_M128-64ms', 'Standard_M128ms', 'Standard_M128s', 'Standard_M64-16ms', 'Standard_M64-32ms', 'Standard_M64ms', 'Standard_M64s', 'Standard_NC12', 'Standard_NC12s_v2', 'Standard_NC12s_v3', 'Standard_NC24', 'Standard_NC24r', 'Standard_NC24rs_v2', 'Standard_NC24rs_v3', 'Standard_NC24s_v2', 'Standard_NC24s_v3', 'Standard_NC6', 'Standard_NC6s_v2', 'Standard_NC6s_v3', 'Standard_ND12s', 'Standard_ND24rs', 'Standard_ND24s', 'Standard_ND6s', 'Standard_NV12', 'Standard_NV24', 'Standard_NV6'.
     *
     * @return the vmSize value
     */
    public ContainerServiceVMSizeTypes vmSize() {
        return this.vmSize;
    }

    /**
     * Set size of agent VMs. Possible values include: 'Standard_A1', 'Standard_A10', 'Standard_A11', 'Standard_A1_v2', 'Standard_A2', 'Standard_A2_v2', 'Standard_A2m_v2', 'Standard_A3', 'Standard_A4', 'Standard_A4_v2', 'Standard_A4m_v2', 'Standard_A5', 'Standard_A6', 'Standard_A7', 'Standard_A8', 'Standard_A8_v2', 'Standard_A8m_v2', 'Standard_A9', 'Standard_B2ms', 'Standard_B2s', 'Standard_B4ms', 'Standard_B8ms', 'Standard_D1', 'Standard_D11', 'Standard_D11_v2', 'Standard_D11_v2_Promo', 'Standard_D12', 'Standard_D12_v2', 'Standard_D12_v2_Promo', 'Standard_D13', 'Standard_D13_v2', 'Standard_D13_v2_Promo', 'Standard_D14', 'Standard_D14_v2', 'Standard_D14_v2_Promo', 'Standard_D15_v2', 'Standard_D16_v3', 'Standard_D16s_v3', 'Standard_D1_v2', 'Standard_D2', 'Standard_D2_v2', 'Standard_D2_v2_Promo', 'Standard_D2_v3', 'Standard_D2s_v3', 'Standard_D3', 'Standard_D32_v3', 'Standard_D32s_v3', 'Standard_D3_v2', 'Standard_D3_v2_Promo', 'Standard_D4', 'Standard_D4_v2', 'Standard_D4_v2_Promo', 'Standard_D4_v3', 'Standard_D4s_v3', 'Standard_D5_v2', 'Standard_D5_v2_Promo', 'Standard_D64_v3', 'Standard_D64s_v3', 'Standard_D8_v3', 'Standard_D8s_v3', 'Standard_DS1', 'Standard_DS11', 'Standard_DS11_v2', 'Standard_DS11_v2_Promo', 'Standard_DS12', 'Standard_DS12_v2', 'Standard_DS12_v2_Promo', 'Standard_DS13', 'Standard_DS13-2_v2', 'Standard_DS13-4_v2', 'Standard_DS13_v2', 'Standard_DS13_v2_Promo', 'Standard_DS14', 'Standard_DS14-4_v2', 'Standard_DS14-8_v2', 'Standard_DS14_v2', 'Standard_DS14_v2_Promo', 'Standard_DS15_v2', 'Standard_DS1_v2', 'Standard_DS2', 'Standard_DS2_v2', 'Standard_DS2_v2_Promo', 'Standard_DS3', 'Standard_DS3_v2', 'Standard_DS3_v2_Promo', 'Standard_DS4', 'Standard_DS4_v2', 'Standard_DS4_v2_Promo', 'Standard_DS5_v2', 'Standard_DS5_v2_Promo', 'Standard_E16_v3', 'Standard_E16s_v3', 'Standard_E2_v3', 'Standard_E2s_v3', 'Standard_E32-16s_v3', 'Standard_E32-8s_v3', 'Standard_E32_v3', 'Standard_E32s_v3', 'Standard_E4_v3', 'Standard_E4s_v3', 'Standard_E64-16s_v3', 'Standard_E64-32s_v3', 'Standard_E64_v3', 'Standard_E64s_v3', 'Standard_E8_v3', 'Standard_E8s_v3', 'Standard_F1', 'Standard_F16', 'Standard_F16s', 'Standard_F16s_v2', 'Standard_F1s', 'Standard_F2', 'Standard_F2s', 'Standard_F2s_v2', 'Standard_F32s_v2', 'Standard_F4', 'Standard_F4s', 'Standard_F4s_v2', 'Standard_F64s_v2', 'Standard_F72s_v2', 'Standard_F8', 'Standard_F8s', 'Standard_F8s_v2', 'Standard_G1', 'Standard_G2', 'Standard_G3', 'Standard_G4', 'Standard_G5', 'Standard_GS1', 'Standard_GS2', 'Standard_GS3', 'Standard_GS4', 'Standard_GS4-4', 'Standard_GS4-8', 'Standard_GS5', 'Standard_GS5-16', 'Standard_GS5-8', 'Standard_H16', 'Standard_H16m', 'Standard_H16mr', 'Standard_H16r', 'Standard_H8', 'Standard_H8m', 'Standard_L16s', 'Standard_L32s', 'Standard_L4s', 'Standard_L8s', 'Standard_M128-32ms', 'Standard_M128-64ms', 'Standard_M128ms', 'Standard_M128s', 'Standard_M64-16ms', 'Standard_M64-32ms', 'Standard_M64ms', 'Standard_M64s', 'Standard_NC12', 'Standard_NC12s_v2', 'Standard_NC12s_v3', 'Standard_NC24', 'Standard_NC24r', 'Standard_NC24rs_v2', 'Standard_NC24rs_v3', 'Standard_NC24s_v2', 'Standard_NC24s_v3', 'Standard_NC6', 'Standard_NC6s_v2', 'Standard_NC6s_v3', 'Standard_ND12s', 'Standard_ND24rs', 'Standard_ND24s', 'Standard_ND6s', 'Standard_NV12', 'Standard_NV24', 'Standard_NV6'.
     *
     * @param vmSize the vmSize value to set
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withVmSize(ContainerServiceVMSizeTypes vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get oS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     *
     * @return the osDiskSizeGB value
     */
    public Integer osDiskSizeGB() {
        return this.osDiskSizeGB;
    }

    /**
     * Set oS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     *
     * @param osDiskSizeGB the osDiskSizeGB value to set
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withOsDiskSizeGB(Integer osDiskSizeGB) {
        this.osDiskSizeGB = osDiskSizeGB;
        return this;
    }

    /**
     * Get dNS prefix to be used to create the FQDN for the agent pool.
     *
     * @return the dnsPrefix value
     */
    public String dnsPrefix() {
        return this.dnsPrefix;
    }

    /**
     * Set dNS prefix to be used to create the FQDN for the agent pool.
     *
     * @param dnsPrefix the dnsPrefix value to set
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withDnsPrefix(String dnsPrefix) {
        this.dnsPrefix = dnsPrefix;
        return this;
    }

    /**
     * Get fQDN for the agent pool.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get ports number array used to expose on this agent pool. The default opened ports are different based on your choice of orchestrator.
     *
     * @return the ports value
     */
    public List<Integer> ports() {
        return this.ports;
    }

    /**
     * Set ports number array used to expose on this agent pool. The default opened ports are different based on your choice of orchestrator.
     *
     * @param ports the ports value to set
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withPorts(List<Integer> ports) {
        this.ports = ports;
        return this;
    }

    /**
     * Get storage profile specifies what kind of storage used. Choose from StorageAccount and ManagedDisks. Leave it empty, we will choose for you based on the orchestrator choice. Possible values include: 'StorageAccount', 'ManagedDisks'.
     *
     * @return the storageProfile value
     */
    public ContainerServiceStorageProfileTypes storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set storage profile specifies what kind of storage used. Choose from StorageAccount and ManagedDisks. Leave it empty, we will choose for you based on the orchestrator choice. Possible values include: 'StorageAccount', 'ManagedDisks'.
     *
     * @param storageProfile the storageProfile value to set
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withStorageProfile(ContainerServiceStorageProfileTypes storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get vNet SubnetID specifies the VNet's subnet identifier.
     *
     * @return the vnetSubnetID value
     */
    public String vnetSubnetID() {
        return this.vnetSubnetID;
    }

    /**
     * Set vNet SubnetID specifies the VNet's subnet identifier.
     *
     * @param vnetSubnetID the vnetSubnetID value to set
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withVnetSubnetID(String vnetSubnetID) {
        this.vnetSubnetID = vnetSubnetID;
        return this;
    }

    /**
     * Get osType to be used to specify os type. Choose from Linux and Windows. Default to Linux. Possible values include: 'Linux', 'Windows'.
     *
     * @return the osType value
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set osType to be used to specify os type. Choose from Linux and Windows. Default to Linux. Possible values include: 'Linux', 'Windows'.
     *
     * @param osType the osType value to set
     * @return the ContainerServiceAgentPoolProfile object itself.
     */
    public ContainerServiceAgentPoolProfile withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

}
