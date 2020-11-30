// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Oracle source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("OracleSource")
@Fluent
public final class OracleSource extends CopySource {
    /*
     * Oracle reader query. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "oracleReaderQuery")
    private Object oracleReaderQuery;

    /*
     * Query timeout. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "queryTimeout")
    private Object queryTimeout;

    /*
     * The partition mechanism that will be used for Oracle read in parallel.
     */
    @JsonProperty(value = "partitionOption")
    private OraclePartitionOption partitionOption;

    /*
     * The settings that will be leveraged for Oracle source partitioning.
     */
    @JsonProperty(value = "partitionSettings")
    private OraclePartitionSettings partitionSettings;

    /**
     * Get the oracleReaderQuery property: Oracle reader query. Type: string (or Expression with resultType string).
     *
     * @return the oracleReaderQuery value.
     */
    public Object getOracleReaderQuery() {
        return this.oracleReaderQuery;
    }

    /**
     * Set the oracleReaderQuery property: Oracle reader query. Type: string (or Expression with resultType string).
     *
     * @param oracleReaderQuery the oracleReaderQuery value to set.
     * @return the OracleSource object itself.
     */
    public OracleSource setOracleReaderQuery(Object oracleReaderQuery) {
        this.oracleReaderQuery = oracleReaderQuery;
        return this;
    }

    /**
     * Get the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the queryTimeout value.
     */
    public Object getQueryTimeout() {
        return this.queryTimeout;
    }

    /**
     * Set the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param queryTimeout the queryTimeout value to set.
     * @return the OracleSource object itself.
     */
    public OracleSource setQueryTimeout(Object queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }

    /**
     * Get the partitionOption property: The partition mechanism that will be used for Oracle read in parallel.
     *
     * @return the partitionOption value.
     */
    public OraclePartitionOption getPartitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partitionOption property: The partition mechanism that will be used for Oracle read in parallel.
     *
     * @param partitionOption the partitionOption value to set.
     * @return the OracleSource object itself.
     */
    public OracleSource setPartitionOption(OraclePartitionOption partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the partitionSettings property: The settings that will be leveraged for Oracle source partitioning.
     *
     * @return the partitionSettings value.
     */
    public OraclePartitionSettings getPartitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the partitionSettings property: The settings that will be leveraged for Oracle source partitioning.
     *
     * @param partitionSettings the partitionSettings value to set.
     * @return the OracleSource object itself.
     */
    public OracleSource setPartitionSettings(OraclePartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }
}
