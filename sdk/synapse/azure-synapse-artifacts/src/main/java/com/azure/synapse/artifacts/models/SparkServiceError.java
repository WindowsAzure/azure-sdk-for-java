// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SparkServiceError model. */
@Fluent
public final class SparkServiceError {
    /*
     * The message property.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "errorCode")
    private String errorCode;

    /*
     * The source property.
     */
    @JsonProperty(value = "source")
    private SparkErrorSource source;

    /**
     * Get the message property: The message property.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The message property.
     *
     * @param message the message value to set.
     * @return the SparkServiceError object itself.
     */
    public SparkServiceError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the SparkServiceError object itself.
     */
    public SparkServiceError setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the source property: The source property.
     *
     * @return the source value.
     */
    public SparkErrorSource getSource() {
        return this.source;
    }

    /**
     * Set the source property: The source property.
     *
     * @param source the source value to set.
     * @return the SparkServiceError object itself.
     */
    public SparkServiceError setSource(SparkErrorSource source) {
        this.source = source;
        return this;
    }
}
