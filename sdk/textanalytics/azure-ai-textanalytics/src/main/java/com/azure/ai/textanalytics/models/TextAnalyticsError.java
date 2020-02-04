// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Immutable;

/**
 * The TextAnalyticsError model.
 */
@Immutable
public final class TextAnalyticsError {
    /*
     * Error code. Possible values include: 'invalidRequest',
     * 'invalidArgument', 'internalServerError', 'serviceUnavailable'
     */
    private final TextAnalyticsErrorCode code;

    /*
     * Error message.
     */
    private final String message;

    /*
     * Error target.
     */
    private final String target;

    /**
     * Creates a {@code TextAnalyticsError} model that describes text analytics error.
     *  @param code error code
     * @param message error message
     * @param target error target
     */
    public TextAnalyticsError(TextAnalyticsErrorCode code, String message, String target) {
        this.code = code;
        this.message = message;
        this.target = target;
    }

    /**
     * Get the code property: Error code. Possible values include:
     * 'invalidRequest', 'invalidArgument', 'internalServerError',
     * 'serviceUnavailable'.
     *
     * @return the code value.
     */
    public TextAnalyticsErrorCode getCode() {
        return this.code;
    }

    /**
     * Get the message property: Error message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: Error target.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }
}
