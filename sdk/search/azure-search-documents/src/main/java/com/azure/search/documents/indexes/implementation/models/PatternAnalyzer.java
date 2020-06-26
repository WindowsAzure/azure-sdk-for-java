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

/** The PatternAnalyzer model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.PatternAnalyzer")
@JsonFlatten
@Fluent
public class PatternAnalyzer extends LexicalAnalyzer {
    /*
     * A value indicating whether terms should be lower-cased. Default is true.
     */
    @JsonProperty(value = "lowercase")
    private Boolean lowerCaseTerms;

    /*
     * A regular expression pattern to match token separators. Default is an
     * expression that matches one or more non-word characters.
     */
    @JsonProperty(value = "pattern")
    private String pattern;

    /*
     * Regular expression flags.
     */
    @JsonProperty(value = "flags")
    private RegexFlags flags;

    /*
     * A list of stopwords.
     */
    @JsonProperty(value = "stopwords")
    private List<String> stopwords;

    /** Creates an instance of PatternAnalyzer class. */
    @JsonCreator
    public PatternAnalyzer(@JsonProperty(value = "name") String name) {
        super(name);
    }

    /**
     * Get the lowerCaseTerms property: A value indicating whether terms should be lower-cased. Default is true.
     *
     * @return the lowerCaseTerms value.
     */
    public Boolean isLowerCaseTerms() {
        return this.lowerCaseTerms;
    }

    /**
     * Set the lowerCaseTerms property: A value indicating whether terms should be lower-cased. Default is true.
     *
     * @param lowerCaseTerms the lowerCaseTerms value to set.
     * @return the PatternAnalyzer object itself.
     */
    public PatternAnalyzer setLowerCaseTerms(Boolean lowerCaseTerms) {
        this.lowerCaseTerms = lowerCaseTerms;
        return this;
    }

    /**
     * Get the pattern property: A regular expression pattern to match token separators. Default is an expression that
     * matches one or more non-word characters.
     *
     * @return the pattern value.
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * Set the pattern property: A regular expression pattern to match token separators. Default is an expression that
     * matches one or more non-word characters.
     *
     * @param pattern the pattern value to set.
     * @return the PatternAnalyzer object itself.
     */
    public PatternAnalyzer setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the flags property: Regular expression flags.
     *
     * @return the flags value.
     */
    public RegexFlags getFlags() {
        return this.flags;
    }

    /**
     * Set the flags property: Regular expression flags.
     *
     * @param flags the flags value to set.
     * @return the PatternAnalyzer object itself.
     */
    public PatternAnalyzer setFlags(RegexFlags flags) {
        this.flags = flags;
        return this;
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
     * @return the PatternAnalyzer object itself.
     */
    public PatternAnalyzer setStopwords(List<String> stopwords) {
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
