// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the load balancer configuration. */
@Fluent
public final class LoadBalancerConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoadBalancerConfiguration.class);

    /*
     * Resource Name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private LoadBalancerConfigurationProperties properties;

    /**
     * Get the name property: Resource Name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource Name.
     *
     * @param name the name value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: The properties property.
     *
     * @return the properties value.
     */
    public LoadBalancerConfigurationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     *
     * @param properties the properties value to set.
     * @return the LoadBalancerConfiguration object itself.
     */
    public LoadBalancerConfiguration withProperties(LoadBalancerConfigurationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
