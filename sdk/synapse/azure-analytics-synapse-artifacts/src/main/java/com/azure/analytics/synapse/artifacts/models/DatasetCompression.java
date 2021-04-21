// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;

/** The compression method used on a dataset. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = DatasetCompression.class)
@JsonTypeName("DatasetCompression")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "BZip2", value = DatasetBZip2Compression.class),
    @JsonSubTypes.Type(name = "GZip", value = DatasetGZipCompression.class),
    @JsonSubTypes.Type(name = "Deflate", value = DatasetDeflateCompression.class),
    @JsonSubTypes.Type(name = "ZipDeflate", value = DatasetZipDeflateCompression.class),
    @JsonSubTypes.Type(name = "Tar", value = DatasetTarCompression.class),
    @JsonSubTypes.Type(name = "TarGZip", value = DatasetTarGZipCompression.class)
})
@Fluent
public class DatasetCompression {
    /*
     * The compression method used on a dataset.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the additionalProperties property: The compression method used on a dataset.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The compression method used on a dataset.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the DatasetCompression object itself.
     */
    public DatasetCompression setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
