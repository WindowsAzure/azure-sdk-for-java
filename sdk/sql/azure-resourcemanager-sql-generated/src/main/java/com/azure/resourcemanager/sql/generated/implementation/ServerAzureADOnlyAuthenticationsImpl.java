// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ServerAzureADOnlyAuthenticationsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerAzureADOnlyAuthenticationInner;
import com.azure.resourcemanager.sql.generated.models.AuthenticationName;
import com.azure.resourcemanager.sql.generated.models.ServerAzureADOnlyAuthentication;
import com.azure.resourcemanager.sql.generated.models.ServerAzureADOnlyAuthentications;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServerAzureADOnlyAuthenticationsImpl implements ServerAzureADOnlyAuthentications {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerAzureADOnlyAuthenticationsImpl.class);

    private final ServerAzureADOnlyAuthenticationsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ServerAzureADOnlyAuthenticationsImpl(
        ServerAzureADOnlyAuthenticationsClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ServerAzureADOnlyAuthentication get(
        String resourceGroupName, String serverName, AuthenticationName authenticationName) {
        ServerAzureADOnlyAuthenticationInner inner =
            this.serviceClient().get(resourceGroupName, serverName, authenticationName);
        if (inner != null) {
            return new ServerAzureADOnlyAuthenticationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServerAzureADOnlyAuthentication> getWithResponse(
        String resourceGroupName, String serverName, AuthenticationName authenticationName, Context context) {
        Response<ServerAzureADOnlyAuthenticationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, authenticationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerAzureADOnlyAuthenticationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serverName, AuthenticationName authenticationName) {
        this.serviceClient().delete(resourceGroupName, serverName, authenticationName);
    }

    public void delete(
        String resourceGroupName, String serverName, AuthenticationName authenticationName, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, authenticationName, context);
    }

    public PagedIterable<ServerAzureADOnlyAuthentication> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ServerAzureADOnlyAuthenticationInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new ServerAzureADOnlyAuthenticationImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerAzureADOnlyAuthentication> listByServer(
        String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServerAzureADOnlyAuthenticationInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new ServerAzureADOnlyAuthenticationImpl(inner1, this.manager()));
    }

    public ServerAzureADOnlyAuthentication getById(String id) {
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
        AuthenticationName authenticationName =
            AuthenticationName.fromString(Utils.getValueFromIdByName(id, "azureADOnlyAuthentications"));
        if (authenticationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureADOnlyAuthentications'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, authenticationName, Context.NONE).getValue();
    }

    public Response<ServerAzureADOnlyAuthentication> getByIdWithResponse(String id, Context context) {
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
        AuthenticationName authenticationName =
            AuthenticationName.fromString(Utils.getValueFromIdByName(id, "azureADOnlyAuthentications"));
        if (authenticationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureADOnlyAuthentications'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, authenticationName, context);
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
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        AuthenticationName authenticationName =
            AuthenticationName.fromString(Utils.getValueFromIdByName(id, "azureADOnlyAuthentications"));
        if (authenticationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureADOnlyAuthentications'.",
                                id)));
        }
        this.delete(resourceGroupName, serverName, authenticationName, Context.NONE);
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
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        AuthenticationName authenticationName =
            AuthenticationName.fromString(Utils.getValueFromIdByName(id, "azureADOnlyAuthentications"));
        if (authenticationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureADOnlyAuthentications'.",
                                id)));
        }
        this.delete(resourceGroupName, serverName, authenticationName, context);
    }

    private ServerAzureADOnlyAuthenticationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public ServerAzureADOnlyAuthenticationImpl define(AuthenticationName name) {
        return new ServerAzureADOnlyAuthenticationImpl(name, this.manager());
    }
}
