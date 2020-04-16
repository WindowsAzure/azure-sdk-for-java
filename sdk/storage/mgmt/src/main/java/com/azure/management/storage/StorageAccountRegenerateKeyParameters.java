// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The StorageAccountRegenerateKeyParameters model. */
@Fluent
public final class StorageAccountRegenerateKeyParameters {
    /*
     * The name of storage keys that want to be regenerated, possible values
     * are key1, key2, kerb1, kerb2.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /**
     * Get the keyName property: The name of storage keys that want to be regenerated, possible values are key1, key2,
     * kerb1, kerb2.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The name of storage keys that want to be regenerated, possible values are key1, key2,
     * kerb1, kerb2.
     *
     * @param keyName the keyName value to set.
     * @return the StorageAccountRegenerateKeyParameters object itself.
     */
    public StorageAccountRegenerateKeyParameters withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
}
