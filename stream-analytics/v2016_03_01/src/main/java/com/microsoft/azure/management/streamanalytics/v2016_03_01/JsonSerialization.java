/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes how data from an input is serialized or how data is serialized
 * when written to an output in JSON format.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Json")
@JsonFlatten
public class JsonSerialization extends Serialization {
    /**
     * Specifies the encoding of the incoming data in the case of input and the
     * encoding of outgoing data in the case of output. Required on PUT
     * (CreateOrReplace) requests. Possible values include: 'UTF8'.
     */
    @JsonProperty(value = "properties.encoding")
    private Encoding encoding;

    /**
     * This property only applies to JSON serialization of outputs only. It is
     * not applicable to inputs. This property specifies the format of the JSON
     * the output will be written in. The currently supported values are
     * 'lineSeparated' indicating the output will be formatted by having each
     * JSON object separated by a new line and 'array' indicating the output
     * will be formatted as an array of JSON objects. Default value is
     * 'lineSeparated' if left null. Possible values include: 'LineSeparated',
     * 'Array'.
     */
    @JsonProperty(value = "properties.format")
    private JsonOutputSerializationFormat format;

    /**
     * Get the encoding value.
     *
     * @return the encoding value
     */
    public Encoding encoding() {
        return this.encoding;
    }

    /**
     * Set the encoding value.
     *
     * @param encoding the encoding value to set
     * @return the JsonSerialization object itself.
     */
    public JsonSerialization withEncoding(Encoding encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * Get the format value.
     *
     * @return the format value
     */
    public JsonOutputSerializationFormat format() {
        return this.format;
    }

    /**
     * Set the format value.
     *
     * @param format the format value to set
     * @return the JsonSerialization object itself.
     */
    public JsonSerialization withFormat(JsonOutputSerializationFormat format) {
        this.format = format;
        return this;
    }

}
