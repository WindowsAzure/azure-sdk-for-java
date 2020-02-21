/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * Linked service for PostgreSQL data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = PostgreSqlLinkedService.class)
@JsonTypeName("PostgreSql")
@JsonFlatten
public class PostgreSqlLinkedService extends LinkedServiceInner {
    /**
     * The connection string.
     */
    @JsonProperty(value = "typeProperties.connectionString", required = true)
    private SecretBase connectionString;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the connection string.
     *
     * @return the connectionString value
     */
    public SecretBase connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connection string.
     *
     * @param connectionString the connectionString value to set
     * @return the PostgreSqlLinkedService object itself.
     */
    public PostgreSqlLinkedService withConnectionString(SecretBase connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the PostgreSqlLinkedService object itself.
     */
    public PostgreSqlLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
