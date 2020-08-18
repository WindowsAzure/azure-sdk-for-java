// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SearchError model. */
@Immutable
public final class SearchError {
    /*
     * One of a server-defined set of error codes.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * A human-readable representation of the error.
     */
    @JsonProperty(value = "message", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * An array of details about specific errors that led to this reported
     * error.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchError> details;

    /** Creates an instance of SearchError class. */
    @JsonCreator
    public SearchError(
            @JsonProperty(value = "message", required = true, access = JsonProperty.Access.WRITE_ONLY) String message) {
        this.message = message;
    }

    /**
     * Get the code property: One of a server-defined set of error codes.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A human-readable representation of the error.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the details property: An array of details about specific errors that led to this reported error.
     *
     * @return the details value.
     */
    public List<SearchError> getDetails() {
        return this.details;
    }
}
