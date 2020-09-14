// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The WebSlotSwapWithPreviewStartedEventData model. */
@Fluent
public final class WebSlotSwapWithPreviewStartedEventData {
    /*
     * Detail of action on the app.
     */
    @JsonProperty(value = "appEventTypeDetail")
    private AppEventTypeDetail appEventTypeDetail;

    /*
     * name of the web site that had this event.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The client request id generated by the app service for the site API
     * operation that triggered this event.
     */
    @JsonProperty(value = "clientRequestId")
    private String clientRequestId;

    /*
     * The correlation request id generated by the app service for the site API
     * operation that triggered this event.
     */
    @JsonProperty(value = "correlationRequestId")
    private String correlationRequestId;

    /*
     * The request id generated by the app service for the site API operation
     * that triggered this event.
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
     * Get the appEventTypeDetail property: Detail of action on the app.
     *
     * @return the appEventTypeDetail value.
     */
    public AppEventTypeDetail getAppEventTypeDetail() {
        return this.appEventTypeDetail;
    }

    /**
     * Set the appEventTypeDetail property: Detail of action on the app.
     *
     * @param appEventTypeDetail the appEventTypeDetail value to set.
     * @return the WebSlotSwapWithPreviewStartedEventData object itself.
     */
    public WebSlotSwapWithPreviewStartedEventData setAppEventTypeDetail(AppEventTypeDetail appEventTypeDetail) {
        this.appEventTypeDetail = appEventTypeDetail;
        return this;
    }

    /**
     * Get the name property: name of the web site that had this event.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: name of the web site that had this event.
     *
     * @param name the name value to set.
     * @return the WebSlotSwapWithPreviewStartedEventData object itself.
     */
    public WebSlotSwapWithPreviewStartedEventData setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the clientRequestId property: The client request id generated by the app service for the site API operation
     * that triggered this event.
     *
     * @return the clientRequestId value.
     */
    public String getClientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: The client request id generated by the app service for the site API operation
     * that triggered this event.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the WebSlotSwapWithPreviewStartedEventData object itself.
     */
    public WebSlotSwapWithPreviewStartedEventData setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the correlationRequestId property: The correlation request id generated by the app service for the site API
     * operation that triggered this event.
     *
     * @return the correlationRequestId value.
     */
    public String getCorrelationRequestId() {
        return this.correlationRequestId;
    }

    /**
     * Set the correlationRequestId property: The correlation request id generated by the app service for the site API
     * operation that triggered this event.
     *
     * @param correlationRequestId the correlationRequestId value to set.
     * @return the WebSlotSwapWithPreviewStartedEventData object itself.
     */
    public WebSlotSwapWithPreviewStartedEventData setCorrelationRequestId(String correlationRequestId) {
        this.correlationRequestId = correlationRequestId;
        return this;
    }

    /**
     * Get the requestId property: The request id generated by the app service for the site API operation that triggered
     * this event.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: The request id generated by the app service for the site API operation that triggered
     * this event.
     *
     * @param requestId the requestId value to set.
     * @return the WebSlotSwapWithPreviewStartedEventData object itself.
     */
    public WebSlotSwapWithPreviewStartedEventData setRequestId(String requestId) {
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
     * @return the WebSlotSwapWithPreviewStartedEventData object itself.
     */
    public WebSlotSwapWithPreviewStartedEventData setAddress(String address) {
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
     * @return the WebSlotSwapWithPreviewStartedEventData object itself.
     */
    public WebSlotSwapWithPreviewStartedEventData setVerb(String verb) {
        this.verb = verb;
        return this;
    }
}
