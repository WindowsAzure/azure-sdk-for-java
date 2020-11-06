/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a monitoring event.
 */
public class EventProperties {
    /**
     * The Id of the monitoring event.
     */
    @JsonProperty(value = "eventCode")
    private String eventCode;

    /**
     * The event name.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The type of the event. for example: VM Health, Server Health, Job
     * Failure etc.
     */
    @JsonProperty(value = "eventType")
    private String eventType;

    /**
     * The friendly name of the source of the event on which it is raised (for
     * example, VM, VMM etc).
     */
    @JsonProperty(value = "affectedObjectFriendlyName")
    private String affectedObjectFriendlyName;

    /**
     * The severity of the event.
     */
    @JsonProperty(value = "severity")
    private String severity;

    /**
     * The time of occurrence of the event.
     */
    @JsonProperty(value = "timeOfOccurrence")
    private DateTime timeOfOccurrence;

    /**
     * The ARM ID of the fabric.
     */
    @JsonProperty(value = "fabricId")
    private String fabricId;

    /**
     * The provider specific settings.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private EventProviderSpecificDetails providerSpecificDetails;

    /**
     * The event specific settings.
     */
    @JsonProperty(value = "eventSpecificDetails")
    private EventSpecificDetails eventSpecificDetails;

    /**
     * The list of errors / warnings capturing details associated with the
     * issue(s).
     */
    @JsonProperty(value = "healthErrors")
    private List<HealthError> healthErrors;

    /**
     * Get the Id of the monitoring event.
     *
     * @return the eventCode value
     */
    public String eventCode() {
        return this.eventCode;
    }

    /**
     * Set the Id of the monitoring event.
     *
     * @param eventCode the eventCode value to set
     * @return the EventProperties object itself.
     */
    public EventProperties withEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }

    /**
     * Get the event name.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the event name.
     *
     * @param description the description value to set
     * @return the EventProperties object itself.
     */
    public EventProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the type of the event. for example: VM Health, Server Health, Job Failure etc.
     *
     * @return the eventType value
     */
    public String eventType() {
        return this.eventType;
    }

    /**
     * Set the type of the event. for example: VM Health, Server Health, Job Failure etc.
     *
     * @param eventType the eventType value to set
     * @return the EventProperties object itself.
     */
    public EventProperties withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get the friendly name of the source of the event on which it is raised (for example, VM, VMM etc).
     *
     * @return the affectedObjectFriendlyName value
     */
    public String affectedObjectFriendlyName() {
        return this.affectedObjectFriendlyName;
    }

    /**
     * Set the friendly name of the source of the event on which it is raised (for example, VM, VMM etc).
     *
     * @param affectedObjectFriendlyName the affectedObjectFriendlyName value to set
     * @return the EventProperties object itself.
     */
    public EventProperties withAffectedObjectFriendlyName(String affectedObjectFriendlyName) {
        this.affectedObjectFriendlyName = affectedObjectFriendlyName;
        return this;
    }

    /**
     * Get the severity of the event.
     *
     * @return the severity value
     */
    public String severity() {
        return this.severity;
    }

    /**
     * Set the severity of the event.
     *
     * @param severity the severity value to set
     * @return the EventProperties object itself.
     */
    public EventProperties withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the time of occurrence of the event.
     *
     * @return the timeOfOccurrence value
     */
    public DateTime timeOfOccurrence() {
        return this.timeOfOccurrence;
    }

    /**
     * Set the time of occurrence of the event.
     *
     * @param timeOfOccurrence the timeOfOccurrence value to set
     * @return the EventProperties object itself.
     */
    public EventProperties withTimeOfOccurrence(DateTime timeOfOccurrence) {
        this.timeOfOccurrence = timeOfOccurrence;
        return this;
    }

    /**
     * Get the ARM ID of the fabric.
     *
     * @return the fabricId value
     */
    public String fabricId() {
        return this.fabricId;
    }

    /**
     * Set the ARM ID of the fabric.
     *
     * @param fabricId the fabricId value to set
     * @return the EventProperties object itself.
     */
    public EventProperties withFabricId(String fabricId) {
        this.fabricId = fabricId;
        return this;
    }

    /**
     * Get the provider specific settings.
     *
     * @return the providerSpecificDetails value
     */
    public EventProviderSpecificDetails providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the provider specific settings.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set
     * @return the EventProperties object itself.
     */
    public EventProperties withProviderSpecificDetails(EventProviderSpecificDetails providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Get the event specific settings.
     *
     * @return the eventSpecificDetails value
     */
    public EventSpecificDetails eventSpecificDetails() {
        return this.eventSpecificDetails;
    }

    /**
     * Set the event specific settings.
     *
     * @param eventSpecificDetails the eventSpecificDetails value to set
     * @return the EventProperties object itself.
     */
    public EventProperties withEventSpecificDetails(EventSpecificDetails eventSpecificDetails) {
        this.eventSpecificDetails = eventSpecificDetails;
        return this;
    }

    /**
     * Get the list of errors / warnings capturing details associated with the issue(s).
     *
     * @return the healthErrors value
     */
    public List<HealthError> healthErrors() {
        return this.healthErrors;
    }

    /**
     * Set the list of errors / warnings capturing details associated with the issue(s).
     *
     * @param healthErrors the healthErrors value to set
     * @return the EventProperties object itself.
     */
    public EventProperties withHealthErrors(List<HealthError> healthErrors) {
        this.healthErrors = healthErrors;
        return this;
    }

}
