// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.maintenance.fluent.ApplyUpdateForResourceGroupsClient;
import com.azure.resourcemanager.maintenance.fluent.models.ApplyUpdateInner;
import com.azure.resourcemanager.maintenance.models.ApplyUpdate;
import com.azure.resourcemanager.maintenance.models.ApplyUpdateForResourceGroups;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ApplyUpdateForResourceGroupsImpl implements ApplyUpdateForResourceGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplyUpdateForResourceGroupsImpl.class);

    private final ApplyUpdateForResourceGroupsClient innerClient;

    private final com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager;

    public ApplyUpdateForResourceGroupsImpl(
        ApplyUpdateForResourceGroupsClient innerClient,
        com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ApplyUpdate> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ApplyUpdateInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ApplyUpdateImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplyUpdate> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ApplyUpdateInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ApplyUpdateImpl(inner1, this.manager()));
    }

    private ApplyUpdateForResourceGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.maintenance.MaintenanceManager manager() {
        return this.serviceManager;
    }
}
