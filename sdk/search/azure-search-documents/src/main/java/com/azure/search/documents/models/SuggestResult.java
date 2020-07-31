// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.serializer.JsonSerializer;
import com.azure.search.documents.SearchDocument;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import static com.azure.core.util.serializer.TypeReference.createInstance;
import static com.azure.search.documents.implementation.util.Utility.creatDefaultJsonSerializerInstance;

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
    private SearchDocument additionalProperties;

    /*
     * The text of the suggestion result.
     */
    @JsonProperty(value = "@search.text", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String text;

    @JsonIgnore
    private JsonSerializer jsonSerializer;

    /**
     * Constructor of {@link SuggestResult}.
     *
     * @param text The text of the suggestion result.
     */
    @JsonCreator
    public SuggestResult(
        @JsonProperty(value = "@search.text", required = true, access = JsonProperty.Access.WRITE_ONLY)
            String text) {
        this.text = text;
    }

    /**
     * Get the additionalProperties property: Unmatched properties from the
     * message are deserialized this collection.
     *
     * @param modelClass The model class converts to.
     * @param <T> Convert document to the generic type.
     * @return the additionalProperties value.
     */
    public <T> T getDocument(Class<T> modelClass) {
        if (jsonSerializer == null) {
            jsonSerializer = creatDefaultJsonSerializerInstance();
        }
        ByteArrayOutputStream sourceStream = jsonSerializer.serialize(new ByteArrayOutputStream(),
            additionalProperties);
        return jsonSerializer.deserialize(new ByteArrayInputStream(sourceStream.toByteArray()),
            createInstance(modelClass));
    }

    /**
     * Get the text property: The text of the suggestion result.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }
}
