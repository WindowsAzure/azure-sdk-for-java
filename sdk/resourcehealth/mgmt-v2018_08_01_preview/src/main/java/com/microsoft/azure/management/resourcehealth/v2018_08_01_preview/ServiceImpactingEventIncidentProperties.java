/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2018_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the service impacting event.
 */
public class ServiceImpactingEventIncidentProperties {
    /**
     * Title of the incident.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * Service impacted by the event.
     */
    @JsonProperty(value = "service")
    private String service;

    /**
     * Region impacted by the event.
     */
    @JsonProperty(value = "region")
    private String region;

    /**
     * Type of Event.
     */
    @JsonProperty(value = "incidentType")
    private String incidentType;

    /**
     * Get title of the incident.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set title of the incident.
     *
     * @param title the title value to set
     * @return the ServiceImpactingEventIncidentProperties object itself.
     */
    public ServiceImpactingEventIncidentProperties withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get service impacted by the event.
     *
     * @return the service value
     */
    public String service() {
        return this.service;
    }

    /**
     * Set service impacted by the event.
     *
     * @param service the service value to set
     * @return the ServiceImpactingEventIncidentProperties object itself.
     */
    public ServiceImpactingEventIncidentProperties withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Get region impacted by the event.
     *
     * @return the region value
     */
    public String region() {
        return this.region;
    }

    /**
     * Set region impacted by the event.
     *
     * @param region the region value to set
     * @return the ServiceImpactingEventIncidentProperties object itself.
     */
    public ServiceImpactingEventIncidentProperties withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get type of Event.
     *
     * @return the incidentType value
     */
    public String incidentType() {
        return this.incidentType;
    }

    /**
     * Set type of Event.
     *
     * @param incidentType the incidentType value to set
     * @return the ServiceImpactingEventIncidentProperties object itself.
     */
    public ServiceImpactingEventIncidentProperties withIncidentType(String incidentType) {
        this.incidentType = incidentType;
        return this;
    }

}
