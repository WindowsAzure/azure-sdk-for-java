// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureReachabilityReportLocation model. */
@Fluent
public final class AzureReachabilityReportLocation {
    /*
     * The name of the country.
     */
    @JsonProperty(value = "country", required = true)
    private String country;

    /*
     * The name of the state.
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * The name of the city or town.
     */
    @JsonProperty(value = "city")
    private String city;

    /**
     * Get the country property: The name of the country.
     *
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: The name of the country.
     *
     * @param country the country value to set.
     * @return the AzureReachabilityReportLocation object itself.
     */
    public AzureReachabilityReportLocation withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the state property: The name of the state.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: The name of the state.
     *
     * @param state the state value to set.
     * @return the AzureReachabilityReportLocation object itself.
     */
    public AzureReachabilityReportLocation withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the city property: The name of the city or town.
     *
     * @return the city value.
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city property: The name of the city or town.
     *
     * @param city the city value to set.
     * @return the AzureReachabilityReportLocation object itself.
     */
    public AzureReachabilityReportLocation withCity(String city) {
        this.city = city;
        return this;
    }
}
