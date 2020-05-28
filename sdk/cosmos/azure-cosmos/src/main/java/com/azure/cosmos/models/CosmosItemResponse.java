// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.models;

import com.azure.cosmos.CosmosDiagnostics;
import com.azure.cosmos.implementation.CosmosItemProperties;

import java.time.Duration;
import java.util.Map;

/**
 * The synchronous Cosmos item response. Contains methods to access the Item and other response methods
 *
 * @param <T> the type parameter
 */
public class CosmosItemResponse<T> {
    private final CosmosAsyncItemResponse<T> responseWrapper;

    CosmosItemResponse(CosmosAsyncItemResponse<T> response) {
        this.responseWrapper = response;
    }

    /**
     * Gets resource.
     *
     * @return the resource
     */
    public T getItem() {
        return responseWrapper.getItem();
    }

    /**
     * Gets the itemSettings
     *
     * @return the itemSettings
     */
    CosmosItemProperties getProperties() {
        return responseWrapper.getProperties();
    }

    /**
     * Gets the maximum size limit for this entity (in megabytes (MB) for server resources and in count for master
     * resources).
     *
     * @return the max resource quota.
     */
    public String getMaxResourceQuota() {
        return responseWrapper.getMaxResourceQuota();
    }

    /**
     * Gets the current size of this entity (in megabytes (MB) for server resources and in count for master resources)
     *
     * @return the current resource quota usage.
     */
    public String getCurrentResourceQuotaUsage() {
        return responseWrapper.getCurrentResourceQuotaUsage();
    }

    /**
     * Gets the Activity ID for the request.
     *
     * @return the activity getId.
     */
    public String getActivityId() {
        return responseWrapper.getActivityId();
    }

    /**
     * Gets the request charge as request units (RU) consumed by the operation.
     * <p>
     * For more information about the RU and factors that can impact the effective charges please visit
     * <a href="https://docs.microsoft.com/en-us/azure/cosmos-db/request-units">Request Units in Azure Cosmos DB</a>
     *
     * @return the request charge.
     */
    public double getRequestCharge() {
        return responseWrapper.getRequestCharge();
    }

    /**
     * Gets the HTTP status code associated with the response.
     *
     * @return the status code.
     */
    public int getStatusCode() {
        return responseWrapper.getStatusCode();
    }

    /**
     * Gets the token used for managing client's consistency requirements.
     *
     * @return the session token.
     */
    public String getSessionToken() {
        return responseWrapper.getSessionToken();
    }

    /**
     * Gets the headers associated with the response.
     *
     * @return the response headers.
     */
    public Map<String, String> getResponseHeaders() {
        return responseWrapper.getResponseHeaders();
    }

    /**
     * Gets the diagnostics information for the current request to Azure Cosmos DB service.
     *
     * @return diagnostics information for the current request to Azure Cosmos DB service.
     */
    public CosmosDiagnostics getDiagnostics() {
        return responseWrapper.getDiagnostics();
    }

    /**
     * Gets the end-to-end request latency for the current request to Azure Cosmos DB service.
     *
     * @return end-to-end request latency for the current request to Azure Cosmos DB service.
     */
    public Duration getDuration() {
        return responseWrapper.getDuration();
    }

    /**
     * Gets the ETag from the response headers.
     *
     * Null in case of delete operation.
     *
     * @return ETag
     */
    public String getETag() {
        return responseWrapper.getETag();
    }
}
