// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Immutable;

import java.util.List;

/**
 * The TextAnalyticsError model.
 */
@Immutable
public final class TextAnalyticsError {
    /*
     * Error code. Possible values include: 'invalidRequest',
     * 'invalidArgument', 'internalServerError', 'serviceUnavailable'
     */
    private final ErrorCodeValue code;

    /*
     * Error message.
     */
    private final String message;

    /*
     * Error target.
     */
    private final String target;

    /*
     * Inner error contains more specific information.
     */
    private final InnerError innerError;

    /*
     * Details about specific errors that led to this reported error.
     */
    private final List<TextAnalyticsError> details;

    public TextAnalyticsError(ErrorCodeValue code, String message, String target, InnerError innerError,
        List<TextAnalyticsError> details) {
        this.code = code;
        this.message = message;
        this.target = target;
        this.innerError = innerError;
        this.details = details;
    }

    /**
     * Get the code property: Error code. Possible values include:
     * 'invalidRequest', 'invalidArgument', 'internalServerError',
     * 'serviceUnavailable'.
     *
     * @return the code value.
     */
    public ErrorCodeValue getCode() {
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

    // TODO: spotbugs errors. infinite call
//    /**
//     * Get the innerError property: Inner error contains more specific
//     * information.
//     *
//     * @return the innerError value.
//     */
//    public InnerError getInnerError() {
//        return this.innerError;
//    }

    /**
     * Get the details property: Details about specific errors that led to this
     * reported error.
     *
     * @return the details value.
     */
    public List<TextAnalyticsError> getDetails() {
        return this.details;
    }
}
