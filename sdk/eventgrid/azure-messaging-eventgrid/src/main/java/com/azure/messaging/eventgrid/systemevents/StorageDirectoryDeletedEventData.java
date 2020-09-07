// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The StorageDirectoryDeletedEventData model. */
@Fluent
public final class StorageDirectoryDeletedEventData {
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
     * The path to the deleted directory.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * Is this event for a recursive delete operation.
     */
    @JsonProperty(value = "recursive")
    private Boolean recursive;

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
     *
     * @return the api value.
     */
    public String getApi() {
        return this.api;
    }

    /**
     * Set the api property: The name of the API/operation that triggered this event.
     *
     * @param api the api value to set.
     * @return the StorageDirectoryDeletedEventData object itself.
     */
    public StorageDirectoryDeletedEventData setApi(String api) {
        this.api = api;
        return this;
    }

    /**
     * Get the clientRequestId property: A request id provided by the client of the storage API operation that triggered
     * this event.
     *
     * @return the clientRequestId value.
     */
    public String getClientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: A request id provided by the client of the storage API operation that triggered
     * this event.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the StorageDirectoryDeletedEventData object itself.
     */
    public StorageDirectoryDeletedEventData setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the requestId property: The request id generated by the storage service for the storage API operation that
     * triggered this event.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: The request id generated by the storage service for the storage API operation that
     * triggered this event.
     *
     * @param requestId the requestId value to set.
     * @return the StorageDirectoryDeletedEventData object itself.
     */
    public StorageDirectoryDeletedEventData setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the url property: The path to the deleted directory.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The path to the deleted directory.
     *
     * @param url the url value to set.
     * @return the StorageDirectoryDeletedEventData object itself.
     */
    public StorageDirectoryDeletedEventData setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the recursive property: Is this event for a recursive delete operation.
     *
     * @return the recursive value.
     */
    public Boolean isRecursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: Is this event for a recursive delete operation.
     *
     * @param recursive the recursive value to set.
     * @return the StorageDirectoryDeletedEventData object itself.
     */
    public StorageDirectoryDeletedEventData setRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the sequencer property: An opaque string value representing the logical sequence of events for any particular
     * directory name. Users can use standard string comparison to understand the relative sequence of two events on the
     * same directory name.
     *
     * @return the sequencer value.
     */
    public String getSequencer() {
        return this.sequencer;
    }

    /**
     * Set the sequencer property: An opaque string value representing the logical sequence of events for any particular
     * directory name. Users can use standard string comparison to understand the relative sequence of two events on the
     * same directory name.
     *
     * @param sequencer the sequencer value to set.
     * @return the StorageDirectoryDeletedEventData object itself.
     */
    public StorageDirectoryDeletedEventData setSequencer(String sequencer) {
        this.sequencer = sequencer;
        return this;
    }

    /**
     * Get the identity property: The identity of the requester that triggered this event.
     *
     * @return the identity value.
     */
    public String getIdentity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the requester that triggered this event.
     *
     * @param identity the identity value to set.
     * @return the StorageDirectoryDeletedEventData object itself.
     */
    public StorageDirectoryDeletedEventData setIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the storageDiagnostics property: For service use only. Diagnostic data occasionally included by the Azure
     * Storage service. This property should be ignored by event consumers.
     *
     * @return the storageDiagnostics value.
     */
    public Object getStorageDiagnostics() {
        return this.storageDiagnostics;
    }

    /**
     * Set the storageDiagnostics property: For service use only. Diagnostic data occasionally included by the Azure
     * Storage service. This property should be ignored by event consumers.
     *
     * @param storageDiagnostics the storageDiagnostics value to set.
     * @return the StorageDirectoryDeletedEventData object itself.
     */
    public StorageDirectoryDeletedEventData setStorageDiagnostics(Object storageDiagnostics) {
        this.storageDiagnostics = storageDiagnostics;
        return this;
    }
}
