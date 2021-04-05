/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The properties that are associated with an input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = InputProperties.class)
@JsonTypeName("InputProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stream", value = StreamInputProperties.class),
    @JsonSubTypes.Type(name = "Reference", value = ReferenceInputProperties.class)
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
     * The compression property.
     */
    @JsonProperty(value = "compression")
    private Compression compression;

    /**
     * partitionKey Describes a key in the input data which is used for
     * partitioning the input data.
     */
    @JsonProperty(value = "partitionKey")
    private String partitionKey;

    /**
     * Get describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     *
     * @return the serialization value
     */
    public Serialization serialization() {
        return this.serialization;
    }

    /**
     * Set describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     *
     * @param serialization the serialization value to set
     * @return the InputProperties object itself.
     */
    public InputProperties withSerialization(Serialization serialization) {
        this.serialization = serialization;
        return this;
    }

    /**
     * Get describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
     *
     * @return the diagnostics value
     */
    public Diagnostics diagnostics() {
        return this.diagnostics;
    }

    /**
     * Get the current entity tag for the input. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the compression value.
     *
     * @return the compression value
     */
    public Compression compression() {
        return this.compression;
    }

    /**
     * Set the compression value.
     *
     * @param compression the compression value to set
     * @return the InputProperties object itself.
     */
    public InputProperties withCompression(Compression compression) {
        this.compression = compression;
        return this;
    }

    /**
     * Get partitionKey Describes a key in the input data which is used for partitioning the input data.
     *
     * @return the partitionKey value
     */
    public String partitionKey() {
        return this.partitionKey;
    }

    /**
     * Set partitionKey Describes a key in the input data which is used for partitioning the input data.
     *
     * @param partitionKey the partitionKey value to set
     * @return the InputProperties object itself.
     */
    public InputProperties withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

}
