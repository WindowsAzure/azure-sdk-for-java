// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.implementation.DateTimeRfc1123;
import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Defines headers for Rename operation.
 */
@JacksonXmlRootElement(localName = "Blob-Rename-Headers")
@Fluent
public final class BlobRenameHeaders {
    /*
     * An HTTP entity tag associated with the file or directory.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The data and time the file or directory was last modified.  Write
     * operations on the file or directory update the last modified time.
     */
    @JsonProperty(value = "Last-Modified")
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
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /**
     * Get the eTag property: An HTTP entity tag associated with the file or
     * directory.
     *
     * @return the eTag value.
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: An HTTP entity tag associated with the file or
     * directory.
     *
     * @param eTag the eTag value to set.
     * @return the BlobRenameHeaders object itself.
     */
    public BlobRenameHeaders eTag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: The data and time the file or directory
     * was last modified.  Write operations on the file or directory update the
     * last modified time.
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
     * Set the lastModified property: The data and time the file or directory
     * was last modified.  Write operations on the file or directory update the
     * last modified time.
     *
     * @param lastModified the lastModified value to set.
     * @return the BlobRenameHeaders object itself.
     */
    public BlobRenameHeaders lastModified(OffsetDateTime lastModified) {
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
    public String clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the BlobRenameHeaders object itself.
     */
    public BlobRenameHeaders clientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the requestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @param requestId the requestId value to set.
     * @return the BlobRenameHeaders object itself.
     */
    public BlobRenameHeaders requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: The version of the REST protocol used to
     * process the request.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version of the REST protocol used to
     * process the request.
     *
     * @param version the version value to set.
     * @return the BlobRenameHeaders object itself.
     */
    public BlobRenameHeaders version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the contentLength property: The size of the resource in bytes.
     *
     * @return the contentLength value.
     */
    public Long contentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The size of the resource in bytes.
     *
     * @param contentLength the contentLength value to set.
     * @return the BlobRenameHeaders object itself.
     */
    public BlobRenameHeaders contentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime dateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.dateTime();
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the BlobRenameHeaders object itself.
     */
    public BlobRenameHeaders dateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }
}
