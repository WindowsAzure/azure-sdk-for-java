// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.implementation.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Defines headers for Delete operation.
 */
@Fluent
public final class PathDeleteHeaders {
    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

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
     * When deleting a directory, the number of paths that are deleted with
     * each invocation is limited.  If the number of paths to be deleted
     * exceeds this limit, a continuation token is returned in this response
     * header.  When a continuation token is returned in the response, it must
     * be specified in a subsequent invocation of the delete operation to
     * continue deleting the directory.
     */
    @JsonProperty(value = "x-ms-continuation")
    private String continuation;

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
     * @return the PathDeleteHeaders object itself.
     */
    public PathDeleteHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
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
     * @return the PathDeleteHeaders object itself.
     */
    public PathDeleteHeaders setRequestId(String requestId) {
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
     * @return the PathDeleteHeaders object itself.
     */
    public PathDeleteHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the continuation property: When deleting a directory, the number of
     * paths that are deleted with each invocation is limited.  If the number
     * of paths to be deleted exceeds this limit, a continuation token is
     * returned in this response header.  When a continuation token is returned
     * in the response, it must be specified in a subsequent invocation of the
     * delete operation to continue deleting the directory.
     *
     * @return the continuation value.
     */
    public String getContinuation() {
        return this.continuation;
    }

    /**
     * Set the continuation property: When deleting a directory, the number of
     * paths that are deleted with each invocation is limited.  If the number
     * of paths to be deleted exceeds this limit, a continuation token is
     * returned in this response header.  When a continuation token is returned
     * in the response, it must be specified in a subsequent invocation of the
     * delete operation to continue deleting the directory.
     *
     * @param continuation the continuation value to set.
     * @return the PathDeleteHeaders object itself.
     */
    public PathDeleteHeaders setContinuation(String continuation) {
        this.continuation = continuation;
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
     * @return the PathDeleteHeaders object itself.
     */
    public PathDeleteHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
