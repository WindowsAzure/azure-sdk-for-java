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

/** The DictionaryDecompounderTokenFilter model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.DictionaryDecompounderTokenFilter")
@JsonFlatten
@Fluent
public class DictionaryDecompounderTokenFilter extends TokenFilter {
    /*
     * The list of words to match against.
     */
    @JsonProperty(value = "wordList", required = true)
    private List<String> wordList;

    /*
     * The minimum word size. Only words longer than this get processed.
     * Default is 5. Maximum is 300.
     */
    @JsonProperty(value = "minWordSize")
    private Integer minWordSize;

    /*
     * The minimum subword size. Only subwords longer than this are outputted.
     * Default is 2. Maximum is 300.
     */
    @JsonProperty(value = "minSubwordSize")
    private Integer minSubwordSize;

    /*
     * The maximum subword size. Only subwords shorter than this are outputted.
     * Default is 15. Maximum is 300.
     */
    @JsonProperty(value = "maxSubwordSize")
    private Integer maxSubwordSize;

    /*
     * A value indicating whether to add only the longest matching subword to
     * the output. Default is false.
     */
    @JsonProperty(value = "onlyLongestMatch")
    private Boolean onlyLongestMatch;

    /** Creates an instance of DictionaryDecompounderTokenFilter class. */
    @JsonCreator
    public DictionaryDecompounderTokenFilter(
            @JsonProperty(value = "name") String name, @JsonProperty(value = "wordList") List<String> wordList) {
        super(name);
        this.wordList = wordList;
    }

    /**
     * Get the wordList property: The list of words to match against.
     *
     * @return the wordList value.
     */
    public List<String> getWordList() {
        return this.wordList;
    }

    /**
     * Set the wordList property: The list of words to match against.
     *
     * @param wordList the wordList value to set.
     * @return the DictionaryDecompounderTokenFilter object itself.
     */
    /**
     * Get the minWordSize property: The minimum word size. Only words longer than this get processed. Default is 5.
     * Maximum is 300.
     *
     * @return the minWordSize value.
     */
    public Integer getMinWordSize() {
        return this.minWordSize;
    }

    /**
     * Set the minWordSize property: The minimum word size. Only words longer than this get processed. Default is 5.
     * Maximum is 300.
     *
     * @param minWordSize the minWordSize value to set.
     * @return the DictionaryDecompounderTokenFilter object itself.
     */
    public DictionaryDecompounderTokenFilter setMinWordSize(Integer minWordSize) {
        this.minWordSize = minWordSize;
        return this;
    }

    /**
     * Get the minSubwordSize property: The minimum subword size. Only subwords longer than this are outputted. Default
     * is 2. Maximum is 300.
     *
     * @return the minSubwordSize value.
     */
    public Integer getMinSubwordSize() {
        return this.minSubwordSize;
    }

    /**
     * Set the minSubwordSize property: The minimum subword size. Only subwords longer than this are outputted. Default
     * is 2. Maximum is 300.
     *
     * @param minSubwordSize the minSubwordSize value to set.
     * @return the DictionaryDecompounderTokenFilter object itself.
     */
    public DictionaryDecompounderTokenFilter setMinSubwordSize(Integer minSubwordSize) {
        this.minSubwordSize = minSubwordSize;
        return this;
    }

    /**
     * Get the maxSubwordSize property: The maximum subword size. Only subwords shorter than this are outputted. Default
     * is 15. Maximum is 300.
     *
     * @return the maxSubwordSize value.
     */
    public Integer getMaxSubwordSize() {
        return this.maxSubwordSize;
    }

    /**
     * Set the maxSubwordSize property: The maximum subword size. Only subwords shorter than this are outputted. Default
     * is 15. Maximum is 300.
     *
     * @param maxSubwordSize the maxSubwordSize value to set.
     * @return the DictionaryDecompounderTokenFilter object itself.
     */
    public DictionaryDecompounderTokenFilter setMaxSubwordSize(Integer maxSubwordSize) {
        this.maxSubwordSize = maxSubwordSize;
        return this;
    }

    /**
     * Get the onlyLongestMatch property: A value indicating whether to add only the longest matching subword to the
     * output. Default is false.
     *
     * @return the onlyLongestMatch value.
     */
    public Boolean isOnlyLongestMatch() {
        return this.onlyLongestMatch;
    }

    /**
     * Set the onlyLongestMatch property: A value indicating whether to add only the longest matching subword to the
     * output. Default is false.
     *
     * @param onlyLongestMatch the onlyLongestMatch value to set.
     * @return the DictionaryDecompounderTokenFilter object itself.
     */
    public DictionaryDecompounderTokenFilter setOnlyLongestMatch(Boolean onlyLongestMatch) {
        this.onlyLongestMatch = onlyLongestMatch;
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
        if (getWordList() == null) {
            throw new IllegalArgumentException(
                    "Missing required property wordList in model DictionaryDecompounderTokenFilter");
        }
    }
}
