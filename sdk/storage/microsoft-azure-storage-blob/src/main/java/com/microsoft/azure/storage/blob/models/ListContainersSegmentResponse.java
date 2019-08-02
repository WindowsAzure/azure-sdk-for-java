// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.storage.blob.models;

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
    /**
     * The serviceEndpoint property.
     */
    @JacksonXmlProperty(localName = "ServiceEndpoint", isAttribute = true)
    private String serviceEndpoint;

    /**
     * The prefix property.
     */
    @JsonProperty(value = "Prefix")
    private String prefix;

    /**
     * The marker property.
     */
    @JsonProperty(value = "Marker")
    private String marker;

    /**
     * The maxResults property.
     */
    @JsonProperty(value = "MaxResults")
    private Integer maxResults;

    private static final class ContainersWrapper {
        @JacksonXmlProperty(localName = "Container")
        private final List<ContainerItem> items;

        @JsonCreator
        private ContainersWrapper(@JacksonXmlProperty(localName = "Container") List<ContainerItem> items) {
            this.items = items;
        }
    }

    /**
     * The containerItems property.
     */
    @JsonProperty(value = "Containers", required = true)
    private ContainersWrapper containerItems;

    /**
     * The nextMarker property.
     */
    @JsonProperty(value = "NextMarker")
    private String nextMarker;

    /**
     * Get the serviceEndpoint value.
     *
     * @return the serviceEndpoint value.
     */
    public String serviceEndpoint() {
        return this.serviceEndpoint;
    }

    /**
     * Set the serviceEndpoint value.
     *
     * @param serviceEndpoint the serviceEndpoint value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse withServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }

    /**
     * Get the prefix value.
     *
     * @return the prefix value.
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * Set the prefix value.
     *
     * @param prefix the prefix value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the marker value.
     *
     * @return the marker value.
     */
    public String marker() {
        return this.marker;
    }

    /**
     * Set the marker value.
     *
     * @param marker the marker value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Get the maxResults value.
     *
     * @return the maxResults value.
     */
    public Integer maxResults() {
        return this.maxResults;
    }

    /**
     * Set the maxResults value.
     *
     * @param maxResults the maxResults value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Get the containerItems value.
     *
     * @return the containerItems value.
     */
    public List<ContainerItem> containerItems() {
        if (this.containerItems == null) {
            this.containerItems = new ContainersWrapper(new ArrayList<ContainerItem>());
        }
        return this.containerItems.items;
    }

    /**
     * Set the containerItems value.
     *
     * @param containerItems the containerItems value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse withContainerItems(List<ContainerItem> containerItems) {
        this.containerItems = new ContainersWrapper(containerItems);
        return this;
    }

    /**
     * Get the nextMarker value.
     *
     * @return the nextMarker value.
     */
    public String nextMarker() {
        return this.nextMarker;
    }

    /**
     * Set the nextMarker value.
     *
     * @param nextMarker the nextMarker value to set.
     * @return the ListContainersSegmentResponse object itself.
     */
    public ListContainersSegmentResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}
