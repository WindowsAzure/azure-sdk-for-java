// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.fluent.TenantActivityLogsClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.EventDataInner;
import com.azure.resourcemanager.monitor.generated.models.EventData;
import com.azure.resourcemanager.monitor.generated.models.TenantActivityLogs;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TenantActivityLogsImpl implements TenantActivityLogs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TenantActivityLogsImpl.class);

    private final TenantActivityLogsClient innerClient;

    private final MonitorManager serviceManager;

    public TenantActivityLogsImpl(TenantActivityLogsClient innerClient, MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<EventData> list() {
        PagedIterable<EventDataInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new EventDataImpl(inner1, this.manager()));
    }

    public PagedIterable<EventData> list(String filter, String select, Context context) {
        PagedIterable<EventDataInner> inner = this.serviceClient().list(filter, select, context);
        return inner.mapPage(inner1 -> new EventDataImpl(inner1, this.manager()));
    }

    private TenantActivityLogsClient serviceClient() {
        return this.innerClient;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }
}
