// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.models.CapabilityInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A Global SKU Description. */
@Fluent
public final class GlobalCsmSkuDescription {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GlobalCsmSkuDescription.class);

    /*
     * Name of the resource SKU.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Service Tier of the resource SKU.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * Size specifier of the resource SKU.
     */
    @JsonProperty(value = "size")
    private String size;

    /*
     * Family code of the resource SKU.
     */
    @JsonProperty(value = "family")
    private String family;

    /*
     * Min, max, and default scale values of the SKU.
     */
    @JsonProperty(value = "capacity")
    private SkuCapacity capacity;

    /*
     * Locations of the SKU.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /*
     * Capabilities of the SKU, e.g., is traffic manager enabled?
     */
    @JsonProperty(value = "capabilities")
    private List<CapabilityInner> capabilities;

    /**
     * Get the name property: Name of the resource SKU.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource SKU.
     *
     * @param name the name value to set.
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Service Tier of the resource SKU.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Service Tier of the resource SKU.
     *
     * @param tier the tier value to set.
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the size property: Size specifier of the resource SKU.
     *
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size property: Size specifier of the resource SKU.
     *
     * @param size the size value to set.
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the family property: Family code of the resource SKU.
     *
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: Family code of the resource SKU.
     *
     * @param family the family value to set.
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the capacity property: Min, max, and default scale values of the SKU.
     *
     * @return the capacity value.
     */
    public SkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Min, max, and default scale values of the SKU.
     *
     * @param capacity the capacity value to set.
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withCapacity(SkuCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the locations property: Locations of the SKU.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: Locations of the SKU.
     *
     * @param locations the locations value to set.
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the capabilities property: Capabilities of the SKU, e.g., is traffic manager enabled?.
     *
     * @return the capabilities value.
     */
    public List<CapabilityInner> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: Capabilities of the SKU, e.g., is traffic manager enabled?.
     *
     * @param capabilities the capabilities value to set.
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withCapabilities(List<CapabilityInner> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capacity() != null) {
            capacity().validate();
        }
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
    }
}
