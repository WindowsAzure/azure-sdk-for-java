// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The StorageDirectoryCreatedEventData model. */
@Fluent
public final class StorageDirectoryCreatedEventData {
    /*
     * The name of the API/operation that triggered this event.
     */
    @JsonProperty(value = "api")
    private String api;

    /*
     * A request id provided by the client of the storage API operation that
     * triggered this event.
     */
    @JsonProperty(value = "clientRequestId")
    private String clientRequestId;

    /*
     * The request id generated by the storage service for the storage API
     * operation that triggered this event.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /*
     * The etag of the directory at the time this event was triggered.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /*
     * The path to the directory.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * An opaque string value representing the logical sequence of events for
     * any particular directory name. Users can use standard string comparison
     * to understand the relative sequence of two events on the same directory
     * name.
     */
    @JsonProperty(value = "sequencer")
    private String sequencer;

    /*
     * The identity of the requester that triggered this event.
     */
    @JsonProperty(value = "identity")
    private String identity;

    /*
     * For service use only. Diagnostic data occasionally included by the Azure
     * Storage service. This property should be ignored by event consumers.
     */
    @JsonProperty(value = "storageDiagnostics")
    private Object storageDiagnostics;

    /**
     * Get the api property: The name of the API/operation that triggered this event.
     * @return the api value.
     */
    public String getApi() {
        return this.api;
    }

    /**
     * Set the api property: The name of the API/operation that triggered this event.
     * @param api the api value to set.
     *
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData setApi(String api) {
        this.api = api;
        return this;
    }

    /**
     * Get the clientRequestId property: A request id provided by the client of the storage API operation that triggered
     * this event.
     * @return the clientRequestId value.
     */
    public String getClientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: A request id provided by the client of the storage API operation that triggered
     * this event.
     * @param clientRequestId the clientRequestId value to set.
     *
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the requestId property: The request id generated by the storage service for the storage API operation that
     * triggered this event.
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: The request id generated by the storage service for the storage API operation that
     * triggered this event.
     * @param requestId the requestId value to set.
     *
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the eTag property: The etag of the directory at the time this event was triggered.
     * @return the eTag value.
     */
    public String getEtag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The etag of the directory at the time this event was triggered.
     * @param eTag the eTag value to set.
     *
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData setEtag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the url property: The path to the directory.
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The path to the directory.
     * @param url the url value to set.
     *
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the sequencer property: An opaque string value representing the logical sequence of events for any particular
     * directory name. Users can use standard string comparison to understand the relative sequence of two events on the
     * same directory name.
     * @return the sequencer value.
     */
    public String getSequencer() {
        return this.sequencer;
    }

    /**
     * Set the sequencer property: An opaque string value representing the logical sequence of events for any particular
     * directory name. Users can use standard string comparison to understand the relative sequence of two events on the
     * same directory name.
     * @param sequencer the sequencer value to set.
     *
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData setSequencer(String sequencer) {
        this.sequencer = sequencer;
        return this;
    }

    /**
     * Get the identity property: The identity of the requester that triggered this event.
     * @return the identity value.
     */
    public String getIdentity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the requester that triggered this event.
     * @param identity the identity value to set.
     *
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData setIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the storageDiagnostics property: For service use only. Diagnostic data occasionally included by the Azure
     * Storage service. This property should be ignored by event consumers.
     * @return the storageDiagnostics value.
     */
    public Object getStorageDiagnostics() {
        return this.storageDiagnostics;
    }

    /**
     * Set the storageDiagnostics property: For service use only. Diagnostic data occasionally included by the Azure
     * Storage service. This property should be ignored by event consumers.
     * @param storageDiagnostics the storageDiagnostics value to set.
     *
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData setStorageDiagnostics(Object storageDiagnostics) {
        this.storageDiagnostics = storageDiagnostics;
        return this;
    }
}
