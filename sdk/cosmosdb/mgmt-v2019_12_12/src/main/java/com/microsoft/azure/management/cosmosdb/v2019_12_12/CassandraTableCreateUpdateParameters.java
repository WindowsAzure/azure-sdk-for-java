/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_12_12;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters to create and update Cosmos DB Cassandra table.
 */
@JsonFlatten
public class CassandraTableCreateUpdateParameters extends ARMResourceProperties {
    /**
     * The standard JSON format of a Cassandra table.
     */
    @JsonProperty(value = "properties.resource", required = true)
    private CassandraTableResource resource;

    /**
     * A key-value pair of options to be applied for the request. This
     * corresponds to the headers sent with the request.
     */
    @JsonProperty(value = "properties.options", required = true)
    private Map<String, String> options;

    /**
     * Get the standard JSON format of a Cassandra table.
     *
     * @return the resource value
     */
    public CassandraTableResource resource() {
        return this.resource;
    }

    /**
     * Set the standard JSON format of a Cassandra table.
     *
     * @param resource the resource value to set
     * @return the CassandraTableCreateUpdateParameters object itself.
     */
    public CassandraTableCreateUpdateParameters withResource(CassandraTableResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get a key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     *
     * @return the options value
     */
    public Map<String, String> options() {
        return this.options;
    }

    /**
     * Set a key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     *
     * @param options the options value to set
     * @return the CassandraTableCreateUpdateParameters object itself.
     */
    public CassandraTableCreateUpdateParameters withOptions(Map<String, String> options) {
        this.options = options;
        return this;
    }

}
