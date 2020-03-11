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
 * Linked service for DB2 data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = Db2LinkedService.class)
@JsonTypeName("Db2")
@JsonFlatten
public class Db2LinkedService extends LinkedServiceInner {
    /**
     * The connection string. It is mutually exclusive with server, database,
     * authenticationType, userName, packageCollection and
     * certificateCommonName property. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString")
    private Object connectionString;

    /**
     * Server name for connection. It is mutually exclusive with
     * connectionString property. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.server")
    private Object server;

    /**
     * Database name for connection. It is mutually exclusive with
     * connectionString property. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.database")
    private Object database;

    /**
     * AuthenticationType to be used for connection. It is mutually exclusive
     * with connectionString property. Possible values include: 'Basic'.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private Db2AuthenticationType authenticationType;

    /**
     * Username for authentication. It is mutually exclusive with
     * connectionString property. Type: string (or Expression with resultType
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
     * Under where packages are created when querying database. It is mutually
     * exclusive with connectionString property. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.packageCollection")
    private Object packageCollection;

    /**
     * Certificate Common Name when TLS is enabled. It is mutually exclusive
     * with connectionString property. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.certificateCommonName")
    private Object certificateCommonName;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. It is
     * mutually exclusive with connectionString property. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the connection string. It is mutually exclusive with server, database, authenticationType, userName, packageCollection and certificateCommonName property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connection string. It is mutually exclusive with server, database, authenticationType, userName, packageCollection and certificateCommonName property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get server name for connection. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     *
     * @return the server value
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set server name for connection. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     *
     * @param server the server value to set
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get database name for connection. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     *
     * @return the database value
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set database name for connection. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     *
     * @param database the database value to set
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get authenticationType to be used for connection. It is mutually exclusive with connectionString property. Possible values include: 'Basic'.
     *
     * @return the authenticationType value
     */
    public Db2AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set authenticationType to be used for connection. It is mutually exclusive with connectionString property. Possible values include: 'Basic'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withAuthenticationType(Db2AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get username for authentication. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set username for authentication. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withUsername(Object username) {
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
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get under where packages are created when querying database. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     *
     * @return the packageCollection value
     */
    public Object packageCollection() {
        return this.packageCollection;
    }

    /**
     * Set under where packages are created when querying database. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     *
     * @param packageCollection the packageCollection value to set
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withPackageCollection(Object packageCollection) {
        this.packageCollection = packageCollection;
        return this;
    }

    /**
     * Get certificate Common Name when TLS is enabled. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     *
     * @return the certificateCommonName value
     */
    public Object certificateCommonName() {
        return this.certificateCommonName;
    }

    /**
     * Set certificate Common Name when TLS is enabled. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     *
     * @param certificateCommonName the certificateCommonName value to set
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withCertificateCommonName(Object certificateCommonName) {
        this.certificateCommonName = certificateCommonName;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
