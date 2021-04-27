// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicefabric.fluent.ServicesClient;
import com.azure.resourcemanager.servicefabric.fluent.models.ServiceResourceInner;
import com.azure.resourcemanager.servicefabric.fluent.models.ServiceResourceListInner;
import com.azure.resourcemanager.servicefabric.models.ServiceResource;
import com.azure.resourcemanager.servicefabric.models.ServiceResourceList;
import com.azure.resourcemanager.servicefabric.models.Services;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServicesImpl implements Services {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServicesImpl.class);

    private final ServicesClient innerClient;

    private final com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager;

    public ServicesImpl(
        ServicesClient innerClient, com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ServiceResource get(
        String resourceGroupName, String clusterName, String applicationName, String serviceName) {
        ServiceResourceInner inner =
            this.serviceClient().get(resourceGroupName, clusterName, applicationName, serviceName);
        if (inner != null) {
            return new ServiceResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServiceResource> getWithResponse(
        String resourceGroupName, String clusterName, String applicationName, String serviceName, Context context) {
        Response<ServiceResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, clusterName, applicationName, serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServiceResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String applicationName, String serviceName) {
        this.serviceClient().delete(resourceGroupName, clusterName, applicationName, serviceName);
    }

    public void delete(
        String resourceGroupName, String clusterName, String applicationName, String serviceName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, applicationName, serviceName, context);
    }

    public ServiceResourceList list(String resourceGroupName, String clusterName, String applicationName) {
        ServiceResourceListInner inner = this.serviceClient().list(resourceGroupName, clusterName, applicationName);
        if (inner != null) {
            return new ServiceResourceListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServiceResourceList> listWithResponse(
        String resourceGroupName, String clusterName, String applicationName, Context context) {
        Response<ServiceResourceListInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, clusterName, applicationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServiceResourceListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServiceResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationName = Utils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, clusterName, applicationName, serviceName, Context.NONE)
            .getValue();
    }

    public Response<ServiceResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationName = Utils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, applicationName, serviceName, context);
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
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationName = Utils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        this.delete(resourceGroupName, clusterName, applicationName, serviceName, Context.NONE);
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
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationName = Utils.getValueFromIdByName(id, "applications");
        if (applicationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'applications'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        this.delete(resourceGroupName, clusterName, applicationName, serviceName, context);
    }

    private ServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicefabric.ServiceFabricManager manager() {
        return this.serviceManager;
    }

    public ServiceResourceImpl define(String name) {
        return new ServiceResourceImpl(name, this.manager());
    }
}
