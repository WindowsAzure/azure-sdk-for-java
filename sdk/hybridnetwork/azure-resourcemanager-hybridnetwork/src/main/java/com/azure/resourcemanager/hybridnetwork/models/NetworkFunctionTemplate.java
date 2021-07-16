// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The network function template. */
@Fluent
public final class NetworkFunctionTemplate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkFunctionTemplate.class);

    /*
     * An array of network function role definitions.
     */
    @JsonProperty(value = "networkFunctionRoleConfigurations")
    private List<NetworkFunctionRoleConfiguration> networkFunctionRoleConfigurations;

    /**
     * Get the networkFunctionRoleConfigurations property: An array of network function role definitions.
     *
     * @return the networkFunctionRoleConfigurations value.
     */
    public List<NetworkFunctionRoleConfiguration> networkFunctionRoleConfigurations() {
        return this.networkFunctionRoleConfigurations;
    }

    /**
     * Set the networkFunctionRoleConfigurations property: An array of network function role definitions.
     *
     * @param networkFunctionRoleConfigurations the networkFunctionRoleConfigurations value to set.
     * @return the NetworkFunctionTemplate object itself.
     */
    public NetworkFunctionTemplate withNetworkFunctionRoleConfigurations(
        List<NetworkFunctionRoleConfiguration> networkFunctionRoleConfigurations) {
        this.networkFunctionRoleConfigurations = networkFunctionRoleConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkFunctionRoleConfigurations() != null) {
            networkFunctionRoleConfigurations().forEach(e -> e.validate());
        }
    }
}
