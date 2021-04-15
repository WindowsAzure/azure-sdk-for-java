// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.batchai.fluent.UsagesClient;
import com.azure.resourcemanager.batchai.fluent.models.UsageInner;
import com.azure.resourcemanager.batchai.models.Usage;
import com.azure.resourcemanager.batchai.models.Usages;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class UsagesImpl implements Usages {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UsagesImpl.class);

    private final UsagesClient innerClient;

    private final com.azure.resourcemanager.batchai.BatchAIManager serviceManager;

    public UsagesImpl(UsagesClient innerClient, com.azure.resourcemanager.batchai.BatchAIManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Usage> list(String location) {
        PagedIterable<UsageInner> inner = this.serviceClient().list(location);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> list(String location, Context context) {
        PagedIterable<UsageInner> inner = this.serviceClient().list(location, context);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    private UsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.batchai.BatchAIManager manager() {
        return this.serviceManager;
    }
}
