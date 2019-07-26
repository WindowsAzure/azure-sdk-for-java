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
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.DatasetInner;

/**
 * Azure PostgreSQL dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzurePostgreSqlTable")
@JsonFlatten
public class AzurePostgreSqlTableDataset extends DatasetInner {
    /**
     * The table name of the Azure PostgreSQL database which includes both
     * schema and table. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tableName")
    private Object tableName;

    /**
     * The table name of the Azure PostgreSQL database. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.table")
    private Object table;

    /**
     * The schema name of the Azure PostgreSQL database. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.schema")
    private Object azurePostgreSqlTableDatasetSchema;

    /**
     * Get the table name of the Azure PostgreSQL database which includes both schema and table. Type: string (or Expression with resultType string).
     *
     * @return the tableName value
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the table name of the Azure PostgreSQL database which includes both schema and table. Type: string (or Expression with resultType string).
     *
     * @param tableName the tableName value to set
     * @return the AzurePostgreSqlTableDataset object itself.
     */
    public AzurePostgreSqlTableDataset withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the table name of the Azure PostgreSQL database. Type: string (or Expression with resultType string).
     *
     * @return the table value
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table name of the Azure PostgreSQL database. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set
     * @return the AzurePostgreSqlTableDataset object itself.
     */
    public AzurePostgreSqlTableDataset withTable(Object table) {
        this.table = table;
        return this;
    }

    /**
     * Get the schema name of the Azure PostgreSQL database. Type: string (or Expression with resultType string).
     *
     * @return the azurePostgreSqlTableDatasetSchema value
     */
    public Object azurePostgreSqlTableDatasetSchema() {
        return this.azurePostgreSqlTableDatasetSchema;
    }

    /**
     * Set the schema name of the Azure PostgreSQL database. Type: string (or Expression with resultType string).
     *
     * @param azurePostgreSqlTableDatasetSchema the azurePostgreSqlTableDatasetSchema value to set
     * @return the AzurePostgreSqlTableDataset object itself.
     */
    public AzurePostgreSqlTableDataset withAzurePostgreSqlTableDatasetSchema(Object azurePostgreSqlTableDatasetSchema) {
        this.azurePostgreSqlTableDatasetSchema = azurePostgreSqlTableDatasetSchema;
        return this;
    }

}
