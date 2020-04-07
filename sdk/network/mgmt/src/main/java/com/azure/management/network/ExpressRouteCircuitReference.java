// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ExpressRouteCircuitReference model.
 */
@Fluent
public final class ExpressRouteCircuitReference {
    /*
     * Corresponding Express Route Circuit Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: Corresponding Express Route Circuit Id.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Corresponding Express Route Circuit Id.
     * 
     * @param id the id value to set.
     * @return the ExpressRouteCircuitReference object itself.
     */
    public ExpressRouteCircuitReference withId(String id) {
        this.id = id;
        return this;
    }
}
