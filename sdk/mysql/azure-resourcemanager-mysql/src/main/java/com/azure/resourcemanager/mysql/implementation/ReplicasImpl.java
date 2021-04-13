// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.fluent.ReplicasClient;
import com.azure.resourcemanager.mysql.fluent.models.ServerInner;
import com.azure.resourcemanager.mysql.models.Replicas;
import com.azure.resourcemanager.mysql.models.Server;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ReplicasImpl implements Replicas {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicasImpl.class);

    private final ReplicasClient innerClient;

    private final com.azure.resourcemanager.mysql.MySqlManager serviceManager;

    public ReplicasImpl(ReplicasClient innerClient, com.azure.resourcemanager.mysql.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Server> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ServerInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new ServerImpl(inner1, this.manager()));
    }

    public PagedIterable<Server> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServerInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new ServerImpl(inner1, this.manager()));
    }

    private ReplicasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysql.MySqlManager manager() {
        return this.serviceManager;
    }
}
