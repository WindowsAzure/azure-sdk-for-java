/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes an Azure SQL database output data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AzureSqlDatabaseOutputDataSource.class)
@JsonTypeName("Microsoft.Sql/Server/Database")
@JsonFlatten
public class AzureSqlDatabaseOutputDataSource extends OutputDataSource {
    /**
     * The name of the SQL server containing the Azure SQL database. Required
     * on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.server")
    private String server;

    /**
     * The name of the Azure SQL database. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "properties.database")
    private String database;

    /**
     * The user name that will be used to connect to the Azure SQL database.
     * Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.user")
    private String user;

    /**
     * The password that will be used to connect to the Azure SQL database.
     * Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /**
     * The name of the table in the Azure SQL database. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.table")
    private String table;

    /**
     * Max Batch count for write to Sql database, the default value is 10,000.
     * Optional on PUT requests.
     */
    @JsonProperty(value = "properties.maxBatchCount")
    private Double maxBatchCount;

    /**
     * Max Write r count, currently only 1(single writer) and 0(based on query
     * partition) are available. Optional on PUT requests.
     */
    @JsonProperty(value = "properties.maxWriterCount")
    private Double maxWriterCount;

    /**
     * Authentication Mode. Possible values include: 'Msi', 'UserToken',
     * 'ConnectionString'.
     */
    @JsonProperty(value = "properties.authenticationMode")
    private AuthenticationMode authenticationMode;

    /**
     * Get the name of the SQL server containing the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     *
     * @return the server value
     */
    public String server() {
        return this.server;
    }

    /**
     * Set the name of the SQL server containing the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     *
     * @param server the server value to set
     * @return the AzureSqlDatabaseOutputDataSource object itself.
     */
    public AzureSqlDatabaseOutputDataSource withServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * Get the name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     *
     * @return the database value
     */
    public String database() {
        return this.database;
    }

    /**
     * Set the name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     *
     * @param database the database value to set
     * @return the AzureSqlDatabaseOutputDataSource object itself.
     */
    public AzureSqlDatabaseOutputDataSource withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * Get the user name that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     *
     * @return the user value
     */
    public String user() {
        return this.user;
    }

    /**
     * Set the user name that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     *
     * @param user the user value to set
     * @return the AzureSqlDatabaseOutputDataSource object itself.
     */
    public AzureSqlDatabaseOutputDataSource withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get the password that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     *
     * @param password the password value to set
     * @return the AzureSqlDatabaseOutputDataSource object itself.
     */
    public AzureSqlDatabaseOutputDataSource withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the name of the table in the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     *
     * @return the table value
     */
    public String table() {
        return this.table;
    }

    /**
     * Set the name of the table in the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     *
     * @param table the table value to set
     * @return the AzureSqlDatabaseOutputDataSource object itself.
     */
    public AzureSqlDatabaseOutputDataSource withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Get max Batch count for write to Sql database, the default value is 10,000. Optional on PUT requests.
     *
     * @return the maxBatchCount value
     */
    public Double maxBatchCount() {
        return this.maxBatchCount;
    }

    /**
     * Set max Batch count for write to Sql database, the default value is 10,000. Optional on PUT requests.
     *
     * @param maxBatchCount the maxBatchCount value to set
     * @return the AzureSqlDatabaseOutputDataSource object itself.
     */
    public AzureSqlDatabaseOutputDataSource withMaxBatchCount(Double maxBatchCount) {
        this.maxBatchCount = maxBatchCount;
        return this;
    }

    /**
     * Get max Write r count, currently only 1(single writer) and 0(based on query partition) are available. Optional on PUT requests.
     *
     * @return the maxWriterCount value
     */
    public Double maxWriterCount() {
        return this.maxWriterCount;
    }

    /**
     * Set max Write r count, currently only 1(single writer) and 0(based on query partition) are available. Optional on PUT requests.
     *
     * @param maxWriterCount the maxWriterCount value to set
     * @return the AzureSqlDatabaseOutputDataSource object itself.
     */
    public AzureSqlDatabaseOutputDataSource withMaxWriterCount(Double maxWriterCount) {
        this.maxWriterCount = maxWriterCount;
        return this;
    }

    /**
     * Get authentication Mode. Possible values include: 'Msi', 'UserToken', 'ConnectionString'.
     *
     * @return the authenticationMode value
     */
    public AuthenticationMode authenticationMode() {
        return this.authenticationMode;
    }

    /**
     * Set authentication Mode. Possible values include: 'Msi', 'UserToken', 'ConnectionString'.
     *
     * @param authenticationMode the authenticationMode value to set
     * @return the AzureSqlDatabaseOutputDataSource object itself.
     */
    public AzureSqlDatabaseOutputDataSource withAuthenticationMode(AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }

}
