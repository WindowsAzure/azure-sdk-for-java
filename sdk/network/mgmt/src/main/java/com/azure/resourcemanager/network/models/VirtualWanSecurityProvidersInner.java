// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.VirtualWanSecurityProvider;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualWanSecurityProviders model. */
@Fluent
public final class VirtualWanSecurityProvidersInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualWanSecurityProvidersInner.class);

    /*
     * List of VirtualWAN security providers.
     */
    @JsonProperty(value = "supportedProviders")
    private List<VirtualWanSecurityProvider> supportedProviders;

    /**
     * Get the supportedProviders property: List of VirtualWAN security providers.
     *
     * @return the supportedProviders value.
     */
    public List<VirtualWanSecurityProvider> supportedProviders() {
        return this.supportedProviders;
    }

    /**
     * Set the supportedProviders property: List of VirtualWAN security providers.
     *
     * @param supportedProviders the supportedProviders value to set.
     * @return the VirtualWanSecurityProvidersInner object itself.
     */
    public VirtualWanSecurityProvidersInner withSupportedProviders(
        List<VirtualWanSecurityProvider> supportedProviders) {
        this.supportedProviders = supportedProviders;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedProviders() != null) {
            supportedProviders().forEach(e -> e.validate());
        }
    }
}
