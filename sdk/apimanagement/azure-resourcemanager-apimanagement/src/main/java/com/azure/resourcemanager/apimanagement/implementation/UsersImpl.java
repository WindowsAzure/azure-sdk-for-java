// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.UsersClient;
import com.azure.resourcemanager.apimanagement.fluent.models.GenerateSsoUrlResultInner;
import com.azure.resourcemanager.apimanagement.fluent.models.UserContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.UserTokenResultInner;
import com.azure.resourcemanager.apimanagement.models.AppType;
import com.azure.resourcemanager.apimanagement.models.GenerateSsoUrlResult;
import com.azure.resourcemanager.apimanagement.models.UserContract;
import com.azure.resourcemanager.apimanagement.models.UserTokenParameters;
import com.azure.resourcemanager.apimanagement.models.UserTokenResult;
import com.azure.resourcemanager.apimanagement.models.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class UsersImpl implements Users {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UsersImpl.class);

    private final UsersClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public UsersImpl(
        UsersClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<UserContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<UserContractInner> inner = this.serviceClient().listByService(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new UserContractImpl(inner1, this.manager()));
    }

    public PagedIterable<UserContract> listByService(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        Boolean expandGroups,
        Context context) {
        PagedIterable<UserContractInner> inner =
            this
                .serviceClient()
                .listByService(resourceGroupName, serviceName, filter, top, skip, expandGroups, context);
        return Utils.mapPage(inner, inner1 -> new UserContractImpl(inner1, this.manager()));
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String userId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, userId);
    }

    public Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String userId, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, userId, context);
    }

    public UserContract get(String resourceGroupName, String serviceName, String userId) {
        UserContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, userId);
        if (inner != null) {
            return new UserContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<UserContract> getWithResponse(
        String resourceGroupName, String serviceName, String userId, Context context) {
        Response<UserContractInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, userId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new UserContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, String userId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, userId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceName,
        String userId,
        String ifMatch,
        Boolean deleteSubscriptions,
        Boolean notify,
        AppType appType,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(
                resourceGroupName, serviceName, userId, ifMatch, deleteSubscriptions, notify, appType, context);
    }

    public GenerateSsoUrlResult generateSsoUrl(String resourceGroupName, String serviceName, String userId) {
        GenerateSsoUrlResultInner inner = this.serviceClient().generateSsoUrl(resourceGroupName, serviceName, userId);
        if (inner != null) {
            return new GenerateSsoUrlResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GenerateSsoUrlResult> generateSsoUrlWithResponse(
        String resourceGroupName, String serviceName, String userId, Context context) {
        Response<GenerateSsoUrlResultInner> inner =
            this.serviceClient().generateSsoUrlWithResponse(resourceGroupName, serviceName, userId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GenerateSsoUrlResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public UserTokenResult getSharedAccessToken(
        String resourceGroupName, String serviceName, String userId, UserTokenParameters parameters) {
        UserTokenResultInner inner =
            this.serviceClient().getSharedAccessToken(resourceGroupName, serviceName, userId, parameters);
        if (inner != null) {
            return new UserTokenResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<UserTokenResult> getSharedAccessTokenWithResponse(
        String resourceGroupName, String serviceName, String userId, UserTokenParameters parameters, Context context) {
        Response<UserTokenResultInner> inner =
            this
                .serviceClient()
                .getSharedAccessTokenWithResponse(resourceGroupName, serviceName, userId, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new UserTokenResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public UserContract getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String userId = Utils.getValueFromIdByName(id, "users");
        if (userId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, userId, Context.NONE).getValue();
    }

    public Response<UserContract> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String userId = Utils.getValueFromIdByName(id, "users");
        if (userId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, userId, context);
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
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String userId = Utils.getValueFromIdByName(id, "users");
        if (userId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String localIfMatch = null;
        Boolean localDeleteSubscriptions = null;
        Boolean localNotify = null;
        AppType localAppType = null;
        this
            .deleteWithResponse(
                resourceGroupName,
                serviceName,
                userId,
                localIfMatch,
                localDeleteSubscriptions,
                localNotify,
                localAppType,
                Context.NONE)
            .getValue();
    }

    public Response<Void> deleteByIdWithResponse(
        String id, String ifMatch, Boolean deleteSubscriptions, Boolean notify, AppType appType, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String userId = Utils.getValueFromIdByName(id, "users");
        if (userId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        return this
            .deleteWithResponse(
                resourceGroupName, serviceName, userId, ifMatch, deleteSubscriptions, notify, appType, context);
    }

    private UsersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public UserContractImpl define(String name) {
        return new UserContractImpl(name, this.manager());
    }
}
