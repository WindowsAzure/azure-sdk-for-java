// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.azure.management.appservice.KeyVaultSecretStatus;

/**
 * The AppServiceCertificate model.
 */
@Fluent
public final class AppServiceCertificateInner {
    /*
     * Key Vault resource Id.
     */
    @JsonProperty(value = "keyVaultId")
    private String keyVaultId;

    /*
     * Key Vault secret name.
     */
    @JsonProperty(value = "keyVaultSecretName")
    private String keyVaultSecretName;

    /*
     * Status of the Key Vault secret.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private KeyVaultSecretStatus provisioningState;

    /**
     * Get the keyVaultId property: Key Vault resource Id.
     * 
     * @return the keyVaultId value.
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set the keyVaultId property: Key Vault resource Id.
     * 
     * @param keyVaultId the keyVaultId value to set.
     * @return the AppServiceCertificateInner object itself.
     */
    public AppServiceCertificateInner withKeyVaultId(String keyVaultId) {
        this.keyVaultId = keyVaultId;
        return this;
    }

    /**
     * Get the keyVaultSecretName property: Key Vault secret name.
     * 
     * @return the keyVaultSecretName value.
     */
    public String keyVaultSecretName() {
        return this.keyVaultSecretName;
    }

    /**
     * Set the keyVaultSecretName property: Key Vault secret name.
     * 
     * @param keyVaultSecretName the keyVaultSecretName value to set.
     * @return the AppServiceCertificateInner object itself.
     */
    public AppServiceCertificateInner withKeyVaultSecretName(String keyVaultSecretName) {
        this.keyVaultSecretName = keyVaultSecretName;
        return this;
    }

    /**
     * Get the provisioningState property: Status of the Key Vault secret.
     * 
     * @return the provisioningState value.
     */
    public KeyVaultSecretStatus provisioningState() {
        return this.provisioningState;
    }
}
