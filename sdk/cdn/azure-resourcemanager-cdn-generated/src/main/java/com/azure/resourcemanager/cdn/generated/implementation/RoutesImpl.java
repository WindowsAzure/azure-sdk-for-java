// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.generated.CdnManager;
import com.azure.resourcemanager.cdn.generated.fluent.RoutesClient;
import com.azure.resourcemanager.cdn.generated.fluent.models.RouteInner;
import com.azure.resourcemanager.cdn.generated.models.Route;
import com.azure.resourcemanager.cdn.generated.models.Routes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RoutesImpl implements Routes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoutesImpl.class);

    private final RoutesClient innerClient;

    private final CdnManager serviceManager;

    public RoutesImpl(RoutesClient innerClient, CdnManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Route> listByEndpoint(String resourceGroupName, String profileName, String endpointName) {
        PagedIterable<RouteInner> inner =
            this.serviceClient().listByEndpoint(resourceGroupName, profileName, endpointName);
        return inner.mapPage(inner1 -> new RouteImpl(inner1, this.manager()));
    }

    public PagedIterable<Route> listByEndpoint(
        String resourceGroupName, String profileName, String endpointName, Context context) {
        PagedIterable<RouteInner> inner =
            this.serviceClient().listByEndpoint(resourceGroupName, profileName, endpointName, context);
        return inner.mapPage(inner1 -> new RouteImpl(inner1, this.manager()));
    }

    public Route get(String resourceGroupName, String profileName, String endpointName, String routeName) {
        RouteInner inner = this.serviceClient().get(resourceGroupName, profileName, endpointName, routeName);
        if (inner != null) {
            return new RouteImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Route> getWithResponse(
        String resourceGroupName, String profileName, String endpointName, String routeName, Context context) {
        Response<RouteInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, profileName, endpointName, routeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RouteImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String profileName, String endpointName, String routeName) {
        this.serviceClient().delete(resourceGroupName, profileName, endpointName, routeName);
    }

    public void delete(
        String resourceGroupName, String profileName, String endpointName, String routeName, Context context) {
        this.serviceClient().delete(resourceGroupName, profileName, endpointName, routeName, context);
    }

    public Route getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "afdEndpoints");
        if (endpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'afdEndpoints'.", id)));
        }
        String routeName = Utils.getValueFromIdByName(id, "routes");
        if (routeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, profileName, endpointName, routeName, Context.NONE).getValue();
    }

    public Response<Route> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "afdEndpoints");
        if (endpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'afdEndpoints'.", id)));
        }
        String routeName = Utils.getValueFromIdByName(id, "routes");
        if (routeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, profileName, endpointName, routeName, context);
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
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "afdEndpoints");
        if (endpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'afdEndpoints'.", id)));
        }
        String routeName = Utils.getValueFromIdByName(id, "routes");
        if (routeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routes'.", id)));
        }
        this.delete(resourceGroupName, profileName, endpointName, routeName, Context.NONE);
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
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "afdEndpoints");
        if (endpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'afdEndpoints'.", id)));
        }
        String routeName = Utils.getValueFromIdByName(id, "routes");
        if (routeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'routes'.", id)));
        }
        this.delete(resourceGroupName, profileName, endpointName, routeName, context);
    }

    private RoutesClient serviceClient() {
        return this.innerClient;
    }

    private CdnManager manager() {
        return this.serviceManager;
    }

    public RouteImpl define(String name) {
        return new RouteImpl(name, this.manager());
    }
}
