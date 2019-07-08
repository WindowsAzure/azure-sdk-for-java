/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VMwareCbt container mapping input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VMwareCbt")
public class VMwareCbtContainerMappingInput extends ReplicationProviderSpecificContainerMappingInput {
    /**
     * The target key vault ARM Id.
     */
    @JsonProperty(value = "keyVaultId", required = true)
    private String keyVaultId;

    /**
     * The target key vault URL.
     */
    @JsonProperty(value = "keyVaultUri", required = true)
    private String keyVaultUri;

    /**
     * The storage account ARM Id.
     */
    @JsonProperty(value = "storageAccountId", required = true)
    private String storageAccountId;

    /**
     * The secret name of the storage account.
     */
    @JsonProperty(value = "storageAccountSasSecretName", required = true)
    private String storageAccountSasSecretName;

    /**
     * The secret name of the service bus connection string.
     */
    @JsonProperty(value = "serviceBusConnectionStringSecretName", required = true)
    private String serviceBusConnectionStringSecretName;

    /**
     * The target location.
     */
    @JsonProperty(value = "targetLocation", required = true)
    private String targetLocation;

    /**
     * Get the target key vault ARM Id.
     *
     * @return the keyVaultId value
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set the target key vault ARM Id.
     *
     * @param keyVaultId the keyVaultId value to set
     * @return the VMwareCbtContainerMappingInput object itself.
     */
    public VMwareCbtContainerMappingInput withKeyVaultId(String keyVaultId) {
        this.keyVaultId = keyVaultId;
        return this;
    }

    /**
     * Get the target key vault URL.
     *
     * @return the keyVaultUri value
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the target key vault URL.
     *
     * @param keyVaultUri the keyVaultUri value to set
     * @return the VMwareCbtContainerMappingInput object itself.
     */
    public VMwareCbtContainerMappingInput withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

    /**
     * Get the storage account ARM Id.
     *
     * @return the storageAccountId value
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the storage account ARM Id.
     *
     * @param storageAccountId the storageAccountId value to set
     * @return the VMwareCbtContainerMappingInput object itself.
     */
    public VMwareCbtContainerMappingInput withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Get the secret name of the storage account.
     *
     * @return the storageAccountSasSecretName value
     */
    public String storageAccountSasSecretName() {
        return this.storageAccountSasSecretName;
    }

    /**
     * Set the secret name of the storage account.
     *
     * @param storageAccountSasSecretName the storageAccountSasSecretName value to set
     * @return the VMwareCbtContainerMappingInput object itself.
     */
    public VMwareCbtContainerMappingInput withStorageAccountSasSecretName(String storageAccountSasSecretName) {
        this.storageAccountSasSecretName = storageAccountSasSecretName;
        return this;
    }

    /**
     * Get the secret name of the service bus connection string.
     *
     * @return the serviceBusConnectionStringSecretName value
     */
    public String serviceBusConnectionStringSecretName() {
        return this.serviceBusConnectionStringSecretName;
    }

    /**
     * Set the secret name of the service bus connection string.
     *
     * @param serviceBusConnectionStringSecretName the serviceBusConnectionStringSecretName value to set
     * @return the VMwareCbtContainerMappingInput object itself.
     */
    public VMwareCbtContainerMappingInput withServiceBusConnectionStringSecretName(String serviceBusConnectionStringSecretName) {
        this.serviceBusConnectionStringSecretName = serviceBusConnectionStringSecretName;
        return this;
    }

    /**
     * Get the target location.
     *
     * @return the targetLocation value
     */
    public String targetLocation() {
        return this.targetLocation;
    }

    /**
     * Set the target location.
     *
     * @param targetLocation the targetLocation value to set
     * @return the VMwareCbtContainerMappingInput object itself.
     */
    public VMwareCbtContainerMappingInput withTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
        return this;
    }

}
