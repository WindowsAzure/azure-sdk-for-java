/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerservice.v2019_08_01.implementation.AgentPoolInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerservice.v2019_08_01.implementation.ContainerServiceManager;
import java.util.List;

/**
 * Type representing AgentPool.
 */
public interface AgentPool extends HasInner<AgentPoolInner>, Indexable, Refreshable<AgentPool>, Updatable<AgentPool.Update>, HasManager<ContainerServiceManager> {
    /**
     * @return the agentPoolType value.
     */
    AgentPoolType agentPoolType();

    /**
     * @return the availabilityZones value.
     */
    List<String> availabilityZones();

    /**
     * @return the count value.
     */
    Integer count();

    /**
     * @return the enableAutoScaling value.
     */
    Boolean enableAutoScaling();

    /**
     * @return the enableNodePublicIP value.
     */
    Boolean enableNodePublicIP();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the maxCount value.
     */
    Integer maxCount();

    /**
     * @return the maxPods value.
     */
    Integer maxPods();

    /**
     * @return the minCount value.
     */
    Integer minCount();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nodeTaints value.
     */
    List<String> nodeTaints();

    /**
     * @return the orchestratorVersion value.
     */
    String orchestratorVersion();

    /**
     * @return the osDiskSizeGB value.
     */
    Integer osDiskSizeGB();

    /**
     * @return the osType value.
     */
    OSType osType();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the scaleSetEvictionPolicy value.
     */
    ScaleSetEvictionPolicy scaleSetEvictionPolicy();

    /**
     * @return the scaleSetPriority value.
     */
    ScaleSetPriority scaleSetPriority();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the vmSize value.
     */
    ContainerServiceVMSizeTypes vmSize();

    /**
     * @return the vnetSubnetID value.
     */
    String vnetSubnetID();

    /**
     * The entirety of the AgentPool definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithManagedCluster, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AgentPool definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AgentPool definition.
         */
        interface Blank extends WithManagedCluster {
        }

        /**
         * The stage of the agentpool definition allowing to specify ManagedCluster.
         */
        interface WithManagedCluster {
           /**
            * Specifies resourceGroupName, resourceName.
            * @param resourceGroupName The name of the resource group
            * @param resourceName The name of the managed cluster resource
            * @return the next definition stage
            */
            WithCreate withExistingManagedCluster(String resourceGroupName, String resourceName);
        }

        /**
         * The stage of the agentpool definition allowing to specify AgentPoolType.
         */
        interface WithAgentPoolType {
            /**
             * Specifies agentPoolType.
             * @param agentPoolType AgentPoolType represents types of an agent pool. Possible values include: 'VirtualMachineScaleSets', 'AvailabilitySet'
             * @return the next definition stage
             */
            WithCreate withAgentPoolType(AgentPoolType agentPoolType);
        }

        /**
         * The stage of the agentpool definition allowing to specify AvailabilityZones.
         */
        interface WithAvailabilityZones {
            /**
             * Specifies availabilityZones.
             * @param availabilityZones (PREVIEW) Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType
             * @return the next definition stage
             */
            WithCreate withAvailabilityZones(List<String> availabilityZones);
        }

        /**
         * The stage of the agentpool definition allowing to specify Count.
         */
        interface WithCount {
            /**
             * Specifies count.
             * @param count Number of agents (VMs) to host docker containers. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1
             * @return the next definition stage
             */
            WithCreate withCount(Integer count);
        }

        /**
         * The stage of the agentpool definition allowing to specify EnableAutoScaling.
         */
        interface WithEnableAutoScaling {
            /**
             * Specifies enableAutoScaling.
             * @param enableAutoScaling Whether to enable auto-scaler
             * @return the next definition stage
             */
            WithCreate withEnableAutoScaling(Boolean enableAutoScaling);
        }

        /**
         * The stage of the agentpool definition allowing to specify EnableNodePublicIP.
         */
        interface WithEnableNodePublicIP {
            /**
             * Specifies enableNodePublicIP.
             * @param enableNodePublicIP Enable public IP for nodes
             * @return the next definition stage
             */
            WithCreate withEnableNodePublicIP(Boolean enableNodePublicIP);
        }

