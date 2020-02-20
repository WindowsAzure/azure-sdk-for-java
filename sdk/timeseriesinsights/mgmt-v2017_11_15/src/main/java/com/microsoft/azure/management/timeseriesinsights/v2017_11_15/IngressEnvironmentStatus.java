/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that represents the status of ingress on an environment.
 */
public class IngressEnvironmentStatus {
    /**
     * This string represents the state of ingress operations on an
     * environment. It can be "Disabled", "Ready", "Running", "Paused" or
     * "Unknown". Possible values include: 'Disabled', 'Ready', 'Running',
     * 'Paused', 'Unknown'.
     */
    @JsonProperty(value = "state")
    private IngressState state;

    /**
     * An object that contains the details about an environment's state.
     */
    @JsonProperty(value = "stateDetails")
    private EnvironmentStateDetails stateDetails;

    /**
     * Get this string represents the state of ingress operations on an environment. It can be "Disabled", "Ready", "Running", "Paused" or "Unknown". Possible values include: 'Disabled', 'Ready', 'Running', 'Paused', 'Unknown'.
     *
     * @return the state value
     */
    public IngressState state() {
        return this.state;
    }

    /**
     * Set this string represents the state of ingress operations on an environment. It can be "Disabled", "Ready", "Running", "Paused" or "Unknown". Possible values include: 'Disabled', 'Ready', 'Running', 'Paused', 'Unknown'.
     *
     * @param state the state value to set
     * @return the IngressEnvironmentStatus object itself.
     */
    public IngressEnvironmentStatus withState(IngressState state) {
        this.state = state;
        return this;
    }

    /**
     * Get an object that contains the details about an environment's state.
     *
     * @return the stateDetails value
     */
    public EnvironmentStateDetails stateDetails() {
        return this.stateDetails;
    }

    /**
     * Set an object that contains the details about an environment's state.
     *
     * @param stateDetails the stateDetails value to set
     * @return the IngressEnvironmentStatus object itself.
     */
    public IngressEnvironmentStatus withStateDetails(EnvironmentStateDetails stateDetails) {
        this.stateDetails = stateDetails;
        return this;
    }

}
