// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PublicIpPrefixSku model. */
@Fluent
public final class PublicIpPrefixSku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicIpPrefixSku.class);

    /*
     * Name of a public IP prefix SKU.
     */
    @JsonProperty(value = "name")
    private NatGatewaySkuName name;

    /**
     * Get the name property: Name of a public IP prefix SKU.
     *
     * @return the name value.
     */
    public NatGatewaySkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of a public IP prefix SKU.
     *
     * @param name the name value to set.
     * @return the PublicIpPrefixSku object itself.
     */
    public PublicIpPrefixSku withName(NatGatewaySkuName name) {
        this.name = name;
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
