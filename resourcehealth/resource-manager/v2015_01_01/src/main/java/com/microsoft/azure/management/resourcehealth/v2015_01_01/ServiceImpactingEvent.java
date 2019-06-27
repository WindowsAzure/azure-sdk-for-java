/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2015_01_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Lists the service impacting events that may be affecting the health of the
 * resource.
 */
public class ServiceImpactingEvent {
    /**
     * Timestamp for when the event started.
     */
    @JsonProperty(value = "eventStartTime")
    private DateTime eventStartTime;

    /**
     * Timestamp for when event was submitted/detected.
     */
    @JsonProperty(value = "eventStatusLastModifiedTime")
    private DateTime eventStatusLastModifiedTime;

    /**
     * Correlation id for the event.
     */
    @JsonProperty(value = "correlationId")
    private String correlationId;

    /**
     * Status of the service impacting event.
     */
    @JsonProperty(value = "status")
    private ServiceImpactingEventStatus status;

    /**
     * Properties of the service impacting event.
     */
    @JsonProperty(value = "incidentProperties")
    private ServiceImpactingEventIncidentProperties incidentProperties;

    /**
     * Get timestamp for when the event started.
     *
     * @return the eventStartTime value
     */
    public DateTime eventStartTime() {
        return this.eventStartTime;
    }

    /**
     * Set timestamp for when the event started.
     *
     * @param eventStartTime the eventStartTime value to set
     * @return the ServiceImpactingEvent object itself.
     */
    public ServiceImpactingEvent withEventStartTime(DateTime eventStartTime) {
        this.eventStartTime = eventStartTime;
        return this;
    }

    /**
     * Get timestamp for when event was submitted/detected.
     *
     * @return the eventStatusLastModifiedTime value
     */
    public DateTime eventStatusLastModifiedTime() {
        return this.eventStatusLastModifiedTime;
    }

    /**
     * Set timestamp for when event was submitted/detected.
     *
     * @param eventStatusLastModifiedTime the eventStatusLastModifiedTime value to set
     * @return the ServiceImpactingEvent object itself.
     */
    public ServiceImpactingEvent withEventStatusLastModifiedTime(DateTime eventStatusLastModifiedTime) {
        this.eventStatusLastModifiedTime = eventStatusLastModifiedTime;
        return this;
    }

    /**
     * Get correlation id for the event.
     *
     * @return the correlationId value
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Set correlation id for the event.
     *
     * @param correlationId the correlationId value to set
     * @return the ServiceImpactingEvent object itself.
     */
    public ServiceImpactingEvent withCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get status of the service impacting event.
     *
     * @return the status value
     */
    public ServiceImpactingEventStatus status() {
        return this.status;
    }

    /**
     * Set status of the service impacting event.
     *
     * @param status the status value to set
     * @return the ServiceImpactingEvent object itself.
     */
    public ServiceImpactingEvent withStatus(ServiceImpactingEventStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get properties of the service impacting event.
     *
     * @return the incidentProperties value
     */
    public ServiceImpactingEventIncidentProperties incidentProperties() {
        return this.incidentProperties;
    }

    /**
     * Set properties of the service impacting event.
     *
     * @param incidentProperties the incidentProperties value to set
     * @return the ServiceImpactingEvent object itself.
     */
    public ServiceImpactingEvent withIncidentProperties(ServiceImpactingEventIncidentProperties incidentProperties) {
        this.incidentProperties = incidentProperties;
        return this;
    }

}
