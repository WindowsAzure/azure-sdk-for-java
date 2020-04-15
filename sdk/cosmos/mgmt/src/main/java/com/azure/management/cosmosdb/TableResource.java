// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TableResource model. */
@Fluent
public class TableResource {
    /*
     * Name of the Cosmos DB table
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: Name of the Cosmos DB table.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Name of the Cosmos DB table.
     *
     * @param id the id value to set.
     * @return the TableResource object itself.
     */
    public TableResource withId(String id) {
        this.id = id;
        return this;
    }
}
