// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ErrorCodeValue.
 */
public final class ErrorCodeValue extends ExpandableStringEnum<ErrorCodeValue> {
    /**
     * Enum value invalidRequest.
     */
    public static final ErrorCodeValue INVALID_REQUEST = fromString("invalidRequest");

    /**
     * Enum value invalidArgument.
     */
    public static final ErrorCodeValue INVALID_ARGUMENT = fromString("invalidArgument");

    /**
     * Enum value internalServerError.
     */
    public static final ErrorCodeValue INTERNAL_SERVER_ERROR = fromString("internalServerError");

    /**
     * Enum value serviceUnavailable.
     */
    public static final ErrorCodeValue SERVICE_UNAVAILABLE = fromString("serviceUnavailable");

    /**
     * Enum value invalidParameterValue.
     */
    public static final ErrorCodeValue INVALID_PARAMETER_VALUE = fromString("invalidParameterValue");

    /**
     * Enum value invalidRequestBodyFormat.
     */
    public static final ErrorCodeValue INVALID_REQUEST_BODY_FORMAT = fromString("invalidRequestBodyFormat");

    /**
     * Enum value emptyRequest.
     */
    public static final ErrorCodeValue EMPTY_REQUEST = fromString("emptyRequest");

    /**
     * Enum value missingInputRecords.
     */
    public static final ErrorCodeValue MISSING_INPUT_RECORDS = fromString("missingInputRecords");

    /**
     * Enum value invalidDocument.
     */
    public static final ErrorCodeValue INVALID_DOCUMENT = fromString("invalidDocument");

    /**
     * Enum value modelVersionIncorrect.
     */
    public static final ErrorCodeValue MODEL_VERSION_INCORRECT = fromString("modelVersionIncorrect");

    /**
     * Enum value invalidDocumentBatch.
     */
    public static final ErrorCodeValue INVALID_DOCUMENT_BATCH = fromString("invalidDocumentBatch");

    /**
     * Enum value unsupportedLanguageCode.
     */
    public static final ErrorCodeValue UNSUPPORTED_LANGUAGE_CODE = fromString("unsupportedLanguageCode");

    /**
     * Enum value invalidCountryHint.
     */
    public static final ErrorCodeValue INVALID_COUNTRY_HINT = fromString("invalidCountryHint");

    /**
     * Creates or finds a ErrorCodeValue from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ErrorCodeValue.
     */
    @JsonCreator
    public static ErrorCodeValue fromString(String name) {
        return fromString(name, ErrorCodeValue.class);
    }

}
