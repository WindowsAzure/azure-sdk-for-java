// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The LoadBalancerConfigurationProperties model. */
@Fluent
public final class LoadBalancerConfigurationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoadBalancerConfigurationProperties.class);

    /*
     * List of IP
     */
    @JsonProperty(value = "frontendIPConfigurations")
    private List<LoadBalancerFrontendIpConfiguration> frontendIpConfigurations;

    /**
     * Get the frontendIpConfigurations property: List of IP.
     *
     * @return the frontendIpConfigurations value.
     */
    public List<LoadBalancerFrontendIpConfiguration> frontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }

    /**
     * Set the frontendIpConfigurations property: List of IP.
     *
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the LoadBalancerConfigurationProperties object itself.
     */
    public LoadBalancerConfigurationProperties withFrontendIpConfigurations(
        List<LoadBalancerFrontendIpConfiguration> frontendIpConfigurations) {
        this.frontendIpConfigurations = frontendIpConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (frontendIpConfigurations() != null) {
            frontendIpConfigurations().forEach(e -> e.validate());
        }
    }
}
