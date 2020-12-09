// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An access key for the storage account. */
@Immutable
public final class StorageAccountKey {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageAccountKey.class);

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
    public String keyName() {
        return this.keyName;
    }

    /**
     * Get the value property: Base 64-encoded value of the key.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Get the permissions property: Permissions for the key -- read-only or full permissions.
     *
     * @return the permissions value.
     */
    public KeyPermission permissions() {
        return this.permissions;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
