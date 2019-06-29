// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Defines headers for SetProperties operation.
 */
@JacksonXmlRootElement(localName = "Service-SetProperties-Headers")
public final class ServiceSetPropertiesHeaders {
    /*
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * Indicates the version of the Queue service used to execute the request.
     * This header is returned for requests made against version 2009-09-19 and
     * above.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the ServiceSetPropertiesHeaders object itself.
     */
    public ServiceSetPropertiesHeaders requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the Queue service
     * used to execute the request. This header is returned for requests made
     * against version 2009-09-19 and above.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the Queue service
     * used to execute the request. This header is returned for requests made
     * against version 2009-09-19 and above.
     *
     * @param version the version value to set.
     * @return the ServiceSetPropertiesHeaders object itself.
     */
    public ServiceSetPropertiesHeaders version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the ServiceSetPropertiesHeaders object itself.
     */
    public ServiceSetPropertiesHeaders errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
