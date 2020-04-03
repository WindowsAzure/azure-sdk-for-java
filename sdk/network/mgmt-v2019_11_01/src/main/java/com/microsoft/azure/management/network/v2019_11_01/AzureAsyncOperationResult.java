/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response body contains the status of the specified asynchronous
 * operation, indicating whether it has succeeded, is in progress, or has
 * failed. Note that this status is distinct from the HTTP status code returned
 * for the Get Operation Status operation itself. If the asynchronous operation
 * succeeded, the response body includes the HTTP status code for the
 * successful request. If the asynchronous operation failed, the response body
 * includes the HTTP status code for the failed request and error information
 * regarding the failure.
 */
public class AzureAsyncOperationResult {
    /**
     * Status of the Azure async operation. Possible values include:
     * 'InProgress', 'Succeeded', 'Failed'.
     */
    @JsonProperty(value = "status")
    private NetworkOperationStatus status;

    /**
     * Details of the error occurred during specified asynchronous operation.
     */
    @JsonProperty(value = "error")
    private Error error;

    /**
     * Get status of the Azure async operation. Possible values include: 'InProgress', 'Succeeded', 'Failed'.
     *
     * @return the status value
     */
    public NetworkOperationStatus status() {
        return this.status;
    }

    /**
     * Set status of the Azure async operation. Possible values include: 'InProgress', 'Succeeded', 'Failed'.
     *
     * @param status the status value to set
     * @return the AzureAsyncOperationResult object itself.
     */
    public AzureAsyncOperationResult withStatus(NetworkOperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get details of the error occurred during specified asynchronous operation.
     *
     * @return the error value
     */
    public Error error() {
        return this.error;
    }

    /**
     * Set details of the error occurred during specified asynchronous operation.
     *
     * @param error the error value to set
     * @return the AzureAsyncOperationResult object itself.
     */
    public AzureAsyncOperationResult withError(Error error) {
        this.error = error;
        return this;
    }

}
