/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import com.microsoft.azure.management.cosmosdb.v2015_04_08.CassandraSchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * An Azure Cosmos DB Cassandra table.
 */
@JsonFlatten
@SkipParentValidation
public class CassandraTableInner extends Resource {
    /**
     * Name of the Cosmos DB Cassandra table.
     */
    @JsonProperty(value = "properties.id", required = true)
    private String cassandraTableId;

    /**
     * Time to live of the Cosmos DB Cassandra table.
     */
    @JsonProperty(value = "properties.defaultTtl")
    private Integer defaultTtl;

    /**
     * Schema of the Cosmos DB Cassandra table.
     */
    @JsonProperty(value = "properties.schema")
    private CassandraSchema schema;

    /**
     * Get name of the Cosmos DB Cassandra table.
     *
     * @return the cassandraTableId value
     */
    public String cassandraTableId() {
        return this.cassandraTableId;
    }

    /**
     * Set name of the Cosmos DB Cassandra table.
     *
     * @param cassandraTableId the cassandraTableId value to set
     * @return the CassandraTableInner object itself.
     */
    public CassandraTableInner withCassandraTableId(String cassandraTableId) {
        this.cassandraTableId = cassandraTableId;
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
     * @return the CassandraTableInner object itself.
     */
    public CassandraTableInner withDefaultTtl(Integer defaultTtl) {
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
     * @return the CassandraTableInner object itself.
     */
    public CassandraTableInner withSchema(CassandraSchema schema) {
        this.schema = schema;
        return this;
    }

}
