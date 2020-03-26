// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The DeploymentOperationProperties model.
 */
@Immutable
public final class DeploymentOperationProperties {
    /*
     * The state of the provisioning.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The date and time of the operation.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timestamp;

    /*
     * The duration of the operation.
     */
    @JsonProperty(value = "duration", access = JsonProperty.Access.WRITE_ONLY)
    private String duration;

    /*
     * Deployment operation service request id.
     */
    @JsonProperty(value = "serviceRequestId", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceRequestId;

    /*
     * Operation status code.
     */
    @JsonProperty(value = "statusCode", access = JsonProperty.Access.WRITE_ONLY)
    private String statusCode;

    /*
     * Operation status message.
     */
    @JsonProperty(value = "statusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private Object statusMessage;

    /*
     * The target resource.
     */
    @JsonProperty(value = "targetResource", access = JsonProperty.Access.WRITE_ONLY)
    private TargetResource targetResource;

    /*
     * The HTTP request message.
     */
    @JsonProperty(value = "request", access = JsonProperty.Access.WRITE_ONLY)
    private HttpMessage request;

    /*
     * The HTTP response message.
     */
    @JsonProperty(value = "response", access = JsonProperty.Access.WRITE_ONLY)
    private HttpMessage response;

    /**
     * Get the provisioningState property: The state of the provisioning.
     * 
     * @return the provisioningState value.
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the timestamp property: The date and time of the operation.
     * 
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the duration property: The duration of the operation.
     * 
     * @return the duration value.
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * Get the serviceRequestId property: Deployment operation service request
     * id.
     * 
     * @return the serviceRequestId value.
     */
    public String getServiceRequestId() {
        return this.serviceRequestId;
    }

    /**
     * Get the statusCode property: Operation status code.
     * 
     * @return the statusCode value.
     */
    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * Get the statusMessage property: Operation status message.
     * 
     * @return the statusMessage value.
     */
    public Object getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * Get the targetResource property: The target resource.
     * 
     * @return the targetResource value.
     */
    public TargetResource getTargetResource() {
        return this.targetResource;
    }

    /**
     * Get the request property: The HTTP request message.
     * 
     * @return the request value.
     */
    public HttpMessage getRequest() {
        return this.request;
    }

    /**
     * Get the response property: The HTTP response message.
     * 
     * @return the response value.
     */
    public HttpMessage getResponse() {
        return this.response;
    }
}
