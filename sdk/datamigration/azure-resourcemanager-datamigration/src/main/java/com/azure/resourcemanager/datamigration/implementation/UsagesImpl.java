// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datamigration.fluent.UsagesClient;
import com.azure.resourcemanager.datamigration.fluent.models.QuotaInner;
import com.azure.resourcemanager.datamigration.models.Quota;
import com.azure.resourcemanager.datamigration.models.Usages;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class UsagesImpl implements Usages {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UsagesImpl.class);

    private final UsagesClient innerClient;

    private final com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager;

    public UsagesImpl(
        UsagesClient innerClient, com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Quota> list(String location) {
        PagedIterable<QuotaInner> inner = this.serviceClient().list(location);
        return Utils.mapPage(inner, inner1 -> new QuotaImpl(inner1, this.manager()));
    }

    public PagedIterable<Quota> list(String location, Context context) {
        PagedIterable<QuotaInner> inner = this.serviceClient().list(location, context);
        return Utils.mapPage(inner, inner1 -> new QuotaImpl(inner1, this.manager()));
    }

    private UsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datamigration.DataMigrationManager manager() {
        return this.serviceManager;
    }
}
