/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for Get Operation Details operation.
 */
public class GetOperationDetailsHeaders {
    /**
     * Indicates how long the client should wait before sending a follow up
     * request. The header will be present only if the operation is running or
     * has not started yet.
     */
    @JsonProperty(value = "RetryAfter")
    private Integer retryAfter;

    /**
     * Get indicates how long the client should wait before sending a follow up request. The header will be present only if the operation is running or has not started yet.
     *
     * @return the retryAfter value
     */
    public Integer retryAfter() {
        return this.retryAfter;
    }

    /**
     * Set indicates how long the client should wait before sending a follow up request. The header will be present only if the operation is running or has not started yet.
     *
     * @param retryAfter the retryAfter value to set
     * @return the GetOperationDetailsHeaders object itself.
     */
    public GetOperationDetailsHeaders withRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

}
