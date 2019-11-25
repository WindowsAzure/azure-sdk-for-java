/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes an Azure Table output data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Microsoft.Storage/Table")
@JsonFlatten
public class AzureTableOutputDataSource extends OutputDataSource {
    /**
     * The name of the Azure Storage account. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "properties.accountName")
    private String accountName;

    /**
     * The account key for the Azure Storage account. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.accountKey")
    private String accountKey;

    /**
     * The name of the Azure Table. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.table")
    private String table;

    /**
     * This element indicates the name of a column from the SELECT statement in
     * the query that will be used as the partition key for the Azure Table.
     * Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.partitionKey")
    private String partitionKey;

    /**
     * This element indicates the name of a column from the SELECT statement in
     * the query that will be used as the row key for the Azure Table. Required
     * on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.rowKey")
    private String rowKey;

    /**
     * If specified, each item in the array is the name of a column to remove
     * (if present) from output event entities.
     */
    @JsonProperty(value = "properties.columnsToRemove")
    private List<String> columnsToRemove;

    /**
     * The number of rows to write to the Azure Table at a time.
     */
    @JsonProperty(value = "properties.batchSize")
    private Integer batchSize;

    /**
     * Get the name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     *
     * @param accountName the accountName value to set
     * @return the AzureTableOutputDataSource object itself.
     */
    public AzureTableOutputDataSource withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     *
     * @return the accountKey value
     */
    public String accountKey() {
        return this.accountKey;
    }

    /**
     * Set the account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     *
     * @param accountKey the accountKey value to set
     * @return the AzureTableOutputDataSource object itself.
     */
    public AzureTableOutputDataSource withAccountKey(String accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the name of the Azure Table. Required on PUT (CreateOrReplace) requests.
     *
     * @return the table value
     */
    public String table() {
        return this.table;
    }

    /**
     * Set the name of the Azure Table. Required on PUT (CreateOrReplace) requests.
     *
     * @param table the table value to set
     * @return the AzureTableOutputDataSource object itself.
     */
    public AzureTableOutputDataSource withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Get this element indicates the name of a column from the SELECT statement in the query that will be used as the partition key for the Azure Table. Required on PUT (CreateOrReplace) requests.
     *
     * @return the partitionKey value
     */
    public String partitionKey() {
        return this.partitionKey;
    }

    /**
     * Set this element indicates the name of a column from the SELECT statement in the query that will be used as the partition key for the Azure Table. Required on PUT (CreateOrReplace) requests.
     *
     * @param partitionKey the partitionKey value to set
     * @return the AzureTableOutputDataSource object itself.
     */
    public AzureTableOutputDataSource withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * Get this element indicates the name of a column from the SELECT statement in the query that will be used as the row key for the Azure Table. Required on PUT (CreateOrReplace) requests.
     *
     * @return the rowKey value
     */
    public String rowKey() {
        return this.rowKey;
    }

    /**
     * Set this element indicates the name of a column from the SELECT statement in the query that will be used as the row key for the Azure Table. Required on PUT (CreateOrReplace) requests.
     *
     * @param rowKey the rowKey value to set
     * @return the AzureTableOutputDataSource object itself.
     */
    public AzureTableOutputDataSource withRowKey(String rowKey) {
        this.rowKey = rowKey;
        return this;
    }

    /**
     * Get if specified, each item in the array is the name of a column to remove (if present) from output event entities.
     *
     * @return the columnsToRemove value
     */
    public List<String> columnsToRemove() {
        return this.columnsToRemove;
    }

    /**
     * Set if specified, each item in the array is the name of a column to remove (if present) from output event entities.
     *
     * @param columnsToRemove the columnsToRemove value to set
     * @return the AzureTableOutputDataSource object itself.
     */
    public AzureTableOutputDataSource withColumnsToRemove(List<String> columnsToRemove) {
        this.columnsToRemove = columnsToRemove;
        return this;
    }

    /**
     * Get the number of rows to write to the Azure Table at a time.
     *
     * @return the batchSize value
     */
    public Integer batchSize() {
        return this.batchSize;
    }

    /**
     * Set the number of rows to write to the Azure Table at a time.
     *
     * @param batchSize the batchSize value to set
     * @return the AzureTableOutputDataSource object itself.
     */
    public AzureTableOutputDataSource withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

}
