// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mixedreality.MixedRealityManager;
import com.azure.resourcemanager.mixedreality.fluent.RemoteRenderingAccountsClient;
import com.azure.resourcemanager.mixedreality.fluent.models.AccountKeysInner;
import com.azure.resourcemanager.mixedreality.fluent.models.RemoteRenderingAccountInner;
import com.azure.resourcemanager.mixedreality.models.AccountKeyRegenerateRequest;
import com.azure.resourcemanager.mixedreality.models.AccountKeys;
import com.azure.resourcemanager.mixedreality.models.RemoteRenderingAccount;
import com.azure.resourcemanager.mixedreality.models.RemoteRenderingAccounts;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RemoteRenderingAccountsImpl implements RemoteRenderingAccounts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RemoteRenderingAccountsImpl.class);

    private final RemoteRenderingAccountsClient innerClient;

    private final MixedRealityManager serviceManager;

    public RemoteRenderingAccountsImpl(RemoteRenderingAccountsClient innerClient, MixedRealityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RemoteRenderingAccount> list() {
        PagedIterable<RemoteRenderingAccountInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new RemoteRenderingAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<RemoteRenderingAccount> list(Context context) {
        PagedIterable<RemoteRenderingAccountInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new RemoteRenderingAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<RemoteRenderingAccount> listByResourceGroup(String resourceGroupName) {
        PagedIterable<RemoteRenderingAccountInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new RemoteRenderingAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<RemoteRenderingAccount> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<RemoteRenderingAccountInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new RemoteRenderingAccountImpl(inner1, this.manager()));
    }

    public void deleteByResourceGroup(String resourceGroupName, String accountName) {
        this.serviceClient().delete(resourceGroupName, accountName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String accountName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, context);
    }

    public RemoteRenderingAccount getByResourceGroup(String resourceGroupName, String accountName) {
        RemoteRenderingAccountInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, accountName);
        if (inner != null) {
            return new RemoteRenderingAccountImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RemoteRenderingAccount> getByResourceGroupWithResponse(
        String resourceGroupName, String accountName, Context context) {
        Response<RemoteRenderingAccountInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RemoteRenderingAccountImpl(inner.getValue(), this.manager()));
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

    public RemoteRenderingAccount getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "remoteRenderingAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'remoteRenderingAccounts'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE).getValue();
    }

    public Response<RemoteRenderingAccount> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "remoteRenderingAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'remoteRenderingAccounts'.",
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
        String accountName = Utils.getValueFromIdByName(id, "remoteRenderingAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'remoteRenderingAccounts'.",
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
        String accountName = Utils.getValueFromIdByName(id, "remoteRenderingAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'remoteRenderingAccounts'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, context);
    }

    private RemoteRenderingAccountsClient serviceClient() {
        return this.innerClient;
    }

    private MixedRealityManager manager() {
        return this.serviceManager;
    }

    public RemoteRenderingAccountImpl define(String name) {
        return new RemoteRenderingAccountImpl(name, this.manager());
    }
}