        /**
         * The stage of the agentpool definition allowing to specify MaxCount.
         */
        interface WithMaxCount {
            /**
             * Specifies maxCount.
             * @param maxCount Maximum number of nodes for auto-scaling
             * @return the next definition stage
             */
            WithCreate withMaxCount(Integer maxCount);
        }

        /**
         * The stage of the agentpool definition allowing to specify MaxPods.
         */
        interface WithMaxPods {
            /**
             * Specifies maxPods.
             * @param maxPods Maximum number of pods that can run on a node
             * @return the next definition stage
             */
            WithCreate withMaxPods(Integer maxPods);
        }

        /**
         * The stage of the agentpool definition allowing to specify MinCount.
         */
        interface WithMinCount {
            /**
             * Specifies minCount.
             * @param minCount Minimum number of nodes for auto-scaling
             * @return the next definition stage
             */
            WithCreate withMinCount(Integer minCount);
        }

        /**
         * The stage of the agentpool definition allowing to specify NodeTaints.
         */
        interface WithNodeTaints {
            /**
             * Specifies nodeTaints.
             * @param nodeTaints Taints added to new nodes during node pool create and scale. For example, key=value:NoSchedule
             * @return the next definition stage
             */
            WithCreate withNodeTaints(List<String> nodeTaints);
        }

        /**
         * The stage of the agentpool definition allowing to specify OrchestratorVersion.
         */
        interface WithOrchestratorVersion {
            /**
             * Specifies orchestratorVersion.
             * @param orchestratorVersion Version of orchestrator specified when creating the managed cluster
             * @return the next definition stage
             */
            WithCreate withOrchestratorVersion(String orchestratorVersion);
        }

        /**
         * The stage of the agentpool definition allowing to specify OsDiskSizeGB.
         */
        interface WithOsDiskSizeGB {
            /**
             * Specifies osDiskSizeGB.
             * @param osDiskSizeGB OS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified
             * @return the next definition stage
             */
            WithCreate withOsDiskSizeGB(Integer osDiskSizeGB);
        }

        /**
         * The stage of the agentpool definition allowing to specify OsType.
         */
        interface WithOsType {
            /**
             * Specifies osType.
             * @param osType OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux. Possible values include: 'Linux', 'Windows'
             * @return the next definition stage
             */
            WithCreate withOsType(OSType osType);
        }

        /**
         * The stage of the agentpool definition allowing to specify ScaleSetEvictionPolicy.
         */
        interface WithScaleSetEvictionPolicy {
            /**
             * Specifies scaleSetEvictionPolicy.
             * @param scaleSetEvictionPolicy ScaleSetEvictionPolicy to be used to specify eviction policy for low priority virtual machine scale set. Default to Delete. Possible values include: 'Delete', 'Deallocate'
             * @return the next definition stage
             */
            WithCreate withScaleSetEvictionPolicy(ScaleSetEvictionPolicy scaleSetEvictionPolicy);
        }

        /**
         * The stage of the agentpool definition allowing to specify ScaleSetPriority.
         */
        interface WithScaleSetPriority {
            /**
             * Specifies scaleSetPriority.
             * @param scaleSetPriority ScaleSetPriority to be used to specify virtual machine scale set priority. Default to regular. Possible values include: 'Low', 'Regular'
             * @return the next definition stage
             */
            WithCreate withScaleSetPriority(ScaleSetPriority scaleSetPriority);
        }

