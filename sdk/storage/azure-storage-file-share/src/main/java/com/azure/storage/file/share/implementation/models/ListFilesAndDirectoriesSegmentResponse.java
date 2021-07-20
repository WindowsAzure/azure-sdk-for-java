// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** An enumeration of directories and files. */
@JacksonXmlRootElement(localName = "EnumerationResults")
@Fluent
public final class ListFilesAndDirectoriesSegmentResponse {
    /*
     * The ServiceEndpoint property.
     */
    @JacksonXmlProperty(localName = "ServiceEndpoint", isAttribute = true)
    private String serviceEndpoint;

    /*
     * The ShareName property.
     */
    @JacksonXmlProperty(localName = "ShareName", isAttribute = true)
    private String shareName;

    /*
     * The ShareSnapshot property.
     */
    @JacksonXmlProperty(localName = "ShareSnapshot", isAttribute = true)
    private String shareSnapshot;

    /*
     * The DirectoryPath property.
     */
    @JacksonXmlProperty(localName = "DirectoryPath", isAttribute = true)
    private String directoryPath;

    /*
     * The Prefix property.
     */
    @JsonProperty(value = "Prefix", required = true)
    private String prefix;

    /*
     * The Marker property.
     */
    @JsonProperty(value = "Marker")
    private String marker;

    /*
     * The MaxResults property.
     */
    @JsonProperty(value = "MaxResults")
    private Integer maxResults;

    /*
     * Abstract for entries that can be listed from Directory.
     */
    @JsonProperty(value = "Entries", required = true)
    private FilesAndDirectoriesListSegment segment;

    /*
     * The NextMarker property.
     */
    @JsonProperty(value = "NextMarker", required = true)
    private String nextMarker;

    /*
     * The DirectoryId property.
     */
    @JsonProperty(value = "DirectoryId")
    private String directoryId;

    /**
     * Get the serviceEndpoint property: The ServiceEndpoint property.
     *
     * @return the serviceEndpoint value.
     */
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

    /**
     * Set the serviceEndpoint property: The ServiceEndpoint property.
     *
     * @param serviceEndpoint the serviceEndpoint value to set.
     * @return the ListFilesAndDirectoriesSegmentResponse object itself.
     */
    public ListFilesAndDirectoriesSegmentResponse setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }

    /**
     * Get the shareName property: The ShareName property.
     *
     * @return the shareName value.
     */
    public String getShareName() {
        return this.shareName;
    }

    /**
     * Set the shareName property: The ShareName property.
     *
     * @param shareName the shareName value to set.
     * @return the ListFilesAndDirectoriesSegmentResponse object itself.
     */
    public ListFilesAndDirectoriesSegmentResponse setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }

    /**
     * Get the shareSnapshot property: The ShareSnapshot property.
     *
     * @return the shareSnapshot value.
     */
    public String getShareSnapshot() {
        return this.shareSnapshot;
    }

    /**
     * Set the shareSnapshot property: The ShareSnapshot property.
     *
     * @param shareSnapshot the shareSnapshot value to set.
     * @return the ListFilesAndDirectoriesSegmentResponse object itself.
     */
    public ListFilesAndDirectoriesSegmentResponse setShareSnapshot(String shareSnapshot) {
        this.shareSnapshot = shareSnapshot;
        return this;
    }

    /**
     * Get the directoryPath property: The DirectoryPath property.
     *
     * @return the directoryPath value.
     */
    public String getDirectoryPath() {
        return this.directoryPath;
    }

    /**
     * Set the directoryPath property: The DirectoryPath property.
     *
     * @param directoryPath the directoryPath value to set.
     * @return the ListFilesAndDirectoriesSegmentResponse object itself.
     */
    public ListFilesAndDirectoriesSegmentResponse setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
        return this;
    }

    /**
     * Get the prefix property: The Prefix property.
     *
     * @return the prefix value.
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The Prefix property.
     *
     * @param prefix the prefix value to set.
     * @return the ListFilesAndDirectoriesSegmentResponse object itself.
     */
    public ListFilesAndDirectoriesSegmentResponse setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the marker property: The Marker property.
     *
     * @return the marker value.
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * Set the marker property: The Marker property.
     *
     * @param marker the marker value to set.
     * @return the ListFilesAndDirectoriesSegmentResponse object itself.
     */
    public ListFilesAndDirectoriesSegmentResponse setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Get the maxResults property: The MaxResults property.
     *
     * @return the maxResults value.
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * Set the maxResults property: The MaxResults property.
     *
     * @param maxResults the maxResults value to set.
     * @return the ListFilesAndDirectoriesSegmentResponse object itself.
     */
    public ListFilesAndDirectoriesSegmentResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Get the segment property: Abstract for entries that can be listed from Directory.
     *
     * @return the segment value.
     */
    public FilesAndDirectoriesListSegment getSegment() {
        return this.segment;
    }

    /**
     * Set the segment property: Abstract for entries that can be listed from Directory.
     *
     * @param segment the segment value to set.
     * @return the ListFilesAndDirectoriesSegmentResponse object itself.
     */
    public ListFilesAndDirectoriesSegmentResponse setSegment(FilesAndDirectoriesListSegment segment) {
        this.segment = segment;
        return this;
    }

    /**
     * Get the nextMarker property: The NextMarker property.
     *
     * @return the nextMarker value.
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * Set the nextMarker property: The NextMarker property.
     *
     * @param nextMarker the nextMarker value to set.
     * @return the ListFilesAndDirectoriesSegmentResponse object itself.
     */
    public ListFilesAndDirectoriesSegmentResponse setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * Get the directoryId property: The DirectoryId property.
     *
     * @return the directoryId value.
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * Set the directoryId property: The DirectoryId property.
     *
     * @param directoryId the directoryId value to set.
     * @return the ListFilesAndDirectoriesSegmentResponse object itself.
     */
    public ListFilesAndDirectoriesSegmentResponse setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
}
