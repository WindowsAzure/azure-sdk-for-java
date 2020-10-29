// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureApplicationInsightsParameter model. */
@Fluent
public final class AzureApplicationInsightsParameter {
    /*
     * Azure cloud environment
     */
    @JsonProperty(value = "azureCloud", required = true)
    private String azureCloud;

    /*
     * Azure Application Insights ID
     */
    @JsonProperty(value = "applicationId", required = true)
    private String applicationId;

    /*
     * API Key
     */
    @JsonProperty(value = "apiKey", required = true)
    private String apiKey;

    /*
     * Query
     */
    @JsonProperty(value = "query", required = true)
    private String query;

    /**
     * Get the azureCloud property: Azure cloud environment.
     *
     * @return the azureCloud value.
     */
    public String getAzureCloud() {
        return this.azureCloud;
    }

    /**
     * Set the azureCloud property: Azure cloud environment.
     *
     * @param azureCloud the azureCloud value to set.
     * @return the AzureApplicationInsightsParameter object itself.
     */
    public AzureApplicationInsightsParameter setAzureCloud(String azureCloud) {
        this.azureCloud = azureCloud;
        return this;
    }

    /**
     * Get the applicationId property: Azure Application Insights ID.
     *
     * @return the applicationId value.
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: Azure Application Insights ID.
     *
     * @param applicationId the applicationId value to set.
     * @return the AzureApplicationInsightsParameter object itself.
     */
    public AzureApplicationInsightsParameter setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the apiKey property: API Key.
     *
     * @return the apiKey value.
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * Set the apiKey property: API Key.
     *
     * @param apiKey the apiKey value to set.
     * @return the AzureApplicationInsightsParameter object itself.
     */
    public AzureApplicationInsightsParameter setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Get the query property: Query.
     *
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: Query.
     *
     * @param query the query value to set.
     * @return the AzureApplicationInsightsParameter object itself.
     */
    public AzureApplicationInsightsParameter setQuery(String query) {
        this.query = query;
        return this;
    }
}
