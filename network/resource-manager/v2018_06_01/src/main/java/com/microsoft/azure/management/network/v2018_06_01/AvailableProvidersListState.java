/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * State details.
 */
public class AvailableProvidersListState {
    /**
     * The state name.
     */
    @JsonProperty(value = "stateName")
    private String stateName;

    /**
     * A list of Internet service providers.
     */
    @JsonProperty(value = "providers")
    private List<String> providers;

    /**
     * List of available cities or towns in the state.
     */
    @JsonProperty(value = "cities")
    private List<AvailableProvidersListCity> cities;

    /**
     * Get the state name.
     *
     * @return the stateName value
     */
    public String stateName() {
        return this.stateName;
    }

    /**
     * Set the state name.
     *
     * @param stateName the stateName value to set
     * @return the AvailableProvidersListState object itself.
     */
    public AvailableProvidersListState withStateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    /**
     * Get a list of Internet service providers.
     *
     * @return the providers value
     */
    public List<String> providers() {
        return this.providers;
    }

    /**
     * Set a list of Internet service providers.
     *
     * @param providers the providers value to set
     * @return the AvailableProvidersListState object itself.
     */
    public AvailableProvidersListState withProviders(List<String> providers) {
        this.providers = providers;
        return this;
    }

    /**
     * Get list of available cities or towns in the state.
     *
     * @return the cities value
     */
    public List<AvailableProvidersListCity> cities() {
        return this.cities;
    }

    /**
     * Set list of available cities or towns in the state.
     *
     * @param cities the cities value to set
     * @return the AvailableProvidersListState object itself.
     */
    public AvailableProvidersListState withCities(List<AvailableProvidersListCity> cities) {
        this.cities = cities;
        return this;
    }

}
