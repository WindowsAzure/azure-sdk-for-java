// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Description of an Azure Notification Hub to link to the communication service. */
@Fluent
public final class LinkNotificationHubParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LinkNotificationHubParameters.class);

    /*
     * The resource ID of the notification hub
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /*
     * Connection string for the notification hub
     */
    @JsonProperty(value = "connectionString", required = true)
    private String connectionString;

    /**
     * Get the resourceId property: The resource ID of the notification hub.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource ID of the notification hub.
     *
     * @param resourceId the resourceId value to set.
     * @return the LinkNotificationHubParameters object itself.
     */
    public LinkNotificationHubParameters withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the connectionString property: Connection string for the notification hub.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: Connection string for the notification hub.
     *
     * @param connectionString the connectionString value to set.
     * @return the LinkNotificationHubParameters object itself.
     */
    public LinkNotificationHubParameters withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resourceId in model LinkNotificationHubParameters"));
        }
        if (connectionString() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property connectionString in model LinkNotificationHubParameters"));
        }
    }
}
