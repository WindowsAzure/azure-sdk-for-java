// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.inner;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Table model. */
@JsonFlatten
@Immutable
public class TableInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TableInner.class);

    /*
     * Table name under the specified account
     */
    @JsonProperty(value = "properties.tableName", access = JsonProperty.Access.WRITE_ONLY)
    private String tableName;

    /**
     * Get the tableName property: Table name under the specified account.
     *
     * @return the tableName value.
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
