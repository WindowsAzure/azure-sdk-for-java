// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualApplianceSkuProperties model. */
@Fluent
public final class VirtualApplianceSkuProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualApplianceSkuProperties.class);

    /*
     * Virtual Appliance Vendor.
     */
    @JsonProperty(value = "vendor")
    private String vendor;

    /*
     * Virtual Appliance Scale Unit.
     */
    @JsonProperty(value = "bundledScaleUnit")
    private String bundledScaleUnit;

    /*
     * Virtual Appliance Version.
     */
    @JsonProperty(value = "marketPlaceVersion")
    private String marketPlaceVersion;

    /**
     * Get the vendor property: Virtual Appliance Vendor.
     *
     * @return the vendor value.
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Set the vendor property: Virtual Appliance Vendor.
     *
     * @param vendor the vendor value to set.
     * @return the VirtualApplianceSkuProperties object itself.
     */
    public VirtualApplianceSkuProperties withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Get the bundledScaleUnit property: Virtual Appliance Scale Unit.
     *
     * @return the bundledScaleUnit value.
     */
    public String bundledScaleUnit() {
        return this.bundledScaleUnit;
    }

    /**
     * Set the bundledScaleUnit property: Virtual Appliance Scale Unit.
     *
     * @param bundledScaleUnit the bundledScaleUnit value to set.
     * @return the VirtualApplianceSkuProperties object itself.
     */
    public VirtualApplianceSkuProperties withBundledScaleUnit(String bundledScaleUnit) {
        this.bundledScaleUnit = bundledScaleUnit;
        return this;
    }

    /**
     * Get the marketPlaceVersion property: Virtual Appliance Version.
     *
     * @return the marketPlaceVersion value.
     */
    public String marketPlaceVersion() {
        return this.marketPlaceVersion;
    }

    /**
     * Set the marketPlaceVersion property: Virtual Appliance Version.
     *
     * @param marketPlaceVersion the marketPlaceVersion value to set.
     * @return the VirtualApplianceSkuProperties object itself.
     */
    public VirtualApplianceSkuProperties withMarketPlaceVersion(String marketPlaceVersion) {
        this.marketPlaceVersion = marketPlaceVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
