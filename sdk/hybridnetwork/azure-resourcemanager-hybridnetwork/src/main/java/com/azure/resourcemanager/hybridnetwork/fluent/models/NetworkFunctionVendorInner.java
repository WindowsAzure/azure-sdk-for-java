// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The network function vendor. */
@JsonFlatten
@Fluent
public class NetworkFunctionVendorInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkFunctionVendorInner.class);

    /*
     * The network function vendor name.
     */
    @JsonProperty(value = "properties.vendorName")
    private String vendorName;

    /*
     * The network function sku list.
     */
    @JsonProperty(value = "properties.skuList")
    private List<SkuOverviewInner> skuList;

    /**
     * Get the vendorName property: The network function vendor name.
     *
     * @return the vendorName value.
     */
    public String vendorName() {
        return this.vendorName;
    }

    /**
     * Set the vendorName property: The network function vendor name.
     *
     * @param vendorName the vendorName value to set.
     * @return the NetworkFunctionVendorInner object itself.
     */
    public NetworkFunctionVendorInner withVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }

    /**
     * Get the skuList property: The network function sku list.
     *
     * @return the skuList value.
     */
    public List<SkuOverviewInner> skuList() {
        return this.skuList;
    }

    /**
     * Set the skuList property: The network function sku list.
     *
     * @param skuList the skuList value to set.
     * @return the NetworkFunctionVendorInner object itself.
     */
    public NetworkFunctionVendorInner withSkuList(List<SkuOverviewInner> skuList) {
        this.skuList = skuList;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (skuList() != null) {
            skuList().forEach(e -> e.validate());
        }
    }
}
