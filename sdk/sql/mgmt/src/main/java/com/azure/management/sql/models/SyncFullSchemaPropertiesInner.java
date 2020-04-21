// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Immutable;
import com.azure.management.sql.SyncFullSchemaTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The SyncFullSchemaProperties model. */
@Immutable
public final class SyncFullSchemaPropertiesInner {
    /*
     * List of tables in the database full schema.
     */
    @JsonProperty(value = "tables", access = JsonProperty.Access.WRITE_ONLY)
    private List<SyncFullSchemaTable> tables;

    /*
     * Last update time of the database schema.
     */
    @JsonProperty(value = "lastUpdateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdateTime;

    /**
     * Get the tables property: List of tables in the database full schema.
     *
     * @return the tables value.
     */
    public List<SyncFullSchemaTable> tables() {
        return this.tables;
    }

    /**
     * Get the lastUpdateTime property: Last update time of the database schema.
     *
     * @return the lastUpdateTime value.
     */
    public OffsetDateTime lastUpdateTime() {
        return this.lastUpdateTime;
    }
}
