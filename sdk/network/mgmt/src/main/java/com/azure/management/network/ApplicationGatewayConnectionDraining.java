// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApplicationGatewayConnectionDraining model. */
@Fluent
public final class ApplicationGatewayConnectionDraining {
    /*
     * Whether connection draining is enabled or not.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * The number of seconds connection draining is active. Acceptable values
     * are from 1 second to 3600 seconds.
     */
    @JsonProperty(value = "drainTimeoutInSec", required = true)
    private int drainTimeoutInSec;

    /**
     * Get the enabled property: Whether connection draining is enabled or not.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether connection draining is enabled or not.
     *
     * @param enabled the enabled value to set.
     * @return the ApplicationGatewayConnectionDraining object itself.
     */
    public ApplicationGatewayConnectionDraining withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the drainTimeoutInSec property: The number of seconds connection draining is active. Acceptable values are
     * from 1 second to 3600 seconds.
     *
     * @return the drainTimeoutInSec value.
     */
    public int drainTimeoutInSec() {
        return this.drainTimeoutInSec;
    }

    /**
     * Set the drainTimeoutInSec property: The number of seconds connection draining is active. Acceptable values are
     * from 1 second to 3600 seconds.
     *
     * @param drainTimeoutInSec the drainTimeoutInSec value to set.
     * @return the ApplicationGatewayConnectionDraining object itself.
     */
    public ApplicationGatewayConnectionDraining withDrainTimeoutInSec(int drainTimeoutInSec) {
        this.drainTimeoutInSec = drainTimeoutInSec;
        return this;
    }
}
