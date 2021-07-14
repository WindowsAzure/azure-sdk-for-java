// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of the status of an operation. */
@Immutable
public final class LatestOperationResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LatestOperationResult.class);

    /*
     * The current status of the operation.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * Error code on failure.
     */
    @JsonProperty(value = "errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private String errorCode;

    /*
     * The error message.
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /*
     * Request URI of the operation.
     */
    @JsonProperty(value = "requestUri", access = JsonProperty.Access.WRITE_ONLY)
    private String requestUri;

    /*
     * The HttpMethod - PUT/POST/DELETE for the operation.
     */
    @JsonProperty(value = "httpMethod", access = JsonProperty.Access.WRITE_ONLY)
    private String httpMethod;

    /*
     * The URL to use to check long-running operation status
     */
    @JsonProperty(value = "operationUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String operationUrl;

    /**
     * Get the status property: The current status of the operation.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the errorCode property: Error code on failure.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Get the errorMessage property: The error message.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the requestUri property: Request URI of the operation.
     *
     * @return the requestUri value.
     */
    public String requestUri() {
        return this.requestUri;
    }

    /**
     * Get the httpMethod property: The HttpMethod - PUT/POST/DELETE for the operation.
     *
     * @return the httpMethod value.
     */
    public String httpMethod() {
        return this.httpMethod;
    }

    /**
     * Get the operationUrl property: The URL to use to check long-running operation status.
     *
     * @return the operationUrl value.
     */
    public String operationUrl() {
        return this.operationUrl;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
