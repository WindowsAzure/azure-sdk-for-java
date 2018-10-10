/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabricmesh.implementation;

import java.util.List;
import com.microsoft.azure.management.servicefabricmesh.HealthState;
import com.microsoft.azure.management.servicefabricmesh.ApplicationResourceStatus;
import com.microsoft.azure.management.servicefabricmesh.DiagnosticsDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * This type describes an application resource.
 */
@JsonFlatten
@SkipParentValidation
public class ApplicationResourceDescriptionInner extends Resource {
    /**
     * State of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * User readable description of the application.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Internal use.
     */
    @JsonProperty(value = "properties.debugParams")
    private String debugParams;

    /**
     * describes the services in the application.
     */
    @JsonProperty(value = "properties.services")
    private List<ServiceResourceDescriptionInner> services;

    /**
     * Describes the health state of an application resource. Possible values
     * include: 'Invalid', 'Ok', 'Warning', 'Error', 'Unknown'.
     */
    @JsonProperty(value = "properties.healthState", access = JsonProperty.Access.WRITE_ONLY)
    private HealthState healthState;

    /**
     * When the application's health state is not 'Ok', this additional details
     * from service fabric Health Manager for the user to know why the
     * application is marked unhealthy.
     */
    @JsonProperty(value = "properties.unhealthyEvaluation", access = JsonProperty.Access.WRITE_ONLY)
    private String unhealthyEvaluation;

    /**
     * Status of the application resource. Possible values include: 'Invalid',
     * 'Ready', 'Upgrading', 'Creating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationResourceStatus status;

    /**
     * Gives additional information about the current status of the application
     * deployment.
     */
    @JsonProperty(value = "properties.statusDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String statusDetails;

    /**
     * Names of the services in the application.
     */
    @JsonProperty(value = "properties.serviceNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> serviceNames;

    /**
     * Describes the diagnostics definition and usage for an application
     * resource.
     */
    @JsonProperty(value = "properties.diagnostics")
    private DiagnosticsDescription diagnostics;

    /**
     * Get state of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get user readable description of the application.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set user readable description of the application.
     *
     * @param description the description value to set
     * @return the ApplicationResourceDescriptionInner object itself.
     */
    public ApplicationResourceDescriptionInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get internal use.
     *
     * @return the debugParams value
     */
    public String debugParams() {
        return this.debugParams;
    }

    /**
     * Set internal use.
     *
     * @param debugParams the debugParams value to set
     * @return the ApplicationResourceDescriptionInner object itself.
     */
    public ApplicationResourceDescriptionInner withDebugParams(String debugParams) {
        this.debugParams = debugParams;
        return this;
    }

    /**
     * Get describes the services in the application.
     *
     * @return the services value
     */
    public List<ServiceResourceDescriptionInner> services() {
        return this.services;
    }

    /**
     * Set describes the services in the application.
     *
     * @param services the services value to set
     * @return the ApplicationResourceDescriptionInner object itself.
     */
    public ApplicationResourceDescriptionInner withServices(List<ServiceResourceDescriptionInner> services) {
        this.services = services;
        return this;
    }

    /**
     * Get describes the health state of an application resource. Possible values include: 'Invalid', 'Ok', 'Warning', 'Error', 'Unknown'.
     *
     * @return the healthState value
     */
    public HealthState healthState() {
        return this.healthState;
    }

    /**
     * Get when the application's health state is not 'Ok', this additional details from service fabric Health Manager for the user to know why the application is marked unhealthy.
     *
     * @return the unhealthyEvaluation value
     */
    public String unhealthyEvaluation() {
        return this.unhealthyEvaluation;
    }

    /**
     * Get status of the application resource. Possible values include: 'Invalid', 'Ready', 'Upgrading', 'Creating', 'Deleting', 'Failed'.
     *
     * @return the status value
     */
    public ApplicationResourceStatus status() {
        return this.status;
    }

    /**
     * Get gives additional information about the current status of the application deployment.
     *
     * @return the statusDetails value
     */
    public String statusDetails() {
        return this.statusDetails;
    }

    /**
     * Get names of the services in the application.
     *
     * @return the serviceNames value
     */
    public List<String> serviceNames() {
        return this.serviceNames;
    }

    /**
     * Get describes the diagnostics definition and usage for an application resource.
     *
     * @return the diagnostics value
     */
    public DiagnosticsDescription diagnostics() {
        return this.diagnostics;
    }

    /**
     * Set describes the diagnostics definition and usage for an application resource.
     *
     * @param diagnostics the diagnostics value to set
     * @return the ApplicationResourceDescriptionInner object itself.
     */
    public ApplicationResourceDescriptionInner withDiagnostics(DiagnosticsDescription diagnostics) {
        this.diagnostics = diagnostics;
        return this;
    }

}
