// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.microsoft.rest.v2.DateTimeRfc1123;
import java.time.OffsetDateTime;

/**
 * Defines headers for AppendBlock operation.
 */
@JacksonXmlRootElement(localName = "AppendBlob-AppendBlock-Headers")
public final class AppendBlobAppendBlockHeaders {
    /**
     * The ETag contains a value that you can use to perform operations
     * conditionally. If the request version is 2011-08-18 or newer, the ETag
     * value will be in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * Returns the date and time the container was last modified. Any operation
     * that modifies the blob, including an update of the blob's metadata or
     * properties, changes the last-modified time of the blob.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /**
     * If the blob has an MD5 hash and this operation is to read the full blob,
     * this response header is returned so that the client can check for
     * message content integrity.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMD5;

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
     * This response header is returned only for append operations. It returns
     * the offset at which the block was committed, in bytes.
     */
    @JsonProperty(value = "x-ms-blob-append-offset")
    private String blobAppendOffset;

    /**
     * The number of committed blocks present in the blob. This header is
     * returned only for append blobs.
     */
    @JsonProperty(value = "x-ms-blob-committed-block-count")
    private Integer blobCommittedBlockCount;

    /**
     * The value of this header is set to true if the contents of the request
     * are successfully encrypted using the specified algorithm, and false
     * otherwise.
     */
    @JsonProperty(value = "x-ms-request-server-encrypted")
    private Boolean isServerEncrypted;

    /**
     * Get the eTag value.
     *
     * @return the eTag value.
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag value.
     *
     * @param eTag the eTag value to set.
     * @return the AppendBlobAppendBlockHeaders object itself.
     */
    public AppendBlobAppendBlockHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

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
     * @return the AppendBlobAppendBlockHeaders object itself.
     */
    public AppendBlobAppendBlockHeaders withLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the contentMD5 value.
     *
     * @return the contentMD5 value.
     */
    public byte[] contentMD5() {
        return this.contentMD5;
    }

    /**
     * Set the contentMD5 value.
     *
     * @param contentMD5 the contentMD5 value to set.
     * @return the AppendBlobAppendBlockHeaders object itself.
     */
    public AppendBlobAppendBlockHeaders withContentMD5(byte[] contentMD5) {
        this.contentMD5 = contentMD5;
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
     * @return the AppendBlobAppendBlockHeaders object itself.
     */
    public AppendBlobAppendBlockHeaders withRequestId(String requestId) {
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
     * @return the AppendBlobAppendBlockHeaders object itself.
     */
    public AppendBlobAppendBlockHeaders withVersion(String version) {
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
     * @return the AppendBlobAppendBlockHeaders object itself.
     */
    public AppendBlobAppendBlockHeaders withDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }

    /**
     * Get the blobAppendOffset value.
     *
     * @return the blobAppendOffset value.
     */
    public String blobAppendOffset() {
        return this.blobAppendOffset;
    }

    /**
     * Set the blobAppendOffset value.
     *
     * @param blobAppendOffset the blobAppendOffset value to set.
     * @return the AppendBlobAppendBlockHeaders object itself.
     */
    public AppendBlobAppendBlockHeaders withBlobAppendOffset(String blobAppendOffset) {
        this.blobAppendOffset = blobAppendOffset;
        return this;
    }

    /**
     * Get the blobCommittedBlockCount value.
     *
     * @return the blobCommittedBlockCount value.
     */
    public Integer blobCommittedBlockCount() {
        return this.blobCommittedBlockCount;
    }

    /**
     * Set the blobCommittedBlockCount value.
     *
     * @param blobCommittedBlockCount the blobCommittedBlockCount value to set.
     * @return the AppendBlobAppendBlockHeaders object itself.
     */
    public AppendBlobAppendBlockHeaders withBlobCommittedBlockCount(Integer blobCommittedBlockCount) {
        this.blobCommittedBlockCount = blobCommittedBlockCount;
        return this;
    }

    /**
     * Get the isServerEncrypted value.
     *
     * @return the isServerEncrypted value.
     */
    public Boolean isServerEncrypted() {
        return this.isServerEncrypted;
    }

    /**
     * Set the isServerEncrypted value.
     *
     * @param isServerEncrypted the isServerEncrypted value to set.
     * @return the AppendBlobAppendBlockHeaders object itself.
     */
    public AppendBlobAppendBlockHeaders withIsServerEncrypted(Boolean isServerEncrypted) {
        this.isServerEncrypted = isServerEncrypted;
        return this;
    }
}
