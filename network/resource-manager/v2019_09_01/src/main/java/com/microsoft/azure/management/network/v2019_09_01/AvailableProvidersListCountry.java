/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Country details.
 */
public class AvailableProvidersListCountry {
    /**
     * The country name.
     */
    @JsonProperty(value = "countryName")
    private String countryName;

    /**
     * A list of Internet service providers.
     */
    @JsonProperty(value = "providers")
    private List<String> providers;

    /**
     * List of available states in the country.
     */
    @JsonProperty(value = "states")
    private List<AvailableProvidersListState> states;

    /**
     * Get the country name.
     *
     * @return the countryName value
     */
    public String countryName() {
        return this.countryName;
    }

    /**
     * Set the country name.
     *
     * @param countryName the countryName value to set
     * @return the AvailableProvidersListCountry object itself.
     */
    public AvailableProvidersListCountry withCountryName(String countryName) {
        this.countryName = countryName;
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
     * @return the AvailableProvidersListCountry object itself.
     */
    public AvailableProvidersListCountry withProviders(List<String> providers) {
        this.providers = providers;
        return this;
    }

    /**
     * Get list of available states in the country.
     *
     * @return the states value
     */
    public List<AvailableProvidersListState> states() {
        return this.states;
    }

    /**
     * Set list of available states in the country.
     *
     * @param states the states value to set
     * @return the AvailableProvidersListCountry object itself.
     */
    public AvailableProvidersListCountry withStates(List<AvailableProvidersListState> states) {
        this.states = states;
        return this;
    }

}
