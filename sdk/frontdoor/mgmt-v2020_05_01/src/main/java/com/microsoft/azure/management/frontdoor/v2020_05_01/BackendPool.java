/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A backend pool is a collection of backends that can be routed to.
 */
@JsonFlatten
public class BackendPool extends SubResource {
    /**
     * The set of backends for this pool.
     */
    @JsonProperty(value = "properties.backends")
    private List<Backend> backends;

    /**
     * Load balancing settings for a backend pool.
     */
    @JsonProperty(value = "properties.loadBalancingSettings")
    private SubResource loadBalancingSettings;

    /**
     * L7 health probe settings for a backend pool.
     */
    @JsonProperty(value = "properties.healthProbeSettings")
    private SubResource healthProbeSettings;

    /**
     * Resource status. Possible values include: 'Creating', 'Enabling',
     * 'Enabled', 'Disabling', 'Disabled', 'Deleting'.
     */
    @JsonProperty(value = "properties.resourceState")
    private FrontDoorResourceState resourceState;

    /**
     * Resource name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the set of backends for this pool.
     *
     * @return the backends value
     */
    public List<Backend> backends() {
        return this.backends;
    }

    /**
     * Set the set of backends for this pool.
     *
     * @param backends the backends value to set
     * @return the BackendPool object itself.
     */
    public BackendPool withBackends(List<Backend> backends) {
        this.backends = backends;
        return this;
    }

    /**
     * Get load balancing settings for a backend pool.
     *
     * @return the loadBalancingSettings value
     */
    public SubResource loadBalancingSettings() {
        return this.loadBalancingSettings;
    }

    /**
     * Set load balancing settings for a backend pool.
     *
     * @param loadBalancingSettings the loadBalancingSettings value to set
     * @return the BackendPool object itself.
     */
    public BackendPool withLoadBalancingSettings(SubResource loadBalancingSettings) {
        this.loadBalancingSettings = loadBalancingSettings;
        return this;
    }

    /**
     * Get l7 health probe settings for a backend pool.
     *
     * @return the healthProbeSettings value
     */
    public SubResource healthProbeSettings() {
        return this.healthProbeSettings;
    }

    /**
     * Set l7 health probe settings for a backend pool.
     *
     * @param healthProbeSettings the healthProbeSettings value to set
     * @return the BackendPool object itself.
     */
    public BackendPool withHealthProbeSettings(SubResource healthProbeSettings) {
        this.healthProbeSettings = healthProbeSettings;
        return this;
    }

    /**
     * Get resource status. Possible values include: 'Creating', 'Enabling', 'Enabled', 'Disabling', 'Disabled', 'Deleting'.
     *
     * @return the resourceState value
     */
    public FrontDoorResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Set resource status. Possible values include: 'Creating', 'Enabling', 'Enabled', 'Disabling', 'Disabled', 'Deleting'.
     *
     * @param resourceState the resourceState value to set
     * @return the BackendPool object itself.
     */
    public BackendPool withResourceState(FrontDoorResourceState resourceState) {
        this.resourceState = resourceState;
        return this;
    }

    /**
     * Get resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set resource name.
     *
     * @param name the name value to set
     * @return the BackendPool object itself.
     */
    public BackendPool withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
