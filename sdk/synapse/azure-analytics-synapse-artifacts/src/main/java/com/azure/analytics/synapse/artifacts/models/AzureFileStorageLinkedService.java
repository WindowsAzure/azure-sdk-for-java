// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure File Storage linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureFileStorage")
@JsonFlatten
@Fluent
public class AzureFileStorageLinkedService extends LinkedService {
    /*
     * Host name of the server. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /*
     * User ID to logon the server. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.userId")
    private Object userId;

    /*
     * Password to logon the server.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the host property: Host name of the server. Type: string (or Expression with resultType string).
     *
     * @return the host value.
     */
    public Object getHost() {
        return this.host;
    }

    /**
     * Set the host property: Host name of the server. Type: string (or Expression with resultType string).
     *
     * @param host the host value to set.
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService setHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the userId property: User ID to logon the server. Type: string (or Expression with resultType string).
     *
     * @return the userId value.
     */
    public Object getUserId() {
        return this.userId;
    }

    /**
     * Set the userId property: User ID to logon the server. Type: string (or Expression with resultType string).
     *
     * @param userId the userId value to set.
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService setUserId(Object userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the password property: Password to logon the server.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password to logon the server.
     *
     * @param password the password value to set.
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureFileStorageLinkedService object itself.
     */
    public AzureFileStorageLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
