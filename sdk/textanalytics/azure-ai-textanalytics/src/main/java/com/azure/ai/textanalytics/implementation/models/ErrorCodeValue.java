// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ErrorCodeValue. */
public final class ErrorCodeValue extends ExpandableStringEnum<ErrorCodeValue> {
    /** Static value InvalidRequest for ErrorCodeValue. */
    public static final ErrorCodeValue INVALID_REQUEST = fromString("InvalidRequest");

    /** Static value InvalidArgument for ErrorCodeValue. */
    public static final ErrorCodeValue INVALID_ARGUMENT = fromString("InvalidArgument");

    /** Static value InternalServerError for ErrorCodeValue. */
    public static final ErrorCodeValue INTERNAL_SERVER_ERROR = fromString("InternalServerError");

    /** Static value ServiceUnavailable for ErrorCodeValue. */
    public static final ErrorCodeValue SERVICE_UNAVAILABLE = fromString("ServiceUnavailable");

    /** Static value NotFound for ErrorCodeValue. */
    public static final ErrorCodeValue NOT_FOUND = fromString("NotFound");

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

    /** @return known ErrorCodeValue values. */
    public static Collection<ErrorCodeValue> values() {
        return values(ErrorCodeValue.class);
    }
}
