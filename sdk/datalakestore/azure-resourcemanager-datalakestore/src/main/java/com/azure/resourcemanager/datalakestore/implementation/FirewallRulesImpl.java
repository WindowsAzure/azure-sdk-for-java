// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datalakestore.DataLakeStoreManager;
import com.azure.resourcemanager.datalakestore.fluent.FirewallRulesClient;
import com.azure.resourcemanager.datalakestore.fluent.models.FirewallRuleInner;
import com.azure.resourcemanager.datalakestore.models.FirewallRule;
import com.azure.resourcemanager.datalakestore.models.FirewallRules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class FirewallRulesImpl implements FirewallRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallRulesImpl.class);

    private final FirewallRulesClient innerClient;

    private final DataLakeStoreManager serviceManager;

    public FirewallRulesImpl(FirewallRulesClient innerClient, DataLakeStoreManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FirewallRule> listByAccount(String resourceGroupName, String accountName) {
        PagedIterable<FirewallRuleInner> inner = this.serviceClient().listByAccount(resourceGroupName, accountName);
        return inner.mapPage(inner1 -> new FirewallRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<FirewallRule> listByAccount(String resourceGroupName, String accountName, Context context) {
        PagedIterable<FirewallRuleInner> inner =
            this.serviceClient().listByAccount(resourceGroupName, accountName, context);
        return inner.mapPage(inner1 -> new FirewallRuleImpl(inner1, this.manager()));
    }

    public FirewallRule get(String resourceGroupName, String accountName, String firewallRuleName) {
        FirewallRuleInner inner = this.serviceClient().get(resourceGroupName, accountName, firewallRuleName);
        if (inner != null) {
            return new FirewallRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<FirewallRule> getWithResponse(
        String resourceGroupName, String accountName, String firewallRuleName, Context context) {
        Response<FirewallRuleInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, firewallRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FirewallRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String firewallRuleName) {
        this.serviceClient().delete(resourceGroupName, accountName, firewallRuleName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String firewallRuleName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, firewallRuleName, context);
    }

    public FirewallRule getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String firewallRuleName = Utils.getValueFromIdByName(id, "firewallRules");
        if (firewallRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'firewallRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, firewallRuleName, Context.NONE).getValue();
    }

    public Response<FirewallRule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String firewallRuleName = Utils.getValueFromIdByName(id, "firewallRules");
        if (firewallRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'firewallRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, firewallRuleName, context);
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
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String firewallRuleName = Utils.getValueFromIdByName(id, "firewallRules");
        if (firewallRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'firewallRules'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, firewallRuleName, Context.NONE).getValue();
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
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String firewallRuleName = Utils.getValueFromIdByName(id, "firewallRules");
        if (firewallRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'firewallRules'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, firewallRuleName, context);
    }

    private FirewallRulesClient serviceClient() {
        return this.innerClient;
    }

    private DataLakeStoreManager manager() {
        return this.serviceManager;
    }

    public FirewallRuleImpl define(String name) {
        return new FirewallRuleImpl(name, this.manager());
    }
}
