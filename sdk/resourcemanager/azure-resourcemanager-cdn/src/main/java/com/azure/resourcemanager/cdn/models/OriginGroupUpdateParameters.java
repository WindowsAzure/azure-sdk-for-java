// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Origin group properties needed for origin group creation or update. */
@JsonFlatten
@Fluent
public class OriginGroupUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OriginGroupUpdateParameters.class);

    /*
     * Health probe settings to the origin that is used to determine the health
     * of the origin.
     */
    @JsonProperty(value = "properties.healthProbeSettings")
    private HealthProbeParameters healthProbeSettings;

    /*
     * The source of the content being delivered via CDN within given origin
     * group.
     */
    @JsonProperty(value = "properties.origins")
    private List<ResourceReference> origins;

    /*
     * Time in minutes to shift the traffic to the endpoint gradually when an
     * unhealthy endpoint comes healthy or a new endpoint is added. Default is
     * 10 mins. This property is currently not supported.
     */
    @JsonProperty(value = "properties.trafficRestorationTimeToHealedOrNewEndpointsInMinutes")
    private Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes;

    /*
     * The JSON object that contains the properties to determine origin health
     * using real requests/responses. This property is currently not supported.
     */
    @JsonProperty(value = "properties.responseBasedOriginErrorDetectionSettings")
    private ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings;

    /**
     * Get the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     *
     * @return the healthProbeSettings value.
     */
    public HealthProbeParameters healthProbeSettings() {
        return this.healthProbeSettings;
    }

    /**
     * Set the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     *
     * @param healthProbeSettings the healthProbeSettings value to set.
     * @return the OriginGroupUpdateParameters object itself.
     */
    public OriginGroupUpdateParameters withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        this.healthProbeSettings = healthProbeSettings;
        return this;
    }

    /**
     * Get the origins property: The source of the content being delivered via CDN within given origin group.
     *
     * @return the origins value.
     */
    public List<ResourceReference> origins() {
        return this.origins;
    }

    /**
     * Set the origins property: The source of the content being delivered via CDN within given origin group.
     *
     * @param origins the origins value to set.
     * @return the OriginGroupUpdateParameters object itself.
     */
    public OriginGroupUpdateParameters withOrigins(List<ResourceReference> origins) {
        this.origins = origins;
        return this;
    }

    /**
     * Get the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     *
     * @return the trafficRestorationTimeToHealedOrNewEndpointsInMinutes value.
     */
    public Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
    }

    /**
     * Set the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     *
     * @param trafficRestorationTimeToHealedOrNewEndpointsInMinutes the
     *     trafficRestorationTimeToHealedOrNewEndpointsInMinutes value to set.
     * @return the OriginGroupUpdateParameters object itself.
     */
    public OriginGroupUpdateParameters withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
        Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes =
            trafficRestorationTimeToHealedOrNewEndpointsInMinutes;
        return this;
    }

    /**
     * Get the responseBasedOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses. This property is currently not supported.
     *
     * @return the responseBasedOriginErrorDetectionSettings value.
     */
    public ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings() {
        return this.responseBasedOriginErrorDetectionSettings;
    }

    /**
     * Set the responseBasedOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses. This property is currently not supported.
     *
     * @param responseBasedOriginErrorDetectionSettings the responseBasedOriginErrorDetectionSettings value to set.
     * @return the OriginGroupUpdateParameters object itself.
     */
    public OriginGroupUpdateParameters withResponseBasedOriginErrorDetectionSettings(
        ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings) {
        this.responseBasedOriginErrorDetectionSettings = responseBasedOriginErrorDetectionSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (healthProbeSettings() != null) {
            healthProbeSettings().validate();
        }
        if (origins() != null) {
            origins().forEach(e -> e.validate());
        }
        if (responseBasedOriginErrorDetectionSettings() != null) {
            responseBasedOriginErrorDetectionSettings().validate();
        }
    }
}
