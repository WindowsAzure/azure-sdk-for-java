// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.core.util.IterableStream;

/**
 * A collection model that contains a list of {@link T} along with model version and batch's statistics
 *
 * @param <T> any child class of {@link TextAnalyticsResult}.
 */
public final class TextAnalyticsResultCollection<T extends TextAnalyticsResult> extends IterableStream<T> {
    private final String modelVersion;
    private final TextDocumentBatchStatistics statistics;

    /**
     * Create a {@link TextAnalyticsResultCollection} model that maintains a list of {@link T} along
     * with model version and batch's statistics
     *
     * @param documentResults A list of generic type {@link T} that is any child class of {@link TextAnalyticsResult}.
     * @param modelVersion The model version trained in service for the request.
     * @param statistics The batch statistics of response.
     */
    public TextAnalyticsResultCollection(Iterable<T> documentResults, String modelVersion,
        TextDocumentBatchStatistics statistics) {
        super(documentResults);
        this.modelVersion = modelVersion;
        this.statistics = statistics;
    }

    /**
     * Get the model version trained in service for the request.
     *
     * @return The model version trained in service for the request.
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Get the batch statistics of response.
     *
     * @return The batch statistics of response.
     */
    public TextDocumentBatchStatistics getStatistics() {
        return statistics;
    }
}
