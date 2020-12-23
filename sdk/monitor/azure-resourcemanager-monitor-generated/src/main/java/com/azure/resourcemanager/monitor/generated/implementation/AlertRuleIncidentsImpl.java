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
import com.azure.resourcemanager.monitor.generated.fluent.AlertRuleIncidentsClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.IncidentInner;
import com.azure.resourcemanager.monitor.generated.models.AlertRuleIncidents;
import com.azure.resourcemanager.monitor.generated.models.Incident;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AlertRuleIncidentsImpl implements AlertRuleIncidents {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AlertRuleIncidentsImpl.class);

    private final AlertRuleIncidentsClient innerClient;

    private final MonitorManager serviceManager;

    public AlertRuleIncidentsImpl(AlertRuleIncidentsClient innerClient, MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Incident get(String resourceGroupName, String ruleName, String incidentName) {
        IncidentInner inner = this.serviceClient().get(resourceGroupName, ruleName, incidentName);
        if (inner != null) {
            return new IncidentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Incident> getWithResponse(
        String resourceGroupName, String ruleName, String incidentName, Context context) {
        Response<IncidentInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, ruleName, incidentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IncidentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Incident> listByAlertRule(String resourceGroupName, String ruleName) {
        PagedIterable<IncidentInner> inner = this.serviceClient().listByAlertRule(resourceGroupName, ruleName);
        return inner.mapPage(inner1 -> new IncidentImpl(inner1, this.manager()));
    }

    public PagedIterable<Incident> listByAlertRule(String resourceGroupName, String ruleName, Context context) {
        PagedIterable<IncidentInner> inner = this.serviceClient().listByAlertRule(resourceGroupName, ruleName, context);
        return inner.mapPage(inner1 -> new IncidentImpl(inner1, this.manager()));
    }

    private AlertRuleIncidentsClient serviceClient() {
        return this.innerClient;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }
}
