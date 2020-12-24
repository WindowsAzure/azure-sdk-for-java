// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The compute isolation properties. */
@Fluent
public final class ComputeIsolationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ComputeIsolationProperties.class);

    /*
     * The flag indicates whether enable compute isolation or not.
     */
    @JsonProperty(value = "enableComputeIsolation")
    private Boolean enableComputeIsolation;

    /*
     * The host sku.
     */
    @JsonProperty(value = "hostSku")
    private String hostSku;

    /**
     * Get the enableComputeIsolation property: The flag indicates whether enable compute isolation or not.
     *
     * @return the enableComputeIsolation value.
     */
    public Boolean enableComputeIsolation() {
        return this.enableComputeIsolation;
    }

    /**
     * Set the enableComputeIsolation property: The flag indicates whether enable compute isolation or not.
     *
     * @param enableComputeIsolation the enableComputeIsolation value to set.
     * @return the ComputeIsolationProperties object itself.
     */
    public ComputeIsolationProperties withEnableComputeIsolation(Boolean enableComputeIsolation) {
        this.enableComputeIsolation = enableComputeIsolation;
        return this;
    }

    /**
     * Get the hostSku property: The host sku.
     *
     * @return the hostSku value.
     */
    public String hostSku() {
        return this.hostSku;
    }

    /**
     * Set the hostSku property: The host sku.
     *
     * @param hostSku the hostSku value to set.
     * @return the ComputeIsolationProperties object itself.
     */
    public ComputeIsolationProperties withHostSku(String hostSku) {
        this.hostSku = hostSku;
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
