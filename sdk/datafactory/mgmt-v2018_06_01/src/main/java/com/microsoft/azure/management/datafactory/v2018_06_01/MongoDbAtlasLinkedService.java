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
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Linked service for MongoDB Atlas data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = MongoDbAtlasLinkedService.class)
@JsonTypeName("MongoDbAtlas")
@JsonFlatten
public class MongoDbAtlasLinkedService extends LinkedServiceInner {
    /**
     * The MongoDB Atlas connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString", required = true)
    private Object connectionString;

    /**
     * The name of the MongoDB Atlas database that you want to access. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.database", required = true)
    private Object database;

    /**
     * Get the MongoDB Atlas connection string. Type: string, SecureString or AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the MongoDB Atlas connection string. Type: string, SecureString or AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set
     * @return the MongoDbAtlasLinkedService object itself.
     */
    public MongoDbAtlasLinkedService withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the name of the MongoDB Atlas database that you want to access. Type: string (or Expression with resultType string).
     *
     * @return the database value
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the name of the MongoDB Atlas database that you want to access. Type: string (or Expression with resultType string).
     *
     * @param database the database value to set
     * @return the MongoDbAtlasLinkedService object itself.
     */
    public MongoDbAtlasLinkedService withDatabase(Object database) {
        this.database = database;
        return this;
    }

}
