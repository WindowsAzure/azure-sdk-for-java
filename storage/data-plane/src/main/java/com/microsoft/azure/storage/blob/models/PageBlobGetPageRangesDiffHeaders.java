// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.microsoft.rest.v2.DateTimeRfc1123;

import java.time.OffsetDateTime;

/**
 * Defines headers for GetPageRangesDiff operation.
 */
@JacksonXmlRootElement(localName = "PageBlob-GetPageRangesDiff-Headers")
public final class PageBlobGetPageRangesDiffHeaders {
    /**
     * Returns the date and time the container was last modified. Any operation
     * that modifies the blob, including an update of the blob's metadata or
     * properties, changes the last-modified time of the blob.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /**
     * The ETag contains a value that you can use to perform operations
     * conditionally. If the request version is 2011-08-18 or newer, the ETag
     * value will be in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * The size of the blob in bytes.
     */
    @JsonProperty(value = "x-ms-blob-content-length")
    private Long blobContentLength;

    /**
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /**
     * Indicates the version of the Blob service used to execute the request.
     * This header is returned for requests made against version 2009-09-19 and
     * above.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /**
     * UTC date/time value generated by the service that indicates the time at
     * which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 date;

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.dateTime();
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set.
     * @return the PageBlobGetPageRangesDiffHeaders object itself.
     */
    public PageBlobGetPageRangesDiffHeaders withLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the getEtag value.
     *
     * @return the getEtag value.
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the getEtag value.
     *
     * @param eTag the getEtag value to set.
     * @return the PageBlobGetPageRangesDiffHeaders object itself.
     */
    public PageBlobGetPageRangesDiffHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the blobContentLength value.
     *
     * @return the blobContentLength value.
     */
    public Long blobContentLength() {
        return this.blobContentLength;
    }

    /**
     * Set the blobContentLength value.
     *
     * @param blobContentLength the blobContentLength value to set.
     * @return the PageBlobGetPageRangesDiffHeaders object itself.
     */
    public PageBlobGetPageRangesDiffHeaders withBlobContentLength(Long blobContentLength) {
        this.blobContentLength = blobContentLength;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set.
     * @return the PageBlobGetPageRangesDiffHeaders object itself.
     */
    public PageBlobGetPageRangesDiffHeaders withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set.
     * @return the PageBlobGetPageRangesDiffHeaders object itself.
     */
    public PageBlobGetPageRangesDiffHeaders withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the date value.
     *
     * @return the date value.
     */
    public OffsetDateTime date() {
        if (this.date == null) {
            return null;
        }
        return this.date.dateTime();
    }

    /**
     * Set the date value.
     *
     * @param date the date value to set.
     * @return the PageBlobGetPageRangesDiffHeaders object itself.
     */
    public PageBlobGetPageRangesDiffHeaders withDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }
}
