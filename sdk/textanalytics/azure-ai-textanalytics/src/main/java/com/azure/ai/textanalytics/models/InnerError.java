// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    private String code;

    /*
     * Error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * Error target.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * Inner error contains more specific information.
     */
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /**
     * Get the code property: Error code. Possible values include:
     * 'invalidParameterValue', 'invalidRequestBodyFormat', 'emptyRequest',
     * 'missingInputRecords', 'invalidDocument', 'modelVersionIncorrect',
     * 'invalidDocumentBatch', 'unsupportedLanguageCode', 'invalidCountryHint'.
     *
     * @return the code value.
     */
    public String getCode() {
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
    public InnerError setCode(String code) {
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
     * Get the innererror property: Inner error contains more specific
     * information.
     *
     * @return the innererror value.
     */
    public InnerError getInnererror() {
        return this.innererror;
    }

    /**
     * Set the innererror property: Inner error contains more specific
     * information.
     *
     * @param innererror the innererror value to set.
     * @return the InnerError object itself.
     */
    public InnerError setInnererror(InnerError innererror) {
        this.innererror = innererror;
        return this;
    }
}
