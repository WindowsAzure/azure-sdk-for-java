// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Linked service for MongoDB Atlas data source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MongoDbAtlas")
@JsonFlatten
@Fluent
public class MongoDbAtlasLinkedService extends LinkedService {
    /*
     * The MongoDB Atlas connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString", required = true)
    private Object connectionString;

    /*
     * The name of the MongoDB Atlas database that you want to access. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.database", required = true)
    private Object database;

    /**
     * Get the connectionString property: The MongoDB Atlas connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The MongoDB Atlas connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the MongoDbAtlasLinkedService object itself.
     */
    public MongoDbAtlasLinkedService setConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the database property: The name of the MongoDB Atlas database that you want to access. Type: string (or
     * Expression with resultType string).
     *
     * @return the database value.
     */
    public Object getDatabase() {
        return this.database;
    }

    /**
     * Set the database property: The name of the MongoDB Atlas database that you want to access. Type: string (or
     * Expression with resultType string).
     *
     * @param database the database value to set.
     * @return the MongoDbAtlasLinkedService object itself.
     */
    public MongoDbAtlasLinkedService setDatabase(Object database) {
        this.database = database;
        return this;
    }
}
