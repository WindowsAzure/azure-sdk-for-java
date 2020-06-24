// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AnalyzeRequest model. */
@Fluent
public final class AnalyzeRequest {
    /*
     * The text to break into tokens.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * The name of the analyzer to use to break the given text. If this
     * parameter is not specified, you must specify a tokenizer instead. The
     * tokenizer and analyzer parameters are mutually exclusive.
     */
    @JsonProperty(value = "analyzer")
    private LexicalAnalyzerName analyzer;

    /*
     * The name of the tokenizer to use to break the given text. If this
     * parameter is not specified, you must specify an analyzer instead. The
     * tokenizer and analyzer parameters are mutually exclusive.
     */
    @JsonProperty(value = "tokenizer")
    private LexicalTokenizerName tokenizer;

    /*
     * An optional list of token filters to use when breaking the given text.
     * This parameter can only be set when using the tokenizer parameter.
     */
    @JsonProperty(value = "tokenFilters")
    private List<TokenFilterName> tokenFilters;

    /*
     * An optional list of character filters to use when breaking the given
     * text. This parameter can only be set when using the tokenizer parameter.
     */
    @JsonProperty(value = "charFilters")
    private List<CharFilterName> charFilters;

    /** Creates an instance of AnalyzeRequest class. */
    @JsonCreator
    public AnalyzeRequest(@JsonProperty(value = "text", required = true) String text) {
        this.text = text;
    }

    /**
     * Get the text property: The text to break into tokens.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The text to break into tokens.
     *
     * @param text the text value to set.
     * @return the AnalyzeRequest object itself.
     */
    /**
     * Get the analyzer property: The name of the analyzer to use to break the given text. If this parameter is not
     * specified, you must specify a tokenizer instead. The tokenizer and analyzer parameters are mutually exclusive.
     *
     * @return the analyzer value.
     */
    public LexicalAnalyzerName getAnalyzer() {
        return this.analyzer;
    }

    /**
     * Set the analyzer property: The name of the analyzer to use to break the given text. If this parameter is not
     * specified, you must specify a tokenizer instead. The tokenizer and analyzer parameters are mutually exclusive.
     *
     * @param analyzer the analyzer value to set.
     * @return the AnalyzeRequest object itself.
     */
    public AnalyzeRequest setAnalyzer(LexicalAnalyzerName analyzer) {
        this.analyzer = analyzer;
        return this;
    }

    /**
     * Get the tokenizer property: The name of the tokenizer to use to break the given text. If this parameter is not
     * specified, you must specify an analyzer instead. The tokenizer and analyzer parameters are mutually exclusive.
     *
     * @return the tokenizer value.
     */
    public LexicalTokenizerName getTokenizer() {
        return this.tokenizer;
    }

    /**
     * Set the tokenizer property: The name of the tokenizer to use to break the given text. If this parameter is not
     * specified, you must specify an analyzer instead. The tokenizer and analyzer parameters are mutually exclusive.
     *
     * @param tokenizer the tokenizer value to set.
     * @return the AnalyzeRequest object itself.
     */
    public AnalyzeRequest setTokenizer(LexicalTokenizerName tokenizer) {
        this.tokenizer = tokenizer;
        return this;
    }

    /**
     * Get the tokenFilters property: An optional list of token filters to use when breaking the given text. This
     * parameter can only be set when using the tokenizer parameter.
     *
     * @return the tokenFilters value.
     */
    public List<TokenFilterName> getTokenFilters() {
        return this.tokenFilters;
    }

    /**
     * Set the tokenFilters property: An optional list of token filters to use when breaking the given text. This
     * parameter can only be set when using the tokenizer parameter.
     *
     * @param tokenFilters the tokenFilters value to set.
     * @return the AnalyzeRequest object itself.
     */
    public AnalyzeRequest setTokenFilters(List<TokenFilterName> tokenFilters) {
        this.tokenFilters = tokenFilters;
        return this;
    }

    /**
     * Get the charFilters property: An optional list of character filters to use when breaking the given text. This
     * parameter can only be set when using the tokenizer parameter.
     *
     * @return the charFilters value.
     */
    public List<CharFilterName> getCharFilters() {
        return this.charFilters;
    }

    /**
     * Set the charFilters property: An optional list of character filters to use when breaking the given text. This
     * parameter can only be set when using the tokenizer parameter.
     *
     * @param charFilters the charFilters value to set.
     * @return the AnalyzeRequest object itself.
     */
    public AnalyzeRequest setCharFilters(List<CharFilterName> charFilters) {
        this.charFilters = charFilters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getText() == null) {
            throw new IllegalArgumentException("Missing required property text in model AnalyzeRequest");
        }
    }
}
