// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.MySqlManager;
import com.azure.resourcemanager.mysql.fluent.ConfigurationsClient;
import com.azure.resourcemanager.mysql.fluent.models.ConfigurationInner;
import com.azure.resourcemanager.mysql.models.Configuration;
import com.azure.resourcemanager.mysql.models.Configurations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ConfigurationsImpl implements Configurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConfigurationsImpl.class);

    private final ConfigurationsClient innerClient;

    private final MySqlManager serviceManager;

    public ConfigurationsImpl(ConfigurationsClient innerClient, MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Configuration get(String resourceGroupName, String serverName, String configurationName) {
        ConfigurationInner inner = this.serviceClient().get(resourceGroupName, serverName, configurationName);
        if (inner != null) {
            return new ConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Configuration> getWithResponse(
        String resourceGroupName, String serverName, String configurationName, Context context) {
        Response<ConfigurationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, configurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Configuration> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ConfigurationInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return inner.mapPage(inner1 -> new ConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<Configuration> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<ConfigurationInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return inner.mapPage(inner1 -> new ConfigurationImpl(inner1, this.manager()));
    }

    public Configuration getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "configurations");
        if (configurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'configurations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, configurationName, Context.NONE).getValue();
    }

    public Response<Configuration> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String configurationName = Utils.getValueFromIdByName(id, "configurations");
        if (configurationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'configurations'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, configurationName, context);
    }

    private ConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }

    public ConfigurationImpl define(String name) {
        return new ConfigurationImpl(name, this.manager());
    }
}
