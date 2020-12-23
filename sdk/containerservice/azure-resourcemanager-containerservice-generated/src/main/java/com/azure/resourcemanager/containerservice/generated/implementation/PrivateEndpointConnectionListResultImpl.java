// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.implementation;

import com.azure.resourcemanager.containerservice.generated.ContainerServiceManager;
import com.azure.resourcemanager.containerservice.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.containerservice.generated.fluent.models.PrivateEndpointConnectionListResultInner;
import com.azure.resourcemanager.containerservice.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.containerservice.generated.models.PrivateEndpointConnectionListResult;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PrivateEndpointConnectionListResultImpl implements PrivateEndpointConnectionListResult {
    private PrivateEndpointConnectionListResultInner innerObject;

    private final ContainerServiceManager serviceManager;

    PrivateEndpointConnectionListResultImpl(
        PrivateEndpointConnectionListResultInner innerObject, ContainerServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PrivateEndpointConnection> value() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateEndpointConnectionListResultInner innerModel() {
        return this.innerObject;
    }

    private ContainerServiceManager manager() {
        return this.serviceManager;
    }
}
