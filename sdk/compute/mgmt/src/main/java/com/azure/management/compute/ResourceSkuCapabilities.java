// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResourceSkuCapabilities model.
 */
@Immutable
public final class ResourceSkuCapabilities {
    /*
     * An invariant to describe the feature.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * An invariant if the feature is measured by quantity.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get the name property: An invariant to describe the feature.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value property: An invariant if the feature is measured by
     * quantity.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }
}
