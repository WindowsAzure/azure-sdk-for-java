// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The StorageAccountKey model.
 */
@Immutable
public final class StorageAccountKey {
    /*
     * Name of the key.
     */
    @JsonProperty(value = "keyName", access = JsonProperty.Access.WRITE_ONLY)
    private String keyName;

    /*
     * Base 64-encoded value of the key.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /*
     * Permissions for the key -- read-only or full permissions.
     */
    @JsonProperty(value = "permissions", access = JsonProperty.Access.WRITE_ONLY)
    private KeyPermission permissions;

    /**
     * Get the keyName property: Name of the key.
     * 
     * @return the keyName value.
     */
    public String getKeyName() {
        return this.keyName;
    }

    /**
     * Get the value property: Base 64-encoded value of the key.
     * 
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Get the permissions property: Permissions for the key -- read-only or
     * full permissions.
     * 
     * @return the permissions value.
     */
    public KeyPermission getPermissions() {
        return this.permissions;
    }
}
