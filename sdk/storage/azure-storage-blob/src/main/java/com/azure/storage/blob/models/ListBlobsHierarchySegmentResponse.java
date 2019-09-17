// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * An enumeration of blobs.
 */
@JacksonXmlRootElement(localName = "EnumerationResults")
@Fluent
public final class ListBlobsHierarchySegmentResponse {
    /*
     * The serviceEndpoint property.
     */
    @JacksonXmlProperty(localName = "ServiceEndpoint", isAttribute = true)
    private String serviceEndpoint;

    /*
     * The containerName property.
     */
    @JacksonXmlProperty(localName = "ContainerName", isAttribute = true)
    private String containerName;

    /*
     * The prefix property.
     */
    @JsonProperty(value = "Prefix", required = true)
    private String prefix;

    /*
     * The marker property.
     */
    @JsonProperty(value = "Marker", required = true)
    private String marker;

    /*
     * The maxResults property.
     */
    @JsonProperty(value = "MaxResults", required = true)
    private int maxResults;

    /*
     * The delimiter property.
     */
    @JsonProperty(value = "Delimiter", required = true)
    private String delimiter;

    /*
     * The segment property.
     */
    @JsonProperty(value = "Blobs", required = true)
    private BlobHierarchyListSegment segment;

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
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

    /**
     * Set the serviceEndpoint property: The serviceEndpoint property.
     *
     * @param serviceEndpoint the serviceEndpoint value to set.
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }

    /**
     * Get the containerName property: The containerName property.
     *
     * @return the containerName value.
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: The containerName property.
     *
     * @param containerName the containerName value to set.
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the prefix property: The prefix property.
     *
     * @return the prefix value.
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The prefix property.
     *
     * @param prefix the prefix value to set.
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the marker property: The marker property.
     *
     * @return the marker value.
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * Set the marker property: The marker property.
     *
     * @param marker the marker value to set.
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Get the maxResults property: The maxResults property.
     *
     * @return the maxResults value.
     */
    public int getMaxResults() {
        return this.maxResults;
    }

    /**
     * Set the maxResults property: The maxResults property.
     *
     * @param maxResults the maxResults value to set.
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setMaxResults(int maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Get the delimiter property: The delimiter property.
     *
     * @return the delimiter value.
     */
    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * Set the delimiter property: The delimiter property.
     *
     * @param delimiter the delimiter value to set.
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * Get the segment property: The segment property.
     *
     * @return the segment value.
     */
    public BlobHierarchyListSegment getSegment() {
        return this.segment;
    }

    /**
     * Set the segment property: The segment property.
     *
     * @param segment the segment value to set.
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setSegment(BlobHierarchyListSegment segment) {
        this.segment = segment;
        return this;
    }

    /**
     * Get the nextMarker property: The nextMarker property.
     *
     * @return the nextMarker value.
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * Set the nextMarker property: The nextMarker property.
     *
     * @param nextMarker the nextMarker value to set.
     * @return the ListBlobsHierarchySegmentResponse object itself.
     */
    public ListBlobsHierarchySegmentResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}
