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
@JacksonXmlRootElement(localName = "cpk-info")
@Fluent
public final class CpkInfo {
    /*
     * Optional. Specifies the encryption key to use to encrypt the data
     * provided in the request. If not specified, encryption is performed with
     * the root account encryption key.  For more information, see Encryption
     * at Rest for Azure Storage Services.
     */
    @JsonProperty(value = "xMsEncryptionKey")
    private String xMsEncryptionKey;

    /*
     * The SHA-256 hash of the provided encryption key. Must be provided if the
     * x-ms-encryption-key header is provided.
     */
    @JsonProperty(value = "xMsEncryptionKeySha256")
    private String xMsEncryptionKeySha256;

    /*
     * The algorithm used to produce the encryption key hash. Currently, the
     * only accepted value is "AES256". Must be provided if the
     * x-ms-encryption-key header is provided. Possible values include:
     * 'AES256'
     */
    @JsonProperty(value = "xMsEncryptionAlgorithm")
    private EncryptionAlgorithmType xMsEncryptionAlgorithm;

    /**
     * Get the xMsEncryptionKey property: Optional. Specifies the encryption
     * key to use to encrypt the data provided in the request. If not
     * specified, encryption is performed with the root account encryption key.
     * For more information, see Encryption at Rest for Azure Storage Services.
     *
     * @return the xMsEncryptionKey value.
     */
    public String xMsEncryptionKey() {
        return this.xMsEncryptionKey;
    }

    /**
     * Set the xMsEncryptionKey property: Optional. Specifies the encryption
     * key to use to encrypt the data provided in the request. If not
     * specified, encryption is performed with the root account encryption key.
     * For more information, see Encryption at Rest for Azure Storage Services.
     *
     * @param xMsEncryptionKey the xMsEncryptionKey value to set.
     * @return the CpkInfo object itself.
     */
    public CpkInfo xMsEncryptionKey(String xMsEncryptionKey) {
        this.xMsEncryptionKey = xMsEncryptionKey;
        return this;
    }

    /**
     * Get the xMsEncryptionKeySha256 property: The SHA-256 hash of the
     * provided encryption key. Must be provided if the x-ms-encryption-key
     * header is provided.
     *
     * @return the xMsEncryptionKeySha256 value.
     */
    public String xMsEncryptionKeySha256() {
        return this.xMsEncryptionKeySha256;
    }

    /**
     * Set the xMsEncryptionKeySha256 property: The SHA-256 hash of the
     * provided encryption key. Must be provided if the x-ms-encryption-key
     * header is provided.
     *
     * @param xMsEncryptionKeySha256 the xMsEncryptionKeySha256 value to set.
     * @return the CpkInfo object itself.
     */
    public CpkInfo xMsEncryptionKeySha256(String xMsEncryptionKeySha256) {
        this.xMsEncryptionKeySha256 = xMsEncryptionKeySha256;
        return this;
    }

    /**
     * Get the xMsEncryptionAlgorithm property: The algorithm used to produce
     * the encryption key hash. Currently, the only accepted value is "AES256".
     * Must be provided if the x-ms-encryption-key header is provided. Possible
     * values include: 'AES256'.
     *
     * @return the xMsEncryptionAlgorithm value.
     */
    public EncryptionAlgorithmType xMsEncryptionAlgorithm() {
        return this.xMsEncryptionAlgorithm;
    }

    /**
     * Set the xMsEncryptionAlgorithm property: The algorithm used to produce
     * the encryption key hash. Currently, the only accepted value is "AES256".
     * Must be provided if the x-ms-encryption-key header is provided. Possible
     * values include: 'AES256'.
     *
     * @param xMsEncryptionAlgorithm the xMsEncryptionAlgorithm value to set.
     * @return the CpkInfo object itself.
     */
    public CpkInfo xMsEncryptionAlgorithm(EncryptionAlgorithmType xMsEncryptionAlgorithm) {
        this.xMsEncryptionAlgorithm = xMsEncryptionAlgorithm;
        return this;
    }
}
