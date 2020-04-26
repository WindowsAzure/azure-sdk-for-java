/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define the representation of topology.
 */
public class TopologyParameters {
    /**
     * The name of the target resource group to perform topology on.
     */
    @JsonProperty(value = "targetResourceGroupName")
    private String targetResourceGroupName;

    /**
     * The reference to the Virtual Network resource.
     */
    @JsonProperty(value = "targetVirtualNetwork")
    private SubResource targetVirtualNetwork;

    /**
     * The reference to the Subnet resource.
     */
    @JsonProperty(value = "targetSubnet")
    private SubResource targetSubnet;

    /**
     * Get the name of the target resource group to perform topology on.
     *
     * @return the targetResourceGroupName value
     */
    public String targetResourceGroupName() {
        return this.targetResourceGroupName;
    }

    /**
     * Set the name of the target resource group to perform topology on.
     *
     * @param targetResourceGroupName the targetResourceGroupName value to set
     * @return the TopologyParameters object itself.
     */
    public TopologyParameters withTargetResourceGroupName(String targetResourceGroupName) {
        this.targetResourceGroupName = targetResourceGroupName;
        return this;
    }

    /**
     * Get the reference to the Virtual Network resource.
     *
     * @return the targetVirtualNetwork value
     */
    public SubResource targetVirtualNetwork() {
        return this.targetVirtualNetwork;
    }

    /**
     * Set the reference to the Virtual Network resource.
     *
     * @param targetVirtualNetwork the targetVirtualNetwork value to set
     * @return the TopologyParameters object itself.
     */
    public TopologyParameters withTargetVirtualNetwork(SubResource targetVirtualNetwork) {
        this.targetVirtualNetwork = targetVirtualNetwork;
        return this;
    }

    /**
     * Get the reference to the Subnet resource.
     *
     * @return the targetSubnet value
     */
    public SubResource targetSubnet() {
        return this.targetSubnet;
    }

    /**
     * Set the reference to the Subnet resource.
     *
     * @param targetSubnet the targetSubnet value to set
     * @return the TopologyParameters object itself.
     */
    public TopologyParameters withTargetSubnet(SubResource targetSubnet) {
        this.targetSubnet = targetSubnet;
        return this;
    }

}