        /**
         * The stage of the agentpool definition allowing to specify VmSize.
         */
        interface WithVmSize {
            /**
             * Specifies vmSize.
             * @param vmSize Size of agent VMs. Possible values include: 'Standard_A1', 'Standard_A10', 'Standard_A11', 'Standard_A1_v2', 'Standard_A2', 'Standard_A2_v2', 'Standard_A2m_v2', 'Standard_A3', 'Standard_A4', 'Standard_A4_v2', 'Standard_A4m_v2', 'Standard_A5', 'Standard_A6', 'Standard_A7', 'Standard_A8', 'Standard_A8_v2', 'Standard_A8m_v2', 'Standard_A9', 'Standard_B2ms', 'Standard_B2s', 'Standard_B4ms', 'Standard_B8ms', 'Standard_D1', 'Standard_D11', 'Standard_D11_v2', 'Standard_D11_v2_Promo', 'Standard_D12', 'Standard_D12_v2', 'Standard_D12_v2_Promo', 'Standard_D13', 'Standard_D13_v2', 'Standard_D13_v2_Promo', 'Standard_D14', 'Standard_D14_v2', 'Standard_D14_v2_Promo', 'Standard_D15_v2', 'Standard_D16_v3', 'Standard_D16s_v3', 'Standard_D1_v2', 'Standard_D2', 'Standard_D2_v2', 'Standard_D2_v2_Promo', 'Standard_D2_v3', 'Standard_D2s_v3', 'Standard_D3', 'Standard_D32_v3', 'Standard_D32s_v3', 'Standard_D3_v2', 'Standard_D3_v2_Promo', 'Standard_D4', 'Standard_D4_v2', 'Standard_D4_v2_Promo', 'Standard_D4_v3', 'Standard_D4s_v3', 'Standard_D5_v2', 'Standard_D5_v2_Promo', 'Standard_D64_v3', 'Standard_D64s_v3', 'Standard_D8_v3', 'Standard_D8s_v3', 'Standard_DS1', 'Standard_DS11', 'Standard_DS11_v2', 'Standard_DS11_v2_Promo', 'Standard_DS12', 'Standard_DS12_v2', 'Standard_DS12_v2_Promo', 'Standard_DS13', 'Standard_DS13-2_v2', 'Standard_DS13-4_v2', 'Standard_DS13_v2', 'Standard_DS13_v2_Promo', 'Standard_DS14', 'Standard_DS14-4_v2', 'Standard_DS14-8_v2', 'Standard_DS14_v2', 'Standard_DS14_v2_Promo', 'Standard_DS15_v2', 'Standard_DS1_v2', 'Standard_DS2', 'Standard_DS2_v2', 'Standard_DS2_v2_Promo', 'Standard_DS3', 'Standard_DS3_v2', 'Standard_DS3_v2_Promo', 'Standard_DS4', 'Standard_DS4_v2', 'Standard_DS4_v2_Promo', 'Standard_DS5_v2', 'Standard_DS5_v2_Promo', 'Standard_E16_v3', 'Standard_E16s_v3', 'Standard_E2_v3', 'Standard_E2s_v3', 'Standard_E32-16s_v3', 'Standard_E32-8s_v3', 'Standard_E32_v3', 'Standard_E32s_v3', 'Standard_E4_v3', 'Standard_E4s_v3', 'Standard_E64-16s_v3', 'Standard_E64-32s_v3', 'Standard_E64_v3', 'Standard_E64s_v3', 'Standard_E8_v3', 'Standard_E8s_v3', 'Standard_F1', 'Standard_F16', 'Standard_F16s', 'Standard_F16s_v2', 'Standard_F1s', 'Standard_F2', 'Standard_F2s', 'Standard_F2s_v2', 'Standard_F32s_v2', 'Standard_F4', 'Standard_F4s', 'Standard_F4s_v2', 'Standard_F64s_v2', 'Standard_F72s_v2', 'Standard_F8', 'Standard_F8s', 'Standard_F8s_v2', 'Standard_G1', 'Standard_G2', 'Standard_G3', 'Standard_G4', 'Standard_G5', 'Standard_GS1', 'Standard_GS2', 'Standard_GS3', 'Standard_GS4', 'Standard_GS4-4', 'Standard_GS4-8', 'Standard_GS5', 'Standard_GS5-16', 'Standard_GS5-8', 'Standard_H16', 'Standard_H16m', 'Standard_H16mr', 'Standard_H16r', 'Standard_H8', 'Standard_H8m', 'Standard_L16s', 'Standard_L32s', 'Standard_L4s', 'Standard_L8s', 'Standard_M128-32ms', 'Standard_M128-64ms', 'Standard_M128ms', 'Standard_M128s', 'Standard_M64-16ms', 'Standard_M64-32ms', 'Standard_M64ms', 'Standard_M64s', 'Standard_NC12', 'Standard_NC12s_v2', 'Standard_NC12s_v3', 'Standard_NC24', 'Standard_NC24r', 'Standard_NC24rs_v2', 'Standard_NC24rs_v3', 'Standard_NC24s_v2', 'Standard_NC24s_v3', 'Standard_NC6', 'Standard_NC6s_v2', 'Standard_NC6s_v3', 'Standard_ND12s', 'Standard_ND24rs', 'Standard_ND24s', 'Standard_ND6s', 'Standard_NV12', 'Standard_NV24', 'Standard_NV6'
             * @return the next definition stage
             */
            WithCreate withVmSize(ContainerServiceVMSizeTypes vmSize);
        }

