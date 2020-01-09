// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The InnerError model.
 */
@Fluent
public final class InnerError {
    /*
     * Error code. Possible values include: 'invalidParameterValue',
     * 'invalidRequestBodyFormat', 'emptyRequest', 'missingInputRecords',
     * 'invalidDocument', 'modelVersionIncorrect', 'invalidDocumentBatch',
     * 'unsupportedLanguageCode', 'invalidCountryHint'
     */
    @JsonProperty(value = "code", required = true)
    private InnerErrorCodeValue code;

    /*
     * Error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * Error details.
     */
    @JsonProperty(value = "details")
    private Map<String, String> details;

    /*
     * Error target.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * Inner error contains more specific information.
     */
    @JsonProperty(value = "innerError")
    private InnerError innerError;

    /**
     * Get the code property: Error code. Possible values include:
     * 'invalidParameterValue', 'invalidRequestBodyFormat', 'emptyRequest',
     * 'missingInputRecords', 'invalidDocument', 'modelVersionIncorrect',
     * 'invalidDocumentBatch', 'unsupportedLanguageCode', 'invalidCountryHint'.
     *
     * @return the code value.
     */
    public InnerErrorCodeValue getCode() {
        return this.code;
    }

    /**
     * Set the code property: Error code. Possible values include:
     * 'invalidParameterValue', 'invalidRequestBodyFormat', 'emptyRequest',
     * 'missingInputRecords', 'invalidDocument', 'modelVersionIncorrect',
     * 'invalidDocumentBatch', 'unsupportedLanguageCode', 'invalidCountryHint'.
     *
     * @param code the code value to set.
     * @return the InnerError object itself.
     */
    public InnerError setCode(InnerErrorCodeValue code) {
        this.code = code;
        return this;
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
     * Set the message property: Error message.
     *
     * @param message the message value to set.
     * @return the InnerError object itself.
     */
    public InnerError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the details property: Error details.
     *
     * @return the details value.
     */
    public Map<String, String> getDetails() {
        return this.details;
    }

    /**
     * Set the details property: Error details.
     *
     * @param details the details value to set.
     * @return the InnerError object itself.
     */
    public InnerError setDetails(Map<String, String> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the target property: Error target.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: Error target.
     *
     * @param target the target value to set.
     * @return the InnerError object itself.
     */
    public InnerError setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the innerError property: Inner error contains more specific
     * information.
     *
     * @return the innerError value.
     */
    public InnerError getInnerError() {
        return this.innerError;
    }

    /**
     * Set the innerError property: Inner error contains more specific
     * information.
     *
     * @param innerError the innerError value to set.
     * @return the InnerError object itself.
     */
    public InnerError setInnerError(InnerError innerError) {
        this.innerError = innerError;
        return this;
    }
}
