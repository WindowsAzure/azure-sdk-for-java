// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains an input document to be analyzed by the service.
 */
@Immutable
public final class TextDocumentInput {

    /*
     * A unique, non-empty document identifier.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The input text to process.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * (Optional) This is the 2 letter ISO 639-1 representation of a language.
     * For example, use "en" for English; "es" for Spanish etc. If not set, use
     * "en" for English as default.
     */
    @JsonProperty(value = "language")
    private String language;

    public TextDocumentInput(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public TextDocumentInput(String id, String text, String language) {
        this.id = id;
        this.text = text;
        this.language = language;
    }

    /**
     * Get the id property: A unique, non-empty document identifier.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the text property: The input text to process.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Get the language property: (Optional) This is the 2 letter ISO 639-1
     * representation of a language. For example, use "en" for English; "es"
     * for Spanish etc. If not set, use "en" for English as default.
     *
     * @return the language value.
     */
    public String getLanguage() {
        return this.language;
    }
}
