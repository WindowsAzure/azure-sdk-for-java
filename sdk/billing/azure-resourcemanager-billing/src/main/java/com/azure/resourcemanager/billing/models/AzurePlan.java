// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of the Azure plan. */
@Fluent
public final class AzurePlan {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzurePlan.class);

    /*
     * The sku id.
     */
    @JsonProperty(value = "skuId")
    private String skuId;

    /*
     * The sku description.
     */
    @JsonProperty(value = "skuDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String skuDescription;

    /**
     * Get the skuId property: The sku id.
     *
     * @return the skuId value.
     */
    public String skuId() {
        return this.skuId;
    }

    /**
     * Set the skuId property: The sku id.
     *
     * @param skuId the skuId value to set.
     * @return the AzurePlan object itself.
     */
    public AzurePlan withSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }

    /**
     * Get the skuDescription property: The sku description.
     *
     * @return the skuDescription value.
     */
    public String skuDescription() {
        return this.skuDescription;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
