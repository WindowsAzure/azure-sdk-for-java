// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.attestation.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.attestation.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.attestation.models.PrivateEndpointConnection;
import com.azure.resourcemanager.attestation.models.PrivateEndpointConnections;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateEndpointConnectionsImpl implements PrivateEndpointConnections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointConnectionsImpl.class);

    private final PrivateEndpointConnectionsClient innerClient;

    private final com.azure.resourcemanager.attestation.AttestationManager serviceManager;

    public PrivateEndpointConnectionsImpl(
        PrivateEndpointConnectionsClient innerClient,
        com.azure.resourcemanager.attestation.AttestationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateEndpointConnection> list(String resourceGroupName, String providerName) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, providerName);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpointConnection> list(
        String resourceGroupName, String providerName, Context context) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, providerName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PrivateEndpointConnection get(
        String resourceGroupName, String providerName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionInner inner =
            this.serviceClient().get(resourceGroupName, providerName, privateEndpointConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnection> getWithResponse(
        String resourceGroupName, String providerName, String privateEndpointConnectionName, Context context) {
        Response<PrivateEndpointConnectionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, providerName, privateEndpointConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String providerName, String privateEndpointConnectionName) {
        this.serviceClient().delete(resourceGroupName, providerName, privateEndpointConnectionName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String providerName, String privateEndpointConnectionName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, providerName, privateEndpointConnectionName, context);
    }

    public PrivateEndpointConnection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String providerName = Utils.getValueFromIdByName(id, "attestationProviders");
        if (providerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'attestationProviders'.",
                                id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, providerName, privateEndpointConnectionName, Context.NONE)
            .getValue();
    }

    public Response<PrivateEndpointConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String providerName = Utils.getValueFromIdByName(id, "attestationProviders");
        if (providerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'attestationProviders'.",
                                id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, providerName, privateEndpointConnectionName, context);
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
        String providerName = Utils.getValueFromIdByName(id, "attestationProviders");
        if (providerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'attestationProviders'.",
                                id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        this
            .deleteWithResponse(resourceGroupName, providerName, privateEndpointConnectionName, Context.NONE)
            .getValue();
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
        String providerName = Utils.getValueFromIdByName(id, "attestationProviders");
        if (providerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'attestationProviders'.",
                                id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, providerName, privateEndpointConnectionName, context);
    }

    private PrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.attestation.AttestationManager manager() {
        return this.serviceManager;
    }

    public PrivateEndpointConnectionImpl define(String name) {
        return new PrivateEndpointConnectionImpl(name, this.manager());
    }
}
