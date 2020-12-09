// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the SKU of an Azure Cognitive Search Service, which determines price tier and capacity limits. */
@Fluent
public final class Sku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Sku.class);

    /*
     * The SKU of the Search service. Valid values include: 'free': Shared
     * service. 'basic': Dedicated service with up to 3 replicas. 'standard':
     * Dedicated service with up to 12 partitions and 12 replicas. 'standard2':
     * Similar to standard, but with more capacity per search unit.
     * 'standard3': The largest Standard offering with up to 12 partitions and
     * 12 replicas (or up to 3 partitions with more indexes if you also set the
     * hostingMode property to 'highDensity'). 'storage_optimized_l1': Supports
     * 1TB per partition, up to 12 partitions. 'storage_optimized_l2': Supports
     * 2TB per partition, up to 12 partitions.'
     */
    @JsonProperty(value = "name")
    private SkuName name;

    /**
     * Get the name property: The SKU of the Search service. Valid values include: 'free': Shared service. 'basic':
     * Dedicated service with up to 3 replicas. 'standard': Dedicated service with up to 12 partitions and 12 replicas.
     * 'standard2': Similar to standard, but with more capacity per search unit. 'standard3': The largest Standard
     * offering with up to 12 partitions and 12 replicas (or up to 3 partitions with more indexes if you also set the
     * hostingMode property to 'highDensity'). 'storage_optimized_l1': Supports 1TB per partition, up to 12 partitions.
     * 'storage_optimized_l2': Supports 2TB per partition, up to 12 partitions.'.
     *
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: The SKU of the Search service. Valid values include: 'free': Shared service. 'basic':
     * Dedicated service with up to 3 replicas. 'standard': Dedicated service with up to 12 partitions and 12 replicas.
     * 'standard2': Similar to standard, but with more capacity per search unit. 'standard3': The largest Standard
     * offering with up to 12 partitions and 12 replicas (or up to 3 partitions with more indexes if you also set the
     * hostingMode property to 'highDensity'). 'storage_optimized_l1': Supports 1TB per partition, up to 12 partitions.
     * 'storage_optimized_l2': Supports 2TB per partition, up to 12 partitions.'.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
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
