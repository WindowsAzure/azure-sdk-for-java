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
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.DatasetInner;

/**
 * Parquet dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Parquet")
@JsonFlatten
public class ParquetDataset extends DatasetInner {
    /**
     * The location of the parquet storage.
     */
    @JsonProperty(value = "typeProperties.location", required = true)
    private DatasetLocation location;

    /**
     * The compressionCodec property.
     */
    @JsonProperty(value = "typeProperties.compressionCodec")
    private Object compressionCodec;

    /**
     * Get the location of the parquet storage.
     *
     * @return the location value
     */
    public DatasetLocation location() {
        return this.location;
    }

    /**
     * Set the location of the parquet storage.
     *
     * @param location the location value to set
     * @return the ParquetDataset object itself.
     */
    public ParquetDataset withLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the compressionCodec value.
     *
     * @return the compressionCodec value
     */
    public Object compressionCodec() {
        return this.compressionCodec;
    }

    /**
     * Set the compressionCodec value.
     *
     * @param compressionCodec the compressionCodec value to set
     * @return the ParquetDataset object itself.
     */
    public ParquetDataset withCompressionCodec(Object compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }

}
