// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.monitorexporter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The AvailabilityData model. */
@Fluent
public final class AvailabilityData extends MonitorDomain {
    /*
     * Identifier of a test run. Use it to correlate steps of test run and
     * telemetry generated by the service.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Name of the test that these availability results represent.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Duration in format: DD.HH:MM:SS.MMMMMM. Must be less than 1000 days.
     */
    @JsonProperty(value = "duration", required = true)
    private String duration;

    /*
     * Success flag.
     */
    @JsonProperty(value = "success", required = true)
    private boolean success;

    /*
     * Name of the location where the test was run from.
     */
    @JsonProperty(value = "runLocation")
    private String runLocation;

    /*
     * Diagnostic message for the result.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Collection of custom properties.
     */
    @JsonProperty(value = "properties")
    private Map<String, String> properties;

    /*
     * Collection of custom measurements.
     */
    @JsonProperty(value = "measurements")
    private Map<String, Double> measurements;

    /**
     * Get the id property: Identifier of a test run. Use it to correlate steps of test run and telemetry generated by
     * the service.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Identifier of a test run. Use it to correlate steps of test run and telemetry generated by
     * the service.
     *
     * @param id the id value to set.
     * @return the AvailabilityData object itself.
     */
    public AvailabilityData setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name of the test that these availability results represent.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the test that these availability results represent.
     *
     * @param name the name value to set.
     * @return the AvailabilityData object itself.
     */
    public AvailabilityData setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the duration property: Duration in format: DD.HH:MM:SS.MMMMMM. Must be less than 1000 days.
     *
     * @return the duration value.
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * Set the duration property: Duration in format: DD.HH:MM:SS.MMMMMM. Must be less than 1000 days.
     *
     * @param duration the duration value to set.
     * @return the AvailabilityData object itself.
     */
    public AvailabilityData setDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the success property: Success flag.
     *
     * @return the success value.
     */
    public boolean isSuccess() {
        return this.success;
    }

    /**
     * Set the success property: Success flag.
     *
     * @param success the success value to set.
     * @return the AvailabilityData object itself.
     */
    public AvailabilityData setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    /**
     * Get the runLocation property: Name of the location where the test was run from.
     *
     * @return the runLocation value.
     */
    public String getRunLocation() {
        return this.runLocation;
    }

    /**
     * Set the runLocation property: Name of the location where the test was run from.
     *
     * @param runLocation the runLocation value to set.
     * @return the AvailabilityData object itself.
     */
    public AvailabilityData setRunLocation(String runLocation) {
        this.runLocation = runLocation;
        return this;
    }

    /**
     * Get the message property: Diagnostic message for the result.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Diagnostic message for the result.
     *
     * @param message the message value to set.
     * @return the AvailabilityData object itself.
     */
    public AvailabilityData setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the properties property: Collection of custom properties.
     *
     * @return the properties value.
     */
    public Map<String, String> getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Collection of custom properties.
     *
     * @param properties the properties value to set.
     * @return the AvailabilityData object itself.
     */
    public AvailabilityData setProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the measurements property: Collection of custom measurements.
     *
     * @return the measurements value.
     */
    public Map<String, Double> getMeasurements() {
        return this.measurements;
    }

    /**
     * Set the measurements property: Collection of custom measurements.
     *
     * @param measurements the measurements value to set.
     * @return the AvailabilityData object itself.
     */
    public AvailabilityData setMeasurements(Map<String, Double> measurements) {
        this.measurements = measurements;
        return this;
    }
}
