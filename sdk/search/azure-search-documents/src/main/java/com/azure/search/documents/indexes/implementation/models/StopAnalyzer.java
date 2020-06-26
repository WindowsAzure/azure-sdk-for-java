// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonCreator;
=======
>>>>>>> b58ce026c9fe5fc4ad488b3aa7c0985968f73487
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The StopAnalyzer model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.StopAnalyzer")
@JsonFlatten
@Fluent
public class StopAnalyzer extends LexicalAnalyzer {
    /*
     * A list of stopwords.
     */
    @JsonProperty(value = "stopwords")
    private List<String> stopwords;

    /** Creates an instance of StopAnalyzer class. */
    @JsonCreator
    public StopAnalyzer(@JsonProperty(value = "name") String name) {
        super(name);
    }

    /**
     * Get the stopwords property: A list of stopwords.
     *
     * @return the stopwords value.
     */
    public List<String> getStopwords() {
        return this.stopwords;
    }

    /**
     * Set the stopwords property: A list of stopwords.
     *
     * @param stopwords the stopwords value to set.
     * @return the StopAnalyzer object itself.
     */
    public StopAnalyzer setStopwords(List<String> stopwords) {
        this.stopwords = stopwords;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
