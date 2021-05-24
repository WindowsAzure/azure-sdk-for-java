// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.log.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MetadataTableColumnsItem model. */
@Fluent
public final class MetadataTableColumnsItem {
    /*
     * The name of the column
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The description of the column
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The data type of the column
     */
    @JsonProperty(value = "type", required = true)
    private MetadataColumnDataType type;

    /*
     * A flag indicating this column is a preferred facet
     */
    @JsonProperty(value = "isPreferredFacet")
    private Boolean isPreferredFacet;

    /*
     * an indication of the source of the column, used only when multiple
     * workspaces have conflicting definition for the column
     */
    @JsonProperty(value = "source")
    private Object source;

    /**
     * Creates an instance of MetadataTableColumnsItem class.
     *
     * @param name the name value to set.
     * @param type the type value to set.
     */
    @JsonCreator
    public MetadataTableColumnsItem(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "type", required = true) MetadataColumnDataType type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Get the name property: The name of the column.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the description property: The description of the column.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the column.
     *
     * @param description the description value to set.
     * @return the MetadataTableColumnsItem object itself.
     */
    public MetadataTableColumnsItem setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the type property: The data type of the column.
     *
     * @return the type value.
     */
    public MetadataColumnDataType getType() {
        return this.type;
    }

    /**
     * Get the isPreferredFacet property: A flag indicating this column is a preferred facet.
     *
     * @return the isPreferredFacet value.
     */
    public Boolean isPreferredFacet() {
        return this.isPreferredFacet;
    }

    /**
     * Set the isPreferredFacet property: A flag indicating this column is a preferred facet.
     *
     * @param isPreferredFacet the isPreferredFacet value to set.
     * @return the MetadataTableColumnsItem object itself.
     */
    public MetadataTableColumnsItem setIsPreferredFacet(Boolean isPreferredFacet) {
        this.isPreferredFacet = isPreferredFacet;
        return this;
    }

    /**
     * Get the source property: an indication of the source of the column, used only when multiple workspaces have
     * conflicting definition for the column.
     *
     * @return the source value.
     */
    public Object getSource() {
        return this.source;
    }

    /**
     * Set the source property: an indication of the source of the column, used only when multiple workspaces have
     * conflicting definition for the column.
     *
     * @param source the source value to set.
     * @return the MetadataTableColumnsItem object itself.
     */
    public MetadataTableColumnsItem setSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getName() == null) {
            throw new IllegalArgumentException("Missing required property name in model MetadataTableColumnsItem");
        }
        if (getType() == null) {
            throw new IllegalArgumentException("Missing required property type in model MetadataTableColumnsItem");
        }
    }
}
