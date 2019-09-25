// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.models;

import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    private String dateProperty;

    /*
     * A server-generated UUID recorded in the analytics logs for
     * troubleshooting and correlation.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The version of the REST protocol used to process the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * When deleting a directory, the number of paths that are deleted with
     * each invocation is limited.  If the number of paths to be deleted
     * exceeds this limit, a continuation token is returned in this response
     * header.  When a continuation token is returned in the response, it must
     * be specified in a subsequent invocation of the delete operation to
     * continue deleting the directory.
     */
    @JsonProperty(value = "x-ms-continuation")
    private String xMsContinuation;

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public String dateProperty() {
        return this.dateProperty;
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the PathDeleteHeaders object itself.
     */
    public PathDeleteHeaders dateProperty(String dateProperty) {
        this.dateProperty = dateProperty;
        return this;
    }

    /**
     * Get the xMsRequestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @return the xMsRequestId value.
     */
    public String xMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the PathDeleteHeaders object itself.
     */
    public PathDeleteHeaders xMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsVersion property: The version of the REST protocol used to
     * process the request.
     *
     * @return the xMsVersion value.
     */
    public String xMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The version of the REST protocol used to
     * process the request.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the PathDeleteHeaders object itself.
     */
    public PathDeleteHeaders xMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsContinuation property: When deleting a directory, the number
     * of paths that are deleted with each invocation is limited.  If the
     * number of paths to be deleted exceeds this limit, a continuation token
     * is returned in this response header.  When a continuation token is
     * returned in the response, it must be specified in a subsequent
     * invocation of the delete operation to continue deleting the directory.
     *
     * @return the xMsContinuation value.
     */
    public String xMsContinuation() {
        return this.xMsContinuation;
    }

    /**
     * Set the xMsContinuation property: When deleting a directory, the number
     * of paths that are deleted with each invocation is limited.  If the
     * number of paths to be deleted exceeds this limit, a continuation token
     * is returned in this response header.  When a continuation token is
     * returned in the response, it must be specified in a subsequent
     * invocation of the delete operation to continue deleting the directory.
     *
     * @param xMsContinuation the xMsContinuation value to set.
     * @return the PathDeleteHeaders object itself.
     */
    public PathDeleteHeaders xMsContinuation(String xMsContinuation) {
        this.xMsContinuation = xMsContinuation;
        return this;
    }
}
