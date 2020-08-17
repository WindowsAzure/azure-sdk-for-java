// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.models.AgentPoolMode;
import com.azure.resourcemanager.containerservice.models.AgentPoolType;
import com.azure.resourcemanager.containerservice.models.AgentPoolUpgradeSettings;
import com.azure.resourcemanager.containerservice.models.ContainerServiceVMSizeTypes;
import com.azure.resourcemanager.containerservice.models.OSType;
import com.azure.resourcemanager.containerservice.models.ScaleSetEvictionPolicy;
import com.azure.resourcemanager.containerservice.models.ScaleSetPriority;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The AgentPool model. */
@JsonFlatten
@Fluent
public class AgentPoolInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AgentPoolInner.class);

    /*
     * Number of agents (VMs) to host docker containers. Allowed values must be
     * in the range of 0 to 100 (inclusive) for user pools and in the range of
     * 1 to 100 (inclusive) for system pools. The default value is 1.
     */
    @JsonProperty(value = "properties.count")
    private Integer count;

    /*
     * Size of agent VMs.
     */
    @JsonProperty(value = "properties.vmSize")
    private ContainerServiceVMSizeTypes vmSize;

    /*
     * OS Disk Size in GB to be used to specify the disk size for every machine
     * in this master/agent pool. If you specify 0, it will apply the default
     * osDisk size according to the vmSize specified.
     */
    @JsonProperty(value = "properties.osDiskSizeGB")
    private Integer osDiskSizeGB;

    /*
     * VNet SubnetID specifies the VNet's subnet identifier.
     */
    @JsonProperty(value = "properties.vnetSubnetID")
    private String vnetSubnetId;

    /*
     * Maximum number of pods that can run on a node.
     */
    @JsonProperty(value = "properties.maxPods")
    private Integer maxPods;

    /*
     * OsType to be used to specify os type. Choose from Linux and Windows.
     * Default to Linux.
     */
    @JsonProperty(value = "properties.osType")
    private OSType osType;

    /*
     * Maximum number of nodes for auto-scaling
     */
    @JsonProperty(value = "properties.maxCount")
    private Integer maxCount;

    /*
     * Minimum number of nodes for auto-scaling
     */
    @JsonProperty(value = "properties.minCount")
    private Integer minCount;

    /*
     * Whether to enable auto-scaler
     */
    @JsonProperty(value = "properties.enableAutoScaling")
    private Boolean enableAutoScaling;

    /*
     * AgentPoolType represents types of an agent pool
     */
    @JsonProperty(value = "properties.type")
    private AgentPoolType typePropertiesType;

    /*
     * AgentPoolMode represents mode of an agent pool
     */
    @JsonProperty(value = "properties.mode")
    private AgentPoolMode mode;

    /*
     * Version of orchestrator specified when creating the managed cluster.
     */
    @JsonProperty(value = "properties.orchestratorVersion")
    private String orchestratorVersion;

    /*
     * Version of node image
     */
    @JsonProperty(value = "properties.nodeImageVersion")
    private String nodeImageVersion;

    /*
     * Settings for upgrading the agentpool
     */
    @JsonProperty(value = "properties.upgradeSettings")
    private AgentPoolUpgradeSettings upgradeSettings;

    /*
     * The current deployment or provisioning state, which only appears in the
     * response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Availability zones for nodes. Must use VirtualMachineScaleSets
     * AgentPoolType.
     */
    @JsonProperty(value = "properties.availabilityZones")
    private List<String> availabilityZones;

    /*
     * Enable public IP for nodes
     */
    @JsonProperty(value = "properties.enableNodePublicIP")
    private Boolean enableNodePublicIp;

    /*
     * ScaleSetPriority to be used to specify virtual machine scale set
     * priority. Default to regular.
     */
    @JsonProperty(value = "properties.scaleSetPriority")
    private ScaleSetPriority scaleSetPriority;

    /*
     * ScaleSetEvictionPolicy to be used to specify eviction policy for Spot
     * virtual machine scale set. Default to Delete.
     */
    @JsonProperty(value = "properties.scaleSetEvictionPolicy")
    private ScaleSetEvictionPolicy scaleSetEvictionPolicy;

    /*
     * SpotMaxPrice to be used to specify the maximum price you are willing to
     * pay in US Dollars. Possible values are any decimal value greater than
     * zero or -1 which indicates default price to be up-to on-demand.
     */
    @JsonProperty(value = "properties.spotMaxPrice")
    private Float spotMaxPrice;

    /*
     * Agent pool tags to be persisted on the agent pool virtual machine scale
     * set.
     */
    @JsonProperty(value = "properties.tags")
    private Map<String, String> tags;

    /*
     * Agent pool node labels to be persisted across all nodes in agent pool.
     */
    @JsonProperty(value = "properties.nodeLabels")
    private Map<String, String> nodeLabels;

    /*
     * Taints added to new nodes during node pool create and scale. For
     * example, key=value:NoSchedule.
     */
    @JsonProperty(value = "properties.nodeTaints")
    private List<String> nodeTaints;

    /*
     * The ID for Proximity Placement Group.
     */
    @JsonProperty(value = "properties.proximityPlacementGroupID")
    private String proximityPlacementGroupId;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the count property: Number of agents (VMs) to host docker containers. Allowed values must be in the range of
     * 0 to 100 (inclusive) for user pools and in the range of 1 to 100 (inclusive) for system pools. The default value
     * is 1.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Number of agents (VMs) to host docker containers. Allowed values must be in the range of
     * 0 to 100 (inclusive) for user pools and in the range of 1 to 100 (inclusive) for system pools. The default value
     * is 1.
     *
     * @param count the count value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withCount(Integer count) {
        this.count = count;
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
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withVmSize(ContainerServiceVMSizeTypes vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the osDiskSizeGB property: OS Disk Size in GB to be used to specify the disk size for every machine in this
     * master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     *
     * @return the osDiskSizeGB value.
     */
    public Integer osDiskSizeGB() {
        return this.osDiskSizeGB;
    }

    /**
     * Set the osDiskSizeGB property: OS Disk Size in GB to be used to specify the disk size for every machine in this
     * master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     *
     * @param osDiskSizeGB the osDiskSizeGB value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withOsDiskSizeGB(Integer osDiskSizeGB) {
        this.osDiskSizeGB = osDiskSizeGB;
        return this;
    }

    /**
     * Get the vnetSubnetId property: VNet SubnetID specifies the VNet's subnet identifier.
     *
     * @return the vnetSubnetId value.
     */
    public String vnetSubnetId() {
        return this.vnetSubnetId;
    }

    /**
     * Set the vnetSubnetId property: VNet SubnetID specifies the VNet's subnet identifier.
     *
     * @param vnetSubnetId the vnetSubnetId value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withVnetSubnetId(String vnetSubnetId) {
        this.vnetSubnetId = vnetSubnetId;
        return this;
    }

    /**
     * Get the maxPods property: Maximum number of pods that can run on a node.
     *
     * @return the maxPods value.
     */
    public Integer maxPods() {
        return this.maxPods;
    }

    /**
     * Set the maxPods property: Maximum number of pods that can run on a node.
     *
     * @param maxPods the maxPods value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withMaxPods(Integer maxPods) {
        this.maxPods = maxPods;
        return this;
    }

    /**
     * Get the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     *
     * @return the osType value.
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     *
     * @param osType the osType value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the maxCount property: Maximum number of nodes for auto-scaling.
     *
     * @return the maxCount value.
     */
    public Integer maxCount() {
        return this.maxCount;
    }

    /**
     * Set the maxCount property: Maximum number of nodes for auto-scaling.
     *
     * @param maxCount the maxCount value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * Get the minCount property: Minimum number of nodes for auto-scaling.
     *
     * @return the minCount value.
     */
    public Integer minCount() {
        return this.minCount;
    }

    /**
     * Set the minCount property: Minimum number of nodes for auto-scaling.
     *
     * @param minCount the minCount value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * Get the enableAutoScaling property: Whether to enable auto-scaler.
     *
     * @return the enableAutoScaling value.
     */
    public Boolean enableAutoScaling() {
        return this.enableAutoScaling;
    }

    /**
     * Set the enableAutoScaling property: Whether to enable auto-scaler.
     *
     * @param enableAutoScaling the enableAutoScaling value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withEnableAutoScaling(Boolean enableAutoScaling) {
        this.enableAutoScaling = enableAutoScaling;
        return this;
    }

    /**
     * Get the typePropertiesType property: AgentPoolType represents types of an agent pool.
     *
     * @return the typePropertiesType value.
     */
    public AgentPoolType typePropertiesType() {
        return this.typePropertiesType;
    }

    /**
     * Set the typePropertiesType property: AgentPoolType represents types of an agent pool.
     *
     * @param typePropertiesType the typePropertiesType value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withTypePropertiesType(AgentPoolType typePropertiesType) {
        this.typePropertiesType = typePropertiesType;
        return this;
    }

    /**
     * Get the mode property: AgentPoolMode represents mode of an agent pool.
     *
     * @return the mode value.
     */
    public AgentPoolMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: AgentPoolMode represents mode of an agent pool.
     *
     * @param mode the mode value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withMode(AgentPoolMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the orchestratorVersion property: Version of orchestrator specified when creating the managed cluster.
     *
     * @return the orchestratorVersion value.
     */
    public String orchestratorVersion() {
        return this.orchestratorVersion;
    }

    /**
     * Set the orchestratorVersion property: Version of orchestrator specified when creating the managed cluster.
     *
     * @param orchestratorVersion the orchestratorVersion value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withOrchestratorVersion(String orchestratorVersion) {
        this.orchestratorVersion = orchestratorVersion;
        return this;
    }

    /**
     * Get the nodeImageVersion property: Version of node image.
     *
     * @return the nodeImageVersion value.
     */
    public String nodeImageVersion() {
        return this.nodeImageVersion;
    }

    /**
     * Set the nodeImageVersion property: Version of node image.
     *
     * @param nodeImageVersion the nodeImageVersion value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withNodeImageVersion(String nodeImageVersion) {
        this.nodeImageVersion = nodeImageVersion;
        return this;
    }

    /**
     * Get the upgradeSettings property: Settings for upgrading the agentpool.
     *
     * @return the upgradeSettings value.
     */
    public AgentPoolUpgradeSettings upgradeSettings() {
        return this.upgradeSettings;
    }

    /**
     * Set the upgradeSettings property: Settings for upgrading the agentpool.
     *
     * @param upgradeSettings the upgradeSettings value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withUpgradeSettings(AgentPoolUpgradeSettings upgradeSettings) {
        this.upgradeSettings = upgradeSettings;
        return this;
    }

    /**
     * Get the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the availabilityZones property: Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     *
     * @return the availabilityZones value.
     */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }

    /**
     * Set the availabilityZones property: Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     *
     * @param availabilityZones the availabilityZones value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    /**
     * Get the enableNodePublicIp property: Enable public IP for nodes.
     *
     * @return the enableNodePublicIp value.
     */
    public Boolean enableNodePublicIp() {
        return this.enableNodePublicIp;
    }

    /**
     * Set the enableNodePublicIp property: Enable public IP for nodes.
     *
     * @param enableNodePublicIp the enableNodePublicIp value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withEnableNodePublicIp(Boolean enableNodePublicIp) {
        this.enableNodePublicIp = enableNodePublicIp;
        return this;
    }

    /**
     * Get the scaleSetPriority property: ScaleSetPriority to be used to specify virtual machine scale set priority.
     * Default to regular.
     *
     * @return the scaleSetPriority value.
     */
    public ScaleSetPriority scaleSetPriority() {
        return this.scaleSetPriority;
    }

    /**
     * Set the scaleSetPriority property: ScaleSetPriority to be used to specify virtual machine scale set priority.
     * Default to regular.
     *
     * @param scaleSetPriority the scaleSetPriority value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withScaleSetPriority(ScaleSetPriority scaleSetPriority) {
        this.scaleSetPriority = scaleSetPriority;
        return this;
    }

    /**
     * Get the scaleSetEvictionPolicy property: ScaleSetEvictionPolicy to be used to specify eviction policy for Spot
     * virtual machine scale set. Default to Delete.
     *
     * @return the scaleSetEvictionPolicy value.
     */
    public ScaleSetEvictionPolicy scaleSetEvictionPolicy() {
        return this.scaleSetEvictionPolicy;
    }

    /**
     * Set the scaleSetEvictionPolicy property: ScaleSetEvictionPolicy to be used to specify eviction policy for Spot
     * virtual machine scale set. Default to Delete.
     *
     * @param scaleSetEvictionPolicy the scaleSetEvictionPolicy value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withScaleSetEvictionPolicy(ScaleSetEvictionPolicy scaleSetEvictionPolicy) {
        this.scaleSetEvictionPolicy = scaleSetEvictionPolicy;
        return this;
    }

    /**
     * Get the spotMaxPrice property: SpotMaxPrice to be used to specify the maximum price you are willing to pay in US
     * Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to
     * on-demand.
     *
     * @return the spotMaxPrice value.
     */
    public Float spotMaxPrice() {
        return this.spotMaxPrice;
    }

    /**
     * Set the spotMaxPrice property: SpotMaxPrice to be used to specify the maximum price you are willing to pay in US
     * Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to
     * on-demand.
     *
     * @param spotMaxPrice the spotMaxPrice value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withSpotMaxPrice(Float spotMaxPrice) {
        this.spotMaxPrice = spotMaxPrice;
        return this;
    }

    /**
     * Get the tags property: Agent pool tags to be persisted on the agent pool virtual machine scale set.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Agent pool tags to be persisted on the agent pool virtual machine scale set.
     *
     * @param tags the tags value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the nodeLabels property: Agent pool node labels to be persisted across all nodes in agent pool.
     *
     * @return the nodeLabels value.
     */
    public Map<String, String> nodeLabels() {
        return this.nodeLabels;
    }

    /**
     * Set the nodeLabels property: Agent pool node labels to be persisted across all nodes in agent pool.
     *
     * @param nodeLabels the nodeLabels value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withNodeLabels(Map<String, String> nodeLabels) {
        this.nodeLabels = nodeLabels;
        return this;
    }

    /**
     * Get the nodeTaints property: Taints added to new nodes during node pool create and scale. For example,
     * key=value:NoSchedule.
     *
     * @return the nodeTaints value.
     */
    public List<String> nodeTaints() {
        return this.nodeTaints;
    }

    /**
     * Set the nodeTaints property: Taints added to new nodes during node pool create and scale. For example,
     * key=value:NoSchedule.
     *
     * @param nodeTaints the nodeTaints value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withNodeTaints(List<String> nodeTaints) {
        this.nodeTaints = nodeTaints;
        return this;
    }

    /**
     * Get the proximityPlacementGroupId property: The ID for Proximity Placement Group.
     *
     * @return the proximityPlacementGroupId value.
     */
    public String proximityPlacementGroupId() {
        return this.proximityPlacementGroupId;
    }

    /**
     * Set the proximityPlacementGroupId property: The ID for Proximity Placement Group.
     *
     * @param proximityPlacementGroupId the proximityPlacementGroupId value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withProximityPlacementGroupId(String proximityPlacementGroupId) {
        this.proximityPlacementGroupId = proximityPlacementGroupId;
        return this;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (upgradeSettings() != null) {
            upgradeSettings().validate();
        }
    }
}
