// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CommentFeedbackValue model. */
@Fluent
public final class CommentFeedbackValue {
    /*
     * the comment string
     */
    @JsonProperty(value = "commentValue", required = true)
    private String commentValue;

    /**
     * Get the commentValue property: the comment string.
     *
     * @return the commentValue value.
     */
    public String getCommentValue() {
        return this.commentValue;
    }

    /**
     * Set the commentValue property: the comment string.
     *
     * @param commentValue the commentValue value to set.
     * @return the CommentFeedbackValue object itself.
     */
    public CommentFeedbackValue setCommentValue(String commentValue) {
        this.commentValue = commentValue;
        return this;
    }
}
