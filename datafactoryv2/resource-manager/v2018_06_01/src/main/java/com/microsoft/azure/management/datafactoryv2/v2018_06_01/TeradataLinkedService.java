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
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Linked service for Teradata data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Teradata")
@JsonFlatten
public class TeradataLinkedService extends LinkedServiceInner {
    /**
     * Teradata ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString")
    private Object connectionString;

    /**
     * Server name for connection. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.server", required = true)
    private Object server;

    /**
     * AuthenticationType to be used for connection. Possible values include:
     * 'Basic', 'Windows'.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private TeradataAuthenticationType authenticationType;

    /**
     * Username for authentication. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /**
     * Password for authentication.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get teradata ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set teradata ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set
     * @return the TeradataLinkedService object itself.
     */
    public TeradataLinkedService withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get server name for connection. Type: string (or Expression with resultType string).
     *
     * @return the server value
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set server name for connection. Type: string (or Expression with resultType string).
     *
     * @param server the server value to set
     * @return the TeradataLinkedService object itself.
     */
    public TeradataLinkedService withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get authenticationType to be used for connection. Possible values include: 'Basic', 'Windows'.
     *
     * @return the authenticationType value
     */
    public TeradataAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set authenticationType to be used for connection. Possible values include: 'Basic', 'Windows'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the TeradataLinkedService object itself.
     */
    public TeradataLinkedService withAuthenticationType(TeradataAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get username for authentication. Type: string (or Expression with resultType string).
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set username for authentication. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set
     * @return the TeradataLinkedService object itself.
     */
    public TeradataLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get password for authentication.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password for authentication.
     *
     * @param password the password value to set
     * @return the TeradataLinkedService object itself.
     */
    public TeradataLinkedService withPassword(SecretBase password) {
        this.password = password;
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
     * @return the TeradataLinkedService object itself.
     */
    public TeradataLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
