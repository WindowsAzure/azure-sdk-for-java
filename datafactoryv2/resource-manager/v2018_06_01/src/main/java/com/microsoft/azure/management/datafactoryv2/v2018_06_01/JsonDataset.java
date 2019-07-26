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
 * Json dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Json")
@JsonFlatten
public class JsonDataset extends DatasetInner {
    /**
     * The location of the json data storage.
     */
    @JsonProperty(value = "typeProperties.location", required = true)
    private DatasetLocation location;

    /**
     * The code page name of the preferred encoding. If not specified, the
     * default value is UTF-8, unless BOM denotes another Unicode encoding.
     * Refer to the name column of the table in the following link to set
     * supported values:
     * https://msdn.microsoft.com/library/system.text.encoding.aspx. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encodingName")
    private Object encodingName;

    /**
     * The data compression method used for the json dataset.
     */
    @JsonProperty(value = "typeProperties.compression")
    private DatasetCompression compression;

    /**
     * Get the location of the json data storage.
     *
     * @return the location value
     */
    public DatasetLocation location() {
        return this.location;
    }

    /**
     * Set the location of the json data storage.
     *
     * @param location the location value to set
     * @return the JsonDataset object itself.
     */
    public JsonDataset withLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the code page name of the preferred encoding. If not specified, the default value is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     *
     * @return the encodingName value
     */
    public Object encodingName() {
        return this.encodingName;
    }

    /**
     * Set the code page name of the preferred encoding. If not specified, the default value is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     *
     * @param encodingName the encodingName value to set
     * @return the JsonDataset object itself.
     */
    public JsonDataset withEncodingName(Object encodingName) {
        this.encodingName = encodingName;
        return this;
    }

    /**
     * Get the data compression method used for the json dataset.
     *
     * @return the compression value
     */
    public DatasetCompression compression() {
        return this.compression;
    }

    /**
     * Set the data compression method used for the json dataset.
     *
     * @param compression the compression value to set
     * @return the JsonDataset object itself.
     */
    public JsonDataset withCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

}
