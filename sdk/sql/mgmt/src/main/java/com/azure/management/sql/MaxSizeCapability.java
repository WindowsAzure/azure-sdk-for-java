// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MaxSizeCapability model. */
@Immutable
public final class MaxSizeCapability {
    /*
     * The maximum size limit (see 'unit' for the units).
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Integer limit;

    /*
     * The units that the limit is expressed in.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeUnit unit;

    /**
     * Get the limit property: The maximum size limit (see 'unit' for the units).
     *
     * @return the limit value.
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Get the unit property: The units that the limit is expressed in.
     *
     * @return the unit value.
     */
    public MaxSizeUnit unit() {
        return this.unit;
    }
}
