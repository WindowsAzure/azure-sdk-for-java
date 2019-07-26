/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity SQL server source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SqlServerSource")
public class SqlServerSource extends CopySource {
    /**
     * SQL reader query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sqlReaderQuery")
    private Object sqlReaderQuery;

    /**
     * Name of the stored procedure for a SQL Database source. This cannot be
     * used at the same time as SqlReaderQuery. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "sqlReaderStoredProcedureName")
    private Object sqlReaderStoredProcedureName;

    /**
     * Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}".
     */
    @JsonProperty(value = "storedProcedureParameters")
    private Map<String, StoredProcedureParameter> storedProcedureParameters;

    /**
     * Which additional types to produce.
     */
    @JsonProperty(value = "produceAdditionalTypes")
    private Object produceAdditionalTypes;

    /**
     * Get sQL reader query. Type: string (or Expression with resultType string).
     *
     * @return the sqlReaderQuery value
     */
    public Object sqlReaderQuery() {
        return this.sqlReaderQuery;
    }

    /**
     * Set sQL reader query. Type: string (or Expression with resultType string).
     *
     * @param sqlReaderQuery the sqlReaderQuery value to set
     * @return the SqlServerSource object itself.
     */
    public SqlServerSource withSqlReaderQuery(Object sqlReaderQuery) {
        this.sqlReaderQuery = sqlReaderQuery;
        return this;
    }

    /**
     * Get name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     *
     * @return the sqlReaderStoredProcedureName value
     */
    public Object sqlReaderStoredProcedureName() {
        return this.sqlReaderStoredProcedureName;
    }

    /**
     * Set name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     *
     * @param sqlReaderStoredProcedureName the sqlReaderStoredProcedureName value to set
     * @return the SqlServerSource object itself.
     */
    public SqlServerSource withSqlReaderStoredProcedureName(Object sqlReaderStoredProcedureName) {
        this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
        return this;
    }

    /**
     * Get value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     *
     * @return the storedProcedureParameters value
     */
    public Map<String, StoredProcedureParameter> storedProcedureParameters() {
        return this.storedProcedureParameters;
    }

    /**
     * Set value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     *
     * @param storedProcedureParameters the storedProcedureParameters value to set
     * @return the SqlServerSource object itself.
     */
    public SqlServerSource withStoredProcedureParameters(Map<String, StoredProcedureParameter> storedProcedureParameters) {
        this.storedProcedureParameters = storedProcedureParameters;
        return this;
    }

    /**
     * Get which additional types to produce.
     *
     * @return the produceAdditionalTypes value
     */
    public Object produceAdditionalTypes() {
        return this.produceAdditionalTypes;
    }

    /**
     * Set which additional types to produce.
     *
     * @param produceAdditionalTypes the produceAdditionalTypes value to set
     * @return the SqlServerSource object itself.
     */
    public SqlServerSource withProduceAdditionalTypes(Object produceAdditionalTypes) {
        this.produceAdditionalTypes = produceAdditionalTypes;
        return this;
    }

}
