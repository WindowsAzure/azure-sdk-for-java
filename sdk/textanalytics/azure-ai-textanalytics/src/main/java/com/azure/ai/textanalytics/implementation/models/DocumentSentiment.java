// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.ai.textanalytics.models.TextDocumentStatistics;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The DocumentSentiment model.
 */
@Fluent
public final class DocumentSentiment {
    /*
     * Unique, non-empty document identifier.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Predicted sentiment for document (Negative, Neutral, Positive, or
     * Mixed). Possible values include: 'positive', 'neutral', 'negative',
     * 'mixed'
     */
    @JsonProperty(value = "sentiment", required = true)
    private String sentiment;

    /*
     * The statistics property.
     */
    @JsonProperty(value = "statistics")
    private TextDocumentStatistics statistics;

    /*
     * Document level sentiment confidence scores between 0 and 1 for each
     * sentiment class.
     */
    @JsonProperty(value = "documentScores", required = true)
    private SentimentConfidenceScorePerLabel documentScores;

    /*
     * Sentence level sentiment analysis.
     */
    @JsonProperty(value = "sentences", required = true)
    private List<SentenceSentiment> sentences;

    /**
     * Get the id property: Unique, non-empty document identifier.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Unique, non-empty document identifier.
     *
     * @param id the id value to set.
     * @return the DocumentSentiment object itself.
     */
    public DocumentSentiment setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the sentiment property: Predicted sentiment for document (Negative,
     * Neutral, Positive, or Mixed). Possible values include: 'positive',
     * 'neutral', 'negative', 'mixed'.
     *
     * @return the sentiment value.
     */
    public String getSentiment() {
        return this.sentiment;
    }

    /**
     * Set the sentiment property: Predicted sentiment for document (Negative,
     * Neutral, Positive, or Mixed). Possible values include: 'positive',
     * 'neutral', 'negative', 'mixed'.
     *
     * @param sentiment the sentiment value to set.
     * @return the DocumentSentiment object itself.
     */
    public DocumentSentiment setSentiment(String sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    /**
     * Get the statistics property: The statistics property.
     *
     * @return the statistics value.
     */
    public TextDocumentStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * Set the statistics property: The statistics property.
     *
     * @param statistics the statistics value to set.
     * @return the DocumentSentiment object itself.
     */
    public DocumentSentiment setStatistics(TextDocumentStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

    /**
     * Get the documentScores property: Document level sentiment confidence
     * scores between 0 and 1 for each sentiment class.
     *
     * @return the documentScores value.
     */
    public SentimentConfidenceScorePerLabel getDocumentScores() {
        return this.documentScores;
    }

    /**
     * Set the documentScores property: Document level sentiment confidence
     * scores between 0 and 1 for each sentiment class.
     *
     * @param documentScores the documentScores value to set.
     * @return the DocumentSentiment object itself.
     */
    public DocumentSentiment setDocumentScores(SentimentConfidenceScorePerLabel documentScores) {
        this.documentScores = documentScores;
        return this;
    }

    /**
     * Get the sentences property: Sentence level sentiment analysis.
     *
     * @return the sentences value.
     */
    public List<SentenceSentiment> getSentences() {
        return this.sentences;
    }

    /**
     * Set the sentences property: Sentence level sentiment analysis.
     *
     * @param sentences the sentences value to set.
     * @return the DocumentSentiment object itself.
     */
    public DocumentSentiment setSentences(List<SentenceSentiment> sentences) {
        this.sentences = sentences;
        return this;
    }
}
