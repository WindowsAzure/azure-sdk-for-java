// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.data.cosmos;

import com.azure.data.cosmos.internal.ResourceResponse;
import com.azure.data.cosmos.internal.StoredProcedureResponse;

import java.time.Duration;
import java.util.Map;

public class CosmosResponse<T extends Resource> {
    private T properties;
    ResourceResponse resourceResponseWrapper;

    CosmosResponse(ResourceResponse resourceResponse){
        this.resourceResponseWrapper = resourceResponse;
    }
  
    CosmosResponse(T properties){
        this.properties = properties;
    }

    // Only used in CosmosAsyncStoredProcedureResponse compatibility with StoredProcedureResponse
    CosmosResponse(StoredProcedureResponse response) {
    }

    public T properties() {
        return properties;
    }
    
    CosmosResponse<T> properties(T resourceSettings){
        this.properties = resourceSettings;
        return this;
    }

    /**
     * Gets the maximum size limit for this entity (in megabytes (MB) for server resources and in count for master
     * resources).
     *
     * @return the max resource quota.
     */
    public String maxResourceQuota() {
        return resourceResponseWrapper.getMaxResourceQuota();
    }

    /**
     * Gets the current size of this entity (in megabytes (MB) for server resources and in count for master resources)
     *
     * @return the current resource quota usage.
     */
    public String currentResourceQuotaUsage() {
        return resourceResponseWrapper.getCurrentResourceQuotaUsage();
    }

    /**
     * Gets the Activity ID for the request.
     *
     * @return the activity id.
     */
    public String activityId() {
        return resourceResponseWrapper.getActivityId();
    }

    /**
     * Gets the number of index paths (terms) generated by the operation.
     *
     * @return the request charge.
     */
    public double requestCharge() {
        return resourceResponseWrapper.getRequestCharge();
    }

    /**
     * Gets the HTTP status code associated with the response.
     *
     * @return the status code.
     */
    public int statusCode() {
        return resourceResponseWrapper.getStatusCode();
    }

    /**
     * Gets the token used for managing client's consistency requirements.
     *
     * @return the session token.
     */
    public String sessionToken(){
        return resourceResponseWrapper.getSessionToken();
    }

    /**
     * Gets the headers associated with the response.
     *
     * @return the response headers.
     */
    public Map<String, String> responseHeaders() {
        return resourceResponseWrapper.getResponseHeaders();
    }
    
    /**
     * Gets the diagnostics information for the current request to Azure Cosmos DB service.
     *
     * @return diagnostics information for the current request to Azure Cosmos DB service.
     */
    public CosmosResponseDiagnostics cosmosResponseDiagnosticsString() {
        return resourceResponseWrapper.getCosmosResponseDiagnostics();
    }

    /**
     * Gets the end-to-end request latency for the current request to Azure Cosmos DB service.
     *
     * @return end-to-end request latency for the current request to Azure Cosmos DB service.
     */
    public Duration requestLatency() {
        return resourceResponseWrapper.getRequestLatency();
    }    
}
