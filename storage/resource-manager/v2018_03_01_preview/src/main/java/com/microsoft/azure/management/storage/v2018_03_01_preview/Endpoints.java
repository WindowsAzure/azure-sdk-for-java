/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The URIs that are used to perform a retrieval of a public blob, queue, or
 * table object.
 */
public class Endpoints {
    /**
     * Gets the blob endpoint.
     */
    @JsonProperty(value = "blob", access = JsonProperty.Access.WRITE_ONLY)
    private String blob;

    /**
     * Gets the queue endpoint.
     */
    @JsonProperty(value = "queue", access = JsonProperty.Access.WRITE_ONLY)
    private String queue;

    /**
     * Gets the table endpoint.
     */
    @JsonProperty(value = "table", access = JsonProperty.Access.WRITE_ONLY)
    private String table;

    /**
     * Gets the file endpoint.
     */
    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)
    private String file;

    /**
     * Get the blob value.
     *
     * @return the blob value
     */
    public String blob() {
        return this.blob;
    }

    /**
     * Get the queue value.
     *
     * @return the queue value
     */
    public String queue() {
        return this.queue;
    }

    /**
     * Get the table value.
     *
     * @return the table value
     */
    public String table() {
        return this.table;
    }

    /**
     * Get the file value.
     *
     * @return the file value
     */
    public String file() {
        return this.file;
    }

}
