// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * if showStats=true was specified in the request this field will contain
 * information about the document payload.
 */
@Fluent
public final class TextDocumentStatistics {
    /*
     * Number of text elements recognized in the document.
     */
    @JsonProperty(value = "charactersCount", required = true)
    private int characterCount;

    /*
     * Number of transactions for the document.
     */
    @JsonProperty(value = "transactionsCount", required = true)
    private int transactionCount;

    /**
     * Get the charactersCount property: Number of text elements recognized in
     * the document.
     *
     * @return the charactersCount value.
     */
    public int getCharacterCount() {
        return this.characterCount;
    }

    /**
     * Set the charactersCount property: Number of text elements recognized in
     * the document.
     *
     * @param characterCount the charactersCount value to set.
     *
     * @return the TextDocumentStatistics object itself.
     */
    public TextDocumentStatistics setCharacterCount(int characterCount) {
        this.characterCount = characterCount;
        return this;
    }

    /**
     * Get the transactionsCount property: Number of transactions for the
     * document.
     *
     * @return the transactionsCount value.
     */
    public int getTransactionCount() {
        return this.transactionCount;
    }

    /**
     * Set the transactionsCount property: Number of transactions for the
     * document.
     *
     * @param transactionCount the transactionsCount value to set.
     *
     * @return the TextDocumentStatistics object itself.
     */
    public TextDocumentStatistics setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
        return this;
    }
}
