/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the Azure plan.
 */
public class AzurePlan {
    /**
     * The sku id.
     */
    @JsonProperty(value = "skuId")
    private String skuId;

    /**
     * The sku description.
     */
    @JsonProperty(value = "skuDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String skuDescription;

    /**
     * Get the sku id.
     *
     * @return the skuId value
     */
    public String skuId() {
        return this.skuId;
    }

    /**
     * Set the sku id.
     *
     * @param skuId the skuId value to set
     * @return the AzurePlan object itself.
     */
    public AzurePlan withSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }

    /**
     * Get the sku description.
     *
     * @return the skuDescription value
     */
    public String skuDescription() {
        return this.skuDescription;
    }

}
