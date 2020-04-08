// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RecoverableManagedDatabase model. */
@JsonFlatten
@Immutable
public class RecoverableManagedDatabaseInner extends ProxyResource {
    /*
     * The last available backup date.
     */
    @JsonProperty(value = "properties.lastAvailableBackupDate", access = JsonProperty.Access.WRITE_ONLY)
    private String lastAvailableBackupDate;

    /**
     * Get the lastAvailableBackupDate property: The last available backup date.
     *
     * @return the lastAvailableBackupDate value.
     */
    public String lastAvailableBackupDate() {
        return this.lastAvailableBackupDate;
    }
}
