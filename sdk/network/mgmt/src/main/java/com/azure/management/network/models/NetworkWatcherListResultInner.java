// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NetworkWatcherListResult model. */
@Fluent
public final class NetworkWatcherListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkWatcherListResultInner.class);

    /*
     * List of network watcher resources.
     */
    @JsonProperty(value = "value")
    private List<NetworkWatcherInner> value;

    /**
     * Get the value property: List of network watcher resources.
     *
     * @return the value value.
     */
    public List<NetworkWatcherInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of network watcher resources.
     *
     * @param value the value value to set.
     * @return the NetworkWatcherListResultInner object itself.
     */
    public NetworkWatcherListResultInner withValue(List<NetworkWatcherInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
