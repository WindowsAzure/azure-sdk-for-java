// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The storage account update parameters.
 */
public class StorageAccountUpdateParameters {
    /**
     * The current active storage account key name.
     */
    @JsonProperty(value = "activeKeyName")
    private String activeKeyName;

    /**
     * whether keyvault should manage the storage account for the user.
     */
    @JsonProperty(value = "autoRegenerateKey")
    private Boolean autoRegenerateKey;

    /**
     * The key regeneration time duration specified in ISO-8601 format.
     */
    @JsonProperty(value = "regenerationPeriod")
    private String regenerationPeriod;

    /**
     * The attributes of the storage account.
     */
    @JsonProperty(value = "attributes")
    private StorageAccountAttributes storageAccountAttributes;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the activeKeyName value.
     *
     * @return the activeKeyName value
     */
    public String activeKeyName() {
        return this.activeKeyName;
    }

    /**
     * Set the activeKeyName value.
     *
     * @param activeKeyName the activeKeyName value to set
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withActiveKeyName(String activeKeyName) {
        this.activeKeyName = activeKeyName;
        return this;
    }

    /**
     * Get the autoRegenerateKey value.
     *
     * @return the autoRegenerateKey value
     */
    public Boolean autoRegenerateKey() {
        return this.autoRegenerateKey;
    }

    /**
     * Set the autoRegenerateKey value.
     *
     * @param autoRegenerateKey the autoRegenerateKey value to set
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withAutoRegenerateKey(Boolean autoRegenerateKey) {
        this.autoRegenerateKey = autoRegenerateKey;
        return this;
    }

    /**
     * Get the regenerationPeriod value.
     *
     * @return the regenerationPeriod value
     */
    public String regenerationPeriod() {
        return this.regenerationPeriod;
    }

    /**
     * Set the regenerationPeriod value.
     *
     * @param regenerationPeriod the regenerationPeriod value to set
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withRegenerationPeriod(String regenerationPeriod) {
        this.regenerationPeriod = regenerationPeriod;
        return this;
    }

    /**
     * Get the storageAccountAttributes value.
     *
     * @return the storageAccountAttributes value
     */
    public StorageAccountAttributes storageAccountAttributes() {
        return this.storageAccountAttributes;
    }

    /**
     * Set the storageAccountAttributes value.
     *
     * @param storageAccountAttributes the storageAccountAttributes value to set
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withStorageAccountAttributes(StorageAccountAttributes storageAccountAttributes) {
        this.storageAccountAttributes = storageAccountAttributes;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the StorageAccountUpdateParameters object itself.
     */
    public StorageAccountUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
