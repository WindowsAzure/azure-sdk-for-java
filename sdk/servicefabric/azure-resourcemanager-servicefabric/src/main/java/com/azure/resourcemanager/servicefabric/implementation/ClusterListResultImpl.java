// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

import com.azure.resourcemanager.servicefabric.fluent.models.ClusterInner;
import com.azure.resourcemanager.servicefabric.fluent.models.ClusterListResultInner;
import com.azure.resourcemanager.servicefabric.models.Cluster;
import com.azure.resourcemanager.servicefabric.models.ClusterListResult;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ClusterListResultImpl implements ClusterListResult {
    private ClusterListResultInner innerObject;

    private final com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager;

    ClusterListResultImpl(
        ClusterListResultInner innerObject,
        com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Cluster> value() {
        List<ClusterInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner.stream().map(inner1 -> new ClusterImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public ClusterListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicefabric.ServiceFabricManager manager() {
        return this.serviceManager;
    }
}
