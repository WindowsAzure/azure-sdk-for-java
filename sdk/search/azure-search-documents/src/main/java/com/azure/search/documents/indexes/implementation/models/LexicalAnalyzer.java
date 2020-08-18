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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The LexicalAnalyzer model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@odata\\.type",
        defaultImpl = LexicalAnalyzer.class)
@JsonTypeName("LexicalAnalyzer")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Azure.Search.CustomAnalyzer", value = CustomAnalyzer.class),
    @JsonSubTypes.Type(name = "#Microsoft.Azure.Search.PatternAnalyzer", value = PatternAnalyzer.class),
    @JsonSubTypes.Type(name = "#Microsoft.Azure.Search.StandardAnalyzer", value = LuceneStandardAnalyzer.class),
    @JsonSubTypes.Type(name = "#Microsoft.Azure.Search.StopAnalyzer", value = StopAnalyzer.class)
})
@JsonFlatten
@Fluent
public class LexicalAnalyzer {
    /*
     * The name of the analyzer. It must only contain letters, digits, spaces,
     * dashes or underscores, can only start and end with alphanumeric
     * characters, and is limited to 128 characters.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /** Creates an instance of LexicalAnalyzer class. */
    @JsonCreator
    public LexicalAnalyzer(@JsonProperty(value = "name", required = true) String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the analyzer. It must only contain letters, digits, spaces, dashes or
     * underscores, can only start and end with alphanumeric characters, and is limited to 128 characters.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the analyzer. It must only contain letters, digits, spaces, dashes or
     * underscores, can only start and end with alphanumeric characters, and is limited to 128 characters.
     *
     * @param name the name value to set.
     * @return the LexicalAnalyzer object itself.
     */
}
