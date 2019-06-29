// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.Map;

/**
 * An Azure Storage container.
 */
@JacksonXmlRootElement(localName = "Container")
public final class ContainerItem {
    /*
     * The name property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The properties property.
     */
    @JsonProperty(value = "Properties", required = true)
    private ContainerProperties properties;

    /*
     * The metadata property.
     */
    @JsonProperty(value = "Metadata")
    private Map<String, String> metadata;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the ContainerItem object itself.
     */
    public ContainerItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: The properties property.
     *
     * @return the properties value.
     */
    public ContainerProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     *
     * @param properties the properties value to set.
     * @return the ContainerItem object itself.
     */
    public ContainerItem properties(ContainerProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the metadata property: The metadata property.
     *
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the ContainerItem object itself.
     */
    public ContainerItem metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
