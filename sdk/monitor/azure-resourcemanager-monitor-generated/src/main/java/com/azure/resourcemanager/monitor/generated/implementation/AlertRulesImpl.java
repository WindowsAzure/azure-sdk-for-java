// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.fluent.AlertRulesClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.AlertRuleResourceInner;
import com.azure.resourcemanager.monitor.generated.models.AlertRuleResource;
import com.azure.resourcemanager.monitor.generated.models.AlertRules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AlertRulesImpl implements AlertRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AlertRulesImpl.class);

    private final AlertRulesClient innerClient;

    private final MonitorManager serviceManager;

    public AlertRulesImpl(AlertRulesClient innerClient, MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String ruleName) {
        this.serviceClient().delete(resourceGroupName, ruleName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String ruleName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, ruleName, context);
    }

    public AlertRuleResource getByResourceGroup(String resourceGroupName, String ruleName) {
        AlertRuleResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, ruleName);
        if (inner != null) {
            return new AlertRuleResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AlertRuleResource> getByResourceGroupWithResponse(
        String resourceGroupName, String ruleName, Context context) {
        Response<AlertRuleResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, ruleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AlertRuleResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<AlertRuleResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AlertRuleResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new AlertRuleResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<AlertRuleResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AlertRuleResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new AlertRuleResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<AlertRuleResource> list() {
        PagedIterable<AlertRuleResourceInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new AlertRuleResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<AlertRuleResource> list(Context context) {
        PagedIterable<AlertRuleResourceInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new AlertRuleResourceImpl(inner1, this.manager()));
    }

    public AlertRuleResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "alertrules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'alertrules'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, ruleName, Context.NONE).getValue();
    }

    public Response<AlertRuleResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "alertrules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'alertrules'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, ruleName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "alertrules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'alertrules'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, ruleName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "alertrules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'alertrules'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, ruleName, context);
    }

    private AlertRulesClient serviceClient() {
        return this.innerClient;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }

    public AlertRuleResourceImpl define(String name) {
        return new AlertRuleResourceImpl(name, this.manager());
    }
}
