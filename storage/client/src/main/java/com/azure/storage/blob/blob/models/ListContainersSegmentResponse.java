// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.azure.storage.blob.models.ContainerItem;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * An enumeration of containers.
 */
@JacksonXmlRootElement(localName = "EnumerationResults")
public final class ListContainersSegmentResponse {
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

    private static final class ContainersWrapper {
        @JacksonXmlProperty(localName = "Container")
        private final List<com.azure.storage.blob.models.ContainerItem> items;

        @JsonCreator
        private ContainersWrapper(@JacksonXmlProperty(localName = "Container") List<com.azure.storage.blob.models.ContainerItem> items) {
            this.items = items;
        }
    }

    /*
     * The containerItems property.
     */
    @JsonProperty(value = "Containers", required = true)
    private ContainersWrapper containerItems;

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
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse serviceEndpoint(String serviceEndpoint) {
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
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse prefix(String prefix) {
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
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse marker(String marker) {
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
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse maxResults(int maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Get the containerItems property: The containerItems property.
     *
     * @return the containerItems value.
     */
    public List<com.azure.storage.blob.models.ContainerItem> containerItems() {
        if (this.containerItems == null) {
            this.containerItems = new ContainersWrapper(new ArrayList<com.azure.storage.blob.models.ContainerItem>());
        }
        return this.containerItems.items;
    }

    /**
     * Set the containerItems property: The containerItems property.
     *
     * @param containerItems the containerItems value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse containerItems(List<ContainerItem> containerItems) {
        this.containerItems = new ContainersWrapper(containerItems);
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
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse nextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}
