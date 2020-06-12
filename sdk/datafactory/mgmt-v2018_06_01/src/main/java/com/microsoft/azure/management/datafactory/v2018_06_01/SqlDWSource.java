/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity SQL Data Warehouse source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SqlDWSource.class)
@JsonTypeName("SqlDWSource")
public class SqlDWSource extends TabularSource {
    /**
     * SQL Data Warehouse reader query. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "sqlReaderQuery")
    private Object sqlReaderQuery;

    /**
     * Name of the stored procedure for a SQL Data Warehouse source. This
     * cannot be used at the same time as SqlReaderQuery. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "sqlReaderStoredProcedureName")
    private Object sqlReaderStoredProcedureName;

    /**
     * Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}". Type: object (or Expression
     * with resultType object), itemType: StoredProcedureParameter.
     */
    @JsonProperty(value = "storedProcedureParameters")
    private Object storedProcedureParameters;

    /**
     * The partition mechanism that will be used for Sql read in parallel.
     * Possible values include: 'None', 'PhysicalPartitionsOfTable',
     * 'DynamicRange'.
     */
    @JsonProperty(value = "partitionOption")
    private SqlPartitionOption partitionOption;

    /**
     * The settings that will be leveraged for Sql source partitioning.
     */
    @JsonProperty(value = "partitionSettings")
    private SqlPartitionSettings partitionSettings;

    /**
     * Get sQL Data Warehouse reader query. Type: string (or Expression with resultType string).
     *
     * @return the sqlReaderQuery value
     */
    public Object sqlReaderQuery() {
        return this.sqlReaderQuery;
    }

    /**
     * Set sQL Data Warehouse reader query. Type: string (or Expression with resultType string).
     *
     * @param sqlReaderQuery the sqlReaderQuery value to set
     * @return the SqlDWSource object itself.
     */
    public SqlDWSource withSqlReaderQuery(Object sqlReaderQuery) {
        this.sqlReaderQuery = sqlReaderQuery;
        return this;
    }

    /**
     * Get name of the stored procedure for a SQL Data Warehouse source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     *
     * @return the sqlReaderStoredProcedureName value
     */
    public Object sqlReaderStoredProcedureName() {
        return this.sqlReaderStoredProcedureName;
    }

    /**
     * Set name of the stored procedure for a SQL Data Warehouse source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     *
     * @param sqlReaderStoredProcedureName the sqlReaderStoredProcedureName value to set
     * @return the SqlDWSource object itself.
     */
    public SqlDWSource withSqlReaderStoredProcedureName(Object sqlReaderStoredProcedureName) {
        this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
        return this;
    }

    /**
     * Get value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}". Type: object (or Expression with resultType object), itemType: StoredProcedureParameter.
     *
     * @return the storedProcedureParameters value
     */
    public Object storedProcedureParameters() {
        return this.storedProcedureParameters;
    }

    /**
     * Set value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}". Type: object (or Expression with resultType object), itemType: StoredProcedureParameter.
     *
     * @param storedProcedureParameters the storedProcedureParameters value to set
     * @return the SqlDWSource object itself.
     */
    public SqlDWSource withStoredProcedureParameters(Object storedProcedureParameters) {
        this.storedProcedureParameters = storedProcedureParameters;
        return this;
    }

    /**
     * Get the partition mechanism that will be used for Sql read in parallel. Possible values include: 'None', 'PhysicalPartitionsOfTable', 'DynamicRange'.
     *
     * @return the partitionOption value
     */
    public SqlPartitionOption partitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partition mechanism that will be used for Sql read in parallel. Possible values include: 'None', 'PhysicalPartitionsOfTable', 'DynamicRange'.
     *
     * @param partitionOption the partitionOption value to set
     * @return the SqlDWSource object itself.
     */
    public SqlDWSource withPartitionOption(SqlPartitionOption partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the settings that will be leveraged for Sql source partitioning.
     *
     * @return the partitionSettings value
     */
    public SqlPartitionSettings partitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the settings that will be leveraged for Sql source partitioning.
     *
     * @param partitionSettings the partitionSettings value to set
     * @return the SqlDWSource object itself.
     */
    public SqlDWSource withPartitionSettings(SqlPartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

}
