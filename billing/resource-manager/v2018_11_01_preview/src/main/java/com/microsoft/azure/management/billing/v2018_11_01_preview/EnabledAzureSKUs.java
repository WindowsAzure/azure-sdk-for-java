/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details about the enabled azure sku.
 */
public class EnabledAzureSKUs {
    /**
     * The sku id.
     */
    @JsonProperty(value = "skuId", access = JsonProperty.Access.WRITE_ONLY)
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
     * Get the sku description.
     *
     * @return the skuDescription value
     */
    public String skuDescription() {
        return this.skuDescription;
    }

}
