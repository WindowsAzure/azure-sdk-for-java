// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The state of a private link service connection. */
@Fluent
public final class PrivateLinkServiceConnectionState {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkServiceConnectionState.class);

    /*
     * The private link service connection status.
     */
    @JsonProperty(value = "status")
    private ConnectionStatus status;

    /*
     * The description for connection status. For example if connection is
     * rejected it can indicate reason for rejection.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * A message indicating if changes on the service provider require any
     * updates on the consumer.
     */
    @JsonProperty(value = "actionsRequired")
    private ActionsRequired actionsRequired;

    /**
     * Get the status property: The private link service connection status.
     *
     * @return the status value.
     */
    public ConnectionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The private link service connection status.
     *
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withStatus(ConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: The description for connection status. For example if connection is rejected it can
     * indicate reason for rejection.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description for connection status. For example if connection is rejected it can
     * indicate reason for rejection.
     *
     * @param description the description value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionsRequired property: A message indicating if changes on the service provider require any updates on
     * the consumer.
     *
     * @return the actionsRequired value.
     */
    public ActionsRequired actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Set the actionsRequired property: A message indicating if changes on the service provider require any updates on
     * the consumer.
     *
     * @param actionsRequired the actionsRequired value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withActionsRequired(ActionsRequired actionsRequired) {
        this.actionsRequired = actionsRequired;
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
