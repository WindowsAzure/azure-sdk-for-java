/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The error object. As per Microsoft One API guidelines -
 * https://github.com/Microsoft/api-guidelines/blob/vNext/Guidelines.md#7102-error-condition-responses.
 */
public class Error {
    /**
     * One of a server-defined set of error codes. Possible values include:
     * 'BadArgument', 'Forbidden', 'NotFound', 'KbNotFound', 'Unauthorized',
     * 'Unspecified', 'EndpointKeysError', 'QuotaExceeded', 'QnaRuntimeError',
     * 'SKULimitExceeded', 'OperationNotFound', 'ServiceError',
     * 'ValidationFailure', 'ExtractionFailure'.
     */
    @JsonProperty(value = "code", required = true)
    private ErrorCodeType code;

    /**
     * A human-readable representation of the error.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * The target of the error.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * An array of details about specific errors that led to this reported
     * error.
     */
    @JsonProperty(value = "details")
    private List<Error> details;

    /**
     * An object containing more specific information than the current object
     * about the error.
     */
    @JsonProperty(value = "innerError")
    private InnerErrorModel innerError;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public ErrorCodeType code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the Error object itself.
     */
    public Error withCode(ErrorCodeType code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the Error object itself.
     */
    public Error withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target value.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target value.
     *
     * @param target the target value to set
     * @return the Error object itself.
     */
    public Error withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public List<Error> details() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     * @return the Error object itself.
     */
    public Error withDetails(List<Error> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the innerError value.
     *
     * @return the innerError value
     */
    public InnerErrorModel innerError() {
        return this.innerError;
    }

    /**
     * Set the innerError value.
     *
     * @param innerError the innerError value to set
     * @return the Error object itself.
     */
    public Error withInnerError(InnerErrorModel innerError) {
        this.innerError = innerError;
        return this;
    }

}
