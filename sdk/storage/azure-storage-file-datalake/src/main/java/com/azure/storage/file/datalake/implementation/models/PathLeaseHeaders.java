// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Defines headers for Lease operation.
 */
@Fluent
public final class PathLeaseHeaders {
    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

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
     * A successful "acquire" action returns the lease ID.
     */
    @JsonProperty(value = "x-ms-lease-id")
    private String leaseId;

    /*
     * The time remaining in the lease period in seconds.
     */
    @JsonProperty(value = "x-ms-lease-time")
    private String leaseTime;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

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
     * @return the PathLeaseHeaders object itself.
     */
    public PathLeaseHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
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
     * @return the PathLeaseHeaders object itself.
     */
    public PathLeaseHeaders setETag(String eTag) {
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
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The data and time the file or directory
     * was last modified.  Write operations on the file or directory update the
     * last modified time.
     *
     * @param lastModified the lastModified value to set.
     * @return the PathLeaseHeaders object itself.
     */
    public PathLeaseHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
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
     * @return the PathLeaseHeaders object itself.
     */
    public PathLeaseHeaders setRequestId(String requestId) {
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
     * @return the PathLeaseHeaders object itself.
     */
    public PathLeaseHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the leaseId property: A successful "acquire" action returns the
     * lease ID.
     *
     * @return the leaseId value.
     */
    public String getLeaseId() {
        return this.leaseId;
    }

    /**
     * Set the leaseId property: A successful "acquire" action returns the
     * lease ID.
     *
     * @param leaseId the leaseId value to set.
     * @return the PathLeaseHeaders object itself.
     */
    public PathLeaseHeaders setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }

    /**
     * Get the leaseTime property: The time remaining in the lease period in
     * seconds.
     *
     * @return the leaseTime value.
     */
    public String getLeaseTime() {
        return this.leaseTime;
    }

    /**
     * Set the leaseTime property: The time remaining in the lease period in
     * seconds.
     *
     * @param leaseTime the leaseTime value to set.
     * @return the PathLeaseHeaders object itself.
     */
    public PathLeaseHeaders setLeaseTime(String leaseTime) {
        this.leaseTime = leaseTime;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the PathLeaseHeaders object itself.
     */
    public PathLeaseHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
