// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.AutomationAccountsClient;
import com.azure.resourcemanager.automation.fluent.models.AutomationAccountInner;
import com.azure.resourcemanager.automation.models.AutomationAccount;
import com.azure.resourcemanager.automation.models.AutomationAccounts;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AutomationAccountsImpl implements AutomationAccounts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutomationAccountsImpl.class);

    private final AutomationAccountsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public AutomationAccountsImpl(
        AutomationAccountsClient innerClient, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String automationAccountName) {
        this.serviceClient().delete(resourceGroupName, automationAccountName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String automationAccountName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, automationAccountName, context);
    }

    public AutomationAccount getByResourceGroup(String resourceGroupName, String automationAccountName) {
        AutomationAccountInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, automationAccountName);
        if (inner != null) {
            return new AutomationAccountImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AutomationAccount> getByResourceGroupWithResponse(
        String resourceGroupName, String automationAccountName, Context context) {
        Response<AutomationAccountInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, automationAccountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AutomationAccountImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<AutomationAccount> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AutomationAccountInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AutomationAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<AutomationAccount> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AutomationAccountInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new AutomationAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<AutomationAccount> list() {
        PagedIterable<AutomationAccountInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AutomationAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<AutomationAccount> list(Context context) {
        PagedIterable<AutomationAccountInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new AutomationAccountImpl(inner1, this.manager()));
    }

    public AutomationAccount getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, automationAccountName, Context.NONE).getValue();
    }

    public Response<AutomationAccount> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, automationAccountName, context);
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
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, automationAccountName, Context.NONE).getValue();
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
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, automationAccountName, context);
    }

    private AutomationAccountsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    public AutomationAccountImpl define(String name) {
        return new AutomationAccountImpl(name, this.manager());
    }
}
