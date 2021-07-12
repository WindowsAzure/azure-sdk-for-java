// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** Groups settings regarding specific field of an arrow schema. */
@JacksonXmlRootElement(localName = "Field")
@Fluent
public final class ArrowField {
    /*
     * The Type property.
     */
    @JsonProperty(value = "Type", required = true)
    private String type;

    /*
     * The Name property.
     */
    @JsonProperty(value = "Name")
    private String name;

    /*
     * The Precision property.
     */
    @JsonProperty(value = "Precision")
    private Integer precision;

    /*
     * The Scale property.
     */
    @JsonProperty(value = "Scale")
    private Integer scale;

    /**
     * Get the type property: The Type property.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The Type property.
     *
     * @param type the type value to set.
     * @return the ArrowField object itself.
     */
    public ArrowField setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The Name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The Name property.
     *
     * @param name the name value to set.
     * @return the ArrowField object itself.
     */
    public ArrowField setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the precision property: The Precision property.
     *
     * @return the precision value.
     */
    public Integer getPrecision() {
        return this.precision;
    }

    /**
     * Set the precision property: The Precision property.
     *
     * @param precision the precision value to set.
     * @return the ArrowField object itself.
     */
    public ArrowField setPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * Get the scale property: The Scale property.
     *
     * @return the scale value.
     */
    public Integer getScale() {
        return this.scale;
    }

    /**
     * Set the scale property: The Scale property.
     *
     * @param scale the scale value to set.
     * @return the ArrowField object itself.
     */
    public ArrowField setScale(Integer scale) {
        this.scale = scale;
        return this;
    }
}
