// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PrivateEndpointConnectionsPutHeaders model.
 */
@Fluent
public final class PrivateEndpointConnectionsPutHeaders {
    /*
     * The Retry-After property.
     */
    @JsonProperty(value = "Retry-After")
    private Integer retryAfter;

    /*
     * The Azure-AsyncOperation property.
     */
    @JsonProperty(value = "Azure-AsyncOperation")
    private String azureAsyncOperation;

    /**
     * Get the retryAfter property: The Retry-After property.
     * 
     * @return the retryAfter value.
     */
    public Integer retryAfter() {
        return this.retryAfter;
    }

    /**
     * Set the retryAfter property: The Retry-After property.
     * 
     * @param retryAfter the retryAfter value to set.
     * @return the PrivateEndpointConnectionsPutHeaders object itself.
     */
    public PrivateEndpointConnectionsPutHeaders withRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

    /**
     * Get the azureAsyncOperation property: The Azure-AsyncOperation property.
     * 
     * @return the azureAsyncOperation value.
     */
    public String azureAsyncOperation() {
        return this.azureAsyncOperation;
    }

    /**
     * Set the azureAsyncOperation property: The Azure-AsyncOperation property.
     * 
     * @param azureAsyncOperation the azureAsyncOperation value to set.
     * @return the PrivateEndpointConnectionsPutHeaders object itself.
     */
    public PrivateEndpointConnectionsPutHeaders withAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
        return this;
    }
}
