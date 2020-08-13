// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.data.tables;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.data.tables.models.ListTablesOptions;
import com.azure.data.tables.models.TableItem;

/**
 * client for table service
 */
@ServiceClient(
    builder = TableServiceClientBuilder.class)
public class TableServiceClient {
    private final TableServiceAsyncClient client;

    TableServiceClient(TableServiceAsyncClient client) {
        this.client = client;
    }

    /**
     * gets the Table Client for the given table
     *
     * @param name the name of the table
     * @return the Table Client for the table
     */
    public TableClient getTableClient(String name) {
        return null;
    }

    /**
     * creates the table with the given name.  If a table with the same name already exists, the operation fails.
     *
     * @param tableName the name of the table to create
     * @return AzureTable of the created table
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TableItem createTable(String tableName) {
        return client.createTable(tableName).block();
    }

    /**
     * creates the table with the given name.  If a table with the same name already exists, the operation fails.
     *
     * @param tableName the name of the table to create
     * @param context the context of the query
     * @return response with azureTable of the created table
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<TableItem> createTableWithResponse(String tableName, Context context) {
        return client.createTableWithResponse(tableName, context).block();
    }

    /**
     * deletes the given table. Will error if the table doesn't exists or cannot be found with the given name.
     *
     * @param tableName the name of the table to be deleted
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteTable(String tableName) {
        client.deleteTable(tableName).block();
    }

    /**
     * deletes the given table. Will error if the table doesn't exists or cannot be found with the given name.
     *
     * @param tableName the name of the table to be deleted
     * @param context the context of the query
     * @return response
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteTableWithResponse(String tableName, Context context) {
        return client.deleteTableWithResponse(tableName, context).block();
    }

    /**
     * query all the tables under the storage account
     *
     * @return a list of tables that meet the query
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TableItem> listTables() {
        return new PagedIterable<>(client.listTables(new ListTablesOptions()));
    }

    /**
     * query all the tables under the storage account given the query options and returns the ones that fit the
     * criteria
     *
     * @param options the odata query object
     * @return a list of tables that meet the query
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TableItem> listTables(ListTablesOptions options) {
        return new PagedIterable<>(client.listTables(options));
    }

}
