/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.LoadBalancerConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A SQL Server availability group listener.
 */
@JsonFlatten
public class AvailabilityGroupListenerInner extends ProxyResource {
    /**
     * Provisioning state to track the async operation status.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Name of the availability group.
     */
    @JsonProperty(value = "properties.availabilityGroupName")
    private String availabilityGroupName;

    /**
     * List of load balancer configurations for an availability group listener.
     */
    @JsonProperty(value = "properties.loadBalancerConfigurations")
    private List<LoadBalancerConfiguration> loadBalancerConfigurations;

    /**
     * Create a default availability group if it does not exist.
     */
    @JsonProperty(value = "properties.createDefaultAvailabilityGroupIfNotExist")
    private Boolean createDefaultAvailabilityGroupIfNotExist;

    /**
     * Listener port.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /**
     * Get provisioning state to track the async operation status.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get name of the availability group.
     *
     * @return the availabilityGroupName value
     */
    public String availabilityGroupName() {
        return this.availabilityGroupName;
    }

    /**
     * Set name of the availability group.
     *
     * @param availabilityGroupName the availabilityGroupName value to set
     * @return the AvailabilityGroupListenerInner object itself.
     */
    public AvailabilityGroupListenerInner withAvailabilityGroupName(String availabilityGroupName) {
        this.availabilityGroupName = availabilityGroupName;
        return this;
    }

    /**
     * Get list of load balancer configurations for an availability group listener.
     *
     * @return the loadBalancerConfigurations value
     */
    public List<LoadBalancerConfiguration> loadBalancerConfigurations() {
        return this.loadBalancerConfigurations;
    }

    /**
     * Set list of load balancer configurations for an availability group listener.
     *
     * @param loadBalancerConfigurations the loadBalancerConfigurations value to set
     * @return the AvailabilityGroupListenerInner object itself.
     */
    public AvailabilityGroupListenerInner withLoadBalancerConfigurations(List<LoadBalancerConfiguration> loadBalancerConfigurations) {
        this.loadBalancerConfigurations = loadBalancerConfigurations;
        return this;
    }

    /**
     * Get create a default availability group if it does not exist.
     *
     * @return the createDefaultAvailabilityGroupIfNotExist value
     */
    public Boolean createDefaultAvailabilityGroupIfNotExist() {
        return this.createDefaultAvailabilityGroupIfNotExist;
    }

    /**
     * Set create a default availability group if it does not exist.
     *
     * @param createDefaultAvailabilityGroupIfNotExist the createDefaultAvailabilityGroupIfNotExist value to set
     * @return the AvailabilityGroupListenerInner object itself.
     */
    public AvailabilityGroupListenerInner withCreateDefaultAvailabilityGroupIfNotExist(Boolean createDefaultAvailabilityGroupIfNotExist) {
        this.createDefaultAvailabilityGroupIfNotExist = createDefaultAvailabilityGroupIfNotExist;
        return this;
    }

    /**
     * Get listener port.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set listener port.
     *
     * @param port the port value to set
     * @return the AvailabilityGroupListenerInner object itself.
     */
    public AvailabilityGroupListenerInner withPort(Integer port) {
        this.port = port;
        return this;
    }

}
