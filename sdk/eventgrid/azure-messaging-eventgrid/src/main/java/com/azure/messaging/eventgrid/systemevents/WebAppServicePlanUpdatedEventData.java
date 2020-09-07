// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The WebAppServicePlanUpdatedEventData model. */
@Fluent
public final class WebAppServicePlanUpdatedEventData {
    /*
     * Detail of action on the app service plan.
     */
    @JsonProperty(value = "appServicePlanEventTypeDetail")
    private AppServicePlanEventTypeDetail appServicePlanEventTypeDetail;

    /*
     * sku of app service plan.
     */
    @JsonProperty(value = "sku")
    private WebAppServicePlanUpdatedEventDataSku sku;

    /*
     * name of the app service plan that had this event.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The client request id generated by the app service for the app service
     * plan API operation that triggered this event.
     */
    @JsonProperty(value = "clientRequestId")
    private String clientRequestId;

    /*
     * The correlation request id generated by the app service for the app
     * service plan API operation that triggered this event.
     */
    @JsonProperty(value = "correlationRequestId")
    private String correlationRequestId;

    /*
     * The request id generated by the app service for the app service plan API
     * operation that triggered this event.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /*
     * HTTP request URL of this operation.
     */
    @JsonProperty(value = "address")
    private String address;

    /*
     * HTTP verb of this operation.
     */
    @JsonProperty(value = "verb")
    private String verb;

    /**
     * Get the appServicePlanEventTypeDetail property: Detail of action on the app service plan.
     *
     * @return the appServicePlanEventTypeDetail value.
     */
    public AppServicePlanEventTypeDetail getAppServicePlanEventTypeDetail() {
        return this.appServicePlanEventTypeDetail;
    }

    /**
     * Set the appServicePlanEventTypeDetail property: Detail of action on the app service plan.
     *
     * @param appServicePlanEventTypeDetail the appServicePlanEventTypeDetail value to set.
     * @return the WebAppServicePlanUpdatedEventData object itself.
     */
    public WebAppServicePlanUpdatedEventData setAppServicePlanEventTypeDetail(
            AppServicePlanEventTypeDetail appServicePlanEventTypeDetail) {
        this.appServicePlanEventTypeDetail = appServicePlanEventTypeDetail;
        return this;
    }

    /**
     * Get the sku property: sku of app service plan.
     *
     * @return the sku value.
     */
    public WebAppServicePlanUpdatedEventDataSku getSku() {
        return this.sku;
    }

    /**
     * Set the sku property: sku of app service plan.
     *
     * @param sku the sku value to set.
     * @return the WebAppServicePlanUpdatedEventData object itself.
     */
    public WebAppServicePlanUpdatedEventData setSku(WebAppServicePlanUpdatedEventDataSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the name property: name of the app service plan that had this event.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: name of the app service plan that had this event.
     *
     * @param name the name value to set.
     * @return the WebAppServicePlanUpdatedEventData object itself.
     */
    public WebAppServicePlanUpdatedEventData setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the clientRequestId property: The client request id generated by the app service for the app service plan API
     * operation that triggered this event.
     *
     * @return the clientRequestId value.
     */
    public String getClientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: The client request id generated by the app service for the app service plan API
     * operation that triggered this event.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the WebAppServicePlanUpdatedEventData object itself.
     */
    public WebAppServicePlanUpdatedEventData setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the correlationRequestId property: The correlation request id generated by the app service for the app
     * service plan API operation that triggered this event.
     *
     * @return the correlationRequestId value.
     */
    public String getCorrelationRequestId() {
        return this.correlationRequestId;
    }

    /**
     * Set the correlationRequestId property: The correlation request id generated by the app service for the app
     * service plan API operation that triggered this event.
     *
     * @param correlationRequestId the correlationRequestId value to set.
     * @return the WebAppServicePlanUpdatedEventData object itself.
     */
    public WebAppServicePlanUpdatedEventData setCorrelationRequestId(String correlationRequestId) {
        this.correlationRequestId = correlationRequestId;
        return this;
    }

    /**
     * Get the requestId property: The request id generated by the app service for the app service plan API operation
     * that triggered this event.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: The request id generated by the app service for the app service plan API operation
     * that triggered this event.
     *
     * @param requestId the requestId value to set.
     * @return the WebAppServicePlanUpdatedEventData object itself.
     */
    public WebAppServicePlanUpdatedEventData setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the address property: HTTP request URL of this operation.
     *
     * @return the address value.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Set the address property: HTTP request URL of this operation.
     *
     * @param address the address value to set.
     * @return the WebAppServicePlanUpdatedEventData object itself.
     */
    public WebAppServicePlanUpdatedEventData setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the verb property: HTTP verb of this operation.
     *
     * @return the verb value.
     */
    public String getVerb() {
        return this.verb;
    }

    /**
     * Set the verb property: HTTP verb of this operation.
     *
     * @param verb the verb value to set.
     * @return the WebAppServicePlanUpdatedEventData object itself.
     */
    public WebAppServicePlanUpdatedEventData setVerb(String verb) {
        this.verb = verb;
        return this;
    }
}
