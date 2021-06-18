// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A copy activity source for a Cassandra database. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CassandraSource")
@Fluent
public final class CassandraSource extends TabularSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CassandraSource.class);

    /*
     * Database query. Should be a SQL-92 query expression or Cassandra Query
     * Language (CQL) command. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * The consistency level specifies how many Cassandra servers must respond
     * to a read request before returning data to the client application.
     * Cassandra checks the specified number of Cassandra servers for data to
     * satisfy the read request. Must be one of
     * cassandraSourceReadConsistencyLevels. The default value is 'ONE'. It is
     * case-insensitive.
     */
    @JsonProperty(value = "consistencyLevel")
    private CassandraSourceReadConsistencyLevels consistencyLevel;

    /**
     * Get the query property: Database query. Should be a SQL-92 query expression or Cassandra Query Language (CQL)
     * command. Type: string (or Expression with resultType string).
     *
     * @return the query value.
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set the query property: Database query. Should be a SQL-92 query expression or Cassandra Query Language (CQL)
     * command. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set.
     * @return the CassandraSource object itself.
     */
    public CassandraSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the consistencyLevel property: The consistency level specifies how many Cassandra servers must respond to a
     * read request before returning data to the client application. Cassandra checks the specified number of Cassandra
     * servers for data to satisfy the read request. Must be one of cassandraSourceReadConsistencyLevels. The default
     * value is 'ONE'. It is case-insensitive.
     *
     * @return the consistencyLevel value.
     */
    public CassandraSourceReadConsistencyLevels consistencyLevel() {
        return this.consistencyLevel;
    }

    /**
     * Set the consistencyLevel property: The consistency level specifies how many Cassandra servers must respond to a
     * read request before returning data to the client application. Cassandra checks the specified number of Cassandra
     * servers for data to satisfy the read request. Must be one of cassandraSourceReadConsistencyLevels. The default
     * value is 'ONE'. It is case-insensitive.
     *
     * @param consistencyLevel the consistencyLevel value to set.
     * @return the CassandraSource object itself.
     */
    public CassandraSource withConsistencyLevel(CassandraSourceReadConsistencyLevels consistencyLevel) {
        this.consistencyLevel = consistencyLevel;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraSource withQueryTimeout(Object queryTimeout) {
        super.withQueryTimeout(queryTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraSource withAdditionalColumns(List<AdditionalColumns> additionalColumns) {
        super.withAdditionalColumns(additionalColumns);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraSource withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
