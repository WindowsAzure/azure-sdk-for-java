// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HybridConnectionLimits model. */
@JsonFlatten
@Immutable
public class HybridConnectionLimitsInner extends ProxyOnlyResource {
    /*
     * The current number of Hybrid Connections.
     */
    @JsonProperty(value = "properties.current", access = JsonProperty.Access.WRITE_ONLY)
    private Integer current;

    /*
     * The maximum number of Hybrid Connections allowed.
     */
    @JsonProperty(value = "properties.maximum", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maximum;

    /**
     * Get the current property: The current number of Hybrid Connections.
     *
     * @return the current value.
     */
    public Integer current() {
        return this.current;
    }

    /**
     * Get the maximum property: The maximum number of Hybrid Connections allowed.
     *
     * @return the maximum value.
     */
    public Integer maximum() {
        return this.maximum;
    }
}
