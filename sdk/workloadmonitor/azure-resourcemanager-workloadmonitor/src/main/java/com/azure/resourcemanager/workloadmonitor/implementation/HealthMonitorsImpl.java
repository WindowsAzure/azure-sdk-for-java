// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadmonitor.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.workloadmonitor.fluent.HealthMonitorsClient;
import com.azure.resourcemanager.workloadmonitor.fluent.models.HealthMonitorInner;
import com.azure.resourcemanager.workloadmonitor.fluent.models.HealthMonitorStateChangeInner;
import com.azure.resourcemanager.workloadmonitor.models.HealthMonitor;
import com.azure.resourcemanager.workloadmonitor.models.HealthMonitorStateChange;
import com.azure.resourcemanager.workloadmonitor.models.HealthMonitors;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.OffsetDateTime;

public final class HealthMonitorsImpl implements HealthMonitors {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HealthMonitorsImpl.class);

    private final HealthMonitorsClient innerClient;

    private final com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager serviceManager;

    public HealthMonitorsImpl(
        HealthMonitorsClient innerClient,
        com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<HealthMonitor> list(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName) {
        PagedIterable<HealthMonitorInner> inner =
            this
                .serviceClient()
                .list(subscriptionId, resourceGroupName, providerName, resourceCollectionName, resourceName);
        return Utils.mapPage(inner, inner1 -> new HealthMonitorImpl(inner1, this.manager()));
    }

    public PagedIterable<HealthMonitor> list(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName,
        String filter,
        String expand,
        Context context) {
        PagedIterable<HealthMonitorInner> inner =
            this
                .serviceClient()
                .list(
                    subscriptionId,
                    resourceGroupName,
                    providerName,
                    resourceCollectionName,
                    resourceName,
                    filter,
                    expand,
                    context);
        return Utils.mapPage(inner, inner1 -> new HealthMonitorImpl(inner1, this.manager()));
    }

    public HealthMonitor get(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName,
        String monitorId) {
        HealthMonitorInner inner =
            this
                .serviceClient()
                .get(subscriptionId, resourceGroupName, providerName, resourceCollectionName, resourceName, monitorId);
        if (inner != null) {
            return new HealthMonitorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<HealthMonitor> getWithResponse(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName,
        String monitorId,
        String expand,
        Context context) {
        Response<HealthMonitorInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    subscriptionId,
                    resourceGroupName,
                    providerName,
                    resourceCollectionName,
                    resourceName,
                    monitorId,
                    expand,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new HealthMonitorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<HealthMonitorStateChange> listStateChanges(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName,
        String monitorId) {
        PagedIterable<HealthMonitorStateChangeInner> inner =
            this
                .serviceClient()
                .listStateChanges(
                    subscriptionId, resourceGroupName, providerName, resourceCollectionName, resourceName, monitorId);
        return Utils.mapPage(inner, inner1 -> new HealthMonitorStateChangeImpl(inner1, this.manager()));
    }

    public PagedIterable<HealthMonitorStateChange> listStateChanges(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName,
        String monitorId,
        String filter,
        String expand,
        OffsetDateTime startTimestampUtc,
        OffsetDateTime endTimestampUtc,
        Context context) {
        PagedIterable<HealthMonitorStateChangeInner> inner =
            this
                .serviceClient()
                .listStateChanges(
                    subscriptionId,
                    resourceGroupName,
                    providerName,
                    resourceCollectionName,
                    resourceName,
                    monitorId,
                    filter,
                    expand,
                    startTimestampUtc,
                    endTimestampUtc,
                    context);
        return Utils.mapPage(inner, inner1 -> new HealthMonitorStateChangeImpl(inner1, this.manager()));
    }

    public HealthMonitorStateChange getStateChange(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName,
        String monitorId,
        String timestampUnix) {
        HealthMonitorStateChangeInner inner =
            this
                .serviceClient()
                .getStateChange(
                    subscriptionId,
                    resourceGroupName,
                    providerName,
                    resourceCollectionName,
                    resourceName,
                    monitorId,
                    timestampUnix);
        if (inner != null) {
            return new HealthMonitorStateChangeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<HealthMonitorStateChange> getStateChangeWithResponse(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName,
        String monitorId,
        String timestampUnix,
        String expand,
        Context context) {
        Response<HealthMonitorStateChangeInner> inner =
            this
                .serviceClient()
                .getStateChangeWithResponse(
                    subscriptionId,
                    resourceGroupName,
                    providerName,
                    resourceCollectionName,
                    resourceName,
                    monitorId,
                    timestampUnix,
                    expand,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new HealthMonitorStateChangeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private HealthMonitorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager manager() {
        return this.serviceManager;
    }
}
