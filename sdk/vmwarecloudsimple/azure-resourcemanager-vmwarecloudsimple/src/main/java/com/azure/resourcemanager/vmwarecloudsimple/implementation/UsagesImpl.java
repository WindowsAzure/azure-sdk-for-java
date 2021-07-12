// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.UsagesClient;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.UsageInner;
import com.azure.resourcemanager.vmwarecloudsimple.models.Usage;
import com.azure.resourcemanager.vmwarecloudsimple.models.Usages;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class UsagesImpl implements Usages {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UsagesImpl.class);

    private final UsagesClient innerClient;

    private final com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager serviceManager;

    public UsagesImpl(
        UsagesClient innerClient, com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Usage> list(String regionId) {
        PagedIterable<UsageInner> inner = this.serviceClient().list(regionId);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> list(String regionId, String filter, Context context) {
        PagedIterable<UsageInner> inner = this.serviceClient().list(regionId, filter, context);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    private UsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager manager() {
        return this.serviceManager;
    }
}
