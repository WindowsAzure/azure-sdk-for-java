// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PrivateLinkServiceConnectionState model. */
@Fluent
public final class PrivateLinkServiceConnectionState {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkServiceConnectionState.class);

    /*
     * Indicates whether the connection has been Approved/Rejected/Removed by
     * the owner of the service.
     */
    @JsonProperty(value = "status")
    private PrivateEndpointServiceConnectionStatus status;

    /*
     * The reason for approval/rejection of the connection.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * A message indicating if changes on the service provider require any
     * updates on the consumer.
     */
    @JsonProperty(value = "actionRequired")
    private String actionRequired;

    /**
     * Get the status property: Indicates whether the connection has been Approved/Rejected/Removed by the owner of the
     * service.
     *
     * @return the status value.
     */
    public PrivateEndpointServiceConnectionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Indicates whether the connection has been Approved/Rejected/Removed by the owner of the
     * service.
     *
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withStatus(PrivateEndpointServiceConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: The reason for approval/rejection of the connection.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The reason for approval/rejection of the connection.
     *
     * @param description the description value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionRequired property: A message indicating if changes on the service provider require any updates on
     * the consumer.
     *
     * @return the actionRequired value.
     */
    public String actionRequired() {
        return this.actionRequired;
    }

    /**
     * Set the actionRequired property: A message indicating if changes on the service provider require any updates on
     * the consumer.
     *
     * @param actionRequired the actionRequired value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withActionRequired(String actionRequired) {
        this.actionRequired = actionRequired;
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
