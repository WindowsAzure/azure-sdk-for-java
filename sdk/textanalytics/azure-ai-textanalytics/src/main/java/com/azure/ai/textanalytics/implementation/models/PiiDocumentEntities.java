// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The PiiDocumentEntities model.
 */
@Fluent
public final class PiiDocumentEntities {
    /*
     * Unique, non-empty document identifier.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Returns redacted text.
     */
    @JsonProperty(value = "redactedText", required = true)
    private String redactedText;

    /*
     * Recognized entities in the document.
     */
    @JsonProperty(value = "entities", required = true)
    private List<Entity> entities;

    /*
     * Warnings encountered while processing document.
     */
    @JsonProperty(value = "warnings", required = true)
    private List<TextAnalyticsWarning> warnings;

    /*
     * if showStats=true was specified in the request this field will contain
     * information about the document payload.
     */
    @JsonProperty(value = "statistics")
    private DocumentStatistics statistics;

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
     * @return the PiiDocumentEntities object itself.
     */
    public PiiDocumentEntities setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the redactedText property: Returns redacted text.
     * 
     * @return the redactedText value.
     */
    public String getRedactedText() {
        return this.redactedText;
    }

    /**
     * Set the redactedText property: Returns redacted text.
     * 
     * @param redactedText the redactedText value to set.
     * @return the PiiDocumentEntities object itself.
     */
    public PiiDocumentEntities setRedactedText(String redactedText) {
        this.redactedText = redactedText;
        return this;
    }

    /**
     * Get the entities property: Recognized entities in the document.
     * 
     * @return the entities value.
     */
    public List<Entity> getEntities() {
        return this.entities;
    }

    /**
     * Set the entities property: Recognized entities in the document.
     * 
     * @param entities the entities value to set.
     * @return the PiiDocumentEntities object itself.
     */
    public PiiDocumentEntities setEntities(List<Entity> entities) {
        this.entities = entities;
        return this;
    }

    /**
     * Get the warnings property: Warnings encountered while processing
     * document.
     * 
     * @return the warnings value.
     */
    public List<TextAnalyticsWarning> getWarnings() {
        return this.warnings;
    }

    /**
     * Set the warnings property: Warnings encountered while processing
     * document.
     * 
     * @param warnings the warnings value to set.
     * @return the PiiDocumentEntities object itself.
     */
    public PiiDocumentEntities setWarnings(List<TextAnalyticsWarning> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Get the statistics property: if showStats=true was specified in the
     * request this field will contain information about the document payload.
     * 
     * @return the statistics value.
     */
    public DocumentStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * Set the statistics property: if showStats=true was specified in the
     * request this field will contain information about the document payload.
     * 
     * @param statistics the statistics value to set.
     * @return the PiiDocumentEntities object itself.
     */
    public PiiDocumentEntities setStatistics(DocumentStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
}
