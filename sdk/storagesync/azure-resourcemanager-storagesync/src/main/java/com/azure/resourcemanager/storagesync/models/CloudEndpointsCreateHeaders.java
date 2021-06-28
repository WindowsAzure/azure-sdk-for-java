// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CloudEndpointsCreateHeaders model. */
@Fluent
public final class CloudEndpointsCreateHeaders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CloudEndpointsCreateHeaders.class);

    /*
     * The Retry-After property.
     */
    @JsonProperty(value = "Retry-After")
    private String retryAfter;

    /*
     * The Azure-AsyncOperation property.
     */
    @JsonProperty(value = "Azure-AsyncOperation")
    private String azureAsyncOperation;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-correlation-request-id property.
     */
    @JsonProperty(value = "x-ms-correlation-request-id")
    private String xMsCorrelationRequestId;

    /*
     * The Location property.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Get the retryAfter property: The Retry-After property.
     *
     * @return the retryAfter value.
     */
    public String retryAfter() {
        return this.retryAfter;
    }

    /**
     * Set the retryAfter property: The Retry-After property.
     *
     * @param retryAfter the retryAfter value to set.
     * @return the CloudEndpointsCreateHeaders object itself.
     */
    public CloudEndpointsCreateHeaders withRetryAfter(String retryAfter) {
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
     * @return the CloudEndpointsCreateHeaders object itself.
     */
    public CloudEndpointsCreateHeaders withAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String xMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the CloudEndpointsCreateHeaders object itself.
     */
    public CloudEndpointsCreateHeaders withXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsCorrelationRequestId property: The x-ms-correlation-request-id property.
     *
     * @return the xMsCorrelationRequestId value.
     */
    public String xMsCorrelationRequestId() {
        return this.xMsCorrelationRequestId;
    }

    /**
     * Set the xMsCorrelationRequestId property: The x-ms-correlation-request-id property.
     *
     * @param xMsCorrelationRequestId the xMsCorrelationRequestId value to set.
     * @return the CloudEndpointsCreateHeaders object itself.
     */
    public CloudEndpointsCreateHeaders withXMsCorrelationRequestId(String xMsCorrelationRequestId) {
        this.xMsCorrelationRequestId = xMsCorrelationRequestId;
        return this;
    }

    /**
     * Get the location property: The Location property.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The Location property.
     *
     * @param location the location value to set.
     * @return the CloudEndpointsCreateHeaders object itself.
     */
    public CloudEndpointsCreateHeaders withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
