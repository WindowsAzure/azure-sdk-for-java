/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for redis import operation.
 */
public class ImportRDBParametersInner {
    /**
     * File format.
     */
    private String format;

    /**
     * files to import.
     */
    @JsonProperty(required = true)
    private List<String> files;

    /**
     * Get the format value.
     *
     * @return the format value
     */
    public String format() {
        return this.format;
    }

    /**
     * Set the format value.
     *
     * @param format the format value to set
     * @return the ImportRDBParametersInner object itself.
     */
    public ImportRDBParametersInner withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Get the files value.
     *
     * @return the files value
     */
    public List<String> files() {
        return this.files;
    }

    /**
     * Set the files value.
     *
     * @param files the files value to set
     * @return the ImportRDBParametersInner object itself.
     */
    public ImportRDBParametersInner withFiles(List<String> files) {
        this.files = files;
        return this;
    }

}
