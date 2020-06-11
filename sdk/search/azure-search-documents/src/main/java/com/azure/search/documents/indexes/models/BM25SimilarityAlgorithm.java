// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ranking function based on the Okapi BM25 similarity algorithm. BM25 is a
 * TF-IDF-like algorithm that includes length normalization (controlled by the
 * 'b' parameter) as well as term frequency saturation (controlled by the 'k1'
 * parameter).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Azure.Search.BM25Similarity")
@Fluent
public final class BM25SimilarityAlgorithm extends SimilarityAlgorithm {
    /*
     * This property controls the scaling function between the term frequency
     * of each matching terms and the final relevance score of a document-query
     * pair. By default, a value of 1.2 is used. A value of 0.0 means the score
     * does not scale with an increase in term frequency.
     */
    @JsonProperty(value = "k1")
    private Double k1;

    /*
     * This property controls how the length of a document affects the
     * relevance score. By default, a value of 0.75 is used. A value of 0.0
     * means no length normalization is applied, while a value of 1.0 means the
     * score is fully normalized by the length of the document.
     */
    @JsonProperty(value = "b")
    private Double b;

    /**
     * Get the k1 property: This property controls the scaling function between
     * the term frequency of each matching terms and the final relevance score
     * of a document-query pair. By default, a value of 1.2 is used. A value of
     * 0.0 means the score does not scale with an increase in term frequency.
     *
     * @return the k1 value.
     */
    public Double getK1() {
        return this.k1;
    }

    /**
     * Set the k1 property: This property controls the scaling function between
     * the term frequency of each matching terms and the final relevance score
     * of a document-query pair. By default, a value of 1.2 is used. A value of
     * 0.0 means the score does not scale with an increase in term frequency.
     *
     * @param k1 the k1 value to set.
     * @return the BM25Similarity object itself.
     */
    public BM25SimilarityAlgorithm setK1(Double k1) {
        this.k1 = k1;
        return this;
    }

    /**
     * Get the b property: This property controls how the length of a document
     * affects the relevance score. By default, a value of 0.75 is used. A
     * value of 0.0 means no length normalization is applied, while a value of
     * 1.0 means the score is fully normalized by the length of the document.
     *
     * @return the b value.
     */
    public Double getB() {
        return this.b;
    }

    /**
     * Set the b property: This property controls how the length of a document
     * affects the relevance score. By default, a value of 0.75 is used. A
     * value of 0.0 means no length normalization is applied, while a value of
     * 1.0 means the score is fully normalized by the length of the document.
     *
     * @param b the b value to set.
     * @return the BM25Similarity object itself.
     */
    public BM25SimilarityAlgorithm setB(Double b) {
        this.b = b;
        return this;
    }
}
