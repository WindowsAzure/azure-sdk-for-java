// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A collection of backends that can be routed to. */
@Fluent
public class BackendPoolUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackendPoolUpdateParameters.class);

    /*
     * The set of backends for this pool
     */
    @JsonProperty(value = "backends")
    private List<Backend> backends;

    /*
     * Load balancing settings for a backend pool
     */
    @JsonProperty(value = "loadBalancingSettings")
    private SubResource loadBalancingSettings;

    /*
     * L7 health probe settings for a backend pool
     */
    @JsonProperty(value = "healthProbeSettings")
    private SubResource healthProbeSettings;

    /**
     * Get the backends property: The set of backends for this pool.
     *
     * @return the backends value.
     */
    public List<Backend> backends() {
        return this.backends;
    }

    /**
     * Set the backends property: The set of backends for this pool.
     *
     * @param backends the backends value to set.
     * @return the BackendPoolUpdateParameters object itself.
     */
    public BackendPoolUpdateParameters withBackends(List<Backend> backends) {
        this.backends = backends;
        return this;
    }

    /**
     * Get the loadBalancingSettings property: Load balancing settings for a backend pool.
     *
     * @return the loadBalancingSettings value.
     */
    public SubResource loadBalancingSettings() {
        return this.loadBalancingSettings;
    }

    /**
     * Set the loadBalancingSettings property: Load balancing settings for a backend pool.
     *
     * @param loadBalancingSettings the loadBalancingSettings value to set.
     * @return the BackendPoolUpdateParameters object itself.
     */
    public BackendPoolUpdateParameters withLoadBalancingSettings(SubResource loadBalancingSettings) {
        this.loadBalancingSettings = loadBalancingSettings;
        return this;
    }

    /**
     * Get the healthProbeSettings property: L7 health probe settings for a backend pool.
     *
     * @return the healthProbeSettings value.
     */
    public SubResource healthProbeSettings() {
        return this.healthProbeSettings;
    }

    /**
     * Set the healthProbeSettings property: L7 health probe settings for a backend pool.
     *
     * @param healthProbeSettings the healthProbeSettings value to set.
     * @return the BackendPoolUpdateParameters object itself.
     */
    public BackendPoolUpdateParameters withHealthProbeSettings(SubResource healthProbeSettings) {
        this.healthProbeSettings = healthProbeSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backends() != null) {
            backends().forEach(e -> e.validate());
        }
    }
}
