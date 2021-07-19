// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.AlertsSuppressionRulesClient;
import com.azure.resourcemanager.security.fluent.models.AlertsSuppressionRuleInner;
import com.azure.resourcemanager.security.models.AlertsSuppressionRule;
import com.azure.resourcemanager.security.models.AlertsSuppressionRules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AlertsSuppressionRulesImpl implements AlertsSuppressionRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AlertsSuppressionRulesImpl.class);

    private final AlertsSuppressionRulesClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public AlertsSuppressionRulesImpl(
        AlertsSuppressionRulesClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AlertsSuppressionRule> list() {
        PagedIterable<AlertsSuppressionRuleInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AlertsSuppressionRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<AlertsSuppressionRule> list(String alertType, Context context) {
        PagedIterable<AlertsSuppressionRuleInner> inner = this.serviceClient().list(alertType, context);
        return Utils.mapPage(inner, inner1 -> new AlertsSuppressionRuleImpl(inner1, this.manager()));
    }

    public AlertsSuppressionRule get(String alertsSuppressionRuleName) {
        AlertsSuppressionRuleInner inner = this.serviceClient().get(alertsSuppressionRuleName);
        if (inner != null) {
            return new AlertsSuppressionRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AlertsSuppressionRule> getWithResponse(String alertsSuppressionRuleName, Context context) {
        Response<AlertsSuppressionRuleInner> inner =
            this.serviceClient().getWithResponse(alertsSuppressionRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AlertsSuppressionRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AlertsSuppressionRule update(
        String alertsSuppressionRuleName, AlertsSuppressionRuleInner alertsSuppressionRule) {
        AlertsSuppressionRuleInner inner =
            this.serviceClient().update(alertsSuppressionRuleName, alertsSuppressionRule);
        if (inner != null) {
            return new AlertsSuppressionRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AlertsSuppressionRule> updateWithResponse(
        String alertsSuppressionRuleName, AlertsSuppressionRuleInner alertsSuppressionRule, Context context) {
        Response<AlertsSuppressionRuleInner> inner =
            this.serviceClient().updateWithResponse(alertsSuppressionRuleName, alertsSuppressionRule, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AlertsSuppressionRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String alertsSuppressionRuleName) {
        this.serviceClient().delete(alertsSuppressionRuleName);
    }

    public Response<Void> deleteWithResponse(String alertsSuppressionRuleName, Context context) {
        return this.serviceClient().deleteWithResponse(alertsSuppressionRuleName, context);
    }

    private AlertsSuppressionRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
