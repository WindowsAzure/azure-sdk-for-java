/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_03.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An alert incident indicates the activation status of an alert rule.
 */
public class IncidentInner {
    /**
     * Incident name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Rule name that is associated with the incident.
     */
    @JsonProperty(value = "ruleName", access = JsonProperty.Access.WRITE_ONLY)
    private String ruleName;

    /**
     * A boolean to indicate whether the incident is active or resolved.
     */
    @JsonProperty(value = "isActive", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isActive;

    /**
     * The time at which the incident was activated in ISO8601 format.
     */
    @JsonProperty(value = "activatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime activatedTime;

    /**
     * The time at which the incident was resolved in ISO8601 format. If null,
     * it means the incident is still active.
     */
    @JsonProperty(value = "resolvedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime resolvedTime;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the ruleName value.
     *
     * @return the ruleName value
     */
    public String ruleName() {
        return this.ruleName;
    }

    /**
     * Get the isActive value.
     *
     * @return the isActive value
     */
    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * Get the activatedTime value.
     *
     * @return the activatedTime value
     */
    public DateTime activatedTime() {
        return this.activatedTime;
    }

    /**
     * Get the resolvedTime value.
     *
     * @return the resolvedTime value
     */
    public DateTime resolvedTime() {
        return this.resolvedTime;
    }

}
