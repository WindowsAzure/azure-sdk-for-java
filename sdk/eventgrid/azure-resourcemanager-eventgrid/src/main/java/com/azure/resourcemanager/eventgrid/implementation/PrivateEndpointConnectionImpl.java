// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.eventgrid.models.ConnectionState;
import com.azure.resourcemanager.eventgrid.models.PrivateEndpoint;
import com.azure.resourcemanager.eventgrid.models.PrivateEndpointConnection;
import com.azure.resourcemanager.eventgrid.models.ResourceProvisioningState;
import java.util.Collections;
import java.util.List;

public final class PrivateEndpointConnectionImpl implements PrivateEndpointConnection {
    private PrivateEndpointConnectionInner innerObject;

    private final EventGridManager serviceManager;

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner innerObject, EventGridManager serviceManager) {
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

    public List<String> groupIds() {
        List<String> inner = this.innerModel().groupIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ConnectionState privateLinkServiceConnectionState() {
        return this.innerModel().privateLinkServiceConnectionState();
    }

    public ResourceProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private EventGridManager manager() {
        return this.serviceManager;
    }
}
