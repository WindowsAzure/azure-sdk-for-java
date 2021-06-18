// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Private Link Service Connection State. */
@Fluent
public final class PrivateLinkServiceConnectionState {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkServiceConnectionState.class);

    /*
     * Gets or sets the status
     */
    @JsonProperty(value = "status")
    private PrivateEndpointConnectionStatus status;

    /*
     * Gets or sets description
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Gets or sets actions required
     */
    @JsonProperty(value = "actionRequired")
    private String actionRequired;

    /**
     * Get the status property: Gets or sets the status.
     *
     * @return the status value.
     */
    public PrivateEndpointConnectionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Gets or sets the status.
     *
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withStatus(PrivateEndpointConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: Gets or sets description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets description.
     *
     * @param description the description value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionRequired property: Gets or sets actions required.
     *
     * @return the actionRequired value.
     */
    public String actionRequired() {
        return this.actionRequired;
    }

    /**
     * Set the actionRequired property: Gets or sets actions required.
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
