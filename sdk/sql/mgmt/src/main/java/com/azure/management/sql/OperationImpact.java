// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OperationImpact model. */
@Immutable
public final class OperationImpact {
    /*
     * The name of the impact dimension.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The unit in which estimated impact to dimension is measured.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /*
     * The absolute impact to dimension.
     */
    @JsonProperty(value = "changeValueAbsolute", access = JsonProperty.Access.WRITE_ONLY)
    private Double changeValueAbsolute;

    /*
     * The relative impact to dimension (null if not applicable)
     */
    @JsonProperty(value = "changeValueRelative", access = JsonProperty.Access.WRITE_ONLY)
    private Double changeValueRelative;

    /**
     * Get the name property: The name of the impact dimension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the unit property: The unit in which estimated impact to dimension is measured.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the changeValueAbsolute property: The absolute impact to dimension.
     *
     * @return the changeValueAbsolute value.
     */
    public Double changeValueAbsolute() {
        return this.changeValueAbsolute;
    }

    /**
     * Get the changeValueRelative property: The relative impact to dimension (null if not applicable).
     *
     * @return the changeValueRelative value.
     */
    public Double changeValueRelative() {
        return this.changeValueRelative;
    }
}
