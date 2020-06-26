/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.messaging.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema of the Data property of an EventGridEvent for an
 * Microsoft.Web.SlotSwapStarted event.
 */
public class WebSlotSwapStartedEventData {
    /**
     * The appEventTypeDetail property.
     */
    @JsonProperty(value = "appEventTypeDetail")
    private AppEventTypeDetail appEventTypeDetail;

    /**
     * name of the web site that had this event.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The client request id generated by the app service for the site API
     * operation that triggered this event.
     */
    @JsonProperty(value = "clientRequestId")
    private String clientRequestId;

    /**
     * The correlation request id generated by the app service for the site API
     * operation that triggered this event.
     */
    @JsonProperty(value = "correlationRequestId")
    private String correlationRequestId;

    /**
     * The request id generated by the app service for the site API operation
     * that triggered this event.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * HTTP request URL of this operation.
     */
    @JsonProperty(value = "address")
    private String address;

    /**
     * HTTP verb of this operation.
     */
    @JsonProperty(value = "verb")
    private String verb;

    /**
     * Get the appEventTypeDetail value.
     *
     * @return the appEventTypeDetail value
     */
    public AppEventTypeDetail appEventTypeDetail() {
        return this.appEventTypeDetail;
    }

    /**
     * Set the appEventTypeDetail value.
     *
     * @param appEventTypeDetail the appEventTypeDetail value to set
     * @return the WebSlotSwapStartedEventData object itself.
     */
    public WebSlotSwapStartedEventData withAppEventTypeDetail(AppEventTypeDetail appEventTypeDetail) {
        this.appEventTypeDetail = appEventTypeDetail;
        return this;
    }

    /**
     * Get name of the web site that had this event.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the web site that had this event.
     *
     * @param name the name value to set
     * @return the WebSlotSwapStartedEventData object itself.
     */
    public WebSlotSwapStartedEventData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the client request id generated by the app service for the site API operation that triggered this event.
     *
     * @return the clientRequestId value
     */
    public String clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the client request id generated by the app service for the site API operation that triggered this event.
     *
     * @param clientRequestId the clientRequestId value to set
     * @return the WebSlotSwapStartedEventData object itself.
     */
    public WebSlotSwapStartedEventData withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the correlation request id generated by the app service for the site API operation that triggered this event.
     *
     * @return the correlationRequestId value
     */
    public String correlationRequestId() {
        return this.correlationRequestId;
    }

    /**
     * Set the correlation request id generated by the app service for the site API operation that triggered this event.
     *
     * @param correlationRequestId the correlationRequestId value to set
     * @return the WebSlotSwapStartedEventData object itself.
     */
    public WebSlotSwapStartedEventData withCorrelationRequestId(String correlationRequestId) {
        this.correlationRequestId = correlationRequestId;
        return this;
    }

    /**
     * Get the request id generated by the app service for the site API operation that triggered this event.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the request id generated by the app service for the site API operation that triggered this event.
     *
     * @param requestId the requestId value to set
     * @return the WebSlotSwapStartedEventData object itself.
     */
    public WebSlotSwapStartedEventData withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get hTTP request URL of this operation.
     *
     * @return the address value
     */
    public String address() {
        return this.address;
    }

    /**
     * Set hTTP request URL of this operation.
     *
     * @param address the address value to set
     * @return the WebSlotSwapStartedEventData object itself.
     */
    public WebSlotSwapStartedEventData withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get hTTP verb of this operation.
     *
     * @return the verb value
     */
    public String verb() {
        return this.verb;
    }

    /**
     * Set hTTP verb of this operation.
     *
     * @param verb the verb value to set
     * @return the WebSlotSwapStartedEventData object itself.
     */
    public WebSlotSwapStartedEventData withVerb(String verb) {
        this.verb = verb;
        return this;
    }

}
