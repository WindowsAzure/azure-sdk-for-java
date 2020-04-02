// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ErrorResponse model.
 */
@Immutable
public final class ErrorResponse {
    /*
     * The error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * The error message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * The error target.
     */
    @JsonProperty(value = "target", access = JsonProperty.Access.WRITE_ONLY)
    private String target;

    /*
     * The error details.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private List<ErrorResponse> details;

    /*
     * The error additional info.
     */
    @JsonProperty(value = "additionalInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<ErrorAdditionalInfo> additionalInfo;

    /**
     * Get the code property: The error code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message property: The error message.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the target property: The error target.
     * 
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Get the details property: The error details.
     * 
     * @return the details value.
     */
    public List<ErrorResponse> details() {
        return this.details;
    }

    /**
     * Get the additionalInfo property: The error additional info.
     * 
     * @return the additionalInfo value.
     */
    public List<ErrorAdditionalInfo> additionalInfo() {
        return this.additionalInfo;
    }
}
