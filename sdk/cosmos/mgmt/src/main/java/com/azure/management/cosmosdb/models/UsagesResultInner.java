// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The UsagesResult model. */
@Immutable
public final class UsagesResultInner {
    /*
     * The list of usages for the database. A usage is a point in time metric
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<UsageInner> value;

    /**
     * Get the value property: The list of usages for the database. A usage is a point in time metric.
     *
     * @return the value value.
     */
    public List<UsageInner> value() {
        return this.value;
    }
}
