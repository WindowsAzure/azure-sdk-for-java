/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import java.util.List;
import com.microsoft.azure.management.compute.v2020_12_01.SubResourceReadOnly;
import com.microsoft.azure.management.compute.v2020_12_01.DedicatedHostGroupInstanceView;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Specifies information about the dedicated host group that the dedicated
 * hosts should be assigned to. &lt;br&gt;&lt;br&gt; Currently, a dedicated
 * host can only be added to a dedicated host group at creation time. An
 * existing dedicated host cannot be added to another dedicated host group.
 */
@JsonFlatten
public class DedicatedHostGroupInner extends Resource {
    /**
     * Number of fault domains that the host group can span.
     */
    @JsonProperty(value = "properties.platformFaultDomainCount", required = true)
    private int platformFaultDomainCount;

    /**
     * A list of references to all dedicated hosts in the dedicated host group.
     */
    @JsonProperty(value = "properties.hosts", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceReadOnly> hosts;

    /**
     * The dedicated host group instance view, which has the list of instance
     * view of the dedicated hosts under the dedicated host group.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private DedicatedHostGroupInstanceView instanceView;

    /**
     * Specifies whether virtual machines or virtual machine scale sets can be
     * placed automatically on the dedicated host group. Automatic placement
     * means resources are allocated on dedicated hosts, that are chosen by
     * Azure, under the dedicated host group. The value is defaulted to 'false'
     * when not provided. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     */
    @JsonProperty(value = "properties.supportAutomaticPlacement")
    private Boolean supportAutomaticPlacement;

    /**
     * Availability Zone to use for this host group. Only single zone is
     * supported. The zone can be assigned only during creation. If not
     * provided, the group supports all zones in the region. If provided,
     * enforces each host in the group to be in the same zone.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Get number of fault domains that the host group can span.
     *
     * @return the platformFaultDomainCount value
     */
    public int platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set number of fault domains that the host group can span.
     *
     * @param platformFaultDomainCount the platformFaultDomainCount value to set
     * @return the DedicatedHostGroupInner object itself.
     */
    public DedicatedHostGroupInner withPlatformFaultDomainCount(int platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
        return this;
    }

    /**
     * Get a list of references to all dedicated hosts in the dedicated host group.
     *
     * @return the hosts value
     */
    public List<SubResourceReadOnly> hosts() {
        return this.hosts;
    }

    /**
     * Get the dedicated host group instance view, which has the list of instance view of the dedicated hosts under the dedicated host group.
     *
     * @return the instanceView value
     */
    public DedicatedHostGroupInstanceView instanceView() {
        return this.instanceView;
    }

    /**
     * Get specifies whether virtual machines or virtual machine scale sets can be placed automatically on the dedicated host group. Automatic placement means resources are allocated on dedicated hosts, that are chosen by Azure, under the dedicated host group. The value is defaulted to 'false' when not provided. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     *
     * @return the supportAutomaticPlacement value
     */
    public Boolean supportAutomaticPlacement() {
        return this.supportAutomaticPlacement;
    }

    /**
     * Set specifies whether virtual machines or virtual machine scale sets can be placed automatically on the dedicated host group. Automatic placement means resources are allocated on dedicated hosts, that are chosen by Azure, under the dedicated host group. The value is defaulted to 'false' when not provided. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     *
     * @param supportAutomaticPlacement the supportAutomaticPlacement value to set
     * @return the DedicatedHostGroupInner object itself.
     */
    public DedicatedHostGroupInner withSupportAutomaticPlacement(Boolean supportAutomaticPlacement) {
        this.supportAutomaticPlacement = supportAutomaticPlacement;
        return this;
    }

    /**
     * Get availability Zone to use for this host group. Only single zone is supported. The zone can be assigned only during creation. If not provided, the group supports all zones in the region. If provided, enforces each host in the group to be in the same zone.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set availability Zone to use for this host group. Only single zone is supported. The zone can be assigned only during creation. If not provided, the group supports all zones in the region. If provided, enforces each host in the group to be in the same zone.
     *
     * @param zones the zones value to set
     * @return the DedicatedHostGroupInner object itself.
     */
    public DedicatedHostGroupInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

}
