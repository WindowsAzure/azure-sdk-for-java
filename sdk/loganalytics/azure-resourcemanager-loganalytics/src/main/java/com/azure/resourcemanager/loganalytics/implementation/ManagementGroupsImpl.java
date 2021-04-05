// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.fluent.ManagementGroupsClient;
import com.azure.resourcemanager.loganalytics.fluent.models.ManagementGroupInner;
import com.azure.resourcemanager.loganalytics.models.ManagementGroup;
import com.azure.resourcemanager.loganalytics.models.ManagementGroups;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagementGroupsImpl implements ManagementGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementGroupsImpl.class);

    private final ManagementGroupsClient innerClient;

    private final com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager;

    public ManagementGroupsImpl(
        ManagementGroupsClient innerClient, com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ManagementGroup> list(String resourceGroupName, String workspaceName) {
        PagedIterable<ManagementGroupInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new ManagementGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagementGroup> list(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<ManagementGroupInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new ManagementGroupImpl(inner1, this.manager()));
    }

    private ManagementGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}
