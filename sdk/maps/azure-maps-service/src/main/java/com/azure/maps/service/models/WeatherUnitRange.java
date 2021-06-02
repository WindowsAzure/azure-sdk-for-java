// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Returned temperature values. */
@Fluent
public final class WeatherUnitRange {
    /*
     * Minimum temperature for the time period.
     */
    @JsonProperty(value = "minimum")
    private WeatherUnit minimum;

    /*
     * Maximum temperature for the time period
     */
    @JsonProperty(value = "maximum")
    private WeatherUnit maximum;

    /**
     * Get the minimum property: Minimum temperature for the time period.
     *
     * @return the minimum value.
     */
    public WeatherUnit getMinimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: Minimum temperature for the time period.
     *
     * @param minimum the minimum value to set.
     * @return the WeatherUnitRange object itself.
     */
    public WeatherUnitRange setMinimum(WeatherUnit minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: Maximum temperature for the time period.
     *
     * @return the maximum value.
     */
    public WeatherUnit getMaximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: Maximum temperature for the time period.
     *
     * @param maximum the maximum value to set.
     * @return the WeatherUnitRange object itself.
     */
    public WeatherUnitRange setMaximum(WeatherUnit maximum) {
        this.maximum = maximum;
        return this;
    }
}
