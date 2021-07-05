// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ManagedDatabaseSecurityEventsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.SecurityEventInner;
import com.azure.resourcemanager.sql.generated.models.ManagedDatabaseSecurityEvents;
import com.azure.resourcemanager.sql.generated.models.SecurityEvent;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagedDatabaseSecurityEventsImpl implements ManagedDatabaseSecurityEvents {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedDatabaseSecurityEventsImpl.class);

    private final ManagedDatabaseSecurityEventsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ManagedDatabaseSecurityEventsImpl(
        ManagedDatabaseSecurityEventsClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SecurityEvent> listByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName) {
        PagedIterable<SecurityEventInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, managedInstanceName, databaseName);
        return Utils.mapPage(inner, inner1 -> new SecurityEventImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityEvent> listByDatabase(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String filter,
        Integer skip,
        Integer top,
        String skiptoken,
        Context context) {
        PagedIterable<SecurityEventInner> inner =
            this
                .serviceClient()
                .listByDatabase(
                    resourceGroupName, managedInstanceName, databaseName, filter, skip, top, skiptoken, context);
        return Utils.mapPage(inner, inner1 -> new SecurityEventImpl(inner1, this.manager()));
    }

    private ManagedDatabaseSecurityEventsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
