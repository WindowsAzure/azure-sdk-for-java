/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A collection of information about the state of the connection between
 * service consumer and provider.
 */
public class PrivateLinkServiceConnectionState {
    /**
     * Indicates whether the connection has been Approved/Rejected/Removed by
     * the owner of the service.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The reason for approval/rejection of the connection.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * A message indicating if changes on the service provider require any
     * updates on the consumer.
     */
    @JsonProperty(value = "actionRequired")
    private String actionRequired;

    /**
     * Get indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
     *
     * @param status the status value to set
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the reason for approval/rejection of the connection.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the reason for approval/rejection of the connection.
     *
     * @param description the description value to set
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get a message indicating if changes on the service provider require any updates on the consumer.
     *
     * @return the actionRequired value
     */
    public String actionRequired() {
        return this.actionRequired;
    }

    /**
     * Set a message indicating if changes on the service provider require any updates on the consumer.
     *
     * @param actionRequired the actionRequired value to set
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withActionRequired(String actionRequired) {
        this.actionRequired = actionRequired;
        return this;
    }

}
