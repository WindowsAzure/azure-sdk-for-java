// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.DataCollectionRulesClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.DataCollectionRuleResourceInner;
import com.azure.resourcemanager.monitor.generated.models.DataCollectionRuleResource;
import com.azure.resourcemanager.monitor.generated.models.DataCollectionRules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DataCollectionRulesImpl implements DataCollectionRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataCollectionRulesImpl.class);

    private final DataCollectionRulesClient innerClient;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public DataCollectionRulesImpl(
        DataCollectionRulesClient innerClient,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DataCollectionRuleResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DataCollectionRuleResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new DataCollectionRuleResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DataCollectionRuleResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<DataCollectionRuleResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new DataCollectionRuleResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DataCollectionRuleResource> list() {
        PagedIterable<DataCollectionRuleResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DataCollectionRuleResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DataCollectionRuleResource> list(Context context) {
        PagedIterable<DataCollectionRuleResourceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new DataCollectionRuleResourceImpl(inner1, this.manager()));
    }

    public DataCollectionRuleResource getByResourceGroup(String resourceGroupName, String dataCollectionRuleName) {
        DataCollectionRuleResourceInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, dataCollectionRuleName);
        if (inner != null) {
            return new DataCollectionRuleResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataCollectionRuleResource> getByResourceGroupWithResponse(
        String resourceGroupName, String dataCollectionRuleName, Context context) {
        Response<DataCollectionRuleResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, dataCollectionRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataCollectionRuleResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String dataCollectionRuleName) {
        this.serviceClient().delete(resourceGroupName, dataCollectionRuleName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String dataCollectionRuleName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, dataCollectionRuleName, context);
    }

    public DataCollectionRuleResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataCollectionRuleName = Utils.getValueFromIdByName(id, "dataCollectionRules");
        if (dataCollectionRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataCollectionRules'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, dataCollectionRuleName, Context.NONE).getValue();
    }

    public Response<DataCollectionRuleResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataCollectionRuleName = Utils.getValueFromIdByName(id, "dataCollectionRules");
        if (dataCollectionRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataCollectionRules'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, dataCollectionRuleName, context);
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
        String dataCollectionRuleName = Utils.getValueFromIdByName(id, "dataCollectionRules");
        if (dataCollectionRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataCollectionRules'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, dataCollectionRuleName, Context.NONE).getValue();
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
        String dataCollectionRuleName = Utils.getValueFromIdByName(id, "dataCollectionRules");
        if (dataCollectionRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataCollectionRules'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, dataCollectionRuleName, context);
    }

    private DataCollectionRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }

    public DataCollectionRuleResourceImpl define(String name) {
        return new DataCollectionRuleResourceImpl(name, this.manager());
    }
}
