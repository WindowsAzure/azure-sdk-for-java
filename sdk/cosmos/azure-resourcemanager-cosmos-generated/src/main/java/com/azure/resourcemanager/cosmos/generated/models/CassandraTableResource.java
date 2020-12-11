// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB Cassandra table resource object. */
@Fluent
public class CassandraTableResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CassandraTableResource.class);

    /*
     * Name of the Cosmos DB Cassandra table
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Time to live of the Cosmos DB Cassandra table
     */
    @JsonProperty(value = "defaultTtl")
    private Integer defaultTtl;

    /*
     * Schema of the Cosmos DB Cassandra table
     */
    @JsonProperty(value = "schema")
    private CassandraSchema schema;

    /*
     * Analytical TTL.
     */
    @JsonProperty(value = "analyticalStorageTtl")
    private Integer analyticalStorageTtl;

    /**
     * Get the id property: Name of the Cosmos DB Cassandra table.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Name of the Cosmos DB Cassandra table.
     *
     * @param id the id value to set.
     * @return the CassandraTableResource object itself.
     */
    public CassandraTableResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the defaultTtl property: Time to live of the Cosmos DB Cassandra table.
     *
     * @return the defaultTtl value.
     */
    public Integer defaultTtl() {
        return this.defaultTtl;
    }

    /**
     * Set the defaultTtl property: Time to live of the Cosmos DB Cassandra table.
     *
     * @param defaultTtl the defaultTtl value to set.
     * @return the CassandraTableResource object itself.
     */
    public CassandraTableResource withDefaultTtl(Integer defaultTtl) {
        this.defaultTtl = defaultTtl;
        return this;
    }

    /**
     * Get the schema property: Schema of the Cosmos DB Cassandra table.
     *
     * @return the schema value.
     */
    public CassandraSchema schema() {
        return this.schema;
    }

    /**
     * Set the schema property: Schema of the Cosmos DB Cassandra table.
     *
     * @param schema the schema value to set.
     * @return the CassandraTableResource object itself.
     */
    public CassandraTableResource withSchema(CassandraSchema schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the analyticalStorageTtl property: Analytical TTL.
     *
     * @return the analyticalStorageTtl value.
     */
    public Integer analyticalStorageTtl() {
        return this.analyticalStorageTtl;
    }

    /**
     * Set the analyticalStorageTtl property: Analytical TTL.
     *
     * @param analyticalStorageTtl the analyticalStorageTtl value to set.
     * @return the CassandraTableResource object itself.
     */
    public CassandraTableResource withAnalyticalStorageTtl(Integer analyticalStorageTtl) {
        this.analyticalStorageTtl = analyticalStorageTtl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model CassandraTableResource"));
        }
        if (schema() != null) {
            schema().validate();
        }
    }
}
