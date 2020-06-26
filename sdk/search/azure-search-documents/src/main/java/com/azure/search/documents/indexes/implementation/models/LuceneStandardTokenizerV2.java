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

/** The LuceneStandardTokenizerV2 model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.StandardTokenizerV2")
@JsonFlatten
@Fluent
public class LuceneStandardTokenizerV2 extends LexicalTokenizer {
    /*
     * The maximum token length. Default is 255. Tokens longer than the maximum
     * length are split. The maximum token length that can be used is 300
     * characters.
     */
    @JsonProperty(value = "maxTokenLength")
    private Integer maxTokenLength;

    /** Creates an instance of LuceneStandardTokenizerV2 class. */
    @JsonCreator
    public LuceneStandardTokenizerV2(@JsonProperty(value = "name") String name) {
        super(name);
    }

    /**
     * Get the maxTokenLength property: The maximum token length. Default is 255. Tokens longer than the maximum length
     * are split. The maximum token length that can be used is 300 characters.
     *
     * @return the maxTokenLength value.
     */
    public Integer getMaxTokenLength() {
        return this.maxTokenLength;
    }

    /**
     * Set the maxTokenLength property: The maximum token length. Default is 255. Tokens longer than the maximum length
     * are split. The maximum token length that can be used is 300 characters.
     *
     * @param maxTokenLength the maxTokenLength value to set.
     * @return the LuceneStandardTokenizerV2 object itself.
     */
    public LuceneStandardTokenizerV2 setMaxTokenLength(Integer maxTokenLength) {
        this.maxTokenLength = maxTokenLength;
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
