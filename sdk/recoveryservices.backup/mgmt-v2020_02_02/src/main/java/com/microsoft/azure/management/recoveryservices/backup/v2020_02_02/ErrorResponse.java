/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error Response.
 * Common error response for all Azure Resource Manager APIs to return error
 * details for failed operations. (This also follows the OData error response
 * format.).
 */
public class ErrorResponse {
    /**
     * The error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * The error message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * The error target.
     */
    @JsonProperty(value = "target", access = JsonProperty.Access.WRITE_ONLY)
    private String target;

    /**
     * The error details.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private List<ErrorResponse> details;

    /**
     * The error additional info.
     */
    @JsonProperty(value = "additionalInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<ErrorAdditionalInfo> additionalInfo;

    /**
     * Get the error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the error target.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Get the error details.
     *
     * @return the details value
     */
    public List<ErrorResponse> details() {
        return this.details;
    }

    /**
     * Get the error additional info.
     *
     * @return the additionalInfo value
     */
    public List<ErrorAdditionalInfo> additionalInfo() {
        return this.additionalInfo;
    }

}
