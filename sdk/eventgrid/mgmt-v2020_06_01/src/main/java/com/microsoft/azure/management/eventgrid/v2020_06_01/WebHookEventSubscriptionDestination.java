/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Information about the webhook destination for an event subscription.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType", defaultImpl = WebHookEventSubscriptionDestination.class)
@JsonTypeName("WebHook")
@JsonFlatten
public class WebHookEventSubscriptionDestination extends EventSubscriptionDestination {
    /**
     * The URL that represents the endpoint of the destination of an event
     * subscription.
     */
    @JsonProperty(value = "properties.endpointUrl")
    private String endpointUrl;

    /**
     * The base URL that represents the endpoint of the destination of an event
     * subscription.
     */
    @JsonProperty(value = "properties.endpointBaseUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String endpointBaseUrl;

    /**
     * Maximum number of events per batch.
     */
    @JsonProperty(value = "properties.maxEventsPerBatch")
    private Integer maxEventsPerBatch;

    /**
     * Preferred batch size in Kilobytes.
     */
    @JsonProperty(value = "properties.preferredBatchSizeInKilobytes")
    private Integer preferredBatchSizeInKilobytes;

    /**
     * The Azure Active Directory Tenant ID to get the access token that will
     * be included as the bearer token in delivery requests.
     */
    @JsonProperty(value = "properties.azureActiveDirectoryTenantId")
    private String azureActiveDirectoryTenantId;

    /**
     * The Azure Active Directory Application ID or URI to get the access token
     * that will be included as the bearer token in delivery requests.
     */
    @JsonProperty(value = "properties.azureActiveDirectoryApplicationIdOrUri")
    private String azureActiveDirectoryApplicationIdOrUri;

    /**
     * Get the URL that represents the endpoint of the destination of an event subscription.
     *
     * @return the endpointUrl value
     */
    public String endpointUrl() {
        return this.endpointUrl;
    }

    /**
     * Set the URL that represents the endpoint of the destination of an event subscription.
     *
     * @param endpointUrl the endpointUrl value to set
     * @return the WebHookEventSubscriptionDestination object itself.
     */
    public WebHookEventSubscriptionDestination withEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
        return this;
    }

    /**
     * Get the base URL that represents the endpoint of the destination of an event subscription.
     *
     * @return the endpointBaseUrl value
     */
    public String endpointBaseUrl() {
        return this.endpointBaseUrl;
    }

    /**
     * Get maximum number of events per batch.
     *
     * @return the maxEventsPerBatch value
     */
    public Integer maxEventsPerBatch() {
        return this.maxEventsPerBatch;
    }

    /**
     * Set maximum number of events per batch.
     *
     * @param maxEventsPerBatch the maxEventsPerBatch value to set
     * @return the WebHookEventSubscriptionDestination object itself.
     */
    public WebHookEventSubscriptionDestination withMaxEventsPerBatch(Integer maxEventsPerBatch) {
        this.maxEventsPerBatch = maxEventsPerBatch;
        return this;
    }

    /**
     * Get preferred batch size in Kilobytes.
     *
     * @return the preferredBatchSizeInKilobytes value
     */
    public Integer preferredBatchSizeInKilobytes() {
        return this.preferredBatchSizeInKilobytes;
    }

    /**
     * Set preferred batch size in Kilobytes.
     *
     * @param preferredBatchSizeInKilobytes the preferredBatchSizeInKilobytes value to set
     * @return the WebHookEventSubscriptionDestination object itself.
     */
    public WebHookEventSubscriptionDestination withPreferredBatchSizeInKilobytes(Integer preferredBatchSizeInKilobytes) {
        this.preferredBatchSizeInKilobytes = preferredBatchSizeInKilobytes;
        return this;
    }

    /**
     * Get the Azure Active Directory Tenant ID to get the access token that will be included as the bearer token in delivery requests.
     *
     * @return the azureActiveDirectoryTenantId value
     */
    public String azureActiveDirectoryTenantId() {
        return this.azureActiveDirectoryTenantId;
    }

    /**
     * Set the Azure Active Directory Tenant ID to get the access token that will be included as the bearer token in delivery requests.
     *
     * @param azureActiveDirectoryTenantId the azureActiveDirectoryTenantId value to set
     * @return the WebHookEventSubscriptionDestination object itself.
     */
    public WebHookEventSubscriptionDestination withAzureActiveDirectoryTenantId(String azureActiveDirectoryTenantId) {
        this.azureActiveDirectoryTenantId = azureActiveDirectoryTenantId;
        return this;
    }

    /**
     * Get the Azure Active Directory Application ID or URI to get the access token that will be included as the bearer token in delivery requests.
     *
     * @return the azureActiveDirectoryApplicationIdOrUri value
     */
    public String azureActiveDirectoryApplicationIdOrUri() {
        return this.azureActiveDirectoryApplicationIdOrUri;
    }

    /**
     * Set the Azure Active Directory Application ID or URI to get the access token that will be included as the bearer token in delivery requests.
     *
     * @param azureActiveDirectoryApplicationIdOrUri the azureActiveDirectoryApplicationIdOrUri value to set
     * @return the WebHookEventSubscriptionDestination object itself.
     */
    public WebHookEventSubscriptionDestination withAzureActiveDirectoryApplicationIdOrUri(String azureActiveDirectoryApplicationIdOrUri) {
        this.azureActiveDirectoryApplicationIdOrUri = azureActiveDirectoryApplicationIdOrUri;
        return this;
    }

}