        /**
         * The stage of the agentpool definition allowing to specify VnetSubnetID.
         */
        interface WithVnetSubnetID {
            /**
             * Specifies vnetSubnetID.
             * @param vnetSubnetID VNet SubnetID specifies the VNet's subnet identifier
             * @return the next definition stage
             */
            WithCreate withVnetSubnetID(String vnetSubnetID);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AgentPool>, DefinitionStages.WithAgentPoolType, DefinitionStages.WithAvailabilityZones, DefinitionStages.WithCount, DefinitionStages.WithEnableAutoScaling, DefinitionStages.WithEnableNodePublicIP, DefinitionStages.WithMaxCount, DefinitionStages.WithMaxPods, DefinitionStages.WithMinCount, DefinitionStages.WithNodeTaints, DefinitionStages.WithOrchestratorVersion, DefinitionStages.WithOsDiskSizeGB, DefinitionStages.WithOsType, DefinitionStages.WithScaleSetEvictionPolicy, DefinitionStages.WithScaleSetPriority, DefinitionStages.WithVmSize, DefinitionStages.WithVnetSubnetID {
        }
    }
    /**
     * The template for a AgentPool update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AgentPool>, UpdateStages.WithAgentPoolType, UpdateStages.WithAvailabilityZones, UpdateStages.WithCount, UpdateStages.WithEnableAutoScaling, UpdateStages.WithEnableNodePublicIP, UpdateStages.WithMaxCount, UpdateStages.WithMaxPods, UpdateStages.WithMinCount, UpdateStages.WithNodeTaints, UpdateStages.WithOrchestratorVersion, UpdateStages.WithOsDiskSizeGB, UpdateStages.WithOsType, UpdateStages.WithScaleSetEvictionPolicy, UpdateStages.WithScaleSetPriority, UpdateStages.WithVmSize, UpdateStages.WithVnetSubnetID {
    }

    /**
     * Grouping of AgentPool update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the agentpool update allowing to specify AgentPoolType.
         */
        interface WithAgentPoolType {
            /**
             * Specifies agentPoolType.
             * @param agentPoolType AgentPoolType represents types of an agent pool. Possible values include: 'VirtualMachineScaleSets', 'AvailabilitySet'
             * @return the next update stage
             */
            Update withAgentPoolType(AgentPoolType agentPoolType);
        }

        /**
         * The stage of the agentpool update allowing to specify AvailabilityZones.
         */
        interface WithAvailabilityZones {
            /**
             * Specifies availabilityZones.
             * @param availabilityZones (PREVIEW) Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType
             * @return the next update stage
             */
            Update withAvailabilityZones(List<String> availabilityZones);
        }

        /**
         * The stage of the agentpool update allowing to specify Count.
         */
        interface WithCount {
            /**
             * Specifies count.
             * @param count Number of agents (VMs) to host docker containers. Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1
             * @return the next update stage
             */
            Update withCount(Integer count);
        }

        /**
         * The stage of the agentpool update allowing to specify EnableAutoScaling.
         */
        interface WithEnableAutoScaling {
            /**
             * Specifies enableAutoScaling.
             * @param enableAutoScaling Whether to enable auto-scaler
             * @return the next update stage
             */
            Update withEnableAutoScaling(Boolean enableAutoScaling);
        }

        /**
         * The stage of the agentpool update allowing to specify EnableNodePublicIP.
         */
        interface WithEnableNodePublicIP {
            /**
             * Specifies enableNodePublicIP.
             * @param enableNodePublicIP Enable public IP for nodes
             * @return the next update stage
             */
            Update withEnableNodePublicIP(Boolean enableNodePublicIP);
        }

        /**
         * The stage of the agentpool update allowing to specify MaxCount.
         */
        interface WithMaxCount {
            /**
             * Specifies maxCount.
             * @param maxCount Maximum number of nodes for auto-scaling
             * @return the next update stage
             */
            Update withMaxCount(Integer maxCount);
        }

        /**
         * The stage of the agentpool update allowing to specify MaxPods.
         */
        interface WithMaxPods {
            /**
             * Specifies maxPods.
             * @param maxPods Maximum number of pods that can run on a node
             * @return the next update stage
             */
            Update withMaxPods(Integer maxPods);
        }

