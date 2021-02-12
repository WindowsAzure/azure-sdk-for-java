/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class for operation status errors.
 */
public class OperationStatusError {
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
     * The error details.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private List<OperationStatusError> details;

    /**
     * The additional info.
     */
    @JsonProperty(value = "additionalInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<OperationErrorAdditionalInfo> additionalInfo;

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
     * Get the error details.
     *
     * @return the details value
     */
    public List<OperationStatusError> details() {
        return this.details;
    }

    /**
     * Get the additional info.
     *
     * @return the additionalInfo value
     */
    public List<OperationErrorAdditionalInfo> additionalInfo() {
        return this.additionalInfo;
    }

}
