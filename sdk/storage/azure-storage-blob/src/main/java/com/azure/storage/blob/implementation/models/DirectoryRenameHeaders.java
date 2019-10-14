// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.implementation.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Defines headers for Rename operation.
 */
@JacksonXmlRootElement(localName = "Directory-Rename-Headers")
@Fluent
public final class DirectoryRenameHeaders {
    /*
     * When renaming a directory, the number of paths that are renamed with
     * each invocation is limited. If the number of paths to be renamed exceeds
     * this limit, a continuation token is returned in this response header.
     * When a continuation token is returned in the response, it must be
     * specified in a subsequent invocation of the rename operation to continue
     * renaming the directory.
     */
    @JsonProperty(value = "x-ms-continuation")
    private String marker;

    /*
     * An HTTP entity tag associated with the file or directory.
     */
    @JsonProperty(value = "etag")
    private String eTag;

    /*
     * The data and time the file or directory was last modified. Write
     * operations on the file or directory update the last modified time.
     */
    @JsonProperty(value = "last-modified")
    private DateTimeRfc1123 lastModified;

    /*
     * If a client request id header is sent in the request, this header will
     * be present in the response with the same value.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String clientRequestId;

    /*
     * A server-generated UUID recorded in the analytics logs for
     * troubleshooting and correlation.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * The version of the REST protocol used to process the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * The size of the resource in bytes.
     */
    @JsonProperty(value = "content-length")
    private Long contentLength;

    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "date")
    private DateTimeRfc1123 dateProperty;

    /**
     * Get the marker property: When renaming a directory, the number of paths
     * that are renamed with each invocation is limited. If the number of paths
     * to be renamed exceeds this limit, a continuation token is returned in
     * this response header. When a continuation token is returned in the
     * response, it must be specified in a subsequent invocation of the rename
     * operation to continue renaming the directory.
     *
     * @return the marker value.
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * Set the marker property: When renaming a directory, the number of paths
     * that are renamed with each invocation is limited. If the number of paths
     * to be renamed exceeds this limit, a continuation token is returned in
     * this response header. When a continuation token is returned in the
     * response, it must be specified in a subsequent invocation of the rename
     * operation to continue renaming the directory.
     *
     * @param marker the marker value to set.
     * @return the DirectoryRenameHeaders object itself.
     */
    public DirectoryRenameHeaders setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Get the eTag property: An HTTP entity tag associated with the file or
     * directory.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: An HTTP entity tag associated with the file or
     * directory.
     *
     * @param eTag the eTag value to set.
     * @return the DirectoryRenameHeaders object itself.
     */
    public DirectoryRenameHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: The data and time the file or directory
     * was last modified. Write operations on the file or directory update the
     * last modified time.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The data and time the file or directory
     * was last modified. Write operations on the file or directory update the
     * last modified time.
     *
     * @param lastModified the lastModified value to set.
     * @return the DirectoryRenameHeaders object itself.
     */
    public DirectoryRenameHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @return the clientRequestId value.
     */
    public String getClientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the DirectoryRenameHeaders object itself.
     */
    public DirectoryRenameHeaders setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the requestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @param requestId the requestId value to set.
     * @return the DirectoryRenameHeaders object itself.
     */
    public DirectoryRenameHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: The version of the REST protocol used to
     * process the request.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the REST protocol used to
     * process the request.
     *
     * @param version the version value to set.
     * @return the DirectoryRenameHeaders object itself.
     */
    public DirectoryRenameHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the contentLength property: The size of the resource in bytes.
     *
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The size of the resource in bytes.
     *
     * @param contentLength the contentLength value to set.
     * @return the DirectoryRenameHeaders object itself.
     */
    public DirectoryRenameHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the DirectoryRenameHeaders object itself.
     */
    public DirectoryRenameHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }
}
