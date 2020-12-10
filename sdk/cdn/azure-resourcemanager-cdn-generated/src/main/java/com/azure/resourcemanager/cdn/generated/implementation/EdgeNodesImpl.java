// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.generated.CdnManager;
import com.azure.resourcemanager.cdn.generated.fluent.EdgeNodesClient;
import com.azure.resourcemanager.cdn.generated.fluent.models.EdgeNodeInner;
import com.azure.resourcemanager.cdn.generated.models.EdgeNode;
import com.azure.resourcemanager.cdn.generated.models.EdgeNodes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class EdgeNodesImpl implements EdgeNodes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EdgeNodesImpl.class);

    private final EdgeNodesClient innerClient;

    private final CdnManager serviceManager;

    public EdgeNodesImpl(EdgeNodesClient innerClient, CdnManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<EdgeNode> list() {
        PagedIterable<EdgeNodeInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new EdgeNodeImpl(inner1, this.manager()));
    }

    public PagedIterable<EdgeNode> list(Context context) {
        PagedIterable<EdgeNodeInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new EdgeNodeImpl(inner1, this.manager()));
    }

    private EdgeNodesClient serviceClient() {
        return this.innerClient;
    }

    private CdnManager manager() {
        return this.serviceManager;
    }
}
