// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.management.compute.ProximityPlacementGroupType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ProximityPlacementGroup model. */
@JsonFlatten
@Fluent
public class ProximityPlacementGroupInner extends Resource {
    /*
     * Specifies the type of the proximity placement group. <br><br> Possible
     * values are: <br><br> **Standard** : Co-locate resources within an Azure
     * region or Availability Zone. <br><br> **Ultra** : For future use.
     */
    @JsonProperty(value = "properties.proximityPlacementGroupType")
    private ProximityPlacementGroupType proximityPlacementGroupType;

    /*
     * A list of references to all virtual machines in the proximity placement
     * group.
     */
    @JsonProperty(value = "properties.virtualMachines", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> virtualMachines;

    /*
     * A list of references to all virtual machine scale sets in the proximity
     * placement group.
     */
    @JsonProperty(value = "properties.virtualMachineScaleSets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> virtualMachineScaleSets;

    /*
     * A list of references to all availability sets in the proximity placement
     * group.
     */
    @JsonProperty(value = "properties.availabilitySets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> availabilitySets;

    /**
     * Get the proximityPlacementGroupType property: Specifies the type of the proximity placement group.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Standard** : Co-locate resources within an Azure
     * region or Availability Zone. &lt;br&gt;&lt;br&gt; **Ultra** : For future use.
     *
     * @return the proximityPlacementGroupType value.
     */
    public ProximityPlacementGroupType proximityPlacementGroupType() {
        return this.proximityPlacementGroupType;
    }

    /**
     * Set the proximityPlacementGroupType property: Specifies the type of the proximity placement group.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Standard** : Co-locate resources within an Azure
     * region or Availability Zone. &lt;br&gt;&lt;br&gt; **Ultra** : For future use.
     *
     * @param proximityPlacementGroupType the proximityPlacementGroupType value to set.
     * @return the ProximityPlacementGroupInner object itself.
     */
    public ProximityPlacementGroupInner withProximityPlacementGroupType(
        ProximityPlacementGroupType proximityPlacementGroupType) {
        this.proximityPlacementGroupType = proximityPlacementGroupType;
        return this;
    }

    /**
     * Get the virtualMachines property: A list of references to all virtual machines in the proximity placement group.
     *
     * @return the virtualMachines value.
     */
    public List<SubResource> virtualMachines() {
        return this.virtualMachines;
    }

    /**
     * Get the virtualMachineScaleSets property: A list of references to all virtual machine scale sets in the proximity
     * placement group.
     *
     * @return the virtualMachineScaleSets value.
     */
    public List<SubResource> virtualMachineScaleSets() {
        return this.virtualMachineScaleSets;
    }

    /**
     * Get the availabilitySets property: A list of references to all availability sets in the proximity placement
     * group.
     *
     * @return the availabilitySets value.
     */
    public List<SubResource> availabilitySets() {
        return this.availabilitySets;
    }
}
