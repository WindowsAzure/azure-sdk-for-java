// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.fluent.PrivateCloudsClient;
import com.azure.resourcemanager.avs.fluent.models.AdminCredentialsInner;
import com.azure.resourcemanager.avs.fluent.models.PrivateCloudInner;
import com.azure.resourcemanager.avs.models.AdminCredentials;
import com.azure.resourcemanager.avs.models.PrivateCloud;
import com.azure.resourcemanager.avs.models.PrivateClouds;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateCloudsImpl implements PrivateClouds {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateCloudsImpl.class);

    private final PrivateCloudsClient innerClient;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    public PrivateCloudsImpl(PrivateCloudsClient innerClient, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateCloud> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PrivateCloudInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new PrivateCloudImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateCloud> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<PrivateCloudInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateCloudImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateCloud> list() {
        PagedIterable<PrivateCloudInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PrivateCloudImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateCloud> list(Context context) {
        PagedIterable<PrivateCloudInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new PrivateCloudImpl(inner1, this.manager()));
    }

    public PrivateCloud getByResourceGroup(String resourceGroupName, String privateCloudName) {
        PrivateCloudInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, privateCloudName);
        if (inner != null) {
            return new PrivateCloudImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateCloud> getByResourceGroupWithResponse(
        String resourceGroupName, String privateCloudName, Context context) {
        Response<PrivateCloudInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, privateCloudName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateCloudImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String privateCloudName) {
        this.serviceClient().delete(resourceGroupName, privateCloudName);
    }

    public void delete(String resourceGroupName, String privateCloudName, Context context) {
        this.serviceClient().delete(resourceGroupName, privateCloudName, context);
    }

    public AdminCredentials listAdminCredentials(String resourceGroupName, String privateCloudName) {
        AdminCredentialsInner inner = this.serviceClient().listAdminCredentials(resourceGroupName, privateCloudName);
        if (inner != null) {
            return new AdminCredentialsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AdminCredentials> listAdminCredentialsWithResponse(
        String resourceGroupName, String privateCloudName, Context context) {
        Response<AdminCredentialsInner> inner =
            this.serviceClient().listAdminCredentialsWithResponse(resourceGroupName, privateCloudName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AdminCredentialsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateCloud getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, privateCloudName, Context.NONE).getValue();
    }

    public Response<PrivateCloud> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, privateCloudName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        this.delete(resourceGroupName, privateCloudName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        this.delete(resourceGroupName, privateCloudName, context);
    }

    private PrivateCloudsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }

    public PrivateCloudImpl define(String name) {
        return new PrivateCloudImpl(name, this.manager());
    }
}
