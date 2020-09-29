// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The MappingCharFilter model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.MappingCharFilter")
@JsonFlatten
@Fluent
public class MappingCharFilter extends CharFilter {
    /*
     * A list of mappings of the following format: "a=>b" (all occurrences of
     * the character "a" will be replaced with character "b").
     */
    @JsonProperty(value = "mappings", required = true)
    private List<String> mappings;

    /**
     * Creates an instance of MappingCharFilter class.
     *
     * @param name the name value to set.
     * @param mappings the mappings value to set.
     */
    @JsonCreator
    public MappingCharFilter(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "mappings", required = true) List<String> mappings) {
        super(name);
        this.mappings = mappings;
    }

    /**
     * Get the mappings property: A list of mappings of the following format: "a=&gt;b" (all occurrences of the
     * character "a" will be replaced with character "b").
     *
     * @return the mappings value.
     */
    public List<String> getMappings() {
        return this.mappings;
    }
}
