// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cs.textanalytics.models;

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
    private int charactersCount;

    /*
     * Number of transactions for the document.
     */
    @JsonProperty(value = "transactionsCount", required = true)
    private int transactionsCount;

    /**
     * Get the charactersCount property: Number of text elements recognized in
     * the document.
     *
     * @return the charactersCount value.
     */
    public int getCharactersCount() {
        return this.charactersCount;
    }

    /**
     * Set the charactersCount property: Number of text elements recognized in
     * the document.
     *
     * @param charactersCount the charactersCount value to set.
     * @return the TextDocumentStatistics object itself.
     */
    TextDocumentStatistics setCharactersCount(int charactersCount) {
        this.charactersCount = charactersCount;
        return this;
    }

    /**
     * Get the transactionsCount property: Number of transactions for the
     * document.
     *
     * @return the transactionsCount value.
     */
    public int getTransactionsCount() {
        return this.transactionsCount;
    }

    /**
     * Set the transactionsCount property: Number of transactions for the
     * document.
     *
     * @param transactionsCount the transactionsCount value to set.
     * @return the TextDocumentStatistics object itself.
     */
    TextDocumentStatistics setTransactionsCount(int transactionsCount) {
        this.transactionsCount = transactionsCount;
        return this;
    }
}
