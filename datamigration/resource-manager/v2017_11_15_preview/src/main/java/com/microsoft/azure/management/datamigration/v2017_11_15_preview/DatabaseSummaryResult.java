/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Summary of database results in the migration.
 */
public class DatabaseSummaryResult extends DataItemMigrationSummaryResult {
    /**
     * Size of the database in megabytes.
     */
    @JsonProperty(value = "sizeMB", access = JsonProperty.Access.WRITE_ONLY)
    private Double sizeMB;

    /**
     * Get size of the database in megabytes.
     *
     * @return the sizeMB value
     */
    public Double sizeMB() {
        return this.sizeMB;
    }

}
