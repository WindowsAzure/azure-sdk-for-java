/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_11_09;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure SKU definition.
 */
public class AzureSku {
    /**
     * SKU name. Possible values include: 'Standard_DS13_v2+1TB_PS',
     * 'Standard_DS13_v2+2TB_PS', 'Standard_DS14_v2+3TB_PS',
     * 'Standard_DS14_v2+4TB_PS', 'Standard_D13_v2', 'Standard_D14_v2',
     * 'Standard_L8s', 'Standard_L16s', 'Standard_D11_v2', 'Standard_D12_v2',
     * 'Standard_L4s', 'Dev(No SLA)_Standard_D11_v2'.
     */
    @JsonProperty(value = "name", required = true)
    private AzureSkuName name;

    /**
     * The number of instances of the cluster.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * SKU tier. Possible values include: 'Basic', 'Standard'.
     */
    @JsonProperty(value = "tier", required = true)
    private AzureSkuTier tier;

    /**
     * Get sKU name. Possible values include: 'Standard_DS13_v2+1TB_PS', 'Standard_DS13_v2+2TB_PS', 'Standard_DS14_v2+3TB_PS', 'Standard_DS14_v2+4TB_PS', 'Standard_D13_v2', 'Standard_D14_v2', 'Standard_L8s', 'Standard_L16s', 'Standard_D11_v2', 'Standard_D12_v2', 'Standard_L4s', 'Dev(No SLA)_Standard_D11_v2'.
     *
     * @return the name value
     */
    public AzureSkuName name() {
        return this.name;
    }

    /**
     * Set sKU name. Possible values include: 'Standard_DS13_v2+1TB_PS', 'Standard_DS13_v2+2TB_PS', 'Standard_DS14_v2+3TB_PS', 'Standard_DS14_v2+4TB_PS', 'Standard_D13_v2', 'Standard_D14_v2', 'Standard_L8s', 'Standard_L16s', 'Standard_D11_v2', 'Standard_D12_v2', 'Standard_L4s', 'Dev(No SLA)_Standard_D11_v2'.
     *
     * @param name the name value to set
     * @return the AzureSku object itself.
     */
    public AzureSku withName(AzureSkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the number of instances of the cluster.
     *
     * @return the capacity value
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the number of instances of the cluster.
     *
     * @param capacity the capacity value to set
     * @return the AzureSku object itself.
     */
    public AzureSku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get sKU tier. Possible values include: 'Basic', 'Standard'.
     *
     * @return the tier value
     */
    public AzureSkuTier tier() {
        return this.tier;
    }

    /**
     * Set sKU tier. Possible values include: 'Basic', 'Standard'.
     *
     * @param tier the tier value to set
     * @return the AzureSku object itself.
     */
    public AzureSku withTier(AzureSkuTier tier) {
        this.tier = tier;
        return this;
    }

}
