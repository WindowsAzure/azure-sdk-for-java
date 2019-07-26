/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * Linked service for Cassandra data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Cassandra")
@JsonFlatten
public class CassandraLinkedService extends LinkedServiceInner {
    /**
     * Host name for connection. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /**
     * AuthenticationType to be used for connection. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private Object authenticationType;

    /**
     * The port for the connection. Type: integer (or Expression with
     * resultType integer).
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

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
     * Get host name for connection. Type: string (or Expression with resultType string).
     *
     * @return the host value
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set host name for connection. Type: string (or Expression with resultType string).
     *
     * @param host the host value to set
     * @return the CassandraLinkedService object itself.
     */
    public CassandraLinkedService withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get authenticationType to be used for connection. Type: string (or Expression with resultType string).
     *
     * @return the authenticationType value
     */
    public Object authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set authenticationType to be used for connection. Type: string (or Expression with resultType string).
     *
     * @param authenticationType the authenticationType value to set
     * @return the CassandraLinkedService object itself.
     */
    public CassandraLinkedService withAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the port for the connection. Type: integer (or Expression with resultType integer).
     *
     * @return the port value
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port for the connection. Type: integer (or Expression with resultType integer).
     *
     * @param port the port value to set
     * @return the CassandraLinkedService object itself.
     */
    public CassandraLinkedService withPort(Object port) {
        this.port = port;
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
     * @return the CassandraLinkedService object itself.
     */
    public CassandraLinkedService withUsername(Object username) {
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
     * @return the CassandraLinkedService object itself.
     */
    public CassandraLinkedService withPassword(SecretBase password) {
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
     * @return the CassandraLinkedService object itself.
     */
    public CassandraLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
