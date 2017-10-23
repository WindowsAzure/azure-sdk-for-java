/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.implementation;

import java.util.Map;
import com.microsoft.azure.management.batchai.VmPriority;
import com.microsoft.azure.management.batchai.ScaleSettings;
import com.microsoft.azure.management.batchai.VirtualMachineConfiguration;
import com.microsoft.azure.management.batchai.NodeSetup;
import com.microsoft.azure.management.batchai.UserAccountSettings;
import com.microsoft.azure.management.batchai.ResourceId;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters supplied to the Create operation.
 */
@JsonFlatten
public class ClusterCreateParametersInner {
    /**
     * The region in which to create the cluster.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * The user specified tags associated with the Cluster.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The size of the virtual machines in the cluster.
     * All virtual machines in a cluster are the same size. For information
     * about available VM sizes for clusters using images from the Virtual
     * Machines Marketplace (see Sizes for Virtual Machines (Linux) or Sizes
     * for Virtual Machines (Windows). Batch AI service supports all Azure VM
     * sizes except STANDARD_A0 and those with premium storage (STANDARD_GS,
     * STANDARD_DS, and STANDARD_DSV2 series).
     */
    @JsonProperty(value = "properties.vmSize", required = true)
    private String vmSize;

    /**
     * dedicated or lowpriority.
     * Default is dedicated. Possible values include: 'dedicated',
     * 'lowpriority'.
     */
    @JsonProperty(value = "properties.vmPriority")
    private VmPriority vmPriority;

    /**
     * Desired scale for the cluster.
     */
    @JsonProperty(value = "properties.scaleSettings")
    private ScaleSettings scaleSettings;

    /**
     * Settings for OS image and mounted data volumes.
     */
    @JsonProperty(value = "properties.virtualMachineConfiguration")
    private VirtualMachineConfiguration virtualMachineConfiguration;

    /**
     * Setup to be done on all compute nodes in the cluster.
     */
    @JsonProperty(value = "properties.nodeSetup")
    private NodeSetup nodeSetup;

    /**
     * Settings for user account that will be created on all compute nodes of
     * the cluster.
     */
    @JsonProperty(value = "properties.userAccountSettings", required = true)
    private UserAccountSettings userAccountSettings;

    /**
     * Specifies the identifier of the subnet.
     */
    @JsonProperty(value = "properties.subnet")
    private ResourceId subnet;

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the ClusterCreateParametersInner object itself.
     */
    public ClusterCreateParametersInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the ClusterCreateParametersInner object itself.
     */
    public ClusterCreateParametersInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the vmSize value.
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize value.
     *
     * @param vmSize the vmSize value to set
     * @return the ClusterCreateParametersInner object itself.
     */
    public ClusterCreateParametersInner withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the vmPriority value.
     *
     * @return the vmPriority value
     */
    public VmPriority vmPriority() {
        return this.vmPriority;
    }

    /**
     * Set the vmPriority value.
     *
     * @param vmPriority the vmPriority value to set
     * @return the ClusterCreateParametersInner object itself.
     */
    public ClusterCreateParametersInner withVmPriority(VmPriority vmPriority) {
        this.vmPriority = vmPriority;
        return this;
    }

    /**
     * Get the scaleSettings value.
     *
     * @return the scaleSettings value
     */
    public ScaleSettings scaleSettings() {
        return this.scaleSettings;
    }

    /**
     * Set the scaleSettings value.
     *
     * @param scaleSettings the scaleSettings value to set
     * @return the ClusterCreateParametersInner object itself.
     */
    public ClusterCreateParametersInner withScaleSettings(ScaleSettings scaleSettings) {
        this.scaleSettings = scaleSettings;
        return this;
    }

    /**
     * Get the virtualMachineConfiguration value.
     *
     * @return the virtualMachineConfiguration value
     */
    public VirtualMachineConfiguration virtualMachineConfiguration() {
        return this.virtualMachineConfiguration;
    }

    /**
     * Set the virtualMachineConfiguration value.
     *
     * @param virtualMachineConfiguration the virtualMachineConfiguration value to set
     * @return the ClusterCreateParametersInner object itself.
     */
    public ClusterCreateParametersInner withVirtualMachineConfiguration(VirtualMachineConfiguration virtualMachineConfiguration) {
        this.virtualMachineConfiguration = virtualMachineConfiguration;
        return this;
    }

    /**
     * Get the nodeSetup value.
     *
     * @return the nodeSetup value
     */
    public NodeSetup nodeSetup() {
        return this.nodeSetup;
    }

    /**
     * Set the nodeSetup value.
     *
     * @param nodeSetup the nodeSetup value to set
     * @return the ClusterCreateParametersInner object itself.
     */
    public ClusterCreateParametersInner withNodeSetup(NodeSetup nodeSetup) {
        this.nodeSetup = nodeSetup;
        return this;
    }

    /**
     * Get the userAccountSettings value.
     *
     * @return the userAccountSettings value
     */
    public UserAccountSettings userAccountSettings() {
        return this.userAccountSettings;
    }

    /**
     * Set the userAccountSettings value.
     *
     * @param userAccountSettings the userAccountSettings value to set
     * @return the ClusterCreateParametersInner object itself.
     */
    public ClusterCreateParametersInner withUserAccountSettings(UserAccountSettings userAccountSettings) {
        this.userAccountSettings = userAccountSettings;
        return this;
    }

    /**
     * Get the subnet value.
     *
     * @return the subnet value
     */
    public ResourceId subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet value.
     *
     * @param subnet the subnet value to set
     * @return the ClusterCreateParametersInner object itself.
     */
    public ClusterCreateParametersInner withSubnet(ResourceId subnet) {
        this.subnet = subnet;
        return this;
    }

}
