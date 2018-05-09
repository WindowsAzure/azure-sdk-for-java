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
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The properties that are associated with an input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("InputProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Reference", value = ReferenceInputProperties.class),
    @JsonSubTypes.Type(name = "Stream", value = StreamInputProperties.class)
})
public class InputProperties {
    /**
     * Describes how data from an input is serialized or how data is serialized
     * when written to an output. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "serialization")
    private Serialization serialization;

    /**
     * Describes conditions applicable to the Input, Output, or the job
     * overall, that warrant customer attention.
     */
    @JsonProperty(value = "diagnostics", access = JsonProperty.Access.WRITE_ONLY)
    private Diagnostics diagnostics;

    /**
     * The current entity tag for the input. This is an opaque string. You can
     * use it to detect whether the resource has changed between requests. You
     * can also use it in the If-Match or If-None-Match headers for write
     * operations for optimistic concurrency.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the serialization value.
     *
     * @return the serialization value
     */
    public Serialization serialization() {
        return this.serialization;
    }

    /**
     * Set the serialization value.
     *
     * @param serialization the serialization value to set
     * @return the InputProperties object itself.
     */
    public InputProperties withSerialization(Serialization serialization) {
        this.serialization = serialization;
        return this;
    }

    /**
     * Get the diagnostics value.
     *
     * @return the diagnostics value
     */
    public Diagnostics diagnostics() {
        return this.diagnostics;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
