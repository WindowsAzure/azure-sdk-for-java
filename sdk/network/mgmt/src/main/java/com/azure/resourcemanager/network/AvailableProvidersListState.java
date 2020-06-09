// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AvailableProvidersListState model. */
@Fluent
public final class AvailableProvidersListState {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailableProvidersListState.class);

    /*
     * The state name.
     */
    @JsonProperty(value = "stateName")
    private String stateName;

    /*
     * A list of Internet service providers.
     */
    @JsonProperty(value = "providers")
    private List<String> providers;

    /*
     * List of available cities or towns in the state.
     */
    @JsonProperty(value = "cities")
    private List<AvailableProvidersListCity> cities;

    /**
     * Get the stateName property: The state name.
     *
     * @return the stateName value.
     */
    public String stateName() {
        return this.stateName;
    }

    /**
     * Set the stateName property: The state name.
     *
     * @param stateName the stateName value to set.
     * @return the AvailableProvidersListState object itself.
     */
    public AvailableProvidersListState withStateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    /**
     * Get the providers property: A list of Internet service providers.
     *
     * @return the providers value.
     */
    public List<String> providers() {
        return this.providers;
    }

    /**
     * Set the providers property: A list of Internet service providers.
     *
     * @param providers the providers value to set.
     * @return the AvailableProvidersListState object itself.
     */
    public AvailableProvidersListState withProviders(List<String> providers) {
        this.providers = providers;
        return this;
    }

    /**
     * Get the cities property: List of available cities or towns in the state.
     *
     * @return the cities value.
     */
    public List<AvailableProvidersListCity> cities() {
        return this.cities;
    }

    /**
     * Set the cities property: List of available cities or towns in the state.
     *
     * @param cities the cities value to set.
     * @return the AvailableProvidersListState object itself.
     */
    public AvailableProvidersListState withCities(List<AvailableProvidersListCity> cities) {
        this.cities = cities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cities() != null) {
            cities().forEach(e -> e.validate());
        }
    }
}
