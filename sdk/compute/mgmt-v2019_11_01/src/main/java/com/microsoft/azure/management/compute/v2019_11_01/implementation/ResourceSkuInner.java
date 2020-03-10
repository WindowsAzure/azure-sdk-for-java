/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01.implementation;

import com.microsoft.azure.management.compute.v2019_11_01.ResourceSkuCapacity;
import java.util.List;
import com.microsoft.azure.management.compute.v2019_11_01.ResourceSkuLocationInfo;
import com.microsoft.azure.management.compute.v2019_11_01.ResourceSkuCosts;
import com.microsoft.azure.management.compute.v2019_11_01.ResourceSkuCapabilities;
import com.microsoft.azure.management.compute.v2019_11_01.ResourceSkuRestrictions;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes an available Compute SKU.
 */
public class ResourceSkuInner {
    /**
     * The type of resource the SKU applies to.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /**
     * The name of SKU.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Specifies the tier of virtual machines in a scale set.&lt;br /&gt;&lt;br
     * /&gt; Possible Values:&lt;br /&gt;&lt;br /&gt; **Standard**&lt;br
     * /&gt;&lt;br /&gt; **Basic**.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private String tier;

    /**
     * The Size of the SKU.
     */
    @JsonProperty(value = "size", access = JsonProperty.Access.WRITE_ONLY)
    private String size;

    /**
     * The Family of this particular SKU.
     */
    @JsonProperty(value = "family", access = JsonProperty.Access.WRITE_ONLY)
    private String family;

    /**
     * The Kind of resources that are supported in this SKU.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /**
     * Specifies the number of virtual machines in the scale set.
     */
    @JsonProperty(value = "capacity", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceSkuCapacity capacity;

    /**
     * The set of locations that the SKU is available.
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> locations;

    /**
     * A list of locations and availability zones in those locations where the
     * SKU is available.
     */
    @JsonProperty(value = "locationInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceSkuLocationInfo> locationInfo;

    /**
     * The api versions that support this SKU.
     */
    @JsonProperty(value = "apiVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> apiVersions;

    /**
     * Metadata for retrieving price info.
     */
    @JsonProperty(value = "costs", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceSkuCosts> costs;

    /**
     * A name value pair to describe the capability.
     */
    @JsonProperty(value = "capabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceSkuCapabilities> capabilities;

    /**
     * The restrictions because of which SKU cannot be used. This is empty if
     * there are no restrictions.
     */
    @JsonProperty(value = "restrictions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceSkuRestrictions> restrictions;

    /**
     * Get the type of resource the SKU applies to.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the name of SKU.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get specifies the tier of virtual machines in a scale set.&lt;br /&gt;&lt;br /&gt; Possible Values:&lt;br /&gt;&lt;br /&gt; **Standard**&lt;br /&gt;&lt;br /&gt; **Basic**.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Get the Size of the SKU.
     *
     * @return the size value
     */
    public String size() {
        return this.size;
    }

    /**
     * Get the Family of this particular SKU.
     *
     * @return the family value
     */
    public String family() {
        return this.family;
    }

    /**
     * Get the Kind of resources that are supported in this SKU.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get specifies the number of virtual machines in the scale set.
     *
     * @return the capacity value
     */
    public ResourceSkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Get the set of locations that the SKU is available.
     *
     * @return the locations value
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Get a list of locations and availability zones in those locations where the SKU is available.
     *
     * @return the locationInfo value
     */
    public List<ResourceSkuLocationInfo> locationInfo() {
        return this.locationInfo;
    }

    /**
     * Get the api versions that support this SKU.
     *
     * @return the apiVersions value
     */
    public List<String> apiVersions() {
        return this.apiVersions;
    }

    /**
     * Get metadata for retrieving price info.
     *
     * @return the costs value
     */
    public List<ResourceSkuCosts> costs() {
        return this.costs;
    }

    /**
     * Get a name value pair to describe the capability.
     *
     * @return the capabilities value
     */
    public List<ResourceSkuCapabilities> capabilities() {
        return this.capabilities;
    }

    /**
     * Get the restrictions because of which SKU cannot be used. This is empty if there are no restrictions.
     *
     * @return the restrictions value
     */
    public List<ResourceSkuRestrictions> restrictions() {
        return this.restrictions;
    }

}
