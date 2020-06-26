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
 * Microsoft.Storage.DirectoryCreated event.
 */
public class StorageDirectoryCreatedEventData {
    /**
     * The name of the API/operation that triggered this event.
     */
    @JsonProperty(value = "api")
    private String api;

    /**
     * A request id provided by the client of the storage API operation that
     * triggered this event.
     */
    @JsonProperty(value = "clientRequestId")
    private String clientRequestId;

    /**
     * The request id generated by the storage service for the storage API
     * operation that triggered this event.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * The etag of the directory at the time this event was triggered.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * The path to the directory.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * An opaque string value representing the logical sequence of events for
     * any particular directory name. Users can use standard string comparison
     * to understand the relative sequence of two events on the same directory
     * name.
     */
    @JsonProperty(value = "sequencer")
    private String sequencer;

    /**
     * The identity of the requester that triggered this event.
     */
    @JsonProperty(value = "identity")
    private String identity;

    /**
     * For service use only. Diagnostic data occasionally included by the Azure
     * Storage service. This property should be ignored by event consumers.
     */
    @JsonProperty(value = "storageDiagnostics")
    private Object storageDiagnostics;

    /**
     * Get the name of the API/operation that triggered this event.
     *
     * @return the api value
     */
    public String api() {
        return this.api;
    }

    /**
     * Set the name of the API/operation that triggered this event.
     *
     * @param api the api value to set
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData withApi(String api) {
        this.api = api;
        return this;
    }

    /**
     * Get a request id provided by the client of the storage API operation that triggered this event.
     *
     * @return the clientRequestId value
     */
    public String clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set a request id provided by the client of the storage API operation that triggered this event.
     *
     * @param clientRequestId the clientRequestId value to set
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the request id generated by the storage service for the storage API operation that triggered this event.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the request id generated by the storage service for the storage API operation that triggered this event.
     *
     * @param requestId the requestId value to set
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the etag of the directory at the time this event was triggered.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the etag of the directory at the time this event was triggered.
     *
     * @param eTag the eTag value to set
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the path to the directory.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the path to the directory.
     *
     * @param url the url value to set
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get an opaque string value representing the logical sequence of events for any particular directory name. Users can use standard string comparison to understand the relative sequence of two events on the same directory name.
     *
     * @return the sequencer value
     */
    public String sequencer() {
        return this.sequencer;
    }

    /**
     * Set an opaque string value representing the logical sequence of events for any particular directory name. Users can use standard string comparison to understand the relative sequence of two events on the same directory name.
     *
     * @param sequencer the sequencer value to set
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData withSequencer(String sequencer) {
        this.sequencer = sequencer;
        return this;
    }

    /**
     * Get the identity of the requester that triggered this event.
     *
     * @return the identity value
     */
    public String identity() {
        return this.identity;
    }

    /**
     * Set the identity of the requester that triggered this event.
     *
     * @param identity the identity value to set
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get for service use only. Diagnostic data occasionally included by the Azure Storage service. This property should be ignored by event consumers.
     *
     * @return the storageDiagnostics value
     */
    public Object storageDiagnostics() {
        return this.storageDiagnostics;
    }

    /**
     * Set for service use only. Diagnostic data occasionally included by the Azure Storage service. This property should be ignored by event consumers.
     *
     * @param storageDiagnostics the storageDiagnostics value to set
     * @return the StorageDirectoryCreatedEventData object itself.
     */
    public StorageDirectoryCreatedEventData withStorageDiagnostics(Object storageDiagnostics) {
        this.storageDiagnostics = storageDiagnostics;
        return this;
    }

}
