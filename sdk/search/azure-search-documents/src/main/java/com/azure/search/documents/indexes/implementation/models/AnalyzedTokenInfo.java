// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonCreator;
=======
>>>>>>> b58ce026c9fe5fc4ad488b3aa7c0985968f73487
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AnalyzedTokenInfo model. */
@Immutable
public final class AnalyzedTokenInfo {
    /*
     * The token returned by the analyzer.
     */
    @JsonProperty(value = "token", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String token;

    /*
     * The index of the first character of the token in the input text.
     */
    @JsonProperty(value = "startOffset", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int startOffset;

    /*
     * The index of the last character of the token in the input text.
     */
    @JsonProperty(value = "endOffset", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int endOffset;

    /*
     * The position of the token in the input text relative to other tokens.
     * The first token in the input text has position 0, the next has position
     * 1, and so on. Depending on the analyzer used, some tokens might have the
     * same position, for example if they are synonyms of each other.
     */
    @JsonProperty(value = "position", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int position;

    /** Creates an instance of AnalyzedTokenInfo class. */
    @JsonCreator
    public AnalyzedTokenInfo(
            @JsonProperty(value = "token") String token,
            @JsonProperty(value = "startOffset") int startOffset,
            @JsonProperty(value = "endOffset") int endOffset,
            @JsonProperty(value = "position") int position) {
        this.token = token;
        this.startOffset = startOffset;
        this.endOffset = endOffset;
        this.position = position;
    }

    /**
     * Get the token property: The token returned by the analyzer.
     *
     * @return the token value.
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Get the startOffset property: The index of the first character of the token in the input text.
     *
     * @return the startOffset value.
     */
    public int getStartOffset() {
        return this.startOffset;
    }

    /**
     * Get the endOffset property: The index of the last character of the token in the input text.
     *
     * @return the endOffset value.
     */
    public int getEndOffset() {
        return this.endOffset;
    }

    /**
     * Get the position property: The position of the token in the input text relative to other tokens. The first token
     * in the input text has position 0, the next has position 1, and so on. Depending on the analyzer used, some tokens
     * might have the same position, for example if they are synonyms of each other.
     *
     * @return the position value.
     */
    public int getPosition() {
        return this.position;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
