// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * The object returned when calling List Queues on a Queue Service.
 */
@JacksonXmlRootElement(localName = "EnumerationResults")
public final class ListQueuesSegmentResponse {
    /*
     * The serviceEndpoint property.
     */
    @JacksonXmlProperty(localName = "ServiceEndpoint", isAttribute = true)
    private String serviceEndpoint;

    /*
     * The prefix property.
     */
    @JsonProperty(value = "Prefix", required = true)
    private String prefix;

    /*
     * The marker property.
     */
    @JsonProperty(value = "Marker")
    private String marker;

    /*
     * The maxResults property.
     */
    @JsonProperty(value = "MaxResults", required = true)
    private int maxResults;

    private static final class QueuesWrapper {
        @JacksonXmlProperty(localName = "Queue")
        private final List<QueueItem> items;

        @JsonCreator
        private QueuesWrapper(@JacksonXmlProperty(localName = "Queue") List<QueueItem> items) {
            this.items = items;
        }
    }

    /*
     * The queueItems property.
     */
    @JsonProperty(value = "Queues")
    private QueuesWrapper queueItems;

    /*
     * The nextMarker property.
     */
    @JsonProperty(value = "NextMarker", required = true)
    private String nextMarker;

    /**
     * Get the serviceEndpoint property: The serviceEndpoint property.
     *
     * @return the serviceEndpoint value.
     */
    public String serviceEndpoint() {
        return this.serviceEndpoint;
    }

    /**
     * Set the serviceEndpoint property: The serviceEndpoint property.
     *
     * @param serviceEndpoint the serviceEndpoint value to set.
     * @return the ListQueuesSegmentResponse object itself.
     */
    public ListQueuesSegmentResponse serviceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }

    /**
     * Get the prefix property: The prefix property.
     *
     * @return the prefix value.
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The prefix property.
     *
     * @param prefix the prefix value to set.
     * @return the ListQueuesSegmentResponse object itself.
     */
    public ListQueuesSegmentResponse prefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the marker property: The marker property.
     *
     * @return the marker value.
     */
    public String marker() {
        return this.marker;
    }

    /**
     * Set the marker property: The marker property.
     *
     * @param marker the marker value to set.
     * @return the ListQueuesSegmentResponse object itself.
     */
    public ListQueuesSegmentResponse marker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Get the maxResults property: The maxResults property.
     *
     * @return the maxResults value.
     */
    public int maxResults() {
        return this.maxResults;
    }

    /**
     * Set the maxResults property: The maxResults property.
     *
     * @param maxResults the maxResults value to set.
     * @return the ListQueuesSegmentResponse object itself.
     */
    public ListQueuesSegmentResponse maxResults(int maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Get the queueItems property: The queueItems property.
     *
     * @return the queueItems value.
     */
    public List<QueueItem> queueItems() {
        if (this.queueItems == null) {
            this.queueItems = new QueuesWrapper(new ArrayList<QueueItem>());
        }
        return this.queueItems.items;
    }

    /**
     * Set the queueItems property: The queueItems property.
     *
     * @param queueItems the queueItems value to set.
     * @return the ListQueuesSegmentResponse object itself.
     */
    public ListQueuesSegmentResponse queueItems(List<QueueItem> queueItems) {
        this.queueItems = new QueuesWrapper(queueItems);
        return this;
    }

    /**
     * Get the nextMarker property: The nextMarker property.
     *
     * @return the nextMarker value.
     */
    public String nextMarker() {
        return this.nextMarker;
    }

    /**
     * Set the nextMarker property: The nextMarker property.
     *
     * @param nextMarker the nextMarker value to set.
     * @return the ListQueuesSegmentResponse object itself.
     */
    public ListQueuesSegmentResponse nextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}
