// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.TenantSettingsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.TenantSettingsContractInner;
import com.azure.resourcemanager.apimanagement.models.SettingsTypeName;
import com.azure.resourcemanager.apimanagement.models.TenantSettings;
import com.azure.resourcemanager.apimanagement.models.TenantSettingsContract;
import com.azure.resourcemanager.apimanagement.models.TenantSettingsGetResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TenantSettingsImpl implements TenantSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TenantSettingsImpl.class);

    private final TenantSettingsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public TenantSettingsImpl(
        TenantSettingsClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TenantSettingsContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<TenantSettingsContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new TenantSettingsContractImpl(inner1, this.manager()));
    }

    public PagedIterable<TenantSettingsContract> listByService(
        String resourceGroupName, String serviceName, String filter, Context context) {
        PagedIterable<TenantSettingsContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, filter, context);
        return Utils.mapPage(inner, inner1 -> new TenantSettingsContractImpl(inner1, this.manager()));
    }

    public TenantSettingsContract get(String resourceGroupName, String serviceName, SettingsTypeName settingsType) {
        TenantSettingsContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, settingsType);
        if (inner != null) {
            return new TenantSettingsContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TenantSettingsContract> getWithResponse(
        String resourceGroupName, String serviceName, SettingsTypeName settingsType, Context context) {
        TenantSettingsGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, settingsType, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TenantSettingsContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private TenantSettingsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
