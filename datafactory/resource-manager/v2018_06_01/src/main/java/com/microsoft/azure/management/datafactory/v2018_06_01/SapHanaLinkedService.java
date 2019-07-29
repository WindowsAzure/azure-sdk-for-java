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
 * SAP HANA Linked Service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapHana")
@JsonFlatten
public class SapHanaLinkedService extends LinkedServiceInner {
    /**
     * SAP HANA ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString")
    private Object connectionString;

    /**
     * Host name of the SAP HANA server. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.server", required = true)
    private Object server;

    /**
     * The authentication type to be used to connect to the SAP HANA server.
     * Possible values include: 'Basic', 'Windows'.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private SapHanaAuthenticationType authenticationType;

    /**
     * Username to access the SAP HANA server. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /**
     * Password to access the SAP HANA server.
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
     * Get sAP HANA ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set sAP HANA ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set
     * @return the SapHanaLinkedService object itself.
     */
    public SapHanaLinkedService withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get host name of the SAP HANA server. Type: string (or Expression with resultType string).
     *
     * @return the server value
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set host name of the SAP HANA server. Type: string (or Expression with resultType string).
     *
     * @param server the server value to set
     * @return the SapHanaLinkedService object itself.
     */
    public SapHanaLinkedService withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the authentication type to be used to connect to the SAP HANA server. Possible values include: 'Basic', 'Windows'.
     *
     * @return the authenticationType value
     */
    public SapHanaAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authentication type to be used to connect to the SAP HANA server. Possible values include: 'Basic', 'Windows'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the SapHanaLinkedService object itself.
     */
    public SapHanaLinkedService withAuthenticationType(SapHanaAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get username to access the SAP HANA server. Type: string (or Expression with resultType string).
     *
     * @return the userName value
     */
    public Object userName() {
        return this.userName;
    }

    /**
     * Set username to access the SAP HANA server. Type: string (or Expression with resultType string).
     *
     * @param userName the userName value to set
     * @return the SapHanaLinkedService object itself.
     */
    public SapHanaLinkedService withUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get password to access the SAP HANA server.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password to access the SAP HANA server.
     *
     * @param password the password value to set
     * @return the SapHanaLinkedService object itself.
     */
    public SapHanaLinkedService withPassword(SecretBase password) {
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
     * @return the SapHanaLinkedService object itself.
     */
    public SapHanaLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
