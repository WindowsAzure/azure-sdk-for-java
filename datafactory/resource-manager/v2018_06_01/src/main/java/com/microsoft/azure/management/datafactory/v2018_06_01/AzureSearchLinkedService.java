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
 * Linked service for Windows Azure Search Service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureSearch")
@JsonFlatten
public class AzureSearchLinkedService extends LinkedServiceInner {
    /**
     * URL for Azure Search service. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /**
     * Admin Key for Azure Search service.
     */
    @JsonProperty(value = "typeProperties.key")
    private SecretBase key;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get uRL for Azure Search service. Type: string (or Expression with resultType string).
     *
     * @return the url value
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set uRL for Azure Search service. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set
     * @return the AzureSearchLinkedService object itself.
     */
    public AzureSearchLinkedService withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get admin Key for Azure Search service.
     *
     * @return the key value
     */
    public SecretBase key() {
        return this.key;
    }

    /**
     * Set admin Key for Azure Search service.
     *
     * @param key the key value to set
     * @return the AzureSearchLinkedService object itself.
     */
    public AzureSearchLinkedService withKey(SecretBase key) {
        this.key = key;
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
     * @return the AzureSearchLinkedService object itself.
     */
    public AzureSearchLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
