/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_03_01.IpAllocationType;
import com.microsoft.azure.management.network.v2020_03_01.IPVersion;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * IpAllocation resource.
 */
@JsonFlatten
@SkipParentValidation
public class IpAllocationInner extends Resource {
    /**
     * The Subnet that using the prefix of this IpAllocation resource.
     */
    @JsonProperty(value = "properties.subnet", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource subnet;

    /**
     * The VirtualNetwork that using the prefix of this IpAllocation resource.
     */
    @JsonProperty(value = "properties.virtualNetwork", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource virtualNetwork;

    /**
     * The type for the IpAllocation. Possible values include: 'Undefined',
     * 'Hypernet'.
     */
    @JsonProperty(value = "properties.type")
    private IpAllocationType ipAllocationType;

    /**
     * The address prefix for the IpAllocation.
     */
    @JsonProperty(value = "properties.prefix")
    private String prefix;

    /**
     * The address prefix length for the IpAllocation.
     */
    @JsonProperty(value = "properties.prefixLength")
    private Integer prefixLength;

    /**
     * The address prefix Type for the IpAllocation. Possible values include:
     * 'IPv4', 'IPv6'.
     */
    @JsonProperty(value = "properties.prefixType")
    private IPVersion prefixType;

    /**
     * The IPAM allocation ID.
     */
    @JsonProperty(value = "properties.ipamAllocationId")
    private String ipamAllocationId;

    /**
     * IpAllocation tags.
     */
    @JsonProperty(value = "properties.allocationTags")
    private Map<String, String> allocationTags;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the Subnet that using the prefix of this IpAllocation resource.
     *
     * @return the subnet value
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Get the VirtualNetwork that using the prefix of this IpAllocation resource.
     *
     * @return the virtualNetwork value
     */
    public SubResource virtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Get the type for the IpAllocation. Possible values include: 'Undefined', 'Hypernet'.
     *
     * @return the ipAllocationType value
     */
    public IpAllocationType ipAllocationType() {
        return this.ipAllocationType;
    }

    /**
     * Set the type for the IpAllocation. Possible values include: 'Undefined', 'Hypernet'.
     *
     * @param ipAllocationType the ipAllocationType value to set
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withIpAllocationType(IpAllocationType ipAllocationType) {
        this.ipAllocationType = ipAllocationType;
        return this;
    }

    /**
     * Get the address prefix for the IpAllocation.
     *
     * @return the prefix value
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * Set the address prefix for the IpAllocation.
     *
     * @param prefix the prefix value to set
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the address prefix length for the IpAllocation.
     *
     * @return the prefixLength value
     */
    public Integer prefixLength() {
        return this.prefixLength;
    }

    /**
     * Set the address prefix length for the IpAllocation.
     *
     * @param prefixLength the prefixLength value to set
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withPrefixLength(Integer prefixLength) {
        this.prefixLength = prefixLength;
        return this;
    }

    /**
     * Get the address prefix Type for the IpAllocation. Possible values include: 'IPv4', 'IPv6'.
     *
     * @return the prefixType value
     */
    public IPVersion prefixType() {
        return this.prefixType;
    }

    /**
     * Set the address prefix Type for the IpAllocation. Possible values include: 'IPv4', 'IPv6'.
     *
     * @param prefixType the prefixType value to set
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withPrefixType(IPVersion prefixType) {
        this.prefixType = prefixType;
        return this;
    }

    /**
     * Get the IPAM allocation ID.
     *
     * @return the ipamAllocationId value
     */
    public String ipamAllocationId() {
        return this.ipamAllocationId;
    }

    /**
     * Set the IPAM allocation ID.
     *
     * @param ipamAllocationId the ipamAllocationId value to set
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withIpamAllocationId(String ipamAllocationId) {
        this.ipamAllocationId = ipamAllocationId;
        return this;
    }

    /**
     * Get ipAllocation tags.
     *
     * @return the allocationTags value
     */
    public Map<String, String> allocationTags() {
        return this.allocationTags;
    }

    /**
     * Set ipAllocation tags.
     *
     * @param allocationTags the allocationTags value to set
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withAllocationTags(Map<String, String> allocationTags) {
        this.allocationTags = allocationTags;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withId(String id) {
        this.id = id;
        return this;
    }

}
