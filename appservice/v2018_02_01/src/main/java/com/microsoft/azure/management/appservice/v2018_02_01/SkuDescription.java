/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CapabilityInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of a SKU for a scalable resource.
 */
public class SkuDescription {
    /**
     * Name of the resource SKU.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Service tier of the resource SKU.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /**
     * Size specifier of the resource SKU.
     */
    @JsonProperty(value = "size")
    private String size;

    /**
     * Family code of the resource SKU.
     */
    @JsonProperty(value = "family")
    private String family;

    /**
     * Current number of instances assigned to the resource.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Min, max, and default scale values of the SKU.
     */
    @JsonProperty(value = "skuCapacity")
    private SkuCapacity skuCapacity;

    /**
     * Locations of the SKU.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /**
     * Capabilities of the SKU, e.g., is traffic manager enabled?.
     */
    @JsonProperty(value = "capabilities")
    private List<CapabilityInner> capabilities;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the SkuDescription object itself.
     */
    public SkuDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier value.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier value.
     *
     * @param tier the tier value to set
     * @return the SkuDescription object itself.
     */
    public SkuDescription withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the size value.
     *
     * @return the size value
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size value.
     *
     * @param size the size value to set
     * @return the SkuDescription object itself.
     */
    public SkuDescription withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the family value.
     *
     * @return the family value
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family value.
     *
     * @param family the family value to set
     * @return the SkuDescription object itself.
     */
    public SkuDescription withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     * @return the SkuDescription object itself.
     */
    public SkuDescription withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the skuCapacity value.
     *
     * @return the skuCapacity value
     */
    public SkuCapacity skuCapacity() {
        return this.skuCapacity;
    }

    /**
     * Set the skuCapacity value.
     *
     * @param skuCapacity the skuCapacity value to set
     * @return the SkuDescription object itself.
     */
    public SkuDescription withSkuCapacity(SkuCapacity skuCapacity) {
        this.skuCapacity = skuCapacity;
        return this;
    }

    /**
     * Get the locations value.
     *
     * @return the locations value
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations value.
     *
     * @param locations the locations value to set
     * @return the SkuDescription object itself.
     */
    public SkuDescription withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the capabilities value.
     *
     * @return the capabilities value
     */
    public List<CapabilityInner> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities value.
     *
     * @param capabilities the capabilities value to set
     * @return the SkuDescription object itself.
     */
    public SkuDescription withCapabilities(List<CapabilityInner> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

}
