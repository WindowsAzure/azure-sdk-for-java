/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.microsoft.azure.management.compute.v2020_06_01.ProximityPlacementGroupType;
import java.util.List;
import com.microsoft.azure.management.compute.v2020_06_01.SubResourceWithColocationStatus;
import com.microsoft.azure.management.compute.v2020_06_01.InstanceViewStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Specifies information about the proximity placement group.
 */
@JsonFlatten
public class ProximityPlacementGroupInner extends Resource {
    /**
     * Specifies the type of the proximity placement group.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt;
     * **Standard** : Co-locate resources within an Azure region or
     * Availability Zone. &lt;br&gt;&lt;br&gt; **Ultra** : For future use.
     * Possible values include: 'Standard', 'Ultra'.
     */
    @JsonProperty(value = "properties.proximityPlacementGroupType")
    private ProximityPlacementGroupType proximityPlacementGroupType;

    /**
     * A list of references to all virtual machines in the proximity placement
     * group.
     */
    @JsonProperty(value = "properties.virtualMachines", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceWithColocationStatus> virtualMachines;

    /**
     * A list of references to all virtual machine scale sets in the proximity
     * placement group.
     */
    @JsonProperty(value = "properties.virtualMachineScaleSets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceWithColocationStatus> virtualMachineScaleSets;

    /**
     * A list of references to all availability sets in the proximity placement
     * group.
     */
    @JsonProperty(value = "properties.availabilitySets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceWithColocationStatus> availabilitySets;

    /**
     * Describes colocation status of the Proximity Placement Group.
     */
    @JsonProperty(value = "properties.colocationStatus")
    private InstanceViewStatus colocationStatus;

    /**
     * Get specifies the type of the proximity placement group. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Standard** : Co-locate resources within an Azure region or Availability Zone. &lt;br&gt;&lt;br&gt; **Ultra** : For future use. Possible values include: 'Standard', 'Ultra'.
     *
     * @return the proximityPlacementGroupType value
     */
    public ProximityPlacementGroupType proximityPlacementGroupType() {
        return this.proximityPlacementGroupType;
    }

    /**
     * Set specifies the type of the proximity placement group. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Standard** : Co-locate resources within an Azure region or Availability Zone. &lt;br&gt;&lt;br&gt; **Ultra** : For future use. Possible values include: 'Standard', 'Ultra'.
     *
     * @param proximityPlacementGroupType the proximityPlacementGroupType value to set
     * @return the ProximityPlacementGroupInner object itself.
     */
    public ProximityPlacementGroupInner withProximityPlacementGroupType(ProximityPlacementGroupType proximityPlacementGroupType) {
        this.proximityPlacementGroupType = proximityPlacementGroupType;
        return this;
    }

    /**
     * Get a list of references to all virtual machines in the proximity placement group.
     *
     * @return the virtualMachines value
     */
    public List<SubResourceWithColocationStatus> virtualMachines() {
        return this.virtualMachines;
    }

    /**
     * Get a list of references to all virtual machine scale sets in the proximity placement group.
     *
     * @return the virtualMachineScaleSets value
     */
    public List<SubResourceWithColocationStatus> virtualMachineScaleSets() {
        return this.virtualMachineScaleSets;
    }

    /**
     * Get a list of references to all availability sets in the proximity placement group.
     *
     * @return the availabilitySets value
     */
    public List<SubResourceWithColocationStatus> availabilitySets() {
        return this.availabilitySets;
    }

    /**
     * Get describes colocation status of the Proximity Placement Group.
     *
     * @return the colocationStatus value
     */
    public InstanceViewStatus colocationStatus() {
        return this.colocationStatus;
    }

    /**
     * Set describes colocation status of the Proximity Placement Group.
     *
     * @param colocationStatus the colocationStatus value to set
     * @return the ProximityPlacementGroupInner object itself.
     */
    public ProximityPlacementGroupInner withColocationStatus(InstanceViewStatus colocationStatus) {
        this.colocationStatus = colocationStatus;
        return this;
    }

}
