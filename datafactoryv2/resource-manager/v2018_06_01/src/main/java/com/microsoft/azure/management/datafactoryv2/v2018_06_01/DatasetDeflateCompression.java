/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The Deflate compression method used on a dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Deflate")
public class DatasetDeflateCompression extends DatasetCompression {
    /**
     * The Deflate compression level. Possible values include: 'Optimal',
     * 'Fastest'.
     */
    @JsonProperty(value = "level")
    private DatasetCompressionLevel level;

    /**
     * Get the Deflate compression level. Possible values include: 'Optimal', 'Fastest'.
     *
     * @return the level value
     */
    public DatasetCompressionLevel level() {
        return this.level;
    }

    /**
     * Set the Deflate compression level. Possible values include: 'Optimal', 'Fastest'.
     *
     * @param level the level value to set
     * @return the DatasetDeflateCompression object itself.
     */
    public DatasetDeflateCompression withLevel(DatasetCompressionLevel level) {
        this.level = level;
        return this;
    }

}
