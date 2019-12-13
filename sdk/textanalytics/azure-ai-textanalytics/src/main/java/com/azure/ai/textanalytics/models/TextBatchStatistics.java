// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * if showStats=true was specified in the request this field will contain
 * information about the request payload.
 */
@Fluent
public final class TextBatchStatistics {
    /*
     * Number of documents submitted in the request.
     */
    @JsonProperty(value = "documentsCount", required = true)
    private int documentsCount;

    /*
     * Number of valid documents. This excludes empty, over-size limit or
     * non-supported languages documents.
     */
    @JsonProperty(value = "validDocumentsCount", required = true)
    private int validDocumentsCount;

    /*
     * Number of invalid documents. This includes empty, over-size limit or
     * non-supported languages documents.
     */
    @JsonProperty(value = "erroneousDocumentsCount", required = true)
    private int erroneousDocumentsCount;

    /*
     * Number of transactions for the request.
     */
    @JsonProperty(value = "transactionsCount", required = true)
    private long transactionsCount;

    /**
     * Get the documentsCount property: Number of documents submitted in the
     * request.
     *
     * @return the documentsCount value.
     */
    public int getDocumentsCount() {
        return this.documentsCount;
    }

    /**
     * Set the documentsCount property: Number of documents submitted in the
     * request.
     *
     * @param documentsCount the documentsCount value to set.
     * @return the RequestStatistics object itself.
     */
    public TextBatchStatistics setDocumentsCount(int documentsCount) {
        this.documentsCount = documentsCount;
        return this;
    }

    /**
     * Get the validDocumentsCount property: Number of valid documents. This
     * excludes empty, over-size limit or non-supported languages documents.
     *
     * @return the validDocumentsCount value.
     */
    public int getValidDocumentsCount() {
        return this.validDocumentsCount;
    }

    /**
     * Set the validDocumentsCount property: Number of valid documents. This
     * excludes empty, over-size limit or non-supported languages documents.
     *
     * @param validDocumentsCount the validDocumentsCount value to set.
     * @return the RequestStatistics object itself.
     */
    public TextBatchStatistics setValidDocumentsCount(int validDocumentsCount) {
        this.validDocumentsCount = validDocumentsCount;
        return this;
    }

    /**
     * Get the erroneousDocumentsCount property: Number of invalid documents.
     * This includes empty, over-size limit or non-supported languages
     * documents.
     *
     * @return the erroneousDocumentsCount value.
     */
    public int getErroneousDocumentsCount() {
        return this.erroneousDocumentsCount;
    }

    /**
     * Set the erroneousDocumentsCount property: Number of invalid documents.
     * This includes empty, over-size limit or non-supported languages
     * documents.
     *
     * @param erroneousDocumentsCount the erroneousDocumentsCount value to set.
     * @return the RequestStatistics object itself.
     */
    public TextBatchStatistics setErroneousDocumentsCount(int erroneousDocumentsCount) {
        this.erroneousDocumentsCount = erroneousDocumentsCount;
        return this;
    }

    /**
     * Get the transactionsCount property: Number of transactions for the
     * request.
     *
     * @return the transactionsCount value.
     */
    public long getTransactionsCount() {
        return this.transactionsCount;
    }

    /**
     * Set the transactionsCount property: Number of transactions for the
     * request.
     *
     * @param transactionsCount the transactionsCount value to set.
     * @return the RequestStatistics object itself.
     */
    public TextBatchStatistics setTransactionsCount(long transactionsCount) {
        this.transactionsCount = transactionsCount;
        return this;
    }
}
