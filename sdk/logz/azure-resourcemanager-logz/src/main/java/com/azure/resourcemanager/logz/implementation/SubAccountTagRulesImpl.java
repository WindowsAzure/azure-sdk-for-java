// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logz.fluent.SubAccountTagRulesClient;
import com.azure.resourcemanager.logz.fluent.models.MonitoringTagRulesInner;
import com.azure.resourcemanager.logz.models.MonitoringTagRules;
import com.azure.resourcemanager.logz.models.SubAccountTagRules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SubAccountTagRulesImpl implements SubAccountTagRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubAccountTagRulesImpl.class);

    private final SubAccountTagRulesClient innerClient;

    private final com.azure.resourcemanager.logz.LogzManager serviceManager;

    public SubAccountTagRulesImpl(
        SubAccountTagRulesClient innerClient, com.azure.resourcemanager.logz.LogzManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MonitoringTagRules> list(String resourceGroupName, String monitorName, String subAccountName) {
        PagedIterable<MonitoringTagRulesInner> inner =
            this.serviceClient().list(resourceGroupName, monitorName, subAccountName);
        return Utils.mapPage(inner, inner1 -> new MonitoringTagRulesImpl(inner1, this.manager()));
    }

    public PagedIterable<MonitoringTagRules> list(
        String resourceGroupName, String monitorName, String subAccountName, Context context) {
        PagedIterable<MonitoringTagRulesInner> inner =
            this.serviceClient().list(resourceGroupName, monitorName, subAccountName, context);
        return Utils.mapPage(inner, inner1 -> new MonitoringTagRulesImpl(inner1, this.manager()));
    }

    public MonitoringTagRules createOrUpdate(
        String resourceGroupName, String monitorName, String subAccountName, String ruleSetName) {
        MonitoringTagRulesInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, monitorName, subAccountName, ruleSetName);
        if (inner != null) {
            return new MonitoringTagRulesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MonitoringTagRules> createOrUpdateWithResponse(
        String resourceGroupName,
        String monitorName,
        String subAccountName,
        String ruleSetName,
        MonitoringTagRulesInner body,
        Context context) {
        Response<MonitoringTagRulesInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(resourceGroupName, monitorName, subAccountName, ruleSetName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MonitoringTagRulesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MonitoringTagRules get(
        String resourceGroupName, String monitorName, String subAccountName, String ruleSetName) {
        MonitoringTagRulesInner inner =
            this.serviceClient().get(resourceGroupName, monitorName, subAccountName, ruleSetName);
        if (inner != null) {
            return new MonitoringTagRulesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MonitoringTagRules> getWithResponse(
        String resourceGroupName, String monitorName, String subAccountName, String ruleSetName, Context context) {
        Response<MonitoringTagRulesInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, monitorName, subAccountName, ruleSetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MonitoringTagRulesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String monitorName, String subAccountName, String ruleSetName) {
        this.serviceClient().delete(resourceGroupName, monitorName, subAccountName, ruleSetName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String monitorName, String subAccountName, String ruleSetName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, monitorName, subAccountName, ruleSetName, context);
    }

    private SubAccountTagRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.logz.LogzManager manager() {
        return this.serviceManager;
    }
}
