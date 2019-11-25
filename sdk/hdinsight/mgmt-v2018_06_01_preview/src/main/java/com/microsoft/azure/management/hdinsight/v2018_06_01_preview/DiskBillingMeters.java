/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The disk billing meters.
 */
public class DiskBillingMeters {
    /**
     * The managed disk meter guid.
     */
    @JsonProperty(value = "diskRpMeter")
    private String diskRpMeter;

    /**
     * The managed disk billing sku, P30 or S30.
     */
    @JsonProperty(value = "sku")
    private String sku;

    /**
     * The managed disk billing tier, Standard or Premium. Possible values
     * include: 'Standard', 'Premium'.
     */
    @JsonProperty(value = "tier")
    private Tier tier;

    /**
     * Get the managed disk meter guid.
     *
     * @return the diskRpMeter value
     */
    public String diskRpMeter() {
        return this.diskRpMeter;
    }

    /**
     * Set the managed disk meter guid.
     *
     * @param diskRpMeter the diskRpMeter value to set
     * @return the DiskBillingMeters object itself.
     */
    public DiskBillingMeters withDiskRpMeter(String diskRpMeter) {
        this.diskRpMeter = diskRpMeter;
        return this;
    }

    /**
     * Get the managed disk billing sku, P30 or S30.
     *
     * @return the sku value
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the managed disk billing sku, P30 or S30.
     *
     * @param sku the sku value to set
     * @return the DiskBillingMeters object itself.
     */
    public DiskBillingMeters withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the managed disk billing tier, Standard or Premium. Possible values include: 'Standard', 'Premium'.
     *
     * @return the tier value
     */
    public Tier tier() {
        return this.tier;
    }

    /**
     * Set the managed disk billing tier, Standard or Premium. Possible values include: 'Standard', 'Premium'.
     *
     * @param tier the tier value to set
     * @return the DiskBillingMeters object itself.
     */
    public DiskBillingMeters withTier(Tier tier) {
        this.tier = tier;
        return this;
    }

}
