// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The QueryFormat model. */
@JacksonXmlRootElement(localName = "QueryFormat")
@Fluent
public final class QueryFormat {
    /*
     * The quick query format type.
     */
    @JsonProperty(value = "Type")
    private QueryFormatType type;

    /*
     * delimited text configuration
     */
    @JsonProperty(value = "DelimitedTextConfiguration")
    private DelimitedTextConfiguration delimitedTextConfiguration;

    /*
     * json text configuration
     */
    @JsonProperty(value = "JsonTextConfiguration")
    private JsonTextConfiguration jsonTextConfiguration;

    /*
     * arrow configuration
     */
    @JsonProperty(value = "ArrowConfiguration")
    private ArrowConfiguration arrowConfiguration;

    /**
     * Get the type property: The quick query format type.
     *
     * @return the type value.
     */
    public QueryFormatType getType() {
        return this.type;
    }

    /**
     * Set the type property: The quick query format type.
     *
     * @param type the type value to set.
     * @return the QueryFormat object itself.
     */
    public QueryFormat setType(QueryFormatType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the delimitedTextConfiguration property: delimited text configuration.
     *
     * @return the delimitedTextConfiguration value.
     */
    public DelimitedTextConfiguration getDelimitedTextConfiguration() {
        return this.delimitedTextConfiguration;
    }

    /**
     * Set the delimitedTextConfiguration property: delimited text configuration.
     *
     * @param delimitedTextConfiguration the delimitedTextConfiguration value to set.
     * @return the QueryFormat object itself.
     */
    public QueryFormat setDelimitedTextConfiguration(DelimitedTextConfiguration delimitedTextConfiguration) {
        this.delimitedTextConfiguration = delimitedTextConfiguration;
        return this;
    }

    /**
     * Get the jsonTextConfiguration property: json text configuration.
     *
     * @return the jsonTextConfiguration value.
     */
    public JsonTextConfiguration getJsonTextConfiguration() {
        return this.jsonTextConfiguration;
    }

    /**
     * Set the jsonTextConfiguration property: json text configuration.
     *
     * @param jsonTextConfiguration the jsonTextConfiguration value to set.
     * @return the QueryFormat object itself.
     */
    public QueryFormat setJsonTextConfiguration(JsonTextConfiguration jsonTextConfiguration) {
        this.jsonTextConfiguration = jsonTextConfiguration;
        return this;
    }

    /**
     * Get the arrowConfiguration property: arrow configuration.
     *
     * @return the arrowConfiguration value.
     */
    public ArrowConfiguration getArrowConfiguration() {
        return this.arrowConfiguration;
    }

    /**
     * Set the arrowConfiguration property: arrow configuration.
     *
     * @param arrowConfiguration the arrowConfiguration value to set.
     * @return the QueryFormat object itself.
     */
    public QueryFormat setArrowConfiguration(ArrowConfiguration arrowConfiguration) {
        this.arrowConfiguration = arrowConfiguration;
        return this;
    }
}
