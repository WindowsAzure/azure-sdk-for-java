// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Additional parameters for a set of operations.
 */
@JacksonXmlRootElement(localName = "customer-provided-key-info")
@Fluent
public final class CustomerProvidedKeyInfo {
    /*
     * Optional. Specifies the encryption scope to use to encrypt the data
     * provided in the request. If not specified, encryption is performed with
     * the root account encryption key.  For more information, see Encryption
     * at Rest for Azure Storage Services.
     */
    @JsonProperty(value = "encryptionScope")
    private String encryptionScope;

    /**
     * Get the encryptionScope property: Optional. Specifies the encryption
     * scope to use to encrypt the data provided in the request. If not
     * specified, encryption is performed with the root account encryption key.
     * For more information, see Encryption at Rest for Azure Storage Services.
     *
     * @return the encryptionScope value.
     */
    public String encryptionScope() {
        return this.encryptionScope;
    }

    /**
     * Set the encryptionScope property: Optional. Specifies the encryption
     * scope to use to encrypt the data provided in the request. If not
     * specified, encryption is performed with the root account encryption key.
     * For more information, see Encryption at Rest for Azure Storage Services.
     *
     * @param encryptionScope the encryptionScope value to set.
     * @return the CustomerProvidedKeyInfo object itself.
     */
    public CustomerProvidedKeyInfo encryptionScope(String encryptionScope) {
        this.encryptionScope = encryptionScope;
        return this;
    }
}
