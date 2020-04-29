// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.ai.textanalytics.models.TextAnalyticsRequestOptions;
import com.azure.ai.textanalytics.models.TextDocumentStatistics;
import com.azure.core.annotation.Immutable;

/**
 * If {@link TextAnalyticsRequestOptions#isIncludeStatistics()} is set to {@code true} this class will will contain
 * information about the document payload.
 */
@Immutable
public final class TextDocumentStatisticsImpl implements TextDocumentStatistics {
    /*
     * Number of text elements recognized in the document.
     */
    private final int graphemeCount;

    /*
     * Number of transactions for the document.
     */
    private final int transactionCount;

    /**
     * Creates a {@link TextDocumentStatisticsImpl} model that describes the statistics of text document.
     *
     * @param graphemeCount The number of text elements recognized in the document.
     * @param transactionCount The number of transactions for the document.
     */
    public TextDocumentStatisticsImpl(int graphemeCount, int transactionCount) {
        this.graphemeCount = graphemeCount;
        this.transactionCount = transactionCount;
    }

    /**
     * Get the {@code graphemeCount} property: Number of text elements recognized in the document.
     *
     * @return The {@code graphemeCount} value.
     */
    public int getGraphemeCount() {
        return this.graphemeCount;
    }

    /**
     * Get the {@code transactionsCount} property: Number of transactions for the document.
     *
     * @return The {@code transactionsCount} value.
     */
    public int getTransactionCount() {
        return this.transactionCount;
    }
}
