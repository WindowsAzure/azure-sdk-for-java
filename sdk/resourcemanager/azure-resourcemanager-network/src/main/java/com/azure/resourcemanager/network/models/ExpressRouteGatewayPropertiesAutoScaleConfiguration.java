// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration for auto scaling. */
@Fluent
public final class ExpressRouteGatewayPropertiesAutoScaleConfiguration {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ExpressRouteGatewayPropertiesAutoScaleConfiguration.class);

    /*
     * Minimum and maximum number of scale units to deploy.
     */
    @JsonProperty(value = "bounds")
    private ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds bounds;

    /**
     * Get the bounds property: Minimum and maximum number of scale units to deploy.
     *
     * @return the bounds value.
     */
    public ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds bounds() {
        return this.bounds;
    }

    /**
     * Set the bounds property: Minimum and maximum number of scale units to deploy.
     *
     * @param bounds the bounds value to set.
     * @return the ExpressRouteGatewayPropertiesAutoScaleConfiguration object itself.
     */
    public ExpressRouteGatewayPropertiesAutoScaleConfiguration withBounds(
        ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds bounds) {
        this.bounds = bounds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bounds() != null) {
            bounds().validate();
        }
    }
}
