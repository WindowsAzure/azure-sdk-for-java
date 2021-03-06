// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.DevicesForSubscriptionsClient;
import com.azure.resourcemanager.security.fluent.models.DeviceInner;
import com.azure.resourcemanager.security.models.Device;
import com.azure.resourcemanager.security.models.DevicesForSubscriptions;
import com.azure.resourcemanager.security.models.ManagementState;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DevicesForSubscriptionsImpl implements DevicesForSubscriptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DevicesForSubscriptionsImpl.class);

    private final DevicesForSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public DevicesForSubscriptionsImpl(
        DevicesForSubscriptionsClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Device> list() {
        PagedIterable<DeviceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DeviceImpl(inner1, this.manager()));
    }

    public PagedIterable<Device> list(
        Integer limit, String skipToken, ManagementState deviceManagementType, Context context) {
        PagedIterable<DeviceInner> inner = this.serviceClient().list(limit, skipToken, deviceManagementType, context);
        return Utils.mapPage(inner, inner1 -> new DeviceImpl(inner1, this.manager()));
    }

    private DevicesForSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
