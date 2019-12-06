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
 * Open Database Connectivity (ODBC) linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = OdbcLinkedService.class)
@JsonTypeName("Odbc")
@JsonFlatten
public class OdbcLinkedService extends LinkedServiceInner {
    /**
     * The non-access credential portion of the connection string as well as an
     * optional encrypted credential. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString", required = true)
    private Object connectionString;

    /**
     * Type of authentication used to connect to the ODBC data store. Possible
     * values are: Anonymous and Basic. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private Object authenticationType;

    /**
     * The access credential portion of the connection string specified in
     * driver-specific property-value format.
     */
    @JsonProperty(value = "typeProperties.credential")
    private SecretBase credential;

    /**
     * User name for Basic authentication. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /**
     * Password for Basic authentication.
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
     * Get the non-access credential portion of the connection string as well as an optional encrypted credential. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the non-access credential portion of the connection string as well as an optional encrypted credential. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set
     * @return the OdbcLinkedService object itself.
     */
    public OdbcLinkedService withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get type of authentication used to connect to the ODBC data store. Possible values are: Anonymous and Basic. Type: string (or Expression with resultType string).
     *
     * @return the authenticationType value
     */
    public Object authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set type of authentication used to connect to the ODBC data store. Possible values are: Anonymous and Basic. Type: string (or Expression with resultType string).
     *
     * @param authenticationType the authenticationType value to set
     * @return the OdbcLinkedService object itself.
     */
    public OdbcLinkedService withAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the access credential portion of the connection string specified in driver-specific property-value format.
     *
     * @return the credential value
     */
    public SecretBase credential() {
        return this.credential;
    }

    /**
     * Set the access credential portion of the connection string specified in driver-specific property-value format.
     *
     * @param credential the credential value to set
     * @return the OdbcLinkedService object itself.
     */
    public OdbcLinkedService withCredential(SecretBase credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Get user name for Basic authentication. Type: string (or Expression with resultType string).
     *
     * @return the userName value
     */
    public Object userName() {
        return this.userName;
    }

    /**
     * Set user name for Basic authentication. Type: string (or Expression with resultType string).
     *
     * @param userName the userName value to set
     * @return the OdbcLinkedService object itself.
     */
    public OdbcLinkedService withUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get password for Basic authentication.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password for Basic authentication.
     *
     * @param password the password value to set
     * @return the OdbcLinkedService object itself.
     */
    public OdbcLinkedService withPassword(SecretBase password) {
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
     * @return the OdbcLinkedService object itself.
     */
    public OdbcLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
