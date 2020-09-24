// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.fluent.inner.BlobServicePropertiesInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The BlobServiceItems model. */
@Immutable
public final class BlobServiceItems {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobServiceItems.class);

    /*
     * List of blob services returned.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<BlobServicePropertiesInner> value;

    /**
     * Get the value property: List of blob services returned.
     *
     * @return the value value.
     */
    public List<BlobServicePropertiesInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
