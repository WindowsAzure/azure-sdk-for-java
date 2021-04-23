// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.signalr.fluent.UsagesClient;
import com.azure.resourcemanager.signalr.fluent.models.SignalRUsageInner;
import com.azure.resourcemanager.signalr.models.SignalRUsage;
import com.azure.resourcemanager.signalr.models.Usages;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class UsagesImpl implements Usages {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UsagesImpl.class);

    private final UsagesClient innerClient;

    private final com.azure.resourcemanager.signalr.SignalRManager serviceManager;

    public UsagesImpl(UsagesClient innerClient, com.azure.resourcemanager.signalr.SignalRManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SignalRUsage> list(String location) {
        PagedIterable<SignalRUsageInner> inner = this.serviceClient().list(location);
        return Utils.mapPage(inner, inner1 -> new SignalRUsageImpl(inner1, this.manager()));
    }

    public PagedIterable<SignalRUsage> list(String location, Context context) {
        PagedIterable<SignalRUsageInner> inner = this.serviceClient().list(location, context);
        return Utils.mapPage(inner, inner1 -> new SignalRUsageImpl(inner1, this.manager()));
    }

    private UsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.signalr.SignalRManager manager() {
        return this.serviceManager;
    }
}
