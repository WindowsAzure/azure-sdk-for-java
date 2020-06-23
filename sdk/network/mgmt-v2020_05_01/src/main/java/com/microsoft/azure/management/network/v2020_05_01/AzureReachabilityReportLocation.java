/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define a geographic location.
 */
public class AzureReachabilityReportLocation {
    /**
     * The name of the country.
     */
    @JsonProperty(value = "country", required = true)
    private String country;

    /**
     * The name of the state.
     */
    @JsonProperty(value = "state")
    private String state;

    /**
     * The name of the city or town.
     */
    @JsonProperty(value = "city")
    private String city;

    /**
     * Get the name of the country.
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the name of the country.
     *
     * @param country the country value to set
     * @return the AzureReachabilityReportLocation object itself.
     */
    public AzureReachabilityReportLocation withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the name of the state.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the name of the state.
     *
     * @param state the state value to set
     * @return the AzureReachabilityReportLocation object itself.
     */
    public AzureReachabilityReportLocation withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the name of the city or town.
     *
     * @return the city value
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the name of the city or town.
     *
     * @param city the city value to set
     * @return the AzureReachabilityReportLocation object itself.
     */
    public AzureReachabilityReportLocation withCity(String city) {
        this.city = city;
        return this;
    }

}