        /**
         * The stage of the agentpool update allowing to specify MinCount.
         */
        interface WithMinCount {
            /**
             * Specifies minCount.
             * @param minCount Minimum number of nodes for auto-scaling
             * @return the next update stage
             */
            Update withMinCount(Integer minCount);
        }

        /**
         * The stage of the agentpool update allowing to specify NodeTaints.
         */
        interface WithNodeTaints {
            /**
             * Specifies nodeTaints.
             * @param nodeTaints Taints added to new nodes during node pool create and scale. For example, key=value:NoSchedule
             * @return the next update stage
             */
            Update withNodeTaints(List<String> nodeTaints);
        }

        /**
         * The stage of the agentpool update allowing to specify OrchestratorVersion.
         */
        interface WithOrchestratorVersion {
            /**
             * Specifies orchestratorVersion.
             * @param orchestratorVersion Version of orchestrator specified when creating the managed cluster
             * @return the next update stage
             */
            Update withOrchestratorVersion(String orchestratorVersion);
        }

        /**
         * The stage of the agentpool update allowing to specify OsDiskSizeGB.
         */
        interface WithOsDiskSizeGB {
            /**
             * Specifies osDiskSizeGB.
             * @param osDiskSizeGB OS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified
             * @return the next update stage
             */
            Update withOsDiskSizeGB(Integer osDiskSizeGB);
        }

        /**
         * The stage of the agentpool update allowing to specify OsType.
         */
        interface WithOsType {
            /**
             * Specifies osType.
             * @param osType OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux. Possible values include: 'Linux', 'Windows'
             * @return the next update stage
             */
            Update withOsType(OSType osType);
        }

        /**
         * The stage of the agentpool update allowing to specify ScaleSetEvictionPolicy.
         */
        interface WithScaleSetEvictionPolicy {
            /**
             * Specifies scaleSetEvictionPolicy.
             * @param scaleSetEvictionPolicy ScaleSetEvictionPolicy to be used to specify eviction policy for low priority virtual machine scale set. Default to Delete. Possible values include: 'Delete', 'Deallocate'
             * @return the next update stage
             */
            Update withScaleSetEvictionPolicy(ScaleSetEvictionPolicy scaleSetEvictionPolicy);
        }

        /**
         * The stage of the agentpool update allowing to specify ScaleSetPriority.
         */
        interface WithScaleSetPriority {
            /**
             * Specifies scaleSetPriority.
             * @param scaleSetPriority ScaleSetPriority to be used to specify virtual machine scale set priority. Default to regular. Possible values include: 'Low', 'Regular'
             * @return the next update stage
             */
            Update withScaleSetPriority(ScaleSetPriority scaleSetPriority);
        }

