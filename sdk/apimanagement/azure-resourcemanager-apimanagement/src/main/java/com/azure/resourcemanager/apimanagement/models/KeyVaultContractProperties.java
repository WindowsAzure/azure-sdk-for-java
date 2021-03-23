// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** KeyVault contract details. */
@Fluent
public final class KeyVaultContractProperties extends KeyVaultContractCreateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultContractProperties.class);

    /*
     * Last time sync and refresh status of secret from key vault.
     */
    @JsonProperty(value = "lastStatus")
    private KeyVaultLastAccessStatusContractProperties lastStatus;

    /**
     * Get the lastStatus property: Last time sync and refresh status of secret from key vault.
     *
     * @return the lastStatus value.
     */
    public KeyVaultLastAccessStatusContractProperties lastStatus() {
        return this.lastStatus;
    }

    /**
     * Set the lastStatus property: Last time sync and refresh status of secret from key vault.
     *
     * @param lastStatus the lastStatus value to set.
     * @return the KeyVaultContractProperties object itself.
     */
    public KeyVaultContractProperties withLastStatus(KeyVaultLastAccessStatusContractProperties lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KeyVaultContractProperties withSecretIdentifier(String secretIdentifier) {
        super.withSecretIdentifier(secretIdentifier);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KeyVaultContractProperties withIdentityClientId(String identityClientId) {
        super.withIdentityClientId(identityClientId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (lastStatus() != null) {
            lastStatus().validate();
        }
    }
}
