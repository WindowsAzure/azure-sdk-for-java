// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.data.generated.models;

import com.azure.core.implementation.annotation.Fluent;
import com.azure.search.data.customization.Document;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A result containing a document found by a suggestion query, plus associated
 * metadata.
 */
@Fluent
public final class SuggestResult {
    /*
     * Unmatched properties from the message are deserialized this collection
     */
    @JsonProperty(value = "")
    private Document additionalProperties;

    /*
     * The text of the suggestion result.
     */
    @JsonProperty(value = "@search.text", access = JsonProperty.Access.WRITE_ONLY)
    private String text;

    /**
     * Get the additionalProperties property: Unmatched properties from the
     * message are deserialized this collection.
     *
     * @return the additionalProperties value.
     */
    public Document additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Unmatched properties from the
     * message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the SuggestResult object itself.
     */
    public SuggestResult additionalProperties(Document additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the text property: The text of the suggestion result.
     *
     * @return the text value.
     */
    public String text() {
        return this.text;
    }
}
