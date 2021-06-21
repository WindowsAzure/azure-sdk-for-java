// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.MetricNamespacesClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.MetricNamespaceInner;
import com.azure.resourcemanager.monitor.generated.models.MetricNamespace;
import com.azure.resourcemanager.monitor.generated.models.MetricNamespaces;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MetricNamespacesImpl implements MetricNamespaces {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricNamespacesImpl.class);

    private final MetricNamespacesClient innerClient;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public MetricNamespacesImpl(
        MetricNamespacesClient innerClient, com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MetricNamespace> list(String resourceUri) {
        PagedIterable<MetricNamespaceInner> inner = this.serviceClient().list(resourceUri);
        return Utils.mapPage(inner, inner1 -> new MetricNamespaceImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricNamespace> list(String resourceUri, String startTime, Context context) {
        PagedIterable<MetricNamespaceInner> inner = this.serviceClient().list(resourceUri, startTime, context);
        return Utils.mapPage(inner, inner1 -> new MetricNamespaceImpl(inner1, this.manager()));
    }

    private MetricNamespacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
