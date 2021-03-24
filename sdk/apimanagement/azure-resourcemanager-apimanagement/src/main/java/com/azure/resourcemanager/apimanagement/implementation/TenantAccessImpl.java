// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.TenantAccessClient;
import com.azure.resourcemanager.apimanagement.fluent.models.AccessInformationContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.AccessInformationSecretsContractInner;
import com.azure.resourcemanager.apimanagement.models.AccessIdName;
import com.azure.resourcemanager.apimanagement.models.AccessInformationContract;
import com.azure.resourcemanager.apimanagement.models.AccessInformationSecretsContract;
import com.azure.resourcemanager.apimanagement.models.TenantAccess;
import com.azure.resourcemanager.apimanagement.models.TenantAccessGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.TenantAccessGetResponse;
import com.azure.resourcemanager.apimanagement.models.TenantAccessListSecretsResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TenantAccessImpl implements TenantAccess {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TenantAccessImpl.class);

    private final TenantAccessClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public TenantAccessImpl(
        TenantAccessClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AccessInformationContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<AccessInformationContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new AccessInformationContractImpl(inner1, this.manager()));
    }

    public PagedIterable<AccessInformationContract> listByService(
        String resourceGroupName, String serviceName, String filter, Context context) {
        PagedIterable<AccessInformationContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, filter, context);
        return Utils.mapPage(inner, inner1 -> new AccessInformationContractImpl(inner1, this.manager()));
    }

    public void getEntityTag(String resourceGroupName, String serviceName, AccessIdName accessName) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, accessName);
    }

    public TenantAccessGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, AccessIdName accessName, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, accessName, context);
    }

    public AccessInformationContract get(String resourceGroupName, String serviceName, AccessIdName accessName) {
        AccessInformationContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, accessName);
        if (inner != null) {
            return new AccessInformationContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessInformationContract> getWithResponse(
        String resourceGroupName, String serviceName, AccessIdName accessName, Context context) {
        TenantAccessGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, accessName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccessInformationContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void regeneratePrimaryKey(String resourceGroupName, String serviceName, AccessIdName accessName) {
        this.serviceClient().regeneratePrimaryKey(resourceGroupName, serviceName, accessName);
    }

    public Response<Void> regeneratePrimaryKeyWithResponse(
        String resourceGroupName, String serviceName, AccessIdName accessName, Context context) {
        return this
            .serviceClient()
            .regeneratePrimaryKeyWithResponse(resourceGroupName, serviceName, accessName, context);
    }

    public void regenerateSecondaryKey(String resourceGroupName, String serviceName, AccessIdName accessName) {
        this.serviceClient().regenerateSecondaryKey(resourceGroupName, serviceName, accessName);
    }

    public Response<Void> regenerateSecondaryKeyWithResponse(
        String resourceGroupName, String serviceName, AccessIdName accessName, Context context) {
        return this
            .serviceClient()
            .regenerateSecondaryKeyWithResponse(resourceGroupName, serviceName, accessName, context);
    }

    public AccessInformationSecretsContract listSecrets(
        String resourceGroupName, String serviceName, AccessIdName accessName) {
        AccessInformationSecretsContractInner inner =
            this.serviceClient().listSecrets(resourceGroupName, serviceName, accessName);
        if (inner != null) {
            return new AccessInformationSecretsContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessInformationSecretsContract> listSecretsWithResponse(
        String resourceGroupName, String serviceName, AccessIdName accessName, Context context) {
        TenantAccessListSecretsResponse inner =
            this.serviceClient().listSecretsWithResponse(resourceGroupName, serviceName, accessName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccessInformationSecretsContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessInformationContract getById(String id) {
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
        AccessIdName accessName = AccessIdName.fromString(Utils.getValueFromIdByName(id, "tenant"));
        if (accessName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tenant'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, accessName, Context.NONE).getValue();
    }

    public Response<AccessInformationContract> getByIdWithResponse(String id, Context context) {
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
        AccessIdName accessName = AccessIdName.fromString(Utils.getValueFromIdByName(id, "tenant"));
        if (accessName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tenant'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, accessName, context);
    }

    private TenantAccessClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public AccessInformationContractImpl define(AccessIdName name) {
        return new AccessInformationContractImpl(name, this.manager());
    }
}
