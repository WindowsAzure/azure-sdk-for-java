/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_12_12;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB Cassandra table resource object.
 */
public class CassandraTableResource {
    /**
     * Name of the Cosmos DB Cassandra table.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Time to live of the Cosmos DB Cassandra table.
     */
    @JsonProperty(value = "defaultTtl")
    private Integer defaultTtl;

    /**
     * Schema of the Cosmos DB Cassandra table.
     */
    @JsonProperty(value = "schema")
    private CassandraSchema schema;

    /**
     * Get name of the Cosmos DB Cassandra table.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set name of the Cosmos DB Cassandra table.
     *
     * @param id the id value to set
     * @return the CassandraTableResource object itself.
     */
    public CassandraTableResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get time to live of the Cosmos DB Cassandra table.
     *
     * @return the defaultTtl value
     */
    public Integer defaultTtl() {
        return this.defaultTtl;
    }

    /**
     * Set time to live of the Cosmos DB Cassandra table.
     *
     * @param defaultTtl the defaultTtl value to set
     * @return the CassandraTableResource object itself.
     */
    public CassandraTableResource withDefaultTtl(Integer defaultTtl) {
        this.defaultTtl = defaultTtl;
        return this;
    }

    /**
     * Get schema of the Cosmos DB Cassandra table.
     *
     * @return the schema value
     */
    public CassandraSchema schema() {
        return this.schema;
    }

    /**
     * Set schema of the Cosmos DB Cassandra table.
     *
     * @param schema the schema value to set
     * @return the CassandraTableResource object itself.
     */
    public CassandraTableResource withSchema(CassandraSchema schema) {
        this.schema = schema;
        return this;
    }

}
