// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mixedreality.fluent.SpatialAnchorsAccountsClient;
import com.azure.resourcemanager.mixedreality.fluent.models.AccountKeysInner;
import com.azure.resourcemanager.mixedreality.fluent.models.SpatialAnchorsAccountInner;
import com.azure.resourcemanager.mixedreality.models.AccountKeyRegenerateRequest;
import com.azure.resourcemanager.mixedreality.models.AccountKeys;
import com.azure.resourcemanager.mixedreality.models.SpatialAnchorsAccount;
import com.azure.resourcemanager.mixedreality.models.SpatialAnchorsAccounts;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SpatialAnchorsAccountsImpl implements SpatialAnchorsAccounts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SpatialAnchorsAccountsImpl.class);

    private final SpatialAnchorsAccountsClient innerClient;

    private final com.azure.resourcemanager.mixedreality.MixedRealityManager serviceManager;

    public SpatialAnchorsAccountsImpl(
        SpatialAnchorsAccountsClient innerClient,
        com.azure.resourcemanager.mixedreality.MixedRealityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SpatialAnchorsAccount> list() {
        PagedIterable<SpatialAnchorsAccountInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SpatialAnchorsAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<SpatialAnchorsAccount> list(Context context) {
        PagedIterable<SpatialAnchorsAccountInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new SpatialAnchorsAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<SpatialAnchorsAccount> listByResourceGroup(String resourceGroupName) {
        PagedIterable<SpatialAnchorsAccountInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new SpatialAnchorsAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<SpatialAnchorsAccount> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<SpatialAnchorsAccountInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new SpatialAnchorsAccountImpl(inner1, this.manager()));
    }

    public void deleteByResourceGroup(String resourceGroupName, String accountName) {
        this.serviceClient().delete(resourceGroupName, accountName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String accountName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, context);
    }

    public SpatialAnchorsAccount getByResourceGroup(String resourceGroupName, String accountName) {
        SpatialAnchorsAccountInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, accountName);
        if (inner != null) {
            return new SpatialAnchorsAccountImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SpatialAnchorsAccount> getByResourceGroupWithResponse(
        String resourceGroupName, String accountName, Context context) {
        Response<SpatialAnchorsAccountInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SpatialAnchorsAccountImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccountKeys listKeys(String resourceGroupName, String accountName) {
        AccountKeysInner inner = this.serviceClient().listKeys(resourceGroupName, accountName);
        if (inner != null) {
            return new AccountKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccountKeys> listKeysWithResponse(String resourceGroupName, String accountName, Context context) {
        Response<AccountKeysInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccountKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccountKeys regenerateKeys(
        String resourceGroupName, String accountName, AccountKeyRegenerateRequest regenerate) {
        AccountKeysInner inner = this.serviceClient().regenerateKeys(resourceGroupName, accountName, regenerate);
        if (inner != null) {
            return new AccountKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccountKeys> regenerateKeysWithResponse(
        String resourceGroupName, String accountName, AccountKeyRegenerateRequest regenerate, Context context) {
        Response<AccountKeysInner> inner =
            this.serviceClient().regenerateKeysWithResponse(resourceGroupName, accountName, regenerate, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccountKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SpatialAnchorsAccount getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "spatialAnchorsAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'spatialAnchorsAccounts'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE).getValue();
    }

    public Response<SpatialAnchorsAccount> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "spatialAnchorsAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'spatialAnchorsAccounts'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, context);
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
        String accountName = Utils.getValueFromIdByName(id, "spatialAnchorsAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'spatialAnchorsAccounts'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "spatialAnchorsAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'spatialAnchorsAccounts'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, context);
    }

    private SpatialAnchorsAccountsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mixedreality.MixedRealityManager manager() {
        return this.serviceManager;
    }

    public SpatialAnchorsAccountImpl define(String name) {
        return new SpatialAnchorsAccountImpl(name, this.manager());
    }
}