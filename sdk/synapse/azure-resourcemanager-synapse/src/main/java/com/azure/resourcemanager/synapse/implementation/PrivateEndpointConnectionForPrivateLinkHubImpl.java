// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.fluent.models.PrivateEndpointConnectionForPrivateLinkHubInner;
import com.azure.resourcemanager.synapse.models.PrivateEndpointConnectionForPrivateLinkHub;
import com.azure.resourcemanager.synapse.models.PrivateEndpointConnectionProperties;

public final class PrivateEndpointConnectionForPrivateLinkHubImpl
    implements PrivateEndpointConnectionForPrivateLinkHub {
    private PrivateEndpointConnectionForPrivateLinkHubInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    PrivateEndpointConnectionForPrivateLinkHubImpl(
        PrivateEndpointConnectionForPrivateLinkHubInner innerObject,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public PrivateEndpointConnectionProperties properties() {
        return this.innerModel().properties();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PrivateEndpointConnectionForPrivateLinkHubInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
