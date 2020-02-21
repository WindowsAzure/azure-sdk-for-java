/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB capability object.
 */
public class Capability {
    /**
     * Name of the Cosmos DB capability. For example, "name":
     * "EnableCassandra". Current values also include "EnableTable" and
     * "EnableGremlin".
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get name of the Cosmos DB capability. For example, "name": "EnableCassandra". Current values also include "EnableTable" and "EnableGremlin".
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the Cosmos DB capability. For example, "name": "EnableCassandra". Current values also include "EnableTable" and "EnableGremlin".
     *
     * @param name the name value to set
     * @return the Capability object itself.
     */
    public Capability withName(String name) {
        this.name = name;
        return this;
    }

}
