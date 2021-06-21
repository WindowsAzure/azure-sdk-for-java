// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LoadBalancerFrontendIpConfiguration model. */
@Fluent
public final class LoadBalancerFrontendIpConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoadBalancerFrontendIpConfiguration.class);

    /*
     * The name of the resource that is unique within the set of frontend IP
     * configurations used by the load balancer. This name can be used to
     * access the resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Properties of load balancer frontend ip configuration.
     */
    @JsonProperty(value = "properties", required = true)
    private LoadBalancerFrontendIpConfigurationProperties properties;

    /**
     * Get the name property: The name of the resource that is unique within the set of frontend IP configurations used
     * by the load balancer. This name can be used to access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within the set of frontend IP configurations used
     * by the load balancer. This name can be used to access the resource.
     *
     * @param name the name value to set.
     * @return the LoadBalancerFrontendIpConfiguration object itself.
     */
    public LoadBalancerFrontendIpConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: Properties of load balancer frontend ip configuration.
     *
     * @return the properties value.
     */
    public LoadBalancerFrontendIpConfigurationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of load balancer frontend ip configuration.
     *
     * @param properties the properties value to set.
     * @return the LoadBalancerFrontendIpConfiguration object itself.
     */
    public LoadBalancerFrontendIpConfiguration withProperties(
        LoadBalancerFrontendIpConfigurationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model LoadBalancerFrontendIpConfiguration"));
        }
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model LoadBalancerFrontendIpConfiguration"));
        } else {
            properties().validate();
        }
    }
}
