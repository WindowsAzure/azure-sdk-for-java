/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_02_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A class that contains database statistics information.
 */
public class DatabaseStatistics {
    /**
     * The database size - the total size of compressed data and index in
     * bytes.
     */
    @JsonProperty(value = "size")
    private Double size;

    /**
     * Get the database size - the total size of compressed data and index in bytes.
     *
     * @return the size value
     */
    public Double size() {
        return this.size;
    }

    /**
     * Set the database size - the total size of compressed data and index in bytes.
     *
     * @param size the size value to set
     * @return the DatabaseStatistics object itself.
     */
    public DatabaseStatistics withSize(Double size) {
        this.size = size;
        return this;
    }

}
