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

/** The CjkBigramTokenFilter model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.CjkBigramTokenFilter")
@JsonFlatten
@Fluent
public class CjkBigramTokenFilter extends TokenFilter {
    /*
     * The scripts to ignore.
     */
    @JsonProperty(value = "ignoreScripts")
    private List<CjkBigramTokenFilterScripts> ignoreScripts;

    /*
     * A value indicating whether to output both unigrams and bigrams (if
     * true), or just bigrams (if false). Default is false.
     */
    @JsonProperty(value = "outputUnigrams")
    private Boolean outputUnigrams;

    /** Creates an instance of CjkBigramTokenFilter class. */
    @JsonCreator
    public CjkBigramTokenFilter(@JsonProperty(value = "name", required = true) String name) {
        super(name);
    }

    /**
     * Get the ignoreScripts property: The scripts to ignore.
     *
     * @return the ignoreScripts value.
     */
    public List<CjkBigramTokenFilterScripts> getIgnoreScripts() {
        return this.ignoreScripts;
    }

    /**
     * Set the ignoreScripts property: The scripts to ignore.
     *
     * @param ignoreScripts the ignoreScripts value to set.
     * @return the CjkBigramTokenFilter object itself.
     */
    public CjkBigramTokenFilter setIgnoreScripts(List<CjkBigramTokenFilterScripts> ignoreScripts) {
        this.ignoreScripts = ignoreScripts;
        return this;
    }

    /**
     * Get the outputUnigrams property: A value indicating whether to output both unigrams and bigrams (if true), or
     * just bigrams (if false). Default is false.
     *
     * @return the outputUnigrams value.
     */
    public Boolean isOutputUnigrams() {
        return this.outputUnigrams;
    }

    /**
     * Set the outputUnigrams property: A value indicating whether to output both unigrams and bigrams (if true), or
     * just bigrams (if false). Default is false.
     *
     * @param outputUnigrams the outputUnigrams value to set.
     * @return the CjkBigramTokenFilter object itself.
     */
    public CjkBigramTokenFilter setOutputUnigrams(Boolean outputUnigrams) {
        this.outputUnigrams = outputUnigrams;
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
