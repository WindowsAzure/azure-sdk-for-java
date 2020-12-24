// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.MySqlManager;
import com.azure.resourcemanager.mysql.fluent.LocationBasedPerformanceTiersClient;
import com.azure.resourcemanager.mysql.fluent.models.PerformanceTierPropertiesInner;
import com.azure.resourcemanager.mysql.models.LocationBasedPerformanceTiers;
import com.azure.resourcemanager.mysql.models.PerformanceTierProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LocationBasedPerformanceTiersImpl implements LocationBasedPerformanceTiers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LocationBasedPerformanceTiersImpl.class);

    private final LocationBasedPerformanceTiersClient innerClient;

    private final MySqlManager serviceManager;

    public LocationBasedPerformanceTiersImpl(
        LocationBasedPerformanceTiersClient innerClient, MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PerformanceTierProperties> list(String locationName) {
        PagedIterable<PerformanceTierPropertiesInner> inner = this.serviceClient().list(locationName);
        return inner.mapPage(inner1 -> new PerformanceTierPropertiesImpl(inner1, this.manager()));
    }

    public PagedIterable<PerformanceTierProperties> list(String locationName, Context context) {
        PagedIterable<PerformanceTierPropertiesInner> inner = this.serviceClient().list(locationName, context);
        return inner.mapPage(inner1 -> new PerformanceTierPropertiesImpl(inner1, this.manager()));
    }

    private LocationBasedPerformanceTiersClient serviceClient() {
        return this.innerClient;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }
}
