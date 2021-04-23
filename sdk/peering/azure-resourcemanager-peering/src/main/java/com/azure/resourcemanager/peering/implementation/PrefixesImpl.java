// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.peering.fluent.PrefixesClient;
import com.azure.resourcemanager.peering.fluent.models.PeeringServicePrefixInner;
import com.azure.resourcemanager.peering.models.PeeringServicePrefix;
import com.azure.resourcemanager.peering.models.Prefixes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrefixesImpl implements Prefixes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrefixesImpl.class);

    private final PrefixesClient innerClient;

    private final com.azure.resourcemanager.peering.PeeringManager serviceManager;

    public PrefixesImpl(PrefixesClient innerClient, com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PeeringServicePrefix get(String resourceGroupName, String peeringServiceName, String prefixName) {
        PeeringServicePrefixInner inner = this.serviceClient().get(resourceGroupName, peeringServiceName, prefixName);
        if (inner != null) {
            return new PeeringServicePrefixImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PeeringServicePrefix> getWithResponse(
        String resourceGroupName, String peeringServiceName, String prefixName, String expand, Context context) {
        Response<PeeringServicePrefixInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, peeringServiceName, prefixName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PeeringServicePrefixImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String peeringServiceName, String prefixName) {
        this.serviceClient().delete(resourceGroupName, peeringServiceName, prefixName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String peeringServiceName, String prefixName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, peeringServiceName, prefixName, context);
    }

    public PagedIterable<PeeringServicePrefix> listByPeeringService(
        String resourceGroupName, String peeringServiceName) {
        PagedIterable<PeeringServicePrefixInner> inner =
            this.serviceClient().listByPeeringService(resourceGroupName, peeringServiceName);
        return Utils.mapPage(inner, inner1 -> new PeeringServicePrefixImpl(inner1, this.manager()));
    }

    public PagedIterable<PeeringServicePrefix> listByPeeringService(
        String resourceGroupName, String peeringServiceName, String expand, Context context) {
        PagedIterable<PeeringServicePrefixInner> inner =
            this.serviceClient().listByPeeringService(resourceGroupName, peeringServiceName, expand, context);
        return Utils.mapPage(inner, inner1 -> new PeeringServicePrefixImpl(inner1, this.manager()));
    }

    public PeeringServicePrefix getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String peeringServiceName = Utils.getValueFromIdByName(id, "peeringServices");
        if (peeringServiceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'peeringServices'.", id)));
        }
        String prefixName = Utils.getValueFromIdByName(id, "prefixes");
        if (prefixName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'prefixes'.", id)));
        }
        String localExpand = null;
        return this
            .getWithResponse(resourceGroupName, peeringServiceName, prefixName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<PeeringServicePrefix> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String peeringServiceName = Utils.getValueFromIdByName(id, "peeringServices");
        if (peeringServiceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'peeringServices'.", id)));
        }
        String prefixName = Utils.getValueFromIdByName(id, "prefixes");
        if (prefixName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'prefixes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, peeringServiceName, prefixName, expand, context);
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
        String peeringServiceName = Utils.getValueFromIdByName(id, "peeringServices");
        if (peeringServiceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'peeringServices'.", id)));
        }
        String prefixName = Utils.getValueFromIdByName(id, "prefixes");
        if (prefixName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'prefixes'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, peeringServiceName, prefixName, Context.NONE).getValue();
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
        String peeringServiceName = Utils.getValueFromIdByName(id, "peeringServices");
        if (peeringServiceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'peeringServices'.", id)));
        }
        String prefixName = Utils.getValueFromIdByName(id, "prefixes");
        if (prefixName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'prefixes'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, peeringServiceName, prefixName, context);
    }

    private PrefixesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.peering.PeeringManager manager() {
        return this.serviceManager;
    }

    public PeeringServicePrefixImpl define(String name) {
        return new PeeringServicePrefixImpl(name, this.manager());
    }
}
