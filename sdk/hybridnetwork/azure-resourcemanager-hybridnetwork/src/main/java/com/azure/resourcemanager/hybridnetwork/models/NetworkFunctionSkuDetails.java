// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionSkuRoleDetailsInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The network function sku details. */
@Fluent
public final class NetworkFunctionSkuDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkFunctionSkuDetails.class);

    /*
     * The network function sku type.
     */
    @JsonProperty(value = "skuType")
    private SkuType skuType;

    /*
     * The network function sku role details.
     */
    @JsonProperty(value = "value")
    private List<NetworkFunctionSkuRoleDetailsInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the skuType property: The network function sku type.
     *
     * @return the skuType value.
     */
    public SkuType skuType() {
        return this.skuType;
    }

    /**
     * Set the skuType property: The network function sku type.
     *
     * @param skuType the skuType value to set.
     * @return the NetworkFunctionSkuDetails object itself.
     */
    public NetworkFunctionSkuDetails withSkuType(SkuType skuType) {
        this.skuType = skuType;
        return this;
    }

    /**
     * Get the value property: The network function sku role details.
     *
     * @return the value value.
     */
    public List<NetworkFunctionSkuRoleDetailsInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The network function sku role details.
     *
     * @param value the value value to set.
     * @return the NetworkFunctionSkuDetails object itself.
     */
    public NetworkFunctionSkuDetails withValue(List<NetworkFunctionSkuRoleDetailsInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
