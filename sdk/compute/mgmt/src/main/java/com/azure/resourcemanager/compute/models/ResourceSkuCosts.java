// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResourceSkuCosts model. */
@Immutable
public final class ResourceSkuCosts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceSkuCosts.class);

    /*
     * Used for querying price from commerce.
     */
    @JsonProperty(value = "meterID", access = JsonProperty.Access.WRITE_ONLY)
    private String meterId;

    /*
     * The multiplier is needed to extend the base metered cost.
     */
    @JsonProperty(value = "quantity", access = JsonProperty.Access.WRITE_ONLY)
    private Long quantity;

    /*
     * An invariant to show the extended unit.
     */
    @JsonProperty(value = "extendedUnit", access = JsonProperty.Access.WRITE_ONLY)
    private String extendedUnit;

    /**
     * Get the meterId property: Used for querying price from commerce.
     *
     * @return the meterId value.
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Get the quantity property: The multiplier is needed to extend the base metered cost.
     *
     * @return the quantity value.
     */
    public Long quantity() {
        return this.quantity;
    }

    /**
     * Get the extendedUnit property: An invariant to show the extended unit.
     *
     * @return the extendedUnit value.
     */
    public String extendedUnit() {
        return this.extendedUnit;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
