// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.customerinsights.fluent.KpisClient;
import com.azure.resourcemanager.customerinsights.fluent.models.KpiResourceFormatInner;
import com.azure.resourcemanager.customerinsights.models.KpiResourceFormat;
import com.azure.resourcemanager.customerinsights.models.Kpis;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class KpisImpl implements Kpis {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KpisImpl.class);

    private final KpisClient innerClient;

    private final com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager;

    public KpisImpl(
        KpisClient innerClient, com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public KpiResourceFormat get(String resourceGroupName, String hubName, String kpiName) {
        KpiResourceFormatInner inner = this.serviceClient().get(resourceGroupName, hubName, kpiName);
        if (inner != null) {
            return new KpiResourceFormatImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<KpiResourceFormat> getWithResponse(
        String resourceGroupName, String hubName, String kpiName, Context context) {
        Response<KpiResourceFormatInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, hubName, kpiName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new KpiResourceFormatImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String hubName, String kpiName) {
        this.serviceClient().delete(resourceGroupName, hubName, kpiName);
    }

    public void delete(String resourceGroupName, String hubName, String kpiName, Context context) {
        this.serviceClient().delete(resourceGroupName, hubName, kpiName, context);
    }

    public void reprocess(String resourceGroupName, String hubName, String kpiName) {
        this.serviceClient().reprocess(resourceGroupName, hubName, kpiName);
    }

    public Response<Void> reprocessWithResponse(
        String resourceGroupName, String hubName, String kpiName, Context context) {
        return this.serviceClient().reprocessWithResponse(resourceGroupName, hubName, kpiName, context);
    }

    public PagedIterable<KpiResourceFormat> listByHub(String resourceGroupName, String hubName) {
        PagedIterable<KpiResourceFormatInner> inner = this.serviceClient().listByHub(resourceGroupName, hubName);
        return Utils.mapPage(inner, inner1 -> new KpiResourceFormatImpl(inner1, this.manager()));
    }

    public PagedIterable<KpiResourceFormat> listByHub(String resourceGroupName, String hubName, Context context) {
        PagedIterable<KpiResourceFormatInner> inner =
            this.serviceClient().listByHub(resourceGroupName, hubName, context);
        return Utils.mapPage(inner, inner1 -> new KpiResourceFormatImpl(inner1, this.manager()));
    }

    public KpiResourceFormat getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String kpiName = Utils.getValueFromIdByName(id, "kpi");
        if (kpiName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'kpi'.", id)));
        }
        return this.getWithResponse(resourceGroupName, hubName, kpiName, Context.NONE).getValue();
    }

    public Response<KpiResourceFormat> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String kpiName = Utils.getValueFromIdByName(id, "kpi");
        if (kpiName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'kpi'.", id)));
        }
        return this.getWithResponse(resourceGroupName, hubName, kpiName, context);
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
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String kpiName = Utils.getValueFromIdByName(id, "kpi");
        if (kpiName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'kpi'.", id)));
        }
        this.delete(resourceGroupName, hubName, kpiName, Context.NONE);
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
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String kpiName = Utils.getValueFromIdByName(id, "kpi");
        if (kpiName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'kpi'.", id)));
        }
        this.delete(resourceGroupName, hubName, kpiName, context);
    }

    private KpisClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager() {
        return this.serviceManager;
    }

    public KpiResourceFormatImpl define(String name) {
        return new KpiResourceFormatImpl(name, this.manager());
    }
}
