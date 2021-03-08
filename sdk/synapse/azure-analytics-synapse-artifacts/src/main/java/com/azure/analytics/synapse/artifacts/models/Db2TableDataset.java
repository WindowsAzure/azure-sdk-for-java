// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The Db2 table dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Db2Table")
@JsonFlatten
@Fluent
public class Db2TableDataset extends Dataset {
    /*
     * This property will be retired. Please consider using schema + table
     * properties instead.
     */
    @JsonProperty(value = "typeProperties.tableName")
    private Object tableName;

    /*
     * The Db2 schema name. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.schema")
    private Object schemaTypePropertiesSchema;

    /*
     * The Db2 table name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.table")
    private Object table;

    /**
     * Get the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     *
     * @return the tableName value.
     */
    public Object getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     *
     * @param tableName the tableName value to set.
     * @return the Db2TableDataset object itself.
     */
    public Db2TableDataset setTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the schemaTypePropertiesSchema property: The Db2 schema name. Type: string (or Expression with resultType
     * string).
     *
     * @return the schemaTypePropertiesSchema value.
     */
    public Object getSchemaTypePropertiesSchema() {
        return this.schemaTypePropertiesSchema;
    }

    /**
     * Set the schemaTypePropertiesSchema property: The Db2 schema name. Type: string (or Expression with resultType
     * string).
     *
     * @param schemaTypePropertiesSchema the schemaTypePropertiesSchema value to set.
     * @return the Db2TableDataset object itself.
     */
    public Db2TableDataset setSchemaTypePropertiesSchema(Object schemaTypePropertiesSchema) {
        this.schemaTypePropertiesSchema = schemaTypePropertiesSchema;
        return this;
    }

    /**
     * Get the table property: The Db2 table name. Type: string (or Expression with resultType string).
     *
     * @return the table value.
     */
    public Object getTable() {
        return this.table;
    }

    /**
     * Set the table property: The Db2 table name. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set.
     * @return the Db2TableDataset object itself.
     */
    public Db2TableDataset setTable(Object table) {
        this.table = table;
        return this;
    }
}
