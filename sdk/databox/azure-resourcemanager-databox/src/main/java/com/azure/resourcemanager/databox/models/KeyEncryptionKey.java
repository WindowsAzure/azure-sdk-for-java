// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Encryption key containing details about key to encrypt different keys. */
@Fluent
public final class KeyEncryptionKey {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyEncryptionKey.class);

    /*
     * Type of encryption key used for key encryption.
     */
    @JsonProperty(value = "kekType", required = true)
    private KekType kekType;

    /*
     * Managed identity properties used for key encryption.
     */
    @JsonProperty(value = "identityProperties")
    private IdentityProperties identityProperties;

    /*
     * Key encryption key. It is required in case of Customer managed KekType.
     */
    @JsonProperty(value = "kekUrl")
    private String kekUrl;

    /*
     * Kek vault resource id. It is required in case of Customer managed
     * KekType.
     */
    @JsonProperty(value = "kekVaultResourceID")
    private String kekVaultResourceId;

    /**
     * Get the kekType property: Type of encryption key used for key encryption.
     *
     * @return the kekType value.
     */
    public KekType kekType() {
        return this.kekType;
    }

    /**
     * Set the kekType property: Type of encryption key used for key encryption.
     *
     * @param kekType the kekType value to set.
     * @return the KeyEncryptionKey object itself.
     */
    public KeyEncryptionKey withKekType(KekType kekType) {
        this.kekType = kekType;
        return this;
    }

    /**
     * Get the identityProperties property: Managed identity properties used for key encryption.
     *
     * @return the identityProperties value.
     */
    public IdentityProperties identityProperties() {
        return this.identityProperties;
    }

    /**
     * Set the identityProperties property: Managed identity properties used for key encryption.
     *
     * @param identityProperties the identityProperties value to set.
     * @return the KeyEncryptionKey object itself.
     */
    public KeyEncryptionKey withIdentityProperties(IdentityProperties identityProperties) {
        this.identityProperties = identityProperties;
        return this;
    }

    /**
     * Get the kekUrl property: Key encryption key. It is required in case of Customer managed KekType.
     *
     * @return the kekUrl value.
     */
    public String kekUrl() {
        return this.kekUrl;
    }

    /**
     * Set the kekUrl property: Key encryption key. It is required in case of Customer managed KekType.
     *
     * @param kekUrl the kekUrl value to set.
     * @return the KeyEncryptionKey object itself.
     */
    public KeyEncryptionKey withKekUrl(String kekUrl) {
        this.kekUrl = kekUrl;
        return this;
    }

    /**
     * Get the kekVaultResourceId property: Kek vault resource id. It is required in case of Customer managed KekType.
     *
     * @return the kekVaultResourceId value.
     */
    public String kekVaultResourceId() {
        return this.kekVaultResourceId;
    }

    /**
     * Set the kekVaultResourceId property: Kek vault resource id. It is required in case of Customer managed KekType.
     *
     * @param kekVaultResourceId the kekVaultResourceId value to set.
     * @return the KeyEncryptionKey object itself.
     */
    public KeyEncryptionKey withKekVaultResourceId(String kekVaultResourceId) {
        this.kekVaultResourceId = kekVaultResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (kekType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property kekType in model KeyEncryptionKey"));
        }
        if (identityProperties() != null) {
            identityProperties().validate();
        }
    }
}
