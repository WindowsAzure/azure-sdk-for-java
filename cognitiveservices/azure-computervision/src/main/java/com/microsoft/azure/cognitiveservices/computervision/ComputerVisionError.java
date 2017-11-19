/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.computervision;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ComputerVisionError model.
 */
public class ComputerVisionError {
    /**
     * The error code. Possible values include: 'InvalidImageUrl',
     * 'InvalidImageFormat', 'InvalidImageSize', 'NotSupportedVisualFeature',
     * 'NotSupportedImage', 'InvalidDetails', 'NotSupportedLanguage',
     * 'BadArgument', 'FailedToProcess', 'Timeout', 'InternalServerError',
     * 'Unspecified', 'StorageException'.
     */
    @JsonProperty(value = "code", required = true)
    private ComputerVisionErrorCodes code;

    /**
     * A message explaining the error reported by the service.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /**
     * A unique request identifier.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public ComputerVisionErrorCodes code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the ComputerVisionError object itself.
     */
    public ComputerVisionError withCode(ComputerVisionErrorCodes code) {
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
     * @return the ComputerVisionError object itself.
     */
    public ComputerVisionError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set
     * @return the ComputerVisionError object itself.
     */
    public ComputerVisionError withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

}
