// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EncryptionProperty model. */
@Fluent
public final class EncryptionProperty {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncryptionProperty.class);

    /*
     * Indicates whether or not the encryption is enabled for the workspace.
     */
    @JsonProperty(value = "status", required = true)
    private EncryptionStatus status;

    /*
     * The identity that will be used to access the key vault for encryption at
     * rest.
     */
    @JsonProperty(value = "identity")
    private IdentityForCmk identity;

    /*
     * Customer Key vault properties.
     */
    @JsonProperty(value = "keyVaultProperties", required = true)
    private KeyVaultProperties keyVaultProperties;

    /**
     * Get the status property: Indicates whether or not the encryption is enabled for the workspace.
     *
     * @return the status value.
     */
    public EncryptionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Indicates whether or not the encryption is enabled for the workspace.
     *
     * @param status the status value to set.
     * @return the EncryptionProperty object itself.
     */
    public EncryptionProperty withStatus(EncryptionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the identity property: The identity that will be used to access the key vault for encryption at rest.
     *
     * @return the identity value.
     */
    public IdentityForCmk identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity that will be used to access the key vault for encryption at rest.
     *
     * @param identity the identity value to set.
     * @return the EncryptionProperty object itself.
     */
    public EncryptionProperty withIdentity(IdentityForCmk identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the keyVaultProperties property: Customer Key vault properties.
     *
     * @return the keyVaultProperties value.
     */
    public KeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: Customer Key vault properties.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the EncryptionProperty object itself.
     */
    public EncryptionProperty withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property status in model EncryptionProperty"));
        }
        if (identity() != null) {
            identity().validate();
        }
        if (keyVaultProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyVaultProperties in model EncryptionProperty"));
        } else {
            keyVaultProperties().validate();
        }
    }
}
