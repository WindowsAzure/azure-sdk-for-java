// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Linked service for Windows Azure Search Service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureSearch")
@JsonFlatten
@Fluent
public class AzureSearchLinkedService extends LinkedService {
    /*
     * URL for Azure Search service. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /*
     * Admin Key for Azure Search service
     */
    @JsonProperty(value = "typeProperties.key")
    private SecretBase key;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the url property: URL for Azure Search service. Type: string (or Expression with resultType string).
     *
     * @return the url value.
     */
    public Object getUrl() {
        return this.url;
    }

    /**
     * Set the url property: URL for Azure Search service. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set.
     * @return the AzureSearchLinkedService object itself.
     */
    public AzureSearchLinkedService setUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the key property: Admin Key for Azure Search service.
     *
     * @return the key value.
     */
    public SecretBase getKey() {
        return this.key;
    }

    /**
     * Set the key property: Admin Key for Azure Search service.
     *
     * @param key the key value to set.
     * @return the AzureSearchLinkedService object itself.
     */
    public AzureSearchLinkedService setKey(SecretBase key) {
        this.key = key;
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
     * @return the AzureSearchLinkedService object itself.
     */
    public AzureSearchLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
