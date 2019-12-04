/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Specifies information about the dedicated host group that the dedicated host
 * should be assigned to. Only tags may be updated.
 */
@JsonFlatten
public class DedicatedHostGroupUpdate extends UpdateResource {
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
     * @return the DedicatedHostGroupUpdate object itself.
     */
    public DedicatedHostGroupUpdate withPlatformFaultDomainCount(int platformFaultDomainCount) {
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
     * @return the DedicatedHostGroupUpdate object itself.
     */
    public DedicatedHostGroupUpdate withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

}
