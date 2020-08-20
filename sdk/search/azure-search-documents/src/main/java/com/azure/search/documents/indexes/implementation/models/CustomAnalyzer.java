// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.search.documents.indexes.models.CharFilterName;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The CustomAnalyzer model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.CustomAnalyzer")
@JsonFlatten
@Fluent
public class CustomAnalyzer extends LexicalAnalyzer {
    /*
     * The name of the tokenizer to use to divide continuous text into a
     * sequence of tokens, such as breaking a sentence into words.
     */
    @JsonProperty(value = "tokenizer", required = true)
    private LexicalTokenizerName tokenizer;

    /*
     * A list of token filters used to filter out or modify the tokens
     * generated by a tokenizer. For example, you can specify a lowercase
     * filter that converts all characters to lowercase. The filters are run in
     * the order in which they are listed.
     */
    @JsonProperty(value = "tokenFilters")
    private List<TokenFilterName> tokenFilters;

    /*
     * A list of character filters used to prepare input text before it is
     * processed by the tokenizer. For instance, they can replace certain
     * characters or symbols. The filters are run in the order in which they
     * are listed.
     */
    @JsonProperty(value = "charFilters")
    private List<CharFilterName> charFilters;

    /** Creates an instance of CustomAnalyzer class. */
    @JsonCreator
    public CustomAnalyzer(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "tokenizer", required = true) LexicalTokenizerName tokenizer) {
        super(name);
        this.tokenizer = tokenizer;
    }

    /**
     * Get the tokenizer property: The name of the tokenizer to use to divide continuous text into a sequence of tokens,
     * such as breaking a sentence into words.
     *
     * @return the tokenizer value.
     */
    public LexicalTokenizerName getTokenizer() {
        return this.tokenizer;
    }

    /**
     * Get the tokenFilters property: A list of token filters used to filter out or modify the tokens generated by a
     * tokenizer. For example, you can specify a lowercase filter that converts all characters to lowercase. The filters
     * are run in the order in which they are listed.
     *
     * @return the tokenFilters value.
     */
    public List<TokenFilterName> getTokenFilters() {
        return this.tokenFilters;
    }

    /**
     * Set the tokenFilters property: A list of token filters used to filter out or modify the tokens generated by a
     * tokenizer. For example, you can specify a lowercase filter that converts all characters to lowercase. The filters
     * are run in the order in which they are listed.
     *
     * @param tokenFilters the tokenFilters value to set.
     * @return the CustomAnalyzer object itself.
     */
    public CustomAnalyzer setTokenFilters(List<TokenFilterName> tokenFilters) {
        this.tokenFilters = tokenFilters;
        return this;
    }

    /**
     * Get the charFilters property: A list of character filters used to prepare input text before it is processed by
     * the tokenizer. For instance, they can replace certain characters or symbols. The filters are run in the order in
     * which they are listed.
     *
     * @return the charFilters value.
     */
    public List<CharFilterName> getCharFilters() {
        return this.charFilters;
    }

    /**
     * Set the charFilters property: A list of character filters used to prepare input text before it is processed by
     * the tokenizer. For instance, they can replace certain characters or symbols. The filters are run in the order in
     * which they are listed.
     *
     * @param charFilters the charFilters value to set.
     * @return the CustomAnalyzer object itself.
     */
    public CustomAnalyzer setCharFilters(List<CharFilterName> charFilters) {
        this.charFilters = charFilters;
        return this;
    }
}
