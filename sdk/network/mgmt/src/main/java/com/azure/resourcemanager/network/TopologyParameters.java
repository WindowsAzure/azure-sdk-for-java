// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TopologyParameters model. */
@Fluent
public final class TopologyParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TopologyParameters.class);

    /*
     * The name of the target resource group to perform topology on.
     */
    @JsonProperty(value = "targetResourceGroupName")
    private String targetResourceGroupName;

    /*
     * The reference of the Virtual Network resource.
     */
    @JsonProperty(value = "targetVirtualNetwork")
    private SubResource targetVirtualNetwork;

    /*
     * The reference of the Subnet resource.
     */
    @JsonProperty(value = "targetSubnet")
    private SubResource targetSubnet;

    /**
     * Get the targetResourceGroupName property: The name of the target resource group to perform topology on.
     *
     * @return the targetResourceGroupName value.
     */
    public String targetResourceGroupName() {
        return this.targetResourceGroupName;
    }

    /**
     * Set the targetResourceGroupName property: The name of the target resource group to perform topology on.
     *
     * @param targetResourceGroupName the targetResourceGroupName value to set.
     * @return the TopologyParameters object itself.
     */
    public TopologyParameters withTargetResourceGroupName(String targetResourceGroupName) {
        this.targetResourceGroupName = targetResourceGroupName;
        return this;
    }

    /**
     * Get the targetVirtualNetwork property: The reference of the Virtual Network resource.
     *
     * @return the targetVirtualNetwork value.
     */
    public SubResource targetVirtualNetwork() {
        return this.targetVirtualNetwork;
    }

    /**
     * Set the targetVirtualNetwork property: The reference of the Virtual Network resource.
     *
     * @param targetVirtualNetwork the targetVirtualNetwork value to set.
     * @return the TopologyParameters object itself.
     */
    public TopologyParameters withTargetVirtualNetwork(SubResource targetVirtualNetwork) {
        this.targetVirtualNetwork = targetVirtualNetwork;
        return this;
    }

    /**
     * Get the targetSubnet property: The reference of the Subnet resource.
     *
     * @return the targetSubnet value.
     */
    public SubResource targetSubnet() {
        return this.targetSubnet;
    }

    /**
     * Set the targetSubnet property: The reference of the Subnet resource.
     *
     * @param targetSubnet the targetSubnet value to set.
     * @return the TopologyParameters object itself.
     */
    public TopologyParameters withTargetSubnet(SubResource targetSubnet) {
        this.targetSubnet = targetSubnet;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
