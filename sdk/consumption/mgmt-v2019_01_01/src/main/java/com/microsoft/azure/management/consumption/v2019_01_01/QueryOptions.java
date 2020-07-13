/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2019_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for list operation.
 */
public class QueryOptions {
    /**
     * OData apply expression to aggregate usageDetails by tags or (tags and
     * properties/usageStart).
     */
    @JsonProperty(value = "")
    private String apply;

    /**
     * Get oData apply expression to aggregate usageDetails by tags or (tags and properties/usageStart).
     *
     * @return the apply value
     */
    public String apply() {
        return this.apply;
    }

    /**
     * Set oData apply expression to aggregate usageDetails by tags or (tags and properties/usageStart).
     *
     * @param apply the apply value to set
     * @return the QueryOptions object itself.
     */
    public QueryOptions withApply(String apply) {
        this.apply = apply;
        return this;
    }

}
