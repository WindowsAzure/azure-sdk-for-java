/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.azure.search.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

/**
 * Tokenizes the input from an edge into n-grams of the given size(s). This
 * tokenizer is implemented using Apache Lucene.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.EdgeNGramTokenizer")
public class EdgeNGramTokenizer extends Tokenizer {
    /**
     * The minimum n-gram length. Default is 1. Maximum is 300. Must be less
     * than the value of maxGram.
     */
    @JsonProperty(value = "minGram")
    private Integer minGram;

    /**
     * The maximum n-gram length. Default is 2. Maximum is 300.
     */
    @JsonProperty(value = "maxGram")
    private Integer maxGram;

    /**
     * Character classes to keep in the tokens.
     */
    @JsonProperty(value = "tokenChars")
    private List<TokenCharacterKind> tokenChars;

    /**
     * Get the minimum n-gram length. Default is 1. Maximum is 300. Must be less than the value of maxGram.
     *
     * @return the minGram value
     */
    public Integer minGram() {
        return this.minGram;
    }

    /**
     * Set the minimum n-gram length. Default is 1. Maximum is 300. Must be less than the value of maxGram.
     *
     * @param minGram the minGram value to set
     * @return the EdgeNGramTokenizer object itself.
     */
    public EdgeNGramTokenizer withMinGram(Integer minGram) {
        this.minGram = minGram;
        return this;
    }

    /**
     * Get the maximum n-gram length. Default is 2. Maximum is 300.
     *
     * @return the maxGram value
     */
    public Integer maxGram() {
        return this.maxGram;
    }

    /**
     * Set the maximum n-gram length. Default is 2. Maximum is 300.
     *
     * @param maxGram the maxGram value to set
     * @return the EdgeNGramTokenizer object itself.
     */
    public EdgeNGramTokenizer withMaxGram(Integer maxGram) {
        this.maxGram = maxGram;
        return this;
    }

    /**
     * Get character classes to keep in the tokens.
     *
     * @return the tokenChars value
     */
    public List<TokenCharacterKind> tokenChars() {
        return this.tokenChars;
    }

    /**
     * Set character classes to keep in the tokens.
     *
     * @param tokenChars the tokenChars value to set
     * @return the EdgeNGramTokenizer object itself.
     */
    public EdgeNGramTokenizer withTokenChars(List<TokenCharacterKind> tokenChars) {
        this.tokenChars = tokenChars;
        return this;
    }

}
