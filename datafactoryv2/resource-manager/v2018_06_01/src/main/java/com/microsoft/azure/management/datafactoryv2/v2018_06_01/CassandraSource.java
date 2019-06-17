/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity source for a Cassandra database.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CassandraSource")
public class CassandraSource extends CopySource {
    /**
     * Database query. Should be a SQL-92 query expression or Cassandra Query
     * Language (CQL) command. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /**
     * The consistency level specifies how many Cassandra servers must respond
     * to a read request before returning data to the client application.
     * Cassandra checks the specified number of Cassandra servers for data to
     * satisfy the read request. Must be one of
     * cassandraSourceReadConsistencyLevels. The default value is 'ONE'. It is
     * case-insensitive.
     */
    @JsonProperty(value = "consistencyLevel")
    private Object consistencyLevel;

    /**
     * Get database query. Should be a SQL-92 query expression or Cassandra Query Language (CQL) command. Type: string (or Expression with resultType string).
     *
     * @return the query value
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set database query. Should be a SQL-92 query expression or Cassandra Query Language (CQL) command. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set
     * @return the CassandraSource object itself.
     */
    public CassandraSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the consistency level specifies how many Cassandra servers must respond to a read request before returning data to the client application. Cassandra checks the specified number of Cassandra servers for data to satisfy the read request. Must be one of cassandraSourceReadConsistencyLevels. The default value is 'ONE'. It is case-insensitive.
     *
     * @return the consistencyLevel value
     */
    public Object consistencyLevel() {
        return this.consistencyLevel;
    }

    /**
     * Set the consistency level specifies how many Cassandra servers must respond to a read request before returning data to the client application. Cassandra checks the specified number of Cassandra servers for data to satisfy the read request. Must be one of cassandraSourceReadConsistencyLevels. The default value is 'ONE'. It is case-insensitive.
     *
     * @param consistencyLevel the consistencyLevel value to set
     * @return the CassandraSource object itself.
     */
    public CassandraSource withConsistencyLevel(Object consistencyLevel) {
        this.consistencyLevel = consistencyLevel;
        return this;
    }

}
