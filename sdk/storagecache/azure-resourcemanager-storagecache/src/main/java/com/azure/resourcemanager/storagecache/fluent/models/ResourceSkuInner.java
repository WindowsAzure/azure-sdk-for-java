// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagecache.models.ResourceSkuCapabilities;
import com.azure.resourcemanager.storagecache.models.ResourceSkuLocationInfo;
import com.azure.resourcemanager.storagecache.models.Restriction;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A resource SKU. */
@Fluent
public final class ResourceSkuInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceSkuInner.class);

    /*
     * The type of resource the SKU applies to.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /*
     * A list of capabilities of this SKU, such as throughput or ops/sec.
     */
    @JsonProperty(value = "capabilities")
    private List<ResourceSkuCapabilities> capabilities;

    /*
     * The set of locations where the SKU is available. This is the supported
     * and registered Azure Geo Regions (e.g., West US, East US, Southeast
     * Asia, etc.).
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> locations;

    /*
     * The set of locations where the SKU is available.
     */
    @JsonProperty(value = "locationInfo")
    private List<ResourceSkuLocationInfo> locationInfo;

    /*
     * The name of this SKU.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The restrictions preventing this SKU from being used. This is empty if
     * there are no restrictions.
     */
    @JsonProperty(value = "restrictions")
    private List<Restriction> restrictions;

    /**
     * Get the resourceType property: The type of resource the SKU applies to.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the capabilities property: A list of capabilities of this SKU, such as throughput or ops/sec.
     *
     * @return the capabilities value.
     */
    public List<ResourceSkuCapabilities> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: A list of capabilities of this SKU, such as throughput or ops/sec.
     *
     * @param capabilities the capabilities value to set.
     * @return the ResourceSkuInner object itself.
     */
    public ResourceSkuInner withCapabilities(List<ResourceSkuCapabilities> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the locations property: The set of locations where the SKU is available. This is the supported and registered
     * Azure Geo Regions (e.g., West US, East US, Southeast Asia, etc.).
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Get the locationInfo property: The set of locations where the SKU is available.
     *
     * @return the locationInfo value.
     */
    public List<ResourceSkuLocationInfo> locationInfo() {
        return this.locationInfo;
    }

    /**
     * Set the locationInfo property: The set of locations where the SKU is available.
     *
     * @param locationInfo the locationInfo value to set.
     * @return the ResourceSkuInner object itself.
     */
    public ResourceSkuInner withLocationInfo(List<ResourceSkuLocationInfo> locationInfo) {
        this.locationInfo = locationInfo;
        return this;
    }

    /**
     * Get the name property: The name of this SKU.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of this SKU.
     *
     * @param name the name value to set.
     * @return the ResourceSkuInner object itself.
     */
    public ResourceSkuInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the restrictions property: The restrictions preventing this SKU from being used. This is empty if there are
     * no restrictions.
     *
     * @return the restrictions value.
     */
    public List<Restriction> restrictions() {
        return this.restrictions;
    }

    /**
     * Set the restrictions property: The restrictions preventing this SKU from being used. This is empty if there are
     * no restrictions.
     *
     * @param restrictions the restrictions value to set.
     * @return the ResourceSkuInner object itself.
     */
    public ResourceSkuInner withRestrictions(List<Restriction> restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
        if (locationInfo() != null) {
            locationInfo().forEach(e -> e.validate());
        }
        if (restrictions() != null) {
            restrictions().forEach(e -> e.validate());
        }
    }
}
