// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.compute.generated.models.PrivateEndpoint;
import com.azure.resourcemanager.compute.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.compute.generated.models.PrivateEndpointConnectionProvisioningState;
import com.azure.resourcemanager.compute.generated.models.PrivateLinkServiceConnectionState;

public final class PrivateEndpointConnectionImpl implements PrivateEndpointConnection {
    private PrivateEndpointConnectionInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    PrivateEndpointConnectionImpl(
        PrivateEndpointConnectionInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PrivateEndpoint privateEndpoint() {
        return this.innerModel().privateEndpoint();
    }

    public PrivateLinkServiceConnectionState privateLinkServiceConnectionState() {
        return this.innerModel().privateLinkServiceConnectionState();
    }

    public PrivateEndpointConnectionProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
