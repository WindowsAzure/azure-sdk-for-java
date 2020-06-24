// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Base type for similarity algorithms. Similarity algorithms are used to
 * calculate scores that tie queries to documents. The higher the score, the
 * more relevant the document is to that specific query. Those scores are used
 * to rank the search results.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type",
    defaultImpl = SimilarityAlgorithm.class)
@JsonTypeName("Similarity")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Azure.Search.ClassicSimilarity", value = ClassicSimilarityAlgorithm.class),
    @JsonSubTypes.Type(name = "#Microsoft.Azure.Search.BM25Similarity", value = BM25SimilarityAlgorithm.class)
})
@Fluent
public abstract class SimilarityAlgorithm {
}
