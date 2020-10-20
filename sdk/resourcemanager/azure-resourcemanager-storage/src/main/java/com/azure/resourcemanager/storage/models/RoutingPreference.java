// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Routing preference defines the type of network, either microsoft or internet routing to be used to deliver the user
 * data, the default option is microsoft routing.
 */
@Fluent
public final class RoutingPreference {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoutingPreference.class);

    /*
     * Routing Choice defines the kind of network routing opted by the user.
     */
    @JsonProperty(value = "routingChoice")
    private RoutingChoice routingChoice;

    /*
     * A boolean flag which indicates whether microsoft routing storage
     * endpoints are to be published
     */
    @JsonProperty(value = "publishMicrosoftEndpoints")
    private Boolean publishMicrosoftEndpoints;

    /*
     * A boolean flag which indicates whether internet routing storage
     * endpoints are to be published
     */
    @JsonProperty(value = "publishInternetEndpoints")
    private Boolean publishInternetEndpoints;

    /**
     * Get the routingChoice property: Routing Choice defines the kind of network routing opted by the user.
     *
     * @return the routingChoice value.
     */
    public RoutingChoice routingChoice() {
        return this.routingChoice;
    }

    /**
     * Set the routingChoice property: Routing Choice defines the kind of network routing opted by the user.
     *
     * @param routingChoice the routingChoice value to set.
     * @return the RoutingPreference object itself.
     */
    public RoutingPreference withRoutingChoice(RoutingChoice routingChoice) {
        this.routingChoice = routingChoice;
        return this;
    }

    /**
     * Get the publishMicrosoftEndpoints property: A boolean flag which indicates whether microsoft routing storage
     * endpoints are to be published.
     *
     * @return the publishMicrosoftEndpoints value.
     */
    public Boolean publishMicrosoftEndpoints() {
        return this.publishMicrosoftEndpoints;
    }

    /**
     * Set the publishMicrosoftEndpoints property: A boolean flag which indicates whether microsoft routing storage
     * endpoints are to be published.
     *
     * @param publishMicrosoftEndpoints the publishMicrosoftEndpoints value to set.
     * @return the RoutingPreference object itself.
     */
    public RoutingPreference withPublishMicrosoftEndpoints(Boolean publishMicrosoftEndpoints) {
        this.publishMicrosoftEndpoints = publishMicrosoftEndpoints;
        return this;
    }

    /**
     * Get the publishInternetEndpoints property: A boolean flag which indicates whether internet routing storage
     * endpoints are to be published.
     *
     * @return the publishInternetEndpoints value.
     */
    public Boolean publishInternetEndpoints() {
        return this.publishInternetEndpoints;
    }

    /**
     * Set the publishInternetEndpoints property: A boolean flag which indicates whether internet routing storage
     * endpoints are to be published.
     *
     * @param publishInternetEndpoints the publishInternetEndpoints value to set.
     * @return the RoutingPreference object itself.
     */
    public RoutingPreference withPublishInternetEndpoints(Boolean publishInternetEndpoints) {
        this.publishInternetEndpoints = publishInternetEndpoints;
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
