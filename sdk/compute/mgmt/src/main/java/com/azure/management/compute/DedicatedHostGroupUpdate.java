// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The DedicatedHostGroupUpdate model.
 */
@JsonFlatten
@Fluent
public class DedicatedHostGroupUpdate extends UpdateResource {
    /*
     * Availability Zone to use for this host group. Only single zone is
     * supported. The zone can be assigned only during creation. If not
     * provided, the group supports all zones in the region. If provided,
     * enforces each host in the group to be in the same zone.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * Number of fault domains that the host group can span.
     */
    @JsonProperty(value = "properties.platformFaultDomainCount")
    private Integer platformFaultDomainCount;

    /*
     * A list of references to all dedicated hosts in the dedicated host group.
     */
    @JsonProperty(value = "properties.hosts", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceReadOnly> hosts;

    /**
     * Get the zones property: Availability Zone to use for this host group.
     * Only single zone is supported. The zone can be assigned only during
     * creation. If not provided, the group supports all zones in the region.
     * If provided, enforces each host in the group to be in the same zone.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Availability Zone to use for this host group.
     * Only single zone is supported. The zone can be assigned only during
     * creation. If not provided, the group supports all zones in the region.
     * If provided, enforces each host in the group to be in the same zone.
     * 
     * @param zones the zones value to set.
     * @return the DedicatedHostGroupUpdate object itself.
     */
    public DedicatedHostGroupUpdate withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the platformFaultDomainCount property: Number of fault domains that
     * the host group can span.
     * 
     * @return the platformFaultDomainCount value.
     */
    public Integer platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set the platformFaultDomainCount property: Number of fault domains that
     * the host group can span.
     * 
     * @param platformFaultDomainCount the platformFaultDomainCount value to
     * set.
     * @return the DedicatedHostGroupUpdate object itself.
     */
    public DedicatedHostGroupUpdate withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
        return this;
    }

    /**
     * Get the hosts property: A list of references to all dedicated hosts in
     * the dedicated host group.
     * 
     * @return the hosts value.
     */
    public List<SubResourceReadOnly> hosts() {
        return this.hosts;
    }
}
