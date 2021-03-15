// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logz.fluent.SingleSignOnsClient;
import com.azure.resourcemanager.logz.fluent.models.LogzSingleSignOnResourceInner;
import com.azure.resourcemanager.logz.models.LogzSingleSignOnResource;
import com.azure.resourcemanager.logz.models.SingleSignOns;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SingleSignOnsImpl implements SingleSignOns {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SingleSignOnsImpl.class);

    private final SingleSignOnsClient innerClient;

    private final com.azure.resourcemanager.logz.LogzManager serviceManager;

    public SingleSignOnsImpl(
        SingleSignOnsClient innerClient, com.azure.resourcemanager.logz.LogzManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LogzSingleSignOnResource> list(String resourceGroupName, String monitorName) {
        PagedIterable<LogzSingleSignOnResourceInner> inner = this.serviceClient().list(resourceGroupName, monitorName);
        return Utils.mapPage(inner, inner1 -> new LogzSingleSignOnResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LogzSingleSignOnResource> list(String resourceGroupName, String monitorName, Context context) {
        PagedIterable<LogzSingleSignOnResourceInner> inner =
            this.serviceClient().list(resourceGroupName, monitorName, context);
        return Utils.mapPage(inner, inner1 -> new LogzSingleSignOnResourceImpl(inner1, this.manager()));
    }

    public LogzSingleSignOnResource get(String resourceGroupName, String monitorName, String configurationName) {
        LogzSingleSignOnResourceInner inner =
            this.serviceClient().get(resourceGroupName, monitorName, configurationName);
        if (inner != null) {
            return new LogzSingleSignOnResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LogzSingleSignOnResource> getWithResponse(
        String resourceGroupName, String monitorName, String configurationName, Context context) {
        Response<LogzSingleSignOnResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, monitorName, configurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LogzSingleSignOnResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LogzSingleSignOnResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "singleSignOnConfigurations");
        if (configurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'singleSignOnConfigurations'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, monitorName, configurationName, Context.NONE).getValue();
    }

    public Response<LogzSingleSignOnResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "singleSignOnConfigurations");
        if (configurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'singleSignOnConfigurations'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, monitorName, configurationName, context);
    }

    private SingleSignOnsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.logz.LogzManager manager() {
        return this.serviceManager;
    }

    public LogzSingleSignOnResourceImpl define(String name) {
        return new LogzSingleSignOnResourceImpl(name, this.manager());
    }
}
