// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SyncGroupsGetHeaders model. */
@Fluent
public final class SyncGroupsGetHeaders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SyncGroupsGetHeaders.class);

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-correlation-request-id property.
     */
    @JsonProperty(value = "x-ms-correlation-request-id")
    private String xMsCorrelationRequestId;

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String xMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the SyncGroupsGetHeaders object itself.
     */
    public SyncGroupsGetHeaders withXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsCorrelationRequestId property: The x-ms-correlation-request-id property.
     *
     * @return the xMsCorrelationRequestId value.
     */
    public String xMsCorrelationRequestId() {
        return this.xMsCorrelationRequestId;
    }

    /**
     * Set the xMsCorrelationRequestId property: The x-ms-correlation-request-id property.
     *
     * @param xMsCorrelationRequestId the xMsCorrelationRequestId value to set.
     * @return the SyncGroupsGetHeaders object itself.
     */
    public SyncGroupsGetHeaders withXMsCorrelationRequestId(String xMsCorrelationRequestId) {
        this.xMsCorrelationRequestId = xMsCorrelationRequestId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
