/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * City or town details.
 */
public class AvailableProvidersListCity {
    /**
     * The city or town name.
     */
    @JsonProperty(value = "cityName")
    private String cityName;

    /**
     * A list of Internet service providers.
     */
    @JsonProperty(value = "providers")
    private List<String> providers;

    /**
     * Get the city or town name.
     *
     * @return the cityName value
     */
    public String cityName() {
        return this.cityName;
    }

    /**
     * Set the city or town name.
     *
     * @param cityName the cityName value to set
     * @return the AvailableProvidersListCity object itself.
     */
    public AvailableProvidersListCity withCityName(String cityName) {
        this.cityName = cityName;
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
     * @return the AvailableProvidersListCity object itself.
     */
    public AvailableProvidersListCity withProviders(List<String> providers) {
        this.providers = providers;
        return this;
    }

}
