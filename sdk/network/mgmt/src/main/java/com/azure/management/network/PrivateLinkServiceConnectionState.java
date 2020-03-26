// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PrivateLinkServiceConnectionState model.
 */
@Fluent
public final class PrivateLinkServiceConnectionState {
    /*
     * Indicates whether the connection has been Approved/Rejected/Removed by
     * the owner of the service.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The reason for approval/rejection of the connection.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * A message indicating if changes on the service provider require any
     * updates on the consumer.
     */
    @JsonProperty(value = "actionsRequired")
    private String actionsRequired;

    /**
     * Get the status property: Indicates whether the connection has been
     * Approved/Rejected/Removed by the owner of the service.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Indicates whether the connection has been
     * Approved/Rejected/Removed by the owner of the service.
     * 
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: The reason for approval/rejection of the
     * connection.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The reason for approval/rejection of the
     * connection.
     * 
     * @param description the description value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionsRequired property: A message indicating if changes on the
     * service provider require any updates on the consumer.
     * 
     * @return the actionsRequired value.
     */
    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Set the actionsRequired property: A message indicating if changes on the
     * service provider require any updates on the consumer.
     * 
     * @param actionsRequired the actionsRequired value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withActionsRequired(String actionsRequired) {
        this.actionsRequired = actionsRequired;
        return this;
    }
}
