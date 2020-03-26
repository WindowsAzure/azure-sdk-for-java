// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.sql.InstancePoolLicenseType;
import com.azure.management.sql.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The InstancePool model.
 */
@JsonFlatten
@Fluent
public class InstancePoolInner extends Resource {
    /*
     * An ARM Resource SKU.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Resource ID of the subnet to place this instance pool in.
     */
    @JsonProperty(value = "properties.subnetId")
    private String subnetId;

    /*
     * Count of vCores belonging to this instance pool.
     */
    @JsonProperty(value = "properties.vCores")
    private Integer vCores;

    /*
     * The license type. Possible values are 'LicenseIncluded' (price for SQL
     * license is included) and 'BasePrice' (without SQL license price).
     */
    @JsonProperty(value = "properties.licenseType")
    private InstancePoolLicenseType licenseType;

    /**
     * Get the sku property: An ARM Resource SKU.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: An ARM Resource SKU.
     * 
     * @param sku the sku value to set.
     * @return the InstancePoolInner object itself.
     */
    public InstancePoolInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the subnetId property: Resource ID of the subnet to place this
     * instance pool in.
     * 
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: Resource ID of the subnet to place this
     * instance pool in.
     * 
     * @param subnetId the subnetId value to set.
     * @return the InstancePoolInner object itself.
     */
    public InstancePoolInner withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the vCores property: Count of vCores belonging to this instance
     * pool.
     * 
     * @return the vCores value.
     */
    public Integer vCores() {
        return this.vCores;
    }

    /**
     * Set the vCores property: Count of vCores belonging to this instance
     * pool.
     * 
     * @param vCores the vCores value to set.
     * @return the InstancePoolInner object itself.
     */
    public InstancePoolInner withVCores(Integer vCores) {
        this.vCores = vCores;
        return this;
    }

    /**
     * Get the licenseType property: The license type. Possible values are
     * 'LicenseIncluded' (price for SQL license is included) and 'BasePrice'
     * (without SQL license price).
     * 
     * @return the licenseType value.
     */
    public InstancePoolLicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: The license type. Possible values are
     * 'LicenseIncluded' (price for SQL license is included) and 'BasePrice'
     * (without SQL license price).
     * 
     * @param licenseType the licenseType value to set.
     * @return the InstancePoolInner object itself.
     */
    public InstancePoolInner withLicenseType(InstancePoolLicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }
}
