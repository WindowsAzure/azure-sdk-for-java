/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network Virtual Appliance Sku Properties.
 */
public class VirtualApplianceSkuProperties {
    /**
     * Virtual Appliance Vendor.
     */
    @JsonProperty(value = "vendor")
    private String vendor;

    /**
     * Virtual Appliance Scale Unit.
     */
    @JsonProperty(value = "bundledScaleUnit")
    private String bundledScaleUnit;

    /**
     * Virtual Appliance Version.
     */
    @JsonProperty(value = "marketPlaceVersion")
    private String marketPlaceVersion;

    /**
     * Get virtual Appliance Vendor.
     *
     * @return the vendor value
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Set virtual Appliance Vendor.
     *
     * @param vendor the vendor value to set
     * @return the VirtualApplianceSkuProperties object itself.
     */
    public VirtualApplianceSkuProperties withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Get virtual Appliance Scale Unit.
     *
     * @return the bundledScaleUnit value
     */
    public String bundledScaleUnit() {
        return this.bundledScaleUnit;
    }

    /**
     * Set virtual Appliance Scale Unit.
     *
     * @param bundledScaleUnit the bundledScaleUnit value to set
     * @return the VirtualApplianceSkuProperties object itself.
     */
    public VirtualApplianceSkuProperties withBundledScaleUnit(String bundledScaleUnit) {
        this.bundledScaleUnit = bundledScaleUnit;
        return this;
    }

    /**
     * Get virtual Appliance Version.
     *
     * @return the marketPlaceVersion value
     */
    public String marketPlaceVersion() {
        return this.marketPlaceVersion;
    }

    /**
     * Set virtual Appliance Version.
     *
     * @param marketPlaceVersion the marketPlaceVersion value to set
     * @return the VirtualApplianceSkuProperties object itself.
     */
    public VirtualApplianceSkuProperties withMarketPlaceVersion(String marketPlaceVersion) {
        this.marketPlaceVersion = marketPlaceVersion;
        return this;
    }

}
