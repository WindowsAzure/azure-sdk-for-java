// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LoadBalancerSku model. */
@Fluent
public final class LoadBalancerSku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoadBalancerSku.class);

    /*
     * Name of a load balancer SKU.
     */
    @JsonProperty(value = "name")
    private LoadBalancerSkuName name;

    /**
     * Get the name property: Name of a load balancer SKU.
     *
     * @return the name value.
     */
    public LoadBalancerSkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of a load balancer SKU.
     *
     * @param name the name value to set.
     * @return the LoadBalancerSku object itself.
     */
    public LoadBalancerSku withName(LoadBalancerSkuName name) {
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
