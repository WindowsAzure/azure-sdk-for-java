// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Defines the network interface resource settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resourceType")
@JsonTypeName("Microsoft.Network/networkInterfaces")
@Fluent
public final class NetworkInterfaceResourceSettings extends ResourceSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkInterfaceResourceSettings.class);

    /*
     * Gets or sets the IP configurations of the NIC.
     */
    @JsonProperty(value = "ipConfigurations")
    private List<NicIpConfigurationResourceSettings> ipConfigurations;

    /*
     * Gets or sets a value indicating whether accelerated networking is
     * enabled.
     */
    @JsonProperty(value = "enableAcceleratedNetworking")
    private Boolean enableAcceleratedNetworking;

    /**
     * Get the ipConfigurations property: Gets or sets the IP configurations of the NIC.
     *
     * @return the ipConfigurations value.
     */
    public List<NicIpConfigurationResourceSettings> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: Gets or sets the IP configurations of the NIC.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the NetworkInterfaceResourceSettings object itself.
     */
    public NetworkInterfaceResourceSettings withIpConfigurations(
        List<NicIpConfigurationResourceSettings> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the enableAcceleratedNetworking property: Gets or sets a value indicating whether accelerated networking is
     * enabled.
     *
     * @return the enableAcceleratedNetworking value.
     */
    public Boolean enableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }

    /**
     * Set the enableAcceleratedNetworking property: Gets or sets a value indicating whether accelerated networking is
     * enabled.
     *
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value to set.
     * @return the NetworkInterfaceResourceSettings object itself.
     */
    public NetworkInterfaceResourceSettings withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkInterfaceResourceSettings withTargetResourceName(String targetResourceName) {
        super.withTargetResourceName(targetResourceName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
    }
}
