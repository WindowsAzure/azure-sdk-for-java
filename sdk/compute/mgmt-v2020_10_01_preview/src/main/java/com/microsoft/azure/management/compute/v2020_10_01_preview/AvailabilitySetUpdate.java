/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Specifies information about the availability set that the virtual machine
 * should be assigned to. Only tags may be updated.
 */
@JsonFlatten
public class AvailabilitySetUpdate extends UpdateResource {
    /**
     * Update Domain count.
     */
    @JsonProperty(value = "properties.platformUpdateDomainCount")
    private Integer platformUpdateDomainCount;

    /**
     * Fault Domain count.
     */
    @JsonProperty(value = "properties.platformFaultDomainCount")
    private Integer platformFaultDomainCount;

    /**
     * A list of references to all virtual machines in the availability set.
     */
    @JsonProperty(value = "properties.virtualMachines")
    private List<SubResource> virtualMachines;

    /**
     * Specifies information about the proximity placement group that the
     * availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2018-04-01.
     */
    @JsonProperty(value = "properties.proximityPlacementGroup")
    private SubResource proximityPlacementGroup;

    /**
     * The resource status information.
     */
    @JsonProperty(value = "properties.statuses", access = JsonProperty.Access.WRITE_ONLY)
    private List<InstanceViewStatus> statuses;

    /**
     * Sku of the availability set.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get update Domain count.
     *
     * @return the platformUpdateDomainCount value
     */
    public Integer platformUpdateDomainCount() {
        return this.platformUpdateDomainCount;
    }

    /**
     * Set update Domain count.
     *
     * @param platformUpdateDomainCount the platformUpdateDomainCount value to set
     * @return the AvailabilitySetUpdate object itself.
     */
    public AvailabilitySetUpdate withPlatformUpdateDomainCount(Integer platformUpdateDomainCount) {
        this.platformUpdateDomainCount = platformUpdateDomainCount;
        return this;
    }

    /**
     * Get fault Domain count.
     *
     * @return the platformFaultDomainCount value
     */
    public Integer platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set fault Domain count.
     *
     * @param platformFaultDomainCount the platformFaultDomainCount value to set
     * @return the AvailabilitySetUpdate object itself.
     */
    public AvailabilitySetUpdate withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
        return this;
    }

    /**
     * Get a list of references to all virtual machines in the availability set.
     *
     * @return the virtualMachines value
     */
    public List<SubResource> virtualMachines() {
        return this.virtualMachines;
    }

    /**
     * Set a list of references to all virtual machines in the availability set.
     *
     * @param virtualMachines the virtualMachines value to set
     * @return the AvailabilitySetUpdate object itself.
     */
    public AvailabilitySetUpdate withVirtualMachines(List<SubResource> virtualMachines) {
        this.virtualMachines = virtualMachines;
        return this;
    }

    /**
     * Get specifies information about the proximity placement group that the availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value
     */
    public SubResource proximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }

    /**
     * Set specifies information about the proximity placement group that the availability set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set
     * @return the AvailabilitySetUpdate object itself.
     */
    public AvailabilitySetUpdate withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        this.proximityPlacementGroup = proximityPlacementGroup;
        return this;
    }

    /**
     * Get the resource status information.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Get sku of the availability set.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set sku of the availability set.
     *
     * @param sku the sku value to set
     * @return the AvailabilitySetUpdate object itself.
     */
    public AvailabilitySetUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}