        /**
         * The stage of the agentpool update allowing to specify VmSize.
         */
        interface WithVmSize {
            /**
             * Specifies vmSize.
             * @param vmSize Size of agent VMs. Possible values include: 'Standard_A1', 'Standard_A10', 'Standard_A11', 'Standard_A1_v2', 'Standard_A2', 'Standard_A2_v2', 'Standard_A2m_v2', 'Standard_A3', 'Standard_A4', 'Standard_A4_v2', 'Standard_A4m_v2', 'Standard_A5', 'Standard_A6', 'Standard_A7', 'Standard_A8', 'Standard_A8_v2', 'Standard_A8m_v2', 'Standard_A9', 'Standard_B2ms', 'Standard_B2s', 'Standard_B4ms', 'Standard_B8ms', 'Standard_D1', 'Standard_D11', 'Standard_D11_v2', 'Standard_D11_v2_Promo', 'Standard_D12', 'Standard_D12_v2', 'Standard_D12_v2_Promo', 'Standard_D13', 'Standard_D13_v2', 'Standard_D13_v2_Promo', 'Standard_D14', 'Standard_D14_v2', 'Standard_D14_v2_Promo', 'Standard_D15_v2', 'Standard_D16_v3', 'Standard_D16s_v3', 'Standard_D1_v2', 'Standard_D2', 'Standard_D2_v2', 'Standard_D2_v2_Promo', 'Standard_D2_v3', 'Standard_D2s_v3', 'Standard_D3', 'Standard_D32_v3', 'Standard_D32s_v3', 'Standard_D3_v2', 'Standard_D3_v2_Promo', 'Standard_D4', 'Standard_D4_v2', 'Standard_D4_v2_Promo', 'Standard_D4_v3', 'Standard_D4s_v3', 'Standard_D5_v2', 'Standard_D5_v2_Promo', 'Standard_D64_v3', 'Standard_D64s_v3', 'Standard_D8_v3', 'Standard_D8s_v3', 'Standard_DS1', 'Standard_DS11', 'Standard_DS11_v2', 'Standard_DS11_v2_Promo', 'Standard_DS12', 'Standard_DS12_v2', 'Standard_DS12_v2_Promo', 'Standard_DS13', 'Standard_DS13-2_v2', 'Standard_DS13-4_v2', 'Standard_DS13_v2', 'Standard_DS13_v2_Promo', 'Standard_DS14', 'Standard_DS14-4_v2', 'Standard_DS14-8_v2', 'Standard_DS14_v2', 'Standard_DS14_v2_Promo', 'Standard_DS15_v2', 'Standard_DS1_v2', 'Standard_DS2', 'Standard_DS2_v2', 'Standard_DS2_v2_Promo', 'Standard_DS3', 'Standard_DS3_v2', 'Standard_DS3_v2_Promo', 'Standard_DS4', 'Standard_DS4_v2', 'Standard_DS4_v2_Promo', 'Standard_DS5_v2', 'Standard_DS5_v2_Promo', 'Standard_E16_v3', 'Standard_E16s_v3', 'Standard_E2_v3', 'Standard_E2s_v3', 'Standard_E32-16s_v3', 'Standard_E32-8s_v3', 'Standard_E32_v3', 'Standard_E32s_v3', 'Standard_E4_v3', 'Standard_E4s_v3', 'Standard_E64-16s_v3', 'Standard_E64-32s_v3', 'Standard_E64_v3', 'Standard_E64s_v3', 'Standard_E8_v3', 'Standard_E8s_v3', 'Standard_F1', 'Standard_F16', 'Standard_F16s', 'Standard_F16s_v2', 'Standard_F1s', 'Standard_F2', 'Standard_F2s', 'Standard_F2s_v2', 'Standard_F32s_v2', 'Standard_F4', 'Standard_F4s', 'Standard_F4s_v2', 'Standard_F64s_v2', 'Standard_F72s_v2', 'Standard_F8', 'Standard_F8s', 'Standard_F8s_v2', 'Standard_G1', 'Standard_G2', 'Standard_G3', 'Standard_G4', 'Standard_G5', 'Standard_GS1', 'Standard_GS2', 'Standard_GS3', 'Standard_GS4', 'Standard_GS4-4', 'Standard_GS4-8', 'Standard_GS5', 'Standard_GS5-16', 'Standard_GS5-8', 'Standard_H16', 'Standard_H16m', 'Standard_H16mr', 'Standard_H16r', 'Standard_H8', 'Standard_H8m', 'Standard_L16s', 'Standard_L32s', 'Standard_L4s', 'Standard_L8s', 'Standard_M128-32ms', 'Standard_M128-64ms', 'Standard_M128ms', 'Standard_M128s', 'Standard_M64-16ms', 'Standard_M64-32ms', 'Standard_M64ms', 'Standard_M64s', 'Standard_NC12', 'Standard_NC12s_v2', 'Standard_NC12s_v3', 'Standard_NC24', 'Standard_NC24r', 'Standard_NC24rs_v2', 'Standard_NC24rs_v3', 'Standard_NC24s_v2', 'Standard_NC24s_v3', 'Standard_NC6', 'Standard_NC6s_v2', 'Standard_NC6s_v3', 'Standard_ND12s', 'Standard_ND24rs', 'Standard_ND24s', 'Standard_ND6s', 'Standard_NV12', 'Standard_NV24', 'Standard_NV6'
             * @return the next update stage
             */
            Update withVmSize(ContainerServiceVMSizeTypes vmSize);
        }

        /**
         * The stage of the agentpool update allowing to specify VnetSubnetID.
         */
        interface WithVnetSubnetID {
            /**
             * Specifies vnetSubnetID.
             * @param vnetSubnetID VNet SubnetID specifies the VNet's subnet identifier
             * @return the next update stage
             */
            Update withVnetSubnetID(String vnetSubnetID);
        }

    }
}
