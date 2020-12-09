// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.models.StorageAccountKey;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response from the ListKeys operation. */
@Immutable
public final class StorageAccountListKeysResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageAccountListKeysResultInner.class);

    /*
     * Gets the list of storage account keys and their properties for the
     * specified storage account.
     */
    @JsonProperty(value = "keys", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageAccountKey> keys;

    /**
     * Get the keys property: Gets the list of storage account keys and their properties for the specified storage
     * account.
     *
     * @return the keys value.
     */
    public List<StorageAccountKey> keys() {
        return this.keys;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keys() != null) {
            keys().forEach(e -> e.validate());
        }
    }
}
