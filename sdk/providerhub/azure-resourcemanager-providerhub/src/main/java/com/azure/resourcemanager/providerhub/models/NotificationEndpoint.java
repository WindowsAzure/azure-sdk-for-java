// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NotificationEndpoint model. */
@Fluent
public final class NotificationEndpoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NotificationEndpoint.class);

    /*
     * The notificationDestination property.
     */
    @JsonProperty(value = "notificationDestination")
    private String notificationDestination;

    /*
     * The locations property.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /**
     * Get the notificationDestination property: The notificationDestination property.
     *
     * @return the notificationDestination value.
     */
    public String notificationDestination() {
        return this.notificationDestination;
    }

    /**
     * Set the notificationDestination property: The notificationDestination property.
     *
     * @param notificationDestination the notificationDestination value to set.
     * @return the NotificationEndpoint object itself.
     */
    public NotificationEndpoint withNotificationDestination(String notificationDestination) {
        this.notificationDestination = notificationDestination;
        return this;
    }

    /**
     * Get the locations property: The locations property.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: The locations property.
     *
     * @param locations the locations value to set.
     * @return the NotificationEndpoint object itself.
     */
    public NotificationEndpoint withLocations(List<String> locations) {
        this.locations = locations;
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
