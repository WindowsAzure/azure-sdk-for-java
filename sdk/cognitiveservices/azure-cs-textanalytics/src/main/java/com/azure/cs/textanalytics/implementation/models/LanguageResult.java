// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cs.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.cs.textanalytics.models.TextBatchStatistics;
import com.azure.cs.textanalytics.models.DocumentError;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The LanguageResult model.
 */
@Fluent
public final class LanguageResult {
    /*
     * Response by document
     */
    @JsonProperty(value = "documents", required = true)
    private List<DocumentLanguage> documents;

    /*
     * Errors by document id.
     */
    @JsonProperty(value = "errors", required = true)
    private List<DocumentError> errors;

    /*
     * The statistics property.
     */
    @JsonProperty(value = "statistics")
    private TextBatchStatistics statistics;

    /*
     * This field indicates which model is used for scoring.
     */
    @JsonProperty(value = "modelVersion", required = true)
    private String modelVersion;

    /**
     * Get the documents property: Response by document.
     *
     * @return the documents value.
     */
    public List<DocumentLanguage> getDocuments() {
        return this.documents;
    }

    /**
     * Set the documents property: Response by document.
     *
     * @param documents the documents value to set.
     * @return the LanguageResult object itself.
     */
    public LanguageResult setDocuments(List<DocumentLanguage> documents) {
        this.documents = documents;
        return this;
    }

    /**
     * Get the errors property: Errors by document id.
     *
     * @return the errors value.
     */
    public List<DocumentError> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: Errors by document id.
     *
     * @param errors the errors value to set.
     * @return the LanguageResult object itself.
     */
    public LanguageResult setErrors(List<DocumentError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the statistics property: The statistics property.
     *
     * @return the statistics value.
     */
    public TextBatchStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * Set the statistics property: The statistics property.
     *
     * @param statistics the statistics value to set.
     * @return the LanguageResult object itself.
     */
    public LanguageResult setStatistics(TextBatchStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

    /**
     * Get the modelVersion property: This field indicates which model is used
     * for scoring.
     *
     * @return the modelVersion value.
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion property: This field indicates which model is used
     * for scoring.
     *
     * @param modelVersion the modelVersion value to set.
     * @return the LanguageResult object itself.
     */
    public LanguageResult setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
}
